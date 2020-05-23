package kr.seon.u1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupWindow;

import androidx.appcompat.app.AppCompatActivity;

import kr.seon.u1.drone_fly_down_flow.RTKSetting;

public class DroneFly extends AppCompatActivity {
    LinearLayout Flying, Btn_Return_Main;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flyimg_main);

        Flying = (LinearLayout)findViewById(R.id.btn_flying_main_flying);
        Btn_Return_Main = (LinearLayout)findViewById(R.id.btn_return);

        final Intent RTKSetting = new Intent(DroneFly.this, kr.seon.u1.drone_fly_down_flow.RTKSetting.class);
        final Intent AircaftSetting = new Intent(DroneFly.this,kr.seon.u1.drone_fly_down_flow.AircraftSetting.class);
        final Intent SprayingSystemSetting = new Intent(DroneFly.this,kr.seon.u1.drone_fly_down_flow.SprayingSystemSetting.class);
        final Intent Return = new Intent(DroneFly.this, MainActivity.class);

        /*PopupWindow popupwindow_obj; // create object
        popupwindow_obj = popupDisplay();  // initialize in onCreate()
        popupwindow_obj.showAsDropDown(clickbtn,-40, 18); // where u want show on view click event
        public PopupWindow popupDisplay() { // disply designing your popoup window
            final PopupWindow popupWindow = new PopupWindow(this); // inflet your layout or diynamic add view
            View view;
            LayoutInflater inflater = (LayoutInflater)   getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.mylayout, null);
            Button item = (LinearLayout) view.findViewById(R.id.button1);
            popupWindow.setFocusable(true);
            popupWindow.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
            popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
            popupWindow.setContentView(view);
            return popupWindow;
        }*/

        Btn_Return_Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Return);
            }
        });

        Flying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu FlyingMenu = new PopupMenu(getApplicationContext(),v);
                getMenuInflater().inflate(R.menu.flying_menu,FlyingMenu.getMenu());
                //
                FlyingMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.menu_aircraft_setting:
                                startActivity(AircaftSetting);
                                break;
                            case R.id.menu_sprasying_system_setting:
                                startActivity(SprayingSystemSetting);
                                break;
                            case R.id.menu_rtk_setting:
                                startActivity(RTKSetting);
                                break;
                            case R.id.menu_radar_setting:

                                break;

                        }
                        return false;
                    }
                });
                FlyingMenu.show();
            }
        });
    }
}
