package implemetasi;

import Dao.pegawaiDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.pegawaiEntity;

public class pegawaiImpl implements pegawaiDAO {

    private final Connection connection;

    public pegawaiImpl(Connection connection) {
        this.connection = Objects.requireNonNull(connection);
    }

    @Override
    public void savePegawai(pegawaiEntity pgw) {
        String sql = "INSERT INTO tbpegawai(nip,nama,jk,pendidikan,jab,gol,dept,t4Lahir,tglLahir,telp,noRumah) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, pgw.getNIP());
            statement.setString(2, pgw.getNama());
            statement.setString(3, pgw.getJK());
            statement.setString(4, pgw.getPendidikan());
            statement.setString(5, pgw.getJabatan());
            statement.setString(6, pgw.getGolongan());
            statement.setString(7, pgw.getDepartement());
            statement.setString(8, pgw.getTempatLahir());
            statement.setDate(9, new Date(pgw.getTglLahir().getTime()));
            statement.setString(10, pgw.getTelepon());
            statement.setInt(11, pgw.getNo_Rumah());

            int tambah = statement.executeUpdate();
            if (tambah > 0) {
                JOptionPane.showMessageDialog(null, "Data pegawai berhasil ditambah", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Data pegawai gagal ditambah", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(pegawaiImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updatePegawai(pegawaiEntity pgw) {
        String sql = "UPDATE tbpegawai SET nip=?, nama=?,jk=?,pendidikan=?,jab=?,gol=?,dept=?,t4Lahir=?,tglLahir=?,telp=? WHERE noRumah=? ";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, pgw.getNIP());
            statement.setString(2, pgw.getNama());
            statement.setString(3, pgw.getJK());
            statement.setString(4, pgw.getPendidikan());
            statement.setString(5, pgw.getJabatan());
            statement.setString(6, pgw.getGolongan());
            statement.setString(7, pgw.getDepartement());
            statement.setString(8, pgw.getTempatLahir());
            statement.setDate(9, new Date(pgw.getTglLahir().getTime()));
            statement.setString(10, pgw.getTelepon());
            statement.setInt(11, pgw.getNo_Rumah());

            int ubah = statement.executeUpdate();
            if (ubah > 0) {
                JOptionPane.showMessageDialog(null, "Data pegawai berhasil diperbaharui", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Data pegawai gagal diperbaharui", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(pegawaiImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deletePegawai(pegawaiEntity pgw) {
        String sql = "DELETE FROM tbpegawai WHERE nip=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, pgw.getNIP());

            int hapus = statement.executeUpdate();
            if (hapus > 0) {
                JOptionPane.showMessageDialog(null, "Data pegawai berhasil dihaspus", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Data pegawai gagal dihaspus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(pegawaiImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<pegawaiEntity> getPegawaiAll() {
        String sql = "SELECT * FROM tbpegawai ORDER BY nama ASC";
        List<pegawaiEntity> list = new ArrayList<pegawaiEntity>();
        pegawaiEntity pgw = null;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pgw = new pegawaiEntity();
                pgw.setNIP(rs.getString(1));
                pgw.setNama(rs.getString(2));
                pgw.setJK(rs.getString(3));
                pgw.setTempatLahir(rs.getString(4));
                pgw.setTglLahir(rs.getDate(5));
                pgw.setPendidikan(rs.getString(6));
                pgw.setJabatan(rs.getString(7));
                pgw.setGolongan(rs.getString(8));
                pgw.setDepartement(rs.getString(9));
                pgw.setTelepon(rs.getString(10));
                pgw.setNo_Rumah(rs.getInt(11));

                list.add(pgw);
                pgw = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(pegawaiImpl.class.getName()).log(Level.SEVERE, null, ex);
            //System.out.print("Error : " + ex.getSQLState() +"\n\n"+ ex.getErrorCode());
        }

        return list;
    }

}
