package com.yoji.calcinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView calcTxtView;

    private StringBuilder calcTxtStringBuilder;
    private String calcTxt;

    private View.OnClickListener dotBtnOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            calcTxt = calcTxtView.getText().toString();
            if (!calcTxt.equals("") && !calcTxt.matches(".*,.*")) {
                calcTxtStringBuilder.append(",");
                calcTxtView.setText(calcTxtStringBuilder);
            }
        }
    };

    private View.OnClickListener numBtnOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            calcTxt = calcTxtView.getText().toString();
            int id = v.getId();
            if (calcTxt.equals("0")){
                calcTxtStringBuilder.deleteCharAt(0);
            }
            switch (id){
                case R.id.zeroBtnId:
                    calcTxtStringBuilder.append(getString(R.string.zero));
                    calcTxtView.setText(calcTxtStringBuilder);
                    break;
                case R.id.oneBtnId:
                    calcTxtStringBuilder.append(getString(R.string.one));
                    calcTxtView.setText(calcTxtStringBuilder);
                    break;
                case R.id.twoBtnId:
                    calcTxtStringBuilder.append(getString(R.string.two));
                    calcTxtView.setText(calcTxtStringBuilder);
                    break;
                case R.id.threeBtnId:
                    calcTxtStringBuilder.append(getString(R.string.three));
                    calcTxtView.setText(calcTxtStringBuilder);
                    break;
                case R.id.fourBtnId:
                    calcTxtStringBuilder.append(getString(R.string.four));
                    calcTxtView.setText(calcTxtStringBuilder);
                    break;
                case R.id.fiveBtnId:
                    calcTxtStringBuilder.append(getString(R.string.five));
                    calcTxtView.setText(calcTxtStringBuilder);
                    break;
                case R.id.sixBtnId:
                    calcTxtStringBuilder.append(getString(R.string.six));
                    calcTxtView.setText(calcTxtStringBuilder);
                    break;
                case R.id.sevenBtnId:
                    calcTxtStringBuilder.append(getString(R.string.seven));
                    calcTxtView.setText(calcTxtStringBuilder);
                    break;
                case R.id.eightBtnId:
                    calcTxtStringBuilder.append(getString(R.string.eight));
                    calcTxtView.setText(calcTxtStringBuilder);
                    break;
                case R.id.nineBtnId:
                    calcTxtStringBuilder.append(getString(R.string.nine));
                    calcTxtView.setText(calcTxtStringBuilder);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        calcTxtView = findViewById(R.id.calcTxtView);
        Button zeroBtn = findViewById(R.id.zeroBtnId);
        Button oneBtn = findViewById(R.id.oneBtnId);
        Button twoBtn = findViewById(R.id.twoBtnId);
        Button threeBtn = findViewById(R.id.threeBtnId);
        Button fourBtn = findViewById(R.id.fourBtnId);
        Button fiveBtn = findViewById(R.id.fiveBtnId);
        Button sixBtn = findViewById(R.id.sixBtnId);
        Button sevenBtn = findViewById(R.id.sevenBtnId);
        Button eightBtn = findViewById(R.id.eightBtnId);
        Button nineBtn = findViewById(R.id.nineBtnId);
        Button dotBtn = findViewById(R.id.dotBtnId);

        zeroBtn.setOnClickListener(numBtnOnClickListener);
        oneBtn.setOnClickListener(numBtnOnClickListener);
        twoBtn.setOnClickListener(numBtnOnClickListener);
        threeBtn.setOnClickListener(numBtnOnClickListener);
        fourBtn.setOnClickListener(numBtnOnClickListener);
        fiveBtn.setOnClickListener(numBtnOnClickListener);
        sixBtn.setOnClickListener(numBtnOnClickListener);
        sevenBtn.setOnClickListener(numBtnOnClickListener);
        eightBtn.setOnClickListener(numBtnOnClickListener);
        nineBtn.setOnClickListener(numBtnOnClickListener);
        dotBtn.setOnClickListener(dotBtnOnClickListener);

        calcTxtStringBuilder = new StringBuilder();
    }
}
