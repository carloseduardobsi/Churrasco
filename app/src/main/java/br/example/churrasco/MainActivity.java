package br.example.churrasco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int qtdHomens = 0;
    int qtdMulheres = 0;
    int qtdCriancas = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar seekBarMulheres = (SeekBar) findViewById(R.id.seekBarMulheres);
        seekBarMulheres.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar,  @NonNull int progress, boolean fromUser) {

                TextView textomulheres = (TextView) findViewById(R.id.NumerodeMulheres);
                textomulheres.setText(String.valueOf(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                qtdMulheres = seekBar.getProgress();

            }
        });

        SeekBar seekBarhomens = (SeekBar) findViewById(R.id.seekBarhomens);
        seekBarhomens.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar,  @NonNull int progress, boolean fromUser) {

                TextView textohomens = (TextView) findViewById(R.id.NumerodeHomens);
                textohomens.setText(String.valueOf(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                qtdHomens = seekBar.getProgress();
            }
        });

        SeekBar seekbarCriancas = (SeekBar) findViewById(R.id.seekbarCriancas);
        seekbarCriancas.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, @NonNull int progress, boolean fromUser) {

                TextView textocriancas = (TextView) findViewById(R.id.NumerodeCriancas);
                textocriancas.setText(String.valueOf(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                qtdCriancas = seekBar.getProgress();

            }
        });


    }

    public void Calcular(View view) {
        int QtdeCarne = qtdHomens * 500 + qtdMulheres * 300 + qtdCriancas * 200;
        int QtdeLinguiça = qtdHomens * 450 + qtdMulheres * 250 + qtdCriancas * 200;
        TextView textoCarne = findViewById(R.id.resultadoCarne);
        TextView textolinguica = findViewById(R.id.resultadoLinguca);
        textoCarne.setText(String.valueOf(QtdeCarne/1000)+"Kg");
        textolinguica.setText(String.valueOf(QtdeLinguiça/1000)+"Kg");


    }

}

