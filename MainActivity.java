package com.example.com221_may29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    }
    public void clicker (View v){
        Button b  = (Button) v;
        b.setText("");
        b.setBackgroundColor(getResources().getColor(R.color.Blue));

        EditText edtTxtInput = findViewById(R.id.edtTxtInput);
        String name = edtTxtInput.getText().toString();

        TextView txtOutput = findViewById(R.id.txtOutput);
        txtOutput.setText("hello Mr/Ms. " + name);

        try{
            EditText editTextText2 = findViewById(R.id.editTextText2);
            TextView txtOutputAge = findViewById(R.id.textView3);
            int age = Integer.valueOf(editTextText2.getText().toString());
            txtOutputAge.setText(String.valueOf(age) + " Years Old");
        }catch(Exception e){
            Toast.makeText(this , "Number Only" , Toast.LENGTH_SHORT).show();
        }
    }
}
