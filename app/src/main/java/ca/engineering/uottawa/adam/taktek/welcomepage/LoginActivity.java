package ca.engineering.uottawa.adam.taktek.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    AccountDBsql AccountDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void logInEnter (View v){
        AccountDB = new AccountDBsql(this);

        EditText courrielText = (EditText) findViewById(R.id.courrielLogEditText);
        EditText passwordText = (EditText) findViewById(R.id.passwordLogEditText);

        String courriel =  courrielText.getText().toString();
        String password = passwordText.getText().toString();

        if(! courriel.isEmpty() && ! password.toString().isEmpty()){
            //compare username and password to stored accounts:
            boolean correctLogIn = AccountDB.checkLogIn(courriel, password);
            if (correctLogIn == true){
                Toast.makeText(LoginActivity.this, "Successfull logIn", Toast.LENGTH_SHORT).show();
//Tachfine make startActivity here for you homepage, passing the extra accountType

            }

            //launch Welcome/homepage if comparison successful
        }else{ // One or more fields is missing
            Toast logIntoast = Toast.makeText(LoginActivity.this, "Please enter username and password", Toast.LENGTH_LONG); //.show();
             //logIntoast.show();
            View view = logIntoast.getView();
            TextView text = (TextView) view.findViewById(android.R.id.message);
            text.setTextAppearance(R.style.toastTextStyle);
            logIntoast.show();

        }

    }
}