package G8;

import J8.C0358m;
import J8.d0;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class o {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            O8.b bVar = new O8.b(stringWriter);
            bVar.f7528v = 1;
            d0.f5692z.getClass();
            C0358m.e(bVar, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
