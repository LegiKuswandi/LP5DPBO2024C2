public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String tempatTinggal;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String tempatTinggal) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.tempatTinggal = tempatTinggal;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setTempatTinggal(String tempatTinggal) {
        this.tempatTinggal = tempatTinggal;
    }

    public String getTempatTinggal() {
        return tempatTinggal;
    }
}
