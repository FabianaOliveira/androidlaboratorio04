package com.example.fabiana.laboratorio04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botaoOk;
    private Button botaoLimpar;
    private EditText usuarioEditText;
    private EditText senhaEditText;
    private TextView resultadoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioEditText = (EditText) findViewById(R.id.usuarioEditText);
        senhaEditText = (EditText)findViewById(R.id.senhaEditText);
        resultadoTextView = (TextView) findViewById(R.id.resultadotextView);

        botaoLimpar = (Button) findViewById(R.id.limparbutton);
        botaoLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limparButtonAction();
            }
        });

        botaoOk = (Button) findViewById(R.id.acessoButton);
        botaoOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okButtonAction();
            }
        });
    }

    private void okButtonAction() {
        String usuarioInserido = usuarioEditText.getText().toString();
        String senhaInserida = senhaEditText.getText().toString();

        if (usuarioInserido.equalsIgnoreCase("Fabiana") &&
                senhaInserida.equals(123)){
            resultadoTextView.setText("Acesso OK");
        } else {
            resultadoTextView.setText("Acesso Negado");
        }

    }


    private void limparButtonAction() {
        usuarioEditText.setText(null);
        senhaEditText.setText(null);
        resultadoTextView.setText(null);

    }
}
