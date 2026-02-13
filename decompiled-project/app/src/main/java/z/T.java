package z;

import o4.C1798l;

/* loaded from: classes.dex */
public final class T extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public C1798l f27936a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1798l f27938c;

    /* renamed from: d, reason: collision with root package name */
    public int f27939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C1798l c1798l, Jb.c cVar) {
        super(cVar);
        this.f27938c = c1798l;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f27937b = obj;
        this.f27939d |= Integer.MIN_VALUE;
        return this.f27938c.k(null, null, this);
    }
}
