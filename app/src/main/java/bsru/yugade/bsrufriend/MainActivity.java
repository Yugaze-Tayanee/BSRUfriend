package bsru.yugade.bsrufriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Explicit การประกาศตัวแปร
    private Button signInButton, signUpButton;
    private EditText userEditText, passEditText;
    private String userString, passString;
    private String[] loginStrings;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget คือการ Initial Var กับ View บน XML
        signInButton = (Button) findViewById(R.id.button);
        signUpButton = (Button) findViewById(R.id.button2);
        userEditText = (EditText) findViewById(R.id.editText);
        passEditText = (EditText) findViewById(R.id.editText2);


        //Button Controller
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SignUpActivity.class));

            }
        });


         signInButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 //Check space and get value from edit text
                 userString = userEditText.getText().toString().trim();
                 passString = passEditText.getText().toString().trim();
                 if (userString.equals("") || passString.equals("")) {
                     //have space
                     MyAlert myAlert = new MyAlert(MainActivity.this);
                     myAlert.myDialog("มีช่องว่าง","กรุณากรอกทุกให้ครบทุกช่องคะ");
                 } else {
                     //no space
                 }

             }  //onClick
         });



        }   // Main Method

}   // Main Class
