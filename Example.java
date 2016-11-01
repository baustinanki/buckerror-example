import android.content.Context;
import android.support.v4.content.ContextCompat;

public class Example {
  public static int Test(Context x) {
    return ContextCompat.checkSelfPermission(x, "asdf");
  }
}
