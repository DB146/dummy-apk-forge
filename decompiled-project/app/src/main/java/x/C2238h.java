package x;

import Q.C0480b;
import Q.C0487e0;
import Q.R0;
import ea.C1111f;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2238h implements R0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1111f f26092a;

    /* renamed from: b, reason: collision with root package name */
    public final C0487e0 f26093b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC2243m f26094c;

    /* renamed from: d, reason: collision with root package name */
    public long f26095d;

    /* renamed from: e, reason: collision with root package name */
    public long f26096e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26097f;

    public /* synthetic */ C2238h(C1111f c1111f, Object obj, AbstractC2243m abstractC2243m, int i7) {
        this(c1111f, obj, (i7 & 4) != 0 ? null : abstractC2243m, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public C2238h(C1111f c1111f, Object obj, AbstractC2243m abstractC2243m, long j, long j10, boolean z8) {
        AbstractC2243m abstractC2243m2;
        this.f26092a = c1111f;
        this.f26093b = C0480b.o(obj);
        if (abstractC2243m != null) {
            abstractC2243m2 = AbstractC2232b.f(abstractC2243m);
        } else {
            abstractC2243m2 = (AbstractC2243m) ((Rb.c) c1111f.f16837b).invoke(obj);
            abstractC2243m2.d();
        }
        this.f26094c = abstractC2243m2;
        this.f26095d = j;
        this.f26096e = j10;
        this.f26097f = z8;
    }

    @Override // Q.R0
    public final Object getValue() {
        return this.f26093b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f26093b.getValue() + ", velocity=" + ((Rb.c) this.f26092a.f16838c).invoke(this.f26094c) + ", isRunning=" + this.f26097f + ", lastFrameTimeNanos=" + this.f26095d + ", finishedTimeNanos=" + this.f26096e + ')';
    }
}
