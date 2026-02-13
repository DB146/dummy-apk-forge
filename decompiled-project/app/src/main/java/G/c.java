package G;

import B0.c1;
import Db.q;
import Jb.i;
import cc.E;
import q3.f;

/* loaded from: classes.dex */
public final class c extends i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f4228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f4230c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, c1 c1Var, Hb.d dVar) {
        super(2, dVar);
        this.f4229b = eVar;
        this.f4230c = c1Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new c(this.f4229b, this.f4230c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f4228a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f4228a = 1;
            if (f.f(this.f4229b, this.f4230c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return q.f3365a;
    }
}
