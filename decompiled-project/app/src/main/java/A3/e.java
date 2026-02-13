package A3;

import java.io.IOException;

/* loaded from: classes.dex */
public class e extends IOException {
    public e(int i7, IOException iOException, String str) {
        super(str + ", status code: " + i7, iOException);
    }

    public e(int i7, String str) {
        super("HTTP error fetching URL. Status=" + i7 + ", URL=[" + str + "]");
    }

    public e(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public e(String str) {
        super(str);
    }
}
