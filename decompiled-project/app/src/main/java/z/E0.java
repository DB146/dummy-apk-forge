package z;

import cc.InterfaceC0937i0;

/* loaded from: classes.dex */
public final class E0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27853a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0937i0 f27855c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Jb.i f27856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E0(InterfaceC0937i0 interfaceC0937i0, Rb.e eVar, Hb.d dVar) {
        super(2, dVar);
        this.f27855c = interfaceC0937i0;
        this.f27856d = (Jb.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        E0 e02 = new E0(this.f27855c, this.f27856d, dVar);
        e02.f27854b = obj;
        return e02;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        cc.E e2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27853a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            e2 = (cc.E) this.f27854b;
            this.f27854b = e2;
            this.f27853a = 1;
            if (this.f27855c.join(this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
                return Db.q.f3365a;
            }
            e2 = (cc.E) this.f27854b;
            com.bumptech.glide.c.c0(obj);
        }
        this.f27854b = null;
        this.f27853a = 2;
        if (this.f27856d.invoke(e2, this) == aVar) {
            return aVar;
        }
        return Db.q.f3365a;
    }
}
