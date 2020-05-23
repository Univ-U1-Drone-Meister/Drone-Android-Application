package kr.seon.u1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout Btn_User_Info,Btn_Drone_Info,Btn_Drone_Setting,Btn_Drone_Flying;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent User_Info = new Intent(this, UserInformation.class);
        final Intent Drone_Info = new Intent(this, DroneInformation.class);
        final Intent Drone_setting = new Intent(this, DroneSetting.class);
        final Intent Drone_Fly = new Intent(this, DroneFly.class);
        Btn_User_Info = (LinearLayout) findViewById(R.id.btn_user_info);
        Btn_Drone_Info = (LinearLayout)findViewById(R.id.btn_drone_info);
        Btn_Drone_Setting = (LinearLayout)findViewById(R.id.btn_drone_setting);
        Btn_Drone_Flying = (LinearLayout)findViewById(R.id.btn_drone_flying);
        Btn_User_Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(User_Info);
            }
        });
        Btn_Drone_Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Drone_Info);
            }
        });
        Btn_Drone_Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Drone_setting);
            }
        });
        Btn_Drone_Flying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Drone_Fly);
            }
        });
    }
}
