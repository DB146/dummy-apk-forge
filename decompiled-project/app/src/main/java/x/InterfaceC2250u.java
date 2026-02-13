package x;

import ea.C1111f;

/* renamed from: x.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2250u extends InterfaceC2237g {
    @Override // x.InterfaceC2237g
    default q0 a(C1111f c1111f) {
        return new q3.i(this);
    }

    float b(long j, float f4, float f10, float f11);

    float c(long j, float f4, float f10, float f11);

    long d(float f4, float f10, float f11);

    default float e(float f4, float f10, float f11) {
        return c(d(f4, f10, f11), f4, f10, f11);
    }
}
