package r4;

import android.media.MediaDrm;

/* loaded from: classes.dex */
public abstract class t {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return n5.D.u(n5.D.v(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
