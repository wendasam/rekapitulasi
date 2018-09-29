package koneksi;

import Dao.alamatDao;
import Dao.bulanDao;
import Dao.jumlahDAO;
import Dao.pegawaiDAO;

import implemetasi.alamatImpl;
import implemetasi.jumlahImpl;
import implemetasi.pegawaiImpl;

import com.mysql.jdbc.Driver;
import implemetasi.bulanImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class dbKoneksi {

    private static Connection connection;
    private static PreparedStatement pst;

    private static alamatDao absenDao;
    private static bulanDao bulanDao;
    private static jumlahDAO jumlahDao;
    private static pegawaiDAO pegawaiDao;

    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Statement st;

    public dbKoneksi() {
       
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                DriverManager.registerDriver(new Driver());
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbabsensi", "root", "root");
                pst = connection.prepareStatement("SET FOREIGN_KEY_CHECKS=0");
                pst.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(dbKoneksi.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return connection;
    }

    public static alamatDao getAlamatDao() {
        if (absenDao == null) {
            absenDao = new alamatImpl(getConnection());
        }
        return absenDao;
    }

    public static jumlahDAO getJumlahDao() {
        if (jumlahDao == null) {
            jumlahDao = new jumlahImpl(getConnection());
        }
        return jumlahDao;
    }

    public static pegawaiDAO getPegawaiDao() {
        if (pegawaiDao == null) {
            pegawaiDao = new pegawaiImpl(getConnection());
        }
        return pegawaiDao;
    }

    public static bulanDao getBulanDao() {
        if (bulanDao == null) {
            bulanDao = new bulanImpl(getConnection());
        }
        return bulanDao;
    }

    // bind data nip ke jComboBox absensi data
    public static void bindNIP_toAbsensi(JComboBox cbNip) {
        try {
            connection = getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT `nip` FROM `tbpegawai` ORDER BY nip ASC");
            while (rs.next()) {
                cbNip.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(dbKoneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void bindKd_Bulan(JComboBox kdBln) {
        try {
            connection = getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT kdBulan FROM tbbulan GROUP BY kdBulan");
            while (rs.next()) {
                kdBln.addItem(rs.getString("kdBulan"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(dbKoneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void bindNm_BulantoJumlah(JComboBox kdBln, JTextField cbBln) {
        try {
            String bln = kdBln.getSelectedItem().toString();
            connection = getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT nmBulan FROM tbBulan  WHERE tbBulan.`kdBulan` LIKE '" + bln + "'");
            while (rs.next()) {
                cbBln.setText(rs.getString("nmBulan"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(dbKoneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void bindNIPtoLihat(JComboBox cbNIP) {
        try {
            connection = getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT * FROM `tbpegawai`");
            while (rs.next()) {
                cbNIP.addItem(rs.getString("nip"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(dbKoneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
