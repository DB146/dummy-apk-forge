package w;

import Q.W;
import x.a0;
import x.b0;
import y0.AbstractC2323H;
import y0.InterfaceC2317B;

/* renamed from: w.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2186m extends M {

    /* renamed from: C, reason: collision with root package name */
    public b0 f25586C;

    /* renamed from: D, reason: collision with root package name */
    public W f25587D;

    /* renamed from: E, reason: collision with root package name */
    public C2187n f25588E;

    /* renamed from: F, reason: collision with root package name */
    public long f25589F;

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(A0.T t5, y0.z zVar, long j) {
        long j10;
        AbstractC2323H b2 = zVar.b(j);
        if (t5.m()) {
            j10 = (b2.f26554a << 32) | (b2.f26555b & 4294967295L);
        } else {
            b0 b0Var = this.f25586C;
            if (b0Var == null) {
                j10 = (b2.f26554a << 32) | (b2.f26555b & 4294967295L);
                this.f25589F = j10;
            } else {
                long j11 = (b2.f26555b & 4294967295L) | (b2.f26554a << 32);
                a0 a9 = b0Var.a(new C2185l(this, j11, 0), new C2185l(this, j11, 1));
                this.f25588E.getClass();
                j10 = ((V0.k) a9.getValue()).f9981a;
                this.f25589F = ((V0.k) a9.getValue()).f9981a;
            }
        }
        return t5.Q((int) (j10 >> 32), (int) (4294967295L & j10), Eb.w.f3892a, new C2184k(this, b2, j10));
    }

    @Override // c0.l
    public final void j0() {
        this.f25589F = androidx.compose.animation.a.f13122a;
    }
}
