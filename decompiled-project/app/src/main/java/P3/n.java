package P3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f7835a;

    public n(p pVar) {
        this.f7835a = pVar;
    }

    @Override // P3.a
    public final void a(boolean z8) {
        ArrayList arrayList;
        W3.o.a();
        synchronized (this.f7835a) {
            arrayList = new ArrayList((HashSet) this.f7835a.f7843d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z8);
        }
    }
}
