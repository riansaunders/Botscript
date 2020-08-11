package bot.botscript;

/**
 * @author rian
 */
public class Watch {
    private long start = 0;
    public void set() {
        start = System.nanoTime();
    }

    public long elapsed() {
        return System.nanoTime() - start;
    }

    public long elapsedMillis() {
        return elapsed() / 1000000;
    }

    public double elapsedMillisD() {
        return (System.nanoTime() - ((Long) start).doubleValue()) / 1000000;
    }

    public long elapsedSeconds() {
        return elapsed() / 1000000000L;
    }

    public double elapsedSecondsD() {
        return (System.nanoTime() - ((Long) start).doubleValue());
    }
}
