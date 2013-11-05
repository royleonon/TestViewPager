package com.phenix.testviewpager;

import java.util.ArrayList;
import java.util.List;

import com.viewpagerindicator.CirclePageIndicator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager);
		List<Fragment> fragment2 = getinitFraagment();
//		FragmentManager fm = getFragmentManager();
		FragAdapter adapter = new FragAdapter(getSupportFragmentManager(), fragment2);
		viewpager.setAdapter(adapter);
		//set Limit **
		viewpager.setOffscreenPageLimit(fragment2.size());
		
		CirclePageIndicator indicator = (CirclePageIndicator) findViewById(R.id.circle);
		indicator.setViewPager(viewpager);
		
		//test Github
		
		
//		viewpager.setOnPageChangeListener(new OnPageChangeListener() {
//			
//			@Override
//			public void onPageSelected(int arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void onPageScrolled(int arg0, float arg1, int arg2) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void onPageScrollStateChanged(int arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private List<Fragment> getinitFraagment()
	{
		List<Fragment> list_frag = new ArrayList<Fragment>();
		int size = ImageFragment.DRAW_IMAGE.length;
		for(int i = 0 ; i < size ; i++)
		{
			list_frag.add(new ImageFragment().initImage(i));
		}
		list_frag.add(new ListviewFragment());
		list_frag.add(new GridviewFragment());
		list_frag.add(new WebFragment());
		list_frag.add(new MapFragment());
		
		return list_frag;
	}

}
