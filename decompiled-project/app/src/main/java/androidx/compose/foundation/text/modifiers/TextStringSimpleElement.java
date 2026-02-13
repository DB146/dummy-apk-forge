package androidx.compose.foundation.text.modifiers;

import A0.AbstractC0012d0;
import A0.AbstractC0017g;
import A3.c;
import J.g;
import K0.F;
import N0.d;
import c0.l;
import h3.o;
import tc.b;

/* loaded from: classes.dex */
public final class TextStringSimpleElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13177a;

    /* renamed from: b, reason: collision with root package name */
    public final F f13178b;

    /* renamed from: c, reason: collision with root package name */
    public final d f13179c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13180d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13181e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13182f;
    public final int g;

    public TextStringSimpleElement(String str, F f4, d dVar, int i7, boolean z8, int i10, int i11) {
        this.f13177a = str;
        this.f13178b = f4;
        this.f13179c = dVar;
        this.f13180d = i7;
        this.f13181e = z8;
        this.f13182f = i10;
        this.g = i11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J.g, c0.l] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f5402C = this.f13177a;
        lVar.f5403D = this.f13178b;
        lVar.f5404E = this.f13179c;
        lVar.f5405F = this.f13180d;
        lVar.f5406G = this.f13181e;
        lVar.f5407H = this.f13182f;
        lVar.f5408I = this.g;
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r4.f5855a.b(r1.f5855a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    @Override // A0.AbstractC0012d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(l lVar) {
        boolean z8;
        String str;
        String str2;
        F f4;
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        d dVar;
        d dVar2;
        int i13;
        int i14;
        g gVar = (g) lVar;
        gVar.getClass();
        boolean a9 = kotlin.jvm.internal.l.a(null, null);
        boolean z13 = false;
        boolean z14 = true;
        F f10 = this.f13178b;
        if (a9) {
            F f11 = gVar.f5403D;
            if (f10 == f11) {
                f10.getClass();
            }
            z8 = false;
            str = gVar.f5402C;
            str2 = this.f13177a;
            if (!kotlin.jvm.internal.l.a(str, str2)) {
                gVar.f5402C = str2;
                gVar.f5411M = null;
                z13 = true;
            }
            f4 = gVar.f5403D;
            f4.getClass();
            if (f4 != f10) {
                if (!kotlin.jvm.internal.l.a(f4.f5856b, f10.f5856b) || !f4.f5855a.a(f10.f5855a)) {
                    z10 = false;
                    boolean z15 = !z10;
                    gVar.f5403D = f10;
                    i7 = gVar.f5408I;
                    i10 = this.g;
                    if (i7 != i10) {
                        gVar.f5408I = i10;
                        z15 = true;
                    }
                    i11 = gVar.f5407H;
                    i12 = this.f13182f;
                    if (i11 != i12) {
                        gVar.f5407H = i12;
                        z15 = true;
                    }
                    z11 = gVar.f5406G;
                    z12 = this.f13181e;
                    if (z11 != z12) {
                        gVar.f5406G = z12;
                        z15 = true;
                    }
                    dVar = gVar.f5404E;
                    dVar2 = this.f13179c;
                    if (!kotlin.jvm.internal.l.a(dVar, dVar2)) {
                        gVar.f5404E = dVar2;
                        z15 = true;
                    }
                    i13 = gVar.f5405F;
                    i14 = this.f13180d;
                    if (b.t(i13, i14)) {
                        z14 = z15;
                    } else {
                        gVar.f5405F = i14;
                    }
                    if (!z13 || z14) {
                        J.d p02 = gVar.p0();
                        String str3 = gVar.f5402C;
                        F f12 = gVar.f5403D;
                        d dVar3 = gVar.f5404E;
                        int i15 = gVar.f5405F;
                        boolean z16 = gVar.f5406G;
                        int i16 = gVar.f5407H;
                        int i17 = gVar.f5408I;
                        p02.f5383a = str3;
                        p02.f5384b = f12;
                        p02.f5385c = dVar3;
                        p02.f5386d = i15;
                        p02.f5387e = z16;
                        p02.f5388f = i16;
                        p02.g = i17;
                        p02.a();
                    }
                    if (gVar.f14112B) {
                        if (z13 || (z8 && gVar.L != null)) {
                            AbstractC0017g.m(gVar);
                        }
                        if (z13 || z14) {
                            AbstractC0017g.l(gVar);
                            AbstractC0017g.k(gVar);
                        }
                        if (z8) {
                            AbstractC0017g.k(gVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z10 = true;
            boolean z152 = !z10;
            gVar.f5403D = f10;
            i7 = gVar.f5408I;
            i10 = this.g;
            if (i7 != i10) {
            }
            i11 = gVar.f5407H;
            i12 = this.f13182f;
            if (i11 != i12) {
            }
            z11 = gVar.f5406G;
            z12 = this.f13181e;
            if (z11 != z12) {
            }
            dVar = gVar.f5404E;
            dVar2 = this.f13179c;
            if (!kotlin.jvm.internal.l.a(dVar, dVar2)) {
            }
            i13 = gVar.f5405F;
            i14 = this.f13180d;
            if (b.t(i13, i14)) {
            }
            if (!z13) {
            }
            J.d p022 = gVar.p0();
            String str32 = gVar.f5402C;
            F f122 = gVar.f5403D;
            d dVar32 = gVar.f5404E;
            int i152 = gVar.f5405F;
            boolean z162 = gVar.f5406G;
            int i162 = gVar.f5407H;
            int i172 = gVar.f5408I;
            p022.f5383a = str32;
            p022.f5384b = f122;
            p022.f5385c = dVar32;
            p022.f5386d = i152;
            p022.f5387e = z162;
            p022.f5388f = i162;
            p022.g = i172;
            p022.a();
            if (gVar.f14112B) {
            }
        }
        z8 = true;
        str = gVar.f5402C;
        str2 = this.f13177a;
        if (!kotlin.jvm.internal.l.a(str, str2)) {
        }
        f4 = gVar.f5403D;
        f4.getClass();
        if (f4 != f10) {
        }
        z10 = true;
        boolean z1522 = !z10;
        gVar.f5403D = f10;
        i7 = gVar.f5408I;
        i10 = this.g;
        if (i7 != i10) {
        }
        i11 = gVar.f5407H;
        i12 = this.f13182f;
        if (i11 != i12) {
        }
        z11 = gVar.f5406G;
        z12 = this.f13181e;
        if (z11 != z12) {
        }
        dVar = gVar.f5404E;
        dVar2 = this.f13179c;
        if (!kotlin.jvm.internal.l.a(dVar, dVar2)) {
        }
        i13 = gVar.f5405F;
        i14 = this.f13180d;
        if (b.t(i13, i14)) {
        }
        if (!z13) {
        }
        J.d p0222 = gVar.p0();
        String str322 = gVar.f5402C;
        F f1222 = gVar.f5403D;
        d dVar322 = gVar.f5404E;
        int i1522 = gVar.f5405F;
        boolean z1622 = gVar.f5406G;
        int i1622 = gVar.f5407H;
        int i1722 = gVar.f5408I;
        p0222.f5383a = str322;
        p0222.f5384b = f1222;
        p0222.f5385c = dVar322;
        p0222.f5386d = i1522;
        p0222.f5387e = z1622;
        p0222.f5388f = i1622;
        p0222.g = i1722;
        p0222.a();
        if (gVar.f14112B) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        textStringSimpleElement.getClass();
        return kotlin.jvm.internal.l.a(null, null) && kotlin.jvm.internal.l.a(this.f13177a, textStringSimpleElement.f13177a) && kotlin.jvm.internal.l.a(this.f13178b, textStringSimpleElement.f13178b) && kotlin.jvm.internal.l.a(this.f13179c, textStringSimpleElement.f13179c) && b.t(this.f13180d, textStringSimpleElement.f13180d) && this.f13181e == textStringSimpleElement.f13181e && this.f13182f == textStringSimpleElement.f13182f && this.g == textStringSimpleElement.g;
    }

    public final int hashCode() {
        return (((o.g(this.f13181e, c.c(this.f13180d, (this.f13179c.hashCode() + ((this.f13178b.hashCode() + (this.f13177a.hashCode() * 31)) * 31)) * 31, 31), 31) + this.f13182f) * 31) + this.g) * 31;
    }
}
