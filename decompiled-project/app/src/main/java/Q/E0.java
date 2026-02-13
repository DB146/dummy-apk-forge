package Q;

import a0.AbstractC0697x;

/* loaded from: classes.dex */
public final class E0 extends AbstractC0697x {

    /* renamed from: c, reason: collision with root package name */
    public int f8301c;

    public E0(int i7, long j) {
        super(j);
        this.f8301c = i7;
    }

    @Override // a0.AbstractC0697x
    public final void a(AbstractC0697x abstractC0697x) {
        kotlin.jvm.internal.l.c(abstractC0697x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f8301c = ((E0) abstractC0697x).f8301c;
    }

    @Override // a0.AbstractC0697x
    public final AbstractC0697x b(long j) {
        return new E0(this.f8301c, j);
    }
}
