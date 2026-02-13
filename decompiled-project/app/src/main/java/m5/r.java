package m5;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final /* synthetic */ class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1621s f20641a;

    public final void a(int i7) {
        C1621s c1621s = this.f20641a;
        synchronized (c1621s) {
            int i10 = c1621s.f20656i;
            if (i10 == 0 || c1621s.f20653e) {
                if (i10 == i7) {
                    return;
                }
                c1621s.f20656i = i7;
                if (i7 != 1 && i7 != 0 && i7 != 8) {
                    c1621s.f20657l = c1621s.b(i7);
                    c1621s.f20652d.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    c1621s.c(c1621s.f20654f > 0 ? (int) (elapsedRealtime - c1621s.g) : 0, c1621s.f20655h, c1621s.f20657l);
                    c1621s.g = elapsedRealtime;
                    c1621s.f20655h = 0L;
                    c1621s.k = 0L;
                    c1621s.j = 0L;
                    Q q10 = c1621s.f20651c;
                    q10.f20574b.clear();
                    q10.f20576d = -1;
                    q10.f20577e = 0;
                    q10.f20578f = 0;
                }
            }
        }
    }
}
