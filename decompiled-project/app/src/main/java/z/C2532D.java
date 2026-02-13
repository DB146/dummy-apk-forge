package z;

import i0.C1289b;

/* renamed from: z.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2532D extends Jb.i implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27845a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2532D(int i7, Hb.d dVar, int i10) {
        super(i7, dVar);
        this.f27845a = i10;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.f27845a) {
            case 0:
                long j = ((C1289b) obj2).f18172a;
                C2532D c2532d = new C2532D(3, (Hb.d) obj3, 0);
                Db.q qVar = Db.q.f3365a;
                c2532d.invokeSuspend(qVar);
                return qVar;
            case 1:
                ((Number) obj2).floatValue();
                C2532D c2532d2 = new C2532D(3, (Hb.d) obj3, 1);
                Db.q qVar2 = Db.q.f3365a;
                c2532d2.invokeSuspend(qVar2);
                return qVar2;
            default:
                long j10 = ((C1289b) obj2).f18172a;
                C2532D c2532d3 = new C2532D(3, (Hb.d) obj3, 2);
                Db.q qVar3 = Db.q.f3365a;
                c2532d3.invokeSuspend(qVar3);
                return qVar3;
        }
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Db.q qVar = Db.q.f3365a;
        switch (this.f27845a) {
            case 0:
                Ib.a aVar = Ib.a.f5345a;
                com.bumptech.glide.c.c0(obj);
                return qVar;
            case 1:
                Ib.a aVar2 = Ib.a.f5345a;
                com.bumptech.glide.c.c0(obj);
                return qVar;
            default:
                Ib.a aVar3 = Ib.a.f5345a;
                com.bumptech.glide.c.c0(obj);
                return qVar;
        }
    }
}
