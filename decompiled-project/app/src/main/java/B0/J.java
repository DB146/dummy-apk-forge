package B0;

import ec.C1116a;

/* loaded from: classes.dex */
public final class J extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public L f1700a;

    /* renamed from: b, reason: collision with root package name */
    public u.y f1701b;

    /* renamed from: c, reason: collision with root package name */
    public C1116a f1702c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f1704e;

    /* renamed from: f, reason: collision with root package name */
    public int f1705f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(L l10, Jb.c cVar) {
        super(cVar);
        this.f1704e = l10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f1703d = obj;
        this.f1705f |= Integer.MIN_VALUE;
        return this.f1704e.l(this);
    }
}
