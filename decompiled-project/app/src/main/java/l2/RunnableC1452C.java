package l2;

/* renamed from: l2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1452C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1456G f19153a;

    public RunnableC1452C(AbstractC1456G abstractC1456G) {
        this.f19153a = abstractC1456G;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f19153a.f19160a) {
            obj = this.f19153a.f19165f;
            this.f19153a.f19165f = AbstractC1456G.k;
        }
        this.f19153a.k(obj);
    }
}
