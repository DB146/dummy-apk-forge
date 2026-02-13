package r4;

import android.media.MediaDrmResetException;

/* loaded from: classes.dex */
public abstract class u {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
