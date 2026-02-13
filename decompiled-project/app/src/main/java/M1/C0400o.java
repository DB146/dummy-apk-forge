package M1;

import fc.InterfaceC1162i;

/* renamed from: M1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400o extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f6707b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0400o(Q q10, Hb.d dVar) {
        super(2, dVar);
        this.f6707b = q10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C0400o(this.f6707b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0400o) create((InterfaceC1162i) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6706a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f6706a = 1;
            if (Q.d(this.f6707b, this) == aVar) {
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
