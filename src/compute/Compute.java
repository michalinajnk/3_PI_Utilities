package compute;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Compute extends Remote {
     <T> T executeTask(compute.Task<T> t) throws RemoteException;
     BigDecimal testPI() throws RemoteException;
}