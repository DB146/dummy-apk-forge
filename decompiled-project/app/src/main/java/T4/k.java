package T4;

import N6.H;
import java.util.ArrayList;
import m4.L;

/* loaded from: classes.dex */
public final class k extends m implements S4.i {

    /* renamed from: f, reason: collision with root package name */
    public final n f9289f;

    public k(L l10, H h10, n nVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(l10, h10, nVar, arrayList, arrayList2, arrayList3);
        this.f9289f = nVar;
    }

    @Override // T4.m
    public final String a() {
        return null;
    }

    @Override // S4.i
    public final long b(long j) {
        return this.f9289f.g(j);
    }

    @Override // S4.i
    public final long c(long j, long j10) {
        return this.f9289f.f(j, j10);
    }

    @Override // T4.m
    public final S4.i d() {
        return this;
    }

    @Override // T4.m
    public final j e() {
        return null;
    }

    @Override // S4.i
    public final long g(long j, long j10) {
        return this.f9289f.e(j, j10);
    }

    @Override // S4.i
    public final long l(long j, long j10) {
        return this.f9289f.c(j, j10);
    }

    @Override // S4.i
    public final long o(long j, long j10) {
        n nVar = this.f9289f;
        if (nVar.f9299f != null) {
            return -9223372036854775807L;
        }
        long b2 = nVar.b(j, j10) + nVar.c(j, j10);
        return (nVar.e(b2, j) + nVar.g(b2)) - nVar.f9301i;
    }

    @Override // S4.i
    public final j p(long j) {
        return this.f9289f.h(this, j);
    }

    @Override // S4.i
    public final boolean s() {
        return this.f9289f.i();
    }

    @Override // S4.i
    public final long v() {
        return this.f9289f.f9297d;
    }

    @Override // S4.i
    public final long y(long j) {
        return this.f9289f.d(j);
    }

    @Override // S4.i
    public final long z(long j, long j10) {
        return this.f9289f.b(j, j10);
    }
}
