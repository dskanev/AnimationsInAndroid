package denislav.kanev.animationsinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private TextView txtAndroid;
    private boolean isHelloWorldShowing = true;
    private Button btnAnimate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);
        txtAndroid = findViewById(R.id.txtAndroid);
        btnAnimate = findViewById(R.id.btnAnimate);

        txtHelloWorld.setX(2000);
        txtHiWorld.setX(-2000);
        txtAndroid.setY(-2000);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Log.i("MYTAG", "Hello World!");
                //txtHelloWorld.animate().alpha(0.5f).setDuration(3000);

                if(isHelloWorldShowing){
                    txtHelloWorld.animate().alpha(0).setDuration(3000);
                    isHelloWorldShowing = false;
                    txtHiWorld.animate().alpha(1).setDuration(3000);
                } else {
                    txtHiWorld.animate().alpha(0).setDuration(3000);
                    txtHelloWorld.animate().alpha(1).setDuration(3000);
                    isHelloWorldShowing = true;
                }



            }
        });

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txtAndroid.animate().translationXBy(3000).setDuration(2000);
                //txtAndroid.animate().rotation(7200).setDuration(2000);
                //txtAndroid.animate().rotationBy(90).setDuration(4000);
                txtAndroid.animate().rotationX(400).setDuration(3000);
            }
        });

        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtHelloWorld.animate().translationXBy(-2000).rotation(2000).setDuration(1000);
                txtHiWorld.animate().translationXBy(2000).rotation(-2000).setDuration(1500);
                txtAndroid.animate().translationYBy(3000).rotationBy(90).setDuration(2000);
            }
        });

    }
}
