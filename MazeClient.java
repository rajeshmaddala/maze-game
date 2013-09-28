
import java.util.logging.Level;
import java.util.logging.Logger;

public class MazeClient {
	public final static Logger logger = Logger.getLogger(MazeClient.class.getName());

    private MazeClient() {}
	
    public static void main(String[] args) {
		
    System.out.println("entered MazeClient");
    logger.log(Level.INFO, "entered MazeClient");
    
    System.setProperty("sun.rmi.transport.tcp.handshakeTimeout", "1000");
    System.setProperty("sun.rmi.transport.tcp.responseTimeout", "5000");
    
    MazeClient mazeClient;   
    try{
    	mazeClient = new MazeClient();    	
    }
    catch (Exception e) {
    	logger.log(Level.WARNING, "EXCEPTION caught in Inside MazeClient");
    	e.printStackTrace();
    }
    	
    }
}
