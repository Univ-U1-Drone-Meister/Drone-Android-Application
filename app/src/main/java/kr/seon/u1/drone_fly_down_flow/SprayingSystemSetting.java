package kr.seon.u1.drone_fly_down_flow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import androidx.appcompat.app.AppCompatActivity;

import kr.seon.u1.DroneFly;
import kr.seon.u1.R;

public class SprayingSystemSetting extends AppCompatActivity {

    LinearLayout Btn_Return;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_spraying_system_setting);

        Btn_Return = (LinearLayout)findViewById(R.id.btn_return);

        final Intent Return = new Intent(SprayingSystemSetting.this, DroneFly.class);

        Spinner NozzleModel = (Spinner)findViewById(R.id.sp_spraying_nm);
        ArrayAdapter NozzleModelAdapter = ArrayAdapter.createFromResource
                (SprayingSystemSetting.this, R.array.nozzle_model, android.R.layout.simple_spinner_item);
        NozzleModelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        NozzleModel.setAdapter(NozzleModelAdapter);

        Btn_Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Return);
            }
        });
    }

}
