package kr.seon.u1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UserInformation extends AppCompatActivity {
    LinearLayout Btn_Return_Main;
    EditText Et_Work_Area, Et_Work_Time, Et_Work_Count, Et_Team_Name, Et_Worker_Name, Et_Login_ID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_information_main);
        Btn_Return_Main = (LinearLayout)findViewById(R.id.btn_return);
        Et_Work_Area = (EditText)findViewById(R.id.et_work_area);
        Et_Work_Time = (EditText)findViewById(R.id.et_work_time);
        Et_Work_Count = (EditText)findViewById(R.id.et_work_count);
        Et_Team_Name = (EditText)findViewById(R.id.et_team_name);
        Et_Worker_Name = (EditText)findViewById(R.id.et_worker_name);
        Et_Login_ID = (EditText)findViewById(R.id.et_login_id);
        final Intent main1 = new Intent(UserInformation.this, MainActivity.class);

        Et_Work_Area.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(UserInformation.this,"작업할 영역의 좌표값을 기입해주세요.",Toast.LENGTH_SHORT).show();
            }
        });
        Et_Work_Time.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(UserInformation.this,"작업할 시간을 기입해주세요..",Toast.LENGTH_SHORT).show();
            }
        });
        Et_Work_Count.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(UserInformation.this,"작업한 횟수를 기입해주세요.",Toast.LENGTH_SHORT).show();
            }
        });
        Et_Team_Name.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(UserInformation.this,"작업팀 이름을 기입해주세요.",Toast.LENGTH_SHORT).show();
            }
        });
        Et_Worker_Name.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(UserInformation.this,"작업자명을 기입해주세요..",Toast.LENGTH_SHORT).show();
            }
        });
        Et_Login_ID.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(UserInformation.this,"작업자 아이디를 기입해주세요..",Toast.LENGTH_SHORT).show();
            }
        });
        Btn_Return_Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(main1);
            }
        });
    }
}
