package collect;

import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		HangzhouAsianGame hag = new HangzhouAsianGame();
		hag.setESports();
		hag.setCycle();
		List list = hag.searchEvent("eSports");
		if ( null != list ) {
			for ( int i = 0 ; i < list.size() ; i++ ) {
				Map map = (Map)list.get(i);
				System.out.println("날짜:"+map.get("date"));
				System.out.println("시각:"+map.get("time"));
				System.out.println("제목:"+map.get("title"));
				System.out.println("---------------------------");
			}
		} else {
			System.out.println("검색결과가 없습니다.");
		}
	}

}
