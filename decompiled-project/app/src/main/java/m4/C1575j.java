package m4;

import m5.C1620q;
import n5.AbstractC1705a;

/* renamed from: m4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1575j {

    /* renamed from: a, reason: collision with root package name */
    public final C1620q f20404a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20405b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20406c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20407d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20408e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20409f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public int f20410h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20411i;

    public C1575j() {
        C1620q c1620q = new C1620q();
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f20404a = c1620q;
        long j = 50000;
        this.f20405b = n5.D.M(j);
        this.f20406c = n5.D.M(j);
        this.f20407d = n5.D.M(2500);
        this.f20408e = n5.D.M(5000);
        this.f20409f = -1;
        this.f20410h = 13107200;
        this.g = n5.D.M(0);
    }

    public static void a(int i7, int i10, String str, String str2) {
        AbstractC1705a.g(str + " cannot be less than " + str2, i7 >= i10);
    }

    public final void b(boolean z8) {
        int i7 = this.f20409f;
        if (i7 == -1) {
            i7 = 13107200;
        }
        this.f20410h = i7;
        this.f20411i = false;
        if (z8) {
            C1620q c1620q = this.f20404a;
            synchronized (c1620q) {
                if (c1620q.f20635a) {
                    c1620q.a(0);
                }
            }
        }
    }

    public final boolean c(long j, float f4) {
        int i7;
        C1620q c1620q = this.f20404a;
        synchronized (c1620q) {
            i7 = c1620q.f20638d * c1620q.f20636b;
        }
        boolean z8 = i7 >= this.f20410h;
        long j10 = this.f20406c;
        long j11 = this.f20405b;
        if (f4 > 1.0f) {
            j11 = Math.min(n5.D.w(j11, f4), j10);
        }
        if (j < Math.max(j11, 500000L)) {
            this.f20411i = !z8;
            if (z8 && j < 500000) {
                AbstractC1705a.S("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j10 || z8) {
            this.f20411i = false;
        }
        return this.f20411i;
    }
}
