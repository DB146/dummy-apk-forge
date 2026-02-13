package u0;

import android.view.MotionEvent;
import i0.C1289b;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f24800a = new StackTraceElement[0];

    public static final boolean a(C2080j c2080j) {
        return !c2080j.f24769h && c2080j.f24766d;
    }

    public static final boolean b(C2080j c2080j) {
        return c2080j.f24769h && !c2080j.f24766d;
    }

    public static final boolean c(int i7, int i10) {
        return i7 == i10;
    }

    public static final boolean d(long j, long j10) {
        return j == j10;
    }

    public static final boolean e(int i7, int i10) {
        return i7 == i10;
    }

    public static final long f(C2080j c2080j, boolean z8) {
        long d10 = C1289b.d(c2080j.f24765c, c2080j.g);
        if (z8 || !c2080j.b()) {
            return d10;
        }
        return 0L;
    }

    public static final void g(C2075e c2075e, long j, Rb.c cVar, boolean z8) {
        MotionEvent a9 = c2075e.a();
        if (a9 == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = a9.getAction();
        if (z8) {
            a9.setAction(3);
        }
        int i7 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        a9.offsetLocation(-Float.intBitsToFloat(i7), -Float.intBitsToFloat(i10));
        cVar.invoke(a9);
        a9.offsetLocation(Float.intBitsToFloat(i7), Float.intBitsToFloat(i10));
        a9.setAction(action);
    }
}
