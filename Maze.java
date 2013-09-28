
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Maze extends Remote {
	String joinGame() throws RemoteException;
}
