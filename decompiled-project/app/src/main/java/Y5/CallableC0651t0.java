package Y5;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: Y5.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0651t0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11943c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC0657w0 f11945e;

    public CallableC0651t0(BinderC0657w0 binderC0657w0, String str, String str2, String str3, int i7) {
        this.f11941a = i7;
        switch (i7) {
            case 1:
                this.f11942b = str;
                this.f11943c = str2;
                this.f11944d = str3;
                Objects.requireNonNull(binderC0657w0);
                this.f11945e = binderC0657w0;
                return;
            case 2:
                this.f11942b = str;
                this.f11943c = str2;
                this.f11944d = str3;
                Objects.requireNonNull(binderC0657w0);
                this.f11945e = binderC0657w0;
                return;
            case 3:
                this.f11942b = str;
                this.f11943c = str2;
                this.f11944d = str3;
                Objects.requireNonNull(binderC0657w0);
                this.f11945e = binderC0657w0;
                return;
            default:
                this.f11942b = str;
                this.f11943c = str2;
                this.f11944d = str3;
                Objects.requireNonNull(binderC0657w0);
                this.f11945e = binderC0657w0;
                return;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11941a) {
            case 0:
                BinderC0657w0 binderC0657w0 = this.f11945e;
                binderC0657w0.f11980a.A();
                C0633m c0633m = binderC0657w0.f11980a.f11405c;
                I1.S(c0633m);
                return c0633m.H0(this.f11942b, this.f11943c, this.f11944d);
            case 1:
                BinderC0657w0 binderC0657w02 = this.f11945e;
                binderC0657w02.f11980a.A();
                C0633m c0633m2 = binderC0657w02.f11980a.f11405c;
                I1.S(c0633m2);
                return c0633m2.H0(this.f11942b, this.f11943c, this.f11944d);
            case 2:
                BinderC0657w0 binderC0657w03 = this.f11945e;
                binderC0657w03.f11980a.A();
                C0633m c0633m3 = binderC0657w03.f11980a.f11405c;
                I1.S(c0633m3);
                return c0633m3.L0(this.f11942b, this.f11943c, this.f11944d);
            default:
                BinderC0657w0 binderC0657w04 = this.f11945e;
                binderC0657w04.f11980a.A();
                C0633m c0633m4 = binderC0657w04.f11980a.f11405c;
                I1.S(c0633m4);
                return c0633m4.L0(this.f11942b, this.f11943c, this.f11944d);
        }
    }
}
