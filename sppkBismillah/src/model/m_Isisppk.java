/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Frandy
 */
public class m_Isisppk extends m_model{
    String query;
    
    public m_Isisppk() throws SQLException{
    super();
}
        public DefaultTableModel getTabel() throws SQLException{
        String[] header = {"Id", "Ketinggian", "pH", "Kelembapan", "Suhu"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from kasus";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[5];
                kolom[0] = rs.getString("id");
                kolom[1] = rs.getString("ketinggian");
                kolom[2] = rs.getString("pH");
                kolom[3] = rs.getString("kelembapan");
                kolom[4] = rs.getString("suhu");
                dtm.addRow(kolom);
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}
}
