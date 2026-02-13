package com.google.firebase.messaging;

import A9.O0;
import E5.b;
import E5.n;
import E5.o;
import F.Q;
import I2.C0330t;
import La.f;
import T6.a;
import Y6.i;
import Z9.x;
import a.AbstractC0672a;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import c7.InterfaceC0913b;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import e8.InterfaceC1100c;
import h7.C1258d;
import i1.C1290a;
import j8.InterfaceC1387b;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k8.e;
import p7.d;
import r8.h;
import r8.j;
import r8.p;
import r8.q;
import r8.u;
import u.C2052e;

/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static C1290a k;

    /* renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f15863m;

    /* renamed from: a, reason: collision with root package name */
    public final i f15864a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15865b;

    /* renamed from: c, reason: collision with root package name */
    public final a f15866c;

    /* renamed from: d, reason: collision with root package name */
    public final h f15867d;

    /* renamed from: e, reason: collision with root package name */
    public final C0330t f15868e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f15869f;
    public final ThreadPoolExecutor g;

    /* renamed from: h, reason: collision with root package name */
    public final Q f15870h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15871i;
    public static final long j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: l, reason: collision with root package name */
    public static InterfaceC1387b f15862l = new d(6);

    /* JADX WARN: Type inference failed for: r4v0, types: [F.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T6.a, java.lang.Object] */
    public FirebaseMessaging(i iVar, InterfaceC1387b interfaceC1387b, InterfaceC1387b interfaceC1387b2, e eVar, InterfaceC1387b interfaceC1387b3, InterfaceC1100c interfaceC1100c) {
        final int i7 = 1;
        final int i10 = 0;
        iVar.b();
        Context context = iVar.f12041a;
        final ?? obj = new Object();
        obj.f3937b = 0;
        obj.f3938c = context;
        iVar.b();
        b bVar = new b(iVar.f12041a);
        final ?? obj2 = new Object();
        obj2.f9320a = iVar;
        obj2.f9321b = obj;
        obj2.f9322c = bVar;
        obj2.f9323d = interfaceC1387b;
        obj2.f9324e = interfaceC1387b2;
        obj2.f9325f = eVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new N5.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new N5.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new N5.a("Firebase-Messaging-File-Io"));
        this.f15871i = false;
        f15862l = interfaceC1387b3;
        this.f15864a = iVar;
        this.f15868e = new C0330t(this, interfaceC1100c);
        iVar.b();
        final Context context2 = iVar.f12041a;
        this.f15865b = context2;
        f fVar = new f();
        this.f15870h = obj;
        this.f15866c = obj2;
        this.f15867d = new h(newSingleThreadExecutor);
        this.f15869f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        iVar.b();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(fVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: r8.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f23843b;

            {
                this.f23843b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task forException;
                int i11;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f23843b;
                        if (firebaseMessaging.f15868e.m() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f15871i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f23843b;
                        Context context3 = firebaseMessaging2.f15865b;
                        AbstractC0672a.j(context3);
                        boolean f4 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences s3 = android.support.v4.media.session.b.s(context3);
                            if (!s3.contains("proxy_retention") || s3.getBoolean("proxy_retention", false) != f4) {
                                E5.b bVar2 = (E5.b) firebaseMessaging2.f15866c.f9322c;
                                if (bVar2.f3675c.v() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f4);
                                    E5.o j10 = E5.o.j(bVar2.f3674b);
                                    synchronized (j10) {
                                        i11 = j10.f3712a;
                                        j10.f3712a = i11 + 1;
                                    }
                                    forException = j10.k(new E5.n(i11, 4, bundle, 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new E2.d(0), new C1258d(context3, f4));
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new N5.a("Firebase-Messaging-Topics-Io"));
        int i11 = u.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: r8.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                s sVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                Q q10 = obj;
                T6.a aVar = obj2;
                synchronized (s.class) {
                    try {
                        WeakReference weakReference = s.f23873c;
                        sVar = weakReference != null ? (s) weakReference.get() : null;
                        if (sVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            s sVar2 = new s(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (sVar2) {
                                sVar2.f23874a = O0.i(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            s.f23873c = new WeakReference(sVar2);
                            sVar = sVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new u(firebaseMessaging, q10, sVar, aVar, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new j(this, i10));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: r8.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f23843b;

            {
                this.f23843b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task forException;
                int i112;
                switch (i7) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f23843b;
                        if (firebaseMessaging.f15868e.m() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f15871i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f23843b;
                        Context context3 = firebaseMessaging2.f15865b;
                        AbstractC0672a.j(context3);
                        boolean f4 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences s3 = android.support.v4.media.session.b.s(context3);
                            if (!s3.contains("proxy_retention") || s3.getBoolean("proxy_retention", false) != f4) {
                                E5.b bVar2 = (E5.b) firebaseMessaging2.f15866c.f9322c;
                                if (bVar2.f3675c.v() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f4);
                                    E5.o j10 = E5.o.j(bVar2.f3674b);
                                    synchronized (j10) {
                                        i112 = j10.f3712a;
                                        j10.f3712a = i112 + 1;
                                    }
                                    forException = j10.k(new E5.n(i112, 4, bundle, 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new E2.d(0), new C1258d(context3, f4));
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f15863m == null) {
                    f15863m = new ScheduledThreadPoolExecutor(1, new N5.a("TAG"));
                }
                f15863m.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized C1290a c(Context context) {
        C1290a c1290a;
        synchronized (FirebaseMessaging.class) {
            try {
                if (k == null) {
                    k = new C1290a(context);
                }
                c1290a = k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1290a;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(i iVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) iVar.c(FirebaseMessaging.class);
            G.h(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        p d10 = d();
        if (!h(d10)) {
            return d10.f23862a;
        }
        String c10 = Q.c(this.f15864a);
        h hVar = this.f15867d;
        synchronized (hVar) {
            task = (Task) ((C2052e) hVar.f23841b).get(c10);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c10);
                }
                a aVar = this.f15866c;
                task = aVar.m(aVar.w(Q.c((i) aVar.f9320a), "*", new Bundle())).onSuccessTask(this.g, new M9.e(this, c10, d10, 13)).continueWithTask((ExecutorService) hVar.f23840a, new n4.b(4, hVar, c10));
                ((C2052e) hVar.f23841b).put(c10, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + c10);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final p d() {
        p b2;
        C1290a c10 = c(this.f15865b);
        i iVar = this.f15864a;
        iVar.b();
        String g = "[DEFAULT]".equals(iVar.f12042b) ? "" : iVar.g();
        String c11 = Q.c(this.f15864a);
        synchronized (c10) {
            b2 = p.b(((SharedPreferences) c10.f18187b).getString(g + "|T|" + c11 + "|*", null));
        }
        return b2;
    }

    public final void e() {
        Task forException;
        int i7;
        b bVar = (b) this.f15866c.f9322c;
        if (bVar.f3675c.v() >= 241100000) {
            o j10 = o.j(bVar.f3674b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (j10) {
                i7 = j10.f3712a;
                j10.f3712a = i7 + 1;
            }
            forException = j10.k(new n(i7, 5, bundle, 1)).continueWith(E5.h.f3687c, E5.d.f3681c);
        } else {
            forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        forException.addOnSuccessListener(this.f15869f, new j(this, 1));
    }

    public final boolean f() {
        String notificationDelegate;
        Context context = this.f15865b;
        AbstractC0672a.j(context);
        if (!(Build.VERSION.SDK_INT >= 29)) {
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
        if (!"com.google.android.gms".equals(notificationDelegate)) {
            return false;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "GMS core is set for proxying");
        }
        if (this.f15864a.c(InterfaceC0913b.class) != null) {
            return true;
        }
        return x.j() && f15862l != null;
    }

    public final synchronized void g(long j10) {
        b(new q(this, Math.min(Math.max(30L, 2 * j10), j)), j10);
        this.f15871i = true;
    }

    public final boolean h(p pVar) {
        if (pVar != null) {
            String b2 = this.f15870h.b();
            if (System.currentTimeMillis() <= pVar.f23864c + p.f23861d && b2.equals(pVar.f23863b)) {
                return false;
            }
        }
        return true;
    }
}
