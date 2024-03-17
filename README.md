# LP5DPBO2024C2
GUI Java

## Kelas Mahasiswa

Kelas `Mahasiswa` adalah representasi dari seorang mahasiswa dalam bahasa pemrograman Java. Kelas ini memiliki atribut-atribut yang merepresentasikan informasi penting tentang seorang mahasiswa seperti NIM, nama, jenis kelamin, dan tempat tinggal. 

### Atribut:
1. `nim` (String): Nomor Induk Mahasiswa, yang merupakan identifikasi unik untuk setiap mahasiswa.
2. `nama` (String): Nama lengkap mahasiswa.
3. `jenisKelamin` (String): Jenis kelamin mahasiswa.
4. `tempatTinggal` (String): Tempat tinggal mahasiswa.

### Metode:
1. **Konstruktor:**
   - `Mahasiswa(String nim, String nama, String jenisKelamin, String tempatTinggal)`: Membuat objek Mahasiswa baru dengan menginisialisasi atribut NIM, nama, jenis kelamin, dan tempat tinggal.

2. **Setter:**
   - `setNim(String nim)`: Mengatur NIM mahasiswa.
   - `setNama(String nama)`: Mengatur nama mahasiswa.
   - `setJenisKelamin(String jenisKelamin)`: Mengatur jenis kelamin mahasiswa.
   - `setTempatTinggal(String tempatTinggal)`: Mengatur tempat tinggal mahasiswa.

3. **Getter:**
   - `getNim()`: Mengambil NIM mahasiswa.
   - `getNama()`: Mengambil nama mahasiswa.
   - `getJenisKelamin()`: Mengambil jenis kelamin mahasiswa.
   - `getTempatTinggal()`: Mengambil tempat tinggal mahasiswa.
## Menu

Kelas `Menu` adalah sebuah JFrame yang digunakan untuk menampilkan GUI (Graphical User Interface) untuk mengelola data mahasiswa. Kelas ini menggunakan komponen-komponen dari Java Swing seperti JTextField, JTable, JButton, JComboBox, dan JRadioButton untuk memungkinkan pengguna menambah, mengedit, dan menghapus data mahasiswa.

### Komponen Utama:
- `mainPanel`: JPanel sebagai panel utama yang berisi seluruh komponen GUI.
- `nimField`: JTextField untuk memasukkan NIM mahasiswa.
- `namaField`: JTextField untuk memasukkan nama mahasiswa.
- `mahasiswaTable`: JTable untuk menampilkan data mahasiswa.
- `addUpdateButton`: JButton untuk menambah atau memperbarui data mahasiswa.
- `cancelButton`: JButton untuk membatalkan operasi yang sedang dilakukan.
- `jenisKelaminComboBox`: JComboBox untuk memilih jenis kelamin mahasiswa.
- `deleteButton`: JButton untuk menghapus data mahasiswa yang dipilih.
- `titleLabel`: JLabel untuk judul menu.
- `nimLabel`: JLabel untuk label NIM.
- `namaLabel`: JLabel untuk label nama.
- `jenisKelaminLabel`: JLabel untuk label jenis kelamin.
- `TempatTinggal`: JLabel untuk label tempat tinggal.
- `kostRadioButton`, `rumahRadioButton`, `asramaRadioButton`: JRadioButton untuk memilih tempat tinggal mahasiswa.

### Metode Utama:
- `Menu()`: Konstruktor untuk menginisialisasi komponen-komponen GUI dan mendefinisikan event listener.
- `main(String[] args)`: Metode utama untuk menjalankan aplikasi dan menampilkan GUI.

### Metode Tambahan:
- `setTable()`: Metode untuk mengatur model tabel dengan data mahasiswa.
- `insertData()`: Metode untuk menambah data mahasiswa ke dalam tabel.
- `updateData()`: Metode untuk memperbarui data mahasiswa yang sudah ada dalam tabel.
- `deleteData()`: Metode untuk menghapus data mahasiswa dari tabel.
- `clearForm()`: Metode untuk membersihkan semua inputan pada form.
- `getSelectedTempatTinggal()`: Metode untuk mendapatkan nilai tempat tinggal yang dipilih dari radio button.
- `populateList()`: Metode untuk mengisi data awal daftar mahasiswa.

## Penggunaan
https://github.com/LegiKuswandi/LP5DPBO2024C2/assets/147142081/31c93cd3-08f0-4022-b9f6-fe3f47ff3c3e
