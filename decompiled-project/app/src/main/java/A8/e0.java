package A8;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import y7.u0;

/* loaded from: classes.dex */
public final class e0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q3.i f652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(q3.i iVar, ArrayList arrayList, Hb.d dVar) {
        super(2, dVar);
        this.f652b = iVar;
        this.f653c = arrayList;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new e0(this.f652b, this.f653c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Comparator] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f651a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            B8.c cVar = B8.c.f2227a;
            this.f651a = 1;
            obj = cVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
        } else {
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (((v7.i) it.next()).f25117a.b()) {
                        ArrayList arrayList = this.f653c;
                        q3.i iVar = this.f652b;
                        for (Message message : Eb.o.n0(new Object(), Eb.o.X(u0.B(q3.i.a(iVar, arrayList, 2), q3.i.a(iVar, arrayList, 1))))) {
                            if (((Messenger) iVar.f23383b) != null) {
                                try {
                                    Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                    Messenger messenger = (Messenger) iVar.f23383b;
                                    if (messenger != null) {
                                        messenger.send(message);
                                    }
                                } catch (RemoteException e2) {
                                    Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e2);
                                    iVar.G(message);
                                }
                            } else {
                                iVar.G(message);
                            }
                        }
                    }
                }
            }
            Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
        }
        return Db.q.f3365a;
    }
}
