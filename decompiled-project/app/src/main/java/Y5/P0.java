package Y5;

import java.util.Objects;

/* loaded from: classes.dex */
public final class P0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0 f11522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11523c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S0 f11525e;

    public P0(S0 s02, C0 c02, long j, boolean z8, int i7) {
        this.f11521a = i7;
        switch (i7) {
            case 1:
                this.f11522b = c02;
                this.f11523c = j;
                this.f11524d = z8;
                Objects.requireNonNull(s02);
                this.f11525e = s02;
                return;
            default:
                this.f11522b = c02;
                this.f11523c = j;
                this.f11524d = z8;
                Objects.requireNonNull(s02);
                this.f11525e = s02;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11521a) {
            case 0:
                C0 c02 = this.f11522b;
                S0 s02 = this.f11525e;
                s02.N(c02);
                s02.Y(c02, this.f11523c, this.f11524d);
                return;
            default:
                C0 c03 = this.f11522b;
                S0 s03 = this.f11525e;
                s03.N(c03);
                s03.Y(c03, this.f11523c, this.f11524d);
                return;
        }
    }
}
