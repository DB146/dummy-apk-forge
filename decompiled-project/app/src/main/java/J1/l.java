package J1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final j f5440a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5441b;

    /* renamed from: c, reason: collision with root package name */
    public a f5442c;

    public l(k kVar, int i7, j jVar, ReferenceQueue referenceQueue) {
        super(kVar, referenceQueue);
        this.f5441b = i7;
        this.f5440a = jVar;
    }

    public final boolean a() {
        boolean z8;
        a aVar = this.f5442c;
        if (aVar != null) {
            j jVar = this.f5440a;
            jVar.getClass();
            synchronized (aVar) {
                try {
                    g gVar = aVar.f5415a;
                    if (gVar != null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.f5422d == 0) {
                                    gVar.f5419a.remove(jVar);
                                } else {
                                    int lastIndexOf = gVar.f5419a.lastIndexOf(jVar);
                                    if (lastIndexOf >= 0) {
                                        gVar.f(lastIndexOf);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
            z8 = true;
        } else {
            z8 = false;
        }
        this.f5442c = null;
        return z8;
    }
}
