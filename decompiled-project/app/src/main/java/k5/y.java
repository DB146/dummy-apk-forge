package k5;

import H2.C0288b;
import m4.D0;
import m4.N0;
import n5.D;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f19017a;

    /* renamed from: b, reason: collision with root package name */
    public final D0[] f19018b;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f19019c;

    /* renamed from: d, reason: collision with root package name */
    public final N0 f19020d;

    /* renamed from: e, reason: collision with root package name */
    public final C0288b f19021e;

    public y(D0[] d0Arr, s[] sVarArr, N0 n02, C0288b c0288b) {
        this.f19018b = d0Arr;
        this.f19019c = (s[]) sVarArr.clone();
        this.f19020d = n02;
        this.f19021e = c0288b;
        this.f19017a = d0Arr.length;
    }

    public final boolean a(y yVar, int i7) {
        return yVar != null && D.a(this.f19018b[i7], yVar.f19018b[i7]) && D.a(this.f19019c[i7], yVar.f19019c[i7]);
    }

    public final boolean b(int i7) {
        return this.f19018b[i7] != null;
    }
}
