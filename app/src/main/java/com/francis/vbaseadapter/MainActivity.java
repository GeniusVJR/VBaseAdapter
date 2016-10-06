package com.francis.vbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.francis.vbaseadapter.bean.Bean;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


	private ListView mListView;
	private MyAdapter mAdapter;
	private List<Bean> data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initData();
		initView();
	}

	private void initView() {
		mListView = (ListView) findViewById(R.id.id_listview);
		mListView.setAdapter(mAdapter);
	}

	private void initData() {
		data = new ArrayList<>();
		Bean bean = new Bean("Android新技能Get1", "Android 打造万能的 ListView 和 gridView 万能适配器", "2014-12-12", "10086");
		data.add(bean);
		bean = new Bean("Android新技能Get2", "Android 打造万能的 ListView 和 gridView 万能适配器", "2014-12-12", "10086");
		data.add(bean);
		bean = new Bean("Android新技能Get3", "Android 打造万能的 ListView 和 gridView 万能适配器", "2014-12-12", "10086");
		data.add(bean);
		bean = new Bean("Android新技能Get4", "Android 打造万能的 ListView 和 gridView 万能适配器", "2014-12-12", "10086");
		data.add(bean);
		bean = new Bean("Android新技能Get5", "Android 打造万能的 ListView 和 gridView 万能适配器", "2014-12-12", "10086");
		data.add(bean);
		bean = new Bean("Android新技能Get6", "Android 打造万能的 ListView 和 gridView 万能适配器", "2014-12-12", "10086");
		data.add(bean);
		bean = new Bean("Android新技能Get7", "Android 打造万能的 ListView 和 gridView 万能适配器", "2014-12-12", "10086");
		data.add(bean);
		bean = new Bean("Android新技能Get8", "Android 打造万能的 ListView 和 gridView 万能适配器", "2014-12-12", "10086");
		data.add(bean);
		bean = new Bean("Android新技能Get9", "Android 打造万能的 ListView 和 gridView 万能适配器", "2014-12-12", "10086");
		data.add(bean);

		mAdapter = new MyAdapter(this, data);
	}
}
