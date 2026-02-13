package h3;

import androidx.work.CoroutineWorker;

/* renamed from: h3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1246h extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f17695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246h(CoroutineWorker coroutineWorker, Hb.d dVar) {
        super(2, dVar);
        this.f17695b = coroutineWorker;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C1246h(this.f17695b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1246h) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17694a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f17694a = 1;
            obj = this.f17695b.c(this);
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
