
import java.util.logging.Level;
import java.util.logging.Logger;

public class MazeServer implements Maze {
	public final static Logger logger = Logger.getLogger(MazeServer.class.getName());
	
	public MazeServer() {}
	
	public String joinGame() {
		return "test";
	}
	
	public static void main(String[] args) {
		
		System.out.println("entered MazeClient");
	    logger.log(Level.INFO, "entered MazeClient");
	    
	    MazeServer mazeServer;
	    try {
	    	mazeServer = new MazeServer();
	    	
	    }
	    catch(Exception e) {
	    	logger.log(Level.WARNING, "EXCEPTION caught in Inside MazeClient");
	    	e.printStackTrace();
	    }
	}
}
