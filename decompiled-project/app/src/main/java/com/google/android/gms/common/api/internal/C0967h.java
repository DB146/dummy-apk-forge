package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0996l;
import com.google.android.gms.common.internal.C1001q;
import com.google.android.gms.common.internal.C1002s;
import com.google.android.gms.common.internal.C1003t;
import com.google.android.gms.common.internal.C1004u;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzab;
import com.google.android.gms.internal.common.zzac;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import u.C2048a;
import u.C2053f;

/* renamed from: com.google.android.gms.common.api.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0967h implements Handler.Callback {

    /* renamed from: D, reason: collision with root package name */
    public static final Status f14982D = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: E, reason: collision with root package name */
    public static final Status f14983E = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: F, reason: collision with root package name */
    public static final Object f14984F = new Object();

    /* renamed from: G, reason: collision with root package name */
    public static C0967h f14985G;

    /* renamed from: A, reason: collision with root package name */
    public final C2053f f14986A;

    /* renamed from: B, reason: collision with root package name */
    public final zau f14987B;

    /* renamed from: C, reason: collision with root package name */
    public volatile boolean f14988C;

    /* renamed from: a, reason: collision with root package name */
    public long f14989a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14990b;

    /* renamed from: c, reason: collision with root package name */
    public C1003t f14991c;

    /* renamed from: d, reason: collision with root package name */
    public H5.b f14992d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f14993e;

    /* renamed from: f, reason: collision with root package name */
    public final F5.e f14994f;

    /* renamed from: u, reason: collision with root package name */
    public final q3.e f14995u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicInteger f14996v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicInteger f14997w;

    /* renamed from: x, reason: collision with root package name */
    public final ConcurrentHashMap f14998x;

    /* renamed from: y, reason: collision with root package name */
    public B f14999y;

    /* renamed from: z, reason: collision with root package name */
    public final C2053f f15000z;

    public C0967h(Context context, Looper looper) {
        F5.e eVar = F5.e.f4098d;
        this.f14989a = 10000L;
        this.f14990b = false;
        this.f14996v = new AtomicInteger(1);
        this.f14997w = new AtomicInteger(0);
        this.f14998x = new ConcurrentHashMap(5, 0.75f, 1);
        this.f14999y = null;
        this.f15000z = new C2053f(0);
        this.f14986A = new C2053f(0);
        this.f14988C = true;
        this.f14993e = context;
        zau zauVar = new zau(looper, this);
        this.f14987B = zauVar;
        this.f14994f = eVar;
        this.f14995u = new q3.e(25);
        PackageManager packageManager = context.getPackageManager();
        if (M5.c.f6786f == null) {
            M5.c.f6786f = Boolean.valueOf(M5.c.f() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (M5.c.f6786f.booleanValue()) {
            this.f14988C = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f14984F) {
            try {
                C0967h c0967h = f14985G;
                if (c0967h != null) {
                    c0967h.f14997w.incrementAndGet();
                    zau zauVar = c0967h.f14987B;
                    zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status e(C0960a c0960a, F5.b bVar) {
        return new Status(17, A3.c.j("API: ", c0960a.f14970b.f14904c, " is not available on this device. Connection failed with: ", String.valueOf(bVar)), bVar.f4089c, bVar);
    }

    public static C0967h g(Context context) {
        C0967h c0967h;
        HandlerThread handlerThread;
        synchronized (f14984F) {
            if (f14985G == null) {
                synchronized (AbstractC0996l.f15089a) {
                    try {
                        handlerThread = AbstractC0996l.f15091c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            AbstractC0996l.f15091c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = AbstractC0996l.f15091c;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = F5.e.f4097c;
                f14985G = new C0967h(applicationContext, looper);
            }
            c0967h = f14985G;
        }
        return c0967h;
    }

    public final void b(B b2) {
        synchronized (f14984F) {
            try {
                if (this.f14999y != b2) {
                    this.f14999y = b2;
                    this.f15000z.clear();
                }
                this.f15000z.addAll(b2.f14911e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        if (this.f14990b) {
            return false;
        }
        C1002s c1002s = (C1002s) com.google.android.gms.common.internal.r.b().f15106a;
        if (c1002s != null && !c1002s.f15108b) {
            return false;
        }
        int i7 = ((SparseIntArray) this.f14995u.f23376b).get(203400000, -1);
        return i7 == -1 || i7 == 0;
    }

    public final boolean d(F5.b bVar, int i7) {
        F5.e eVar = this.f14994f;
        eVar.getClass();
        Context context = this.f14993e;
        if (O5.b.v(context)) {
            return false;
        }
        int i10 = bVar.f4088b;
        PendingIntent pendingIntent = bVar.f4089c;
        if (!((i10 == 0 || pendingIntent == null) ? false : true)) {
            pendingIntent = null;
            Intent b2 = eVar.b(i10, context, null);
            if (b2 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, b2, 201326592);
            }
        }
        if (pendingIntent == null) {
            return false;
        }
        int i11 = GoogleApiActivity.f14888b;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i7);
        intent.putExtra("notify_manager", true);
        eVar.h(context, i10, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
        return true;
    }

    public final E f(com.google.android.gms.common.api.l lVar) {
        ConcurrentHashMap concurrentHashMap = this.f14998x;
        C0960a apiKey = lVar.getApiKey();
        E e2 = (E) concurrentHashMap.get(apiKey);
        if (e2 == null) {
            e2 = new E(this, lVar);
            concurrentHashMap.put(apiKey, e2);
        }
        if (e2.f14918b.requiresSignIn()) {
            this.f14986A.add(apiKey);
        }
        e2.l();
        return e2;
    }

    public final void h(F5.b bVar, int i7) {
        if (d(bVar, i7)) {
            return;
        }
        zau zauVar = this.f14987B;
        zauVar.sendMessage(zauVar.obtainMessage(5, i7, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0320  */
    /* JADX WARN: Type inference failed for: r0v63, types: [H5.b, com.google.android.gms.common.api.l] */
    /* JADX WARN: Type inference failed for: r0v79, types: [H5.b, com.google.android.gms.common.api.l] */
    /* JADX WARN: Type inference failed for: r13v0, types: [H5.b, com.google.android.gms.common.api.l] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        E e2;
        boolean z8;
        boolean isIsolated;
        F5.d[] g;
        int i7 = message.what;
        zau zauVar = this.f14987B;
        ConcurrentHashMap concurrentHashMap = this.f14998x;
        C1004u c1004u = C1004u.f15114b;
        int i10 = 0;
        switch (i7) {
            case 1:
                this.f14989a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zauVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zauVar.sendMessageDelayed(zauVar.obtainMessage(12, (C0960a) it.next()), this.f14989a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (E e10 : concurrentHashMap.values()) {
                    com.google.android.gms.common.internal.G.c(e10.f14927p.f14987B);
                    e10.f14925n = null;
                    e10.l();
                }
                return true;
            case 4:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                M m10 = (M) message.obj;
                E e11 = (E) concurrentHashMap.get(m10.f14946c.getApiKey());
                if (e11 == null) {
                    e11 = f(m10.f14946c);
                }
                boolean requiresSignIn = e11.f14918b.requiresSignIn();
                W w10 = m10.f14944a;
                if (!requiresSignIn || this.f14997w.get() == m10.f14945b) {
                    e11.m(w10);
                } else {
                    w10.a(f14982D);
                    e11.p();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                F5.b bVar = (F5.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        e2 = (E) it2.next();
                        if (e2.j == i11) {
                        }
                    } else {
                        e2 = null;
                    }
                }
                if (e2 != null) {
                    int i12 = bVar.f4088b;
                    if (i12 == 13) {
                        this.f14994f.getClass();
                        int i13 = F5.h.f4105e;
                        StringBuilder n6 = X.c.n("Error resolution was canceled by the user, original error message: ", F5.b.t(i12), ": ");
                        n6.append(bVar.f4090d);
                        e2.b(new Status(17, n6.toString(), null, null));
                    } else {
                        e2.b(e(e2.f14919c, bVar));
                    }
                } else {
                    Log.wtf("GoogleApiManager", A3.c.f(i11, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                }
                return true;
            case 6:
                Context context = this.f14993e;
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C0962c.b((Application) context.getApplicationContext());
                    ComponentCallbacks2C0962c componentCallbacks2C0962c = ComponentCallbacks2C0962c.f14977e;
                    componentCallbacks2C0962c.a(new D(this, i10));
                    AtomicBoolean atomicBoolean = componentCallbacks2C0962c.f14979b;
                    boolean z10 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0962c.f14978a;
                    if (!z10) {
                        Boolean bool = M5.c.f6788i;
                        if (bool == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                isIsolated = Process.isIsolated();
                                bool = Boolean.valueOf(isIsolated);
                            } else {
                                try {
                                    Object zza = zzl.zza(Process.class, "isIsolated", new zzj[0]);
                                    Object[] objArr = new Object[0];
                                    if (zza == null) {
                                        throw new zzac(zzab.zza("expected a non-null reference", objArr));
                                    }
                                    bool = (Boolean) zza;
                                } catch (ReflectiveOperationException unused) {
                                    bool = Boolean.FALSE;
                                }
                            }
                            M5.c.f6788i = bool;
                        }
                        if (bool.booleanValue()) {
                            z8 = true;
                            if (!z8) {
                                this.f14989a = 300000L;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean2.set(true);
                            }
                        }
                    }
                    z8 = atomicBoolean2.get();
                    if (!z8) {
                    }
                }
                return true;
            case 7:
                f((com.google.android.gms.common.api.l) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    E e12 = (E) concurrentHashMap.get(message.obj);
                    com.google.android.gms.common.internal.G.c(e12.f14927p.f14987B);
                    if (e12.f14923l) {
                        e12.l();
                    }
                }
                return true;
            case 10:
                C2053f c2053f = this.f14986A;
                c2053f.getClass();
                C2048a c2048a = new C2048a(c2053f);
                while (c2048a.hasNext()) {
                    E e13 = (E) concurrentHashMap.remove((C0960a) c2048a.next());
                    if (e13 != null) {
                        e13.p();
                    }
                }
                c2053f.clear();
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                if (concurrentHashMap.containsKey(message.obj)) {
                    E e14 = (E) concurrentHashMap.get(message.obj);
                    C0967h c0967h = e14.f14927p;
                    com.google.android.gms.common.internal.G.c(c0967h.f14987B);
                    boolean z11 = e14.f14923l;
                    if (z11) {
                        if (z11) {
                            C0967h c0967h2 = e14.f14927p;
                            zau zauVar2 = c0967h2.f14987B;
                            C0960a c0960a = e14.f14919c;
                            zauVar2.removeMessages(11, c0960a);
                            c0967h2.f14987B.removeMessages(9, c0960a);
                            e14.f14923l = false;
                        }
                        e14.b(c0967h.f14994f.d(c0967h.f14993e, F5.f.f4099a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        e14.f14918b.disconnect("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((E) concurrentHashMap.get(message.obj)).k(true);
                }
                return true;
            case 14:
                C c10 = (C) message.obj;
                C0960a c0960a2 = c10.f14913a;
                boolean containsKey = concurrentHashMap.containsKey(c0960a2);
                TaskCompletionSource taskCompletionSource = c10.f14914b;
                if (containsKey) {
                    taskCompletionSource.setResult(Boolean.valueOf(((E) concurrentHashMap.get(c0960a2)).k(false)));
                } else {
                    taskCompletionSource.setResult(Boolean.FALSE);
                }
                return true;
            case 15:
                F f4 = (F) message.obj;
                if (concurrentHashMap.containsKey(f4.f14928a)) {
                    E e15 = (E) concurrentHashMap.get(f4.f14928a);
                    if (e15.f14924m.contains(f4) && !e15.f14923l) {
                        if (e15.f14918b.isConnected()) {
                            e15.d();
                        } else {
                            e15.l();
                        }
                    }
                }
                return true;
            case 16:
                F f10 = (F) message.obj;
                if (concurrentHashMap.containsKey(f10.f14928a)) {
                    E e16 = (E) concurrentHashMap.get(f10.f14928a);
                    if (e16.f14924m.remove(f10)) {
                        C0967h c0967h3 = e16.f14927p;
                        c0967h3.f14987B.removeMessages(15, f10);
                        c0967h3.f14987B.removeMessages(16, f10);
                        LinkedList linkedList = e16.f14917a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it3 = linkedList.iterator();
                        while (true) {
                            boolean hasNext = it3.hasNext();
                            F5.d dVar = f10.f14929b;
                            if (hasNext) {
                                W w11 = (W) it3.next();
                                if ((w11 instanceof K) && (g = ((K) w11).g(e16)) != null) {
                                    int length = g.length;
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= length) {
                                            break;
                                        }
                                        if (!com.google.android.gms.common.internal.G.k(g[i14], dVar)) {
                                            i14++;
                                        } else if (i14 >= 0) {
                                            arrayList.add(w11);
                                        }
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                while (i10 < size) {
                                    W w12 = (W) arrayList.get(i10);
                                    linkedList.remove(w12);
                                    w12.b(new com.google.android.gms.common.api.v(dVar));
                                    i10++;
                                }
                            }
                        }
                    }
                }
                return true;
            case 17:
                C1003t c1003t = this.f14991c;
                if (c1003t != null) {
                    if (c1003t.f15112a > 0 || c()) {
                        if (this.f14992d == null) {
                            this.f14992d = new com.google.android.gms.common.api.l(this.f14993e, null, H5.b.f4893a, c1004u, com.google.android.gms.common.api.k.f15009c);
                        }
                        this.f14992d.c(c1003t);
                    }
                    this.f14991c = null;
                }
                return true;
            case 18:
                L l10 = (L) message.obj;
                long j = l10.f14942c;
                C1001q c1001q = l10.f14940a;
                int i15 = l10.f14941b;
                if (j == 0) {
                    C1003t c1003t2 = new C1003t(i15, Arrays.asList(c1001q));
                    if (this.f14992d == null) {
                        this.f14992d = new com.google.android.gms.common.api.l(this.f14993e, null, H5.b.f4893a, c1004u, com.google.android.gms.common.api.k.f15009c);
                    }
                    this.f14992d.c(c1003t2);
                } else {
                    C1003t c1003t3 = this.f14991c;
                    if (c1003t3 != null) {
                        List list = c1003t3.f15113b;
                        if (c1003t3.f15112a != i15 || (list != null && list.size() >= l10.f14943d)) {
                            zauVar.removeMessages(17);
                            C1003t c1003t4 = this.f14991c;
                            if (c1003t4 != null) {
                                if (c1003t4.f15112a > 0 || c()) {
                                    if (this.f14992d == null) {
                                        this.f14992d = new com.google.android.gms.common.api.l(this.f14993e, null, H5.b.f4893a, c1004u, com.google.android.gms.common.api.k.f15009c);
                                    }
                                    this.f14992d.c(c1003t4);
                                }
                                this.f14991c = null;
                            }
                        } else {
                            C1003t c1003t5 = this.f14991c;
                            if (c1003t5.f15113b == null) {
                                c1003t5.f15113b = new ArrayList();
                            }
                            c1003t5.f15113b.add(c1001q);
                        }
                    }
                    if (this.f14991c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c1001q);
                        this.f14991c = new C1003t(i15, arrayList2);
                        zauVar.sendMessageDelayed(zauVar.obtainMessage(17), l10.f14942c);
                    }
                }
                return true;
            case 19:
                this.f14990b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i7);
                return false;
        }
    }
}
