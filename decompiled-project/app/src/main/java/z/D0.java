package z;

import u0.InterfaceC2083m;
import y.C2309q;

/* loaded from: classes.dex */
public final class D0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27846a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2083m f27848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2309q f27849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0.w f27850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y f27851f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(InterfaceC2083m interfaceC2083m, C2309q c2309q, u0.w wVar, Y y10, Hb.d dVar) {
        super(2, dVar);
        this.f27848c = interfaceC2083m;
        this.f27849d = c2309q;
        this.f27850e = wVar;
        this.f27851f = y10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        u0.w wVar = this.f27850e;
        Y y10 = this.f27851f;
        D0 d02 = new D0(this.f27848c, this.f27849d, wVar, y10, dVar);
        d02.f27847b = obj;
        return d02;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((D0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27846a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            C0 c02 = new C0((cc.E) this.f27847b, this.f27849d, this.f27850e, this.f27851f, null);
            this.f27846a = 1;
            if (AbstractC2556g0.c(this.f27848c, c02, this) == aVar) {
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
