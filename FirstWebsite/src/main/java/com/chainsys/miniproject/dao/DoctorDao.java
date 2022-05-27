package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.miniproject.pojo.Doctor;

public class DoctorDao {

	private static Connection getConnection() {
		String drivername = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "8122444543aA";
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

	public static int insertPatientName(Doctor newDoc) {
		String insertquery = "insert into doctor (PATIENT_ID,PATIENT_NAME,DOB,SPECIALITY,CITY,PHONE_NO,STANDARD_FEES)values (?,?,?,?,?,?,?)";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(insertquery);
			ps.setInt(1, newDoc.getDoctorId());
			ps.setString(2, newDoc.getDoctorName());
			ps.setDate(3, convertTosqlDate(newDoc.getDob()));
			ps.setString(4, newDoc.getSpeciality());
			ps.setString(5, newDoc.getCity());
			ps.setLong(6, newDoc.getPhoneNo());
			ps.setInt(7, newDoc.getStandardFees());
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public static int deletePatientID(int id) {
		String deletequery = "delete from doctor where PATIENT_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;

		try {
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setInt(1, id);
			ps.executeUpdate();
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

	// for updating all the columns of the table
	public static int updateDoctor(Doctor newdoc) {
        String updatequery = "update doctor set PATIENT_NAME=?,DOB=?,SPECIALITY=?,CITY=?,PHONE_NO=?,STANDARD_FEES=? where PATIENT_ID=?";
        Connection con = null;
        int rows = 0;
        PreparedStatement ps = null;
        try {
            con = getConnection();
            ps = con.prepareStatement(updatequery);
            ps.setInt(7, newdoc.getDoctorId());
            ps.setString(1, newdoc.getDoctorName());
            ps.setDate(2, convertTosqlDate(newdoc.getDob()));
            ps.setString(3, newdoc.getSpeciality());
            // convert java.util.Date to java.sql.date
            ps.setString(4, newdoc.getCity());
            ps.setLong(5, newdoc.getPhoneNo());
            ps.setInt(6, newdoc.getStandardFees());
            ps.executeUpdate();
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
	public static Doctor getDoctorById(int id) {
		Doctor doct = null;
		String selectquery = "select PATIENT_ID,PATIENT_NAME,DOB,SPECIALITY,CITY,PHONE_NO,STANDARD_FEES from doctor where PATIENT_ID = ? ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			doct = new Doctor();
			if (rs.next()) {
				doct.setDoctorId(rs.getInt(1));
				doct.setDoctorName(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doct.setDob(date);
				doct.setSpeciality(rs.getString(4));
				// why getTime method used ok now clear
				// date retrieved from the database will be of type java.sql.Date
				// (rs.getDate(5))
				// emp.setHire_date requires date of type java.util.Date
				// so we are converting sql Date to util Date
				// the constructor of java.util.Date requires a long value
				// so we use the getTime() which returns the sql date as a long value.
				// ok sir
				doct.setCity(rs.getString(5));
				doct.setPhoneNo(rs.getLong(6));
				doct.setStandardFees(rs.getInt(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		return doct;
	}
	 public static List<Doctor> getAllDoctor() {
	        List<Doctor> listOfDoctors = new ArrayList<Doctor>();
	        Doctor doc = null;
	        String selectquery = "select PATIENT_ID,PATIENT_NAME,DOB,SPECIALITY,CITY,PHONE_NO,STANDARD_FEES  from Doctor";
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        try {
	            con = getConnection();
	            ps = con.prepareStatement(selectquery);
	            rs = ps.executeQuery();
	            while (rs.next()) {
	                doc = new Doctor();
	                doc.setDoctorId(rs.getInt(1));
	                doc.setDoctorName(rs.getString(2));
	                java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
	                doc.setDob(date);
	                doc.setSpeciality(rs.getString(4));
	                doc.setCity(rs.getString(5));
	                doc.setPhoneNo(rs.getLong(6));
	                doc.setStandardFees(rs.getInt(7));
	                listOfDoctors.add(doc);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
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
