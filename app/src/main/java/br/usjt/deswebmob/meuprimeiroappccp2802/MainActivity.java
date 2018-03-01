package br.usjt.deswebmob.meuprimeiroappccp2802;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String MENSAGEM = "br.usjt.deswebmob.meuprimeiroappccp2802.mensagem";//variavel que recebe o valor da view
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText =(EditText) findViewById(R.id.edit_text);
        String mensagem = editText.getText().toString();//pega o valor do campo da view
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(MENSAGEM, mensagem);//atriu o valor do campo para a variavel mensagem
        startActivity(intent);
    }
}
