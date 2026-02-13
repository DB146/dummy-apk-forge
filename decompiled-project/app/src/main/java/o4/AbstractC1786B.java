package o4;

import android.media.AudioTrack;

/* renamed from: o4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1786B {
    public static void a(AudioTrack audioTrack, D d10) {
        audioTrack.setPreferredDevice(d10 == null ? null : d10.f21680a);
    }
}
