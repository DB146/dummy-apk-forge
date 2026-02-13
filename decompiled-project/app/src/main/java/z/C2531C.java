package z;

import java.util.concurrent.CancellationException;
import y.EnumC2292N;

/* renamed from: z.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2531C extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.v f27833a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.v f27834b;

    /* renamed from: c, reason: collision with root package name */
    public int f27835c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f27837e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2531C(p0 p0Var, Hb.d dVar) {
        super(2, dVar);
        this.f27837e = p0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2531C c2531c = new C2531C(this.f27837e, dVar);
        c2531c.f27836d = obj;
        return c2531c;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2531C) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:22|23|(1:25)|(1:44)|27|28|29|(2:34|(2:36|(1:38)))(2:31|(1:33))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[Catch: CancellationException -> 0x00d6, TryCatch #2 {CancellationException -> 0x00d6, blocks: (B:29:0x00bb, B:31:0x00c1, B:34:0x00d8, B:36:0x00dc), top: B:28:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8 A[Catch: CancellationException -> 0x00d6, TryCatch #2 {CancellationException -> 0x00d6, blocks: (B:29:0x00bb, B:31:0x00c1, B:34:0x00d8, B:36:0x00dc), top: B:28:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v22, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0083 -> B:8:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d3 -> B:8:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00da -> B:8:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e7 -> B:8:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f5 -> B:7:0x0029). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        cc.E e2;
        kotlin.jvm.internal.v vVar;
        kotlin.jvm.internal.v vVar2;
        cc.E e10;
        cc.E e11;
        Object obj2;
        Object e12;
        AbstractC2572t abstractC2572t;
        kotlin.jvm.internal.v vVar3;
        Object obj3;
        kotlin.jvm.internal.v vVar4;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27835c;
        Db.q qVar = Db.q.f3365a;
        p0 p0Var = this.f27837e;
        switch (i7) {
            case 0:
                com.bumptech.glide.c.c0(obj);
                e2 = (cc.E) this.f27836d;
                if (!cc.F.w(e2)) {
                    ?? obj4 = new Object();
                    ec.d dVar = p0Var.f28053I;
                    if (dVar != null) {
                        this.f27836d = e2;
                        this.f27833a = obj4;
                        this.f27834b = obj4;
                        this.f27835c = 1;
                        obj = dVar.c(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        vVar = obj4;
                        vVar4 = obj4;
                        abstractC2572t = (AbstractC2572t) obj;
                        vVar3 = vVar4;
                        vVar3.f19134a = abstractC2572t;
                        obj3 = vVar.f19134a;
                        if (obj3 instanceof r) {
                            this.f27836d = e2;
                            this.f27833a = vVar;
                            this.f27834b = null;
                            this.f27835c = 2;
                            if (p0.t0(p0Var, (r) obj3, this) == aVar) {
                                return aVar;
                            }
                            vVar2 = vVar;
                            e10 = e2;
                            C2530B c2530b = new C2530B(vVar2, p0Var, null);
                            this.f27836d = e10;
                            this.f27833a = vVar2;
                            this.f27835c = 3;
                            EnumC2292N enumC2292N = EnumC2292N.f26417b;
                            w0 w0Var = p0Var.f28061R;
                            e12 = w0Var.e(enumC2292N, new C2560i0(c2530b, w0Var, null), this);
                            if (e12 != Ib.a.f5345a) {
                                e12 = qVar;
                            }
                            if (e12 == aVar) {
                                return aVar;
                            }
                            e2 = e10;
                            obj2 = vVar2.f19134a;
                            if (obj2 instanceof C2571s) {
                                kotlin.jvm.internal.l.c(obj2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                                this.f27836d = e2;
                                this.f27833a = null;
                                this.f27835c = 4;
                                if (p0.u0(p0Var, (C2571s) obj2, this) == aVar) {
                                    return aVar;
                                }
                            } else if (obj2 instanceof C2569p) {
                                this.f27836d = e2;
                                this.f27833a = null;
                                this.f27835c = 5;
                                if (p0.s0(p0Var, this) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                        if (!cc.F.w(e2)) {
                            return qVar;
                        }
                    } else {
                        vVar = obj4;
                        abstractC2572t = null;
                        vVar3 = obj4;
                        vVar3.f19134a = abstractC2572t;
                        obj3 = vVar.f19134a;
                        if (obj3 instanceof r) {
                        }
                        if (!cc.F.w(e2)) {
                        }
                    }
                }
            case 1:
                kotlin.jvm.internal.v vVar5 = this.f27834b;
                vVar = this.f27833a;
                e2 = (cc.E) this.f27836d;
                com.bumptech.glide.c.c0(obj);
                vVar4 = vVar5;
                abstractC2572t = (AbstractC2572t) obj;
                vVar3 = vVar4;
                vVar3.f19134a = abstractC2572t;
                obj3 = vVar.f19134a;
                if (obj3 instanceof r) {
                }
                if (!cc.F.w(e2)) {
                }
                break;
            case 2:
                vVar2 = this.f27833a;
                e10 = (cc.E) this.f27836d;
                com.bumptech.glide.c.c0(obj);
                C2530B c2530b2 = new C2530B(vVar2, p0Var, null);
                this.f27836d = e10;
                this.f27833a = vVar2;
                this.f27835c = 3;
                EnumC2292N enumC2292N2 = EnumC2292N.f26417b;
                w0 w0Var2 = p0Var.f28061R;
                e12 = w0Var2.e(enumC2292N2, new C2560i0(c2530b2, w0Var2, null), this);
                if (e12 != Ib.a.f5345a) {
                }
                if (e12 == aVar) {
                }
                e2 = e10;
                obj2 = vVar2.f19134a;
                if (obj2 instanceof C2571s) {
                }
                if (!cc.F.w(e2)) {
                }
                break;
            case 3:
                vVar2 = this.f27833a;
                e10 = (cc.E) this.f27836d;
                try {
                    com.bumptech.glide.c.c0(obj);
                } catch (CancellationException unused) {
                    e11 = e10;
                    this.f27836d = e11;
                    this.f27833a = null;
                    this.f27835c = 6;
                    if (p0.s0(p0Var, this) == aVar) {
                        return aVar;
                    }
                    e2 = e11;
                    if (!cc.F.w(e2)) {
                    }
                }
                e2 = e10;
                obj2 = vVar2.f19134a;
                if (obj2 instanceof C2571s) {
                }
                if (!cc.F.w(e2)) {
                }
                break;
            case 4:
                e11 = (cc.E) this.f27836d;
                try {
                    com.bumptech.glide.c.c0(obj);
                } catch (CancellationException unused2) {
                    this.f27836d = e11;
                    this.f27833a = null;
                    this.f27835c = 6;
                    if (p0.s0(p0Var, this) == aVar) {
                    }
                    e2 = e11;
                    if (!cc.F.w(e2)) {
                    }
                }
                e2 = e11;
                if (!cc.F.w(e2)) {
                }
                break;
            case 5:
                e11 = (cc.E) this.f27836d;
                com.bumptech.glide.c.c0(obj);
                e2 = e11;
                if (!cc.F.w(e2)) {
                }
                break;
            case 6:
                e11 = (cc.E) this.f27836d;
                com.bumptech.glide.c.c0(obj);
                e2 = e11;
                if (!cc.F.w(e2)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
