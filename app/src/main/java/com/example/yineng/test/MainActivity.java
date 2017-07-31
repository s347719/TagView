package com.example.yineng.test;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends Activity {



    private TagCloudView tagCloudView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tagCloudView = (TagCloudView) findViewById(R.id.tag);
        ArrayList<Item> webList = new ArrayList<Item>();

        Item item = new Item();
        item.setColorCode(0);
        item.setRealTime(true);
        item.setValidData(true);
        item.setValue("可以的");
        webList.add(item);

        Item item1 = new Item();
        item1.setColorCode(1);
        item1.setRealTime(true);
        item1.setValidData(true);
        item1.setValue("可以的");
        webList.add(item1);

        Item item2 = new Item();
        item2.setColorCode(0);
        item2.setRealTime(false);
        item2.setValidData(true);
        item2.setValue("可以的");
        webList.add(item2);

        Item item3 = new Item();
        item3.setColorCode(0);
        item3.setRealTime(true);
        item3.setValidData(false);
        item3.setValue("可以的");
        webList.add(item3);

        Item item4 = new Item();
        item4.setColorCode(1);
        item4.setRealTime(true);
        item4.setValidData(true);
        item4.setValue("可以的");
        webList.add(item4);

        Item item5 = new Item();
        item5.setColorCode(1);
        item5.setRealTime(false);
        item5.setValidData(true);
        item5.setValue("可以的");
        webList.add(item5);

        Item item6 = new Item();
        item6.setColorCode(0);
        item6.setRealTime(true);
        item6.setValidData(false);
        item6.setValue("可以的");
        webList.add(item6);

        tagCloudView.setTags(webList);


    }

}
