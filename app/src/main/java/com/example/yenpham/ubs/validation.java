package com.example.yenpham.ubs;

import android.widget.Button;



import android.content.Context;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import android.widget.Toast;

public class validation extends AppCompatActivity implements View.OnClickListener {


    public EditText verificationcode;
    public Button submit;
    public Button cancel;


    private EditText codeField;
    private Button Submit;
    private int our_code;
    boolean success = false;
    int user_code;
    String codeStr;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);


        Bundle intent = getIntent().getExtras();
        our_code = intent.getInt("Ver_Code");

        codeField = (EditText) findViewById(R.id.veriCode);

        count = 0;


        Submit = (Button) findViewById(R.id.submit);
        Submit.setOnClickListener(this);


        cancelation();
    }


    public void cancelation() {
        cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {


                                          Intent move = new Intent(validation.this, welcom_class.class);
                                          startActivity(move);


                                      }
                                  }
        );
    }



        @Override
        public void onClick(View view) {
            codeStr = codeField.getText().toString();
            count ++;
            try {
                user_code= Integer.parseInt(codeStr);
                if (our_code == user_code) {
                    success = true;
                    Intent vad = new Intent(validation.this, login_gg.class);
                    vad.putExtra("IS_First_Time", true);
                    startActivity(vad);
                    finish();
                } else {
                    codeField.setError("Invalid Code");
                    success = false;
                }

            } catch (Exception e) {
                codeField.setError("Invalid Code");
                success = false;
            }

            if (!success && count >=3){
                String message = String.format("Failed to be a UTA student.");
                Context context = getApplicationContext();

                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
                Intent vad = new Intent(validation.this, welcom_class.class);
                startActivity(vad);
                finish();
            }



        }

}