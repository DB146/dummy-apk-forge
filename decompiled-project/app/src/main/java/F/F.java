package F;

import g3.C1191j;
import x.AbstractC2232b;
import x.C2238h;
import x.Y;

/* loaded from: classes.dex */
public final class F extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f3906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1191j f3907b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(C1191j c1191j, Hb.d dVar) {
        super(2, dVar);
        this.f3907b = c1191j;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new F(this.f3907b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f3906a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            C2238h c2238h = (C2238h) this.f3907b.f17441b;
            Float f4 = new Float(0.0f);
            x.Q j = AbstractC2232b.j(1, new Float(0.5f));
            this.f3906a = 1;
            if (AbstractC2232b.d(c2238h, f4, j, Y.f26013b, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return Db.q.f3365a;
    }
}
