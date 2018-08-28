package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int TOP_BUTTON = 0, BOTTOM_BUTTON = 1;
    // TODO: Steps 4 & 8 - Declare member variables here:
    public TextView mStoryTextView;
    public Button mButtonTop, mButtonBottom;
    public int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 1:
                        mStoryIndex = 3;
                        mStoryTextView.setText(R.string.T3_Story);
                        mButtonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);
                        break;
                    case 2:
                        mStoryIndex = 3;
                        mStoryTextView.setText(R.string.T3_Story);
                        mButtonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);
                        break;
                    case 3:
                        mStoryIndex = 6;
                        mStoryTextView.setText(R.string.T6_End);
                        mButtonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                        break;

                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 1:
                        mStoryIndex = 2;
                        mStoryTextView.setText(R.string.T2_Story);
                        mButtonTop.setText(R.string.T2_Ans1);
                        mButtonBottom.setText(R.string.T2_Ans2);
                        break;
                    case 2:
                        mStoryIndex = 4;
                        mStoryTextView.setText(R.string.T4_End);
                        mButtonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                        break;
                    case 3:
                        mStoryIndex = 5;
                        mStoryTextView.setText(R.string.T5_End);
                        mButtonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                        break;
                }
            }



        });


    }

}
