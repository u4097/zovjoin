package com.zovjoin

import android.os.Bundle
import android.view.KeyEvent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.webview_holder.*

class MainActivity : AppCompatActivity() {

    val SITE_URL = "http://t.zovjoin.com/"


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                view?.loadUrl(request?.url.toString())
                return false
            }

            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return false
            }
        }
*/
        webView.isHorizontalScrollBarEnabled = false

        with(webView.settings) {
            setEnableSmoothTransition(false)
            allowContentAccess = true
            allowFileAccess = true
            allowFileAccessFromFileURLs = true
            allowFileAccessFromFileURLs = true
            blockNetworkImage = false
            blockNetworkLoads = false
            builtInZoomControls = false
            databaseEnabled = true
            defaultTextEncodingName = "UTF-8"
            displayZoomControls = true
            domStorageEnabled = true
            fantasyFontFamily = "fantasy"
            fixedFontFamily = "monospace"
            javaScriptCanOpenWindowsAutomatically = false
            lightTouchEnabled = false
            loadWithOverviewMode = false
            loadsImagesAutomatically = true
            sansSerifFontFamily = "sans-serif"
            savePassword = true
            saveFormData = true
            serifFontFamily = "serif"
            useWideViewPort = false
            setSupportMultipleWindows(false)
            setSupportZoom(true)

            javaScriptEnabled = true
            domStorageEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true

        }


        webView.loadUrl(SITE_URL)
        webView.pauseTimers()
        webView.resumeTimers()
    }


    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

}
