package ca.engineering.uottawa.adam.taktek.welcomepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.database.sqlite.SQLiteOpenHelper;

public class SignUpActivity extends AppCompatActivity {
    AccountDBsql AccountDB;
    String accountType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        AccountDB = new AccountDBsql(this);
        //Utilisateur UserSignUp
        if(getIntent().hasExtra("accountType")){
            accountType = getIntent().getExtras().getString("accountType");
            if(accountType.equals("customer")){
                //UserSignUp = new Client();
            }else if (accountType.equals("cook")){
                //UserSignUp = new Cuisinier();
            }
        }

        EditText courrielText = (EditText) findViewById(R.id.courrielSignEditText);
        EditText passwordText = (EditText) findViewById(R.id.passwordSignEditText);
        EditText prenomText = (EditText) findViewById(R.id.prenomSignEditText);
        EditText nomText = (EditText) findViewById(R.id.nomSignEditText);
        EditText addresseText = (EditText) findViewById(R.id.addresseSignEditText);

        Button enterBtn = (Button) findViewById(R.id.enterSignBtn);
        enterBtn.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                String courriel = courrielText.getText().toString();
                String password = passwordText.getText().toString();
                String prenom = prenomText.getText().toString();
                String nom = nomText.getText().toString();
                String addresse = addresseText.getText().toString();
                /*UserSignUp.courriel = courrielText.getText().toString();
                    UserSignUp.password = passwordText.getText().toString();
                    UserSignUp.prenom = prenomText.getText().toString();
                    UserSignUp.nom = nomText.getText().toString();
                    UserSignUp.addresse = addresseText.getText().toString();*/
                if (!  courriel.isEmpty() && ! password .isEmpty() && !prenom.isEmpty() && !nom.isEmpty() && !addresse.isEmpty()) {

                    //save user info and launch homepage:
                    boolean accountexist=  AccountDB.checkAccountExist(courriel);
                    if (accountexist == false){
                        boolean successRegistration = AccountDB.insertAccount(courriel, password, prenom, nom,addresse,"customer");//
                        if (successRegistration == false) {
                            Toast failedSignUpToast = Toast.makeText(SignUpActivity.this, "registration failed", Toast.LENGTH_SHORT);
                            View vf = failedSignUpToast.getView();
                            TextView textVf = (TextView) vf.findViewById(android.R.id.message);
                            textVf.setTextAppearance(R.style.toastTextStyle);
                            failedSignUpToast.show();
                        }else{ Toast successSignUpToast = Toast.makeText(SignUpActivity.this, "Registration Successful", Toast.LENGTH_SHORT);
                                View vs = successSignUpToast.getView();
                                TextView textVs = (TextView) vs.findViewById(android.R.id.message);
                                textVs.setTextAppearance(R.style.toastTextStyle);
                                successSignUpToast.show();
//Tachfine make a start activity for your homepage here, pass the String variable accountType as an extra!
                        }
                    }else{
                        Toast alreadySignUpToast = Toast.makeText(SignUpActivity.this, "Email already used\nPlease logIn instead ", Toast.LENGTH_SHORT);
                        View vasu = alreadySignUpToast.getView();
                        TextView textVasu = (TextView) vasu.findViewById(android.R.id.message);
                        textVasu.setTextAppearance(R.style.toastTextStyle);
                        alreadySignUpToast.show();
                    }

                }else{ // one or more fields is missing:
                    //Toast.makeText(SignUpActivity.this, "Please enter all fields ", Toast.LENGTH_LONG).show();
                    Toast logIntoast = Toast.makeText(SignUpActivity.this, "Please enter all fields ", Toast.LENGTH_LONG); //.show();
                    View v = logIntoast.getView();
                    TextView text = (TextView) v.findViewById(android.R.id.message);
                    text.setTextAppearance(R.style.toastTextStyle);
                    logIntoast.show();
                }
            }
        });

    }
}