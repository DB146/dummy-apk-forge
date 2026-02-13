package i3;

import A9.N2;
import A9.O0;
import I2.AbstractC0315d;
import I2.K;
import P4.C0463k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import cc.F;
import com.kt.apps.media.xemtv.App;
import fc.C1164k;
import fc.C1173u;
import fc.Q;
import h3.C1235A;
import h3.C1240b;
import h3.G;
import h3.H;
import h3.InterfaceC1239a;
import hc.C1277e;
import i1.C1290a;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import r3.RunnableC1919c;

/* loaded from: classes.dex */
public final class p extends H {

    /* renamed from: l, reason: collision with root package name */
    public static p f18375l;

    /* renamed from: m, reason: collision with root package name */
    public static p f18376m;

    /* renamed from: n, reason: collision with root package name */
    public static final Object f18377n;

    /* renamed from: b, reason: collision with root package name */
    public final Context f18378b;

    /* renamed from: c, reason: collision with root package name */
    public final C1240b f18379c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f18380d;

    /* renamed from: e, reason: collision with root package name */
    public final q3.i f18381e;

    /* renamed from: f, reason: collision with root package name */
    public final List f18382f;
    public final d g;

    /* renamed from: h, reason: collision with root package name */
    public final C1290a f18383h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18384i = false;
    public BroadcastReceiver.PendingResult j;
    public final O0 k;

    static {
        h3.z.g("WorkManagerImpl");
        f18375l = null;
        f18376m = null;
        f18377n = new Object();
    }

    public p(Context context, final C1240b c1240b, q3.i iVar, final WorkDatabase workDatabase, final List list, d dVar, O0 o02) {
        int i7 = 4;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        h3.z zVar = new h3.z(c1240b.f17674h);
        synchronized (h3.z.f17722b) {
            try {
                if (h3.z.f17723c == null) {
                    h3.z.f17723c = zVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f18378b = applicationContext;
        this.f18381e = iVar;
        this.f18380d = workDatabase;
        this.g = dVar;
        this.k = o02;
        this.f18379c = c1240b;
        this.f18382f = list;
        cc.A a9 = (cc.A) iVar.f23383b;
        kotlin.jvm.internal.l.d(a9, "taskExecutor.taskCoroutineDispatcher");
        C1277e b2 = F.b(a9);
        this.f18383h = new C1290a(workDatabase, 18);
        final K k = (K) iVar.f23382a;
        String str = h.f18356a;
        dVar.a(new InterfaceC1342a() { // from class: i3.g
            @Override // i3.InterfaceC1342a
            public final void b(q3.j jVar, boolean z8) {
                k.execute(new P4.F(list, jVar, c1240b, workDatabase, 2));
            }
        });
        iVar.r(new RunnableC1919c(applicationContext, this));
        String str2 = l.f18363a;
        if (r3.h.a(applicationContext, c1240b)) {
            q3.q C2 = workDatabase.C();
            C2.getClass();
            TreeMap treeMap = I2.H.f5039w;
            L7.r rVar = new L7.r(6, C2, AbstractC0315d.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"));
            F.B(b2, null, 0, new C1164k(new C1173u(Q.h(Q.f(new A8.K(i7, Tb.a.i(C2.f23424a, false, new String[]{"workspec"}, new Ba.o(rVar, 10)), new Jb.i(4, null)), -1)), new k(applicationContext, null), 1), null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p N(Context context) {
        p pVar;
        Object obj = f18377n;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    pVar = f18375l;
                    if (pVar == null) {
                        pVar = f18376m;
                    }
                }
                return pVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (pVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof InterfaceC1239a)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            C0463k c0463k = new C0463k(25, false);
            Y1.a aVar = ((App) ((InterfaceC1239a) applicationContext)).f16185a;
            if (aVar == null) {
                kotlin.jvm.internal.l.j("workerFactory");
                throw null;
            }
            c0463k.f8074b = aVar;
            O(applicationContext, new C1240b(c0463k));
            pVar = N(applicationContext);
        }
        return pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (i3.p.f18376m != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        i3.p.f18376m = c2.q.g(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        i3.p.f18375l = i3.p.f18376m;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void O(Context context, C1240b c1240b) {
        synchronized (f18377n) {
            try {
                p pVar = f18375l;
                if (pVar != null && f18376m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final C1235A M(String str, G g) {
        return new m(this, str, 2, Collections.singletonList(g)).S();
    }

    public final void P() {
        synchronized (f18377n) {
            try {
                this.f18384i = true;
                BroadcastReceiver.PendingResult pendingResult = this.j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Q() {
        C1235A c1235a = this.f18379c.f17677m;
        N2 n22 = new N2(this, 23);
        kotlin.jvm.internal.l.e(c1235a, "<this>");
        boolean w10 = vc.i.w();
        if (w10) {
            try {
                Trace.beginSection(vc.i.I("ReschedulingWork"));
            } finally {
                if (w10) {
                    Trace.endSection();
                }
            }
        }
        n22.invoke();
    }
}
