package x;

import a0.C0694u;
import cc.C0944m;
import mc.InterfaceC1656a;

/* loaded from: classes.dex */
public final class k0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1656a f26114a;

    /* renamed from: b, reason: collision with root package name */
    public O f26115b;

    /* renamed from: c, reason: collision with root package name */
    public int f26116c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f26117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(O o10, Hb.d dVar) {
        super(2, dVar);
        this.f26117d = o10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new k0(this.f26117d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Db.g, java.lang.Object] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1656a interfaceC1656a;
        O o10;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26116c;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            O o11 = this.f26117d;
            o11.getClass();
            ((C0694u) n0.f26126a.getValue()).c(o11, Y.f26015d, o11.f25969u);
            interfaceC1656a = o11.f25972x;
            this.f26114a = interfaceC1656a;
            this.f26115b = o11;
            this.f26116c = 1;
            if (interfaceC1656a.n(this) == aVar) {
                return aVar;
            }
            o10 = o11;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o10 = this.f26115b;
            interfaceC1656a = this.f26114a;
            com.bumptech.glide.c.c0(obj);
        }
        try {
            o10.f25966d = o10.n();
            C0944m c0944m = o10.f25971w;
            if (c0944m != null) {
                c0944m.resumeWith(o10.n());
            }
            o10.f25971w = null;
            interfaceC1656a.l(null);
            return Db.q.f3365a;
        } catch (Throwable th) {
            interfaceC1656a.l(null);
            throw th;
        }
    }
}
