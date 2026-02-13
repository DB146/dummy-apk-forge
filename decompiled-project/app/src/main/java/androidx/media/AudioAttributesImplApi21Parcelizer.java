package androidx.media;

import android.media.AudioAttributes;
import d3.AbstractC1045a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC1045a abstractC1045a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f13560a = (AudioAttributes) abstractC1045a.g(audioAttributesImplApi21.f13560a, 1);
        audioAttributesImplApi21.f13561b = abstractC1045a.f(audioAttributesImplApi21.f13561b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC1045a abstractC1045a) {
        abstractC1045a.getClass();
        abstractC1045a.k(audioAttributesImplApi21.f13560a, 1);
        abstractC1045a.j(audioAttributesImplApi21.f13561b, 2);
    }
}
