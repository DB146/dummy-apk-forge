package m3;

import Db.q;
import cc.E;
import cc.F;
import ec.r;
import h3.z;

/* loaded from: classes.dex */
public final class d extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f19779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f19780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f19781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, r rVar, Hb.d dVar) {
        super(2, dVar);
        this.f19780b = fVar;
        this.f19781c = rVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new d(this.f19780b, this.f19781c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f19779a;
        f fVar = this.f19780b;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            fVar.getClass();
            this.f19779a = 1;
            if (F.l(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        z e2 = z.e();
        String str = l.f19799a;
        fVar.getClass();
        e2.a(str, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
        ((ec.q) this.f19781c).h(new b(7));
        return q.f3365a;
    }
}
