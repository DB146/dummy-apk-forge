package B0;

import h0.C1221h;

/* renamed from: B0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0208w extends kotlin.jvm.internal.o implements Yb.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2008b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0208w(int i7, int i10, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i7);
        this.f2008b = i10;
    }

    @Override // kotlin.jvm.internal.c
    public final Yb.b computeReflected() {
        kotlin.jvm.internal.w.f19135a.getClass();
        return this;
    }

    @Override // Yb.g
    public final Object get() {
        switch (this.f2008b) {
            case 0:
                return ((D) this.receiver).getLayoutDirection();
            default:
                return ((C1221h) this.receiver).j;
        }
    }

    @Override // Rb.a
    public final Object invoke() {
        return get();
    }
}
