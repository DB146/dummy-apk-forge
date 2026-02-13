package L7;

import A9.O0;
import I2.AbstractC0315d;
import I2.H;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import h3.C1249k;
import i3.AbstractC1341C;
import i3.C1340B;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import l7.C1511c;
import org.json.JSONObject;
import v8.C2149c;
import v8.C2151e;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6376c;

    public /* synthetic */ o(int i7, Object obj, Object obj2) {
        this.f6374a = i7;
        this.f6375b = obj;
        this.f6376c = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [h7.a, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i7;
        ComponentName startService;
        T7.s sVar = null;
        r1 = null;
        String str2 = null;
        boolean z8 = false;
        switch (this.f6374a) {
            case 0:
                z zVar = (z) this.f6375b;
                zVar.getClass();
                Q7.f fVar = (Q7.f) this.f6376c;
                O7.g gVar = zVar.f6411a;
                C0385e c0385e = fVar.f8685a;
                boolean z10 = false;
                C0385e c0385e2 = c0385e;
                while (!gVar.isEmpty()) {
                    n nVar = (n) gVar.f7495a;
                    boolean z11 = z10;
                    if (nVar != null) {
                        if (sVar == null) {
                            sVar = nVar.c(c0385e2);
                        }
                        z11 = z10 || nVar.f();
                    }
                    gVar = gVar.t(c0385e2.isEmpty() ? T7.c.b("") : c0385e2.C());
                    c0385e2 = c0385e2.F();
                    z10 = z11;
                }
                n nVar2 = (n) zVar.f6411a.o(c0385e);
                if (nVar2 == null) {
                    nVar2 = new n(zVar.g);
                    zVar.f6411a = zVar.f6411a.z(c0385e, nVar2);
                } else if (sVar == null) {
                    sVar = nVar2.c(C0385e.f6337d);
                }
                Q7.a aVar = new Q7.a(new T7.m(sVar != null ? sVar : T7.k.f9348e, fVar.f8686b.f8684e), sVar != null, false);
                E e2 = zVar.f6412b;
                e2.getClass();
                return nVar2.e(fVar, new q3.s(14, c0385e, e2, z8), aVar).f8689c.x();
            case 1:
                i3.w wVar = (i3.w) this.f6375b;
                boolean z12 = wVar instanceof i3.u;
                C1340B c1340b = (C1340B) this.f6376c;
                String str3 = c1340b.f18320c;
                q3.q qVar = c1340b.f18325i;
                if (z12) {
                    h3.x xVar = ((i3.u) wVar).f18390a;
                    int g = qVar.g(str3);
                    q3.n B10 = c1340b.f18324h.B();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) B10.f23396b;
                    workDatabase_Impl.b();
                    q3.h hVar = (q3.h) B10.f23398d;
                    V2.j a9 = hVar.a();
                    a9.p(1, str3);
                    try {
                        workDatabase_Impl.c();
                        try {
                            a9.l();
                            workDatabase_Impl.v();
                            if (g != 0) {
                                if (g == 2) {
                                    boolean z13 = xVar instanceof h3.w;
                                    q3.p pVar = c1340b.f18318a;
                                    String str4 = c1340b.f18326l;
                                    if (z13) {
                                        String str5 = AbstractC1341C.f18328a;
                                        h3.z.e().f(str5, "Worker result SUCCESS for " + str4);
                                        if (pVar.d()) {
                                            c1340b.c();
                                        } else {
                                            qVar.n(3, str3);
                                            C1249k c1249k = ((h3.w) xVar).f17717a;
                                            kotlin.jvm.internal.l.d(c1249k, "success.outputData");
                                            qVar.m(str3, c1249k);
                                            c1340b.f18323f.getClass();
                                            long currentTimeMillis = System.currentTimeMillis();
                                            q3.c cVar = c1340b.j;
                                            Iterator it = cVar.n(str3).iterator();
                                            while (it.hasNext()) {
                                                String str6 = (String) it.next();
                                                if (qVar.g(str6) == 5) {
                                                    TreeMap treeMap = H.f5039w;
                                                    H a10 = AbstractC0315d.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                                                    a10.p(1, str6);
                                                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) cVar.f23371b;
                                                    workDatabase_Impl2.b();
                                                    Cursor n6 = P2.j.n(workDatabase_Impl2, a10);
                                                    try {
                                                        if (n6.moveToFirst() && n6.getInt(0) != 0) {
                                                            h3.z.e().f(AbstractC1341C.f18328a, "Setting status to enqueued for ".concat(str6));
                                                            qVar.n(1, str6);
                                                            qVar.l(str6, currentTimeMillis);
                                                        }
                                                    } finally {
                                                        n6.close();
                                                        a10.F();
                                                    }
                                                }
                                            }
                                        }
                                    } else if (xVar instanceof h3.v) {
                                        String str7 = AbstractC1341C.f18328a;
                                        h3.z.e().f(str7, "Worker result RETRY for " + str4);
                                        c1340b.b(-256);
                                        z8 = r2;
                                    } else {
                                        String str8 = AbstractC1341C.f18328a;
                                        h3.z.e().f(str8, "Worker result FAILURE for " + str4);
                                        if (pVar.d()) {
                                            c1340b.c();
                                        } else {
                                            c1340b.d(xVar);
                                        }
                                    }
                                } else if (!h3.o.a(g)) {
                                    c1340b.b(-512);
                                    z8 = r2;
                                }
                            }
                            r2 = false;
                            z8 = r2;
                        } finally {
                            workDatabase_Impl.r();
                        }
                    } finally {
                        hVar.l(a9);
                    }
                } else if (wVar instanceof i3.t) {
                    c1340b.d(((i3.t) wVar).f18389a);
                } else {
                    if (!(wVar instanceof i3.v)) {
                        throw new Db.d(1);
                    }
                    int i10 = ((i3.v) wVar).f18391a;
                    int g2 = qVar.g(str3);
                    if (g2 == 0 || h3.o.a(g2)) {
                        String str9 = AbstractC1341C.f18328a;
                        h3.z e10 = h3.z.e();
                        StringBuilder n8 = X.c.n("Status for ", str3, " is ");
                        n8.append(h3.o.y(g2));
                        n8.append(" ; not doing any work");
                        e10.a(str9, n8.toString());
                        r2 = false;
                        z8 = r2;
                    } else {
                        String str10 = AbstractC1341C.f18328a;
                        h3.z e11 = h3.z.e();
                        StringBuilder n10 = X.c.n("Status for ", str3, " is ");
                        n10.append(h3.o.y(g2));
                        n10.append("; not doing any work and rescheduling for later execution");
                        e11.a(str10, n10.toString());
                        qVar.n(1, str3);
                        qVar.o(i10, str3);
                        qVar.j(str3, -1L);
                        z8 = r2;
                    }
                }
                return Boolean.valueOf(z8);
            case 2:
                C1511c c1511c = (C1511c) this.f6375b;
                c1511c.getClass();
                D7.a aVar2 = (D7.a) this.f6376c;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playIntegrityToken", aVar2.f3260a);
                byte[] bytes = jSONObject.toString().getBytes("UTF-8");
                O0 o02 = c1511c.f19590c;
                o02.getClass();
                h7.g gVar2 = c1511c.f19593f;
                if (gVar2.f17853b > System.currentTimeMillis()) {
                    throw new Y6.k("Too many attempts.");
                }
                JSONObject jSONObject2 = new JSONObject(o02.y(new URL("https://firebaseappcheck.googleapis.com/v1/projects/" + ((String) o02.f925d) + "/apps/" + ((String) o02.f924c) + ":exchangePlayIntegrityToken?key=" + ((String) o02.f923b)), bytes, gVar2, true));
                String a11 = M5.e.a(jSONObject2.optString("token"));
                String a12 = M5.e.a(jSONObject2.optString("ttl"));
                if (a11 == null || a12 == null) {
                    throw new Y6.k("Unexpected server response.");
                }
                ?? obj = new Object();
                obj.f17826a = a11;
                obj.f17827b = a12;
                return obj;
            case 3:
                Context context = (Context) this.f6375b;
                Intent intent = (Intent) this.f6376c;
                r8.o f4 = r8.o.f();
                f4.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) f4.f23860e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (f4) {
                    try {
                        String str11 = (String) f4.f23857b;
                        if (str11 != null) {
                            str2 = str11;
                        } else {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(".")) {
                                        f4.f23857b = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        f4.f23857b = serviceInfo.name;
                                    }
                                    str2 = (String) f4.f23857b;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (f4.j(context)) {
                        startService = r8.x.c(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i7 = 404;
                    } else {
                        i7 = -1;
                    }
                } catch (IllegalStateException e12) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e12);
                    i7 = 402;
                } catch (SecurityException e13) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e13);
                    i7 = 401;
                }
                return Integer.valueOf(i7);
            default:
                C2149c c2149c = (C2149c) this.f6375b;
                C2151e c2151e = (C2151e) this.f6376c;
                v8.l lVar = c2149c.f25201b;
                synchronized (lVar) {
                    FileOutputStream openFileOutput = lVar.f25259a.openFileOutput(lVar.f25260b, 0);
                    try {
                        openFileOutput.write(c2151e.f25210a.toString().getBytes("UTF-8"));
                    } finally {
                        openFileOutput.close();
                    }
                }
                return null;
        }
    }
}
