package caraoucoroa2.cursoandroid.com.caraoucoroa2;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView botaovoltar;
    private  ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imagem = findViewById(R.id.moedaId);
        botaovoltar = findViewById(R.id.botaoVoltarId);

        Bundle extra =getIntent().getExtras();
        if(extra != null){

            String opcaoEscolhida = extra.getString("opcao");
            if(opcaoEscolhida.equals("coroa")){
                imagem.setImageDrawable(ContextCompat.getDrawable(DetalheActivity.this,R.drawable.moeda_coroa));
            }else{
                imagem.setImageDrawable(ContextCompat.getDrawable(DetalheActivity.this,R.drawable.moeda_cara));
            }

        }

        botaovoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetalheActivity.this,MainActivity.class));
            }
        });
    }
}
