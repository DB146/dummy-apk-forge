package z;

/* loaded from: classes.dex */
public final class q0 extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public w0 f28068a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.u f28069b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f28070c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f28071d;

    /* renamed from: e, reason: collision with root package name */
    public int f28072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(w0 w0Var, Jb.c cVar) {
        super(cVar);
        this.f28071d = w0Var;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f28070c = obj;
        this.f28072e |= Integer.MIN_VALUE;
        return this.f28071d.b(0L, this);
    }
}
