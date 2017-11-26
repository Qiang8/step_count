import java.util.function.Supplier;

/**
 * Created by qiuzhanghua on 2017/2/7.
 */
public class FibonacciSupplier implements Supplier<Long> {
  private long previous1 = 1;
  private long previous2 = 2;
  private long current = 4;

  @Override
  public Long get() {
    long p = previous1;
    long next = current + previous1+previous2;
    previous1=previous2;
    previous2 = current;
    current = next;
    return p;
  }
}
