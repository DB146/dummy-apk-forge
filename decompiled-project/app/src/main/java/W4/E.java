package W4;

import N6.t0;
import N6.y0;
import android.net.Uri;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f10642a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f10643b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10644c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10645d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10646e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10647f;
    public final Uri g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10648h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10649i;
    public final String j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10650l;

    public E(D d10) {
        this.f10642a = y0.b(d10.f10633a);
        this.f10643b = d10.f10634b.h();
        String str = d10.f10636d;
        int i7 = n5.D.f21141a;
        this.f10644c = str;
        this.f10645d = d10.f10637e;
        this.f10646e = d10.f10638f;
        this.g = d10.g;
        this.f10648h = d10.f10639h;
        this.f10647f = d10.f10635c;
        this.f10649i = d10.f10640i;
        this.j = d10.k;
        this.k = d10.f10641l;
        this.f10650l = d10.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e2 = (E) obj;
        if (this.f10647f == e2.f10647f) {
            y0 y0Var = this.f10642a;
            y0Var.getClass();
            if (N6.r.h(e2.f10642a, y0Var) && this.f10643b.equals(e2.f10643b) && n5.D.a(this.f10645d, e2.f10645d) && n5.D.a(this.f10644c, e2.f10644c) && n5.D.a(this.f10646e, e2.f10646e) && n5.D.a(this.f10650l, e2.f10650l) && n5.D.a(this.g, e2.g) && n5.D.a(this.j, e2.j) && n5.D.a(this.k, e2.k) && n5.D.a(this.f10648h, e2.f10648h) && n5.D.a(this.f10649i, e2.f10649i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f10643b.hashCode() + ((this.f10642a.hashCode() + 217) * 31)) * 31;
        String str = this.f10645d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10644c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10646e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f10647f) * 31;
        String str4 = this.f10650l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.g;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10648h;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10649i;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
