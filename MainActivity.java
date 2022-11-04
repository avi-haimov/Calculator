package com.example.myfirsrprog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    int num1, num2;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.textViewResult);
    }

    public void buttonFunctionNumbers(View view) {
        if (view instanceof Button) {
            Button b = (Button) view;
            String str = b.getText().toString(); // שלפנו את מה שכתוב על הbutton
            result.append(str); // משרשר אליו את מה שכתוב על הbutton
        }
    }
    public void buttonFunctionOperator(View view) {
        if (view instanceof Button) { //if view is a button
            Button b = (Button) view;
            op = b.getText().toString().charAt(0);
            num1 = Integer.parseInt(result.getText().toString());
            result.setText("");
        }}
    public void buttonFunctionEquals(View view){
        double res = 0;
        if (!(view instanceof Button))
           return;
        num2 = Integer.parseInt(result.getText().toString());
        switch (op) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    res = (double) num1 / num2;
                    else {
                        result.setText("Division by zero is not allowed !");
                        return;
                    }
                    break;
            }
            result.setText(String.valueOf(res));
        }
    public void buttonFunctionClear(View view) {
        result.setText("");
    }
}
