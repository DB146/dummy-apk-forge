package C4;

import A0.G0;
import N6.H;
import N6.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.K;
import m4.L;

/* renamed from: C4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244f {

    /* renamed from: a, reason: collision with root package name */
    public final int f2728a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2729b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0244f(int i7) {
        this(0, t0.f7341e);
        switch (i7) {
            case 1:
                this.f2728a = 1;
                this.f2729b = Collections.singletonList(null);
                return;
            default:
                N6.F f4 = H.f7232b;
                return;
        }
    }

    public C0244f(int i7, List list) {
        this.f2728a = i7;
        this.f2729b = list;
    }

    public C0244f(ArrayList arrayList) {
        this.f2728a = 0;
        this.f2729b = arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0032. Please report as an issue. */
    public G a(int i7, G0 g02) {
        if (i7 != 2) {
            String str = (String) g02.f27b;
            if (i7 == 3 || i7 == 4) {
                return new w(new u(str));
            }
            if (i7 == 21) {
                return new w(new h());
            }
            if (i7 == 27) {
                if (c(4)) {
                    return null;
                }
                return new w(new q(new q3.e(b(g02)), c(1), c(8)));
            }
            if (i7 == 36) {
                return new w(new s(new q3.e(b(g02))));
            }
            if (i7 == 89) {
                return new w(new h((List) g02.f28c));
            }
            if (i7 != 138) {
                if (i7 == 172) {
                    return new w(new C0240b(str, 1));
                }
                if (i7 == 257) {
                    return new C(new G0("application/vnd.dvb.ait", 9));
                }
                if (i7 == 134) {
                    if (c(16)) {
                        return null;
                    }
                    return new C(new G0("application/x-scte35", 9));
                }
                if (i7 != 135) {
                    switch (i7) {
                        case 15:
                            if (c(2)) {
                                return null;
                            }
                            return new w(new C0243e(str, false));
                        case 16:
                            return new w(new n(new q3.s(b(g02))));
                        case 17:
                            if (c(2)) {
                                return null;
                            }
                            return new w(new t(str));
                        default:
                            switch (i7) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!c(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                    }
                }
                return new w(new C0240b(str, 0));
            }
            return new w(new C0245g(str));
        }
        return new w(new k(new q3.s(b(g02))));
    }

    public List b(G0 g02) {
        String str;
        int i7;
        boolean c10 = c(32);
        List list = this.f2729b;
        if (c10) {
            return list;
        }
        n5.v vVar = new n5.v((byte[]) g02.f29d);
        while (vVar.a() > 0) {
            int v10 = vVar.v();
            int v11 = vVar.f21230b + vVar.v();
            if (v10 == 134) {
                ArrayList arrayList = new ArrayList();
                int v12 = vVar.v() & 31;
                for (int i10 = 0; i10 < v12; i10++) {
                    String t5 = vVar.t(3, M6.e.f6799c);
                    int v13 = vVar.v();
                    boolean z8 = (v13 & 128) != 0;
                    if (z8) {
                        i7 = v13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte v14 = (byte) vVar.v();
                    vVar.H(1);
                    List singletonList = z8 ? Collections.singletonList((v14 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    K k = new K();
                    k.k = str;
                    k.f19978c = t5;
                    k.f19972C = i7;
                    k.f19985m = singletonList;
                    arrayList.add(new L(k));
                }
                list = arrayList;
            }
            vVar.G(v11);
        }
        return list;
    }

    public boolean c(int i7) {
        return (i7 & this.f2728a) != 0;
    }
}
