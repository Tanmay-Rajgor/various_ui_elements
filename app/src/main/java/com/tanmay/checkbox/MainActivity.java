package com.tanmay.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBoxHarry, checkBoxMetrix, checkBoxJoker;
    private RadioGroup rgMaritulStatus;
    private ProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxHarry = findViewById(R.id.checkboxHarry);
        checkBoxMetrix = findViewById(R.id.checkBoxMetrix);
        checkBoxJoker = findViewById(R.id.checkboxJoker);

        rgMaritulStatus = findViewById(R.id.rgMaritulStatus);
        progressbar = findViewById(R.id.progressbar);
        int checkedButton = rgMaritulStatus.getCheckedRadioButtonId();
        switch (checkedButton){
            case R.id.rbMarried:
                Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSingle:
                Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                progressbar.setVisibility(View.VISIBLE);
                break;
            case R.id.rbInRel:
                Toast.makeText(MainActivity.this, "In Relationship", Toast.LENGTH_SHORT).show();
                progressbar.setVisibility(View.GONE);
                break;
            default:
                break;
        }
        rgMaritulStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbMarried:
                        Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.rbSingle:
                        Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.rbInRel:
                        Toast.makeText(MainActivity.this, "In a Relationship", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        if(checkBoxHarry.isChecked()){
            Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Sorry", Toast.LENGTH_SHORT).show();
        }
        
        checkBoxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "You have watched harry potter", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You need to watch harry potter", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}