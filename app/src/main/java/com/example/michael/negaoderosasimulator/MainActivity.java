package com.example.michael.negaoderosasimulator;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.app.ShareCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class MainActivity extends Activity {

    private SoundManager mSoundManager;
    TableLayout tableLayout;

    public void buttonTapped(View view) {

        int id = view.getId();
        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "br.com.jordan.negaorosasimulator");

        mSoundManager.play(resourceId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout = (TableLayout) findViewById(R.id.tablelayout);

        View.OnLongClickListener listener = new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                int id = v.getId();
                String ourId = "";
                ourId = v.getResources().getResourceEntryName(id);

                int resourceId = getResources().getIdentifier(ourId, "raw", "br.com.jordan.negaorosasimulator");

                shareAudio(resourceId);
                return true;
            }
        };

        for(int i=0; i < tableLayout.getChildCount(); i++){
            View v = tableLayout.getChildAt(i);

            if(v instanceof TableRow){
                TableRow row = (TableRow) v;

                for(int j=0; j < row.getChildCount(); j++) {

                    if(row.getChildAt(j) instanceof Button) {
                        Button button = (Button) row.getChildAt(j);
                        Log.i("Teste", button.getResources().getResourceEntryName(button.getId()) + " ");
                        button.setOnLongClickListener(listener);
                    }
                }
            }
        }

    }

    @Override
    protected void onResume() {
        super.onResume();

        int maxSimultaneousStreams = 3;
        mSoundManager = new SoundManager(this, maxSimultaneousStreams);
        mSoundManager.start();

        for(int i=0; i < tableLayout.getChildCount(); i++) {
            View v = tableLayout.getChildAt(i);

            if(v instanceof TableRow) {
                TableRow row = (TableRow) v;

                for (int j = 0; j < row.getChildCount(); j++) {

                    if (row.getChildAt(j) instanceof Button) {
                        Button button = (Button) row.getChildAt(j);
                        int id = button.getId();
                        String ourId = "";
                        ourId = button.getResources().getResourceEntryName(id);

                        int resourceId = getResources().getIdentifier(ourId, "raw", "br.com.jordan.negaorosasimulator");
                        mSoundManager.load(resourceId);
                    }
                }
            }
        }

    }

    @Override
    protected void onPause() {
        super.onPause();

        if (mSoundManager != null) {
            mSoundManager.cancel();
            mSoundManager = null;
        }
    }

    private void shareAudio(int audio){
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        try {
            inputStream = getResources().openRawResource(audio);
            fileOutputStream = new FileOutputStream(
                    new File(Environment.getExternalStorageDirectory(), "sound.mp3"));

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, length);
            }

            inputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_STREAM,
                Uri.parse("file://" + Environment.getExternalStorageDirectory() + "/sound.mp3" ));
        intent.setType("audio/*");
        startActivity(Intent.createChooser(intent, "Share sound"));
    }
}
