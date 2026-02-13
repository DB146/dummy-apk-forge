package J7;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q3.c f5645b;

    public /* synthetic */ v(q3.c cVar, int i7) {
        this.f5644a = i7;
        this.f5645b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5644a) {
            case 0:
                q3.c cVar = this.f5645b;
                ((w) cVar.f23372c).f5652h.cancel(false);
                w wVar = (w) cVar.f23372c;
                wVar.f5647b = true;
                if (wVar.j.H()) {
                    ((w) cVar.f23372c).j.p("websocket opened", null, new Object[0]);
                }
                ((w) cVar.f23372c).e();
                return;
            default:
                q3.c cVar2 = this.f5645b;
                if (((w) cVar2.f23372c).j.H()) {
                    ((w) cVar2.f23372c).j.p("closed", null, new Object[0]);
                }
                w.a((w) cVar2.f23372c);
                return;
        }
    }
}
