package example08;

public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light kitchenLight = new Light("Kitchen");
        Light LivingRoomLight = new Light("LivingRoom");
        LightOnCommand lightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand lightOffCommand = new LightOffCommand(kitchenLight);
        NoCommand noCommand = new NoCommand();
        MacroCommand macroCommandOn = new MacroCommand(manyCommands.partyOn);
        MacroCommand macroCommandOff = new MacroCommand(manyCommands.partyOff);



        remoteControl.setCommand(0,macroCommandOn,noCommand);
        remoteControl.buttonWasPressed(0);

        System.out.println(remoteControl);

        remoteControl.setCommand(0,noCommand,macroCommandOff);
        remoteControl.offButtonWasPressed(0);

        System.out.println(remoteControl);

        remoteControl.unDoButtonWasPressed();


        System.out.println(remoteControl);

    }


}
class manyCommands{

        private static Light kitchenLight = new Light("kitchen");
        private static Light livingRoomLight = new Light("LivingRoom");

        private static LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        private static LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        private static LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        private static LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);


        public static Command[] partyOn = {kitchenLightOn,livingRoomLightOn};
        public static Command[] partyOff = {kitchenLightOff,livingRoomLightOff};

}