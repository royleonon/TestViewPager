package com.phenix.testviewpager;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragAdapter extends FragmentPagerAdapter {
	
	List<Fragment> fragment;
	
	public FragAdapter(FragmentManager fm,List<Fragment> fragment) {
		super(fm);
		this.fragment = fragment;
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		return fragment.get(position);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fragment.size();
	}

	
}
