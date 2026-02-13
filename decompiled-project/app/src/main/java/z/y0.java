package z;

import u0.C2080j;
import y.C2309q;

/* loaded from: classes.dex */
public final class y0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2309q f28142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f28143c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2080j f28144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(C2309q c2309q, Y y10, C2080j c2080j, Hb.d dVar) {
        super(2, dVar);
        this.f28142b = c2309q;
        this.f28143c = y10;
        this.f28144d = c2080j;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new y0(this.f28142b, this.f28143c, this.f28144d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28141a;
        Db.q qVar = Db.q.f3365a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            long j = this.f28144d.f24765c;
            this.f28141a = 1;
            C2309q c2309q = this.f28142b;
            Y y10 = this.f28143c;
            C2309q c2309q2 = new C2309q(c2309q.f26509d, this);
            c2309q2.f26507b = y10;
            c2309q2.f26508c = j;
            if (c2309q2.invokeSuspend(qVar) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return qVar;
    }
}
