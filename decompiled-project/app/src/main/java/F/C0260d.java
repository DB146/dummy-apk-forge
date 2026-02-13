package F;

import cc.C0944m;

/* renamed from: F.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260d extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public C0944m f3967a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0261e f3969c;

    /* renamed from: d, reason: collision with root package name */
    public int f3970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0260d(C0261e c0261e, Jb.c cVar) {
        super(cVar);
        this.f3969c = c0261e;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f3968b = obj;
        this.f3970d |= Integer.MIN_VALUE;
        return this.f3969c.d(this);
    }
}
