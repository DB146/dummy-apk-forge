package M9;

import jb.InterfaceC1390a;
import ob.C1836d;
import sb.C2010d;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements gb.c, gb.j, InterfaceC1390a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f6886b;

    public /* synthetic */ m(t tVar, int i7) {
        this.f6885a = i7;
        this.f6886b = tVar;
    }

    @Override // gb.c
    public void b(C1836d c1836d) {
        t tVar = this.f6886b;
        while (tVar.h().size() > 5 && !c1836d.g() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Exception e2) {
                if (c1836d.g() || Thread.currentThread().isInterrupted() || c1836d.d(e2)) {
                    return;
                }
                com.bumptech.glide.d.t(e2);
                return;
            }
        }
        if (c1836d.g() || Thread.currentThread().isInterrupted()) {
            return;
        }
        c1836d.a();
    }

    @Override // gb.j
    public void d(C2010d c2010d) {
        t tVar = this.f6886b;
        tVar.f6918e.a().addOnSuccessListener(new A1.d(new Aa.t(6, tVar, c2010d), 25)).addOnFailureListener(new A1.d(c2010d, 26));
    }

    @Override // jb.InterfaceC1390a
    public void run() {
        switch (this.f6885a) {
            case 2:
                ((R9.b) this.f6886b.f6915b).b(Boolean.TRUE, "beta_insert_default_source");
                return;
            default:
                t t5 = this.f6886b;
                kotlin.jvm.internal.l.e(t5, "t");
                return;
        }
    }
}
