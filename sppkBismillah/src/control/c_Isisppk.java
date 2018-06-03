/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import model.m_Isisppk;
import view.Isisppk;

/**
 *
 * @author Frandy
 */
public class c_Isisppk {
    Isisppk views;
    m_Isisppk models;
    
    public c_Isisppk() throws SQLException {
        views = new Isisppk();
        views.setVisible(true);
        views.get_id_kasus_tf().setEnabled(false);
        views.get_tabel_kasus().setModel(models.getTabel());
        


    }

}
