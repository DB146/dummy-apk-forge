package W3;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final double f10607a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f10608b = 0;

    public static double a(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f10607a;
    }
}
