package hc;

import I2.K;
import android.app.Application;
import android.graphics.Typeface;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import cc.F;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import fb.C1151e;
import hb.InterfaceC1269b;
import i1.C1290a;
import i3.C1340B;
import j3.C1372a;
import java.lang.reflect.Method;
import java.util.Iterator;
import kb.C1436a;
import kb.EnumC1437b;
import l2.X;
import o7.C1818h;
import o8.C1824b;
import p3.C1847a;
import r2.C1916a;
import s2.RunnableC1971a;

/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17947a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17948b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17949c;

    public /* synthetic */ i(int i7, Object obj, Object obj2) {
        this.f17947a = i7;
        this.f17949c = obj;
        this.f17948b = obj2;
    }

    public /* synthetic */ i(int i7, Object obj, Object obj2, boolean z8) {
        this.f17947a = i7;
        this.f17948b = obj;
        this.f17949c = obj2;
    }

    public i(C1818h c1818h, String str) {
        this.f17947a = 6;
        this.f17949c = c1818h;
        G.d(str);
        this.f17948b = str;
    }

    public i(q7.j jVar) {
        this.f17947a = 8;
        this.f17949c = jVar;
    }

    private final void a() {
        try {
            ((Runnable) this.f17948b).run();
            synchronized (((K) this.f17949c).f5053b) {
                ((K) this.f17949c).a();
            }
        } catch (Throwable th) {
            synchronized (((K) this.f17949c).f5053b) {
                ((K) this.f17949c).a();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        ((java.lang.Runnable) r10.f17948b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        r10.f17948b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        q7.j.f23537f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f17948b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b() {
        boolean z8 = false;
        boolean z10 = false;
        while (true) {
            try {
                synchronized (((q7.j) this.f17949c).f23539b) {
                    if (!z8) {
                        q7.j jVar = (q7.j) this.f17949c;
                        if (jVar.f23540c != 4) {
                            jVar.f23541d++;
                            jVar.f23540c = 4;
                            z8 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((q7.j) this.f17949c).f23539b.poll();
                    this.f17948b = runnable;
                    if (runnable == null) {
                        ((q7.j) this.f17949c).f23540c = 1;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        q3.p pVar;
        switch (this.f17947a) {
            case 0:
                int i7 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f17948b).run();
                    } catch (Throwable th) {
                        F.t(Hb.j.f4919a, th);
                    }
                    j jVar = (j) this.f17949c;
                    Runnable X10 = jVar.X();
                    if (X10 == null) {
                        return;
                    }
                    this.f17948b = X10;
                    i7++;
                    if (i7 >= 16) {
                        cc.A a9 = jVar.f17951c;
                        if (a9.V(jVar)) {
                            a9.T(jVar, this);
                            return;
                        }
                    }
                }
            case 1:
                h3.z e2 = h3.z.e();
                String str = C1372a.f18581e;
                StringBuilder sb2 = new StringBuilder("Scheduling work ");
                q3.p pVar2 = (q3.p) this.f17948b;
                sb2.append(pVar2.f23403a);
                e2.a(str, sb2.toString());
                ((C1372a) this.f17949c).f18582a.c(pVar2);
                return;
            case 2:
                ((k1.d) this.f17948b).f18760a = this.f17949c;
                return;
            case 3:
                ((Application) this.f17948b).unregisterActivityLifecycleCallbacks((k1.d) this.f17949c);
                return;
            case 4:
                try {
                    Method method = k1.e.f18769d;
                    Object obj = this.f17949c;
                    Object obj2 = this.f17948b;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        k1.e.f18770e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 5:
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f17948b;
                Iterator it = firebaseAuth.f15830c.iterator();
                while (it.hasNext()) {
                    H7.d dVar = (H7.d) it.next();
                    dVar.f4904a.execute(new Aa.j(3, dVar.f4905b, (C1824b) this.f17949c));
                }
                Iterator it2 = firebaseAuth.f15829b.iterator();
                if (it2.hasNext()) {
                    throw h3.o.j(it2);
                }
                return;
            case 6:
                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y6.i.f((String) this.f17948b));
                if (firebaseAuth2.f15833f != null) {
                    Task a10 = firebaseAuth2.a(true);
                    C1818h.f22088f.e("Token refreshing started", new Object[0]);
                    a10.addOnFailureListener(new R7.b(this, 29));
                    return;
                }
                return;
            case 7:
                i3.d dVar2 = ((C1847a) this.f17949c).f23036a.g;
                String str2 = (String) this.f17948b;
                synchronized (dVar2.k) {
                    try {
                        C1340B c10 = dVar2.c(str2);
                        pVar = c10 != null ? c10.f18318a : null;
                    } finally {
                    }
                }
                if (pVar == null || !pVar.c()) {
                    return;
                }
                synchronized (((C1847a) this.f17949c).f23038c) {
                    ((C1847a) this.f17949c).f23041f.put(O5.b.p(pVar), pVar);
                    C1847a c1847a = (C1847a) this.f17949c;
                    ((C1847a) this.f17949c).f23042u.put(O5.b.p(pVar), m3.l.a(c1847a.f23043v, pVar, (cc.A) c1847a.f23037b.f23383b, c1847a));
                }
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                try {
                    b();
                    return;
                } catch (Error e11) {
                    synchronized (((q7.j) this.f17949c).f23539b) {
                        ((q7.j) this.f17949c).f23540c = 1;
                        throw e11;
                    }
                }
            case 9:
                ((gb.f) this.f17949c).b((nb.e) this.f17948b);
                return;
            case 10:
                a();
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                RunnableC1971a runnableC1971a = (RunnableC1971a) this.f17949c;
                Object obj3 = this.f17948b;
                if (runnableC1971a.f24025c.get()) {
                    D5.d dVar3 = runnableC1971a.f24027e;
                    if (dVar3.f3247h == runnableC1971a) {
                        SystemClock.uptimeMillis();
                        dVar3.f3247h = null;
                        dVar3.b();
                    }
                } else {
                    D5.d dVar4 = runnableC1971a.f24027e;
                    if (dVar4.g != runnableC1971a) {
                        if (dVar4.f3247h == runnableC1971a) {
                            SystemClock.uptimeMillis();
                            dVar4.f3247h = null;
                            dVar4.b();
                        }
                    } else if (!dVar4.f3243c) {
                        SystemClock.uptimeMillis();
                        dVar4.g = null;
                        C1916a c1916a = dVar4.f3241a;
                        if (c1916a != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                c1916a.k(obj3);
                            } else {
                                c1916a.l(obj3);
                            }
                        }
                    }
                }
                runnableC1971a.f24024b = 3;
                return;
            case 12:
                ((sb.g) this.f17949c).f24251a.b((nb.e) this.f17948b);
                return;
            case 13:
                ((gb.q) ((X) this.f17949c).f19195c).onError((Throwable) this.f17948b);
                return;
            case 14:
                ((gb.q) ((X) this.f17949c).f19195c).onSuccess(this.f17948b);
                return;
            case 15:
                n1.b bVar = (n1.b) ((C1290a) this.f17948b).f18187b;
                if (bVar != null) {
                    bVar.j((Typeface) this.f17949c);
                    return;
                }
                return;
            case 16:
                ((v1.e) this.f17948b).accept(this.f17949c);
                return;
            default:
                vb.f fVar = (vb.f) this.f17948b;
                C1436a c1436a = fVar.f25387b;
                InterfaceC1269b b2 = ((C1151e) this.f17949c).b(fVar);
                c1436a.getClass();
                EnumC1437b.f(c1436a, b2);
                return;
        }
    }

    public String toString() {
        switch (this.f17947a) {
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                Runnable runnable = (Runnable) this.f17948b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i7 = ((q7.j) this.f17949c).f23540c;
                sb2.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
