package com.francis.vbaseadapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.francis.vbaseadapter.bean.Bean;
import java.util.List;

/**
 * @author taoc @ Zhihu Inc.
 * @since 10-06-2016
 */

public class MyAdapter extends BaseAdapter {

	private LayoutInflater mInflater;
	private List<Bean> data;

	public MyAdapter(Context context, List<Bean> data) {
		mInflater = LayoutInflater.from(context);
		this.data = data;
	}

	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder holder = null;
		if(convertView == null){
			convertView = mInflater.inflate(R.layout.item_listview, parent, false);
			holder = new ViewHolder();

			holder.mTitle = (TextView) convertView.findViewById(R.id.id_title);
			holder.mDesc = (TextView) convertView.findViewById(R.id.id_desc);
			holder.mTime = (TextView) convertView.findViewById(R.id.id_time);
			holder.mPhone = (TextView) convertView.findViewById(R.id.id_phone);

			convertView.setTag(holder);
		}else {
			holder = (ViewHolder) convertView.getTag();
		}

		Bean bean = data.get(position);

		holder.mTitle.setText(bean.getTitle());
		holder.mDesc.setText(bean.getDesc());
		holder.mTime.setText(bean.getTime());
		holder.mPhone.setText(bean.getPhone());

		return convertView;
	}



	private class ViewHolder{
		TextView mTitle;
		TextView mDesc;
		TextView mTime;
		TextView mPhone;

	}
}
