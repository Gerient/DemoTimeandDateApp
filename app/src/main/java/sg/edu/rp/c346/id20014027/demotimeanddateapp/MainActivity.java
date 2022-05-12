package sg.edu.rp.c346.id20014027.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    ToggleButton btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textView);
        btnReset = findViewById(R.id.toggleButtonReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                String time = "Time is ";
                int hour = tp.getHour();
                int minute = tp.getMinute();
                if(minute <10){
                    time = time + hour + ":0" + minute;
                }
                else{
                    time = time + hour + ":" + minute;
                }
                tvDisplay.setText(time);
                }
            });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
            String date = "Date is ";
            int day = dp.getDayOfMonth();
            int month = dp.getMonth() +1;
            int year = dp.getYear();
            date = date + day +"/" + month + "/" + year;
            tvDisplay.setText(date);

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnReset.isChecked()){
                    dp.updateDate(2020,01,01);
                }
            }
        });

        }
    }