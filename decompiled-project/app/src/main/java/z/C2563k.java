package z;

import F.C0276u;
import java.util.concurrent.CancellationException;
import x.AbstractC2232b;
import x.C2238h;
import x.C2246p;
import x.C2247q;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2563k extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.s f28016a;

    /* renamed from: b, reason: collision with root package name */
    public C2238h f28017b;

    /* renamed from: c, reason: collision with root package name */
    public int f28018c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f28019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2565l f28020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0 f28021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2563k(float f4, C2565l c2565l, r0 r0Var, Hb.d dVar) {
        super(2, dVar);
        this.f28019d = f4;
        this.f28020e = c2565l;
        this.f28021f = r0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2563k(this.f28019d, this.f28020e, this.f28021f, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2563k) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.internal.s] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        float f4;
        kotlin.jvm.internal.s obj2;
        C2238h c2238h;
        Object obj3 = Ib.a.f5345a;
        int i7 = this.f28018c;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            f4 = this.f28019d;
            if (Math.abs(f4) > 1.0f) {
                obj2 = new Object();
                obj2.f19131a = f4;
                Object obj4 = new Object();
                C2238h a9 = AbstractC2232b.a(28, f4);
                try {
                    C2565l c2565l = this.f28020e;
                    C2247q c2247q = c2565l.f28024a;
                    C0276u c0276u = new C0276u(obj4, this.f28021f, obj2, c2565l, 2);
                    this.f28016a = obj2;
                    this.f28017b = a9;
                    this.f28018c = 1;
                    Object b2 = AbstractC2232b.b(a9, new C2246p(c2247q, x.p0.f26141a, a9.f26093b.getValue(), a9.f26094c), Long.MIN_VALUE, c0276u, this);
                    if (b2 != obj3) {
                        b2 = Db.q.f3365a;
                    }
                    if (b2 == obj3) {
                        return obj3;
                    }
                } catch (CancellationException unused) {
                    c2238h = a9;
                    obj2.f19131a = ((Number) ((Rb.c) c2238h.f26092a.f16838c).invoke(c2238h.f26094c)).floatValue();
                    f4 = obj2.f19131a;
                    return new Float(f4);
                }
            }
            return new Float(f4);
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c2238h = this.f28017b;
        obj2 = this.f28016a;
        try {
            com.bumptech.glide.c.c0(obj);
        } catch (CancellationException unused2) {
            obj2.f19131a = ((Number) ((Rb.c) c2238h.f26092a.f16838c).invoke(c2238h.f26094c)).floatValue();
            f4 = obj2.f19131a;
            return new Float(f4);
        }
        f4 = obj2.f19131a;
        return new Float(f4);
    }
}
