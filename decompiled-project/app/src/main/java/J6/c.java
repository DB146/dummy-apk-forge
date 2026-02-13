package J6;

import A8.f0;

/* loaded from: classes.dex */
public final class c extends z {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5541u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5542v;

    public /* synthetic */ c(Object obj, int i7) {
        this.f5541u = i7;
        this.f5542v = obj;
    }

    @Override // J6.z
    public final void b() {
        switch (this.f5541u) {
            case 0:
                d dVar = (d) ((f0) this.f5542v).f660b;
                dVar.f5545b.b("unlinkToDeath", new Object[0]);
                dVar.f5554n.asBinder().unlinkToDeath(dVar.k, 0);
                dVar.f5554n = null;
                dVar.g = false;
                return;
            default:
                synchronized (((d) this.f5542v).f5549f) {
                    try {
                        if (((d) this.f5542v).f5552l.get() > 0 && ((d) this.f5542v).f5552l.decrementAndGet() > 0) {
                            ((d) this.f5542v).f5545b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        d dVar2 = (d) this.f5542v;
                        if (dVar2.f5554n != null) {
                            dVar2.f5545b.b("Unbind from service.", new Object[0]);
                            d dVar3 = (d) this.f5542v;
                            dVar3.f5544a.unbindService(dVar3.f5553m);
                            d dVar4 = (d) this.f5542v;
                            dVar4.g = false;
                            dVar4.f5554n = null;
                            dVar4.f5553m = null;
                        }
                        ((d) this.f5542v).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}
