package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f13560a;

    /* renamed from: b, reason: collision with root package name */
    public int f13561b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f13560a.equals(((AudioAttributesImplApi21) obj).f13560a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13560a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f13560a;
    }
}
