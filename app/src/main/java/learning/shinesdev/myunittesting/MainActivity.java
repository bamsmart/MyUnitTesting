package learning.shinesdev.myunittesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import learning.shinesdev.myunittesting.model.CuboidModel;
import learning.shinesdev.myunittesting.testing.MainViewModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private MainViewModel mainViewModel;

    EditText txtPanjang;
    EditText txtLebar;
    EditText txtTinggi;
    Button btnVolume;
    Button btnKeliling;
    Button btnLuas;
    TextView lblHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = new MainViewModel(new CuboidModel());

        txtPanjang = findViewById(R.id.txtPanjang);
        txtLebar = findViewById(R.id.txtLebar);
        txtTinggi  = findViewById(R.id.txtTinggi);

        btnVolume = findViewById(R.id.btnHitungVolume);
        btnKeliling = findViewById(R.id.btnHitungKeliling);
        btnLuas = findViewById(R.id.btnHitungLuas);
        lblHasil = findViewById(R.id.lbl_hasil);

        btnVolume.setOnClickListener(this);
        btnKeliling.setOnClickListener(this);
        btnLuas.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String panjang = txtPanjang.getText().toString().trim();
        String lebar = txtLebar.getText().toString().trim();
        String tinggi = txtTinggi.getText().toString().trim();

        double p = Double.parseDouble(panjang);
        double l = Double.parseDouble(lebar);
        double t = Double.parseDouble(tinggi);

        switch (view.getId()){
            case R.id.btnHitungVolume:
                lblHasil.setText( String.valueOf(mainViewModel.getVolume(p,l,t)));
                break;
            case R.id.btnHitungLuas:
                lblHasil.setText(String.valueOf(mainViewModel.getLuas(p,l,t)));
                break;
            case R.id.btnHitungKeliling:
                lblHasil.setText(String.valueOf(mainViewModel.getKeliling(p,l,t)));
                break;
        }
    }
}
