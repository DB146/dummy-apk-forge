package okhttp3.internal.http2.flowcontrol;

/* loaded from: classes2.dex */
public final class WindowCounter {

    /* renamed from: a, reason: collision with root package name */
    public final int f22878a;

    /* renamed from: b, reason: collision with root package name */
    public long f22879b;

    /* renamed from: c, reason: collision with root package name */
    public long f22880c;

    public WindowCounter(int i7) {
        this.f22878a = i7;
    }

    public static void b(WindowCounter windowCounter, long j, long j10, int i7) {
        if ((i7 & 1) != 0) {
            j = 0;
        }
        if ((i7 & 2) != 0) {
            j10 = 0;
        }
        synchronized (windowCounter) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j10 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j11 = windowCounter.f22879b + j;
                windowCounter.f22879b = j11;
                long j12 = windowCounter.f22880c + j10;
                windowCounter.f22880c = j12;
                if (j12 > j11) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized long a() {
        return this.f22879b - this.f22880c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f22878a + ", total=" + this.f22879b + ", acknowledged=" + this.f22880c + ", unacknowledged=" + a() + ')';
    }
}
