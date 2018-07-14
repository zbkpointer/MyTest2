package example08;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    @Override
    public void undo() {

    }

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }
}
