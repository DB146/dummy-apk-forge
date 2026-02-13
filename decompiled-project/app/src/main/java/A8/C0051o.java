package A8;

import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.SessionLifecycleService;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: A8.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051o extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0052p f706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Hb.i f707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0051o(C0052p c0052p, Hb.i iVar, i0 i0Var, Hb.d dVar) {
        super(2, dVar);
        this.f706b = c0052p;
        this.f707c = iVar;
        this.f708d = i0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C0051o(this.f706b, this.f707c, this.f708d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0051o) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0072  */
    /* JADX WARN: Type inference failed for: r10v18, types: [q3.i, java.lang.Object] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean a9;
        boolean booleanValue;
        boolean z8;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f705a;
        C0052p c0052p = this.f706b;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            B8.c cVar = B8.c.f2227a;
            this.f705a = 1;
            obj = cVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
                E8.j jVar = c0052p.f710b;
                a9 = jVar.f3784a.a();
                if (a9 == null) {
                    booleanValue = a9.booleanValue();
                } else {
                    Boolean a10 = jVar.f3785b.a();
                    booleanValue = a10 != null ? a10.booleanValue() : true;
                }
                if (booleanValue) {
                    Log.d(FirebaseSessionsRegistrar.TAG, "Sessions SDK disabled. Not listening to lifecycle events.");
                } else {
                    Hb.i backgroundDispatcher = this.f707c;
                    kotlin.jvm.internal.l.e(backgroundDispatcher, "backgroundDispatcher");
                    ?? obj2 = new Object();
                    obj2.f23382a = backgroundDispatcher;
                    obj2.f23384c = new LinkedBlockingDeque(20);
                    obj2.f23385d = new f0(obj2, 0);
                    i0 sessionLifecycleServiceBinder = this.f708d;
                    kotlin.jvm.internal.l.e(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
                    Messenger messenger = new Messenger(new c0(backgroundDispatcher));
                    f0 serviceConnection = (f0) obj2.f23385d;
                    kotlin.jvm.internal.l.e(serviceConnection, "serviceConnection");
                    Context context = sessionLifecycleServiceBinder.f685a;
                    Intent intent = new Intent(context, (Class<?>) SessionLifecycleService.class);
                    Log.d("LifecycleServiceBinder", "Binding service to application.");
                    intent.setAction(String.valueOf(Process.myPid()));
                    intent.putExtra("ClientCallbackMessenger", messenger);
                    intent.setPackage(context.getPackageName());
                    try {
                        z8 = context.bindService(intent, serviceConnection, 65);
                    } catch (SecurityException e2) {
                        Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e2);
                        z8 = false;
                    }
                    if (!z8) {
                        try {
                            context.unbindService(serviceConnection);
                        } catch (IllegalArgumentException e10) {
                            Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e10);
                        }
                        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
                    }
                    j0.f693c = obj2;
                    if (j0.f692b) {
                        j0.f692b = false;
                        obj2.L(1);
                    }
                    A4.p pVar = new A4.p(2);
                    Y6.i iVar = c0052p.f709a;
                    iVar.b();
                    iVar.j.add(pVar);
                }
                return Db.q.f3365a;
            }
            com.bumptech.glide.c.c0(obj);
        }
        Collection values = ((Map) obj).values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (((v7.i) it.next()).f25117a.b()) {
                    E8.j jVar2 = c0052p.f710b;
                    this.f705a = 2;
                    if (jVar2.b(this) == aVar) {
                        return aVar;
                    }
                    E8.j jVar3 = c0052p.f710b;
                    a9 = jVar3.f3784a.a();
                    if (a9 == null) {
                    }
                    if (booleanValue) {
                    }
                    return Db.q.f3365a;
                }
            }
        }
        Log.d(FirebaseSessionsRegistrar.TAG, "No Sessions subscribers. Not listening to lifecycle events.");
        return Db.q.f3365a;
    }
}
