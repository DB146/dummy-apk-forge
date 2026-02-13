package P3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Set f7844a = Collections.newSetFromMap(new WeakHashMap());

    @Override // P3.i
    public final void c() {
        Iterator it = W3.o.e(this.f7844a).iterator();
        while (it.hasNext()) {
            ((T3.i) it.next()).c();
        }
    }

    @Override // P3.i
    public final void j() {
        Iterator it = W3.o.e(this.f7844a).iterator();
        while (it.hasNext()) {
            ((T3.i) it.next()).j();
        }
    }

    @Override // P3.i
    public final void k() {
        Iterator it = W3.o.e(this.f7844a).iterator();
        while (it.hasNext()) {
            ((T3.i) it.next()).k();
        }
    }
}
