package a0;

/* renamed from: a0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690q extends AbstractC0697x {

    /* renamed from: c, reason: collision with root package name */
    public U.c f12412c;

    /* renamed from: d, reason: collision with root package name */
    public int f12413d;

    /* renamed from: e, reason: collision with root package name */
    public int f12414e;

    public C0690q(long j, U.c cVar) {
        super(j);
        this.f12412c = cVar;
    }

    @Override // a0.AbstractC0697x
    public final void a(AbstractC0697x abstractC0697x) {
        synchronized (AbstractC0692s.f12416a) {
            kotlin.jvm.internal.l.c(abstractC0697x, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
            this.f12412c = ((C0690q) abstractC0697x).f12412c;
            this.f12413d = ((C0690q) abstractC0697x).f12413d;
            this.f12414e = ((C0690q) abstractC0697x).f12414e;
        }
    }

    @Override // a0.AbstractC0697x
    public final AbstractC0697x b(long j) {
        return new C0690q(j, this.f12412c);
    }
}
