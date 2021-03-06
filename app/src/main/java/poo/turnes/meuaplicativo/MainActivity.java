package poo.turnes.meuaplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void olaNome(View view){
        Intent intent = new Intent(this, SegundaActivity.class);
        EditText caixa = (EditText) findViewById(R.id.eTNome);
        String mensagem = caixa.getText().toString();

        TextView ola = (TextView) findViewById(R.id.textViewOla);
        ola.setText(mensagem);

        intent.putExtra("mensagem", mensagem);

        startActivity(intent);

    }
}
