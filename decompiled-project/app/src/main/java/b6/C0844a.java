package b6;

import B0.C;
import M5.e;
import M5.f;
import O5.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import h3.o;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l1.AbstractC1449a;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f13975n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f13976o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f13977p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f13978a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f13979b;

    /* renamed from: c, reason: collision with root package name */
    public int f13980c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f13981d;

    /* renamed from: e, reason: collision with root package name */
    public long f13982e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f13983f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public zzb f13984h;

    /* renamed from: i, reason: collision with root package name */
    public final M5.b f13985i;
    public final String j;
    public final HashMap k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f13986l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f13987m;

    public C0844a(Context context) {
        boolean z8;
        String packageName = context.getPackageName();
        this.f13978a = new Object();
        this.f13980c = 0;
        this.f13983f = new HashSet();
        this.g = true;
        this.f13985i = M5.b.f6780a;
        this.k = new HashMap();
        this.f13986l = new AtomicInteger(0);
        G.e("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f13984h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        this.f13979b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = f.f6791a;
        synchronized (f.class) {
            Boolean bool = f.f6793c;
            if (bool != null) {
                z8 = bool.booleanValue();
            } else {
                z8 = AbstractC1449a.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                f.f6793c = Boolean.valueOf(z8);
            }
        }
        if (z8) {
            int i7 = e.f6790a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo g = c.a(context).g(0, packageName);
                    if (g == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i10 = g.uid;
                        workSource = new WorkSource();
                        Method method2 = f.f6792b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i10), packageName);
                            } catch (Exception e2) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                            }
                        } else {
                            Method method3 = f.f6791a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i10));
                                } catch (Exception e10) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f13979b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e11) {
                    Log.wtf("WakeLock", e11.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f13976o;
        if (scheduledExecutorService == null) {
            synchronized (f13977p) {
                try {
                    scheduledExecutorService = f13976o;
                    if (scheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f13976o = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f13987m = scheduledExecutorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j) {
        this.f13986l.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f13975n), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f13978a) {
            try {
                if (!b()) {
                    this.f13984h = zzb.zza(false, null);
                    this.f13979b.acquire();
                    this.f13985i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f13980c++;
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                C0845b c0845b = (C0845b) this.k.get(null);
                C0845b c0845b2 = c0845b;
                if (c0845b == null) {
                    Object obj = new Object();
                    this.k.put(null, obj);
                    c0845b2 = obj;
                }
                c0845b2.f13988a++;
                this.f13985i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j10 > this.f13982e) {
                    this.f13982e = j10;
                    ScheduledFuture scheduledFuture = this.f13981d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f13981d = this.f13987m.schedule(new C(this, 23), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z8;
        synchronized (this.f13978a) {
            z8 = this.f13980c > 0;
        }
        return z8;
    }

    public final void c() {
        if (this.f13986l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f13978a) {
            try {
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                if (this.k.containsKey(null)) {
                    C0845b c0845b = (C0845b) this.k.get(null);
                    if (c0845b != null) {
                        int i7 = c0845b.f13988a - 1;
                        c0845b.f13988a = i7;
                        if (i7 == 0) {
                            this.k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f13983f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() > 0) {
            throw o.i(0, arrayList);
        }
    }

    public final void e() {
        synchronized (this.f13978a) {
            try {
                if (b()) {
                    if (this.g) {
                        int i7 = this.f13980c - 1;
                        this.f13980c = i7;
                        if (i7 > 0) {
                            return;
                        }
                    } else {
                        this.f13980c = 0;
                    }
                    d();
                    Iterator it = this.k.values().iterator();
                    while (it.hasNext()) {
                        ((C0845b) it.next()).f13988a = 0;
                    }
                    this.k.clear();
                    ScheduledFuture scheduledFuture = this.f13981d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f13981d = null;
                        this.f13982e = 0L;
                    }
                    if (this.f13979b.isHeld()) {
                        try {
                            try {
                                this.f13979b.release();
                                if (this.f13984h != null) {
                                    this.f13984h = null;
                                }
                            } catch (RuntimeException e2) {
                                if (!e2.getClass().equals(RuntimeException.class)) {
                                    throw e2;
                                }
                                Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e2);
                                if (this.f13984h != null) {
                                    this.f13984h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f13984h != null) {
                                this.f13984h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
