package sb;

import kb.C1436a;

/* renamed from: sb.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2002A extends AbstractC2007a {

    /* renamed from: b, reason: collision with root package name */
    public final long f24231b;

    public C2002A(gb.i iVar, long j) {
        super(iVar);
        this.f24231b = j;
    }

    @Override // gb.i
    public final void p(gb.l lVar) {
        C1436a c1436a = new C1436a();
        lVar.c(c1436a);
        new z(lVar, this.f24231b, c1436a, this.f24251a).b();
    }
}
