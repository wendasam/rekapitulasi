package model;

import java.util.Date;

public class pegawaiEntity {

    private String nip;
    private String nama;
    private String pendidikan;
    private String jab;
    private String gol;
    private String dept;
    private String t4Lahir;
    private Date tglLahir;
    private int noJalan;
    private String telp, jk;

    public String getJK() {
        return this.jk;
    }

    public void setJK(String jk) {
        this.jk = jk;
    }

    public String getNIP() {
        return this.nip;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPendidikan() {
        return this.pendidikan;
    }

    public void setPendidikan(String pend) {
        this.pendidikan = pend;
    }

    public String getJabatan() {
        return this.jab;
    }

    public void setJabatan(String jbt) {
        this.jab = jbt;
    }

    public String getGolongan() {
        return this.gol;
    }

    public void setGolongan(String gol) {
        this.gol = gol;
    }

    public String getDepartement() {
        return this.dept;
    }

    public void setDepartement(String dept) {
        this.dept = dept;
    }

    public String getTempatLahir() {
        return this.t4Lahir;
    }

    public void setTempatLahir(String tempatLhr) {
        this.t4Lahir = tempatLhr;
    }

    public Date getTglLahir() {
        return this.tglLahir;
    }

    public void setTglLahir(Date tgl) {
        this.tglLahir = tgl;
    }

    public int getNo_Rumah() {
        return this.noJalan;
    }

    public void setNo_Rumah(int jl) {
        this.noJalan = jl;
    }

    public String getTelepon() {
        return this.telp;
    }

    public void setTelepon(String nope) {
        this.telp = nope;
    }
}
