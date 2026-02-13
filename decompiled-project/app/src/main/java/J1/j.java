package J1;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final l f5426a;

    public j(k kVar, int i7, ReferenceQueue referenceQueue) {
        this.f5426a = new l(kVar, i7, this, referenceQueue);
    }

    public final void a(a aVar) {
        synchronized (aVar) {
            try {
                if (aVar.f5415a == null) {
                    aVar.f5415a = new g();
                }
            } finally {
            }
        }
        g gVar = aVar.f5415a;
        synchronized (gVar) {
            try {
                int lastIndexOf = gVar.f5419a.lastIndexOf(this);
                if (lastIndexOf >= 0) {
                    if (gVar.a(lastIndexOf)) {
                    }
                }
                gVar.f5419a.add(this);
            } finally {
            }
        }
    }
}
