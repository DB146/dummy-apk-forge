package Q;

import a0.AbstractC0697x;

/* loaded from: classes.dex */
public final class D0 extends AbstractC0697x {

    /* renamed from: c, reason: collision with root package name */
    public float f8300c;

    public D0(long j, float f4) {
        super(j);
        this.f8300c = f4;
    }

    @Override // a0.AbstractC0697x
    public final void a(AbstractC0697x abstractC0697x) {
        kotlin.jvm.internal.l.c(abstractC0697x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f8300c = ((D0) abstractC0697x).f8300c;
    }

    @Override // a0.AbstractC0697x
    public final AbstractC0697x b(long j) {
        return new D0(j, this.f8300c);
    }
}
