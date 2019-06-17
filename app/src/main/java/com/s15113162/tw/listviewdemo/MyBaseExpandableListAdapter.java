package com.s15113162.tw.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MyBaseExpandableListAdapter extends BaseExpandableListAdapter {

    private ArrayList<Group> gData;
    private ArrayList<ArrayList<Item>> iData;
    private Context mContext;

    public MyBaseExpandableListAdapter(ArrayList<Group> gData, ArrayList<ArrayList<Item>> iData,Context mContext)
    {
        this.gData = gData;
        this.iData = iData;
        this.mContext = mContext;
    }

    @Override
    public int getGroupCount() {
        return gData.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return iData.get(groupPosition).size();
    }

    @Override
    public Group getGroup(int groupPostion) {
        return gData.get(groupPostion);
    }

    @Override
    public Item getChild(int groupPosition, int childPosition) {
        return iData.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPostion, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }
    //取得用於顯示給分定分組的視圖,這個方法僅返回分組的視圖對象
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ViewHolderGroup groupHold;
        if(convertView == null)
        {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_exlist_group,parent,false);
            groupHold = new ViewHolderGroup();
            groupHold.Game_group_name = (TextView) convertView.findViewById(R.id.Game_group_name);
            convertView.setTag(groupHold);
        }
        else {
              groupHold = (ViewHolderGroup) convertView.getTag();
            }
            groupHold.Game_group_name.setText(gData.get(groupPosition).getgName());
        return convertView;
    }
    //取得顯示給定分組給定子位置的數據用的視圖
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ViewHolderItem itemHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.item_exlist_item, parent, false);
            itemHolder = new ViewHolderItem();
            itemHolder.img_icon = (ImageView) convertView.findViewById(R.id.img_icon);
            itemHolder.Game_name = (TextView) convertView.findViewById(R.id.Game_name);
            convertView.setTag(itemHolder);
        }else{
            itemHolder = (ViewHolderItem) convertView.getTag();
        }
        itemHolder.img_icon.setImageResource((iData.get(groupPosition).get(childPosition).getiId()));
        itemHolder.Game_name.setText(iData.get(groupPosition).get(childPosition).getiName());
        return convertView;
    }
    //設置子列表是否可選中
    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
    private static class ViewHolderGroup
    {
        private TextView Game_group_name;
    }
    private static class ViewHolderItem
    {
        private ImageView img_icon;
        private TextView Game_name;
    }

}
