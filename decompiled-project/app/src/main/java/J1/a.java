package J1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public transient g f5415a;

    public final void a(int i7) {
        synchronized (this) {
            try {
                g gVar = this.f5415a;
                if (gVar == null) {
                    return;
                }
                gVar.b(i7, this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
