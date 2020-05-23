package kr.seon.u1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DroneSetting extends AppCompatActivity {
    LinearLayout Btn_Return_Main;
    TextView Tv_Wings_Version,
             Tv_Network_Search,
             Tv_Mobile_Network,
             Tv_Personal_Info_Name,
             Tv_Personal_Info_Personal_Address,
             Tv_Personal_Info_Home_Address,
             Tv_Personal_Info_Mobile_Number,
             Tv_Personal_Info_Phone_Number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drone_setting_main);
        Btn_Return_Main = (LinearLayout)findViewById(R.id.btn_return);
        Tv_Wings_Version = (TextView) findViewById(R.id.tv_drone_setting_wv);
        Tv_Network_Search = (TextView)findViewById(R.id.tv_drone_setting_ns);
        Tv_Mobile_Network = (TextView)findViewById(R.id.tv_drone_setting_mn);
        Tv_Personal_Info_Name = (TextView)findViewById(R.id.tv_drone_setting_pi_name);
        Tv_Personal_Info_Personal_Address = (TextView)findViewById(R.id.tv_drone_setting_pi_pa);
        Tv_Personal_Info_Home_Address = (TextView)findViewById(R.id.tv_drone_setting_pi_ha);
        Tv_Personal_Info_Mobile_Number = (TextView)findViewById(R.id.tv_drone_setting_mn);
        Tv_Personal_Info_Phone_Number = (TextView)findViewById(R.id.tv_drone_setting_pi_pn);
        final Intent main1 = new Intent(DroneSetting.this, MainActivity.class);
        /*Tv_Personal_Info_Mobile_Number.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(DroneSetting.this,"작업자 아이디를 기입해주세요..",Toast.LENGTH_SHORT).show();
            }
        });*/
        Btn_Return_Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(main1);
            }
        });
    }
}
