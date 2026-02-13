package L7;

import Y5.BinderC0657w0;
import Y5.C0598a0;
import Y5.C0628k0;
import Y5.C0648s;
import Y5.I1;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.internal.measurement.zzt;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import s2.RunnableC1971a;
import w3.C2210c;

/* loaded from: classes.dex */
public final class q implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6383b;

    public q(z zVar, Q7.f fVar) {
        this.f6382a = 0;
        this.f6383b = zVar;
    }

    public q(BinderC0657w0 binderC0657w0, C0648s c0648s, String str) {
        this.f6382a = 2;
        Objects.requireNonNull(binderC0657w0);
        this.f6383b = binderC0657w0;
    }

    public /* synthetic */ q(Object obj, int i7) {
        this.f6382a = i7;
        this.f6383b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [g3.h, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6382a) {
            case 0:
                ((z) this.f6383b).g.e();
                return null;
            case 1:
                return new zzt(((C0628k0) this.f6383b).f11805y);
            case 2:
                BinderC0657w0 binderC0657w0 = (BinderC0657w0) this.f6383b;
                binderC0657w0.f11980a.A();
                C0598a0 c0598a0 = binderC0657w0.f11980a.f11410v;
                I1.S(c0598a0);
                c0598a0.J();
                throw new IllegalStateException("Unexpected call on client side");
            case 3:
                ?? obj = new Object();
                obj.f17438a = (JsReplyProxyBoundaryInterface) this.f6383b;
                return obj;
            case 4:
                RunnableC1971a runnableC1971a = (RunnableC1971a) this.f6383b;
                runnableC1971a.f24026d.set(true);
                try {
                    Process.setThreadPriority(10);
                    runnableC1971a.f24027e.d();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th) {
                    try {
                        runnableC1971a.f24025c.set(true);
                        throw th;
                    } finally {
                        runnableC1971a.a(null);
                    }
                }
            default:
                synchronized (((C2210c) this.f6383b)) {
                    try {
                        C2210c c2210c = (C2210c) this.f6383b;
                        if (c2210c.f25769w == null) {
                            return null;
                        }
                        c2210c.b0();
                        if (((C2210c) this.f6383b).U()) {
                            ((C2210c) this.f6383b).Z();
                            ((C2210c) this.f6383b).f25771y = 0;
                        }
                        return null;
                    } finally {
                    }
                }
        }
    }
}
