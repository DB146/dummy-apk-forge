package y;

import cc.InterfaceC0937i0;
import z.Y;

/* renamed from: y.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2296d extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26458a;

    /* renamed from: b, reason: collision with root package name */
    public int f26459b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26460c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f26461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A.i f26463f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f26464u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2296d(Y y10, long j, A.i iVar, r rVar, Hb.d dVar) {
        super(2, dVar);
        this.f26461d = y10;
        this.f26462e = j;
        this.f26463f = iVar;
        this.f26464u = rVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2296d c2296d = new C2296d(this.f26461d, this.f26462e, this.f26463f, this.f26464u, dVar);
        c2296d.f26460c = obj;
        return c2296d;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2296d) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0937i0 B10;
        Object b2;
        boolean z8;
        A.l lVar;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26459b;
        Db.q qVar = Db.q.f3365a;
        r rVar = this.f26464u;
        A.i iVar = this.f26463f;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            B10 = cc.F.B((cc.E) this.f26460c, null, 0, new C2295c(this.f26464u, this.f26462e, this.f26463f, null), 3);
            this.f26460c = B10;
            this.f26459b = 1;
            b2 = this.f26461d.b(this);
            if (b2 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4 && i7 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.c.c0(obj);
                        rVar.L = null;
                        return qVar;
                    }
                    lVar = (A.l) this.f26460c;
                    com.bumptech.glide.c.c0(obj);
                    this.f26460c = null;
                    this.f26459b = 4;
                    if (iVar.a(lVar, this) == aVar) {
                        return aVar;
                    }
                    rVar.L = null;
                    return qVar;
                }
                z8 = this.f26458a;
                com.bumptech.glide.c.c0(obj);
                if (z8) {
                    A.k kVar = new A.k(this.f26462e);
                    A.l lVar2 = new A.l(kVar);
                    this.f26460c = lVar2;
                    this.f26459b = 3;
                    if (iVar.a(kVar, this) == aVar) {
                        return aVar;
                    }
                    lVar = lVar2;
                    this.f26460c = null;
                    this.f26459b = 4;
                    if (iVar.a(lVar, this) == aVar) {
                    }
                }
                rVar.L = null;
                return qVar;
            }
            B10 = (InterfaceC0937i0) this.f26460c;
            com.bumptech.glide.c.c0(obj);
            b2 = obj;
        }
        boolean booleanValue = ((Boolean) b2).booleanValue();
        if (!B10.isActive()) {
            A.k kVar2 = rVar.L;
            if (kVar2 != null) {
                A.h lVar3 = booleanValue ? new A.l(kVar2) : new A.j(kVar2);
                this.f26460c = null;
                this.f26459b = 5;
                if (iVar.a(lVar3, this) == aVar) {
                    return aVar;
                }
            }
            rVar.L = null;
            return qVar;
        }
        this.f26460c = null;
        this.f26458a = booleanValue;
        this.f26459b = 2;
        B10.cancel(null);
        Object join = B10.join(this);
        if (join != aVar) {
            join = qVar;
        }
        if (join == aVar) {
            return aVar;
        }
        z8 = booleanValue;
        if (z8) {
        }
        rVar.L = null;
        return qVar;
    }
}
