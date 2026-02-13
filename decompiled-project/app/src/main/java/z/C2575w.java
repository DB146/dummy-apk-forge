package z;

import java.util.concurrent.CancellationException;
import u0.InterfaceC2083m;

/* renamed from: z.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2575w extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28112a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f28114c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2083m f28115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S0.a f28116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C.D f28117f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2576x f28118u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2576x f28119v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ A0.j0 f28120w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2575w(p0 p0Var, InterfaceC2083m interfaceC2083m, S0.a aVar, C.D d10, C2576x c2576x, C2576x c2576x2, A0.j0 j0Var, Hb.d dVar) {
        super(2, dVar);
        this.f28114c = p0Var;
        this.f28115d = interfaceC2083m;
        this.f28116e = aVar;
        this.f28117f = d10;
        this.f28118u = c2576x;
        this.f28119v = c2576x2;
        this.f28120w = j0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2576x c2576x = this.f28119v;
        A0.j0 j0Var = this.f28120w;
        C2575w c2575w = new C2575w(this.f28114c, this.f28115d, this.f28116e, this.f28117f, this.f28118u, c2576x, j0Var, dVar);
        c2575w.f28113b = obj;
        return c2575w;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2575w) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [cc.E] */
    /* JADX WARN: Type inference failed for: r2v11, types: [cc.E] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.u, java.lang.Object] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        ?? r22 = this.f28112a;
        Db.q qVar = Db.q.f3365a;
        p0 p0Var = this.f28114c;
        try {
            if (r22 == 0) {
                com.bumptech.glide.c.c0(obj);
                cc.E e2 = (cc.E) this.f28113b;
                V v10 = p0Var.f28049E;
                InterfaceC2083m interfaceC2083m = this.f28115d;
                S0.a aVar2 = this.f28116e;
                C.D d10 = this.f28117f;
                C2576x c2576x = this.f28118u;
                C2576x c2576x2 = this.f28119v;
                A0.j0 j0Var = this.f28120w;
                this.f28113b = e2;
                this.f28112a = 1;
                float f4 = AbstractC2574v.f28107a;
                Object c10 = AbstractC2556g0.c(interfaceC2083m, new C2573u(c2576x2, new Object(), v10, aVar2, j0Var, c2576x, d10, null), this);
                r22 = c10;
                if (c10 != aVar) {
                    r22 = qVar;
                }
                if (r22 == aVar) {
                    return aVar;
                }
            } else {
                if (r22 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r22 = (cc.E) this.f28113b;
                com.bumptech.glide.c.c0(obj);
            }
        } catch (CancellationException e10) {
            ec.d dVar = p0Var.f28053I;
            if (dVar != null) {
                dVar.h(C2569p.f28048a);
            }
            if (!cc.F.w(r22)) {
                throw e10;
            }
        }
        return qVar;
    }
}
