package board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBase {
	private List list = new ArrayList();

	void showList() {
		if ( 0 == list.size() ) {
			System.out.println("게시물이 없습니다.");
		}
		System.out.println("-----------------------------");
		for ( int i = 0 ; i < list.size() ; i++ ) {
			Board board = (Board)list.get(i);
			System.out.print(
					board.getNo()
					+" | "+board.getTitle()
					+" | "+board.getWriter()
					+" | "+board.getDate()
					);
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
	
	void writeBoard() {
		Scanner scanner = new Scanner(System.in);
		Board board = new Board();
		System.out.println("제목을 입력하시오.");
		board.setTitle(scanner.nextLine());
		System.out.println("내용을 입력하시오.");
		board.setContent(scanner.nextLine());
		System.out.println("작성자를 입력하시오.");
		board.setWriter(scanner.nextLine());
		board.setNo(list.size()+1);
		board.setDate(getDate());
		list.add(board);
	}
	
	private String getDate() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
		return dateTime.format(formatter);
	}
	
	void showContent(int bNumber) {
		for ( int i = 0 ; i < list.size() ; i++ ) {
			Board board = (Board)list.get(i);
			if ( board.getNo() == bNumber ) {
				System.out.println("--------------------------");
				System.out.println("번호:"+board.getNo());
				System.out.println("제목:"+board.getTitle());
				System.out.println("내용:"+board.getContent());
				System.out.println("작성자:"+board.getWriter());
				System.out.println("작성일지:"+board.getDate());
				System.out.println("--------------------------");
				break;
			}
		}
	}
	
	int getListSize() {
		return this.list.size();
	}
	
	
	
	
	
	
	

}
