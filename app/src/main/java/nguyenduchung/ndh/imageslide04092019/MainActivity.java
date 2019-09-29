package nguyenduchung.ndh.imageslide04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView mimg;
    Button mbtnSlide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        //countdowtimer
        CountDownTimer countDownTimer=new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {

            }
        };
        countDownTimer.start();
    }

    private void initview() {
        mbtnSlide=findViewById(R.id.buttonShow);
        mimg=findViewById(R.id.imageview);
    }
}
