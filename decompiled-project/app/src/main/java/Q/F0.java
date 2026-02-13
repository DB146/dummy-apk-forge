package Q;

import a0.AbstractC0697x;

/* loaded from: classes.dex */
public final class F0 extends AbstractC0697x {

    /* renamed from: c, reason: collision with root package name */
    public long f8302c;

    public F0(long j, long j10) {
        super(j);
        this.f8302c = j10;
    }

    @Override // a0.AbstractC0697x
    public final void a(AbstractC0697x abstractC0697x) {
        kotlin.jvm.internal.l.c(abstractC0697x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f8302c = ((F0) abstractC0697x).f8302c;
    }

    @Override // a0.AbstractC0697x
    public final AbstractC0697x b(long j) {
        return new F0(j, this.f8302c);
    }
}
