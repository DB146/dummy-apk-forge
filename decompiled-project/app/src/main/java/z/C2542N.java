package z;

import o4.C1798l;
import x.C2238h;

/* renamed from: z.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2542N extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.r f27908a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.r f27909b;

    /* renamed from: c, reason: collision with root package name */
    public int f27910c;

    /* renamed from: d, reason: collision with root package name */
    public int f27911d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f27912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f27913f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f27914u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f27915v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f27916w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1798l f27917x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f27918y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ w0 f27919z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2542N(kotlin.jvm.internal.s sVar, kotlin.jvm.internal.v vVar, kotlin.jvm.internal.v vVar2, float f4, C1798l c1798l, float f10, w0 w0Var, Hb.d dVar) {
        super(2, dVar);
        this.f27913f = sVar;
        this.f27914u = vVar;
        this.f27915v = vVar2;
        this.f27916w = f4;
        this.f27917x = c1798l;
        this.f27918y = f10;
        this.f27919z = w0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2542N c2542n = new C2542N(this.f27913f, this.f27914u, this.f27915v, this.f27916w, this.f27917x, this.f27918y, this.f27919z, dVar);
        c2542n.f27912e = obj;
        return c2542n;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2542N) create((t0) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        r1 = java.lang.Math.signum(r1) * r4;
        o4.C1798l.b(r3, r0, r1);
        r2 = (x.C2238h) r10.f19134a;
        r1 = x.AbstractC2232b.g(r2, ((java.lang.Number) r2.f26093b.getValue()).floatValue() + r1);
        r10.f19134a = r1;
        r1 = Tb.a.F(java.lang.Math.abs(r12.f19131a - ((java.lang.Number) r1.f26093b.getValue()).floatValue()) / r20.f27918y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d1, code lost:
    
        if (r1 <= 100) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d3, code lost:
    
        r6 = 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d6, code lost:
    
        r5 = (x.C2238h) r10.f19134a;
        r4 = r12.f19131a;
        r3 = r20.f27917x;
        r14 = r6;
        r17 = new z.C2541M(r3, r11, r12, r20.f27919z, r7);
        r20.f27912e = r0;
        r20.f27908a = r7;
        r20.f27909b = null;
        r20.f27910c = r14;
        r20.f27911d = 2;
        r3.getClass();
        r1 = new java.lang.Object();
        r1.f19131a = ((java.lang.Number) r5.f26093b.getValue()).floatValue();
        r2 = r0;
        r0 = x.AbstractC2232b.d(r5, new java.lang.Float(r4), x.AbstractC2232b.k(r14, x.AbstractC2248s.f26152b, 2), new F.C0276u(r1, r3, r2, r17, 3), r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0140, code lost:
    
        if (r0 != Ib.a.f5345a) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0143, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0145, code lost:
    
        if (r0 != r9) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0147, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0148, code lost:
    
        r13 = r2;
        r14 = r7;
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x016f -> B:7:0x0171). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x017f -> B:8:0x017b). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var;
        kotlin.jvm.internal.r rVar;
        kotlin.jvm.internal.r rVar2;
        char c10;
        Object d10;
        t0 t0Var2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27911d;
        kotlin.jvm.internal.v vVar = this.f27914u;
        kotlin.jvm.internal.v vVar2 = this.f27915v;
        kotlin.jvm.internal.s sVar = this.f27913f;
        char c11 = 3;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            t0Var = (t0) this.f27912e;
            ?? obj2 = new Object();
            obj2.f19130a = true;
            rVar = obj2;
        } else if (i7 == 1) {
            kotlin.jvm.internal.r rVar3 = this.f27909b;
            kotlin.jvm.internal.r rVar4 = this.f27908a;
            t0 t0Var3 = (t0) this.f27912e;
            com.bumptech.glide.c.c0(obj);
            rVar = rVar4;
            rVar3.f19130a = ((Boolean) obj).booleanValue();
            t0Var = t0Var3;
            c11 = 3;
        } else if (i7 == 2) {
            int i10 = this.f27910c;
            kotlin.jvm.internal.r rVar5 = this.f27908a;
            t0 t0Var4 = (t0) this.f27912e;
            com.bumptech.glide.c.c0(obj);
            rVar2 = rVar5;
            t0 t0Var5 = t0Var4;
            if (rVar2.f19130a) {
                t0Var = t0Var5;
                rVar = rVar2;
                c11 = 3;
            } else {
                this.f27912e = t0Var5;
                this.f27908a = rVar2;
                this.f27909b = rVar2;
                c10 = 3;
                this.f27911d = 3;
                d10 = C1798l.d(this.f27917x, vVar2, sVar, this.f27919z, vVar, 50 - i10, this);
                if (d10 == aVar) {
                    return aVar;
                }
                t0Var2 = t0Var5;
                rVar = rVar2;
                rVar2.f19130a = ((Boolean) d10).booleanValue();
                t0Var = t0Var2;
                c11 = c10;
            }
        } else {
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.r rVar6 = this.f27909b;
            kotlin.jvm.internal.r rVar7 = this.f27908a;
            t0Var2 = (t0) this.f27912e;
            com.bumptech.glide.c.c0(obj);
            rVar2 = rVar6;
            rVar = rVar7;
            c10 = 3;
            d10 = obj;
            rVar2.f19130a = ((Boolean) d10).booleanValue();
            t0Var = t0Var2;
            c11 = c10;
        }
        while (true) {
            boolean z8 = rVar.f19130a;
            Db.q qVar = Db.q.f3365a;
            if (!z8) {
                return qVar;
            }
            rVar.f19130a = false;
            float floatValue = sVar.f19131a - ((Number) ((C2238h) vVar.f19134a).f26093b.getValue()).floatValue();
            boolean z10 = ((C2537I) vVar2.f19134a).f27881c;
            C1798l c1798l = this.f27917x;
            if (!z10) {
                float abs = Math.abs(floatValue);
                float f4 = this.f27916w;
                if (abs >= f4) {
                    break;
                }
            }
            char c12 = c11;
            t0 t0Var6 = t0Var;
            C1798l.b(c1798l, t0Var6, floatValue);
            this.f27912e = t0Var6;
            this.f27908a = rVar;
            this.f27909b = rVar;
            this.f27911d = 1;
            kotlin.jvm.internal.r rVar8 = rVar;
            Object d11 = C1798l.d(this.f27917x, vVar2, sVar, this.f27919z, vVar, 50L, this);
            if (d11 == aVar) {
                return aVar;
            }
            rVar = rVar8;
            rVar8.f19130a = ((Boolean) d11).booleanValue();
            t0Var = t0Var6;
            c11 = c12;
        }
    }
}
