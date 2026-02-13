package L7;

import g3.C1191j;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q7.f f6342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f6343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1191j f6344c;

    public g(C1191j c1191j, Q7.f fVar, E e2) {
        this.f6344c = c1191j;
        this.f6342a = fVar;
        this.f6343b = e2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1191j c1191j = this.f6344c;
        D5.i iVar = (D5.i) ((j) c1191j.f17441b).f6359e;
        Q7.f fVar = this.f6342a;
        T7.s sVar = (T7.s) iVar.f3256b;
        C0385e c0385e = fVar.f8685a;
        T7.s k = sVar.k(c0385e);
        if (k.isEmpty()) {
            return;
        }
        j jVar = (j) c1191j.f17441b;
        jVar.f(((z) jVar.f6363l).e(c0385e, k));
        this.f6343b.c(null);
    }
}
