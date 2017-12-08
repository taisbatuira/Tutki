package caelum.com.br.tutki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagem = (ImageView) findViewById(R.id.imagem_barras);
        imagem.setImageDrawable(getDrawable(R.drawable.imagem_barras));


        TextView campoPassos = (TextView) findViewById(R.id.main_texto_passos);
        campoPassos.setText(getString(R.string.main_passo_a_passo));

        AppCompatButton botaoIniciarScan = (AppCompatButton) findViewById(R.id.main_botao_iniciar_scan);
        botaoIniciarScan.setText("Iniciar Scan");
        botaoIniciarScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irParaWebview = new Intent(MainActivity.this, ActivityWebViewProduto.class);
                irParaWebview.putExtra("codigoDoProduto", "farofa");
                startActivity(irParaWebview);
            }
        });

    }
}
