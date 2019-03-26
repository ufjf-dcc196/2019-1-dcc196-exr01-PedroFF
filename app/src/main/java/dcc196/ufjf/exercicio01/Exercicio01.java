package dcc196.ufjf.exercicio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exercicio01 extends AppCompatActivity {
    TextView nome_completo;
    TextView primeiro_nome;
    TextView sobrenome;
    Button botao_nome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio01);
        primeiro_nome = findViewById(R.id.nome_usuario);
        sobrenome = findViewById(R.id.sobrenome_usuario);
        nome_completo = findViewById(R.id.nome_completo);
        botao_nome = findViewById(R.id.botao_nome);

        botao_nome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome_completo.setText(primeiro_nome.getText().toString().concat(' ' + sobrenome.getText().toString()));
            }
        });

    }
}
