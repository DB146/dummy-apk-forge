package M1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class F extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6573a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6574b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f6575c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.v f6576d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6577e;

    /* renamed from: f, reason: collision with root package name */
    public int f6578f;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f6579u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Q f6580v;

    /* renamed from: w, reason: collision with root package name */
    public int f6581w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Q q10, Jb.c cVar) {
        super(cVar);
        this.f6580v = q10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6579u = obj;
        this.f6581w |= Integer.MIN_VALUE;
        return Q.f(this.f6580v, false, this);
    }
}
