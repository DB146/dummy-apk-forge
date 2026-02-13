package E5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    public q3.e f3702c;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3705f;

    /* renamed from: a, reason: collision with root package name */
    public int f3700a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f3701b = new Messenger(new zzf(Looper.getMainLooper(), new A6.e(this, 1)));

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f3703d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f3704e = new SparseArray();

    public /* synthetic */ m(o oVar) {
        this.f3705f = oVar;
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [Bc.o, java.lang.Exception] */
    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i7 = this.f3700a;
            if (i7 == 0) {
                throw new IllegalStateException();
            }
            if (i7 != 1 && i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                this.f3700a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f3700a = 4;
            L5.a.b().c((Context) this.f3705f.f3713b, this);
            ?? exc = new Exception(str, securityException);
            Iterator it = this.f3703d.iterator();
            while (it.hasNext()) {
                ((n) it.next()).b(exc);
            }
            this.f3703d.clear();
            for (int i10 = 0; i10 < this.f3704e.size(); i10++) {
                ((n) this.f3704e.valueAt(i10)).b(exc);
            }
            this.f3704e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f3700a == 2 && this.f3703d.isEmpty() && this.f3704e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f3700a = 3;
                L5.a.b().c((Context) this.f3705f.f3713b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(n nVar) {
        int i7 = this.f3700a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f3703d.add(nVar);
                return true;
            }
            if (i7 != 2) {
                return false;
            }
            this.f3703d.add(nVar);
            ((ScheduledExecutorService) this.f3705f.f3714c).execute(new l(this, 0));
            return true;
        }
        this.f3703d.add(nVar);
        G.j(this.f3700a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f3700a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (L5.a.b().a((Context) this.f3705f.f3713b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f3705f.f3714c).schedule(new l(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e2) {
            b("Unable to bind to service", e2);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f3705f.f3714c).execute(new k(0, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f3705f.f3714c).execute(new l(this, 2));
    }
}
