package gc;

import fc.InterfaceC1162i;

/* loaded from: classes2.dex */
public final class h extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17518a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17519b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f17520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Hb.d dVar) {
        super(2, dVar);
        this.f17520c = iVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        h hVar = new h(this.f17520c, dVar);
        hVar.f17519b = obj;
        return hVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC1162i) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17518a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            InterfaceC1162i interfaceC1162i = (InterfaceC1162i) this.f17519b;
            this.f17518a = 1;
            if (this.f17520c.h(interfaceC1162i, this) == aVar) {
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
