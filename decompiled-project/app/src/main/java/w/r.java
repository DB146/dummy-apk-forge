package w;

import M1.C0405u;
import Q.C0497j0;
import Q.P0;
import Q.W;
import fc.C1159f;
import x.i0;

/* loaded from: classes.dex */
public final class r extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f25606a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f25608c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f25609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i0 i0Var, W w10, Hb.d dVar) {
        super(2, dVar);
        this.f25608c = i0Var;
        this.f25609d = w10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        r rVar = new r(this.f25608c, this.f25609d, dVar);
        rVar.f25607b = obj;
        return rVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((C0497j0) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f25606a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            C0497j0 c0497j0 = (C0497j0) this.f25607b;
            i0 i0Var = this.f25608c;
            C0405u c0405u = new C0405u(new P0(new C2190q(i0Var, 0), null));
            C1159f c1159f = new C1159f(c0497j0, i0Var, this.f25609d, 3);
            this.f25606a = 1;
            if (c0405u.a(c1159f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return Db.q.f3365a;
    }
}
