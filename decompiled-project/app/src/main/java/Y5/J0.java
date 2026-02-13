package Y5;

import C3.RunnableC0235a;
import android.os.Handler;
import com.google.android.gms.internal.base.zau;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class J0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11415a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11416b;

    public J0(S0 s02) {
        this.f11415a = 0;
        Objects.requireNonNull(s02);
        this.f11416b = s02;
    }

    public /* synthetic */ J0(Object obj, int i7) {
        this.f11415a = i7;
        this.f11416b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11415a) {
            case 0:
                C0640o0 c0640o0 = ((C0646q0) ((S0) this.f11416b).f3094a).f11913u;
                C0646q0.l(c0640o0);
                c0640o0.S(runnable);
                return;
            case 1:
                ((ExecutorService) this.f11416b).execute(new RunnableC0235a(runnable, 2));
                return;
            case 2:
                ((zau) this.f11416b).post(runnable);
                return;
            default:
                ((Handler) ((q3.i) this.f11416b).f23384c).post(runnable);
                return;
        }
    }
}
