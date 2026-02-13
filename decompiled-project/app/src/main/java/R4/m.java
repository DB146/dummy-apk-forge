package R4;

import P4.c0;
import m4.L;
import m5.C1619p;
import m5.InterfaceC1616m;
import m5.S;
import n5.AbstractC1705a;
import q3.s;
import s4.C1979g;
import s4.v;

/* loaded from: classes.dex */
public final class m extends a {

    /* renamed from: C, reason: collision with root package name */
    public final int f8917C;

    /* renamed from: D, reason: collision with root package name */
    public final L f8918D;

    /* renamed from: E, reason: collision with root package name */
    public long f8919E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8920F;

    public m(InterfaceC1616m interfaceC1616m, C1619p c1619p, L l10, int i7, Object obj, long j, long j10, long j11, int i10, L l11) {
        super(interfaceC1616m, c1619p, l10, i7, obj, j, j10, -9223372036854775807L, -9223372036854775807L, j11);
        this.f8917C = i10;
        this.f8918D = l11;
    }

    @Override // m5.InterfaceC1603G
    public final void b() {
        S s3 = this.f8877w;
        s sVar = this.f8846A;
        AbstractC1705a.n(sVar);
        for (c0 c0Var : (c0[]) sVar.f23439c) {
            if (c0Var.f7995F != 0) {
                c0Var.f7995F = 0L;
                c0Var.f8019z = true;
            }
        }
        v G9 = sVar.G(this.f8917C);
        G9.a(this.f8918D);
        try {
            long d10 = s3.d(this.f8870b.b(this.f8919E));
            if (d10 != -1) {
                d10 += this.f8919E;
            }
            C1979g c1979g = new C1979g(this.f8877w, this.f8919E, d10);
            for (int i7 = 0; i7 != -1; i7 = G9.d(c1979g, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, true)) {
                this.f8919E += i7;
            }
            G9.e(this.f8875u, 1, (int) this.f8919E, 0, null);
            c2.i.f(s3);
            this.f8920F = true;
        } catch (Throwable th) {
            c2.i.f(s3);
            throw th;
        }
    }

    @Override // R4.k
    public final boolean c() {
        return this.f8920F;
    }

    @Override // m5.InterfaceC1603G
    public final void d() {
    }
}
