package sb;

import Y5.C0658x;
import rb.C1956c;

/* renamed from: sb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2009c extends AbstractC2007a {

    /* renamed from: b, reason: collision with root package name */
    public final int f24254b;

    public C2009c(gb.i iVar, int i7) {
        super(iVar);
        this.f24254b = Math.max(8, i7);
    }

    @Override // gb.i
    public final void p(gb.l lVar) {
        C0658x c0658x = lb.b.f19612a;
        gb.k kVar = this.f24251a;
        if (E6.b.D(kVar, lVar, c0658x)) {
            return;
        }
        kVar.b(new C1956c(lVar, this.f24254b));
    }
}
