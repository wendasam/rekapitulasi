package Dao;

import java.util.List;
import model.pegawaiEntity;

public interface pegawaiDAO {

    public void savePegawai(pegawaiEntity pgw);

    public void updatePegawai(pegawaiEntity pgw);

    public void deletePegawai(pegawaiEntity pgw);

    public List<pegawaiEntity> getPegawaiAll();
}
