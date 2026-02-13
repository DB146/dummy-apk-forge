package qb;

import y7.u0;

/* loaded from: classes2.dex */
public final class d extends gb.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23598a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23599b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f23598a = i7;
        this.f23599b = obj;
    }

    @Override // gb.f
    public final void c(gb.g gVar) {
        switch (this.f23598a) {
            case 0:
                c cVar = new c(gVar);
                gVar.c(cVar);
                try {
                    ((gb.h) this.f23599b).f(cVar);
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    if (cVar.e(th)) {
                        return;
                    }
                    com.bumptech.glide.d.t(th);
                    return;
                }
            default:
                ((gb.p) this.f23599b).d(new i(gVar, 1));
                return;
        }
    }
}
