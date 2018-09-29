package Dao;

import java.util.List;
import model.alamatEntity;

public interface alamatDao {

    public void saveAlamat(alamatEntity alamat);

    public void updateAlamat(alamatEntity alamat);

    public void deleteAlamat(alamatEntity alamat);

    public List<alamatEntity> getAlamatAll();
}
