package com.drawerlayout.app;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Yoshiki on 7/2/14.
 */
public class ourWebViewClient extends WebViewClient{

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return super.shouldOverrideUrlLoading(view, url);
    }
}
