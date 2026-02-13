package R4;

import P4.c0;
import m4.L;
import m5.C1619p;
import m5.InterfaceC1616m;
import m5.S;
import n5.AbstractC1705a;
import q3.s;
import s4.C1979g;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: C, reason: collision with root package name */
    public final int f8906C;

    /* renamed from: D, reason: collision with root package name */
    public final long f8907D;

    /* renamed from: E, reason: collision with root package name */
    public final d f8908E;

    /* renamed from: F, reason: collision with root package name */
    public long f8909F;

    /* renamed from: G, reason: collision with root package name */
    public volatile boolean f8910G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8911H;

    public i(InterfaceC1616m interfaceC1616m, C1619p c1619p, L l10, int i7, Object obj, long j, long j10, long j11, long j12, long j13, int i10, long j14, d dVar) {
        super(interfaceC1616m, c1619p, l10, i7, obj, j, j10, j11, j12, j13);
        this.f8906C = i10;
        this.f8907D = j14;
        this.f8908E = dVar;
    }

    @Override // R4.k
    public final long a() {
        return this.f8916x + this.f8906C;
    }

    @Override // m5.InterfaceC1603G
    public final void b() {
        if (this.f8909F == 0) {
            s sVar = this.f8846A;
            AbstractC1705a.n(sVar);
            long j = this.f8907D;
            for (c0 c0Var : (c0[]) sVar.f23439c) {
                if (c0Var.f7995F != j) {
                    c0Var.f7995F = j;
                    c0Var.f8019z = true;
                }
            }
            d dVar = this.f8908E;
            long j10 = this.f8848y;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f8907D;
            long j12 = this.f8849z;
            dVar.a(sVar, j11, j12 != -9223372036854775807L ? j12 - this.f8907D : -9223372036854775807L);
        }
        try {
            C1619p b2 = this.f8870b.b(this.f8909F);
            S s3 = this.f8877w;
            C1979g c1979g = new C1979g(s3, b2.f20632e, s3.d(b2));
            while (!this.f8910G) {
                try {
                    int e2 = this.f8908E.f8860a.e(c1979g, d.f8859x);
                    AbstractC1705a.m(e2 != 1);
                    if (!(e2 == 0)) {
                        break;
                    }
                } finally {
                    this.f8909F = c1979g.f24055d - this.f8870b.f20632e;
                }
            }
            c2.i.f(this.f8877w);
            this.f8911H = !this.f8910G;
        } catch (Throwable th) {
            c2.i.f(this.f8877w);
            throw th;
        }
    }

    @Override // R4.k
    public final boolean c() {
        return this.f8911H;
    }

    @Override // m5.InterfaceC1603G
    public final void d() {
        this.f8910G = true;
    }
}
