package rec.com.ahmedmelsherbini.recye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class WebViewC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_c);


        if (getIntent().hasExtra("Web")){

            String str = getIntent().getStringExtra("Web");
            WebView browser = (WebView) findViewById(R.id.webview);
            browser.loadUrl(str);

        }
    }
}
