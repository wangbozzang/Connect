package game.rps;

import java.util.Scanner;

/*
 * 0.메타 데이터 정리(1:가위,2:바위,3:보)
 * 1.생성자: 컴퓨터의 랜덤 번호 저장
 * 2.메소드:사용자로부터 입력 받음
 * 3.메소드:컴퓨터,손님 선택 표시
 * 4.메소드:승패 체크
 */
public class RockPaperScissors {

	int comNumber;
	int guestNumber;
	
	public RockPaperScissors() {
		comNumber = (int)(Math.random()*3) + 1;
	}
	
	void setGuestNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 하나 선택하시오.(1:가위,2:바위,3:보)");
		guestNumber = scanner.nextInt();
	}
	
	void printNumber() {
		String comNumKor = "";
		String guestNumKor = "";
		
		if ( 1 == comNumber ) {
			comNumKor = "가위";
		} else if ( 2 == comNumber ) {
			comNumKor = "바위";
		} else if ( 3 == comNumber ) {
			comNumKor = "보";
		} else {
			//처리 없음
		}
		
		if ( 1 == guestNumber ) {
			guestNumKor = "가위";
		} else if ( 2 == guestNumber ) {
			guestNumKor = "바위";
		} else if ( 3 == guestNumber ) {
			guestNumKor = "보";
		} else {
			//처리 없음
		}
		
		System.out.println("컴퓨터:"+comNumKor);
		System.out.println("손님:"+guestNumKor);
	}
	
	void checkWinner() {
		String result = "";
		
		if ( comNumber == guestNumber ) {
			result = "무승부";
			
		} else {
			if ( 1 == guestNumber ) {
				if ( 2 == comNumber ) {
					result = "컴퓨터 Win";
				} else {
					result = "손님 Win";
				}
			} else if ( 2 == guestNumber ) {
				if ( 3 == comNumber ) {
					result = "컴퓨터 Win";
				} else {
					result = "손님 Win";
				}
			} else if ( 3 == guestNumber ) {
				if ( 1 == comNumber ) {
					result = "컴퓨터 Win";
				} else {
					result = "손님 Win";
				}
			} else {
				//처리 없음
			}
		}
		
		System.out.println("결과:"+result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
