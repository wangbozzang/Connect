
public class Hospital {
	
	int nowPatientCount;
	
	boolean isPossible(int requestCount){
		return (nowPatientCount - requestCount) > 0;
	}
	

}
