/**
 * 
 */
package com.ukorjidechi.animalscience;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * @author Ukor
 *
 */
public class Fragment311 extends Fragment {
	public Fragment311(){}
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment311, container, false);
			//Defining webView in fragment311.xml 
			WebView content_webView = (WebView) rootView.findViewById(R.id.content_webView);
			//Loading HTML content into webView
			 content_webView.getSettings().setJavaScriptEnabled(true);
			 content_webView.setWebChromeClient(new WebChromeClient());
			content_webView.loadUrl("file:///android_asset/311.html");
			
			return rootView;
}

}
