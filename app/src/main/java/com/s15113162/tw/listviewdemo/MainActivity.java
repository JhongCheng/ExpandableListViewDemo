package com.s15113162.tw.listviewdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Group> gData = null;
    private ArrayList<ArrayList<Item>> iData = null;
    private ArrayList<Item> lData = null;
    private Context mContext;
    private ExpandableListView exlist_PUBG;
    private MyBaseExpandableListAdapter myAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = MainActivity.this;
        exlist_PUBG = (ExpandableListView) findViewById(R.id.exlist_PUBG);

        //数据准备
        gData = new ArrayList<Group>();
        iData = new ArrayList<ArrayList<Item>>();
        gData.add(new Group("Assault Rifles"));
        gData.add(new Group("SMG's"));
        gData.add(new Group("Rifles"));
        gData.add(new Group("Sniper Rifles"));
        gData.add(new Group("DMRs"));
        gData.add(new Group("LMG's"));
        gData.add(new Group("Shotguns"));
        gData.add(new Group("Bows"));


        //Assault Rifles
        lData = new ArrayList<Item>();
        lData.add(new Item(R.mipmap.akm,"AKM"));
        lData.add(new Item(R.mipmap.aug,"AUG_A3"));
        lData.add(new Item(R.mipmap.m762,"Beryl_M762"));
        lData.add(new Item(R.mipmap.g36c,"G36C"));
        lData.add(new Item(R.mipmap.groza,"Groza"));
        lData.add(new Item(R.mipmap.m16a4,"M16A4"));
        lData.add(new Item(R.mipmap.hk416,"HK416"));
        lData.add(new Item(R.mipmap.mk47mutant,"Mk47Mutant"));
        lData.add(new Item(R.mipmap.qbz95,"QBZ95"));
        lData.add(new Item(R.mipmap.scar,"SCAR-L"));
        iData.add(lData);
        //SMG's
        lData = new ArrayList<Item>();
        lData.add(new Item(R.mipmap.mp5k,"MP5K"));
        lData.add(new Item(R.mipmap.uzi,"Micro_UZI"));
        lData.add(new Item(R.mipmap.pp19,"PP-19_Bizon"));
        lData.add(new Item(R.mipmap.thompson,"Tommy_Gun"));
        lData.add(new Item(R.mipmap.ump,"UMP9"));
        lData.add(new Item(R.mipmap.vector,"Vector"));
        iData.add(lData);
        //Rifles
        lData = new ArrayList<Item>();
        lData.add(new Item(R.mipmap.win94,"Winchester_Model_1894"));
        iData.add(lData);
        //Sniper Rifles
        lData = new ArrayList<Item>();
        lData.add(new Item(R.mipmap.awm,"AWM"));
        lData.add(new Item(R.mipmap.kar98k,"Karabiner_98_Kurz"));
        lData.add(new Item(R.mipmap.m24,"M24"));
        lData.add(new Item(R.mipmap.vss,"VSS_Vintorez"));
        iData.add(lData);
        //DMRs
        lData = new ArrayList<Item>();
        lData.add(new Item(R.mipmap.mini14,"Mini_14"));
        lData.add(new Item(R.mipmap.mk14,"Mk14_EBR"));
        lData.add(new Item(R.mipmap.qbu,"QBU"));
        lData.add(new Item(R.mipmap.sks,"SKS"));
        lData.add(new Item(R.mipmap.slr,"SLR"));
        lData.add(new Item(R.mipmap.vss,"VSS_Vintorez"));
        iData.add(lData);
        //LMG's
        lData = new ArrayList<Item>();
        lData.add(new Item(R.mipmap.dp28,"DP-28"));
        lData.add(new Item(R.mipmap.m249,"M249"));
        iData.add(lData);
        //Shotguns
        lData = new ArrayList<Item>();
        lData.add(new Item(R.mipmap.s12k,"S12K"));
        lData.add(new Item(R.mipmap.s1897,"S1897"));
        lData.add(new Item(R.mipmap.s686,"S686"));
        lData.add(new Item(R.mipmap.sawedoff,"Sawed-off"));
        iData.add(lData);
        //Bows
        lData = new ArrayList<Item>();
        lData.add(new Item(R.mipmap.crossbow,"Crossbow"));
        iData.add(lData);

        myAdapter = new MyBaseExpandableListAdapter(gData,iData,mContext);
        exlist_PUBG.setAdapter(myAdapter);
        //為列表设置点击事件
        exlist_PUBG.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Toast.makeText(mContext, "你點了：" + iData.get(groupPosition).get(childPosition).getiName(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
