package I2;

import t8.C2034c;

/* renamed from: I2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331u extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2034c f5204b;

    /* renamed from: c, reason: collision with root package name */
    public int f5205c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0331u(C2034c c2034c, Jb.c cVar) {
        super(cVar);
        this.f5204b = c2034c;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f5203a = obj;
        this.f5205c |= Integer.MIN_VALUE;
        this.f5204b.a(null, this);
        return Ib.a.f5345a;
    }
}
