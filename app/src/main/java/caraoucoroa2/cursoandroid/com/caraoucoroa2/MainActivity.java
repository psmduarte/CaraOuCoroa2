package caraoucoroa2.cursoandroid.com.caraoucoroa2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaojogar;
    private String[] opcao = {"cara","coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaojogar = findViewById(R.id.botaojogarId);
        botaojogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(2);
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("opcao", opcao[numeroAleatorio]);

                startActivity(intent);
            }
        });

    }
}
