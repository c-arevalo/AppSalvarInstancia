package arevalosalazar.cesar.appsalvarinstancia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int valor = 0;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tvNumero);
    }

    public void SumarUno(View v){
        valor++;
        tv.setText(String.valueOf(valor));
    }

    public void RestarUno(View v){
        valor--;
        tv.setText(String.valueOf(valor));
    }
}