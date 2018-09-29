package model;

public class bulanEntity {

    private String nmBulan;
    private int kdBulan, tahun;

    public void setKdBulan(int kd) {
        this.kdBulan = kd;
    }

    public int getKdBulan() {
        return this.kdBulan;
    }

    public void setNmBulan(String bln) {
        this.nmBulan = bln;
    }

    public String getNmBulan() {
        return this.nmBulan;
    }

    public void setTahun(int thn) {
        this.tahun = thn;
    }

    public int getTahun() {
        return this.tahun;
    }

}
