package poo.turnes.meuaplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent intent = getIntent();
        String pegaMsg = intent.getStringExtra("mensagem");
        TextView mostraMsg = (TextView) findViewById(R.id.mostraNome);
        mostraMsg.setText(pegaMsg);
    }

    public void enviaNome(View view){
        Intent intent = new Intent(this, TerceiraActivity.class);
        EditText caixa = (EditText) findViewById(R.id.editName);
        String mensagem = caixa.getText().toString();
        intent.putExtra("mensagem", mensagem);
        startActivity(intent);
    }


}
