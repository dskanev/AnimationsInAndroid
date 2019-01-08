package denislav.kanev.animationsinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private TextView txtAndroid;
    private boolean isHelloWorldShowing = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);
        txtAndroid = findViewById(R.id.txtAndroid);


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
                txtAndroid.animate().translationXBy(3000).setDuration(2000);
                txtAndroid.animate().rotation(7200).setDuration(2000);
            }
        });

    }
}
