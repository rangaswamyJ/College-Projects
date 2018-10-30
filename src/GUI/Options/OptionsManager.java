/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Options;

import DatabaseManager.Customer;
import DatabaseManager.DatabaseManager;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class OptionsManager {
    
    private static  Customer cust= DatabaseManager.cust;
    
    
//    this will set all the jlabel with corresponding value
    public static void init(JLabel Name,JLabel AccNo,JLabel Amount)
    {
        Name.setText(cust.Name);
        AccNo.setText(String.valueOf(cust.AccountNo));
        Amount.setText(String.valueOf(cust.Amount));
    }
}
