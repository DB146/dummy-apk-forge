package A9;

/* renamed from: A9.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0143u1 extends J1 {

    /* renamed from: c, reason: collision with root package name */
    public final C0098j f1406c;

    /* renamed from: d, reason: collision with root package name */
    public int f1407d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f1408e;

    public C0143u1(C0098j c0098j) {
        super(c0098j.f852b);
        this.f1406c = c0098j;
        f();
        Z z8 = new Z(this, 2);
        this.f1408e = z8;
        f();
        c0098j.f851a.registerObserver(z8);
    }

    @Override // A9.J1
    public final Object a(int i7) {
        return this.f1406c.f1233c.get(i7);
    }

    @Override // A9.J1
    public final int e() {
        return this.f1407d + 1;
    }

    public final void f() {
        this.f1407d = -1;
        C0098j c0098j = this.f1406c;
        for (int size = c0098j.f1233c.size() - 1; size >= 0; size--) {
            AbstractC0132r2 abstractC0132r2 = (AbstractC0132r2) c0098j.f1233c.get(size);
            abstractC0132r2.getClass();
            if (!(abstractC0132r2 instanceof P1)) {
                this.f1407d = size;
                return;
            }
        }
    }
}
