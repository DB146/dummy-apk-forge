package J6;

import A8.f0;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f5543o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f5544a;

    /* renamed from: b, reason: collision with root package name */
    public final y f5545b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5546c;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f5550h;

    /* renamed from: i, reason: collision with root package name */
    public final B f5551i;

    /* renamed from: m, reason: collision with root package name */
    public f0 f5553m;

    /* renamed from: n, reason: collision with root package name */
    public IInterface f5554n;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5547d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f5548e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f5549f = new Object();
    public final F6.l k = new F6.l(this, 1);

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f5552l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    public d(Context context, y yVar, String str, Intent intent, B b2) {
        this.f5544a = context;
        this.f5545b = yVar;
        this.f5546c = str;
        this.f5550h = intent;
        this.f5551i = b2;
    }

    public static void b(d dVar, z zVar) {
        IInterface iInterface = dVar.f5554n;
        ArrayList arrayList = dVar.f5547d;
        y yVar = dVar.f5545b;
        if (iInterface != null || dVar.g) {
            if (!dVar.g) {
                zVar.run();
                return;
            } else {
                yVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zVar);
                return;
            }
        }
        yVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(zVar);
        f0 f0Var = new f0(dVar, 3);
        dVar.f5553m = f0Var;
        dVar.g = true;
        if (dVar.f5544a.bindService(dVar.f5550h, f0Var, 1)) {
            return;
        }
        yVar.b("Failed to bind to the service.", new Object[0]);
        dVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((z) it.next()).a(new RuntimeException("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f5543o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f5546c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f5546c, 10);
                    handlerThread.start();
                    hashMap.put(this.f5546c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f5546c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(z zVar, TaskCompletionSource taskCompletionSource) {
        a().post(new A(this, zVar.c(), taskCompletionSource, zVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f5549f) {
            this.f5548e.remove(taskCompletionSource);
        }
        a().post(new c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f5548e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f5546c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
