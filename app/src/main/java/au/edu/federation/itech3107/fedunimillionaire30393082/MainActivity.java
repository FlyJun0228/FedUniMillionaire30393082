package au.edu.federation.itech3107.fedunimillionaire30393082;

import static au.edu.federation.itech3107.fedunimillionaire30393082.Json.Answers;
import static au.edu.federation.itech3107.fedunimillionaire30393082.Json.ans;
import static au.edu.federation.itech3107.fedunimillionaire30393082.Json.diff;
import static au.edu.federation.itech3107.fedunimillionaire30393082.Json.question;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView,textView2,textView3,textView4,textView5,textView6;
    private Button button,button1,button2;
    private int bonus = 0;
    private String answer = "";
    private  int index = 0;
    private int sum = 0;
    private Json json;
    private CountDownTimer countDownTimer;
    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    private int []Bonus = new int[]{1000,2000,4000,8000,16000,32000,64000,125000,250000,500000,1000000};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        json.JsonQuestoString();
        textView.setText((index+1)+":"+question[index]);
        textView5.setText(diff[index]+" question");
        setAnswer(index);
        textView4.setText("The value of this topic is "+Bonus[index]+"$"+"\n"+"There are still "+(10-index)+" questions before the game succeeds");
        textView3.setText("Single choice question");
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                        answer = "A";
                        checkBox2.setChecked(false);
                        checkBox3.setChecked(false);
                        checkBox4.setChecked(false);
                }else {

                }
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                        answer = "B";
                        checkBox1.setChecked(false);
                        checkBox3.setChecked(false);
                        checkBox4.setChecked(false);
                }else {

                }
            }
        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                        answer = "C";
                        checkBox2.setChecked(false);
                        checkBox1.setChecked(false);
                        checkBox4.setChecked(false);
                }else {

                }
            }
        });
        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                        answer = "D";
                        checkBox2.setChecked(false);
                        checkBox3.setChecked(false);
                        checkBox1.setChecked(false);
                }else {

                }
            }
        });
    }

    public void initView(){
        textView = findViewById(R.id.question);
        textView2 = findViewById(R.id.bonus);
        textView3 = findViewById(R.id.single);
        textView4 = findViewById(R.id.value);
        textView5 = findViewById(R.id.diff);
        textView6 = findViewById(R.id.time);
        button = findViewById(R.id.next);
        button1 = findViewById(R.id.exit);

        checkBox1 = findViewById(R.id.answer1);
        checkBox2 = findViewById(R.id.answer2);
        checkBox3 = findViewById(R.id.answer3);
        checkBox4 = findViewById(R.id.answer4);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button1.setVisibility(View.GONE);
        json = new Json();
        countDownTimer = new CountDownTimer(16000,1000) {
            @Override
            public void onTick(long l) {
                textView6.setText("Time remaining "+String.valueOf(l/1000)+" seconds");
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent();
                intent.putExtra("bonus",bonus);
                intent.setClass(MainActivity.this,End.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        }.start();
    }
    public void setAnswer(int i){
        for (int j = 0;j<4;j++){
            checkBox1.setText(Answers[i][0]);
            checkBox2.setText(Answers[i][1]);
            checkBox3.setText(Answers[i][2]);
            checkBox4.setText(Answers[i][3]);
        }
    }
    public boolean chexkAnswer(int i){
        if (answer.equals(ans[i])){
            if (i>=0&&i<5){
                bonus = 1000;
            }
           else {
                bonus = 32000;
            }
            return true;
        }else {
            return false;
        }
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.next:
              if (chexkAnswer(index)){
                    sum++;
                    if (sum==11){
                        bonus = 1000000;
                        Toast.makeText(this, "You are winner", Toast.LENGTH_SHORT).show();
                        button1.setVisibility(View.VISIBLE);
                        button.setVisibility(View.GONE);
                        countDownTimer.cancel();
                    }
                    if (index<question.length){
                        if (index==10){

                        }else {
                            index++;
                        }
                        textView.setText((index+1)+":"+question[index]);
                        textView4.setText("The value of this topic is "+Bonus[index]+"$"+"\n"+"There are still "+(11-index-1)+" questions before the game succeeds");
                        textView5.setText(diff[index]);
                        setAnswer(index);
                        countDownTimer.start();
                        checkBox1.setChecked(false);
                        checkBox2.setChecked(false);
                        checkBox3.setChecked(false);
                        checkBox4.setChecked(false);
                    }else {

                    }

               }else {
                    Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show();
                  countDownTimer.cancel();
                    Intent intent = new Intent();
                    intent.putExtra("bonus",bonus);
                    intent.setClass(MainActivity.this,End.class);
                    MainActivity.this.startActivity(intent);
                    MainActivity.this.finish();
                }
                break;
            case R.id.exit:
                countDownTimer.cancel();
                Intent intent = new Intent();
                intent.putExtra("bonus",bonus);
                intent.setClass(MainActivity.this,End.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
                break;

        }
    }
}