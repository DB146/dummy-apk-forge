package K2;

import I2.L;

/* loaded from: classes.dex */
public final class t extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public x f6079a;

    /* renamed from: b, reason: collision with root package name */
    public L f6080b;

    /* renamed from: c, reason: collision with root package name */
    public i f6081c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f6083e;

    /* renamed from: f, reason: collision with root package name */
    public int f6084f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, Jb.c cVar) {
        super(cVar);
        this.f6083e = xVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6082d = obj;
        this.f6084f |= Integer.MIN_VALUE;
        return this.f6083e.e(null, this);
    }
}
