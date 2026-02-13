package K2;

import cc.C0953t;
import cc.E;

/* loaded from: classes.dex */
public final class A extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0953t f6004b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C0953t c0953t, Hb.d dVar) {
        super(2, dVar);
        this.f6004b = c0953t;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new A(this.f6004b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6003a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f6003a = 1;
            obj = this.f6004b.o(this);
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
