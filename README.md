# Wisata Tempat Minat Khusus di Kabupaten Nganjuk

##  Tentang Aplikasi
  Wisata Minat Khusus Nganjuk adalah aplikasi Android yang dibuat menggunakan Android Studio. Aplikasi ini dibuat untuk membantu pengguna mencari informasi tentang beberapa tempat wisata di Kabupaten Nganjuk.
  Pengguna dapat melihat daftar wisata berdasarkan kategori, memilih minat wisata, mendapatkan rekomendasi, melihat informasi detail wisata, serta membuka lokasi wisata melalui Google Maps.
  Project ini dibuat sebagai bagian dari pembelajaran dan pengembangan aplikasi Android.

##  Fitur Aplikasi
  Beberapa fitur yang tersedia dalam aplikasi ini adalah:

### 1. Kategori Wisata
  Pengguna dapat memilih kategori wisata untuk mempermudah pencarian.
  Kategori yang tersedia:
  * Semua
  * Air Terjun
  * Candi
  Setelah kategori dipilih, daftar wisata akan menampilkan tempat yang sesuai dengan kategori tersebut.

### 2. Daftar Wisata
  Aplikasi menampilkan beberapa tempat wisata di Nganjuk, seperti:
  * Air Terjun Roro Kuning
  * Air Terjun Sedudo
  * Air Terjun Singokromo
  * Candi Lor
  * Candi Ngetos
  Pengguna dapat memilih salah satu wisata dari daftar untuk melihat informasi lebih lanjut.

### 3. Rekomendasi Berdasarkan Minat
  Pengguna dapat memilih minat wisata, antara lain:
  * Alam
  * Sejarah
  * Budaya
  Aplikasi akan memberikan rekomendasi wisata berdasarkan minat yang dipilih oleh pengguna.

### 4. Detail Wisata
  Setiap tempat wisata memiliki halaman detail yang berisi informasi seperti:
  
  * Nama wisata
  * Foto wisata
  * Cerita singkat
  * Waktu atau informasi keramat
  * Jam operasional
  * Harga tiket
  * Aturan di lokasi wisata

### 5. Lokasi Wisata
  Pengguna dapat membuka lokasi wisata menggunakan Google Maps melalui tombol Lihat Lokasi.
  Aplikasi menggunakan Intent untuk membuka aplikasi Google Maps atau browser yang tersedia di perangkat pengguna.

### 6. Zoom Foto
  Foto wisata dapat diperbesar atau diperkecil agar pengguna dapat melihat gambar dengan lebih jelas.

### 7. Fitur Tambahan
  Project ini juga terus dikembangkan dengan beberapa fitur tambahan untuk membuat aplikasi lebih mudah digunakan.

# 🛠️ Teknologi yang Digunakan

  Aplikasi ini dibuat menggunakan:
  * Android Studio
  * Java
  * XML
  * Android SDK
  * Gradle
  * Git
  * GitHub
  * Google Maps melalui Intent

#  Struktur Project
Berikut gambaran sederhana struktur project:

WisataMinatKhususNganjuk
│
├── app
│   ├── src
│   │   └── main
│   │       ├── java
│   │       │   └── MainActivity.java
│   │       │   └── DetailActivity.java
│   │       │
│   │       ├── res
│   │       │   ├── drawable
│   │       │   ├── layout
│   │       │   │   ├── activity_main.xml
│   │       │   │   ├── activity_detail.xml
│   │       │   │   └── item_wisata.xml
│   │       │   │
│   │       │   ├── mipmap
│   │       │   └── values
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   └── build.gradle
│
├── gradle
│
├── README.md
├── build.gradle
├── settings.gradle
├── gradle.properties
├── gradlew
└── gradlew.bat

#  Alur Aplikasi
Secara sederhana, alur penggunaan aplikasi adalah sebagai berikut:

Mulai
  ↓
Buka Aplikasi
  ↓
Halaman Utama
  ↓
Pilih Kategori atau Minat
  ↓
Daftar / Rekomendasi Wisata Ditampilkan
  ↓
Pilih Salah Satu Wisata
  ↓
Pilih Detail atau Lokasi
  ↓
Tampilkan Detail / Buka Google Maps
  ↓
Selesai

#  Cara Menjalankan Project
  Jika ingin menjalankan project ini di komputer sendiri, ikuti langkah berikut.

### 1. Clone Repository
  Buka Terminal atau Git Bash, lalu jalankan:
  git clone https://github.com/USERNAME/wisata-minat-khusus-nganjuk.git
  Ganti USERNAME dengan username GitHub pemilik repository.

### 2. Buka Project
  Buka Android Studio, lalu pilih:
  File → Open
  Pilih folder project WisataMinatKhususNganjuk.

### 3. Tunggu Gradle Sync
  Setelah project dibuka, tunggu proses Gradle Sync selesai.
  Pastikan Android SDK yang dibutuhkan sudah tersedia.

### 4. Jalankan Aplikasi
  Hubungkan HP Android menggunakan USB debugging atau gunakan Emulator.
  Setelah itu klik tombol:
  ▶ Run
  Aplikasi akan dijalankan di perangkat yang dipilih.

#  Cara Deploy Project ke GitHub
  Berikut langkah yang digunakan untuk mengupload project dari Android Studio ke GitHub.

## 1. Membuat Repository di GitHub
  Masuk ke GitHub, kemudian:
  1. Klik tombol New Repository
  2. Masukkan nama repository
      Contoh:
      wisata-minat-khusus-nganjuk
  3. Pilih Public jika repository ingin dapat dilihat oleh orang lain
  4. Klik Create Repository

## 2. Mengaktifkan Git di Android Studio
  Di Android Studio, aktifkan Git melalui:
  VCS → Enable Version Control Integration
  Kemudian pilih:
  Git
  Setelah itu project sudah terhubung dengan sistem Git.

## 3. Melakukan Commit
  Pilih menu:
  Git → Commit
  atau gunakan shortcut:
  Ctrl + K
  Pilih file project yang ingin dimasukkan ke Git.
  
  File utama seperti berikut dapat diikutkan:
  app
  gradle
  build.gradle
  settings.gradle
  gradle.properties
  gradlew
  gradlew.bat
  README.md
  
  File konfigurasi lokal seperti folder .idea tidak perlu menjadi fokus utama untuk diupload.
  Masukkan pesan commit, misalnya:
  Initial commit - Wisata Minat Khusus Nganjuk
  Kemudian klik:
  Commit

## 4. Share Project ke GitHub
  Setelah commit berhasil, pilih:
  Git → GitHub → Share Project on GitHub
  Jika belum login, login terlebih dahulu menggunakan akun GitHub.
  Masukkan nama repository:
  wisata-minat-khusus-nganjuk
  Kemudian klik:
  Share
## 5. Push Perubahan
  Jika perubahan belum otomatis masuk ke GitHub, lakukan:
  Git → Push
  atau gunakan shortcut:
  Ctrl + Shift + K
  Kemudian klik:
  Push
  Setelah proses selesai, project dapat dilihat melalui repository GitHub.

#  Tampilan Aplikasi
  Bagian ini dapat digunakan untuk menambahkan screenshot aplikasi.
  Contohnya:
    Demo:
    https://drive.google.com/file/d/13M1SfIdl_HMkII6MH3y5xLwwaZUdnqq8/view?usp=sharing
#  Tujuan Project
  Aplikasi ini dibuat dengan tujuan:
  * Memberikan informasi wisata di Kabupaten Nganjuk.
  * Mempermudah pengguna mencari tempat wisata.
  * Membantu pengguna memilih wisata berdasarkan minat.
  * Memberikan informasi detail mengenai tempat wisata.
  * Mempermudah pengguna menemukan lokasi wisata melalui Google Maps.
  * Menjadi media pembelajaran dalam pembuatan aplikasi Android menggunakan Android Studio.

# Detail Project
  Project ini dibuat oleh:
  Project: Wisata Minat Khusus Nganjuk
  Platform:Android
  Bahasa Pemrograman: Java
  IDE: Android Studio

#  Catatan
  Project ini dibuat untuk keperluan pembelajaran dan pengembangan aplikasi Android.
