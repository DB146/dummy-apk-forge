package A8;

import I2.BinderC0328q;
import I2.C0327p;
import I2.InterfaceC0319h;
import J6.C0345b;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class f0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f660b;

    public /* synthetic */ f0(Object obj, int i7) {
        this.f659a = i7;
        this.f660b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [I2.g, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        InterfaceC0319h interfaceC0319h;
        Object obj = this.f660b;
        switch (this.f659a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                q3.i iVar = (q3.i) obj;
                sb2.append(((LinkedBlockingDeque) iVar.f23384c).size());
                Log.d("SessionLifecycleClient", sb2.toString());
                iVar.f23383b = new Messenger(service);
                ArrayList arrayList = new ArrayList();
                ((LinkedBlockingDeque) iVar.f23384c).drainTo(arrayList);
                cc.F.B(cc.F.b((Hb.i) iVar.f23382a), null, 0, new e0(iVar, arrayList, null), 3);
                return;
            case 1:
                F6.o oVar = (F6.o) obj;
                oVar.f4166b.c("ServiceConnectionImpl.onServiceConnected(%s)", name);
                oVar.a().post(new F6.n(this, service));
                return;
            case 2:
                kotlin.jvm.internal.l.e(name, "name");
                kotlin.jvm.internal.l.e(service, "service");
                int i7 = BinderC0328q.f5192b;
                IInterface queryLocalInterface = service.queryLocalInterface(InterfaceC0319h.f5161h);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0319h)) {
                    ?? obj2 = new Object();
                    obj2.f5160a = service;
                    interfaceC0319h = obj2;
                } else {
                    interfaceC0319h = (InterfaceC0319h) queryLocalInterface;
                }
                C0327p c0327p = (C0327p) obj;
                c0327p.g = interfaceC0319h;
                try {
                    c0327p.f5189f = interfaceC0319h.u(c0327p.j, c0327p.f5184a);
                    return;
                } catch (RemoteException e2) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
                    return;
                }
            default:
                J6.d dVar = (J6.d) obj;
                dVar.f5545b.b("ServiceConnectionImpl.onServiceConnected(%s)", name);
                dVar.a().post(new C0345b(this, service));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        switch (this.f659a) {
            case 0:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                q3.i iVar = (q3.i) this.f660b;
                iVar.f23383b = null;
                iVar.getClass();
                return;
            case 1:
                F6.o oVar = (F6.o) this.f660b;
                oVar.f4166b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", name);
                oVar.a().post(new F6.m(this, 1));
                return;
            case 2:
                kotlin.jvm.internal.l.e(name, "name");
                ((C0327p) this.f660b).g = null;
                return;
            default:
                J6.d dVar = (J6.d) this.f660b;
                dVar.f5545b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", name);
                dVar.a().post(new J6.c(this, 0));
                return;
        }
    }
}
