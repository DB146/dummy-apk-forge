package w;

import Q.C0480b;
import Q.C0487e0;
import x.p0;
import y0.AbstractC2323H;
import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class S extends M {

    /* renamed from: C, reason: collision with root package name */
    public x.Q f25533C;

    /* renamed from: F, reason: collision with root package name */
    public boolean f25536F;

    /* renamed from: D, reason: collision with root package name */
    public long f25534D = androidx.compose.animation.c.f13124a;

    /* renamed from: E, reason: collision with root package name */
    public long f25535E = V0.b.b(0, 0, 15);

    /* renamed from: G, reason: collision with root package name */
    public final C0487e0 f25537G = C0480b.o(null);

    public S(x.Q q10) {
        this.f25533C = q10;
    }

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(A0.T t5, y0.z zVar, long j) {
        y0.z zVar2;
        long j10;
        AbstractC2323H b2;
        long j11;
        O o10;
        long d10;
        char c10;
        O o11;
        if (t5.m()) {
            this.f25535E = j;
            this.f25536F = true;
            b2 = zVar.b(j);
        } else {
            if (this.f25536F) {
                j10 = this.f25535E;
                zVar2 = zVar;
            } else {
                zVar2 = zVar;
                j10 = j;
            }
            b2 = zVar2.b(j10);
        }
        AbstractC2323H abstractC2323H = b2;
        long j12 = (abstractC2323H.f26555b & 4294967295L) | (abstractC2323H.f26554a << 32);
        if (t5.m()) {
            this.f25534D = j12;
            c10 = ' ';
            d10 = j12;
            j11 = d10;
        } else {
            long j13 = !V0.k.a(this.f25534D, androidx.compose.animation.c.f13124a) ? this.f25534D : j12;
            C0487e0 c0487e0 = this.f25537G;
            O o12 = (O) c0487e0.getValue();
            if (o12 != null) {
                Y.k kVar = o12.f25521a;
                boolean z8 = (V0.k.a(j13, ((V0.k) kVar.g()).f9981a) || ((Boolean) ((C0487e0) kVar.f11057d).getValue()).booleanValue()) ? false : true;
                j11 = j12;
                if (!V0.k.a(j13, ((V0.k) ((C0487e0) kVar.f11058e).getValue()).f9981a) || z8) {
                    o12.f25522b = ((V0.k) kVar.g()).f9981a;
                    o11 = o12;
                    cc.F.B(d0(), null, 0, new P(o12, j13, this, null), 3);
                } else {
                    o11 = o12;
                }
                o10 = o11;
            } else {
                j11 = j12;
                long j14 = 1;
                o10 = new O(new Y.k(new V0.k(j13), p0.f26147h, new V0.k((j14 & 4294967295L) | (j14 << 32)), 8), j13);
            }
            c0487e0.setValue(o10);
            d10 = V0.b.d(j, ((V0.k) o10.f25521a.g()).f9981a);
            c10 = ' ';
        }
        int i7 = (int) (d10 >> c10);
        int i10 = (int) (d10 & 4294967295L);
        return t5.Q(i7, i10, Eb.w.f3892a, new Q(this, j11, i7, i10, t5, abstractC2323H));
    }

    @Override // c0.l
    public final void h0() {
        this.f25534D = androidx.compose.animation.c.f13124a;
        this.f25536F = false;
    }

    @Override // c0.l
    public final void j0() {
        this.f25537G.setValue(null);
    }
}
