package Y5;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzcn;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t1 extends H {

    /* renamed from: c, reason: collision with root package name */
    public zzcn f11946c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11947d;

    /* renamed from: e, reason: collision with root package name */
    public final R7.a f11948e;

    /* renamed from: f, reason: collision with root package name */
    public final A4.e f11949f;

    /* renamed from: u, reason: collision with root package name */
    public final q3.e f11950u;

    /* JADX WARN: Type inference failed for: r3v3, types: [A4.e, java.lang.Object] */
    public t1(C0646q0 c0646q0) {
        super(c0646q0);
        this.f11947d = true;
        this.f11948e = new R7.a(this);
        ?? obj = new Object();
        Objects.requireNonNull(this);
        obj.f380d = this;
        C0646q0 c0646q02 = (C0646q0) this.f3094a;
        obj.f379c = new s1((A4.e) obj, c0646q02);
        c0646q02.f11917y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        obj.f377a = elapsedRealtime;
        obj.f378b = elapsedRealtime;
        this.f11949f = obj;
        this.f11950u = new q3.e(this);
    }

    @Override // Y5.H
    public final boolean M() {
        return false;
    }

    public final void N() {
        J();
        if (this.f11946c == null) {
            this.f11946c = new zzcn(Looper.getMainLooper());
        }
    }
}
