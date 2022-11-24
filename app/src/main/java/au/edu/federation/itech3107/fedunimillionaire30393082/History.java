package au.edu.federation.itech3107.fedunimillionaire30393082;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

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
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                myAdapter.delete(list.get(i).getId());
                return true;
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