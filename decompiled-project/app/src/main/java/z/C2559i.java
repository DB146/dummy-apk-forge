package z;

import cc.InterfaceC0937i0;
import java.util.concurrent.CancellationException;
import y.EnumC2292N;

/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2559i extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27995a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2561j f27997c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ J0 f27998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2547c f27999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2559i(C2561j c2561j, J0 j02, InterfaceC2547c interfaceC2547c, Hb.d dVar) {
        super(2, dVar);
        this.f27997c = c2561j;
        this.f27998d = j02;
        this.f27999e = interfaceC2547c;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2559i c2559i = new C2559i(this.f27997c, this.f27998d, this.f27999e, dVar);
        c2559i.f27996b = obj;
        return c2559i;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2559i) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27995a;
        C2561j c2561j = this.f27997c;
        try {
            try {
                if (i7 == 0) {
                    com.bumptech.glide.c.c0(obj);
                    InterfaceC0937i0 r10 = cc.F.r(((cc.E) this.f27996b).l());
                    c2561j.f28012K = true;
                    w0 w0Var = c2561j.f28005D;
                    EnumC2292N enumC2292N = EnumC2292N.f26416a;
                    C2557h c2557h = new C2557h(this.f27998d, c2561j, this.f27999e, r10, null);
                    this.f27995a = 1;
                    if (w0Var.e(enumC2292N, c2557h, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                }
                c2561j.f28007F.b();
                c2561j.f28012K = false;
                c2561j.f28007F.a(null);
                c2561j.f28009H = false;
                return Db.q.f3365a;
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Throwable th) {
            c2561j.f28012K = false;
            c2561j.f28007F.a(null);
            c2561j.f28009H = false;
            throw th;
        }
    }
}
