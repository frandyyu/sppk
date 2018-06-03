/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import sppkbismillah.Isiberanda;

/**
 *
 * @author Frandy
 */
public class c_Isiberanda {
    Isiberanda views;
    
    public c_Isiberanda() throws SQLException {
        views = new Isiberanda();
        views.setVisible(true);
        


    }
}
