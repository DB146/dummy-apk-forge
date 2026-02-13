package A0;

import java.util.Map;
import u.C2040C;
import x0.AbstractC2256a;
import y0.AbstractC2323H;
import y0.C2344l;
import y0.InterfaceC2317B;
import y0.InterfaceC2318C;
import y0.InterfaceC2345m;

/* loaded from: classes.dex */
public abstract class T extends AbstractC2323H implements InterfaceC2318C, InterfaceC0014e0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f113f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f114u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f115v;

    /* renamed from: w, reason: collision with root package name */
    public final y0.x f116w = new y0.x(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public C2040C f117x;

    /* renamed from: y, reason: collision with root package name */
    public C2040C f118y;

    public static void f0(n0 n0Var) {
        M m10;
        n0 n0Var2 = n0Var.f274A;
        L l10 = n0Var2 != null ? n0Var2.f293z : null;
        L l11 = n0Var.f293z;
        if (!kotlin.jvm.internal.l.a(l10, l11)) {
            l11.f61T.f105p.f179K.f();
            return;
        }
        InterfaceC0007b j = l11.f61T.f105p.j();
        if (j == null || (m10 = ((C0010c0) j).f179K) == null) {
            return;
        }
        m10.f();
    }

    public abstract int R(C2344l c2344l);

    public final void S(x0 x0Var) {
        T d02;
        v0 snapshotObserver;
        if (this.f115v || x0Var.f325a.c() == null) {
            return;
        }
        C2040C c2040c = this.f118y;
        if (c2040c == null) {
            c2040c = new C2040C();
            this.f118y = c2040c;
        }
        C2040C c2040c2 = this.f117x;
        if (c2040c2 == null) {
            c2040c2 = new C2040C();
            this.f117x = c2040c2;
        }
        Object[] objArr = c2040c2.f24573b;
        float[] fArr = c2040c2.f24574c;
        long[] jArr = c2040c2.f24572a;
        int length = jArr.length - 2;
        long j = -9187201950435737472L;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j10 = jArr[i7];
                int i10 = i7;
                if ((((~j10) << 7) & j10 & j) != j) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j10 & 255) < 128) {
                            int i13 = (i10 << 3) + i12;
                            c2040c.e(fArr[i13], objArr[i13]);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i7 = i10 + 1;
                j = -9187201950435737472L;
            }
        }
        c2040c2.a();
        B0.D d10 = b0().f44B;
        if (d10 != null && (snapshotObserver = d10.getSnapshotObserver()) != null) {
            snapshotObserver.a(x0Var, C0015f.f205c, new K(1, x0Var, this));
        }
        Object[] objArr2 = c2040c2.f24573b;
        long[] jArr2 = c2040c2.f24572a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j11 = jArr2[i14];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j11 & 255) < 128) {
                            if (objArr2[(i14 << 3) + i16] != null) {
                                throw new ClassCastException();
                            }
                            if (c2040c.c(null) < 0 && (d02 = d0()) != null) {
                                T t5 = d02;
                                do {
                                    C2040C c2040c3 = t5.f117x;
                                    if (c2040c3 != null && c2040c3.c(null) >= 0) {
                                        break;
                                    } else {
                                        t5 = t5.d0();
                                    }
                                } while (t5 != null);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                }
                if (i14 == length2) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        c2040c.a();
    }

    public final int T(C2344l c2344l) {
        int R10;
        if (Z() && (R10 = R(c2344l)) != Integer.MIN_VALUE) {
            return R10 + ((int) (this.f26558e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract T U();

    public abstract InterfaceC2345m V();

    public abstract boolean Z();

    public abstract L b0();

    public abstract InterfaceC2317B c0();

    public abstract T d0();

    public abstract long e0();

    public abstract void g0();

    @Override // A0.InterfaceC0014e0
    public final void h(boolean z8) {
        T d02 = d0();
        L b02 = d02 != null ? d02.b0() : null;
        if (kotlin.jvm.internal.l.a(b02, b0())) {
            this.f113f = z8;
            return;
        }
        if ((b02 != null ? b02.f61T.f96d : null) != F.f22c) {
            if ((b02 != null ? b02.f61T.f96d : null) != F.f23d) {
                return;
            }
        }
        this.f113f = z8;
    }

    @Override // y0.InterfaceC2318C
    public boolean m() {
        return false;
    }

    @Override // y0.InterfaceC2318C
    public final InterfaceC2317B q(int i7, int i10, Map map, Rb.c cVar) {
        if ((i7 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            AbstractC2256a.b("Size(" + i7 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new Q(i7, i10, map, cVar, this);
    }
}
