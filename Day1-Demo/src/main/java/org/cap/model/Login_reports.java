package org.cap.model;

public class Login_reports {
	
	public Login_reports(int login_id, int report_id) {
		super();
		this.login_id = login_id;
		this.report_id = report_id;
	}
	public int login_id;
	public int getLogin_id() {
		return login_id;
	}
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}
	public int getReport_id() {
		return report_id;
	}
	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}
	public int report_id;

}
