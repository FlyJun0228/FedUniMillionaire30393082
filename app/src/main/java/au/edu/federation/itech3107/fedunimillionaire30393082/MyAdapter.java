package au.edu.federation.itech3107.fedunimillionaire30393082;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import au.edu.federation.itech3107.fedunimillionaire30393082.Bean.History;
import au.edu.federation.itech3107.fedunimillionaire30393082.DataBase.Dao;
import au.edu.federation.itech3107.fedunimillionaire30393082.DataBase.HisDataBase;

public class MyAdapter extends BaseAdapter {
    private List<History> mList;
    private LayoutInflater layoutInflater;
    private HisDataBase hisDataBase;
    private Dao dao;

    public MyAdapter(Context context, List<History> list) {
        mList = list;
        layoutInflater = LayoutInflater.from(context);
        hisDataBase = HisDataBase.getDataBase(context);
        dao = hisDataBase.getDao();
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public void delete(int i){
      dao.DeleteHis(i);
      notifyDataSetChanged();
    }
    public View getView(int j, View view, ViewGroup viewGroup) {
        int i = j;
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = layoutInflater.inflate(R.layout.item, null);
            viewHolder.textView = (TextView) view.findViewById(R.id.title);
            viewHolder.textView1 = (TextView) view.findViewById(R.id.content);
            viewHolder.textView2 = (TextView) view.findViewById(R.id.name);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.textView.setText(String.valueOf("Bonus: "+mList.get(i).getBonus()));
        viewHolder.textView1.setText(mList.get(i).getTime());
        viewHolder.textView2.setText("Player: "+mList.get(i).getName());
        return view;
    }

    public final class ViewHolder {
        public TextView textView, textView1,textView2;
    }
}
