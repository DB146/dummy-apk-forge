package gc;

import fc.InterfaceC1162i;

/* loaded from: classes2.dex */
public final class G extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17497a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162i f17499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        super(2, dVar);
        this.f17499c = interfaceC1162i;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        G g = new G(this.f17499c, dVar);
        g.f17498b = obj;
        return g;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create(obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17497a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            Object obj2 = this.f17498b;
            this.f17497a = 1;
            if (this.f17499c.emit(obj2, this) == aVar) {
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
