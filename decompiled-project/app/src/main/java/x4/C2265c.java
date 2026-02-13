package x4;

import A4.f;
import s4.r;
import s4.s;
import s4.t;

/* renamed from: x4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2265c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f26214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f26215b;

    public C2265c(f fVar, s sVar) {
        this.f26215b = fVar;
        this.f26214a = sVar;
    }

    @Override // s4.s
    public final boolean g() {
        return this.f26214a.g();
    }

    @Override // s4.s
    public final r h(long j) {
        r h10 = this.f26214a.h(j);
        t tVar = h10.f24084a;
        long j10 = tVar.f24087a;
        long j11 = tVar.f24088b;
        long j12 = this.f26215b.f382b;
        t tVar2 = new t(j10, j11 + j12);
        t tVar3 = h10.f24085b;
        return new r(tVar2, new t(tVar3.f24087a, tVar3.f24088b + j12));
    }

    @Override // s4.s
    public final long i() {
        return this.f26214a.i();
    }
}
