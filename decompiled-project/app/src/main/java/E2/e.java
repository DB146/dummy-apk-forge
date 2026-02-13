package E2;

import Db.q;
import cc.E;

/* loaded from: classes.dex */
public final class e extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f3519b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Hb.d dVar) {
        super(2, dVar);
        this.f3519b = fVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        e eVar = new e(this.f3519b, dVar);
        eVar.f3518a = obj;
        return eVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        ((e) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
        throw null;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        throw null;
    }
}
