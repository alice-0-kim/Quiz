package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScore(View view) {
        EditText edit = (EditText) findViewById(R.id.answer_field);
        String answer = edit.getText().toString();
        RadioButton radioButton = (RadioButton) findViewById(R.id.no_radio_button);
        boolean isChecked = radioButton.isChecked();
        CheckBox checkBox0 = (CheckBox) findViewById(R.id.text_view_check_box);
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.image_view_check_box);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.button_check_box);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.edit_text_check_box);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.linear_layout_check_box);
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.relative_layout_check_box);
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.radio_button_check_box);
        CheckBox checkBox7 = (CheckBox) findViewById(R.id.radio_group_check_box);
        CheckBox checkBox8 = (CheckBox) findViewById(R.id.check_box_check_box);
        CheckBox checkBox9 = (CheckBox) findViewById(R.id.scroll_view_check_box);
        boolean isChecked0 = checkBox0.isChecked();
        boolean isChecked1 = checkBox1.isChecked();
        boolean isChecked2 = checkBox2.isChecked();
        boolean isChecked3 = checkBox3.isChecked();
        boolean isChecked4 = checkBox4.isChecked();
        boolean isChecked5 = checkBox5.isChecked();
        boolean isChecked6 = checkBox6.isChecked();
        boolean isChecked7 = checkBox7.isChecked();
        boolean isChecked8 = checkBox8.isChecked();
        boolean isChecked9 = checkBox9.isChecked();
        if (answer.equals("Extensible Markup Language"))
            score++;
        if (isChecked)
            score++;
        if (isChecked0 && !isChecked1 && isChecked2 && isChecked3 && isChecked4 && !isChecked5 && isChecked6 && isChecked7
                && isChecked8 && isChecked9)
            score++;
        Toast.makeText(this, "Congratulation! You got " + score + " out of 3.", Toast.LENGTH_SHORT).show();
    }
}
