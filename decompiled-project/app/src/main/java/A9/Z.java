package A9;

/* loaded from: classes2.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1041b;

    public /* synthetic */ Z(Object obj, int i7) {
        this.f1040a = i7;
        this.f1041b = obj;
    }

    public final void a() {
        switch (this.f1040a) {
            case 0:
                C0067b0 c0067b0 = (C0067b0) this.f1041b;
                C0098j c0098j = c0067b0.f1058b;
                c0067b0.d(c0067b0.f1060d);
                return;
            case 1:
                ((C0135s1) this.f1041b).d();
                return;
            default:
                ((C0143u1) this.f1041b).f();
                b(16, -1, -1);
                return;
        }
    }

    public void b(int i7, int i10, int i11) {
        C0143u1 c0143u1 = (C0143u1) this.f1041b;
        if (i7 == 2) {
            c0143u1.f851a.e(i10, i11);
            return;
        }
        if (i7 == 4) {
            c0143u1.c(i10, i11);
            return;
        }
        if (i7 == 8) {
            c0143u1.f851a.i(i10, i11);
        } else if (i7 == 16) {
            c0143u1.b();
        } else {
            c0143u1.getClass();
            throw new IllegalArgumentException(h3.o.l(i7, "Invalid event type "));
        }
    }
}
