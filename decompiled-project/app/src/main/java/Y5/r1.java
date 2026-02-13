package Y5;

import java.util.Objects;

/* loaded from: classes.dex */
public final class r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f11926a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q3.e f11928c;

    public r1(q3.e eVar, long j, long j10) {
        Objects.requireNonNull(eVar);
        this.f11928c = eVar;
        this.f11926a = j;
        this.f11927b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0640o0 c0640o0 = ((C0646q0) ((t1) this.f11928c.f23377c).f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new B0.C(this, 19));
    }
}
