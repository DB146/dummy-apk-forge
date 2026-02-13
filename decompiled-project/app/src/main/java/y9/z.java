package y9;

import android.os.Handler;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class z extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2456A f27549a;

    public z(AbstractC2456A abstractC2456A) {
        this.f27549a = abstractC2456A;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        AbstractC2456A abstractC2456A = this.f27549a;
        ((Handler) abstractC2456A.f27444P1.getValue()).post(new q(abstractC2456A, 1));
    }
}
