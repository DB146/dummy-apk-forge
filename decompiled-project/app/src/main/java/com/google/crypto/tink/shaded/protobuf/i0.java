package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class i0 extends k0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f15786b = i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final boolean c(Object obj, long j) {
        switch (this.f15786b) {
            case 0:
                if (l0.f15802h) {
                    if (l0.g(obj, j) == 0) {
                        return false;
                    }
                } else if (l0.h(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                if (l0.f15802h) {
                    if (l0.g(obj, j) == 0) {
                        return false;
                    }
                } else if (l0.h(obj, j) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final byte d(Object obj, long j) {
        switch (this.f15786b) {
            case 0:
                return l0.f15802h ? l0.g(obj, j) : l0.h(obj, j);
            default:
                return l0.f15802h ? l0.g(obj, j) : l0.h(obj, j);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final double e(Object obj, long j) {
        switch (this.f15786b) {
            case 0:
                return Double.longBitsToDouble(h(obj, j));
            default:
                return Double.longBitsToDouble(h(obj, j));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final float f(Object obj, long j) {
        switch (this.f15786b) {
            case 0:
                return Float.intBitsToFloat(g(obj, j));
            default:
                return Float.intBitsToFloat(g(obj, j));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final void k(Object obj, long j, boolean z8) {
        switch (this.f15786b) {
            case 0:
                if (l0.f15802h) {
                    l0.o(obj, j, z8 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    l0.p(obj, j, z8 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (l0.f15802h) {
                    l0.o(obj, j, z8 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    l0.p(obj, j, z8 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final void l(Object obj, long j, byte b2) {
        switch (this.f15786b) {
            case 0:
                if (l0.f15802h) {
                    l0.o(obj, j, b2);
                    return;
                } else {
                    l0.p(obj, j, b2);
                    return;
                }
            default:
                if (l0.f15802h) {
                    l0.o(obj, j, b2);
                    return;
                } else {
                    l0.p(obj, j, b2);
                    return;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final void m(Object obj, long j, double d10) {
        switch (this.f15786b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d10));
                return;
            default:
                p(obj, j, Double.doubleToLongBits(d10));
                return;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final void n(Object obj, long j, float f4) {
        switch (this.f15786b) {
            case 0:
                o(obj, Float.floatToIntBits(f4), j);
                return;
            default:
                o(obj, Float.floatToIntBits(f4), j);
                return;
        }
    }
}
