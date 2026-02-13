package y;

import i0.C1289b;
import z.Y;

/* renamed from: y.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2309q extends Jb.i implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public int f26506a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Y f26507b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f26508c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f26509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2309q(r rVar, Hb.d dVar) {
        super(3, dVar);
        this.f26509d = rVar;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        long j = ((C1289b) obj2).f18172a;
        C2309q c2309q = new C2309q(this.f26509d, (Hb.d) obj3);
        c2309q.f26507b = (Y) obj;
        c2309q.f26508c = j;
        return c2309q.invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26506a;
        Db.q qVar = Db.q.f3365a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            Y y10 = this.f26507b;
            long j = this.f26508c;
            r rVar = this.f26509d;
            if (rVar.f26513G) {
                this.f26506a = 1;
                A.i iVar = rVar.f26511E;
                if (iVar == null || (obj2 = cc.F.k(new C2296d(y10, j, iVar, rVar, null), this)) != aVar) {
                    obj2 = qVar;
                }
                if (obj2 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return qVar;
    }
}
