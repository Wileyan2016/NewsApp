package com.example.aneas.newsapp;

/**
 * Created by Aneas on 11/10/2016.
 */

public class NewsArticle {
    private String mWebTitle;
    private String mSectionName;
    private String mWebUrl;

    public NewsArticle(String webTitle, String sectionName, String webUrl) {
        mWebTitle = webTitle;
        mSectionName = sectionName;
        mWebUrl = webUrl;
    }

    public String getWebTitle() {
        return mWebTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getWebUrl() {
        return mWebUrl;
    }
}
