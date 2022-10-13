package ca.engineering.uottawa.adam.taktek.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String accountType = "customer"; //default type of account

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent logIntent = new Intent(getApplicationContext(), LoginActivity.class);
        Intent signIntent = new Intent(getApplicationContext(), SignUpActivity.class);
        Intent adminSignIntent = new Intent(getApplicationContext(), AdminSignUpActivity.class);

        Button buttonAdmin = (Button) findViewById(R.id.btnAdmin);
        buttonAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accountType = "admin";
            }
        });

        Button buttonCustomer = (Button) findViewById(R.id.btnCustomer);
        buttonCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accountType = "customer";
            }
        });

        Button buttonCook = (Button) findViewById(R.id.btnCook);
        buttonCook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accountType = "cook";
            }
        });


        Button buttonLog = (Button) findViewById(R.id.btnLog);
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logIntent.putExtra("accountType", accountType);
                startActivity(logIntent);
            }
        });

        Button buttonSign = (Button) findViewById(R.id.btnSign);
        buttonSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (accountType.equals("admin") ){startActivity(adminSignIntent); }
               else {
                    signIntent.putExtra("accountType", accountType);
                    startActivity(signIntent);
                }
            }
        });


    }
}