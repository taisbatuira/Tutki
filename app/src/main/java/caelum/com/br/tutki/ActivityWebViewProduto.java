package caelum.com.br.tutki;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by taisbatuira on 07/12/17.
 */

public class ActivityWebViewProduto extends AppCompatActivity {

    private String codigoDoProduto;
    private WebView webView;
    private static final String URL_DEFAULT = "https://www.google.com.br/search?q=";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_produto);

        Intent intent = getIntent();
        this.codigoDoProduto = intent.getStringExtra("codigoDoProduto");

        String urlDoProduto = URL_DEFAULT + codigoDoProduto;

        webView = (WebView) findViewById(R.id.webview_produto);
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl(urlDoProduto);
    }

}


