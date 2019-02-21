package br.com.danielsilvaol.meuprimeiroappccp3anmca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ExibirMensagemActivity extends AppCompatActivity {

    private TextView mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_mensagem);
        Intent oringinIntent = getIntent();
        String msg = oringinIntent.getStringExtra(MainActivity.CHAVE_MSG);
        mensagem = findViewById(R.id.ExibeMsgTextView);
        mensagem.setText(msg);

    }

    public void VoltarPagina(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


}
