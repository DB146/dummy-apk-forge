package r5;

import F5.f;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import q4.j;

/* renamed from: r5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1943b {

    /* renamed from: a, reason: collision with root package name */
    public F5.a f23787a;

    /* renamed from: b, reason: collision with root package name */
    public zzf f23788b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23789c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23790d;

    /* renamed from: e, reason: collision with root package name */
    public c f23791e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f23792f;
    public final long g;

    public C1943b(Context context) {
        this(context, 30000L, false);
    }

    public C1943b(Context context, long j, boolean z8) {
        Context applicationContext;
        this.f23790d = new Object();
        G.g(context);
        if (z8 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f23792f = context;
        this.f23789c = false;
        this.g = j;
    }

    public static C1942a a(Context context) {
        C1943b c1943b = new C1943b(context, -1L, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c1943b.c(false);
            C1942a e2 = c1943b.e();
            d(e2, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e2;
        } finally {
        }
    }

    public static void d(C1942a c1942a, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (c1942a != null) {
                hashMap.put("limit_ad_tracking", true != c1942a.f23786b ? "0" : "1");
                String str = c1942a.f23785a;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new j(hashMap).start();
        }
    }

    public final void b() {
        G.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f23792f == null || this.f23787a == null) {
                    return;
                }
                try {
                    if (this.f23789c) {
                        L5.a.b().c(this.f23792f, this.f23787a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f23789c = false;
                this.f23788b = null;
                this.f23787a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z8) {
        G.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f23789c) {
                    b();
                }
                Context context = this.f23792f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int d10 = f.f4100b.d(context, 12451000);
                    if (d10 != 0 && d10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    F5.a aVar = new F5.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!L5.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f23787a = aVar;
                        try {
                            this.f23788b = zze.zza(aVar.a(TimeUnit.MILLISECONDS));
                            this.f23789c = true;
                            if (z8) {
                                f();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new Exception();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C1942a e() {
        C1942a c1942a;
        G.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f23789c) {
                    synchronized (this.f23790d) {
                        c cVar = this.f23791e;
                        if (cVar == null || !cVar.f23796d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c(false);
                        if (!this.f23789c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                G.g(this.f23787a);
                G.g(this.f23788b);
                try {
                    c1942a = new C1942a(this.f23788b.zzc(), this.f23788b.zze(true));
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return c1942a;
    }

    public final void f() {
        synchronized (this.f23790d) {
            c cVar = this.f23791e;
            if (cVar != null) {
                cVar.f23795c.countDown();
                try {
                    this.f23791e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.f23791e = new c(this, j);
            }
        }
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
