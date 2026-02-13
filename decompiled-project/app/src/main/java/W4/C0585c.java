package W4;

import N6.y0;

/* renamed from: W4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10672a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10673b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10674c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10675d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10676e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10677f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10678h;

    /* renamed from: i, reason: collision with root package name */
    public final y0 f10679i;
    public final C0584b j;

    public C0585c(C0583a c0583a, y0 y0Var, C0584b c0584b) {
        this.f10672a = c0583a.f10660a;
        this.f10673b = c0583a.f10661b;
        this.f10674c = c0583a.f10662c;
        this.f10675d = c0583a.f10663d;
        this.f10677f = c0583a.g;
        this.g = c0583a.f10666h;
        this.f10676e = c0583a.f10665f;
        this.f10678h = c0583a.f10667i;
        this.f10679i = y0Var;
        this.j = c0584b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0585c.class != obj.getClass()) {
            return false;
        }
        C0585c c0585c = (C0585c) obj;
        if (this.f10672a.equals(c0585c.f10672a) && this.f10673b == c0585c.f10673b && this.f10674c.equals(c0585c.f10674c) && this.f10675d == c0585c.f10675d && this.f10676e == c0585c.f10676e) {
            y0 y0Var = this.f10679i;
            y0Var.getClass();
            if (N6.r.h(c0585c.f10679i, y0Var) && this.j.equals(c0585c.j) && n5.D.a(this.f10677f, c0585c.f10677f) && n5.D.a(this.g, c0585c.g) && n5.D.a(this.f10678h, c0585c.f10678h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + ((this.f10679i.hashCode() + ((((A3.c.d((A3.c.d(217, 31, this.f10672a) + this.f10673b) * 31, 31, this.f10674c) + this.f10675d) * 31) + this.f10676e) * 31)) * 31)) * 31;
        String str = this.f10677f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10678h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
