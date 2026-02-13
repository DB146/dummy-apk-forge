package P4;

import java.util.Arrays;
import m4.InterfaceC1569g;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class m0 implements InterfaceC1569g {

    /* renamed from: f, reason: collision with root package name */
    public static final String f8103f;

    /* renamed from: u, reason: collision with root package name */
    public static final String f8104u;

    /* renamed from: v, reason: collision with root package name */
    public static final Y f8105v;

    /* renamed from: a, reason: collision with root package name */
    public final int f8106a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8107b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8108c;

    /* renamed from: d, reason: collision with root package name */
    public final m4.L[] f8109d;

    /* renamed from: e, reason: collision with root package name */
    public int f8110e;

    static {
        int i7 = n5.D.f21141a;
        f8103f = Integer.toString(0, 36);
        f8104u = Integer.toString(1, 36);
        f8105v = new Y(1);
    }

    public m0(String str, m4.L... lArr) {
        AbstractC1705a.h(lArr.length > 0);
        this.f8107b = str;
        this.f8109d = lArr;
        this.f8106a = lArr.length;
        int h10 = n5.o.h(lArr[0].f20096z);
        this.f8108c = h10 == -1 ? n5.o.h(lArr[0].f20095y) : h10;
        String str2 = lArr[0].f20087c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i7 = lArr[0].f20089e | 16384;
        for (int i10 = 1; i10 < lArr.length; i10++) {
            String str3 = lArr[i10].f20087c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b("languages", lArr[0].f20087c, lArr[i10].f20087c, i10);
                return;
            } else {
                if (i7 != (lArr[i10].f20089e | 16384)) {
                    b("role flags", Integer.toBinaryString(lArr[0].f20089e), Integer.toBinaryString(lArr[i10].f20089e), i10);
                    return;
                }
            }
        }
    }

    public static void b(String str, String str2, String str3, int i7) {
        StringBuilder o10 = A3.c.o("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        o10.append(str3);
        o10.append("' (track ");
        o10.append(i7);
        o10.append(")");
        AbstractC1705a.u("TrackGroup", "", new IllegalStateException(o10.toString()));
    }

    public final int a(m4.L l10) {
        int i7 = 0;
        while (true) {
            m4.L[] lArr = this.f8109d;
            if (i7 >= lArr.length) {
                return -1;
            }
            if (l10 == lArr[i7]) {
                return i7;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f8107b.equals(m0Var.f8107b) && Arrays.equals(this.f8109d, m0Var.f8109d);
    }

    public final int hashCode() {
        if (this.f8110e == 0) {
            this.f8110e = A3.c.d(527, 31, this.f8107b) + Arrays.hashCode(this.f8109d);
        }
        return this.f8110e;
    }
}
