package nassekine.spartak.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv1, tv2, tv3, tv4, tvNumero;

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv1 = (TextView) findViewById(R.id.tv1);

        tv2 = (TextView) findViewById(R.id.tv2);

        tv3 = (TextView) findViewById(R.id.tv3);

        tv4 = (TextView) findViewById(R.id.tv4);

        tvNumero = (TextView) findViewById(R.id.tvNumero);


        tv1.setOnClickListener(this);

        tv2.setOnClickListener(this);

        tv3.setOnClickListener(this);

        tv4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        if (R.id.tv1 == v.getId()) {

            if (mp != null) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                mp.release();
            }

            tvNumero.setText("1");

            mp = MediaPlayer.create(this, R.raw.uno);
            mp.start();
        } else if (R.id.tv2 == v.getId()) {

            if (mp != null) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                mp.release();
            }
            tvNumero.setText("2");
            mp = MediaPlayer.create(this, R.raw.dos);
            mp.start();
        } else if (R.id.tv3 == v.getId()) {

            if (mp != null) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                mp.release();
            }
            tvNumero.setText("3");
            mp = MediaPlayer.create(this, R.raw.tres);
            mp.start();
        } else if (R.id.tv4 == v.getId()) {

            if (mp != null) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                mp.release();
            }
            tvNumero.setText("4");
            mp = MediaPlayer.create(this, R.raw.cuatro);
            mp.start();
        }


    }
}