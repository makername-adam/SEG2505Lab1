package ca.engineering.uottawa.adam.taktek.welcomepage;
import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class AccountDBsql extends SQLiteOpenHelper {
    public AccountDBsql(Context context) {
        super(context,"Account.db", null,1 );
    }

    @Override
    public void onCreate(SQLiteDatabase AccountDB) {
        AccountDB.execSQL("create Table accounts(courriel Text primary key, password Text, prenom Text, nom Text, addresse Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase AccountDB, int oldVersion, int newVersion) {
        AccountDB.execSQL("drop Table if exists accounts");
    }

    public boolean insertAccount (String courriel, String password,String prenom, String nom, String addresse ){
        SQLiteDatabase AccountDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("courriel", courriel);
        contentValues.put("password", password);
        contentValues.put("prenom", prenom);
        contentValues.put("nom", nom);
        contentValues.put("addresse", addresse);
        long result = AccountDB.insert ("accounts", null, contentValues);
        if (result == -1) {
            return false;
        }else{
            return true;
        }
    }

    public boolean checkAccountExist (String courriel){
        SQLiteDatabase AccountDB = this.getWritableDatabase();
        Cursor cursor = AccountDB.rawQuery("select * from accounts where courriel =?", new String[]{courriel});
        if (cursor.getCount() >0){
            return true;
        }else{
            return false;
        }
    }

    public boolean  checkLogIn (String courriel, String password){
        SQLiteDatabase AccountDB = this.getWritableDatabase();
        Cursor cursor = AccountDB.rawQuery("select * from accounts where courriel = ? and password = ?", new String[]{courriel, password});
        if (cursor.getCount()> 0) {
            return true;
        }else {
            return false;
        }
    }


}
