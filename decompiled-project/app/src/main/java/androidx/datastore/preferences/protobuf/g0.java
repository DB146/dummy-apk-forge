package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class g0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f13400b = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean c(Object obj, long j) {
        switch (this.f13400b) {
            case 0:
                return j0.g ? j0.b(obj, j) : j0.c(obj, j);
            default:
                return j0.g ? j0.b(obj, j) : j0.c(obj, j);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final double d(Object obj, long j) {
        switch (this.f13400b) {
            case 0:
                return Double.longBitsToDouble(g(obj, j));
            default:
                return Double.longBitsToDouble(g(obj, j));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final float e(Object obj, long j) {
        switch (this.f13400b) {
            case 0:
                return Float.intBitsToFloat(f(obj, j));
            default:
                return Float.intBitsToFloat(f(obj, j));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void j(Object obj, long j, boolean z8) {
        switch (this.f13400b) {
            case 0:
                if (j0.g) {
                    j0.k(obj, j, z8 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    j0.l(obj, j, z8 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (j0.g) {
                    j0.k(obj, j, z8 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    j0.l(obj, j, z8 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void k(Object obj, long j, byte b2) {
        switch (this.f13400b) {
            case 0:
                if (j0.g) {
                    j0.k(obj, j, b2);
                    return;
                } else {
                    j0.l(obj, j, b2);
                    return;
                }
            default:
                if (j0.g) {
                    j0.k(obj, j, b2);
                    return;
                } else {
                    j0.l(obj, j, b2);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void l(Object obj, long j, double d10) {
        switch (this.f13400b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d10));
                return;
            default:
                o(obj, j, Double.doubleToLongBits(d10));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void m(Object obj, long j, float f4) {
        switch (this.f13400b) {
            case 0:
                n(obj, Float.floatToIntBits(f4), j);
                return;
            default:
                n(obj, Float.floatToIntBits(f4), j);
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean r() {
        switch (this.f13400b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
