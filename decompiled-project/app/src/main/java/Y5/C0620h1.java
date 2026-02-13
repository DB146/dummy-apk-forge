package Y5;

import java.util.Objects;

/* renamed from: Y5.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620h1 extends AbstractC0636n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0632l1 f11775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0620h1(C0632l1 c0632l1, C0646q0 c0646q0, int i7) {
        super(c0646q0);
        this.f11774e = i7;
        switch (i7) {
            case 1:
                Objects.requireNonNull(c0632l1);
                this.f11775f = c0632l1;
                super(c0646q0);
                return;
            default:
                Objects.requireNonNull(c0632l1);
                this.f11775f = c0632l1;
                return;
        }
    }

    @Override // Y5.AbstractC0636n
    public final void a() {
        switch (this.f11774e) {
            case 0:
                C0632l1 c0632l1 = this.f11775f;
                c0632l1.J();
                if (c0632l1.a0()) {
                    W w10 = ((C0646q0) c0632l1.f3094a).f11912f;
                    C0646q0.l(w10);
                    w10.f11573B.a("Inactivity, disconnecting from the service");
                    c0632l1.R();
                    return;
                }
                return;
            default:
                W w11 = ((C0646q0) this.f11775f.f3094a).f11912f;
                C0646q0.l(w11);
                w11.f11580w.a("Tasks have been queued for a long time");
                return;
        }
    }
}
