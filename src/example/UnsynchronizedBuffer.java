package example;

public class UnsynchronizedBuffer implements Buffer {
    private int buffer = -1;

    @Override
    public void set(int value) throws InterruptedException {
        System.out.printf("写入\t\t%d",value);
        buffer = value;
    }

    @Override
    public int get() throws InterruptedException {

        System.out.println("读取\t\t"+buffer);
        return buffer;
    }
}
