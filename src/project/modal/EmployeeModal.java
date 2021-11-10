package project.modal;

public class EmployeeModal {
	private int emp_id;
	
	private String emp_no, emp_firstname, emp_lastname, emp_username, emp_email, emp_password;

	// over loading the consructor
	// default constructor
	public EmployeeModal() {

	}

	// without id and empno
	public EmployeeModal(String firstname, String lastname, String username, String email, String password) {
		this.emp_email = email;
		this.emp_firstname = firstname;
		this.emp_lastname = lastname;
		this.emp_password = password;
		this.emp_username = username;
	}

	// with id
	public EmployeeModal(int id, String firstname, String lastname, String username, String email, String password) {
		this.emp_email = email;
		this.emp_firstname = firstname;
		this.emp_lastname = lastname;
		this.emp_password = password;
		this.emp_username = username;
		this.emp_id = id;
	}

	/**
	 * @return the emp_id
	 */
	public int getEmp_id() {
		return emp_id;
	}

	/**
	 * @param emp_id
	 *            the emp_id to set
	 */
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	/**
	 * @return the emp_no
	 */
	public String getEmp_no() {
		return emp_no;
	}

	/**
	 * @param emp_no
	 *            the emp_no to set
	 */
	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}

	/**
	 * @return the emp_firstname
	 */
	public String getEmp_firstname() {
		return emp_firstname;
	}

	/**
	 * @param emp_firstname
	 *            the emp_firstname to set
	 */
	public void setEmp_firstname(String emp_firstname) {
		this.emp_firstname = emp_firstname;
	}

	/**
	 * @return the emp_lastname
	 */
	public String getEmp_lastname() {
		return emp_lastname;
	}

	/**
	 * @param emp_lastname
	 *            the emp_lastname to set
	 */
	public void setEmp_lastname(String emp_lastname) {
		this.emp_lastname = emp_lastname;
	}

	/**
	 * @return the emp_username
	 */
	public String getEmp_username() {
		return emp_username;
	}

	/**
	 * @param emp_username
	 *            the emp_username to set
	 */
	public void setEmp_username(String emp_username) {
		this.emp_username = emp_username;
	}

	/**
	 * @return the emp_email
	 */
	public String getEmp_email() {
		return emp_email;
	}

	/**
	 * @param emp_email
	 *            the emp_email to set
	 */
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	/**
	 * @return the emp_password
	 */
	public String getEmp_password() {
		return emp_password;
	}

	/**
	 * @param emp_password
	 *            the emp_password to set
	 */
	public void setEmp_password(String emp_password) {
		this.emp_password = emp_password;
	}

}// end of modal class
