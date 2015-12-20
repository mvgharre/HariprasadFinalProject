package com.example.hariprasad.sqliteprojectcrud;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class AccessWeb extends Activity {
    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.access_web);

	webView = (WebView) findViewById(R.id.webView1);
	webView.getSettings().setJavaScriptEnabled(true);
	webView.loadUrl("http://www.google.com/");

    }

}
