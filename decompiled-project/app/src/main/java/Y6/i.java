package Y6;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0962c;
import com.google.android.gms.common.internal.G;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import h3.H;
import j8.InterfaceC1387b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o8.C1823a;
import p7.C1857a;
import q3.s;
import u.C2051d;
import u.C2052e;
import u.T;

/* loaded from: classes.dex */
public final class i {
    public static final Object k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final C2052e f12040l = new T(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f12041a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12042b;

    /* renamed from: c, reason: collision with root package name */
    public final m f12043c;

    /* renamed from: d, reason: collision with root package name */
    public final p7.e f12044d;
    public final p7.l g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1387b f12047h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f12045e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f12046f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f12048i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public i(Context context, String str, m mVar) {
        ?? arrayList;
        int i7 = 2;
        int i10 = 0;
        this.f12041a = context;
        G.d(str);
        this.f12042b = str;
        this.f12043c = mVar;
        a aVar = FirebaseInitProvider.f15874a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new k8.b((String) it.next(), 1));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        q7.k kVar = q7.k.f23543a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new k8.b(new FirebaseCommonRegistrar(), i7));
        arrayList3.add(new k8.b(new ExecutorsRegistrar(), i7));
        arrayList4.add(C1857a.c(context, Context.class, new Class[0]));
        arrayList4.add(C1857a.c(this, i.class, new Class[0]));
        arrayList4.add(C1857a.c(mVar, m.class, new Class[0]));
        U9.j jVar = new U9.j(5);
        if (H.z(context) && FirebaseInitProvider.f15875b.get()) {
            arrayList4.add(C1857a.c(aVar, a.class, new Class[0]));
        }
        p7.e eVar = new p7.e(arrayList3, arrayList4, jVar);
        this.f12044d = eVar;
        Trace.endSection();
        this.g = new p7.l(new d(i10, this, context));
        this.f12047h = eVar.d(h8.d.class);
        a(new f() { // from class: Y6.e
            @Override // Y6.f
            public final void a(boolean z8) {
                i iVar = i.this;
                if (z8) {
                    iVar.getClass();
                } else {
                    ((h8.d) iVar.f12047h.get()).b();
                }
            }
        });
        Trace.endSection();
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                Iterator it = ((C2051d) f12040l.values()).iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    iVar.b();
                    arrayList.add(iVar.f12042b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static i e() {
        i iVar;
        synchronized (k) {
            try {
                iVar = (i) f12040l.get("[DEFAULT]");
                if (iVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + M5.c.d() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((h8.d) iVar.f12047h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static i f(String str) {
        i iVar;
        String str2;
        synchronized (k) {
            try {
                iVar = (i) f12040l.get(str.trim());
                if (iVar == null) {
                    ArrayList d10 = d();
                    if (d10.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", d10);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((h8.d) iVar.f12047h.get()).b();
            } finally {
            }
        }
        return iVar;
    }

    public static i i(Context context) {
        synchronized (k) {
            try {
                if (f12040l.containsKey("[DEFAULT]")) {
                    return e();
                }
                m a9 = m.a(context);
                if (a9 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return j(context, a9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.android.gms.common.api.internal.b, java.lang.Object] */
    public static i j(Context context, m mVar) {
        i iVar;
        AtomicReference atomicReference = g.f12037a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = g.f12037a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        ComponentCallbacks2C0962c.b(application);
                        ComponentCallbacks2C0962c.f14977e.a(obj);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            C2052e c2052e = f12040l;
            G.i("FirebaseApp name [DEFAULT] already exists!", !c2052e.containsKey("[DEFAULT]"));
            G.h(context, "Application context cannot be null.");
            iVar = new i(context, "[DEFAULT]", mVar);
            c2052e.put("[DEFAULT]", iVar);
        }
        iVar.h();
        return iVar;
    }

    public final void a(f fVar) {
        b();
        if (this.f12045e.get() && ComponentCallbacks2C0962c.f14977e.f14978a.get()) {
            fVar.a(true);
        }
        this.f12048i.add(fVar);
    }

    public final void b() {
        G.i("FirebaseApp was deleted", !this.f12046f.get());
    }

    public final Object c(Class cls) {
        b();
        return this.f12044d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        iVar.b();
        return this.f12042b.equals(iVar.f12042b);
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        b();
        byte[] bytes = this.f12042b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        b();
        byte[] bytes2 = this.f12043c.f12055b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void h() {
        HashMap hashMap;
        if (!H.z(this.f12041a)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            b();
            sb2.append(this.f12042b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f12041a;
            AtomicReference atomicReference = h.f12038b;
            if (atomicReference.get() == null) {
                h hVar = new h(context);
                while (!atomicReference.compareAndSet(null, hVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(hVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        b();
        sb3.append(this.f12042b);
        Log.i("FirebaseApp", sb3.toString());
        p7.e eVar = this.f12044d;
        b();
        boolean equals = "[DEFAULT]".equals(this.f12042b);
        AtomicReference atomicReference2 = eVar.f23131f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (eVar) {
                    hashMap = new HashMap(eVar.f23126a);
                }
                eVar.i(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((h8.d) this.f12047h.get()).b();
    }

    public final int hashCode() {
        return this.f12042b.hashCode();
    }

    public final boolean k() {
        boolean z8;
        b();
        C1823a c1823a = (C1823a) this.g.get();
        synchronized (c1823a) {
            z8 = c1823a.f22124a;
        }
        return z8;
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.f(this.f12042b, "name");
        sVar.f(this.f12043c, "options");
        return sVar.toString();
    }
}
