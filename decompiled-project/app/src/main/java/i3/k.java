package i3;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* loaded from: classes.dex */
public final class k extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f18361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f18362b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, Hb.d dVar) {
        super(2, dVar);
        this.f18362b = context;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        k kVar = new k(this.f18362b, dVar);
        kVar.f18361a = ((Boolean) obj).booleanValue();
        return kVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        k kVar = (k) create(bool, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        kVar.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        r3.g.a(this.f18362b, RescheduleReceiver.class, this.f18361a);
        return Db.q.f3365a;
    }
}
