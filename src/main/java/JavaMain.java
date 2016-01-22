import io.github.binaryfoo.DecodedData;
import io.github.binaryfoo.RootDecoder;

public class JavaMain {
  public static void main(String[] args) {
    RootDecoder decoder = new RootDecoder();
    for (DecodedData d : decoder.decode("ffffffffff", "EMV", "95")) {
      System.out.println(d);
    }
  }
}
