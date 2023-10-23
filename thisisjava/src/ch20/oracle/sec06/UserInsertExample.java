package ch20.oracle.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInsertExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			//JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/orcl", 
				"bosang", 
				"wang"
			);	
			
			//매개변수화된 SQL 문 작성
			String sql = "" +
				"INSERT INTO MEMBER_INFO (USER_ID, NAME, USER_PW, USER_AGE, USER_GENDER, USER_PNUM, USER_DATE)" + "VALUES(?, ?, ?, ?, ?, ?, ?)";
			
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			System.out.println("사용자 ID를 입력하시오");
			pstmt.setString(1, scanner.nextLine());
			System.out.println("사용자 이름을 입력하시오");
			pstmt.setString(2, scanner.nextLine());
			System.out.println("사용자 PW을 입력하시오");
			pstmt.setString(3, scanner.nextLine());
			System.out.println("사용자 나이를 입력하시오");
			pstmt.setString(4, scanner.nextLine());
			System.out.println("사용자 성별을 입력하시오");
			pstmt.setString(5, scanner.nextLine());
			System.out.println("사용자 전화번호를 입력하시오");
			pstmt.setString(6, scanner.nextLine());
			System.out.println("사용자 날짜를 입력하시오");
			pstmt.setString(7, scanner.nextLine());
			
			
			//SQL 문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);
			
			//PreparedStatement 닫기
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try { 
					//연결 끊기
					conn.close(); 
				} catch (SQLException e) {}
			}
		}
	}
}