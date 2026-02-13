package M;

import E.u;
import cc.E;
import x.o0;

/* loaded from: classes.dex */
public final class p extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f6515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f6516c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f6517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, float f4, o0 o0Var, Hb.d dVar) {
        super(2, dVar);
        this.f6515b = uVar;
        this.f6516c = f4;
        this.f6517d = o0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new p(this.f6515b, this.f6516c, this.f6517d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6514a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            Y.k kVar = (Y.k) this.f6515b.f3500c;
            Float f4 = new Float(this.f6516c);
            this.f6514a = 1;
            if (Y.k.c(kVar, f4, this.f6517d, null, this, 12) == aVar) {
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
