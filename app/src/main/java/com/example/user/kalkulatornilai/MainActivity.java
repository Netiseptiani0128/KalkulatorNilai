package com.example.user.kalkulatornilai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtnilaiPTS, edtnilaiTugas, edtnilaiPAS;
    Button btnHitung;
    TextView txtnilaiAkhir, txtstatusKelulusan;
    String nilaiPTSString, nilaiTugasString, nilaiPASString;
    Integer nilaiPTSnya, nilaiTugasnya, nilaiPASnya;
    double txt_nilaAkhirnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtnilaiPTS = (EditText) findViewById(R.id.edt_NilaiPTS);
        edtnilaiTugas = (EditText) findViewById(R.id.edt_NilaiTugas);
        edtnilaiPAS = (EditText) findViewById(R.id.edt_NilaiPAS);
        btnHitung= (Button) findViewById(R.id)

        txtnilaiAkhir = (TextView) findViewById(R.id.edt_NilaiPTS);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        txtnilaiAkhir = (TextView) findViewById(R.id.txt_nilaiAkhir);
        txtstatusKelulusan = (TextView) findViewById(R.id.txt_statusKelulusan);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiPTSString = edtnilaiPTS.getText().toString();
                nilaiPTSnya = Integer.parseInt(nilaiPTSString);

                nilaiTugasString = edtnilaiTugas.getText().toString();
                nilaiTugasnya = Integer.parseInt(nilaiTugasString);

                nilaiPASString = edtnilaiPAS.getText().toString();
                nilaiPASnya = Integer.parseInt(nilaiPASString);

                txt_nilaAkhirnya = (0.3 * nilaiPTSnya) + (0.3 * nilaiTugasnya) + (nilaiPASnya);
                txtstatusKelulusan.setText(txtnilaiAkhir.toString());
                if (txt_nilaAkhirnya >= 60) {
                    txtnilaiAkhir.setText("LULUS");
                } else {
                    txtnilaiAkhir.setText("TIDAK LULUS");
                }
            }
        });
    }
}
