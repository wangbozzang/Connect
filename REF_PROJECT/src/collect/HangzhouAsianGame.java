package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HangzhouAsianGame {
	
	List eventList;
	
	public HangzhouAsianGame() {
		eventList = new ArrayList();
	}
	
	void setESports() {
		
		Map map = new HashMap();
		map.put("date", "9월 24일 (일)");
		map.put("time", "10:00");
		map.put("title", "FIFA 온라인");
		
		List list = new ArrayList();
		list.add(map);
		
		map = new HashMap();
		map.put("date", "9월 26일 (화)");
		map.put("time", "10:00");
		map.put("title", "롤");
		list.add(map);
		
		Map eMap = new HashMap();
		eMap.put("eSports", list);
		
		eventList.add(eMap);
		
	}
	
	void setCycle() {
		
		Map map = new HashMap();
		map.put("date", "10월 1일 (일)");
		map.put("time", "11:00");
		map.put("title", "남자 예선 1라운드");
		
		List list = new ArrayList();
		list.add(map);
		
		Map eMap = new HashMap();
		eMap.put("cycle", list);
		
		eventList.add(eMap);
		
	}
	
	List searchEvent(String event) {
		List resultList = null;
		outter : for ( int i = 0 ; i < eventList.size() ; i++ ) {
			Map map = (Map)eventList.get(i);
			Set set = map.keySet();
			Iterator ite = set.iterator();
			while ( ite.hasNext() ) {
				String name = (String)ite.next();
				if ( event.equals(name) ) {
					resultList = (List)map.get(name);
					break outter;
				}
			}
		}
		return resultList;
	}
	
	
	
	
	
	
	
	
	

}