package com.example.michael.negaoderosasimulator;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.app.ShareCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class MainActivity extends Activity {

    private SoundManager mSoundManager;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;
    private Button bt10;
    private Button bt11;
    private Button bt12;
    private Button bt13;
    private Button bt14;
    private Button bt15;
    private Button bt16;
    private Button bt17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        bt10 = (Button) findViewById(R.id.bt10);
        bt11 = (Button) findViewById(R.id.bt11);
        bt12 = (Button) findViewById(R.id.bt12);
        bt13 = (Button) findViewById(R.id.bt13);
        bt14 = (Button) findViewById(R.id.bt14);
        bt15 = (Button) findViewById(R.id.bt15);
        bt16 = (Button) findViewById(R.id.bt16);
        bt17 = (Button) findViewById(R.id.bt17);

        bt1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.boatardesi);
                return true;
            }
        });

        bt2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.sexoocasional);
                return true;
            }
        });

        bt3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.que);
                return true;
            }
        });

        bt4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.atorpornografico);
                return true;
            }
        });

        bt5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.mumicate);
                return true;
            }
        });

        bt6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.filmepornografico);
                return true;
            }
        });

        bt7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.revistavcleu);
                return true;
            }
        });

        bt8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.comprarbolinho);
                return true;
            }
        });

        bt9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.coisaqsefaznooutro);
                return true;
            }
        });

        bt10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.danumdaassim);
                return true;
            }
        });

        bt11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.uhauhuha);
                return true;
            }
        });

        bt12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.comosevcjafalou);
                return true;
            }
        });

        bt13.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.eusexoeusexo);
                return true;
            }
        });

        bt14.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.chegueihoje);
                return true;
            }
        });

        bt15.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.eutenhominhamulher);
                return true;
            }
        });

        bt16.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.naovaipagarbolingo);
                return true;
            }
        });

        bt17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shareAudio(R.raw.tameseguindo);
                return true;
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        int maxSimultaneousStreams = 3;
        mSoundManager = new SoundManager(this, maxSimultaneousStreams);
        mSoundManager.start();
        mSoundManager.load(R.raw.boatardesi);
        mSoundManager.load(R.raw.sexoocasional);
        mSoundManager.load(R.raw.que);
        mSoundManager.load(R.raw.atorpornografico);
        mSoundManager.load(R.raw.mumicate);
        mSoundManager.load(R.raw.filmepornografico);
        mSoundManager.load(R.raw.revistavcleu);
        mSoundManager.load(R.raw.comprarbolinho);
        mSoundManager.load(R.raw.coisaqsefaznooutro);
        mSoundManager.load(R.raw.danumdaassim);
        mSoundManager.load(R.raw.uhauhuha);
        mSoundManager.load(R.raw.comosevcjafalou);
        mSoundManager.load(R.raw.eusexoeusexo);
        mSoundManager.load(R.raw.chegueihoje);
        mSoundManager.load(R.raw.eutenhominhamulher);
        mSoundManager.load(R.raw.naovaipagarbolingo);
        mSoundManager.load(R.raw.tameseguindo);
    }

    public void boatardesi(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.boatardesi);
        }
    }

    public void sexoocasional(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.sexoocasional);
        }
    }

    public void que(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.que);
        }
    }

    public void atorpornografico(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.atorpornografico);
        }
    }

    public void mumicate(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.mumicate);
        }
    }

    public void filmepornografico(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.filmepornografico);
        }
    }

    public void revistavcleu(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.revistavcleu);
        }
    }

    public void comprarbolinho(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.comprarbolinho);
        }
    }

    public void coisaqsefaznooutro(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.coisaqsefaznooutro);
        }
    }

    public void danumdaassim(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.danumdaassim);
        }
    }

    public void uhauhuha(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.uhauhuha);
        }
    }

    public void comosevcjafalou(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.comosevcjafalou);
        }
    }

    public void eusexoeusexo(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.eusexoeusexo);
        }
    }

    public void chegueihoje(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.chegueihoje);
        }
    }

    public void eutenhominhamulher(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.eutenhominhamulher);
        }
    }

    public void naovaipagarbolingo(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.naovaipagarbolingo);
        }
    }

    public void tameseguindo(View view) {
        if (mSoundManager != null) {
            mSoundManager.play(R.raw.tameseguindo);
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
