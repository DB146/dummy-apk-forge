package gc;

/* loaded from: classes2.dex */
public final class E implements Hb.d, Jb.d {

    /* renamed from: a, reason: collision with root package name */
    public final Hb.d f17495a;

    /* renamed from: b, reason: collision with root package name */
    public final Hb.i f17496b;

    public E(Hb.d dVar, Hb.i iVar) {
        this.f17495a = dVar;
        this.f17496b = iVar;
    }

    @Override // Jb.d
    public final Jb.d getCallerFrame() {
        Hb.d dVar = this.f17495a;
        if (dVar instanceof Jb.d) {
            return (Jb.d) dVar;
        }
        return null;
    }

    @Override // Hb.d
    public final Hb.i getContext() {
        return this.f17496b;
    }

    @Override // Hb.d
    public final void resumeWith(Object obj) {
        this.f17495a.resumeWith(obj);
    }
}
