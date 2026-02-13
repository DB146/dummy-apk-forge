package M;

import i0.C1289b;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6493a = 10;

    public static final float a(V0.c cVar, boolean z8, long j) {
        float c10 = i0.e.c(j);
        float c11 = C1289b.c((Float.floatToRawIntBits(i0.e.b(j)) & 4294967295L) | (Float.floatToRawIntBits(c10) << 32)) / 2.0f;
        return z8 ? c11 + cVar.p(f6493a) : c11;
    }
}
