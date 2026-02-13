package P2;

import Db.q;
import I2.E;

/* loaded from: classes.dex */
public final class d extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f7771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f7772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7773c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Rb.c f7775e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Hb.d dVar, E e2, Rb.c cVar, boolean z8, boolean z10) {
        super(2, dVar);
        this.f7772b = e2;
        this.f7773c = z8;
        this.f7774d = z10;
        this.f7775e = cVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new d(dVar, this.f7772b, this.f7775e, this.f7773c, this.f7774d);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f7771a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            boolean z8 = this.f7774d;
            boolean z10 = this.f7773c;
            E e2 = this.f7772b;
            g gVar = new g(null, e2, this.f7775e, z8, z10);
            this.f7771a = 1;
            obj = e2.w(z10, gVar, this);
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
