import java.util.HashMap;
import java.util.Map;


public class GameStatusMap {
	private static Map<Integer, String> gameStatusMap = new HashMap<Integer, String>();
	
	public GameStatusMap(){
		gameStatusMap.put(1, "STATE1");
		gameStatusMap.put(2, "STATE2");
		gameStatusMap.put(3, "STATE3");
		gameStatusMap.put(4, "STATE4");
	}
	
	public static String getStatus(int i) {
		return gameStatusMap.get(i);
	}
	
}
