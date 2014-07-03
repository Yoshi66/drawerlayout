package com.drawerlayout.app;

import com.actionbarsherlock.app.SherlockFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class Fragment2 extends SherlockFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2, container, false);
        WebView webview = (WebView) rootView.findViewById(R.id.webview);
        webview.setWebViewClient(new ourWebViewClient());
        webview.loadUrl("https://www.google.as");
        return rootView;
    }

}