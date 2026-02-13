package n3;

import A0.K;
import Db.q;
import Jb.i;
import ec.r;
import h3.z;
import java.util.LinkedHashSet;

/* renamed from: n3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1697b extends i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f21061a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1698c f21063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1697b(AbstractC1698c abstractC1698c, Hb.d dVar) {
        super(2, dVar);
        this.f21063c = abstractC1698c;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C1697b c1697b = new C1697b(this.f21063c, dVar);
        c1697b.f21062b = obj;
        return c1697b;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1697b) create((r) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f21061a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            r rVar = (r) this.f21062b;
            AbstractC1698c abstractC1698c = this.f21063c;
            C1696a c1696a = new C1696a(abstractC1698c, rVar);
            o3.e eVar = abstractC1698c.f21064a;
            eVar.getClass();
            synchronized (eVar.f21672c) {
                try {
                    if (((LinkedHashSet) eVar.f21674e).add(c1696a)) {
                        if (((LinkedHashSet) eVar.f21674e).size() == 1) {
                            eVar.f21673d = eVar.c();
                            z.e().a(o3.f.f21675a, eVar.getClass().getSimpleName() + ": initial state = " + eVar.f21673d);
                            eVar.e();
                        }
                        c1696a.a(eVar.f21673d);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            K k = new K(13, this.f21063c, c1696a);
            this.f21061a = 1;
            if (Tb.a.c(rVar, k, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return q.f3365a;
    }
}
