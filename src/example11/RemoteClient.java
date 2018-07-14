package example11;



import static java.rmi.Naming.*;

public class RemoteClient {

    public void go(){
        try {
            MyRemote service = (MyRemote) lookup("rmi://127.0.0.1/HelloRemote");
            String s  = service.sayHello();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {
            RemoteClient remoteClient = new RemoteClient();
            remoteClient.go();
    }
}
