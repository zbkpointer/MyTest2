package example11;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {
    }


    public String sayHello() throws RemoteException {
        return "Service say, 'Hello'";
    }

    public static void main(String[] args) {

        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("HelloRemote", service);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
