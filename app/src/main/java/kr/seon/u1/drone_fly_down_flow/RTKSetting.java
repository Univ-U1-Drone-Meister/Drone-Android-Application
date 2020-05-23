package kr.seon.u1.drone_fly_down_flow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import kr.seon.u1.DroneFly;
import kr.seon.u1.MainActivity;
import kr.seon.u1.R;

public class RTKSetting extends AppCompatActivity {
    LinearLayout Btn_Return_Main;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_rtk_setting);

        Btn_Return_Main = (LinearLayout)findViewById(R.id.btn_return);

        final Intent Return = new Intent(RTKSetting.this, DroneFly.class);

        //Spinner 사용을 위한 어댑팅
        Spinner RTKMode = (Spinner)findViewById(R.id.sp_rtk_mode);
        ArrayAdapter RTKModeAdapter = ArrayAdapter.createFromResource
                (RTKSetting.this, R.array.device_working_mode, android.R.layout.simple_spinner_item);
        RTKModeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        RTKMode.setAdapter(RTKModeAdapter);

        Spinner RTKFunction = (Spinner)findViewById(R.id.sp_rtk_function);
        ArrayAdapter RTKFunctionAdapter = ArrayAdapter.createFromResource
                (RTKSetting.this, R.array.rtk_function, android.R.layout.simple_spinner_item);
        RTKFunctionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        RTKFunction.setAdapter(RTKFunctionAdapter);

        Spinner OpenChannel = (Spinner)findViewById(R.id.sp_rtk_open_channel);
        ArrayAdapter OpenChannelAdapter = ArrayAdapter.createFromResource
                (RTKSetting.this, R.array.open_channel, android.R.layout.simple_spinner_item);
        OpenChannelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        OpenChannel.setAdapter(OpenChannelAdapter);

        Spinner AdvancedSetting = (Spinner)findViewById(R.id.sp_rtk_as);
        ArrayAdapter AdvancedSettingAdapter = ArrayAdapter.createFromResource
                (RTKSetting.this, R.array.advanced_setting, android.R.layout.simple_spinner_item);
        AdvancedSettingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AdvancedSetting.setAdapter(AdvancedSettingAdapter);

        Btn_Return_Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Return);
            }
        });

    }

}
