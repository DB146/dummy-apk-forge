package m4;

/* loaded from: classes.dex */
public final class N0 implements InterfaceC1569g {

    /* renamed from: b, reason: collision with root package name */
    public static final N0 f20113b;

    /* renamed from: a, reason: collision with root package name */
    public final N6.H f20114a;

    static {
        N6.F f4 = N6.H.f7232b;
        f20113b = new N0(N6.t0.f7341e);
        int i7 = n5.D.f21141a;
        Integer.toString(0, 36);
    }

    public N0(N6.H h10) {
        this.f20114a = N6.H.F(h10);
    }

    public final boolean a(int i7) {
        int i10 = 0;
        while (true) {
            N6.H h10 = this.f20114a;
            if (i10 >= h10.size()) {
                return false;
            }
            M0 m02 = (M0) h10.get(i10);
            boolean[] zArr = m02.f20111e;
            int length = zArr.length;
            boolean z8 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (zArr[i11]) {
                    z8 = true;
                    break;
                }
                i11++;
            }
            if (z8 && m02.a() == i7) {
                return true;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N0.class != obj.getClass()) {
            return false;
        }
        return this.f20114a.equals(((N0) obj).f20114a);
    }

    public final int hashCode() {
        return this.f20114a.hashCode();
    }
}
