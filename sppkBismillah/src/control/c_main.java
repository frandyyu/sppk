/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.main;

/**
 *
 * @author Frandy
 */
public class c_main {
     main views;
    
    public c_main() throws SQLException {
        views = new main();
        views.setVisible(true);
        
        views.getberanda_btn().addActionListener(new Klikberanda());
        views.getsppk_btn().addActionListener(new Kliksppk());


    }

    private class Kliksppk implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            views.dispose();
            try {
                new c_Isisppk();
            } catch (SQLException ex) {
                Logger.getLogger(c_main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class Klikberanda implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            views.dispose();
            try {
                new c_Isiberanda();
            } catch (SQLException ex) {
                Logger.getLogger(c_main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
