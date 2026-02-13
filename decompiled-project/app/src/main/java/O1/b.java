package O1;

import rc.C;

/* loaded from: classes.dex */
public final class b extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f7421a;

    /* renamed from: b, reason: collision with root package name */
    public C f7422b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7423c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f7424d;

    /* renamed from: e, reason: collision with root package name */
    public int f7425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Jb.c cVar2) {
        super(cVar2);
        this.f7424d = cVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f7423c = obj;
        this.f7425e |= Integer.MIN_VALUE;
        return c.a(this.f7424d, this);
    }
}
