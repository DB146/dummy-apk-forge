package u8;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0962c;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import ea.C1111f;
import ea.C1112g;
import j8.InterfaceC1387b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import l2.X;
import r8.o;
import v8.C2149c;
import v8.C2153g;
import v8.C2154h;
import v8.k;
import v8.l;
import x8.InterfaceC2270a;

/* loaded from: classes.dex */
public final class j implements InterfaceC2270a {
    public static final Random j = new Random();
    public static final HashMap k = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f24894b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f24895c;

    /* renamed from: d, reason: collision with root package name */
    public final Y6.i f24896d;

    /* renamed from: e, reason: collision with root package name */
    public final k8.e f24897e;

    /* renamed from: f, reason: collision with root package name */
    public final Z6.c f24898f;
    public final InterfaceC1387b g;

    /* renamed from: h, reason: collision with root package name */
    public final String f24899h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24893a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f24900i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.common.api.internal.b, java.lang.Object] */
    public j(Context context, ScheduledExecutorService scheduledExecutorService, Y6.i iVar, k8.e eVar, Z6.c cVar, InterfaceC1387b interfaceC1387b) {
        this.f24894b = context;
        this.f24895c = scheduledExecutorService;
        this.f24896d = iVar;
        this.f24897e = eVar;
        this.f24898f = cVar;
        this.g = interfaceC1387b;
        iVar.b();
        this.f24899h = iVar.f12043c.f12055b;
        AtomicReference atomicReference = i.f24892a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = i.f24892a;
        if (atomicReference2.get() == null) {
            ?? obj = new Object();
            while (true) {
                if (atomicReference2.compareAndSet(null, obj)) {
                    ComponentCallbacks2C0962c.b(application);
                    ComponentCallbacks2C0962c.f14977e.a(obj);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new D7.c(this, 3));
    }

    public final synchronized c a() {
        C2149c c10;
        C2149c c11;
        C2149c c12;
        k kVar;
        C2154h c2154h;
        o oVar;
        ScheduledExecutorService scheduledExecutorService;
        try {
            c10 = c("fetch");
            c11 = c("activate");
            c12 = c("defaults");
            kVar = new k(this.f24894b.getSharedPreferences("frc_" + this.f24899h + "_firebase_settings", 0));
            c2154h = new C2154h(this.f24895c, c11, c12);
            Y6.i iVar = this.f24896d;
            InterfaceC1387b interfaceC1387b = this.g;
            iVar.b();
            C1111f c1111f = iVar.f12042b.equals("[DEFAULT]") ? new C1111f(interfaceC1387b) : null;
            if (c1111f != null) {
                h hVar = new h(c1111f);
                synchronized (c2154h.f25229a) {
                    c2154h.f25229a.add(hVar);
                }
            }
            C1112g c1112g = new C1112g(17);
            c1112g.f16840b = c11;
            c1112g.f16841c = c12;
            oVar = new o(11, false);
            oVar.f23860e = Collections.newSetFromMap(new ConcurrentHashMap());
            oVar.f23857b = c11;
            oVar.f23858c = c1112g;
            scheduledExecutorService = this.f24895c;
            oVar.f23859d = scheduledExecutorService;
        } catch (Throwable th) {
            throw th;
        }
        return b(this.f24896d, this.f24897e, this.f24898f, scheduledExecutorService, c10, c11, c12, d(c10, kVar), c2154h, kVar, oVar);
    }

    public final synchronized c b(Y6.i iVar, k8.e eVar, Z6.c cVar, Executor executor, C2149c c2149c, C2149c c2149c2, C2149c c2149c3, C2153g c2153g, C2154h c2154h, k kVar, o oVar) {
        if (!this.f24893a.containsKey("firebase")) {
            iVar.b();
            Z6.c cVar2 = iVar.f12042b.equals("[DEFAULT]") ? cVar : null;
            Context context = this.f24894b;
            synchronized (this) {
                c cVar3 = new c(cVar2, executor, c2149c, c2149c2, c2149c3, c2153g, c2154h, new X(iVar, eVar, c2153g, c2149c2, context, kVar, this.f24895c), oVar);
                c2149c2.b();
                c2149c3.b();
                c2149c.b();
                this.f24893a.put("firebase", cVar3);
                k.put("firebase", cVar3);
            }
        }
        return (c) this.f24893a.get("firebase");
    }

    public final C2149c c(String str) {
        l lVar;
        C2149c c2149c;
        String n6 = h3.o.n("frc_", this.f24899h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f24895c;
        Context context = this.f24894b;
        HashMap hashMap = l.f25258c;
        synchronized (l.class) {
            try {
                HashMap hashMap2 = l.f25258c;
                if (!hashMap2.containsKey(n6)) {
                    hashMap2.put(n6, new l(context, n6));
                }
                lVar = (l) hashMap2.get(n6);
            } finally {
            }
        }
        HashMap hashMap3 = C2149c.f25198d;
        synchronized (C2149c.class) {
            try {
                String str2 = lVar.f25260b;
                HashMap hashMap4 = C2149c.f25198d;
                if (!hashMap4.containsKey(str2)) {
                    hashMap4.put(str2, new C2149c(scheduledExecutorService, lVar));
                }
                c2149c = (C2149c) hashMap4.get(str2);
            } finally {
            }
        }
        return c2149c;
    }

    public final synchronized C2153g d(C2149c c2149c, k kVar) {
        k8.e eVar;
        InterfaceC1387b dVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        Y6.i iVar;
        try {
            eVar = this.f24897e;
            Y6.i iVar2 = this.f24896d;
            iVar2.b();
            dVar = iVar2.f12042b.equals("[DEFAULT]") ? this.g : new p7.d(7);
            scheduledExecutorService = this.f24895c;
            random = j;
            Y6.i iVar3 = this.f24896d;
            iVar3.b();
            str = iVar3.f12043c.f12054a;
            iVar = this.f24896d;
            iVar.b();
        } catch (Throwable th) {
            throw th;
        }
        return new C2153g(eVar, dVar, scheduledExecutorService, random, c2149c, new ConfigFetchHttpClient(this.f24894b, iVar.f12043c.f12055b, str, kVar.f25254a.getLong("fetch_timeout_in_seconds", 60L), kVar.f25254a.getLong("fetch_timeout_in_seconds", 60L)), kVar, this.f24900i);
    }
}
