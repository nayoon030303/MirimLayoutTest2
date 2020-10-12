package kr.hs.emirim.s2019s05.mirimlayouttest2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        final LinearLayout lineear1 = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                                                            LinearLayout.LayoutParams.MATCH_PARENT);
        lineear1.setBackgroundColor(Color.rgb(181,178,255));
        lineear1.setOrientation(LinearLayout.VERTICAL);

        editText = new EditText(this);
        textView = new TextView(this);
        Button btn = new Button(this);
        editText.setTextSize(20);
        textView.setTextSize(20);
        textView.setTextColor(Color.MAGENTA);

        lineear1.addView(editText);
        lineear1.addView(btn);
        lineear1.addView(textView);



        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.YELLOW);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString()+"이/가 입력되었습니다.");
            }
        });

      /*  Button btn = new Button(this);
        btn.setText("클릭해 주세요");
        btn.setBackgroundColor(Color.MAGENTA);
        btn.setTextColor(Color.WHITE);
        lineear1.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"자바 코드로 작성한 버튼입니다.",Toast.LENGTH_SHORT).show();
            }
        });*/

        setContentView(lineear1,params);
    }
}