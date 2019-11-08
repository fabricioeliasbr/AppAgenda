package br.com.etecia.appagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSair, btnCad, btnLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void abrirCadastro(View view) {
        Intent intent = new Intent();
        if(btnCad.isEnabled()) {
            switch (view.getId()) {
                case R.id.btnCad:
                    new Intent(MainActivity.this, CadastraActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }

    public void abrirLista(View view) {
        Intent intent = new Intent();
        if(btnLista.isEnabled()) {
            switch (view.getId()) {
                case R.id.btnLista:
                    new Intent(MainActivity.this, ListaActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }

    public void sairSistema(View view) {
        if (btnSair.isEnabled()) {
            System.exit(0);
        }
    }

}
