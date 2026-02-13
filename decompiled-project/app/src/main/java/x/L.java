package x;

import Q.C0487e0;

/* loaded from: classes.dex */
public final class L extends Jb.i implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public int f25943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f25944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25945c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f25946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Hb.d dVar, Object obj, O o10, i0 i0Var) {
        super(1, dVar);
        this.f25944b = o10;
        this.f25945c = obj;
        this.f25946d = i0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Hb.d dVar) {
        return new L(dVar, this.f25945c, this.f25944b, this.f25946d);
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        return ((L) create((Hb.d) obj)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f25943a;
        i0 i0Var = this.f25946d;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            O o10 = this.f25944b;
            o10.Q();
            o10.f25974z = Long.MIN_VALUE;
            o10.T(0.0f);
            Object value = o10.f25965c.getValue();
            Object obj2 = this.f25945c;
            boolean equals = obj2.equals(value);
            C0487e0 c0487e0 = o10.f25964b;
            float f4 = equals ? -4.0f : obj2.equals(c0487e0.getValue()) ? -5.0f : -3.0f;
            i0Var.p(obj2);
            i0Var.n(0L);
            c0487e0.setValue(obj2);
            o10.T(0.0f);
            o10.D(obj2);
            i0Var.j(f4);
            if (f4 == -3.0f) {
                this.f25943a = 1;
                if (O.O(o10, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        i0Var.i();
        return Db.q.f3365a;
    }
}
