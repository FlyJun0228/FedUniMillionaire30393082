package au.edu.federation.itech3107.fedunimillionaire30393082;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import au.edu.federation.itech3107.fedunimillionaire30393082.Bean.History;
import au.edu.federation.itech3107.fedunimillionaire30393082.DataBase.Dao;
import au.edu.federation.itech3107.fedunimillionaire30393082.DataBase.HisDataBase;

public class End extends AppCompatActivity implements View.OnClickListener {
    private TextView textView,textView2,textView3;
    private Button button,button1;
    private int bonus;
    private Dao dao;
    private HisDataBase hisDataBase;
    private History history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        initView();
        textView.setText("Game Over");
        textView2.setText("You will get " + bonus + "$！");
        hisDataBase =  HisDataBase.getDataBase(this);
        dao = hisDataBase.getDao();
        history = new History(getTime(),bonus);
        dao.InsertHis(history);
    }
    public void initView(){
        textView = findViewById(R.id.question);
        textView2 = findViewById(R.id.bonus);
        button1 = findViewById(R.id.exit);
        button1.setOnClickListener(this);
        bonus = getIntent().getIntExtra("bonus",0);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.exit:
                Intent intent = new Intent();
                intent.setClass(End.this,Start.class);
                End.this.startActivity(intent);
                End.this.finish();
                break;
        }
    }
    public String getTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");// HH:mm:ss
       Date date = new Date(System.currentTimeMillis());
       return simpleDateFormat.format(date);

    }
}