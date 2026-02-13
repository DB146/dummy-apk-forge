package A9;

/* loaded from: classes2.dex */
public abstract class J1 {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f851a = new I1(0);

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0117n2 f852b;

    public J1() {
    }

    public J1(AbstractC0113m2 abstractC0113m2) {
        d(new f3(abstractC0113m2));
    }

    public J1(AbstractC0117n2 abstractC0117n2) {
        d(abstractC0117n2);
    }

    public abstract Object a(int i7);

    public final void b() {
        this.f851a.b();
    }

    public final void c(int i7, int i10) {
        this.f851a.h(i7, i10);
    }

    public final void d(AbstractC0117n2 abstractC0117n2) {
        if (abstractC0117n2 == null) {
            throw new IllegalArgumentException("Presenter selector must not be null");
        }
        boolean z8 = this.f852b != null;
        this.f852b = abstractC0117n2;
        if (z8) {
            b();
        }
    }

    public abstract int e();
}
