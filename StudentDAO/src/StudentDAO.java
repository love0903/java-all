
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/student?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	private static String user="love0903";
	private static String password="z0958007246!";
	static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
	
	public void add(Student student) {
		try(Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement()){
			String sql = String.format("INSERT INTO base(names,sid,addresses,sex)"
					+ "VALUE('%s','%s','%s','%s')", student.getName(),student.getSid(),student.getAddresses()
					,student.getSex());
			stmt.executeUpdate(sql);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Student> getData(){
		List<Student> students = new ArrayList<>();
		try(Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT * FROM base");
			while (rs.next()) {
				students.add(rs.getRow(), null);
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return students;
		
	}

}
