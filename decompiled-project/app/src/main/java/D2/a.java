package D2;

import Db.q;
import E2.f;
import Jb.i;
import Rb.e;
import cc.E;

/* loaded from: classes.dex */
public final class a extends i implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f3154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3155b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Hb.d dVar2) {
        super(2, dVar2);
        this.f3155b = dVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new a(this.f3155b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f3154a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            f fVar = this.f3155b.f3163a;
            this.f3154a = 1;
            obj = fVar.c(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return obj;
    }
}
