package poo.turnes.meuaplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
        Intent intent = getIntent();
        String pegaMsg = intent.getStringExtra("mensagem");
        TextView mostraMsg = (TextView) findViewById(R.id.mostraNome);
        mostraMsg.setText(pegaMsg);
    }
}
