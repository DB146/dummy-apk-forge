package o0;

import V0.k;
import a.AbstractC0672a;
import android.graphics.Bitmap;
import h3.o;
import j0.AbstractC1362A;
import j0.i;
import kotlin.jvm.internal.l;
import l0.InterfaceC1445d;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1773a extends AbstractC1775c {

    /* renamed from: e, reason: collision with root package name */
    public final R7.b f21651e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21652f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final long f21653h;

    /* renamed from: i, reason: collision with root package name */
    public float f21654i;
    public i j;

    public C1773a(R7.b bVar) {
        int i7;
        int i10;
        Bitmap bitmap = (Bitmap) bVar.f8929b;
        long width = (bitmap.getWidth() << 32) | (bitmap.getHeight() & 4294967295L);
        this.f21651e = bVar;
        this.f21652f = width;
        this.g = 1;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i7 = (int) (width >> 32)) < 0 || (i10 = (int) (width & 4294967295L)) < 0 || i7 > bitmap.getWidth() || i10 > bitmap.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f21653h = width;
        this.f21654i = 1.0f;
    }

    @Override // o0.AbstractC1775c
    public final void a(float f4) {
        this.f21654i = f4;
    }

    @Override // o0.AbstractC1775c
    public final void b(i iVar) {
        this.j = iVar;
    }

    @Override // o0.AbstractC1775c
    public final long e() {
        return AbstractC0672a.u(this.f21653h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1773a)) {
            return false;
        }
        C1773a c1773a = (C1773a) obj;
        return l.a(this.f21651e, c1773a.f21651e) && V0.i.a(0L, 0L) && k.a(this.f21652f, c1773a.f21652f) && AbstractC1362A.k(this.g, c1773a.g);
    }

    @Override // o0.AbstractC1775c
    public final void f(InterfaceC1445d interfaceC1445d) {
        int round = Math.round(Float.intBitsToFloat((int) (interfaceC1445d.v() >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (interfaceC1445d.v() & 4294967295L)));
        float f4 = this.f21654i;
        i iVar = this.j;
        InterfaceC1445d.Y(interfaceC1445d, this.f21651e, this.f21652f, (round << 32) | (round2 & 4294967295L), f4, iVar, this.g, 328);
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + o.f(o.f(this.f21651e.hashCode() * 31, 31, 0L), 31, this.f21652f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f21651e);
        sb2.append(", srcOffset=");
        sb2.append((Object) V0.i.d(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) k.b(this.f21652f));
        sb2.append(", filterQuality=");
        int i7 = this.g;
        sb2.append((Object) (AbstractC1362A.k(i7, 0) ? "None" : AbstractC1362A.k(i7, 1) ? "Low" : AbstractC1362A.k(i7, 2) ? "Medium" : AbstractC1362A.k(i7, 3) ? "High" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
