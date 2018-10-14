package kr.co.company.widgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_main2);

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setText("코드에서 버튼 변경");

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setEnabled(false);
    }
}
