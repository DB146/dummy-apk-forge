package h3;

import androidx.work.CoroutineWorker;

/* renamed from: h3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1245g extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f17693b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245g(CoroutineWorker coroutineWorker, Hb.d dVar) {
        super(2, dVar);
        this.f17693b = coroutineWorker;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C1245g(this.f17693b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C1245g c1245g = (C1245g) create((cc.E) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        c1245g.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17692a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
            return obj;
        }
        com.bumptech.glide.c.c0(obj);
        this.f17692a = 1;
        this.f17693b.getClass();
        throw new IllegalStateException("Not implemented");
    }
}
