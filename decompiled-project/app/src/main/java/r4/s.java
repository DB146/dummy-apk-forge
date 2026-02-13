package r4;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* loaded from: classes.dex */
public abstract class s {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
