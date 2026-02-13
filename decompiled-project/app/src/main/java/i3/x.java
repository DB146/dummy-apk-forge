package i3;

import cc.E;

/* loaded from: classes.dex */
public final class x extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f18392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1340B f18393b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C1340B c1340b, Hb.d dVar) {
        super(2, dVar);
        this.f18393b = c1340b;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new x(this.f18393b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f18392a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f18392a = 1;
            obj = C1340B.a(this.f18393b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return obj;
    }
}
