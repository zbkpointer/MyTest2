package example08;

public class Stereo {

    public Stereo() {
    }

    public void on(){
        System.out.println("Stereo is on!");
    }

    public void setCD(){
        System.out.println("Stereo is setting CD!");
    }

    public void setVolume(int volume){
        System.out.println("Set the level of stereo:"+volume);
    }

    public void off(){
        System.out.println("Stereo is off!");
    }
}
