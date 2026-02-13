package o4;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final v f21885a;

    /* renamed from: b, reason: collision with root package name */
    public int f21886b;

    /* renamed from: c, reason: collision with root package name */
    public long f21887c;

    /* renamed from: d, reason: collision with root package name */
    public long f21888d;

    /* renamed from: e, reason: collision with root package name */
    public long f21889e;

    /* renamed from: f, reason: collision with root package name */
    public long f21890f;

    public w(AudioTrack audioTrack) {
        if (n5.D.f21141a >= 19) {
            this.f21885a = new v(audioTrack);
            a();
        } else {
            this.f21885a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f21885a != null) {
            b(0);
        }
    }

    public final void b(int i7) {
        this.f21886b = i7;
        if (i7 == 0) {
            this.f21889e = 0L;
            this.f21890f = -1L;
            this.f21887c = System.nanoTime() / 1000;
            this.f21888d = 10000L;
            return;
        }
        if (i7 == 1) {
            this.f21888d = 10000L;
            return;
        }
        if (i7 == 2 || i7 == 3) {
            this.f21888d = 10000000L;
        } else {
            if (i7 != 4) {
                throw new IllegalStateException();
            }
            this.f21888d = 500000L;
        }
    }
}
