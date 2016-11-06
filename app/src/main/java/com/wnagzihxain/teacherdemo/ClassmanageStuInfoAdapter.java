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

public class ClassmanageStuInfoAdapter extends ArrayAdapter<ClassmanageStuInfo> {
    private int resourceID;

    public ClassmanageStuInfoAdapter(Context context, int textViewResourceID, List<ClassmanageStuInfo> objects) {
        super(context, textViewResourceID, objects);
        resourceID = textViewResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ClassmanageStuInfo manageStuInfo = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceID, null);
        TextView tv_manage_StuID = (TextView)view.findViewById(R.id.tv_manage_StuID);
        TextView tv_manage_StuName = (TextView)view.findViewById(R.id.tv_manage_StuName);
        tv_manage_StuID.setText("学号：" + manageStuInfo.getStuID().toString());
        tv_manage_StuName.setText("姓名：" + manageStuInfo.getStuName().toString());
        return view;
    }
}
