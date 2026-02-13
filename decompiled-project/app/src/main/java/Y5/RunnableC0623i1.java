package Y5;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: Y5.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0623i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f11779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0629k1 f11780c;

    public RunnableC0623i1(ServiceConnectionC0629k1 serviceConnectionC0629k1, I i7, int i10) {
        this.f11778a = i10;
        switch (i10) {
            case 1:
                this.f11779b = i7;
                Objects.requireNonNull(serviceConnectionC0629k1);
                this.f11780c = serviceConnectionC0629k1;
                return;
            default:
                this.f11779b = i7;
                this.f11780c = serviceConnectionC0629k1;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11778a) {
            case 0:
                ServiceConnectionC0629k1 serviceConnectionC0629k1 = this.f11780c;
                synchronized (serviceConnectionC0629k1) {
                    try {
                        serviceConnectionC0629k1.f11807a = false;
                        C0632l1 c0632l1 = serviceConnectionC0629k1.f11809c;
                        if (!c0632l1.a0()) {
                            W w10 = ((C0646q0) c0632l1.f3094a).f11912f;
                            C0646q0.l(w10);
                            w10.f11573B.a("Connected to service");
                            I i7 = this.f11779b;
                            c0632l1.J();
                            c0632l1.f11815d = i7;
                            c0632l1.W();
                            c0632l1.Y();
                        }
                    } finally {
                    }
                }
                return;
            default:
                ServiceConnectionC0629k1 serviceConnectionC0629k12 = this.f11780c;
                synchronized (serviceConnectionC0629k12) {
                    try {
                        serviceConnectionC0629k12.f11807a = false;
                        C0632l1 c0632l12 = serviceConnectionC0629k12.f11809c;
                        if (!c0632l12.a0()) {
                            W w11 = ((C0646q0) c0632l12.f3094a).f11912f;
                            C0646q0.l(w11);
                            w11.f11572A.a("Connected to remote service");
                            I i10 = this.f11779b;
                            c0632l12.J();
                            com.google.android.gms.common.internal.G.g(i10);
                            c0632l12.f11815d = i10;
                            c0632l12.W();
                            c0632l12.Y();
                        }
                    } finally {
                    }
                }
                C0632l1 c0632l13 = this.f11780c.f11809c;
                ScheduledExecutorService scheduledExecutorService = c0632l13.f11818u;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    c0632l13.f11818u = null;
                    return;
                }
                return;
        }
    }
}
