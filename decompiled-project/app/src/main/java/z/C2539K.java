package z;

import cc.InterfaceC0937i0;

/* renamed from: z.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2539K extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27893a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ec.d f27895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2539K(ec.d dVar, Hb.d dVar2) {
        super(2, dVar2);
        this.f27895c = dVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2539K c2539k = new C2539K(this.f27895c, dVar);
        c2539k.f27894b = obj;
        return c2539k;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2539K) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0937i0 interfaceC0937i0;
        Throwable th;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27893a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            cc.D0 B10 = cc.F.B((cc.E) this.f27894b, null, 0, new Jb.i(2, null), 3);
            try {
                ec.d dVar = this.f27895c;
                this.f27894b = B10;
                this.f27893a = 1;
                Object c10 = dVar.c(this);
                if (c10 == aVar) {
                    return aVar;
                }
                interfaceC0937i0 = B10;
                obj = c10;
            } catch (Throwable th2) {
                interfaceC0937i0 = B10;
                th = th2;
                interfaceC0937i0.cancel(null);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0937i0 = (InterfaceC0937i0) this.f27894b;
            try {
                com.bumptech.glide.c.c0(obj);
            } catch (Throwable th3) {
                th = th3;
                interfaceC0937i0.cancel(null);
                throw th;
            }
        }
        C2537I c2537i = (C2537I) obj;
        interfaceC0937i0.cancel(null);
        return c2537i;
    }
}
