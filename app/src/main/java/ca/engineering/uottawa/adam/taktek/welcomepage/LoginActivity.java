package ca.engineering.uottawa.adam.taktek.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void logInEnter (View v){
        EditText username = (EditText) findViewById(R.id.courrielLogEditText);
        EditText password = (EditText) findViewById(R.id.passwordLogEditText);

        if(! username.getText().toString().isEmpty() && ! password.getText().toString().isEmpty()){
            //compare username and password to stored accounts:

            //launch Welcome/homepage if comparison successful
        }else{ // One or more fields is missing
            Toast logIntoast = Toast.makeText(LoginActivity.this, "Please enter username and password", Toast.LENGTH_LONG); //.show();
            View view = logIntoast.getView();
            TextView text = (TextView) view.findViewById(android.R.id.message);
            text.setTextAppearance(R.style.toastTextStyle);
            logIntoast.show();

        }

    }
}