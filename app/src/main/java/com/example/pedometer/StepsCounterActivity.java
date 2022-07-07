package com.example.pedometer;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

public class StepsCounterActivity extends Activity implements SensorEventListener {

    private SensorManager mSensorManager;
    private Sensor mSensor;
    private boolean isSensorPresent;
    private textView mStepsSinceReboot;

    @Overrideprotected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
