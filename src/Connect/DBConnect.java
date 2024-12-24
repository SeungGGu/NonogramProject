package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {

	static String driver = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/CHATPROJECT";
	static String uid = "root";
	static String upw = "62815974";
	
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public DBConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, uid, upw);
			stmt = con.createStatement();
			System.out.println("MySQL 연동 성공");
		} catch(Exception e) {
			System.out.println("MySQL 연동 실패 >>" + e.toString());
		}
	}
	public boolean conIDCheck(String inID) {
		boolean check = false;
		try {
			pstmt = con.prepareStatement("SELECT COUNT(*) CNT FROM CHATUSER WHERE C_USERNAME = ?");
			pstmt.setString(1,inID);
			rs = pstmt.executeQuery();
			if(rs.next())
					if (rs.getInt("CNT") > 0)
						check = true;
		} catch (Exception e1) {
			e1.getStackTrace();
		}
		return check;
	}
	
	public void conRegister(String inID, String inPW, String inMAIL, String inNAME, String inColor) {
		
		try {
			pstmt = con.prepareStatement("INSERT INTO CHATUSER VALUES(?,?,?,?,?)");
			pstmt.setString(1,inID);
			pstmt.setString(2,inPW);
			pstmt.setString(3,inMAIL);
			pstmt.setString(4,inNAME);
			pstmt.setString(5,inColor);
		
			int resultQuery = pstmt.executeUpdate();
			if (1 != resultQuery) System.out.println(inID + " 회원가입 실패");
			else System.out.println(inID + " 회원가입 성공");
		
		} catch (Exception eRegister) {
			eRegister.getStackTrace();
		}
	}
	
	public int conLogin(String inID, String inPW) {
		try {
		pstmt = con.prepareStatement("SELECT C_PASSWORD FROM CHATUSER WHERE C_USERNAME = ?");
		pstmt.setString(1, inID);
		rs = pstmt.executeQuery();
		if(rs.next())
			if (rs.getString(1).equals(inPW))
				return 1; // 로그인 성공
			else
				return 0; // 로그인 실패
		return -1; // 아이디 없음
		} catch (Exception eLogin) {
			eLogin.getStackTrace();
		}
		return -2;
	}
	
	public int conIDFind(String inID, String inMail) {
		try {
		pstmt = con.prepareStatement("SELECT C_EMAIL FROM CHATUSER WHERE C_USERNAME = ?");
		pstmt.setString(1, inID);
		rs = pstmt.executeQuery();
		if(rs.next())
			if (rs.getString(1).equals(inMail))
				return 1; // 메일 검증 성공
			else
				return 0; // 메일 검증 실패
		return -1; // 아이디 없음
		} catch (Exception eFind) {
			eFind.getStackTrace();
		}
		return -2;
	}
	
	public void conPWChange(String inID, String inPW) {
		try {
			pstmt = con.prepareStatement("UPDATE CHATUSER SET C_PASSWORD = ? WHERE C_USERNAME = ?");
			pstmt.setString(1, inPW);
			pstmt.setString(2, inID);
			int rs = pstmt.executeUpdate();
			if(rs > 0) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}
		} catch (Exception ePChange) {
			ePChange.getStackTrace();
		}
	}
	public void conColorChange(String inID, String inColor) {
		try {
			pstmt = con.prepareStatement("UPDATE CHATUSER SET C_COLOR = ? WHERE C_USERNAME = ?");
			pstmt.setString(1, inColor);
			pstmt.setString(2, inID);
			int rs = pstmt.executeUpdate();
			if(rs > 0) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}
		} catch(Exception eCChange) {
			eCChange.getStackTrace();
		}
	}
	
	public String[] conLoadName(String inID) {
		
		String[] nc =  new String[2];
		try {
			pstmt = con.prepareStatement("SELECT * FROM CHATUSER WHERE C_USERNAME = ?");
			pstmt.setString(1, inID);
			rs = pstmt.executeQuery();
			rs.next();
			nc[0] = rs.getString(4);
			nc[1] = rs.getString(5);
		} catch (Exception eLoad) {
			eLoad.getStackTrace();
		};
		return nc;
	}
	
	public void conDelete(String inID) {
		try {
			pstmt = con.prepareStatement("DELETE FROM CHATUSER WHERE C_USERNAME = ?");
			pstmt.setString(1, inID);
			pstmt.executeUpdate();
			
		} catch(Exception eDelete) {
			eDelete.getStackTrace();
		}
		
	}
}
