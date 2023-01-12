package com.karun.DemoDao;
import java.sql.*;
public class DaoImpl implements DaoInterface
{
	
	Connection con;
	
	DaoImpl(){
	  try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	
	public void patientRegistartion(Patient p) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt=con.prepareStatement("insert into patienttoday values(?,?,?)");
			pstmt.setInt(1,p.getId());
			pstmt.setString(2,p.getName());
			pstmt.setString(3,p.getCity());
			
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("data saved successfully");
			}
			else {
				System.out.println("data is not saved successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showAllPatient() {
		// TODO Auto-generated method stub
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from patienttoday");
			while(rs.next()) {
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"     "+rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public void deletePatientById(int id) {
		// TODO Auto-generated method stub
		
		try {
			Statement st=con.createStatement();
			int i=st.executeUpdate("delete from patienttoday where id='"+id+"'");
			if(i!=0) {
				System.out.println("data deleted successfully");
			}
			else {
				System.out.println("data is not deleted successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updatePatient(Patient p) {
		// TODO Auto-generated method stub
		
		try {
			Statement st=con.createStatement();
			int i=st.executeUpdate("update patienttoday set name='"+p.getName()+"' where id='"+p.getId()+"'");
			if(i!=0) {
				System.out.println("data updated successfully");
			}
			else {
				System.out.println("data is not updated successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
