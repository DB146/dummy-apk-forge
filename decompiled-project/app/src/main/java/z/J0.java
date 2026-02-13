package z;

import B0.c1;
import Q.C0480b;
import x.C2239i;
import y.C2279A;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: f, reason: collision with root package name */
    public static final C2239i f27887f = new C2239i(0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final x.q0 f27888a;

    /* renamed from: b, reason: collision with root package name */
    public long f27889b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public C2239i f27890c = f27887f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27891d;

    /* renamed from: e, reason: collision with root package name */
    public float f27892e;

    public J0(x.Q q10) {
        this.f27888a = q10.a(x.p0.f26141a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        if (r13 != 0.0f) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r12v4, types: [Rb.a] */
    /* JADX WARN: Type inference failed for: r13v4, types: [Rb.c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [Hb.d, z.H0] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [z.J0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b8 -> B:24:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C.D d10, c1 c1Var, Jb.c cVar) {
        ?? r22;
        int i7;
        float f4;
        J0 j02;
        H0 h02;
        C.D d11;
        c1 c1Var2;
        Rb.a aVar;
        J0 j03;
        try {
            if (cVar instanceof H0) {
                H0 h03 = (H0) cVar;
                int i10 = h03.f27878u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    h03.f27878u = i10 - Integer.MIN_VALUE;
                    r22 = h03;
                    Object obj = r22.f27876e;
                    Ib.a aVar2 = Ib.a.f5345a;
                    i7 = r22.f27878u;
                    C2239i c2239i = f27887f;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        if (this.f27891d) {
                            B.a.c("animateToZero called while previous animation is running");
                        }
                        c0.p pVar = (c0.p) r22.getContext().get(c0.b.f14088A);
                        float F10 = pVar != null ? pVar.F() : 1.0f;
                        this.f27891d = true;
                        f4 = F10;
                        j02 = this;
                        h02 = r22;
                        d11 = d10;
                        c1Var2 = c1Var;
                        if (Math.abs(j02.f27892e) >= 0.01f) {
                            I0 i02 = new I0(j02, f4, d11);
                            h02.f27872a = j02;
                            h02.f27873b = d11;
                            h02.f27874c = c1Var2;
                            h02.f27875d = f4;
                            h02.f27878u = 1;
                            if (C0480b.m(h02.getContext()).n(i02, h02) == aVar2) {
                                return aVar2;
                            }
                            c1Var2.invoke();
                        }
                        J0 j04 = j02;
                        c1 c1Var3 = c1Var2;
                        J0 j05 = j04;
                        if (Math.abs(j05.f27892e) == 0.0f) {
                            j03 = j05;
                            j03.f27889b = Long.MIN_VALUE;
                            j03.f27890c = c2239i;
                            j03.f27891d = false;
                            return Db.q.f3365a;
                        }
                        C2279A c2279a = new C2279A(3, j05, d11);
                        h02.f27872a = j05;
                        h02.f27873b = c1Var3;
                        h02.f27874c = null;
                        h02.f27878u = 2;
                        if (C0480b.m(h02.getContext()).n(c2279a, h02) == aVar2) {
                            return aVar2;
                        }
                        aVar = c1Var3;
                        r22 = j05;
                        aVar.invoke();
                        j03 = r22;
                        j03.f27889b = Long.MIN_VALUE;
                        j03.f27890c = c2239i;
                        j03.f27891d = false;
                        return Db.q.f3365a;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (Rb.a) r22.f27873b;
                        J0 j06 = r22.f27872a;
                        com.bumptech.glide.c.c0(obj);
                        r22 = j06;
                        aVar.invoke();
                        j03 = r22;
                        j03.f27889b = Long.MIN_VALUE;
                        j03.f27890c = c2239i;
                        j03.f27891d = false;
                        return Db.q.f3365a;
                    }
                    float f10 = r22.f27875d;
                    ?? r12 = r22.f27874c;
                    ?? r13 = (Rb.c) r22.f27873b;
                    J0 j07 = r22.f27872a;
                    try {
                        com.bumptech.glide.c.c0(obj);
                        d11 = r13;
                        f4 = f10;
                        j02 = j07;
                        h02 = r22;
                        c1Var2 = r12;
                        try {
                            c1Var2.invoke();
                        } catch (Throwable th) {
                            th = th;
                            r22 = j02;
                            r22.f27889b = Long.MIN_VALUE;
                            r22.f27890c = c2239i;
                            r22.f27891d = false;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r22 = j07;
                        r22.f27889b = Long.MIN_VALUE;
                        r22.f27890c = c2239i;
                        r22.f27891d = false;
                        throw th;
                    }
                }
            }
            if (i7 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        r22 = new H0(this, cVar);
        Object obj2 = r22.f27876e;
        Ib.a aVar22 = Ib.a.f5345a;
        i7 = r22.f27878u;
        C2239i c2239i2 = f27887f;
    }
}
