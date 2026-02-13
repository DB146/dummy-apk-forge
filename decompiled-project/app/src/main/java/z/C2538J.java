package z;

import Q.C0480b;

/* renamed from: z.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2538J extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27885a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27886b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Jb.i, Hb.d, z.J] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        ?? iVar = new Jb.i(2, dVar);
        iVar.f27886b = obj;
        return iVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2538J) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        cc.E e2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27885a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            e2 = (cc.E) this.f27886b;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e2 = (cc.E) this.f27886b;
            com.bumptech.glide.c.c0(obj);
        }
        while (cc.F.v(e2.l())) {
            C2549d c2549d = C2549d.f27965c;
            this.f27886b = e2;
            this.f27885a = 1;
            if (C0480b.m(getContext()).n(c2549d, this) == aVar) {
                return aVar;
            }
        }
        return Db.q.f3365a;
    }
}
