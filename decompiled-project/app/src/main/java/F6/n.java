package F6;

import A8.f0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f4162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f4163c;

    public n(f0 f0Var, IBinder iBinder) {
        this.f4163c = f0Var;
        this.f4162b = iBinder;
    }

    @Override // F6.k
    public final void a() {
        h fVar;
        f0 f0Var = this.f4163c;
        int i7 = g.f4153a;
        IBinder iBinder = this.f4162b;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            fVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new f(iBinder);
        }
        o oVar = (o) f0Var.f660b;
        oVar.f4174m = fVar;
        oVar.f4166b.c("linkToDeath", new Object[0]);
        try {
            oVar.f4174m.asBinder().linkToDeath(oVar.j, 0);
        } catch (RemoteException e2) {
            Object[] objArr = new Object[0];
            D9.a aVar = oVar.f4166b;
            aVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", D9.a.d(aVar.f3289a, "linkToDeath failed", objArr), e2);
            }
        }
        oVar.g = false;
        Iterator it = oVar.f4168d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        oVar.f4168d.clear();
    }
}
