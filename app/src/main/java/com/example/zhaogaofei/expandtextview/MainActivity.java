package com.example.zhaogaofei.expandtextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String CONTENT = "你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好";
    private static final String CONTENTS = "你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好你好";
    private static final String CONTENTSS = "NineOldAndroids is deprecated. No new development will be taking place. Existing versions will (of course) continue to function. New applications should use minSdkVersion=\"14\" or higher which has access to the platform animation APIs.\n" +
            "\n" +
            "Thanks for all your support!";

    private ListView listView;
    private ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.list_view);

    }

    private void initData() {
        adapter = new ListViewAdapter();
        listView.setAdapter(adapter);
        adapter.setData(setData());
    }

    private List<String> setData() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (i % 3 == 0) {
                list.add(CONTENT);
            } else if (i % 3 == 1) {
                list.add(CONTENTS);
            } else {
                list.add(CONTENTSS);
            }
        }
        return list;
    }
}
