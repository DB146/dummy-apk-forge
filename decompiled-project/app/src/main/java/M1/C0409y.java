package M1;

import cc.C0953t;

/* renamed from: M1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409y extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6732a;

    /* renamed from: b, reason: collision with root package name */
    public Q f6733b;

    /* renamed from: c, reason: collision with root package name */
    public C0953t f6734c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f6736e;

    /* renamed from: f, reason: collision with root package name */
    public int f6737f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0409y(Q q10, Jb.c cVar) {
        super(cVar);
        this.f6736e = q10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6735d = obj;
        this.f6737f |= Integer.MIN_VALUE;
        return Q.c(this.f6736e, null, this);
    }
}
