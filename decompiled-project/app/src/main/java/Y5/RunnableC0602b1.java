package Y5;

import java.util.Objects;

/* renamed from: Y5.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0602b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0605c1 f11677b;

    public RunnableC0602b1(C0605c1 c0605c1, int i7) {
        this.f11676a = i7;
        switch (i7) {
            case 1:
                Objects.requireNonNull(c0605c1);
                this.f11677b = c0605c1;
                return;
            default:
                Objects.requireNonNull(c0605c1);
                this.f11677b = c0605c1;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11676a) {
            case 0:
                C0605c1 c0605c1 = this.f11677b;
                c0605c1.f11688e = c0605c1.f11693x;
                return;
            default:
                this.f11677b.f11693x = null;
                return;
        }
    }
}
