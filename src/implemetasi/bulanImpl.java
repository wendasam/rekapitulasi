/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implemetasi;

import Dao.bulanDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bulanEntity;

/**
 *
 * @author asus
 */
public class bulanImpl implements bulanDao {

    private final Connection connection;

    public bulanImpl(Connection conn) {
        this.connection = Objects.requireNonNull(conn);
    }

    @Override
    public void saveBulan(bulanEntity bulan) {
        String sql = "INSERT INTO tbBulan(kdBulan,nmBulan,tahun) VALUES (?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, bulan.getKdBulan());
            statement.setString(2, bulan.getNmBulan());
            statement.setInt(3, bulan.getTahun());

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
    public void updateBulan(bulanEntity bulan) {
        String sql = "UPDATE tbBulan SET kdbulan=?,nmBulan=? WHERE tahun=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, bulan.getKdBulan());
            statement.setString(2, bulan.getNmBulan());
            statement.setInt(3, bulan.getTahun());
            
            int tambah = statement.executeUpdate();
            if (tambah > 0) {
                JOptionPane.showMessageDialog(null, "Data bulan berhasil diperbaharui!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Data bulan Gagal diperbaharui!", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(alamatImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteBulan(bulanEntity bulan) {
        String sql = "UPDATE tbbulan SET kdBulan=?,nmBulan=?,tahun=? WHERE nip=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, bulan.getKdBulan());
            statement.setString(2, bulan.getNmBulan());
            statement.setInt(3, bulan.getTahun());
            
            int tambah = statement.executeUpdate();
            if (tambah > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil diperbaharui!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Data Gagal diperbaharui!", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(alamatImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<bulanEntity> getBulanAll() {

        return null;
    }

}
