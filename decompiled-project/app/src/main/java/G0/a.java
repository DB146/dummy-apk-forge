package G0;

import Db.q;
import Q.C0487e0;
import cc.E;
import g3.C1191j;

/* loaded from: classes.dex */
public final class a extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f4238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f4239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f4240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, Runnable runnable, Hb.d dVar) {
        super(2, dVar);
        this.f4239b = fVar;
        this.f4240c = runnable;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new a(this.f4239b, this.f4240c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f4238a;
        f fVar = this.f4239b;
        q qVar = q.f3365a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            j jVar = fVar.f4266f;
            this.f4238a = 1;
            Object a9 = jVar.a(0.0f - jVar.f4275c, this);
            if (a9 != aVar) {
                a9 = qVar;
            }
            if (a9 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        C1191j c1191j = fVar.f4263c;
        ((C0487e0) c1191j.f17441b).setValue(Boolean.FALSE);
        this.f4240c.run();
        return qVar;
    }
}
