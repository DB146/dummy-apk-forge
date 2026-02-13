package cc;

/* loaded from: classes2.dex */
public final class s0 extends Jb.h implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public y0 f14570b;

    /* renamed from: c, reason: collision with root package name */
    public hc.k f14571c;

    /* renamed from: d, reason: collision with root package name */
    public int f14572d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f14573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0 f14574f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Hb.d dVar, w0 w0Var) {
        super(dVar);
        this.f14574f = w0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        s0 s0Var = new s0(dVar, this.f14574f);
        s0Var.f14573e = obj;
        return s0Var;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((Zb.h) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0062 -> B:6:0x0077). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y0 c10;
        Zb.h hVar;
        y0 y0Var;
        hc.k kVar;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f14572d;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            Zb.h hVar2 = (Zb.h) this.f14573e;
            Object C2 = this.f14574f.C();
            if (C2 instanceof C0951q) {
                r rVar = ((C0951q) C2).f14565e;
                this.f14572d = 1;
                hVar2.c(this, rVar);
                return aVar;
            }
            if ((C2 instanceof InterfaceC0931f0) && (c10 = ((InterfaceC0931f0) C2).c()) != null) {
                Object h10 = c10.h();
                kotlin.jvm.internal.l.c(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                hc.k kVar2 = (hc.k) h10;
                hVar = hVar2;
                y0Var = c10;
                kVar = kVar2;
                if (!kVar.equals(y0Var)) {
                }
            }
        } else if (i7 == 1) {
            com.bumptech.glide.c.c0(obj);
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.f14571c;
            y0Var = this.f14570b;
            hVar = (Zb.h) this.f14573e;
            com.bumptech.glide.c.c0(obj);
            kVar = kVar.i();
            if (!kVar.equals(y0Var)) {
                if (kVar instanceof C0951q) {
                    this.f14573e = hVar;
                    this.f14570b = y0Var;
                    this.f14571c = kVar;
                    this.f14572d = 2;
                    hVar.c(this, ((C0951q) kVar).f14565e);
                    Ib.a aVar2 = Ib.a.f5345a;
                    return aVar;
                }
                kVar = kVar.i();
                if (!kVar.equals(y0Var)) {
                }
            }
        }
        return Db.q.f3365a;
    }
}
