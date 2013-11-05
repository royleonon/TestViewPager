package com.phenix.testviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListviewFragment extends Fragment{
	
	public static final String[] data = new String[]{"Firstname","Lastname","Birthday","Age","Address"};
	
	
	
//	public ListviewFragment initData(int index){
//		ListviewFragment listviewFragment = new ListviewFragment();
//		Bundle bundle = new Bundle();
//		bundle.putString(KEY_INT, data[index]);
//		listviewFragment.setArguments(bundle);
//		return listviewFragment;
//	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
//		int list_id = getArguments().getInt(KEY_INT);
		View fragmentLayout = inflater.inflate(R.layout.layout_listview,null);
	    ListView listView1 = (ListView) fragmentLayout.findViewById(R.id.listView_fragment);
	    ArrayAdapter<String> adpater = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
	    listView1.setAdapter(adpater);

	    return fragmentLayout;
	}
}
