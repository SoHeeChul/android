package kr.co.company.eventtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final EditText eText;
        final Button btn;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eText = findViewById(R.id.editText);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = eText.getText().toString();
                Toast.makeText(btn.getContext(), str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
