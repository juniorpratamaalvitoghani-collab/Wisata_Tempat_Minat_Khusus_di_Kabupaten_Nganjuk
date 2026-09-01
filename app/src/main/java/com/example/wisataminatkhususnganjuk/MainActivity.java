package com.example.wisataminatkhususnganjuk;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import com.example.DetailActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerKategori;
    ListView listWisata;
    Button btnDetail,btnMaps;
    String linkMaps = "";
    String selectedWisata = "";
    Button btnRekomendasi;
    Spinner spinnerMinat;
    String[] kategori = {
            "Semua",
            "Air Terjun",
            "Candi"
    };

    String[] airTerjun = {
            "Roro Kuning",
            "Sedudo",
            "Singokromo"
    };

    String[] candi = {
            "Candi Lor",
            "Candi Ngetos"
    };

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerKategori = findViewById(R.id.spinnerKategori);
        spinnerMinat = findViewById(R.id.spinnerMinat);
        listWisata = findViewById(R.id.listWisata);
        btnDetail = findViewById(R.id.btnDetail);
        btnMaps = findViewById(R.id.btnMaps);
        btnRekomendasi = findViewById(R.id.btnRekomendasi);
        btnDetail.setOnClickListener(v -> {

            if (selectedWisata.equals("")) {

                Toast.makeText(
                        MainActivity.this,
                        "Pilih wisata terlebih dahulu",
                        Toast.LENGTH_SHORT
                ).show();

            } else {

                Toast.makeText(
                        MainActivity.this,
                        "Detail wisata: " + selectedWisata,
                        Toast.LENGTH_LONG
                ).show();
            }
        });
        btnMaps.setOnClickListener(v -> {

            Intent intent = new Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(linkMaps)
            );

            startActivity(intent);

        });
        ArrayAdapter<String> adapterKategori =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_item,
                        kategori
                );

        adapterKategori.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );
        spinnerKategori.setAdapter(adapterKategori);
        spinnerKategori.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(
                            AdapterView<?> parent,
                            View view,
                            int position,
                            long id
                    ) {

                        String pilih = kategori[position];

                        String[] dataTampil;

                        if (pilih.equals("Air Terjun")) {
                            dataTampil = airTerjun;

                        } else if (pilih.equals("Candi")) {
                            dataTampil = candi;

                        } else {

                            dataTampil = new String[]{
                                    "Roro Kuning",
                                    "Sedudo",
                                    "Candi Lor",
                                    "Candi Ngetos",
                                    "Singokromo"
                            };
                        }

                        ArrayAdapter<String> adapterWisata =
                                new ArrayAdapter<>(
                                        MainActivity.this,
                                        android.R.layout.simple_list_item_1,
                                        dataTampil
                                );

                        listWisata.setAdapter(adapterWisata);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

        listWisata.setOnItemClickListener(
                (parent, view, position, id) -> {
                    // 1. Simpan objek yang diklik ke variabel selectedWisata
                    selectedWisata = parent.getItemAtPosition(position).toString();

                    // 2. Lakukan pengecekan langsung menggunakan selectedWisata
                    if (selectedWisata.equals("Candi Lor")) {
                        linkMaps = "https://maps.google.com/?q=Candi+Lor+Nganjuk";
                    }
                    else if (selectedWisata.equals("Air Terjun Sedudo") || selectedWisata.equals("Sedudo")) {
                        linkMaps = "https://maps.google.com/?q=Air+Terjun+Sedudo+Nganjuk";
                    }
                    else if (selectedWisata.equals("Air Terjun Roro Kuning") || selectedWisata.equals("Roro Kuning")) {
                        linkMaps = "https://maps.google.com/?q=Roro+Kuning+Nganjuk";
                    }
                    else if (selectedWisata.equals("Air Terjun Singokromo") || selectedWisata.equals("Singokromo")) {
                        linkMaps = "https://maps.google.com/?q=Air+Terjun+Singokromo+Nganjuk";
                    }
                    else if (selectedWisata.equals("Candi Ngetos")) {
                        linkMaps = "https://maps.google.com/?q=Candi+Ngetos+Nganjuk";
                    }

                    // 3. Tampilkan pesan Toast info
                    Toast.makeText(
                            MainActivity.this,
                            "Dipilih: " + selectedWisata,
                            Toast.LENGTH_SHORT
                    ).show();
                });

        btnDetail.setOnClickListener(v -> {

            if (selectedWisata.equals("")) {

                Toast.makeText(
                        MainActivity.this,
                        "Pilih wisata dulu",
                        Toast.LENGTH_SHORT
                ).show();

            } else {

                Intent intent = new Intent(
                        MainActivity.this,
                        DetailActivity.class
                );

                intent.putExtra("nama", selectedWisata);

                startActivity(intent);
            }
        });

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cek apakah user sudah mengklik list wisata atau belum
                if (linkMaps == null || linkMaps.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Silakan pilih tempat wisata dari daftar terlebih dahulu!", Toast.LENGTH_SHORT).show();
                } else {
                    // Membuka Google Maps / Browser HP
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkMaps));
                    startActivity(intent);
                }
            }
        });
        btnRekomendasi.setOnClickListener(v -> {

            String[] rekomendasi = {
                    "Sedudo"
            };

            ArrayAdapter<String> adapterWisata =
                    new ArrayAdapter<>(
                            MainActivity.this,
                            android.R.layout.simple_list_item_1,
                            rekomendasi
                    );

            listWisata.setAdapter(adapterWisata);

            Toast.makeText(
                    MainActivity.this,
                    "Menampilkan wisata terbaik",
                    Toast.LENGTH_SHORT
            ).show();

        });
        String[] minat = {
                "Pilih Minat",
                "Semua Wisata",
                "Alam",
                "Sejarah",
                "Budaya"
        };

        ArrayAdapter<String> adapterMinat =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_item,
                        minat
                );

        adapterMinat.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        spinnerMinat.setAdapter(adapterMinat);

        spinnerMinat.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(
                            AdapterView<?> parent,
                            View view,
                            int position,
                            long id) {

                        String pilihan =
                                spinnerMinat.getSelectedItem().toString();

                        if (pilihan.equals("Alam")) {

                            String[] dataMinat = {
                                    "Sedudo",
                                    "Singokromo",
                                    "Roro Kuning"
                            };

                            ArrayAdapter<String> adapterWisata =
                                    new ArrayAdapter<>(
                                            MainActivity.this,
                                            android.R.layout.simple_list_item_1,
                                            dataMinat
                                    );

                            listWisata.setAdapter(adapterWisata);

                        }
                        else if (pilihan.equals("Sejarah")) {

                            String[] dataMinat = {
                                    "Candi Lor",
                                    "Candi Ngetos"
                            };

                            ArrayAdapter<String> adapterWisata =
                                    new ArrayAdapter<>(
                                            MainActivity.this,
                                            android.R.layout.simple_list_item_1,
                                            dataMinat
                                    );

                            listWisata.setAdapter(adapterWisata);

                        }
                        else if (pilihan.equals("Budaya")) {

                            String[] dataMinat = {
                                    "Roro Kuning"
                            };

                            ArrayAdapter<String> adapterWisata =
                                    new ArrayAdapter<>(
                                            MainActivity.this,
                                            android.R.layout.simple_list_item_1,
                                            dataMinat
                                    );

                            listWisata.setAdapter(adapterWisata);

                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
    }
}