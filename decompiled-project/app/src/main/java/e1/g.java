package e1;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f16688m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f16683e = 2;
        } else {
            this.f16683e = 3;
        }
    }

    @Override // e1.f
    public final void d(int i7) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i7;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
