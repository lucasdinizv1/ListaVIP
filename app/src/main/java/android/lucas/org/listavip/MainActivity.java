package android.lucas.org.listavip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etPassword, etUsername;
    CheckBox checkSenha;
    Button btLogin;
    TextView tvCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPassword = (EditText) findViewById(R.id.etPassword);
        etUsername = (EditText) findViewById(R.id.etUsername);
        checkSenha = (CheckBox) findViewById(R.id.checkSenha);
        tvCadastrar = (TextView) findViewById(R.id.tvCadastrar);
        btLogin = (Button) findViewById(R.id.btLogin);

        btLogin.setOnClickListener(this);
        tvCadastrar.setOnClickListener(this);
        checkSenha.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btLogin:
                break;

            case R.id.tvCadastrar:
                startActivity(new Intent(this, TelaCadastro.class));
                break;

            case R.id.checkSenha:
                if (checkSenha.isChecked()) {
                    etPassword.setTransformationMethod(null);
                } else {
                    etPassword.setTransformationMethod(new PasswordTransformationMethod());
                }
                break;
        }

    }
}
