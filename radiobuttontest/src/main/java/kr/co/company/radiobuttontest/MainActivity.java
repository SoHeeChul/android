package kr.co.company.radiobuttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        RadioButton rb = (RadioButton) view;
        switch(view.getId()){
            case R.id.redRadioButton:
                Toast.makeText(this, rb.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.blueRadioButton:
                Toast.makeText(this, rb.getText(), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void onToggleClicked(View view){
        if(((ToggleButton) view).isChecked()){
            Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "Not Checked", Toast.LENGTH_SHORT).show();
        }
    }
}
