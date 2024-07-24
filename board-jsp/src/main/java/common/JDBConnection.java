package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBConnection { //데이터베이스 연결관리(1, 2, 5단계)
	//필드-자주사용되는 객체들 생성
	public Connection conn; 
	public Statement statement;
	public PreparedStatement pps;
	public ResultSet rset;
	
	//생성자
	public JDBConnection() {
		try {
			//1단계
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("JDBConnect 생성자 1단계 성공");
			//2단계
			String url = "jdbc:oracle:thin:@192.168.111.102:1521:xe";
			String id = "boardjsp";
			String pw = "1234";
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("JDBConnect 생성자 2단계 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연결 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("connection 연결 실패");
			e.printStackTrace();
		}
	}
	
	//메서드(5단계)
	public void close() {
		try {
			if(rset != null) rset.close();
			if(pps != null) pps.close();
			if(statement != null) statement.close();
			if(conn != null) conn.close();
			System.out.println("JDBConnect 5단계 성공");
		} catch (SQLException e) {
			System.out.println("정상적으로 close() 되지 않았습니다.");
			System.exit(0); //강제종료
			e.printStackTrace();
		}
	}

}
