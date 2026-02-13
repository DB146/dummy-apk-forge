package F6;

import A8.f0;

/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4161c;

    public /* synthetic */ m(Object obj, int i7) {
        this.f4160b = i7;
        this.f4161c = obj;
    }

    @Override // F6.k
    public final void a() {
        switch (this.f4160b) {
            case 0:
                synchronized (((o) this.f4161c).f4170f) {
                    try {
                        if (((o) this.f4161c).k.get() > 0 && ((o) this.f4161c).k.decrementAndGet() > 0) {
                            ((o) this.f4161c).f4166b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        o oVar = (o) this.f4161c;
                        if (oVar.f4174m != null) {
                            oVar.f4166b.c("Unbind from service.", new Object[0]);
                            o oVar2 = (o) this.f4161c;
                            oVar2.f4165a.unbindService(oVar2.f4173l);
                            o oVar3 = (o) this.f4161c;
                            oVar3.g = false;
                            oVar3.f4174m = null;
                            oVar3.f4173l = null;
                        }
                        ((o) this.f4161c).d();
                        return;
                    } finally {
                    }
                }
            default:
                o oVar4 = (o) ((f0) this.f4161c).f660b;
                oVar4.f4166b.c("unlinkToDeath", new Object[0]);
                oVar4.f4174m.asBinder().unlinkToDeath(oVar4.j, 0);
                oVar4.f4174m = null;
                oVar4.g = false;
                return;
        }
    }
}
