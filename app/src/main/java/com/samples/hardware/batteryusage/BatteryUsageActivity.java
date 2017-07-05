package com.samples.hardware.batteryusage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BatteryUsageActivity extends AppCompatActivity
        implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery_usage);
    }

    @Override
    public void onClick(View view) {
        // Открываем стандартный Activity с информацией о батарее
        Intent intent = new Intent(Intent.ACTION_POWER_USAGE_SUMMARY);
        startActivity(intent);
    }
}
