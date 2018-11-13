package askall.ca.javatutorials.sqlconnection;
import java.sql.*;

public class MssqlDBSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * "완성되지 않은 것입니다"
		 */
		
		Connection conn = null;
		Statement stmt = null;
		
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionString = "jdbc:sqlserver://182.18.2.1;password=1234";
			try {
				conn = DriverManager.getConnection(connectionString);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt = conn.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ResultSet rs;
			try {
				rs = stmt.executeQuery("select id, name from testinfo");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				while(rs.next()){
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch(ClassNotFoundException ex){
			
		}
	}

}
