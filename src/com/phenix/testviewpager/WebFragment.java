package com.phenix.testviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebFragment extends Fragment{
	String sUrl = "http://clicknect.com/home.htm";
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.layout_web, null);
		WebView myWebView = (WebView) view.findViewById(R.id.webView1);
//		WebSettings webSettings = myWebView.getSettings();
//		webSettings.setJavaScriptEnabled(true);
		myWebView.loadUrl(sUrl);
		return view;
	}
}
