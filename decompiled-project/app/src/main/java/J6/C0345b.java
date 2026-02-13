package J6;

import A8.f0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: J6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345b extends z {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IBinder f5539u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f0 f5540v;

    public C0345b(f0 f0Var, IBinder iBinder) {
        this.f5540v = f0Var;
        this.f5539u = iBinder;
    }

    @Override // J6.z
    public final void b() {
        d dVar = (d) this.f5540v.f660b;
        dVar.f5554n = (IInterface) dVar.f5551i.a(this.f5539u);
        y yVar = dVar.f5545b;
        yVar.b("linkToDeath", new Object[0]);
        try {
            dVar.f5554n.asBinder().linkToDeath(dVar.k, 0);
        } catch (RemoteException e2) {
            yVar.a(e2, "linkToDeath failed", new Object[0]);
        }
        dVar.g = false;
        Iterator it = dVar.f5547d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        dVar.f5547d.clear();
    }
}
