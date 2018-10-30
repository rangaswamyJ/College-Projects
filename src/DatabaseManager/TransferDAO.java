/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseManager;

import com.ran.jdbc.Connect;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class TransferDAO {
    Connection con;
    float TransLimit;

    public void setTransLimit(float TransLimit) {
        this.TransLimit = TransLimit;
    }
    
    public TransferDAO()
    {
        con = new Connect("test").getConnection();
    }
    
    
    
//    ths method for getting the user information 
//    with all field in Customer object and return
            
            
            
    public ArrayList<Transfer> getTransaction(long AccountNo)
    {
        ArrayList<Transfer> trans = new ArrayList<>();
        Transfer t = new Transfer();
        
        try
        {
            PreparedStatement ps = con.prepareStatement("select * from transaction where AccountNo = ?");
            ps.setLong(1, AccountNo);

            ResultSet st = ps.executeQuery();

            while(st.next())
            {
                t.AccountNo = st.getLong("AccountNo");
                t.Date = st.getString("Date");
                t.Time = st.getString("Time");
                t.Deposit = st.getBoolean("Deposit");
                t.Withdraw = st.getBoolean("Withdraw");
                t.Amount = st.getFloat("Amount");

                boolean add = trans.add(new Transfer(t));
                
//                System.out.println(t.toString());
//                
//                
//                System.out.println("is it added: "+add);

            }
        }catch(Exception e)
        {
            System.out.println("unable to get transaction : "+e);
            
        }
        
        
        
        return trans;
    }
    
    
    

    
    
    
//    this methodd will add new customer and return 
//    the Customer info if Succeed other wise it will return the Null
    
    public Transfer addTransaction(Transfer t)
    {
        
        int rowsEffected;
        String sql = "INSERT INTO `transaction` VALUES (?,?,?,?,?,?)";
        
        try
        {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setLong(1, t.AccountNo);
            ps.setString(2, t.Date);
            ps.setString(3, t.Time);
            ps.setBoolean(4, t.Withdraw);
            ps.setBoolean(5, t.Deposit);
            ps.setFloat(6, t.Amount);

            rowsEffected = ps.executeUpdate();
            
            
            if(rowsEffected < 1)
            {
                t = null;
            }
        }catch(Exception e)
        {
            System.out.println("unable to get transaction : "+e);
            
        }
        
        
            
            
        return t;
    }
    
}
