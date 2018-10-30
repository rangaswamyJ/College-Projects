/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Security;

import DatabaseManager.Customer;
import DatabaseManager.DatabaseManager;
import GUI.ApplicationManager;
import GUI.Welcome;

/**
 *
 * @author User
 */
public class AppManager {
    
    public static void exit()
    {
        DatabaseManager.cust.setObject(new Customer());
        ApplicationManager.application.loadScene(new Welcome());
    }
    
}
