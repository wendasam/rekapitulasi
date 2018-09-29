package Dao;

import java.util.List;
import model.jumlahEntity;

public interface jumlahDAO {

    public void saveJumlah(jumlahEntity jml);

    public void updateJumlah(jumlahEntity jml);

    public void deleteJumlah(jumlahEntity jml);

    public List<jumlahEntity> getJumlahAll();
}
