package Q1;

import Db.q;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f8605a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Jb.i f8607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Rb.e eVar, Hb.d dVar) {
        super(2, dVar);
        this.f8607c = (Jb.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        c cVar = new c(this.f8607c, dVar);
        cVar.f8606b = obj;
        return cVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f8605a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            b bVar = (b) this.f8606b;
            this.f8605a = 1;
            obj = this.f8607c.invoke(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        b bVar2 = (b) obj;
        l.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        bVar2.f8604b.f7420a.set(true);
        return bVar2;
    }
}
