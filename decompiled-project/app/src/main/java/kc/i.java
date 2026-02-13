package kc;

import A9.C0154x0;
import cc.F;

/* loaded from: classes2.dex */
public final class i extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f19103c;

    public i(Runnable runnable, long j, C0154x0 c0154x0) {
        super(j, c0154x0);
        this.f19103c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f19103c.run();
        } finally {
            this.f19102b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f19103c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(F.q(runnable));
        sb2.append(", ");
        sb2.append(this.f19101a);
        sb2.append(", ");
        sb2.append(this.f19102b);
        sb2.append(']');
        return sb2.toString();
    }
}
