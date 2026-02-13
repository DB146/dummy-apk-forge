package l2;

import android.os.Looper;
import p.C1843a;
import p.C1844b;

/* loaded from: classes.dex */
public class H extends AbstractC1456G {
    @Override // l2.AbstractC1456G
    public void k(Object obj) {
        AbstractC1456G.a("setValue");
        this.g++;
        this.f19164e = obj;
        c(null);
    }

    public final void l(Object obj) {
        boolean z8;
        synchronized (this.f19160a) {
            z8 = this.f19165f == AbstractC1456G.k;
            this.f19165f = obj;
        }
        if (z8) {
            C1843a a02 = C1843a.a0();
            RunnableC1452C runnableC1452C = this.j;
            C1844b c1844b = a02.f22964c;
            if (c1844b.f22967e == null) {
                synchronized (c1844b.f22965c) {
                    try {
                        if (c1844b.f22967e == null) {
                            c1844b.f22967e = C1844b.a0(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            c1844b.f22967e.post(runnableC1452C);
        }
    }
}
