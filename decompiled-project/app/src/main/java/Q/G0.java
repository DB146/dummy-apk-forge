package Q;

import a0.AbstractC0688o;
import a0.AbstractC0697x;

/* loaded from: classes.dex */
public final class G0 extends AbstractC0697x {

    /* renamed from: c, reason: collision with root package name */
    public Object f8304c;

    public G0(Object obj, long j) {
        super(j);
        this.f8304c = obj;
    }

    @Override // a0.AbstractC0697x
    public final void a(AbstractC0697x abstractC0697x) {
        kotlin.jvm.internal.l.c(abstractC0697x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f8304c = ((G0) abstractC0697x).f8304c;
    }

    @Override // a0.AbstractC0697x
    public final AbstractC0697x b(long j) {
        return new G0(this.f8304c, AbstractC0688o.k().g());
    }
}
