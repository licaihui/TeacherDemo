package com.wnagzihxain.teacherdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wangz on 2016/11/6 0006.
 */

public class ClassVacateStuInfoAdapter extends ArrayAdapter<ClassVacateStuInfo> {

    private int resourceID;

    public ClassVacateStuInfoAdapter(Context context, int textViewResourceID, List<ClassVacateStuInfo> objects) {
        super(context, textViewResourceID, objects);
        resourceID = textViewResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ClassVacateStuInfo vacateStuInfo = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceID, null);
        TextView tv_vacatestuinfo_StuName = (TextView)view.findViewById(R.id.tv_vacatestuinfo_StuName);
        tv_vacatestuinfo_StuName.setText("姓名：" + vacateStuInfo.getStuName().toString());
        return view;
    }
}
