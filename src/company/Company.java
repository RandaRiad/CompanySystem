/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import controls.Table;
import forms.FrmDepartment;
import forms.FrmLogin;
import forms.frmMain;

/**
 *
 * @author dfz6
 */
public class Company {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CreateTools.openForm(new FrmLogin());
       //CreateTools.openForm(new FrmDepartment());
    }
    
}
