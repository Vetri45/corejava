package com.chainsys.miniproject.dao;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	import com.chainsys.miniproject.pojo.Doctor;
	import com.chainsys.miniproject.pojo.Employee;

	public class DoctorDao {
	   public static Connection getConnection() {
		   String drivername = "oracle.jdbc.OracleDriver";
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "Arunps2244#";
			try {
				Class.forName(drivername);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			Connection con = null;
			try {
				con = DriverManager.getConnection(dbUrl, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return con;
	   }
	   private static java.sql.Date convertTosqlDate(java.util.Date date) {
			java.sql.Date sqldate = new java.sql.Date(date.getTime());
			return sqldate;
		}
	   public static int insertDoctor(Doctor newdoc) {
			String insertquery = "insert into Doctor(doctor_id,name,dob,speciality,city,phone_number,std_fees) values (?,?,?,?,?,?,?)";
			Connection con = null;
			int rows =0;
//			int rows ;
			PreparedStatement ps = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(insertquery);
				ps.setInt(1, newdoc.getId());
				ps.setString(2, newdoc.getName());
				// convert java.util.Date to java.sql.date
				ps.setDate(3, convertTosqlDate(newdoc.getDOB()));
				ps.setString(4, newdoc.getSpeciality());
				ps.setString(5,newdoc.getCity());
				ps.setLong(6, newdoc.getPhone_no());
				ps.setFloat(7, newdoc.getStandard_fees());

				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
		}
	   
	   public static int updateDoctor(Doctor newdoc) {
			String updatequery = "update doctor set NAME=?,dob=?,speciality=?,city=?,phone_number=?,std_fees=? where doctor_id=?";//need change 
			Connection con = null;
			int rows =0;
//			int rows ;
			PreparedStatement ps = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(updatequery);
				//ps.setInt(1, newdoc.getDoctor_id());
				ps.setString(1, newdoc.getName());
				// convert java.util.Date to java.sql.date
				ps.setDate(2, convertTosqlDate(newdoc.getDOB()));
				ps.setString(3, newdoc.getSpeciality());
				ps.setString(4,newdoc.getCity());
				ps.setLong(5, newdoc.getPhone_no());
				ps.setFloat(6, newdoc.getStandard_fees());
				ps.setInt(7,newdoc.getId());
				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
		}
	   
	   public static int updateDoctorFirstName(int id,String name) {
			String updatequery = "update doctor set NAME=? where doctor_id=?";
			Connection con = null;
			int rows =0;
//			int rows ;
			PreparedStatement ps = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(updatequery);
				ps.setInt(1,id);
				ps.setString(2,name);
				
				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
		}
	   
	   public static int updateDoctorFees(int id,float fees) {
			String updatequery = "update doctor set std_fees=? where doctor_id=?";
			Connection con = null;
			int rows =0;
//			int rows ;
			PreparedStatement ps = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(updatequery);
				ps.setInt(2,id);
				ps.setFloat(1,fees);
				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
		}
	   
	   public static int deleteDoctor(int id) {
			String deletequery = "delete from doctor where doctor_id=?";
			Connection con = null;
			int rows = 0;
			PreparedStatement ps = null;
		
			try {
				con = getConnection();
				ps = con.prepareStatement(deletequery);
				ps.setInt(1, id);
				rows = ps.executeUpdate();	
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
	   }
	   
	   public static Doctor getDoctorById(int id) {
		    Doctor dr =null;
			String selectquery = "select doctor_id,NAME,dob,speciality,city,phone_number,std_fees from doctor where doctor_id=?";//need change 
			Connection con = null;
			PreparedStatement ps = null;
			 ResultSet rs  = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(selectquery);
				ps.setInt(1, id);
				rs =ps.executeQuery();
				dr = new Doctor();
				 while(rs.next()) {
				dr.setId(rs.getInt(1));
				dr.setName(rs.getString(2));
				// convert java.util.Date to java.sql.date
				dr.setDOB(rs.getDate(3));
				dr.setSpeciality(rs.getString(4));
				dr.setCity(rs.getString(5));
				dr.setPhone_no(rs.getLong(6));
				dr.setStandard_fees(rs.getFloat(7));	
			}} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return dr;
		}
	   
	   public static List<Doctor> getAllDoctor(){
			 List<Doctor> listOfDoctors = new ArrayList<Doctor>();
			 Doctor dr =null;
				String selectquery = "select doctor_id,NAME,dob,speciality,city,phone_number,std_fees from doctor";
				Connection con = null;
				PreparedStatement ps = null;
				 ResultSet rs  = null;
				try {
					con = getConnection();
					ps = con.prepareStatement(selectquery);
					rs =ps.executeQuery();
					
					   while(rs.next()) {
						   dr = new Doctor();
				          dr.setId(rs.getInt(1));
				          dr.setName(rs.getString(2));
				          java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				          dr.setDOB(date);
				          dr.setSpeciality(rs.getString(4));
				          dr.setCity(rs.getString(5));
				          dr.setPhone_no(rs.getLong(6));
				          dr.setStandard_fees(rs.getFloat(7));
				          listOfDoctors.add(dr);
				        }
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						rs.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					try {
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			 return listOfDoctors;
		 }
	}


