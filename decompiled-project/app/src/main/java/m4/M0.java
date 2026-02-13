package m4;

import java.util.Arrays;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class M0 implements InterfaceC1569g {

    /* renamed from: f, reason: collision with root package name */
    public static final String f20103f;

    /* renamed from: u, reason: collision with root package name */
    public static final String f20104u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f20105v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f20106w;

    /* renamed from: a, reason: collision with root package name */
    public final int f20107a;

    /* renamed from: b, reason: collision with root package name */
    public final P4.m0 f20108b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20109c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f20110d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f20111e;

    static {
        int i7 = n5.D.f21141a;
        f20103f = Integer.toString(0, 36);
        f20104u = Integer.toString(1, 36);
        f20105v = Integer.toString(3, 36);
        f20106w = Integer.toString(4, 36);
    }

    public M0(P4.m0 m0Var, boolean z8, int[] iArr, boolean[] zArr) {
        int i7 = m0Var.f8106a;
        this.f20107a = i7;
        boolean z10 = false;
        AbstractC1705a.h(i7 == iArr.length && i7 == zArr.length);
        this.f20108b = m0Var;
        if (z8 && i7 > 1) {
            z10 = true;
        }
        this.f20109c = z10;
        this.f20110d = (int[]) iArr.clone();
        this.f20111e = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f20108b.f8108c;
    }

    public final boolean b(int i7) {
        return this.f20110d[i7] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M0.class != obj.getClass()) {
            return false;
        }
        M0 m02 = (M0) obj;
        return this.f20109c == m02.f20109c && this.f20108b.equals(m02.f20108b) && Arrays.equals(this.f20110d, m02.f20110d) && Arrays.equals(this.f20111e, m02.f20111e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f20111e) + ((Arrays.hashCode(this.f20110d) + (((this.f20108b.hashCode() * 31) + (this.f20109c ? 1 : 0)) * 31)) * 31);
    }
}
