package P4;

import N6.t0;
import m4.InterfaceC1569g;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class n0 implements InterfaceC1569g {

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f8117d = new n0(new m0[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final String f8118e;

    /* renamed from: a, reason: collision with root package name */
    public final int f8119a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f8120b;

    /* renamed from: c, reason: collision with root package name */
    public int f8121c;

    static {
        int i7 = n5.D.f21141a;
        f8118e = Integer.toString(0, 36);
    }

    public n0(m0... m0VarArr) {
        this.f8120b = N6.H.G(m0VarArr);
        this.f8119a = m0VarArr.length;
        int i7 = 0;
        while (true) {
            t0 t0Var = this.f8120b;
            if (i7 >= t0Var.size()) {
                return;
            }
            int i10 = i7 + 1;
            for (int i11 = i10; i11 < t0Var.size(); i11++) {
                if (((m0) t0Var.get(i7)).equals(t0Var.get(i11))) {
                    AbstractC1705a.u("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i10;
        }
    }

    public final m0 a(int i7) {
        return (m0) this.f8120b.get(i7);
    }

    public final int b(m0 m0Var) {
        int indexOf = this.f8120b.indexOf(m0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f8119a == n0Var.f8119a && this.f8120b.equals(n0Var.f8120b);
    }

    public final int hashCode() {
        if (this.f8121c == 0) {
            this.f8121c = this.f8120b.hashCode();
        }
        return this.f8121c;
    }
}
