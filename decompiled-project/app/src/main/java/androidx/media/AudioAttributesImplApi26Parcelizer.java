package androidx.media;

import android.media.AudioAttributes;
import d3.AbstractC1045a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC1045a abstractC1045a) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f13560a = (AudioAttributes) abstractC1045a.g(audioAttributesImplApi26.f13560a, 1);
        audioAttributesImplApi26.f13561b = abstractC1045a.f(audioAttributesImplApi26.f13561b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC1045a abstractC1045a) {
        abstractC1045a.getClass();
        abstractC1045a.k(audioAttributesImplApi26.f13560a, 1);
        abstractC1045a.j(audioAttributesImplApi26.f13561b, 2);
    }
}
