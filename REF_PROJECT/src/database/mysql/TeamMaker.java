package semi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TeamMaker {

	public static void main(String[] args) {
		
		List<HashSet<Integer>> teamList = new ArrayList<HashSet<Integer>>();
		
		Set<Integer> selectedNumberSet = new HashSet<Integer>();
		
		boolean newSetFlag = true;
		
		HashSet<Integer> teamSet = null;
		
		while ( true ) {
			
			int number = (int)(Math.random()*17)+1;
			
			if ( selectedNumberSet.contains(number) ) {
				continue;
			}
			
			if ( newSetFlag ) {
				teamSet = new HashSet<Integer>();
				newSetFlag = false;
			}
			
			if ( 3 > teamSet.size() ) {
				teamSet.add(number);
			}
			
			if ( 5 > teamList.size() ) {
				if ( 3 == teamSet.size() ) {
					teamList.add(teamSet);
					newSetFlag = true;
				}
			} else {
				if ( 2 == teamSet.size() ) {
					teamList.add(teamSet);
					newSetFlag = true;
				}
			}
			
			selectedNumberSet.add(number);
			
			if ( 17 == selectedNumberSet.size() ) {
				break;
			}
			 
		}
		
		System.out.println(teamList);
		
	}

}
