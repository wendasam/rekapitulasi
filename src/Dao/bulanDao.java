package Dao;

import java.util.List;
import model.bulanEntity;

public interface bulanDao {

    public void saveBulan(bulanEntity bulan);

    public void updateBulan(bulanEntity bulan);

    public void deleteBulan(bulanEntity bulan);

    public List<bulanEntity> getBulanAll();
}
