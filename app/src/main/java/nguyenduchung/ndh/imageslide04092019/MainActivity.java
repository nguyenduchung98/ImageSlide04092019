package nguyenduchung.ndh.imageslide04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView mimg;
    Button mbtnSlide;
    int[] marrayannimal={R.drawable.iccat,R.drawable.icmonster,R.drawable.icontrue};
    int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        event();


        //countdowtimer

    }
    private void event(){
        mbtnSlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setVisibility(View.GONE);
                final CountDownTimer countDownTimer=new CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {
                        if(index == marrayannimal.length){
                            index=0;
                        }
                        mimg.setImageResource(marrayannimal[index++]);

                    }

                    @Override
                    public void onFinish() {
                        this.start();
                    }
                };
                countDownTimer.start();
            }
        });
    }

    private void initview() {
        mbtnSlide=findViewById(R.id.buttonShow);
        mimg=findViewById(R.id.imageview);
    }
}
