package com.example.ajumal.sfp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int rand1;
    private int rand2;
    private int points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        points = 0;
        genrateRandomNum();

    }

    public void rightButton(View view) {
//        todo
        if (rand1 >= rand2) {
            Toast.makeText(this,"Great Job..!",Toast.LENGTH_SHORT).show();
            points ++;
        } else  {
            points --;
            Toast.makeText(this,"Opps..!",Toast.LENGTH_SHORT).show();
        }
        TextView text = (TextView)findViewById(R.id.points_field);
        text.setText("Points : " + points);
        genrateRandomNum();
    }

    public  void  leftButton(View view) {

        if (rand2 >= rand1) {
            points ++;
            Toast.makeText(this,"Great Job..!",Toast.LENGTH_SHORT).show();
        } else  {
            points --;
            Toast.makeText(this,"Opps..!",Toast.LENGTH_SHORT).show();
        }
        TextView text = (TextView)findViewById(R.id.points_field);
        text.setText("Points : " + points);
        genrateRandomNum();
    }

    private void genrateRandomNum() {
        Random randy = new Random();
        do {
            rand1 = randy.nextInt(10);
            rand2 = randy.nextInt(10);
        } while (rand1 == rand2);


        Button rBtn = (Button)findViewById(R.id.left_button);
        rBtn.setText(Integer.toString(rand2));
        Button lBtn = (Button)findViewById(R.id.right_button);
        lBtn.setText(Integer.toString(rand1));
    }
}
