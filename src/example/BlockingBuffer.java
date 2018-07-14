package example;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer {
    private final ArrayBlockingQueue<Integer> buffer;

    public BlockingBuffer() {
        buffer = new ArrayBlockingQueue<>(1);
    }

    @Override
    public void set(int value) throws InterruptedException {
        buffer.put(value);
        System.out.println("写入："+value+","+"缓冲空间为："+buffer.size());

    }

    @Override
    public int get() throws InterruptedException {
        int readValue = 0;
        readValue = buffer.take();
        System.out.println("读取："+readValue+","+"缓冲空间为："+buffer.size());
        return readValue;
    }
}
