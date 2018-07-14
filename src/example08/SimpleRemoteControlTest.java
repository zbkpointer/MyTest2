package example08;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        LightOnCommand lightOnCommand = new LightOnCommand(new Light("Kitchen"));
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPress();

        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPress();
    }
}
