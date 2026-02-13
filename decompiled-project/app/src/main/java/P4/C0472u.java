package P4;

import m4.C1558a0;
import m4.J0;
import m4.K0;
import m4.L0;

/* renamed from: P4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472u extends L0 {

    /* renamed from: b, reason: collision with root package name */
    public final C1558a0 f8141b;

    public C0472u(C1558a0 c1558a0) {
        this.f8141b = c1558a0;
    }

    @Override // m4.L0
    public final int b(Object obj) {
        return obj == C0471t.f8138e ? 0 : -1;
    }

    @Override // m4.L0
    public final J0 f(int i7, J0 j02, boolean z8) {
        j02.i(z8 ? 0 : null, z8 ? C0471t.f8138e : null, 0, -9223372036854775807L, 0L, Q4.b.f8638f, true);
        return j02;
    }

    @Override // m4.L0
    public final int h() {
        return 1;
    }

    @Override // m4.L0
    public final Object l(int i7) {
        return C0471t.f8138e;
    }

    @Override // m4.L0
    public final K0 m(int i7, K0 k02, long j) {
        k02.b(K0.f19999F, this.f8141b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        k02.f20030z = true;
        return k02;
    }

    @Override // m4.L0
    public final int o() {
        return 1;
    }
}
