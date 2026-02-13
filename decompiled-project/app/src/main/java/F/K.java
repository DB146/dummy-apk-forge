package F;

import E.C0249d;
import y.EnumC2292N;

/* loaded from: classes.dex */
public final class K extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f3915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f3916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l10, int i7, Hb.d dVar) {
        super(2, dVar);
        this.f3916b = l10;
        this.f3917c = i7;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new K(this.f3916b, this.f3917c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f3915a;
        Db.q qVar = Db.q.f3365a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            C0249d c0249d = this.f3916b.f3919D;
            this.f3915a = 1;
            c0249d.getClass();
            q3.s sVar = E.A.f3368w;
            E.A a9 = c0249d.f3404a;
            a9.getClass();
            Object f4 = a9.f(EnumC2292N.f26416a, new E.z(a9, this.f3917c, null), this);
            if (f4 != aVar) {
                f4 = qVar;
            }
            if (f4 != aVar) {
                f4 = qVar;
            }
            if (f4 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return qVar;
    }
}
