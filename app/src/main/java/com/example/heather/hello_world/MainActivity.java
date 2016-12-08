package com.example.heather.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean scared = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleScared(View view) {
        TextView monsterText = (TextView) findViewById(R.id.monsterText);
        ImageButton monsterButton = (ImageButton) findViewById(R.id.monsterButton);
        if (scared) {
            monsterText.setText("zzz..");
            monsterText.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 22);
            monsterButton.setImageResource(R.drawable.sleeping);
        } else {
            monsterText.setText("ahh!");
            monsterText.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 33);
            monsterButton.setImageResource(R.drawable.scared);
        }
        scared = !scared;
    }


}
