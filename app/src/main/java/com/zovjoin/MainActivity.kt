package com.zovjoin
import android.os.Build
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.webview_holder.*

class MainActivity : AppCompatActivity() {

    private var url: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Fabric.with(this, Crashlytics())

        url = "http://t.zovjoin.com/"

        if (Build.VERSION.SDK_INT >= 19) {
            webView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        } else {
            webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }

//        webView.webViewClient = MyWebViewClient()
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
            javaScriptEnabled = true
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

            // включаем поддержку JavaScript
            domStorageEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true

        }


        webView.loadUrl(url)
    }


    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

}
