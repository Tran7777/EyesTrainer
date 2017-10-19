package romekdimas.com.eyestrainer.basic_menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import romekdimas.com.eyestrainer.R;

public class MainMenu extends AppCompatActivity {

    Button startExerciseButton;
    Button progressButton;
    Button settingsButton;
    Button aboutProgramButton;
    TextView mainName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mainName = (TextView)findViewById(R.id.mainName);
        startExerciseButton = (Button) findViewById(R.id.startExerciseButton);
        progressButton= (Button) findViewById(R.id.progressButton);
        settingsButton = (Button) findViewById(R.id.settingsButton);
        aboutProgramButton = (Button) findViewById(R.id.aboutProgramButton);

        startExerciseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentExerciseMenu = new Intent(MainMenu.this , ExerciseMenu.class);
                startActivity(intentExerciseMenu);

            }
        });

        progressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProgressMenu = new Intent(MainMenu.this , ProgressMenu.class);
                startActivity(intentProgressMenu);


            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSettingsMenu = new Intent(MainMenu.this , SettingsMenu.class);
                startActivity(intentSettingsMenu);
            }
        });

        aboutProgramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAboutProgramMenu = new Intent(MainMenu.this , AboutProgramMenu.class);
                startActivity(intentAboutProgramMenu);
            }
        });



    }


}
