package d;

import Db.q;
import Jb.i;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class d extends i implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f16284a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, Hb.d dVar) {
        super(3, dVar);
        this.f16284a = rVar;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        d dVar = new d(this.f16284a, (Hb.d) obj3);
        q qVar = q.f3365a;
        dVar.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        this.f16284a.f19130a = true;
        return q.f3365a;
    }
}
