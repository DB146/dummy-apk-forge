package N;

import A0.AbstractC0017g;
import t8.C2034c;
import x.o0;

/* renamed from: N.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418h extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0419i f7045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0418h(C0419i c0419i, int i7) {
        super(0);
        this.f7044a = i7;
        this.f7045b = c0419i;
    }

    @Override // Rb.a
    public final Object invoke() {
        C0419i c0419i = this.f7045b;
        switch (this.f7044a) {
            case 0:
                return p.f7066a;
            default:
                if (((o) AbstractC0017g.h(c0419i, q.f7068b)) == null) {
                    M.b bVar = c0419i.f7050I;
                    if (bVar != null) {
                        c0419i.q0(bVar);
                    }
                } else if (c0419i.f7050I == null) {
                    C2034c c2034c = new C2034c(c0419i, 25);
                    C0418h c0418h = new C0418h(c0419i, 0);
                    o0 o0Var = M.k.f6506a;
                    M.b bVar2 = new M.b(c0419i.f7046E, c0419i.f7047F, c0419i.f7048G, c2034c, c0418h);
                    c0419i.p0(bVar2);
                    c0419i.f7050I = bVar2;
                }
                return Db.q.f3365a;
        }
    }
}
