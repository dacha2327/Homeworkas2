package com.dacha.homeworkas2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableWrapper;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
public class MainActivity extends AppCompatActivity {
    private Button enter;
    private EditText email, password;
    private TextView register , reg , sign , dontparol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register= findViewById(R.id.register);
        reg= findViewById(R.id.reg);
        sign= findViewById(R.id.sign);
        dontparol= findViewById(R.id.dontparol);
        enter = findViewById(R.id.button_view);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (enter.getText().toString().equals("")){
                enter.setBackgroundColor(Color.GRAY);
            }
            else{enter.setBackgroundColor(Color.YELLOW);}
                enter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(email.getText().toString().equals("admin")){
                            enter.setBackgroundColor(Color.YELLOW);
                        } else {
                            enter.setBackgroundColor(Color.YELLOW);
                        }
                    }
                });

            }

        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }


            @Override
            public void afterTextChanged(Editable editable) {
                if (enter.getText().toString().equals("")){
                    enter.setBackgroundColor(Color.GRAY);
                }
                else{enter.setBackgroundColor(Color.YELLOW);}
                enter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(password.getText().toString().equals("admin")){
                            Toast.makeText(MainActivity.this,
                                    "Вы успешно зарегестрировались", Toast.LENGTH_SHORT).show();
                            enter.setVisibility(View.GONE);
                            reg.setVisibility(View.GONE);
                            register.setVisibility(View.GONE);
                            sign.setVisibility(View.GONE);
                            dontparol.setVisibility(View.GONE);
                            email.setVisibility(View.GONE);
                            password.setVisibility(View.GONE);


                        } else {
                            Toast.makeText(MainActivity.this,
                                    "Вы ввели не правильный логин и пароль",
                                    Toast.LENGTH_SHORT).show();
                        }

                    }
                });

            }
        });

    }
}