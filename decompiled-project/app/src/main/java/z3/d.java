package z3;

import A0.K;
import Db.q;
import com.bumptech.glide.k;
import com.bumptech.glide.n;
import ec.r;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28227a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y6.b f28229c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f28230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f28231e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Y6.b bVar, k kVar, n nVar, Hb.d dVar) {
        super(2, dVar);
        this.f28229c = bVar;
        this.f28230d = kVar;
        this.f28231e = nVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        d dVar2 = new d(this.f28229c, this.f28230d, this.f28231e, dVar);
        dVar2.f28228b = obj;
        return dVar2;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((r) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28227a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            r rVar = (r) this.f28228b;
            c cVar = new c(rVar, this.f28229c);
            k kVar = this.f28230d;
            l.e(kVar, "<this>");
            kVar.C(cVar, cVar, kVar, new E2.d(1));
            K k = new K(19, this.f28231e, cVar);
            this.f28227a = 1;
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
