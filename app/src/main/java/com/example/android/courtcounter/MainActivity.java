package com.example.android.courtcounter;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int Ascore=0;
    public void Aplus3(View view) {
    Ascore=Ascore+3;
    displayScore(Ascore);
    }
    public void Aplus2(View view) {
        Ascore=Ascore+2;
        displayScore(Ascore);
    }
    public void Aplus1(View view) {
        Ascore=Ascore+1;
        displayScore(Ascore);
    }
    private void displayScore(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.Ascore_text_view);
        quantityTextView.setText("" + number);
    }
    int Bscore=0;
    public void Bplus3(View view) {
        Bscore=Bscore+3;
        displayBScore(Bscore);
    }
    public void Bplus2(View view) {
        Bscore=Bscore+2;
        displayBScore(Bscore);
    }
    public void Bplus1(View view) {
        Bscore=Bscore+1;
        displayBScore(Bscore);
    }
    public void resetScore(View view){
        Ascore=Bscore=0;
        displayScore(Ascore);
        displayBScore(Bscore);
    }
    private void displayBScore(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.Bscore_text_view);
        quantityTextView.setText("" + number);
    }
}
