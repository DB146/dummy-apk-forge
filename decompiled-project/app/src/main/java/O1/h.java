package O1;

import rc.z;

/* loaded from: classes.dex */
public final class h extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public i f7444a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7445b;

    /* renamed from: c, reason: collision with root package name */
    public z f7446c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7447d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f7449f;

    /* renamed from: u, reason: collision with root package name */
    public int f7450u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Jb.c cVar) {
        super(cVar);
        this.f7449f = iVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f7448e = obj;
        this.f7450u |= Integer.MIN_VALUE;
        return this.f7449f.b(null, this);
    }
}
