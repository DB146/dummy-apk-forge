package m3;

import A8.J;
import Db.q;
import cc.E;
import fc.InterfaceC1161h;
import q3.p;

/* loaded from: classes.dex */
public final class k extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f19795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O3.c f19796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f19797c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f19798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(O3.c cVar, p pVar, h hVar, Hb.d dVar) {
        super(2, dVar);
        this.f19796b = cVar;
        this.f19797c = pVar;
        this.f19798d = hVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new k(this.f19796b, this.f19797c, this.f19798d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f19795a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            p pVar = this.f19797c;
            InterfaceC1161h e2 = this.f19796b.e(pVar);
            J j = new J(8, this.f19798d, pVar);
            this.f19795a = 1;
            if (e2.a(j, this) == aVar) {
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
