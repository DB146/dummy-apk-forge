package F;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final C0264h f3954a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
        f3954a = lowerCase.equals("robolectric") ? new Object() : null;
    }
}
