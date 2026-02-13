package k8;

import android.text.TextUtils;
import ea.C1111f;
import java.io.IOException;
import java.util.Iterator;
import l8.C1513b;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f19034b;

    public /* synthetic */ c(d dVar, int i7) {
        this.f19033a = i7;
        this.f19034b = dVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C1513b k;
        C1513b g;
        switch (this.f19033a) {
            case 0:
                this.f19034b.a();
                return;
            case 1:
                this.f19034b.a();
                return;
            default:
                d dVar = this.f19034b;
                dVar.getClass();
                Object obj = d.f19035m;
                synchronized (obj) {
                    try {
                        Y6.i iVar = dVar.f19036a;
                        iVar.b();
                        C1111f g2 = C1111f.g(iVar.f12041a);
                        try {
                            k = dVar.f19038c.k();
                            if (g2 != null) {
                                g2.y();
                            }
                        } catch (Throwable th) {
                            if (g2 != null) {
                                g2.y();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i7 = k.f19601b;
                    if (!(i7 == 5)) {
                        if (!(i7 == 3)) {
                            if (dVar.f19039d.a(k)) {
                                g = dVar.b(k);
                                synchronized (obj) {
                                    try {
                                        Y6.i iVar2 = dVar.f19036a;
                                        iVar2.b();
                                        C1111f g10 = C1111f.g(iVar2.f12041a);
                                        try {
                                            dVar.f19038c.g(g);
                                            if (g10 != null) {
                                                g10.y();
                                            }
                                        } catch (Throwable th2) {
                                            if (g10 != null) {
                                                g10.y();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (dVar) {
                                    try {
                                        if (dVar.k.size() != 0 && !TextUtils.equals(k.f19600a, g.f19600a)) {
                                            Iterator it = dVar.k.iterator();
                                            if (it.hasNext()) {
                                                if (it.next() != null) {
                                                    throw new ClassCastException();
                                                }
                                                throw null;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                if (g.f19601b == 4) {
                                    String str = g.f19600a;
                                    synchronized (dVar) {
                                        dVar.j = str;
                                    }
                                }
                                int i10 = g.f19601b;
                                if (i10 == 5) {
                                    dVar.h(new Exception());
                                    return;
                                } else if (i10 == 2 || i10 == 1) {
                                    dVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    dVar.i(g);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g = dVar.g(k);
                    synchronized (obj) {
                    }
                } catch (f e2) {
                    dVar.h(e2);
                    return;
                }
                break;
        }
    }
}
