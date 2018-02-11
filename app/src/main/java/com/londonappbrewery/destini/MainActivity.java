package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button mRedButton;
    Button mBlueButton;
    int chapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = (TextView) findViewById(R.id.storyTextView);
        mRedButton = (Button) findViewById(R.id.buttonTop);
        mBlueButton = (Button) findViewById(R.id.buttonBottom);

        beginFromStart();



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chapter == 3) {
                    loadT6Story();
                }
                else {
                    loadT3Story();
                }
            }

        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chapter == 2) {
                    loadT4Story();
                }
                else if (chapter == 1) {
                    loadT2Story();
                }
                else {
                    loadT5Story();
                }
            }
        });

    }

    public void loadT3Story() {
        mTextView.setText(R.string.T3_Story);
        mRedButton.setText(R.string.T3_Ans1);
        mBlueButton.setText(R.string.T3_Ans2);
        chapter = 3;
    }

    public void loadT2Story() {
        mTextView.setText(R.string.T2_Story);
        mRedButton.setText(R.string.T2_Ans1);
        mBlueButton.setText(R.string.T2_Ans2);
        chapter = 2;
    }

    public void loadT4Story() {
        mTextView.setText(R.string.T4_End);
        mRedButton.setVisibility(View.INVISIBLE);
        mBlueButton.setVisibility(View.INVISIBLE);
        mRedButton.setText("");
        mBlueButton.setText("");
        chapter = 4;
    }

    public void loadT5Story() {
        mTextView.setText(R.string.T5_End);
        mRedButton.setVisibility(View.INVISIBLE);
        mBlueButton.setVisibility(View.INVISIBLE);
        mRedButton.setText("");
        mBlueButton.setText("");
        chapter = 5;
    }

    public void loadT6Story() {
        mTextView.setText(R.string.T6_End);
        mRedButton.setVisibility(View.INVISIBLE);
        mBlueButton.setVisibility(View.INVISIBLE);
        mRedButton.setText("");
        mBlueButton.setText("");
        chapter = 6;
    }


    public void beginFromStart() {
        mTextView.setText(R.string.T1_Story);
        mRedButton.setVisibility(View.VISIBLE);
        mBlueButton.setVisibility(View.VISIBLE);
        mRedButton.setText(R.string.T1_Ans1);
        mBlueButton.setText(R.string.T1_Ans2);
        chapter = 1;
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        beginFromStart();
    }
}
