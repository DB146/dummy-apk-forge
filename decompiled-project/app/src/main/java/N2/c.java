package N2;

import Db.q;
import Hb.d;
import I2.E;
import Jb.i;
import P2.j;
import Rb.e;

/* loaded from: classes.dex */
public final class c extends i implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f7161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f7162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7163c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Rb.c f7164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(E e2, boolean z8, Rb.c cVar, d dVar) {
        super(2, dVar);
        this.f7162b = e2;
        this.f7163c = z8;
        this.f7164d = cVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new c(this.f7162b, this.f7163c, this.f7164d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((cc.E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f7161a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f7161a = 1;
            obj = j.m(this.f7162b, true, this.f7163c, this.f7164d, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        if (obj != null) {
            return obj;
        }
        throw new Db.d("Query returned empty result set.", 6);
    }
}
