package com.univer.browser;

import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        CookieManager.getInstance().setAcceptCookie(true);
        return true;
    }
}