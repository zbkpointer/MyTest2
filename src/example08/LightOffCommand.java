package example08;

public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void undo() {
        light.on();
    }

    @Override
    public void execute() {
        light.off();
    }
}
