package W1;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: W1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581y extends A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R7.b f10571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f10573c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya.a f10574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya.j f10575e;

    public C0581y(ya.j jVar, R7.b bVar, AtomicReference atomicReference, O o10, ya.a aVar) {
        this.f10575e = jVar;
        this.f10571a = bVar;
        this.f10572b = atomicReference;
        this.f10573c = o10;
        this.f10574d = aVar;
    }

    @Override // W1.A
    public final void a() {
        StringBuilder sb2 = new StringBuilder("fragment_");
        ya.j jVar = this.f10575e;
        sb2.append(jVar.f10293f);
        sb2.append("_rq#");
        sb2.append(jVar.f10297i0.getAndIncrement());
        String sb3 = sb2.toString();
        ya.j jVar2 = (ya.j) this.f10571a.f8929b;
        F f4 = jVar2.f10266I;
        this.f10572b.set((f4 != null ? f4.f10314e.f14055w : jVar2.g0().f14055w).d(sb3, jVar, this.f10573c, this.f10574d));
    }
}
