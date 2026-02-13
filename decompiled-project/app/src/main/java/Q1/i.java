package Q1;

import Db.q;
import Eb.B;

/* loaded from: classes.dex */
public final class i extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f8613a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Jb.i f8615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Rb.e eVar, Hb.d dVar) {
        super(2, dVar);
        this.f8615c = (Jb.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        i iVar = new i(this.f8615c, dVar);
        iVar.f8614b = obj;
        return iVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f8613a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f8614b;
            com.bumptech.glide.c.c0(obj);
            return bVar;
        }
        com.bumptech.glide.c.c0(obj);
        b bVar2 = new b(B.M(((b) this.f8614b).a()), false);
        this.f8614b = bVar2;
        this.f8613a = 1;
        return this.f8615c.invoke(bVar2, this) == aVar ? aVar : bVar2;
    }
}
