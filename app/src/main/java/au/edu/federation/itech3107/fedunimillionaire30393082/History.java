package au.edu.federation.itech3107.fedunimillionaire30393082;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import au.edu.federation.itech3107.fedunimillionaire30393082.DataBase.Dao;
import au.edu.federation.itech3107.fedunimillionaire30393082.DataBase.HisDataBase;

public class History extends AppCompatActivity {
    private ListView listView;
    private Spinner spinner;
    private HisDataBase hisDataBase;
    private Dao dao;
    private MyAdapter myAdapter;
    private List<au.edu.federation.itech3107.fedunimillionaire30393082.Bean.History> list;
    private List<String> mList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        listView = findViewById(R.id.listview);
        spinner = findViewById(R.id.spinner);
        hisDataBase = HisDataBase.getDataBase(this);
        dao = hisDataBase.getDao();
        list = new ArrayList<>();
        list = dao.QueryHis();
        myAdapter = new MyAdapter(this,list);
        listView.setAdapter(myAdapter);
        mList = new ArrayList<>();
        mList.add("Time");
        mList.add("Bonus");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,mList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                myAdapter.delete(list.get(i).getId());
                Toast.makeText(History.this, "删除成功", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        myAdapter = new MyAdapter(History.this,dao.QueryHisTime());
                        listView.setAdapter(myAdapter);
                        break;
                    case 1:
                        myAdapter = new MyAdapter(History.this,dao.QueryHisBonus());
                        listView.setAdapter(myAdapter);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent();
        intent.setClass(History.this,Start.class);
        this.startActivity(intent);
        this.finish();
    }
}