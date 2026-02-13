package i3;

import cc.F;

/* loaded from: classes.dex */
public final class j extends Jb.i implements Rb.g {

    /* renamed from: a, reason: collision with root package name */
    public int f18358a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Throwable f18359b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f18360c;

    /* JADX WARN: Type inference failed for: r3v2, types: [Jb.i, i3.j] */
    @Override // Rb.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        ?? iVar = new Jb.i(4, (Hb.d) obj4);
        iVar.f18359b = (Throwable) obj2;
        iVar.f18360c = longValue;
        return iVar.invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f18358a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            Throwable th = this.f18359b;
            long j = this.f18360c;
            h3.z.e().d(l.f18363a, "Cannot check for unfinished work", th);
            long min = Math.min(j * 30000, l.f18364b);
            this.f18358a = 1;
            if (F.l(min, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return Boolean.TRUE;
    }
}
