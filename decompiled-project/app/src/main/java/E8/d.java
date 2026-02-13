package E8;

import Db.q;
import android.util.Log;

/* loaded from: classes.dex */
public final class d extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3762a;

    /* JADX WARN: Type inference failed for: r0v0, types: [Jb.i, Hb.d, E8.d] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        ?? iVar = new Jb.i(2, dVar);
        iVar.f3762a = obj;
        return iVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) create((String) obj, (Hb.d) obj2);
        q qVar = q.f3365a;
        dVar.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f3762a));
        return q.f3365a;
    }
}
