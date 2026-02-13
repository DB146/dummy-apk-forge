package x;

import F.C0276u;
import Q.C0487e0;
import ea.C1111f;
import java.util.concurrent.CancellationException;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2231a extends Jb.i implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public C2238h f26033a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.r f26034b;

    /* renamed from: c, reason: collision with root package name */
    public int f26035c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y.k f26036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z f26038f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f26039u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Rb.c f26040v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2231a(Y.k kVar, Object obj, Z z8, long j, Rb.c cVar, Hb.d dVar) {
        super(1, dVar);
        this.f26036d = kVar;
        this.f26037e = obj;
        this.f26038f = z8;
        this.f26039u = j;
        this.f26040v = cVar;
    }

    @Override // Jb.a
    public final Hb.d create(Hb.d dVar) {
        return new C2231a(this.f26036d, this.f26037e, this.f26038f, this.f26039u, this.f26040v, dVar);
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        return ((C2231a) create((Hb.d) obj)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        C2238h c2238h;
        kotlin.jvm.internal.r rVar;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26035c;
        Y.k kVar = this.f26036d;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                ((C2238h) kVar.f11056c).f26094c = (AbstractC2243m) ((Rb.c) ((C1111f) kVar.f11054a).f16837b).invoke(this.f26037e);
                Z z8 = this.f26038f;
                ((C0487e0) kVar.f11058e).setValue(z8.f26027c);
                ((C0487e0) kVar.f11057d).setValue(Boolean.TRUE);
                C2238h c2238h2 = (C2238h) kVar.f11056c;
                C2238h c2238h3 = new C2238h(c2238h2.f26092a, c2238h2.f26093b.getValue(), AbstractC2232b.f(c2238h2.f26094c), c2238h2.f26095d, Long.MIN_VALUE, c2238h2.f26097f);
                ?? obj2 = new Object();
                long j = this.f26039u;
                C0276u c0276u = new C0276u(kVar, c2238h3, this.f26040v, obj2, 1);
                this.f26033a = c2238h3;
                this.f26034b = obj2;
                this.f26035c = 1;
                if (AbstractC2232b.b(c2238h3, z8, j, c0276u, this) == aVar) {
                    return aVar;
                }
                c2238h = c2238h3;
                rVar = obj2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = this.f26034b;
                c2238h = this.f26033a;
                com.bumptech.glide.c.c0(obj);
            }
            EnumC2234d enumC2234d = rVar.f19130a ? EnumC2234d.f26056a : EnumC2234d.f26057b;
            Y.k.a(kVar);
            return new C2235e(c2238h, enumC2234d);
        } catch (CancellationException e2) {
            Y.k.a(kVar);
            throw e2;
        }
    }
}
