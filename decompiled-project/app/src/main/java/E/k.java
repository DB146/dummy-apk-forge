package E;

import Q.R0;
import h0.C1221h;

/* loaded from: classes.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.q implements Yb.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3418b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i7, int i10, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i7);
        this.f3418b = i10;
    }

    @Override // kotlin.jvm.internal.c
    public final Yb.b computeReflected() {
        kotlin.jvm.internal.w.f19135a.getClass();
        return this;
    }

    @Override // Yb.g
    public final Object get() {
        switch (this.f3418b) {
            case 0:
                return ((R0) this.receiver).getValue();
            case 1:
                return ((C1221h) this.receiver).f17607d.r0();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    @Override // Rb.a
    public final Object invoke() {
        return get();
    }
}
