package implemetasi;

import Dao.alamatDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.alamatEntity;

public class alamatImpl implements alamatDao {

    private final Connection connection;

    public alamatImpl(Connection connection) {
        this.connection = Objects.requireNonNull(connection);
    }

    @Override
    public void saveAlamat(alamatEntity alamat) {
        String sql = "INSERT INTO tbalamat(noRumah,nmJalan,kota,prov) VALUES (?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, alamat.getNo_Rumah());
            statement.setString(2, alamat.getNama_jalan());
            statement.setString(3, alamat.getKota());
            statement.setString(4, alamat.getProvinsi());

            int tambah = statement.executeUpdate();
            if (tambah > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil ditambah!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Data Gagal ditambah!", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(alamatImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateAlamat(alamatEntity alamat) {
        String sql = "UPDATE tbalamat SET nmJalan=?,kota=?,prov=? WHERE noRumah=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, alamat.getNama_jalan());
            statement.setString(2, alamat.getKota());
            statement.setString(3, alamat.getProvinsi());
            statement.setInt(4, alamat.getNo_Rumah());

            int ubah = statement.executeUpdate();
            if (ubah > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil diperbaharui!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal diperbaharui!", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(alamatImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteAlamat(alamatEntity alamat) {
        String sql = "DELETE FROM tbalamat WHERE fingerprintID=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, alamat.getNo_Rumah());

            int ubah = statement.executeUpdate();
            if (ubah > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus!", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(alamatImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<alamatEntity> getAlamatAll() {
        String sql = "SELECT noRumah,nmJalan,kota,prov FROM tbalamat";
        List<alamatEntity> list = new ArrayList<alamatEntity>();
        alamatEntity alamat = null;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                alamat = new alamatEntity();
                alamat.setNo_Rumah(rs.getInt(1));
                alamat.setNama_jalan(rs.getString(2));
                alamat.setKota(rs.getString(3));
                alamat.setPrivinsi(rs.getString(4));
                
                list.add(alamat);
                alamat = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(alamatImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
