package kr.seon.u1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DroneInformation extends AppCompatActivity {
    LinearLayout Btn_Return_Main;
    EditText
            //드론 PlainText 선언
            ET_Drone_ModelName, ET_Drone_LicenseNumber, ET_Drone_OwnerName, ET_Drone_FirmwareVersion, ET_Drone_ControllerSerialNumber,
            //컨트롤러 PlainText 선언
            Et_Controller_SerialNumber, Et_Controller_FirmwareVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drone_information_main);

        //각 선언에 XML ID 대입
        Btn_Return_Main = (LinearLayout) findViewById(R.id.btn_drone_info_return);
        ET_Drone_ModelName = (EditText) findViewById(R.id.drone_info_drone_ct_mn);
        ET_Drone_OwnerName = (EditText) findViewById(R.id.drone_info_drone_ct_on);
        ET_Drone_LicenseNumber = (EditText) findViewById(R.id.drone_info_drone_ct_ln);
        ET_Drone_FirmwareVersion = (EditText) findViewById(R.id.drone_info_drone_ct_fv);
        ET_Drone_ControllerSerialNumber = (EditText) findViewById(R.id.drone_info_drone_ct_sn);
        Et_Controller_SerialNumber = (EditText) findViewById(R.id.drone_info_controller_ct_sn);
        Et_Controller_FirmwareVersion = (EditText) findViewById(R.id.drone_info_drone_ct_fv);

        final Intent main1 = new Intent(DroneInformation.this, MainActivity.class);

        ET_Drone_ModelName.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(DroneInformation.this, "드론의 모델명을 기입해주세요.", Toast.LENGTH_SHORT).show();
            }
        });
        ET_Drone_OwnerName.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(DroneInformation.this, "소유자 명을 기입해주세요.", Toast.LENGTH_SHORT).show();
            }
        });
        ET_Drone_LicenseNumber.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(DroneInformation.this, "드론의 등록번호를 기입해주세요.", Toast.LENGTH_SHORT).show();
            }
        });
        ET_Drone_FirmwareVersion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(DroneInformation.this, "드론의 펌웨어버전을 기입해주세요.", Toast.LENGTH_SHORT).show();
            }
        });
        ET_Drone_ControllerSerialNumber.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(DroneInformation.this, "드론컨트롤러의 시리얼넘버를 기입해주세요.", Toast.LENGTH_SHORT).show();
            }
        });
        Et_Controller_SerialNumber.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(DroneInformation.this, "컨트롤러의 시리얼넘버를 기입해주세요.", Toast.LENGTH_SHORT).show();
            }
        });
        Et_Controller_FirmwareVersion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(DroneInformation.this, "컨트롤러의 펌웨어를 기입해주세요.", Toast.LENGTH_SHORT).show();
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
