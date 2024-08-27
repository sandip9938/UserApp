package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegistrationDao {

	public int register(UserBean rb)
	{
		int k=0;
		try {
			
			Connection con = DbConnection.geCon();  // Here Access Database Connection
			PreparedStatement ps=con.prepareStatement("insert into userapp65 values(?,?,?,?,?,?,?)");
			ps.setString(1, rb.getUserid());
			ps.setString(2, rb.getPwd());
			ps.setString(3, rb.getUfn());
			ps.setString(4, rb.getUln());
			ps.setString(5, rb.getUmid());
			ps.setString(6, rb.getUad());
			ps.setLong(7, rb.getUno());
			k = ps.executeUpdate();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return k;
		
	}
}
