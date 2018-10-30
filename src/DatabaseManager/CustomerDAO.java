/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseManager;

import com.ran.jdbc.Connect;
import java.sql.*;

/**
 *
 * @author User
 */
public class CustomerDAO {
    Connection con;
    
    public CustomerDAO()
    {
        con = new Connect("test").getConnection();
    }
    
    
    
//    ths method for getting the user information 
//    with all field in Customer object and return
            
            
            
    public Customer getCustomer(long AccountNo) throws Exception
    {
        Customer cust = new Customer();
        
        PreparedStatement ps = con.prepareStatement("select * from customer where AccountNo = ?");
        ps.setLong(1, AccountNo);
        
        ResultSet st = ps.executeQuery();
        
        st.next();
        
//        System.out.println(st);
//        System.out.println(st.getLong(1));
        
        cust.AccountNo = st.getLong("AccountNo");
        cust.Key = st.getInt("SecretKey");
        cust.Name = st.getString("Name");
        cust.Address = st.getString("Address");
        cust.MobileNo = st.getLong("MobileNo");
        cust.Amount = st.getFloat("Amount");
        
        ps.close();
        return cust;
    }
    
    
    
//    
//    this method for checking wether the user with given 
//            AccountNo is registered or not
    
    public boolean isCustomerExist(long AccountNo) throws Exception
    {
        boolean val;
       
        PreparedStatement ps = con.prepareStatement("select * from customer where AccountNo = ?");
        ps.setLong(1, AccountNo);
        
        ResultSet st = ps.executeQuery();
        
        val = st.next();
        
        ps.close();
        return val;
    }
    
    
//    this method for Authentication
    
    public boolean isLoginCorrect(long AccountNo,int Key) throws Exception
    {
        boolean val;
       
        PreparedStatement ps = con.prepareStatement("select * from customer where AccountNo = ? and Secretkey = ?");
        ps.setLong(1, AccountNo);
        ps.setInt(2, Key);
        
        ResultSet st = ps.executeQuery();
        
        val = st.next();
        
        ps.close();
        return val;
    }
    
    
    
    
//    this methodd will add new customer and return 
//    the Customer info if Succeed other wise it will return the Null
    
    public Customer addCustomer(Customer cust) throws Exception
    {
        
        
        String sql = "INSERT INTO `customer`(`SecretKey`, `Name`, `Address`, `MobileNo`, `Amount`) VALUES (?,?,?,?,?)";
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setInt(1, cust.Key);
        ps.setString(2, cust.Name);
        ps.setString(3, cust.Address);
        ps.setLong(4, cust.MobileNo);
        ps.setFloat(5, cust.Amount);
        
        int rowsEffected = ps.executeUpdate();
        
        if(rowsEffected < 1)
        {
            cust = null;
        }
          
        ps.close();
            
        return cust;
    }
    
//    to change the amount it helps in transfer the amount
    public boolean changeAmount(float amt,Long AccNo)
    {
        boolean status=true;
        String sql = "UPDATE `customer` SET `Amount`=? WHERE AccountNo=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setFloat(1, amt);
            ps.setLong(2, AccNo);
            
            int rowsEffected = ps.executeUpdate();
        
            if(rowsEffected < 1)
            {
             status = false;
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("unable to Update amount");
        }
        
        return status;
    }
    
}
