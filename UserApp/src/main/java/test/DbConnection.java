package test;
import java.sql.*;
public class DbConnection {
private static Connection con;
private DbConnection() {}
static {
	try {
		Class.forName(DbInfo.driver);
		con=DriverManager.getConnection(DbInfo.dburl,DbInfo.uname,DbInfo.upwod);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static Connection geCon()
{
	return con;
}

}
