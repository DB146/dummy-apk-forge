package E;

import A0.L;
import z.Z;

/* loaded from: classes.dex */
public final class z extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f3514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3515b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a9, int i7, Hb.d dVar) {
        super(2, dVar);
        this.f3514a = a9;
        this.f3515b = i7;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new z(this.f3514a, this.f3515b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) create((Z) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        zVar.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        A a9 = this.f3514a;
        u uVar = a9.f3372d;
        int b2 = uVar.b();
        int i7 = this.f3515b;
        if (b2 != i7 || uVar.c() != 0) {
            androidx.compose.foundation.lazy.layout.b bVar = a9.f3378m;
            bVar.c();
            bVar.f13166b = null;
        }
        uVar.f(i7, 0);
        uVar.f3501d = null;
        L l10 = a9.j;
        if (l10 != null) {
            l10.l();
        }
        return Db.q.f3365a;
    }
}
