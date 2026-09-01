package com.example;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.wisataminatkhususnganjuk.R;
import android.content.Intent;
import android.net.Uri;
public class DetailActivity extends AppCompatActivity {

    TextView txtNama, txtCerita, txtKeramat, txtJam, txtTiket,txtAturan;
    Button btnMaps;
    String linkMaps = "";
    private ImageView imgWisata;
    private Button btnZoomIn, btnZoomOut;
    private float scale = 1.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        btnMaps = findViewById(R.id.btnMaps);
        txtNama = findViewById(R.id.txtNama);
        txtCerita = findViewById(R.id.txtCerita);
        txtKeramat = findViewById(R.id.txtKeramat);
        txtJam = findViewById(R.id.txtJam);
        txtTiket = findViewById(R.id.txtTiket);
        txtAturan = findViewById(R.id.txtAturan);
        imgWisata = findViewById(R.id.imgWisata);
        btnZoomIn = findViewById(R.id.btnZoomIn);
        btnZoomOut = findViewById(R.id.btnZoomOut);
        String nama = getIntent().getStringExtra("nama");

        if(nama.equals("Roro Kuning")) {
            imgWisata.setImageResource(R.drawable.roro_kuning);
            txtNama.setText("Air Terjun Roro Kuning");

            txtCerita.setText(
                    "Roro Kuning merupakan wisata alam di kaki Gunung Wilis "
                            + "yang terkenal dengan suasana sejuk dan pemandangan alami."
            );

            txtKeramat.setText(
                    "Waktu Keramat : Malam 1 Suro"
            );

            txtJam.setText(
                    "Jam Operasional : 08.00 - 17.00"
            );

            txtTiket.setText(
                    "Harga Tiket : Rp10.000"
            );
            txtAturan.setText(
                    "Aturan Di Lokasi\n"+
                    "1. Menjaga kebersihan wisata\n" +
                            "2. Tidak mandi di area berbahaya\n" +
                            "3. Bersikap sopan selama berkunjung"
            );
            linkMaps = "https://maps.google.com/?q=Roro+Kuning+Nganjuk";
        }
        else if(nama.equals("Candi Lor")) {
            imgWisata.setImageResource(R.drawable.candi_lor);
            txtNama.setText("Candi Lor");

            txtCerita.setText(
                    "Candi Lor adalah peninggalan sejarah Kerajaan Medang "
                            + "yang berada di Kabupaten Nganjuk."
            );

            txtKeramat.setText(
                    "Waktu Keramat : Malam Jumat Legi"
            );

            txtJam.setText(
                    "Jam Operasional : 07.00 - 16.00"
            );

            txtTiket.setText(
                    "Harga Tiket : Rp5.000"

            );
            txtAturan.setText(
                    "Aturan Di Lokasi\n"+
                    "1. Tidak merusak bangunan candi\n" +
                            "2. Menjaga kebersihan area wisata\n" +
                            "3. Tidak berkata kasar di area wisata"
            );
            linkMaps = "https://maps.google.com/?q=Candi+Lor+Nganjuk";
        }
        else if(nama.equals("Sedudo")) {
            imgWisata.setImageResource(R.drawable.sedudo);
            txtNama.setText("Air Terjun Sedudo");

            txtCerita.setText(
                    "Aturan Di Lokasi\n"+
                    "Air Terjun Sedudo merupakan wisata alam terkenal "
                            + "di Kabupaten Nganjuk dengan suasana sejuk "
                            + "dan pemandangan pegunungan."
            );

            txtKeramat.setText(
                    "Waktu Keramat : Bulan Suro"
            );

            txtJam.setText(
                    "Jam Operasional : 08.00 - 17.00"
            );

            txtTiket.setText(
                    "Harga Tiket : Rp15.000"
            );

            txtAturan.setText(
                    "Aturan Di Lokasi\n"+
                    "1. Dilarang membuang sampah sembarangan\n" +
                            "2. Hati-hati saat berada di dekat air terjun\n" +
                            "3. Menjaga sopan santun selama wisata"
            );
            linkMaps = "https://maps.google.com/?q=Air+Terjun+Sedudo+Nganjuk";
        }
        else if(nama.equals("Candi Ngetos")) {
            imgWisata.setImageResource(R.drawable.candi_ngetos);
            txtNama.setText("Candi Ngetos");

            txtCerita.setText(
                    "Aturan Di Lokasi\n"+
                    "Candi Ngetos adalah peninggalan sejarah "
                            + "Kerajaan Majapahit yang berada "
                            + "di Kabupaten Nganjuk."
            );

            txtKeramat.setText(
                    "Waktu Keramat : Malam Jumat Legi"
            );

            txtJam.setText(
                    "Jam Operasional : 07.00 - 16.00"
            );

            txtTiket.setText(
                    "Harga Tiket : Rp5.000"
            );
            txtAturan.setText(
                    "Aturan Di Lokasi\n"+
                            "1. Tidak memanjat bangunan candi\n" +
                            "2. Menjaga ketenangan area wisata\n" +
                            "3. Tidak mencoret bangunan sejarah"
            );
            linkMaps = "https://maps.google.com/?q=Candi+Ngetos+Nganjuk";
        }
        else if(nama.equals("Singokromo")) {
            imgWisata.setImageResource(R.drawable.singokromo);
            txtNama.setText("Wisata Singokromo");

            txtCerita.setText(
                    "Aturan Di Lokasi\n"+
                    "Singokromo merupakan wisata budaya "
                            + "dan tempat tradisi masyarakat "
                            + "di kawasan Gunung Wilis Nganjuk."
            );

            txtKeramat.setText(
                    "Waktu Keramat : Malam Jumat Kliwon"
            );

            txtJam.setText(
                    "Jam Operasional : 08.00 - 18.00"
            );

            txtTiket.setText(
                    "Harga Tiket : Rp10.000"
            );
            txtAturan.setText(
                    "Aturan Di Lokasi\n"+
                            "1. Gunakan pakaian yang sopan\n" +
                            "2. Tidak berenang di area berbahaya\n" +
                            "3. Menjaga kebersihan lingkungan"
            );
            linkMaps = "https://maps.google.com/?q=Air+Terjun+Singokromo+Nganjuk";
        }
        btnMaps.setOnClickListener(v -> {

            Intent intent = new Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(linkMaps)
            );
            startActivity(intent);
        });
        btnZoomIn.setOnClickListener(v -> {

            scale += 0.2f;

            imgWisata.setScaleX(scale);
            imgWisata.setScaleY(scale);

        });

        btnZoomOut.setOnClickListener(v -> {

            if (scale > 0.6f) {
                scale -= 0.2f;
            }

            imgWisata.setScaleX(scale);
            imgWisata.setScaleY(scale);

        });
    }
}