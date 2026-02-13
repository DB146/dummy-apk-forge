package p0;

import Y5.C0656w;
import j0.AbstractC1362A;

/* loaded from: classes.dex */
public final class d {
    public static int j;
    public static final C0656w k = new C0656w(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f22985a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22986b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22987c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22988d;

    /* renamed from: e, reason: collision with root package name */
    public final float f22989e;

    /* renamed from: f, reason: collision with root package name */
    public final p f22990f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22991h;

    /* renamed from: i, reason: collision with root package name */
    public final int f22992i;

    public d(String str, float f4, float f10, float f11, float f12, p pVar, long j10, int i7) {
        int i10;
        synchronized (k) {
            i10 = j;
            j = i10 + 1;
        }
        this.f22985a = str;
        this.f22986b = f4;
        this.f22987c = f10;
        this.f22988d = f11;
        this.f22989e = f12;
        this.f22990f = pVar;
        this.g = j10;
        this.f22991h = i7;
        this.f22992i = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.f22985a, dVar.f22985a) && V0.f.a(this.f22986b, dVar.f22986b) && V0.f.a(this.f22987c, dVar.f22987c) && this.f22988d == dVar.f22988d && this.f22989e == dVar.f22989e && this.f22990f.equals(dVar.f22990f) && j0.n.c(this.g, dVar.g) && AbstractC1362A.j(this.f22991h, dVar.f22991h);
    }

    public final int hashCode() {
        int hashCode = (this.f22990f.hashCode() + h3.o.e(this.f22989e, h3.o.e(this.f22988d, h3.o.e(this.f22987c, h3.o.e(this.f22986b, this.f22985a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i7 = j0.n.f18553h;
        return Boolean.hashCode(false) + A3.c.c(this.f22991h, h3.o.f(hashCode, 31, this.g), 31);
    }
}
