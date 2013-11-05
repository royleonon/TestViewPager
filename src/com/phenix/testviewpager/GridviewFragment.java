package com.phenix.testviewpager;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridviewFragment extends Fragment {

	static final String[] numbers = new String[] { 
        "A", "B", "C", "D", "E",
        "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O",
        "P", "Q", "R", "S", "T",
        "U", "V", "W", "X", "Y", "Z"};
	
	public static final Integer[] DRAW_IMAGE = {R.drawable.cbr1,R.drawable.cbr2,R.drawable.cbr3,R.drawable.cbr4};

	
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View fragmentLayout = inflater.inflate(R.layout.layout_gridview,null);
	    GridView gridView1 = (GridView) fragmentLayout.findViewById(R.id.gridView1);
//	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, numbers);
	    gridView1.setAdapter(new ImageAdapter(getActivity()));

	    return fragmentLayout;
	}
	public class ImageAdapter extends BaseAdapter{
		private Context context;
		public ImageAdapter(Context c){
			context = c;
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return DRAW_IMAGE.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView;
			
			imageView = new ImageView(context);
			imageView.setLayoutParams(new GridView.LayoutParams(200,200));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(2, 2, 2, 2);
			imageView.setImageResource(DRAW_IMAGE[position]);
			return imageView;
		}
		
	}
}
