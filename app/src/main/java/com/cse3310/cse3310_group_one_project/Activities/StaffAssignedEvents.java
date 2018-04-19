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

public class StaffAssignedEvents extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_assigned_events);
        //TODO: view_details button
        Button view_details = (Button) findViewById(R.id.view_details_assigned);
        Button back_button= (Button) findViewById(R.id.assigned_events_back);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backButton();
            }
        });
        view_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewDetails();
            }
        });
    }

    public void viewDetails(){
        Intent intent_viewDetails = new Intent(this,UserStaffReservedEventDetails.class);
        User user = (User) getIntent().getSerializableExtra("USER");
        intent_viewDetails.putExtra("USER", user);
        startActivity(intent_viewDetails);
    }
    public void backButton(){
        Intent intent_back = new Intent(this,StaffHomepage.class);
        User user = (User) getIntent().getSerializableExtra("USER");
        intent_back.putExtra("USER", user);
        startActivity(intent_back);
    }


}