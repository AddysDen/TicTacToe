package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageView var11ImageView, var12ImageView, var13ImageView, var21ImageView, var22ImageView, var23ImageView,
            var31ImageView, var32ImageView, var33ImageView;
    private ImageView varRed11ImageView, varRed12ImageView, varRed13ImageView, varRed21ImageView,
            varRed22ImageView, varRed23ImageView, varRed31ImageView, varRed32ImageView, varRed33ImageView;
    private ImageView varGreen11ImageView, varGreen12ImageView, varGreen13ImageView, varGreen21ImageView,
            varGreen22ImageView, varGreen23ImageView, varGreen31ImageView, varGreen32ImageView, varGreen33ImageView;
    private Button varPlayAgainButton;
    private TextView varWinLooseTextView;
    private boolean varTapChance=true;
    private List<Integer> RIds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RIds = new ArrayList<Integer>();

        varWinLooseTextView = (TextView) findViewById(R.id.textView);
        varPlayAgainButton = (Button) findViewById(R.id.button);

        var11ImageView = (ImageView) findViewById(R.id.imageView11);
        var12ImageView = (ImageView) findViewById(R.id.imageView12);
        var13ImageView = (ImageView) findViewById(R.id.imageView13);
        var21ImageView = (ImageView) findViewById(R.id.imageView21);
        var22ImageView = (ImageView) findViewById(R.id.imageView22);
        var23ImageView = (ImageView) findViewById(R.id.imageView23);
        var31ImageView = (ImageView) findViewById(R.id.imageView31);
        var32ImageView = (ImageView) findViewById(R.id.imageView32);
        var33ImageView = (ImageView) findViewById(R.id.imageView33);

        varRed11ImageView = (ImageView) findViewById(R.id.redImageView11);
        varRed12ImageView = (ImageView) findViewById(R.id.redImageView12);
        varRed13ImageView = (ImageView) findViewById(R.id.redImageView13);
        varRed21ImageView = (ImageView) findViewById(R.id.redImageView21);
        varRed22ImageView = (ImageView) findViewById(R.id.redImageView22);
        varRed23ImageView = (ImageView) findViewById(R.id.redImageView23);
        varRed31ImageView = (ImageView) findViewById(R.id.redImageView31);
        varRed32ImageView = (ImageView) findViewById(R.id.redImageView32);
        varRed33ImageView = (ImageView) findViewById(R.id.redImageView33);
        varGreen11ImageView = (ImageView) findViewById(R.id.greenImageView11);
        varGreen12ImageView = (ImageView) findViewById(R.id.greenImageView12);
        varGreen13ImageView = (ImageView) findViewById(R.id.greenImageView13);
        varGreen21ImageView = (ImageView) findViewById(R.id.greenImageView21);
        varGreen22ImageView = (ImageView) findViewById(R.id.greenImageView22);
        varGreen23ImageView = (ImageView) findViewById(R.id.greenImageView23);
        varGreen31ImageView = (ImageView) findViewById(R.id.greenImageView31);
        varGreen32ImageView = (ImageView) findViewById(R.id.greenImageView32);
        varGreen33ImageView = (ImageView) findViewById(R.id.greenImageView33);

        varRed11ImageView.animate().translationYBy(-1500);
        varRed12ImageView.animate().translationYBy(-1500);
        varRed13ImageView.animate().translationYBy(-1500);
        varRed21ImageView.animate().translationYBy(-1500);
        varRed22ImageView.animate().translationYBy(-1500);
        varRed23ImageView.animate().translationYBy(-1500);
        varRed31ImageView.animate().translationYBy(-1500);
        varRed32ImageView.animate().translationYBy(-1500);
        varRed33ImageView.animate().translationYBy(-1500);
        varGreen11ImageView.animate().translationYBy(-1500);
        varGreen12ImageView.animate().translationYBy(-1500);
        varGreen13ImageView.animate().translationYBy(-1500);
        varGreen21ImageView.animate().translationYBy(-1500);
        varGreen22ImageView.animate().translationYBy(-1500);
        varGreen23ImageView.animate().translationYBy(-1500);
        varGreen31ImageView.animate().translationYBy(-1500);
        varGreen32ImageView.animate().translationYBy(-1500);
        varGreen33ImageView.animate().translationYBy(-1500);
    }

    public boolean checkGreenWin(View view) {
        if ((varGreen11ImageView.getAlpha() == 1 && varGreen12ImageView.getAlpha() == 1 && varGreen13ImageView.getAlpha() == 1) ||
                (varGreen21ImageView.getAlpha() == 1 && varGreen22ImageView.getAlpha() == 1 && varGreen23ImageView.getAlpha() == 1) ||
                (varGreen31ImageView.getAlpha() == 1 && varGreen32ImageView.getAlpha() == 1 && varGreen33ImageView.getAlpha() == 1) ||
                (varGreen11ImageView.getAlpha() == 1 && varGreen21ImageView.getAlpha() == 1 && varGreen31ImageView.getAlpha() == 1) ||
                (varGreen12ImageView.getAlpha() == 1 && varGreen22ImageView.getAlpha() == 1 && varGreen32ImageView.getAlpha() == 1) ||
                (varGreen13ImageView.getAlpha() == 1 && varGreen23ImageView.getAlpha() == 1 && varGreen33ImageView.getAlpha() == 1) ||
                (varGreen11ImageView.getAlpha() == 1 && varGreen22ImageView.getAlpha() == 1 && varGreen33ImageView.getAlpha() == 1) ||
                (varGreen13ImageView.getAlpha() == 1 && varGreen22ImageView.getAlpha() == 1 && varGreen31ImageView.getAlpha() == 1)) {
            return true;
        }
        Log.i("Info", String.valueOf(varGreen21ImageView.getAlpha()) + String.valueOf(varGreen22ImageView.getAlpha()) + String.valueOf(varGreen23ImageView.getAlpha()));

        return false;
    }

    public boolean checkRedWin(View view) {
        if ((varRed11ImageView.getAlpha() == 1 && varRed12ImageView.getAlpha() == 1 && varRed13ImageView.getAlpha() == 1) ||
                (varRed21ImageView.getAlpha() == 1 && varRed22ImageView.getAlpha() == 1 && varRed23ImageView.getAlpha() == 1) ||
                (varRed31ImageView.getAlpha() == 1 && varRed32ImageView.getAlpha() == 1 && varRed33ImageView.getAlpha() == 1) ||
                (varRed11ImageView.getAlpha() == 1 && varRed21ImageView.getAlpha() == 1 && varRed31ImageView.getAlpha() == 1) ||
                (varRed12ImageView.getAlpha() == 1 && varRed22ImageView.getAlpha() == 1 && varRed32ImageView.getAlpha() == 1) ||
                (varRed13ImageView.getAlpha() == 1 && varRed23ImageView.getAlpha() == 1 && varRed33ImageView.getAlpha() == 1) ||
                (varRed11ImageView.getAlpha() == 1 && varRed22ImageView.getAlpha() == 1 && varRed33ImageView.getAlpha() == 1) ||
                (varRed13ImageView.getAlpha() == 1 && varRed22ImageView.getAlpha() == 1 && varRed31ImageView.getAlpha() == 1)) {
            return true;
        }
        return false;
    }

    public void freezeGame(View view) {
        var11ImageView.setVisibility(view.INVISIBLE);
        var11ImageView.setVisibility(view.INVISIBLE);
        var12ImageView.setVisibility(view.INVISIBLE);
        var13ImageView.setVisibility(view.INVISIBLE);
        var21ImageView.setVisibility(view.INVISIBLE);
        var22ImageView.setVisibility(view.INVISIBLE);
        var23ImageView.setVisibility(view.INVISIBLE);
        var31ImageView.setVisibility(view.INVISIBLE);
        var32ImageView.setVisibility(view.INVISIBLE);
        var33ImageView.setVisibility(view.INVISIBLE);
    }

    public void resetGame(View view) {
        var11ImageView.setVisibility(view.VISIBLE);
        var11ImageView.setVisibility(view.VISIBLE);
        var12ImageView.setVisibility(view.VISIBLE);
        var13ImageView.setVisibility(view.VISIBLE);
        var21ImageView.setVisibility(view.VISIBLE);
        var22ImageView.setVisibility(view.VISIBLE);
        var23ImageView.setVisibility(view.VISIBLE);
        var31ImageView.setVisibility(view.VISIBLE);
        var32ImageView.setVisibility(view.VISIBLE);
        var33ImageView.setVisibility(view.VISIBLE);

        varPlayAgainButton.setVisibility(view.INVISIBLE);
        varWinLooseTextView.setText("");
        varWinLooseTextView.setVisibility(view.INVISIBLE);

        if(varRed11ImageView.getAlpha() == 1) {
            varRed11ImageView.animate().translationYBy(-1500);
            varRed11ImageView.setAlpha(0f);
        }
        if(varRed12ImageView.getAlpha() == 1) {
            varRed12ImageView.animate().translationYBy(-1500);
            varRed12ImageView.setAlpha(0f);
        }
        if(varRed13ImageView.getAlpha() == 1) {
            varRed13ImageView.animate().translationYBy(-1500);
            varRed13ImageView.setAlpha(0f);
        }
        if(varRed21ImageView.getAlpha() == 1) {
            varRed21ImageView.animate().translationYBy(-1500);
            varRed21ImageView.setAlpha(0f);
        }
        if(varRed22ImageView.getAlpha() == 1) {
            varRed22ImageView.animate().translationYBy(-1500);
            varRed22ImageView.setAlpha(0f);
        }
        if(varRed23ImageView.getAlpha() == 1) {
            varRed23ImageView.animate().translationYBy(-1500);
            varRed23ImageView.setAlpha(0f);
        }
        if(varRed31ImageView.getAlpha() == 1) {
            varRed31ImageView.animate().translationYBy(-1500);
            varRed31ImageView.setAlpha(0f);
        }
        if(varRed32ImageView.getAlpha() == 1) {
            varRed32ImageView.animate().translationYBy(-1500);
            varRed32ImageView.setAlpha(0f);
        }
        if(varRed33ImageView.getAlpha() == 1) {
            varRed33ImageView.animate().translationYBy(-1500);
            varRed33ImageView.setAlpha(0f);
        }
        if(varGreen11ImageView.getAlpha() == 1) {
            varGreen11ImageView.animate().translationYBy(-1500);
            varGreen11ImageView.setAlpha(0f);
        }
        if(varGreen12ImageView.getAlpha() == 1) {
            varGreen12ImageView.animate().translationYBy(-1500);
            varGreen12ImageView.setAlpha(0f);
        }
        if(varGreen13ImageView.getAlpha() == 1) {
            varGreen13ImageView.animate().translationYBy(-1500);
            varGreen13ImageView.setAlpha(0f);
        }
        if(varGreen21ImageView.getAlpha() == 1) {
            varGreen21ImageView.animate().translationYBy(-1500);
            varGreen21ImageView.setAlpha(0f);
        }
        if(varGreen22ImageView.getAlpha() == 1) {
            varGreen22ImageView.animate().translationYBy(-1500);
            varGreen22ImageView.setAlpha(0f);
        }
        if(varGreen23ImageView.getAlpha() == 1) {
            varGreen23ImageView.animate().translationYBy(-1500);
            varGreen23ImageView.setAlpha(0f);
        }
        if(varGreen31ImageView.getAlpha() == 1) {
            varGreen31ImageView.animate().translationYBy(-1500);
            varGreen31ImageView.setAlpha(0f);
        }
        if(varGreen32ImageView.getAlpha() == 1) {
            varGreen32ImageView.animate().translationYBy(-1500);
            varGreen32ImageView.setAlpha(0f);
        }
        if(varGreen33ImageView.getAlpha() == 1) {
            varGreen33ImageView.animate().translationYBy(-1500);
            varGreen33ImageView.setAlpha(0f);
        }

        varTapChance = true;
        RIds.clear();
    }

    public void tapCounter(View view) {
        if(RIds.contains(view.getId())) {
            Toast.makeText(this, "Please select other boxes", Toast.LENGTH_SHORT).show();
        } else {
            RIds.add(view.getId());
            if (varTapChance == true) {
                varTapChance = false;
                Log.i("Info", "Clicked for Green" + view.getId());
                switch (view.getId()) {
                    
                    case R.id.imageView11:
                        varGreen11ImageView.setAlpha(1f);
                        varGreen11ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView12:
                        varGreen12ImageView.setAlpha(1f);
                        varGreen12ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView13:
                        varGreen13ImageView.setAlpha(1f);
                        varGreen13ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView21:
                        varGreen21ImageView.setAlpha(1f);
                        varGreen21ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView22:
                        varGreen22ImageView.setAlpha(1f);
                        varGreen22ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView23:
                        varGreen23ImageView.setAlpha(1f);
                        varGreen23ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView31:
                        varGreen31ImageView.setAlpha(1f);
                        varGreen31ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView32:
                        varGreen32ImageView.setAlpha(1f);
                        varGreen32ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView33:
                        varGreen33ImageView.setAlpha(1f);
                        varGreen33ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                }
            } else if (varTapChance == false) {
                varTapChance = true;
                Log.i("Info", "Clicked for Red" + view.getId());
                switch (view.getId()) {
                    case R.id.imageView11:
                        varRed11ImageView.setAlpha(1f);
                        varRed11ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView12:
                        varRed12ImageView.setAlpha(1f);
                        varRed12ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView13:
                        varRed13ImageView.setAlpha(1f);
                        varRed13ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView21:
                        varRed21ImageView.setAlpha(1f);
                        varRed21ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView22:
                        varRed22ImageView.setAlpha(1f);
                        varRed22ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView23:
                        varRed23ImageView.setAlpha(1f);
                        varRed23ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView31:
                        varRed31ImageView.setAlpha(1f);
                        varRed31ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView32:
                        varRed32ImageView.setAlpha(1f);
                        varRed32ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                    case R.id.imageView33:
                        varRed33ImageView.setAlpha(1f);
                        varRed33ImageView.animate().translationYBy(1500).setDuration(1000);
                        break;
                }
            }
            if (checkGreenWin(view) == true) {
                varWinLooseTextView.setVisibility(view.VISIBLE);
                varPlayAgainButton.setVisibility(view.VISIBLE);
                varWinLooseTextView.setText("Green Wins!");
                freezeGame(view);
            } else if (checkRedWin(view) == true) {
                varWinLooseTextView.setVisibility(view.VISIBLE);
                varPlayAgainButton.setVisibility(view.VISIBLE);
                varWinLooseTextView.setText("Red Wins!");
                freezeGame(view);
            } else if (RIds.size() == 9) {
                varPlayAgainButton.setVisibility(view.VISIBLE);
                freezeGame(view);
            }
        }
    }
}
