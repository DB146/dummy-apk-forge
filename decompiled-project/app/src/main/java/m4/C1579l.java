package m4;

/* renamed from: m4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1579l implements InterfaceC1569g {

    /* renamed from: a, reason: collision with root package name */
    public final int f20421a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20422b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20423c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20424d = null;

    static {
        new E3.h(0).a();
        int i7 = n5.D.f21141a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public C1579l(E3.h hVar) {
        this.f20421a = hVar.f3537a;
        this.f20422b = hVar.f3538b;
        this.f20423c = hVar.f3539c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1579l)) {
            return false;
        }
        C1579l c1579l = (C1579l) obj;
        return this.f20421a == c1579l.f20421a && this.f20422b == c1579l.f20422b && this.f20423c == c1579l.f20423c && n5.D.a(this.f20424d, c1579l.f20424d);
    }

    public final int hashCode() {
        int i7 = (((((527 + this.f20421a) * 31) + this.f20422b) * 31) + this.f20423c) * 31;
        String str = this.f20424d;
        return i7 + (str == null ? 0 : str.hashCode());
    }
}
