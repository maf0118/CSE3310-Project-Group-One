package com.cse3310.cse3310_group_one_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Arsalan on 4/11/2018.
 */

public class ProfileManagementActivity extends AppCompatActivity {
    DBManager db;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_management);

        db=new DBManager(this);
        Button edit_account=findViewById(R.id.edit_account);
        Button delete_account=findViewById(R.id.delete_account);
        Button cancel=findViewById(R.id.cancel_PM);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancel();
            }
        });

        edit_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editAccount();
            }
        });
        delete_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteAccount();
            }
        });
    }
    public void deleteAccount(){

        UserModel user = (UserModel) getIntent().getSerializableExtra("USER");
        int id = user.getId();
        db.deleteUser(id);
        Intent intent_redirect = new Intent(this, MainActivity.class);
        startActivity(intent_redirect);
    }

    public void editAccount(){
        Intent intent_editAccount = new Intent(this,EditAccountActivity.class);
        UserModel user = (UserModel) getIntent().getSerializableExtra("USER");
        intent_editAccount.putExtra("USER", user);
        startActivity(intent_editAccount);
    }

    public void cancel(){
        UserModel user = (UserModel) getIntent().getSerializableExtra("USER");
        if(user.getAccountType().equalsIgnoreCase("user")){
            Intent intent_cancel = new Intent(this,UserHomepageActivity.class);
            intent_cancel.putExtra("USER", user);
            startActivity(intent_cancel);
        }
        else if(user.getAccountType().equalsIgnoreCase("caterer"))
        {
            Intent intent_cancel = new Intent(this,CatererHomepageActivity.class);
            intent_cancel.putExtra("USER", user);
            startActivity(intent_cancel);
        }
        else if(user.getAccountType().equalsIgnoreCase("staff"))
        {
            Intent intent_cancel = new Intent(this,StaffHomepageActivity.class);
            intent_cancel.putExtra("USER", user);
            startActivity(intent_cancel);
        }

        finish(); //temporary
    }
}
