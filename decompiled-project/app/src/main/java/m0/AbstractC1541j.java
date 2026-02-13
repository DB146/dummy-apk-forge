package m0;

import android.os.Build;
import java.util.Locale;

/* renamed from: m0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1541j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19758a = 0;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }
}
