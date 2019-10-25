package br.com.etecia.appagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    Button btnSair, btnCad, btnLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inflater inflater = this.btnCad
        if (btnCad.isEnabled()) {
            cadastraUser();
        }
    }

    private void cadastraUser() {}

    public void sairSistema(View view) {
        if (btnSair.isEnabled()) {
            System.exit(0);
        }
    }

}
