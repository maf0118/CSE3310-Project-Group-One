package com.cse3310.cse3310_group_one_project.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.cse3310.cse3310_group_one_project.Models.User;
import com.cse3310.cse3310_group_one_project.R;

/**
 * Created by Arsalan on 4/11/2018.
 */

public class CatererEditEvent extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caterer_edit_event);

        Button Assign_staff=findViewById(R.id.assign_staff);
        Button Remove_staff=findViewById(R.id.remove_staff);
        Button Add_resources=findViewById(R.id.add_resources);
        Button View_user_info=findViewById(R.id.view_user_info);
        Button Remove_resources=findViewById(R.id.remove_resources);
        Button Remove_event=findViewById(R.id.remove_event);
        Button Back=findViewById(R.id.back_caterer);

        Assign_staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                assignStaff();
            }
        });
        Remove_staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeStaff();
            }
        });
        Add_resources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResources();
            }
        });
        View_user_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewUserInfo();
            }
        });
        Remove_resources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeResources();
            }
        });
        Remove_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeEvent();
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prev_page();
            }
        });

    }
    public void assignStaff(){
        Intent intent_assignStaff = new Intent(this,CatererAssignStaff.class);
        User user = (User) getIntent().getSerializableExtra("USER");
        intent_assignStaff.putExtra("USER", user);
        startActivity(intent_assignStaff);
    }
    public void removeStaff(){
        Intent intent_removeStaff = new Intent(this,CatererRemoveStaff.class);
        User user = (User) getIntent().getSerializableExtra("USER");
        intent_removeStaff.putExtra("USER", user);
        startActivity(intent_removeStaff);
    }
    public void addResources(){
        Intent intent_addResources = new Intent(this,CatererAddResources.class);
        User user = (User) getIntent().getSerializableExtra("USER");
        intent_addResources.putExtra("USER", user);
        startActivity(intent_addResources);
    }
    public void viewUserInfo(){
        Intent intent_viewUserInfo = new Intent(this,CatererViewUserInfo.class);
        User user = (User) getIntent().getSerializableExtra("USER");
        intent_viewUserInfo.putExtra("USER", user);
        startActivity(intent_viewUserInfo);
    }
    public void removeResources(){
        Intent intent_removeResources = new Intent(this,CatererRemoveResources.class);
        User user = (User) getIntent().getSerializableExtra("USER");
        intent_removeResources.putExtra("USER", user);
        startActivity(intent_removeResources);
    }
    public void removeEvent(){
        //TODO: remove event
    }
    public void prev_page(){
        Intent intent_prev = new Intent(this,CatererReservedEvents.class);
        User user = (User) getIntent().getSerializableExtra("USER");
        intent_prev.putExtra("USER", user);
        startActivity(intent_prev);
    }

}