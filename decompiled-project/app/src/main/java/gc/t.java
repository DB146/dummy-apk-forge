package gc;

import fc.InterfaceC1161h;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class t extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1161h[] f17546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f17548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ec.d f17549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(InterfaceC1161h[] interfaceC1161hArr, int i7, AtomicInteger atomicInteger, ec.d dVar, Hb.d dVar2) {
        super(2, dVar2);
        this.f17546b = interfaceC1161hArr;
        this.f17547c = i7;
        this.f17548d = atomicInteger;
        this.f17549e = dVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new t(this.f17546b, this.f17547c, this.f17548d, this.f17549e, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17545a;
        AtomicInteger atomicInteger = this.f17548d;
        ec.d dVar = this.f17549e;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                InterfaceC1161h[] interfaceC1161hArr = this.f17546b;
                int i10 = this.f17547c;
                InterfaceC1161h interfaceC1161h = interfaceC1161hArr[i10];
                s sVar = new s(dVar, i10);
                this.f17545a = 1;
                if (interfaceC1161h.a(sVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                dVar.j(null);
            }
            return Db.q.f3365a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                dVar.j(null);
            }
        }
    }
}
