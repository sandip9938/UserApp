package test;

import java.sql.*;

public class UpdateProfileDao {
	

	public int update(UserBean ub) {
		 int k = 0;
		try {
			Connection con = DbConnection.geCon();
			PreparedStatement pStatement = con
					.prepareStatement("update userapp65 set address=?,mail=?,phone=? where userid=? and password=?");
			pStatement.setString(4, ub.getUserid());
			pStatement.setString(5, ub.getPwd());
			pStatement.setString(1, ub.getUad());
			pStatement.setString(2, ub.getUmid());
			pStatement.setLong(3, ub.getUno());
			k = pStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;

	}
}
