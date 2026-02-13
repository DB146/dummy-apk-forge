package z;

import cc.C0944m;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2555g {

    /* renamed from: a, reason: collision with root package name */
    public final G.a f27979a;

    /* renamed from: b, reason: collision with root package name */
    public final C0944m f27980b;

    public C2555g(G.a aVar, C0944m c0944m) {
        this.f27979a = aVar;
        this.f27980b = c0944m;
    }

    public final String toString() {
        String str;
        C0944m c0944m = this.f27980b;
        cc.D d10 = (cc.D) c0944m.f14552e.get(cc.D.f14468c);
        String str2 = d10 != null ? d10.f14469b : null;
        StringBuilder sb2 = new StringBuilder("Request@");
        int hashCode = hashCode();
        com.bumptech.glide.c.g(16);
        String num = Integer.toString(hashCode, 16);
        kotlin.jvm.internal.l.d(num, "toString(...)");
        sb2.append(num);
        if (str2 == null || (str = y.S.b("[", str2, "](")) == null) {
            str = "(";
        }
        sb2.append(str);
        sb2.append("currentBounds()=");
        sb2.append(this.f27979a.invoke());
        sb2.append(", continuation=");
        sb2.append(c0944m);
        sb2.append(')');
        return sb2.toString();
    }
}
