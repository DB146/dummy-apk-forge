package F6;

import J6.z;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4159b;

    public /* synthetic */ l(Object obj, int i7) {
        this.f4158a = i7;
        this.f4159b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f4158a) {
            case 0:
                o oVar = (o) this.f4159b;
                oVar.f4166b.c("reportBinderDeath", new Object[0]);
                if (oVar.f4172i.get() != null) {
                    throw new ClassCastException();
                }
                oVar.f4166b.c("%s : Binder has died.", oVar.f4167c);
                Iterator it = oVar.f4168d.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(oVar.f4167c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = kVar.f4157a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                oVar.f4168d.clear();
                synchronized (oVar.f4170f) {
                    oVar.d();
                }
                return;
            default:
                J6.d dVar = (J6.d) this.f4159b;
                dVar.f5545b.b("reportBinderDeath", new Object[0]);
                if (dVar.j.get() != null) {
                    throw new ClassCastException();
                }
                dVar.f5545b.b("%s : Binder has died.", dVar.f5546c);
                Iterator it2 = dVar.f5547d.iterator();
                while (it2.hasNext()) {
                    ((z) it2.next()).a(new RemoteException(String.valueOf(dVar.f5546c).concat(" : Binder has died.")));
                }
                dVar.f5547d.clear();
                synchronized (dVar.f5549f) {
                    dVar.e();
                }
                return;
        }
    }
}
