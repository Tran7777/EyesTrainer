package romekdimas.com.eyestrainer.basic_menu;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import romekdimas.com.eyestrainer.R;

import static android.R.id.progress;

public class ExerciseMenu extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private  TextView durabilityCounterView;
    private  TextView tex;
    private  SeekBar durationSeekBar;
    private int seekBarState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_menu);

        durabilityCounterView = (TextView) findViewById(R.id.durabilityCounterView);


        durationSeekBar = (SeekBar)findViewById(R.id.durationSeekBar);
        durationSeekBar.setOnSeekBarChangeListener(this);

        tex = (TextView) findViewById(R.id.textView3);



    }

    public void TXT(){

        tex.setText(String.valueOf(seekBarState));

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        seekBarState = i+5;
        durabilityCounterView.setText(String.valueOf(seekBarState + " минут" ));
        TXT();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {




    }
}
