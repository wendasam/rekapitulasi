package model;

public class jumlahEntity {

    private int Tahun, kdbulan, kdJumlah, jmlHadir, jmlSakit, jmlIzin, jmlTnpKeterangan, jmlCuti, jmlTugas, jmlLembur, noUrut, ttlBulan;
    private String bulan, nip;

    public void setTahun(int thn) {
        this.Tahun = thn;
    }

    public int getTahun() {
        return this.Tahun;
    }

    public void setKdBulan(int kd) {
        this.kdbulan = kd;
    }

    public int getKdBulan() {
        return this.kdbulan;
    }

    public int getIDJumlah() {
        return this.kdJumlah;
    }

    public void setIDJumlah(int kdJumlah) {
        this.kdJumlah = kdJumlah;
    }

    public int getJmlHadir() {
        return this.jmlHadir;
    }

    public void setJmlHadir(int jmlHadir) {
        this.jmlHadir = jmlHadir;
    }

    public int getJmlSakit() {
        return this.jmlSakit;
    }

    public void setJmlSakit(int sakit) {
        this.jmlSakit = sakit;
    }

    public int getJmlIzin() {
        return this.jmlIzin;
    }

    public void setJmlIzin(int izin) {
        this.jmlIzin = izin;
    }

    public int getJmlTnpKeterangan() {
        return this.jmlTnpKeterangan;
    }

    public void setJmlTnpKeterangan(int jmlTnpKeterangan) {
        this.jmlTnpKeterangan = jmlTnpKeterangan;
    }

    public int getJmlCuti() {
        return this.jmlCuti;
    }

    public void setJmlCuti(int cuti) {
        this.jmlCuti = cuti;
    }

    public int getJmlTugas() {
        return this.jmlTugas;
    }

    public void setJmlTugas(int tugas) {
        this.jmlTugas = tugas;
    }

    public int getJmlLembur() {
        return this.jmlLembur;
    }

    public void setJmlLembur(int lembur) {
        this.jmlLembur = lembur;
    }

    public int getNo_Urut() {
        return this.noUrut;
    }

    public void setNo_Urut(int no) {
        this.noUrut = no;
    }

    public String getBulan() {
        return this.bulan;
    }

    public void setBulan(String bln) {
        this.bulan = bln;
    }

    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getTotalBulan() {
        return this.ttlBulan;
    }

    public void setTotalBulan(int ttl) {
        this.ttlBulan = ttl;
    }
}
