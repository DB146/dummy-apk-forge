package O1;

import rc.B;
import rc.v;

/* loaded from: classes.dex */
public final class j extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public v f7457a;

    /* renamed from: b, reason: collision with root package name */
    public v f7458b;

    /* renamed from: c, reason: collision with root package name */
    public B f7459c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f7461e;

    /* renamed from: f, reason: collision with root package name */
    public int f7462f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Jb.c cVar) {
        super(cVar);
        this.f7461e = kVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f7460d = obj;
        this.f7462f |= Integer.MIN_VALUE;
        return this.f7461e.b(null, this);
    }
}
