import java.sql.*;

public class Connectoracle {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String usernamed= "SYSTEM";
		String password="shubham";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,usernamed,password);
		System.out.println("connection created");
		Statement stmt =con.createStatement();
		String u1="update student set Student_name='akshay' where id=3";
		stmt.executeUpdate(u1);
		System.out.println("record updated");
		/*String createQuery="CREATE TABLE STUDENT21(ID NUMBER(2),NAME VARCHAR(10),CITY(10))";
		stmt.executeUpdate(createQuery);
		
		String insertQuery="insert into test(ID,STUDENT_NAME,CITY,SALARY) values(1,'RAHUL,'KHOLAPUR','5000;;)";
		stmt.executeUpdate(insertQuery);
		insertQuery="insert into STUDENT21(ID,STUDENT_NAME,CITY,SALARY) values(2,'SHUBHAM','DUBAI','50000)";
		stmt.executeUpdate(insertQuery);
		insertQuery="insert into STUDENT21(ID,STUDENT_NAME,CITY,SALARY) values (3,'SUKALP','SAWANTWADI','2000')";
		stmt.executeUpdate(insertQuery);
		*/
		
		
		
	ResultSet rs= stmt.executeQuery("SELECT * FROM STUDENT");
		System.out.println("query execution" + rs);
		
		while(rs.next()){
			System.out.println(rs.getString("id") + ":" + rs.getString("student_name") + ":" +  rs.getString("city") + ":" + rs.getString("SALARY"));
			
		
		}
		con.close();
		
		
	

	}

}
