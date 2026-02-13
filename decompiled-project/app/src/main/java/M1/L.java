package M1;

import cc.C0953t;

/* loaded from: classes.dex */
public final class L extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6602a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f6604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Jb.i f6605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(Q q10, Rb.e eVar, Hb.d dVar) {
        super(2, dVar);
        this.f6604c = q10;
        this.f6605d = (Jb.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        L l10 = new L(this.f6604c, this.f6605d, dVar);
        l10.f6603b = obj;
        return l10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6602a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            cc.E e2 = (cc.E) this.f6603b;
            C0953t a9 = cc.F.a();
            Q q10 = this.f6604c;
            T t5 = new T(this.f6605d, a9, q10.f6627h.u(), e2.l());
            r8.o oVar = q10.f6629l;
            Object h10 = ((ec.d) oVar.f23859d).h(t5);
            if (h10 instanceof ec.i) {
                ec.i iVar = h10 instanceof ec.i ? (ec.i) h10 : null;
                Throwable th = iVar != null ? iVar.f16891a : null;
                if (th == null) {
                    throw new IllegalStateException("Channel was closed normally");
                }
                throw th;
            }
            if (h10 instanceof ec.j) {
                throw new IllegalStateException("Check failed.");
            }
            if (((C0386a) oVar.f23860e).f6654a.getAndIncrement() == 0) {
                cc.F.B((cc.E) oVar.f23857b, null, 0, new W(oVar, null), 3);
            }
            this.f6602a = 1;
            obj = a9.o(this);
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
