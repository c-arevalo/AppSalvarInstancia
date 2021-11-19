package arevalosalazar.cesar.appsalvarinstancia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int valor ;
    TextView tv;
    private final static String VALOR_GUARDADO = "valor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tvNumero);
        if (savedInstanceState != null) {
            valor = savedInstanceState.getInt(VALOR_GUARDADO);
            tv.setText(String.valueOf(valor));
        } else {
            tv.setText(R.string.numero);
        }
    }

    public void onSaveInstanceState(Bundle estado) {
        super.onSaveInstanceState(estado);
        estado.putInt(VALOR_GUARDADO, valor);
    }

    public void SumarUno(View v) {
        valor++;
        tv.setText(String.valueOf(valor));
    }

    public void RestarUno(View v) {
        valor--;
        tv.setText(String.valueOf(valor));
    }


}