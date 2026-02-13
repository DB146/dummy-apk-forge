package C3;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2589a;

    /* renamed from: b, reason: collision with root package name */
    public final S3.g f2590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f2591c;

    public /* synthetic */ o(r rVar, S3.g gVar, int i7) {
        this.f2589a = i7;
        this.f2591c = rVar;
        this.f2590b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0238d c0238d;
        switch (this.f2589a) {
            case 0:
                S3.g gVar = this.f2590b;
                gVar.f9021b.a();
                synchronized (gVar.f9022c) {
                    synchronized (this.f2591c) {
                        try {
                            q qVar = this.f2591c.f2606a;
                            S3.g gVar2 = this.f2590b;
                            qVar.getClass();
                            if (qVar.f2594a.contains(new p(gVar2, W3.g.f10606b))) {
                                r rVar = this.f2591c;
                                S3.g gVar3 = this.f2590b;
                                rVar.getClass();
                                try {
                                    gVar3.j(rVar.f2600E, 5);
                                } finally {
                                }
                            }
                            this.f2591c.d();
                        } finally {
                        }
                    }
                }
                return;
            default:
                S3.g gVar4 = this.f2590b;
                gVar4.f9021b.a();
                synchronized (gVar4.f9022c) {
                    synchronized (this.f2591c) {
                        try {
                            q qVar2 = this.f2591c.f2606a;
                            S3.g gVar5 = this.f2590b;
                            qVar2.getClass();
                            if (qVar2.f2594a.contains(new p(gVar5, W3.g.f10606b))) {
                                this.f2591c.f2602G.a();
                                r rVar2 = this.f2591c;
                                S3.g gVar6 = this.f2590b;
                                rVar2.getClass();
                                try {
                                    gVar6.k(rVar2.f2602G, rVar2.f2598C, rVar2.f2605J);
                                    this.f2591c.h(this.f2590b);
                                } finally {
                                }
                            }
                            this.f2591c.d();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
