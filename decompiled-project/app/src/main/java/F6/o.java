package F6;

import A8.f0;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f4164n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4165a;

    /* renamed from: b, reason: collision with root package name */
    public final D9.a f4166b;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f4171h;

    /* renamed from: l, reason: collision with root package name */
    public f0 f4173l;

    /* renamed from: m, reason: collision with root package name */
    public h f4174m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4168d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f4169e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f4170f = new Object();
    public final l j = new l(this, 0);
    public final AtomicInteger k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f4167c = "AppUpdateService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f4172i = new WeakReference(null);

    public o(Context context, D9.a aVar, Intent intent) {
        this.f4165a = context;
        this.f4166b = aVar;
        this.f4171h = intent;
    }

    public static void b(o oVar, E6.g gVar) {
        h hVar = oVar.f4174m;
        ArrayList arrayList = oVar.f4168d;
        D9.a aVar = oVar.f4166b;
        if (hVar != null || oVar.g) {
            if (!oVar.g) {
                gVar.run();
                return;
            } else {
                aVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(gVar);
                return;
            }
        }
        aVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(gVar);
        f0 f0Var = new f0(oVar, 1);
        oVar.f4173l = f0Var;
        oVar.g = true;
        if (oVar.f4165a.bindService(oVar.f4171h, f0Var, 1)) {
            return;
        }
        aVar.c("Failed to bind to the service.", new Object[0]);
        oVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            Db.d dVar = new Db.d("Failed to bind to the service.", 3);
            TaskCompletionSource taskCompletionSource = kVar.f4157a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(dVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f4164n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f4167c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f4167c, 10);
                    handlerThread.start();
                    hashMap.put(this.f4167c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f4167c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f4170f) {
            this.f4169e.remove(taskCompletionSource);
        }
        a().post(new m(this, 0));
    }

    public final void d() {
        HashSet hashSet = this.f4169e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f4167c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
