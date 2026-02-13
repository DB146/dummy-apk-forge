package y3;

import cc.E;
import fc.C1156c;
import fc.C1159f;

/* loaded from: classes.dex */
public final class m extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f26816a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f26818c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.k f26819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, com.bumptech.glide.k kVar, Hb.d dVar) {
        super(2, dVar);
        this.f26818c = pVar;
        this.f26819d = kVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        m mVar = new m(this.f26818c, this.f26819d, dVar);
        mVar.f26817b = obj;
        return mVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26816a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            E e2 = (E) this.f26817b;
            p pVar = this.f26818c;
            pVar.f26835O = null;
            pVar.f26837Q = null;
            Y6.b bVar = pVar.f26827F;
            if (bVar == null) {
                kotlin.jvm.internal.l.j("resolvableGlideSize");
                throw null;
            }
            com.bumptech.glide.k kVar = this.f26819d;
            kotlin.jvm.internal.l.e(kVar, "<this>");
            C1156c c1156c = new C1156c(new z3.d(bVar, kVar, kVar.f14657J, null), Hb.j.f4919a, -2, 1);
            C1159f c1159f = new C1159f(pVar, e2, kVar, 5);
            this.f26816a = 1;
            if (c1156c.a(c1159f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return Db.q.f3365a;
    }
}
