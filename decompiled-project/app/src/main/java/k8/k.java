package k8;

import Y5.A;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import l8.C1513b;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f19050b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f19051c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static k f19052d;

    /* renamed from: a, reason: collision with root package name */
    public final A f19053a;

    public k(A a9) {
        this.f19053a = a9;
    }

    public final boolean a(C1513b c1513b) {
        if (TextUtils.isEmpty(c1513b.f19602c)) {
            return true;
        }
        long j = c1513b.f19605f + c1513b.f19604e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f19053a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f19050b;
    }
}
