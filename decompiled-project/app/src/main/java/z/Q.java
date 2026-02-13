package z;

import o4.C1798l;

/* loaded from: classes.dex */
public final class Q extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27929a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1798l f27931c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(C1798l c1798l, Hb.d dVar) {
        super(2, dVar);
        this.f27931c = c1798l;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        Q q10 = new Q(this.f27931c, dVar);
        q10.f27930b = obj;
        return q10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:9:0x0031, B:11:0x003b, B:16:0x004d, B:25:0x0026), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        cc.E e2;
        cc.E e10;
        C2537I c2537i;
        float p10;
        float p11;
        w0 w0Var;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27929a;
        C1798l c1798l = this.f27931c;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                e2 = (cc.E) this.f27930b;
                if (!cc.F.v(e2.l())) {
                }
            } else if (i7 == 1) {
                e10 = (cc.E) this.f27930b;
                com.bumptech.glide.c.c0(obj);
                c2537i = (C2537I) obj;
                p10 = ((V0.c) c1798l.f21859e).p(AbstractC2536H.f27870a);
                p11 = ((V0.c) c1798l.f21859e).p(AbstractC2536H.f27871b);
                w0Var = (w0) c1798l.f21856b;
                this.f27930b = e10;
                this.f27929a = 2;
                if (C1798l.c(c1798l, w0Var, c2537i, p10, p11, this) == aVar) {
                }
                e2 = e10;
                if (!cc.F.v(e2.l())) {
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e10 = (cc.E) this.f27930b;
                com.bumptech.glide.c.c0(obj);
                e2 = e10;
                if (!cc.F.v(e2.l())) {
                    ec.d dVar = (ec.d) c1798l.f21860f;
                    this.f27930b = e2;
                    this.f27929a = 1;
                    Object c10 = dVar.c(this);
                    if (c10 == aVar) {
                        return aVar;
                    }
                    e10 = e2;
                    obj = c10;
                    c2537i = (C2537I) obj;
                    p10 = ((V0.c) c1798l.f21859e).p(AbstractC2536H.f27870a);
                    p11 = ((V0.c) c1798l.f21859e).p(AbstractC2536H.f27871b);
                    w0Var = (w0) c1798l.f21856b;
                    this.f27930b = e10;
                    this.f27929a = 2;
                    if (C1798l.c(c1798l, w0Var, c2537i, p10, p11, this) == aVar) {
                        return aVar;
                    }
                    e2 = e10;
                    if (!cc.F.v(e2.l())) {
                        c1798l.g = null;
                        return Db.q.f3365a;
                    }
                }
            }
        } catch (Throwable th) {
            c1798l.g = null;
            throw th;
        }
    }
}
