package com.cse3310.cse3310_group_one_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Arsalan on 4/11/2018.
 */

public class UserViewRequestedEvents extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_requested_events);

        Button back_button = (Button) findViewById(R.id.user_requested_events_back);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back_button();
            }
        });
    }

    public void back_button(){
        Intent intent_back = new Intent(this,UserHomepageActivity.class);
        startActivity(intent_back);
    }
}
