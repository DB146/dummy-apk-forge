package G8;

/* loaded from: classes.dex */
public final class y extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f4399a;

    public y(z zVar) {
        this.f4399a = zVar;
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() != 9) {
            return this.f4399a.b(aVar);
        }
        aVar.f0();
        return null;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        if (obj == null) {
            bVar.W();
        } else {
            this.f4399a.c(bVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f4399a + "]";
    }
}
