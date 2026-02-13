package U4;

import android.os.SystemClock;
import java.util.List;
import k5.AbstractC1424c;

/* loaded from: classes.dex */
public final class g extends AbstractC1424c {
    public int g;

    @Override // k5.s
    public final void b(long j, long j10, long j11, List list, R4.l[] lVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (c(this.g, elapsedRealtime)) {
            for (int i7 = this.f18866b - 1; i7 >= 0; i7--) {
                if (!c(i7, elapsedRealtime)) {
                    this.g = i7;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // k5.s
    public final int m() {
        return 0;
    }

    @Override // k5.s
    public final int n() {
        return this.g;
    }

    @Override // k5.s
    public final Object q() {
        return null;
    }
}
