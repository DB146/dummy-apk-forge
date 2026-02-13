package ob;

import gb.AbstractC1204a;
import o7.o;
import y7.u0;

/* renamed from: ob.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1837e extends AbstractC1204a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22213a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22214b;

    public /* synthetic */ C1837e(Object obj, int i7) {
        this.f22213a = i7;
        this.f22214b = obj;
    }

    @Override // gb.AbstractC1204a
    public final void d(gb.b bVar) {
        switch (this.f22213a) {
            case 0:
                C1836d c1836d = new C1836d(bVar);
                bVar.c(c1836d);
                try {
                    ((gb.c) this.f22214b).b(c1836d);
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    if (c1836d.d(th)) {
                        return;
                    }
                    com.bumptech.glide.d.t(th);
                    return;
                }
            case 1:
                ((pb.g) this.f22214b).a(new C1839g(bVar, 0));
                return;
            default:
                ((AbstractC1204a) this.f22214b).c(new o(bVar, 1));
                return;
        }
    }
}
