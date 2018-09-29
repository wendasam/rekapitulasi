package model;

public class alamatEntity {

    private int noRumah;
    private String nmJalan, kota,prov;

    public String getKota() {
        return this.kota;
    }

    public void setKota(String kt) {
        this.kota = kt;
    }

    public String getNama_jalan() {
        return this.nmJalan;
    }

    public void setNama_jalan(String jl) {
        this.nmJalan = jl;
    }

    public String getProvinsi() {
        return this.prov;
    }

    public void setPrivinsi(String prov) {
        this.prov = prov;
    }

    public int getNo_Rumah() {
        return this.noRumah;
    }

    public void setNo_Rumah(int no) {
        this.noRumah = no;
    }
}
