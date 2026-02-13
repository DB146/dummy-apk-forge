package m5;

import java.io.IOException;

/* loaded from: classes.dex */
public final class I extends IOException {
    public I(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
