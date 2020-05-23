package kr.seon.u1.drone_fly_down_flow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import kr.seon.u1.DroneFly;
import kr.seon.u1.R;

public class AircraftSetting extends AppCompatActivity {

    LinearLayout Btn_Return;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_aircraft_setting);

        Btn_Return = (LinearLayout)findViewById(R.id.btn_return);

        final Intent Return = new Intent(AircraftSetting.this, DroneFly.class);

        Spinner AdvancedSetting = (Spinner)findViewById(R.id.sp_aircraft_as);
        ArrayAdapter AdvancedSettingAdapter = ArrayAdapter.createFromResource
                (AircraftSetting.this, R.array.aircraft_advanced_setting, android.R.layout.simple_spinner_item);
        AdvancedSettingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AdvancedSetting.setAdapter(AdvancedSettingAdapter);

        Btn_Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Return);
            }
        });


    }

}
