package i3;

import A9.N2;
import P4.G;
import Y5.J0;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import cc.C0943l0;
import cc.F;
import ea.C1108c;
import h3.C1240b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p3.C1847a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: l, reason: collision with root package name */
    public static final String f18341l = h3.z.g("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f18343b;

    /* renamed from: c, reason: collision with root package name */
    public final C1240b f18344c;

    /* renamed from: d, reason: collision with root package name */
    public final q3.i f18345d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f18346e;
    public final HashMap g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f18347f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f18349i = new HashSet();
    public final ArrayList j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f18342a = null;
    public final Object k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f18348h = new HashMap();

    public d(Context context, C1240b c1240b, q3.i iVar, WorkDatabase workDatabase) {
        this.f18343b = context;
        this.f18344c = c1240b;
        this.f18345d = iVar;
        this.f18346e = workDatabase;
    }

    public static boolean d(String str, C1340B c1340b, int i7) {
        String str2 = f18341l;
        if (c1340b == null) {
            h3.z.e().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        c1340b.f18327m.q(new r(i7));
        h3.z.e().a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(InterfaceC1342a interfaceC1342a) {
        synchronized (this.k) {
            this.j.add(interfaceC1342a);
        }
    }

    public final C1340B b(String str) {
        C1340B c1340b = (C1340B) this.f18347f.remove(str);
        boolean z8 = c1340b != null;
        if (!z8) {
            c1340b = (C1340B) this.g.remove(str);
        }
        this.f18348h.remove(str);
        if (z8) {
            synchronized (this.k) {
                try {
                    if (this.f18347f.isEmpty()) {
                        Context context = this.f18343b;
                        String str2 = C1847a.f23035x;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f18343b.startService(intent);
                        } catch (Throwable th) {
                            h3.z.e().d(f18341l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f18342a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f18342a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return c1340b;
    }

    public final C1340B c(String str) {
        C1340B c1340b = (C1340B) this.f18347f.get(str);
        return c1340b == null ? (C1340B) this.g.get(str) : c1340b;
    }

    public final boolean e(String str) {
        boolean z8;
        synchronized (this.k) {
            z8 = c(str) != null;
        }
        return z8;
    }

    public final void f(InterfaceC1342a interfaceC1342a) {
        synchronized (this.k) {
            this.j.remove(interfaceC1342a);
        }
    }

    public final boolean g(i iVar, C1108c c1108c) {
        q3.j jVar = iVar.f18357a;
        String str = jVar.f23386a;
        ArrayList arrayList = new ArrayList();
        q3.p pVar = (q3.p) this.f18346e.u(new N2(new CallableC1344c(this, arrayList, str, 0), 8));
        if (pVar == null) {
            h3.z.e().h(f18341l, "Didn't find WorkSpec for id " + jVar);
            ((J0) this.f18345d.f23385d).execute(new Aa.j(18, this, jVar));
            return false;
        }
        synchronized (this.k) {
            try {
                if (e(str)) {
                    Set set = (Set) this.f18348h.get(str);
                    if (((i) set.iterator().next()).f18357a.f23387b == jVar.f23387b) {
                        set.add(iVar);
                        h3.z.e().a(f18341l, "Work " + jVar + " is already enqueued for processing");
                    } else {
                        ((J0) this.f18345d.f23385d).execute(new Aa.j(18, this, jVar));
                    }
                    return false;
                }
                if (pVar.f23419t != jVar.f23387b) {
                    ((J0) this.f18345d.f23385d).execute(new Aa.j(18, this, jVar));
                    return false;
                }
                C1340B c1340b = new C1340B(new B7.d(this.f18343b, this.f18344c, this.f18345d, this, this.f18346e, pVar, arrayList));
                cc.A a9 = (cc.A) c1340b.f18321d.f23383b;
                C0943l0 c10 = F.c();
                a9.getClass();
                a1.l t5 = q3.f.t(E6.b.w(a9, c10), new y(c1340b, null));
                t5.f12477b.a(new G(this, t5, c1340b, 6), (J0) this.f18345d.f23385d);
                this.g.put(str, c1340b);
                HashSet hashSet = new HashSet();
                hashSet.add(iVar);
                this.f18348h.put(str, hashSet);
                h3.z.e().a(f18341l, d.class.getSimpleName() + ": processing " + jVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
