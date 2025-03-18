package com.example.edithome;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //에디트텍스트 eText;
    //버튼 eButton;
    //텍스트뷰 eTextView;

    private EditText eText;
    private Button eButton;
    private TextView eTextView;
    private TextView eTextView2;
    private TextView eTextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        eText = (EditText) findViewById(R.id.edittext);
        eButton = (Button) findViewById(R.id.button);
        eTextView = (TextView) findViewById(R.id.textView);

    }

    public void onClicked(View view) {
        String str = eText.getText().toString();
        eTextView.setText(str);
        String str = eText.getText().toString();
        eTextView2.setText(str);
        String str = eText.getText().toString();
        eTextView3.setText(str);

    }
}