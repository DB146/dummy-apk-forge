package w;

import x.C2235e;
import x.EnumC2234d;

/* loaded from: classes.dex */
public final class P extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f25523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f25524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25525c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S f25526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(O o10, long j, S s3, Hb.d dVar) {
        super(2, dVar);
        this.f25524b = o10;
        this.f25525c = j;
        this.f25526d = s3;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new P(this.f25524b, this.f25525c, this.f25526d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f25523a;
        O o10 = this.f25524b;
        S s3 = this.f25526d;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            Y.k kVar = o10.f25521a;
            V0.k kVar2 = new V0.k(this.f25525c);
            x.Q q10 = s3.f25533C;
            this.f25523a = 1;
            obj = Y.k.c(kVar, kVar2, q10, null, this, 12);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        if (((C2235e) obj).f26062b == EnumC2234d.f26057b) {
            s3.getClass();
        }
        return Db.q.f3365a;
    }
}
