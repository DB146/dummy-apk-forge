package x;

import Q.C0480b;

/* loaded from: classes.dex */
public final class g0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public float f26088a;

    /* renamed from: b, reason: collision with root package name */
    public int f26089b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f26091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, Hb.d dVar) {
        super(2, dVar);
        this.f26091d = i0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        g0 g0Var = new g0(this.f26091d, dVar);
        g0Var.f26090c = obj;
        return g0Var;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        float i7;
        cc.E e2;
        Ib.a aVar = Ib.a.f5345a;
        int i10 = this.f26089b;
        if (i10 == 0) {
            com.bumptech.glide.c.c0(obj);
            cc.E e10 = (cc.E) this.f26090c;
            i7 = AbstractC2232b.i(e10.l());
            e2 = e10;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = this.f26088a;
            e2 = (cc.E) this.f26090c;
            com.bumptech.glide.c.c0(obj);
        }
        while (cc.F.w(e2)) {
            f0 f0Var = new f0(this.f26091d, i7);
            this.f26090c = e2;
            this.f26088a = i7;
            this.f26089b = 1;
            if (C0480b.m(getContext()).n(f0Var, this) == aVar) {
                return aVar;
            }
        }
        return Db.q.f3365a;
    }
}
