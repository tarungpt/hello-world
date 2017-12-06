package www.ltbx.in.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView2);
        editText.setText("");
        textView.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());
    }

    public void logName(View view) {
        String temp = editText.getText().toString();
        textView.append(temp + "\n");
        editText.setText("");

    }
}
