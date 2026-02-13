package o4;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final m4.L f21681a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21682b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21683c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21684d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21685e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21686f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21687h;

    /* renamed from: i, reason: collision with root package name */
    public final C1799m f21688i;
    public final boolean j;

    public E(m4.L l10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, C1799m c1799m, boolean z8) {
        this.f21681a = l10;
        this.f21682b = i7;
        this.f21683c = i10;
        this.f21684d = i11;
        this.f21685e = i12;
        this.f21686f = i13;
        this.g = i14;
        this.f21687h = i15;
        this.f21688i = c1799m;
        this.j = z8;
    }

    public static AudioAttributes c(C1791e c1791e, boolean z8) {
        return z8 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c1791e.a().f8929b;
    }

    public final AudioTrack a(boolean z8, C1791e c1791e, int i7) {
        int i10 = this.f21683c;
        try {
            AudioTrack b2 = b(z8, c1791e, i7);
            int state = b2.getState();
            if (state == 1) {
                return b2;
            }
            try {
                b2.release();
            } catch (Exception unused) {
            }
            throw new C1804s(state, this.f21685e, this.f21686f, this.f21687h, this.f21681a, i10 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new C1804s(0, this.f21685e, this.f21686f, this.f21687h, this.f21681a, i10 == 1, e2);
        }
    }

    public final AudioTrack b(boolean z8, C1791e c1791e, int i7) {
        int i10;
        int i11;
        AudioTrack.Builder offloadedPlayback;
        int i12 = n5.D.f21141a;
        int i13 = this.g;
        int i14 = this.f21686f;
        int i15 = this.f21685e;
        if (i12 >= 29) {
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(c(c1791e, z8)).setAudioFormat(I.f(i15, i14, i13)).setTransferMode(1).setBufferSizeInBytes(this.f21687h).setSessionId(i7).setOffloadedPlayback(this.f21683c == 1);
            return offloadedPlayback.build();
        }
        if (i12 >= 21) {
            return new AudioTrack(c(c1791e, z8), I.f(i15, i14, i13), this.f21687h, 1, i7);
        }
        int i16 = c1791e.f21841c;
        if (i16 != 13) {
            switch (i16) {
                case 2:
                    i10 = 0;
                    break;
                case 3:
                    i11 = 8;
                    i10 = i11;
                    break;
                case 4:
                    i11 = 4;
                    i10 = i11;
                    break;
                case 5:
                case 7:
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                case 10:
                    i11 = 5;
                    i10 = i11;
                    break;
                case 6:
                    i11 = 2;
                    i10 = i11;
                    break;
                default:
                    i11 = 3;
                    i10 = i11;
                    break;
            }
        } else {
            i10 = 1;
        }
        if (i7 == 0) {
            return new AudioTrack(i10, this.f21685e, this.f21686f, this.g, this.f21687h, 1);
        }
        return new AudioTrack(i10, this.f21685e, this.f21686f, this.g, this.f21687h, 1, i7);
    }
}
