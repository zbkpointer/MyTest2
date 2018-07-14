package example08;

import java.util.Random;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command unDoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i <7 ; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        unDoCommand = noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }

    public void buttonWasPressed(int slot){
        onCommands[slot].execute();
        unDoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        unDoCommand = offCommands[slot];
    }

    public void unDoButtonWasPressed(){

        unDoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("-------Remote Control--------"+"\n");

        for (int i = 0; i <onCommands.length ; i++) {
            stringBuffer.append("slot["+i+"]"+onCommands[i].getClass().getName()
                    +"  "+offCommands[i].getClass().getName()+"\n");
        }

        return stringBuffer.toString();
    }
}
