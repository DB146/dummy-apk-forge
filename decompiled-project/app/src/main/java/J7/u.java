package J7;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f5643b;

    public /* synthetic */ u(w wVar, int i7) {
        this.f5642a = i7;
        this.f5643b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5642a) {
            case 0:
                w wVar = this.f5643b;
                if (wVar.f5647b || wVar.f5648c) {
                    return;
                }
                Q7.h hVar = wVar.j;
                if (hVar.H()) {
                    hVar.p("timed out on connect", null, new Object[0]);
                }
                ((U7.d) wVar.f5646a.f23371b).a();
                return;
            default:
                w wVar2 = this.f5643b;
                q3.c cVar = wVar2.f5646a;
                if (cVar != null) {
                    cVar.A("0");
                    wVar2.e();
                    return;
                }
                return;
        }
    }
}
