package o4;

import N6.H0;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: o4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1793g {

    /* renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f21845a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    /* JADX WARN: Type inference failed for: r0v1, types: [N6.B, N6.E] */
    public static N6.H a() {
        boolean isDirectPlaybackSupported;
        N6.F f4 = N6.H.f7232b;
        ?? b2 = new N6.B();
        H0 it = C1794h.f21848e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (n5.D.f21141a >= 34 || intValue != 30) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f21845a);
                if (isDirectPlaybackSupported) {
                    b2.a(num);
                }
            }
        }
        b2.a(2);
        return b2.h();
    }

    public static int b(int i7, int i10) {
        boolean isDirectPlaybackSupported;
        for (int i11 = 10; i11 > 0; i11--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i7).setSampleRate(i10).setChannelMask(n5.D.p(i11)).build(), f21845a);
            if (isDirectPlaybackSupported) {
                return i11;
            }
        }
        return 0;
    }
}
