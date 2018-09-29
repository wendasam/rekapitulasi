package implemetasi;

import Dao.jumlahDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.jumlahEntity;

public class jumlahImpl implements jumlahDAO {

    private final Connection connection;

    public jumlahImpl(Connection connection) {
        this.connection = Objects.requireNonNull(connection);
    }

    @Override
    public void saveJumlah(jumlahEntity jml) {
        String sql = "INSERT INTO tbjumlah(jHadir,jSakit,jIzin,jTnpKeterangan,jCuti,jLembur, jTugas, nip,tahun, kdBulan, ttlSebulan) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, jml.getJmlHadir());
            statement.setInt(2, jml.getJmlSakit());
            statement.setInt(3, jml.getJmlIzin());
            statement.setInt(4, jml.getJmlTnpKeterangan());
            statement.setInt(5, jml.getJmlCuti());
            statement.setInt(6, jml.getJmlLembur());
            statement.setInt(7, jml.getJmlTugas());
            statement.setString(8, jml.getNip());
            statement.setInt(9, jml.getTahun());
            statement.setInt(10, jml.getKdBulan());
            statement.setInt(11, jml.getTotalBulan());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(jumlahImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateJumlah(jumlahEntity jml) {
        String sql = "UPDATE tbjumlah SET jHadir=?, jSakit=?, jIzin=?, jTnpKeterangan=?, jCuti=?, jLembur=?, jTugas=?, tahun=?, ttlSebulan=?, nip=?,kdbulan=? WHERE noUrut=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, jml.getJmlHadir());
            statement.setInt(2, jml.getJmlSakit());
            statement.setInt(3, jml.getJmlIzin());
            statement.setInt(4, jml.getJmlTnpKeterangan());
            statement.setInt(5, jml.getJmlCuti());
            statement.setInt(6, jml.getJmlLembur());
            statement.setInt(7, jml.getJmlTugas());
            statement.setInt(8, jml.getTahun());
            statement.setInt(9, jml.getTotalBulan());
            statement.setString(10, jml.getNip());
            statement.setInt(11, jml.getKdBulan());
            statement.setInt(12, jml.getNo_Urut());
             

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(jumlahImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteJumlah(jumlahEntity jml) {
        String sql = "DELETE FROM tbjumlah WHERE nip=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, jml.getNip());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(jumlahImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<jumlahEntity> getJumlahAll() {
        String sql = "SELECT * FROM tbjumlah";
        List<jumlahEntity> list = new ArrayList<jumlahEntity>();
        jumlahEntity jml = null;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jml = new jumlahEntity();
                jml.setJmlHadir(rs.getInt(1));
                jml.setJmlSakit(rs.getInt(2));
                jml.setJmlIzin(rs.getInt(3));
                jml.setJmlTnpKeterangan(rs.getInt(4));
                jml.setJmlCuti(rs.getInt(5));
                jml.setJmlLembur(rs.getInt(6));
                jml.setJmlTugas(rs.getInt(7));
                jml.setTotalBulan(rs.getInt(8));
                jml.setNip(rs.getString(9));
                jml.setTahun(rs.getInt(10));
                jml.setKdBulan(rs.getInt(11));
                
                list.add(jml);
                jml = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(jumlahImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
