package K2;

import cc.C0927d0;
import cc.C0953t;
import cc.E;
import cc.F;

/* loaded from: classes.dex */
public final class B extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jb.i f6006b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B(Rb.e eVar, Hb.d dVar) {
        super(2, dVar);
        this.f6006b = (Jb.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        B b2 = new B(this.f6006b, dVar);
        b2.f6005a = obj;
        return b2;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        Hb.g gVar = ((E) this.f6005a).l().get(Hb.e.f4918a);
        kotlin.jvm.internal.l.b(gVar);
        Hb.f fVar = (Hb.f) gVar;
        C0953t a9 = F.a();
        F.A(C0927d0.f14526a, fVar, 4, new z(a9, this.f6006b, null));
        while (!a9.H()) {
            try {
                return F.F(fVar, new A(a9, null));
            } catch (InterruptedException unused) {
            }
        }
        return a9.x();
    }
}
