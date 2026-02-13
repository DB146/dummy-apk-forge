package Eb;

/* loaded from: classes2.dex */
public final class E extends AbstractC0251b {

    /* renamed from: c, reason: collision with root package name */
    public int f3856c;

    /* renamed from: d, reason: collision with root package name */
    public int f3857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f3858e;

    public E(F f4) {
        this.f3858e = f4;
        this.f3856c = f4.f3862d;
        this.f3857d = f4.f3861c;
    }

    @Override // Eb.AbstractC0251b
    public final void a() {
        int i7 = this.f3856c;
        if (i7 == 0) {
            this.f3870a = 2;
            return;
        }
        F f4 = this.f3858e;
        int i10 = this.f3857d;
        this.f3871b = f4.f3859a[i10];
        this.f3870a = 1;
        this.f3857d = (i10 + 1) % f4.f3860b;
        this.f3856c = i7 - 1;
    }
}
