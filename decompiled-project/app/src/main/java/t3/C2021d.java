package t3;

import Db.q;
import cc.E;
import java.util.concurrent.atomic.AtomicInteger;
import q3.p;

/* renamed from: t3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2021d extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f24447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O3.c f24448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f24449c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f24450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R6.a f24451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2021d(O3.c cVar, p pVar, AtomicInteger atomicInteger, R6.a aVar, Hb.d dVar) {
        super(2, dVar);
        this.f24448b = cVar;
        this.f24449c = pVar;
        this.f24450d = atomicInteger;
        this.f24451e = aVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2021d(this.f24448b, this.f24449c, this.f24450d, this.f24451e, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2021d) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f24447a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f24447a = 1;
            obj = k.a(this.f24448b, this.f24449c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        this.f24450d.set(((Number) obj).intValue());
        this.f24451e.cancel(true);
        return q.f3365a;
    }
}
