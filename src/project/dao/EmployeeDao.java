package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project.database.DBConnection;
import project.modal.EmployeeModal;

public class EmployeeDao {

	public static void main(String args[]) {
//select all
		List<EmployeeModal> list = EmployeeDao.retrieveEmployees();
		System.out.println(list.size());
		//select by username
		if(EmployeeDao.retrieveEmployeeByPassword("12345").getEmp_firstname() != null) {
			System.out.println(EmployeeDao.retrieveEmployeeByPassword("12345").getEmp_password()  +" password exists");
			
		}else {
			System.out.println("its ok");
		}
		
		if(EmployeeDao.retrieveEmployeeByUsername("wanfadger").getEmp_firstname() !=null) {
			System.out.println(EmployeeDao.retrieveEmployeeByUsername("wanfadger").getEmp_firstname()+" exists");
		}else {
			System.out.println("ok");
		}
		System.out.println();
		
		//paginated
		List<EmployeeModal> list2 = EmployeeDao.retrieveLimitedEmployees(1, 2);
		System.out.println(list2.size());
		
		
		
	}// end of main

	// add employee
	public static int addEmployee(EmployeeModal employee) {
		int status = 0;
		// get connection
		Connection conn = DBConnection.getConnection();
		// query
		String sql = "INSERT INTO employee(emp_firstname , emp_lastname , emp_username , emp_email , emp_password) VALUES(?,?,?,?,?)";
		// statement
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			// bind params
			pst.setString(1, employee.getEmp_firstname());
			pst.setString(2, employee.getEmp_lastname());
			pst.setString(3, employee.getEmp_username());
			pst.setString(4, employee.getEmp_email());
			pst.setString(5, employee.getEmp_password());
			// run

			status = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}// end of add employee

	public static List<EmployeeModal> retrieveEmployees() {
		List<EmployeeModal> list = new ArrayList<EmployeeModal>();
		/// get connection
		Connection conn = DBConnection.getConnection();
		// query
		String sql = "SELECT * FROM employee";
		// statement
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			// run
			ResultSet rs = pst.executeQuery();
			// set modal
			while (rs.next()) {
				EmployeeModal employee = new EmployeeModal(rs.getString("emp_firstname"), rs.getString("emp_lastname"),
						rs.getString("emp_username"), rs.getString("emp_email"), rs.getString("emp_password"));
				list.add(employee);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}// end of select all

	// employee by id
	public static EmployeeModal retrieveEmployeeById(int id) {
		EmployeeModal employee = null;
		/// get connection
		Connection conn = DBConnection.getConnection();
		// query
		String sql = "SELECT * FROM employee WHERE emp_id=?";
		// statement
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			// bind param
			pst.setInt(1, id);
			// run
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				employee = new EmployeeModal(rs.getInt("emp_id"), rs.getString("emp_firstname"),
						rs.getString("emp_lastname"), rs.getString("emp_username"), rs.getString("emp_email"),
						rs.getString("emp_password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return employee;

	}// end of employee by id

	//checking password
	public static EmployeeModal retrieveEmployeeByPassword(String Password) {
		EmployeeModal employee = null;
		//get connection 
		Connection conn = DBConnection.getConnection();
		//query
		String sql = "SELECT * FROM employee WHERE emp_password=?";
		//statement
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			//bind param
			pst.setString(1, Password);
			//run
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				employee =  new EmployeeModal(rs.getInt("emp_id"), rs.getString("emp_firstname"),
						rs.getString("emp_lastname"), rs.getString("emp_username"), rs.getString("emp_email"),
						rs.getString("emp_password"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
	}//emp of retrieve employee by password
	
	//check username
	public static EmployeeModal retrieveEmployeeByUsername(String username) {
		EmployeeModal employee = null;
		//get connection 
		Connection conn = DBConnection.getConnection();
		//query
		String sql = "SELECT * FROM employee WHERE emp_username=?";
		//statement
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			//biind param
			pst.setString(1, username);
			//run
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				employee =  new EmployeeModal(rs.getInt("emp_id"), rs.getString("emp_firstname"),
						rs.getString("emp_lastname"), rs.getString("emp_username"), rs.getString("emp_email"),
						rs.getString("emp_password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;	
	}
	
	// paginated employees
	public static List<EmployeeModal> retrieveLimitedEmployees(int start, int numperpage) {
		List<EmployeeModal> list = new ArrayList<EmployeeModal>();
		// get connection
		Connection conn = DBConnection.getConnection();
		// offset
		int offset = (start - 1) * numperpage;
		// query
		String sql = "SELECT * FROM employee LIMIT ?,?";
		// statement
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			// bind parameters
			pst.setInt(1, offset);
			pst.setInt(2, numperpage);
			// run
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				EmployeeModal employee = new EmployeeModal(rs.getInt("emp_id"), rs.getString("emp_firstname"),
						rs.getString("emp_lastname"), rs.getString("emp_username"), rs.getString("emp_email"),
						rs.getString("emp_password"));
				list.add(employee);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}//end of limited employees by page

	// delete employee by id
	public static int deleteEmployeeById(int id) {
		int status = 0;
		// get connection
		Connection conn = DBConnection.getConnection();
		// query
		String sql = "DELETE FROM employee WHERE emp_id=?";
		// statement
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			// bind param
			pst.setInt(1, id);
			// run
			status = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}// end of delete by id

	// update by id
	public static int updateEmployeeById(EmployeeModal employee) {
		int status = 0;
		// get connection
		Connection conn = DBConnection.getConnection();
		/// query
		String sql = "UPDATE SET emp_firstname=?,emp_lastname=?,emp_username=?,emp_email=?,emp_password=? WHERE emp_id=?";
		// statement
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			// bind params
			pst.setString(1, employee.getEmp_firstname());
			pst.setString(2, employee.getEmp_lastname());
			pst.setString(3, employee.getEmp_username());
			pst.setString(4, employee.getEmp_email());
			pst.setString(5, employee.getEmp_password());
			pst.setInt(6, employee.getEmp_id());
			// run
			status = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}// end of update by id

}// end of class
