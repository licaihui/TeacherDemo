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

public class ClasssignstuInfoAdapter extends ArrayAdapter<ClasssignstuInfo> {

    private int resourceID;

    public ClasssignstuInfoAdapter(Context context, int textViewResourceID, List<ClasssignstuInfo> objects) {
        super(context, textViewResourceID, objects);
        resourceID = textViewResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ClasssignstuInfo signstuInfo = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceID, null);
        TextView tv_sign_StuID = (TextView)view.findViewById(R.id.tv_sign_StuID);
        TextView tv_sign_StuName = (TextView)view.findViewById(R.id.tv_sign_StuName);
        tv_sign_StuID.setText("学号：" + signstuInfo.getStuID().toString());
        tv_sign_StuName.setText("姓名：" + signstuInfo.getStuName().toString());
        return view;
    }

}
