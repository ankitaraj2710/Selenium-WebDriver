import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class jdbconnection {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
//code to connect mysql and ecclipse
		String host ="localhost";
		String port = "3306";
	java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/QAsql","root", "Ankita2710");
	//Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root", "root");

    Statement st = (Statement) con.createStatement();
	ResultSet rs = st.executeQuery("select * from EmployeeInfo where Location = 'Brampton'");
	while(rs.next()) {
		System.out.println(rs.getString("Location"));
	}
	}

}
