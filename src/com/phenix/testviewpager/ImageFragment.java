package com.phenix.testviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageFragment extends Fragment{

	public static final int[] DRAW_IMAGE = {R.drawable.cbr1,R.drawable.cbr2,R.drawable.cbr3,R.drawable.cbr4};
	private static final String KEY_INT = "int_key";
	
	public ImageFragment initImage(int index)
	{
		ImageFragment fragment = new ImageFragment();
		Bundle bundle = new Bundle();
		bundle.putInt(KEY_INT, DRAW_IMAGE[index]);
		fragment.setArguments(bundle);
		return fragment;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.e("",""+getArguments().getInt(KEY_INT));
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		
		int draw_id = getArguments().getInt(KEY_INT);
		View view = inflater.inflate(R.layout.layout_image, null);
		ImageView image = (ImageView) view.findViewById(R.id.image_view);
		image.setImageResource(draw_id);
		return view;
	}

}
