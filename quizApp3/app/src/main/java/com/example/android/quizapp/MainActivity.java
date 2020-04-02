package com.example.localuser.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    RadioButton radioButton;
    CheckBox checkBox, checkBox2, checkBox3, checkBox4;
    int x = 0;
    boolean flag = false, flag2 = false, flag3 = false, flag4 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.score);
        textView.setText("Score : " + x);
    }

    public void answerOne(View view) {
        textView = findViewById(R.id.score);
        editText = findViewById(R.id.edit_query);
        String name = editText.getText().toString();
        if (name.equals(null) || name.length() == 0) {
            Toast.makeText(this, "Please Type Your Answer", Toast.LENGTH_SHORT).show();
            return;
        } else if (name.equalsIgnoreCase("Günaydın")) {
            if (flag == false) {
                x = x + 5;
                textView.setText("Score : " + x);
                flag = true;
                Toast.makeText(this, "Correct Answer" + "\n" + "5 marks is added.", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect Answer" + "\n" + "Correct Answer is : Günaydın", Toast.LENGTH_SHORT).show();
        }

    }

    public void answerTwo(View view) {
        textView = findViewById(R.id.score);
        radioButton = findViewById(R.id.berry);
        if (radioButton.isChecked()) {
            if (flag2 == false) {
                x = x + 5;
                textView.setText("Score : " + x);
                flag2 = true;
                Toast.makeText(this, "Correct Answer" + "\n" + "5 marks is added.", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect Answer " + "\n" + "Correct Answer is : çilek", Toast.LENGTH_SHORT).show();
        }

    }

    public void answerThree(View view) {
        textView = findViewById(R.id.score);
        checkBox = findViewById(R.id.cairo);
        checkBox2 = findViewById(R.id.fayoum);
        checkBox3 = findViewById(R.id.new_york);
        checkBox4 = findViewById(R.id.california);

        if ((checkBox2.isChecked() && checkBox.isChecked()) && (!checkBox3.isChecked() && !checkBox4.isChecked())) {
            if (flag3 == false) {
                x = x + 5;
                textView.setText("Score : " + x);
                flag3 = true;
                Toast.makeText(this, "Correct Answer" + "\n" + "5 marks is added.", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect Answer " + "\n" + "Correct Answer is : fayoum and cairo", Toast.LENGTH_SHORT).show();
        }

    }

    public void answerFour(View view) {
        textView = findViewById(R.id.score);
        editText = findViewById(R.id.edit_query2);
        String name = editText.getText().toString();
        if (name.equals(null) || name.length() == 0) {
            Toast.makeText(this, "Please Type Your Answer", Toast.LENGTH_SHORT).show();
            return;
        } else if (name.equalsIgnoreCase("EVET ") || name.equalsIgnoreCase("evet")
                || name.equalsIgnoreCase("Evet")) {
            if (flag4 == false) {
                x = x + 5;
                textView.setText("Score : " + x);
                flag4 = true;
                Toast.makeText(this, "Correct Answer" + "\n" + "5 marks is added.", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect Answer" + "\n" + "Correct Answer is :  evet", Toast.LENGTH_SHORT).show();
        }
    }
}