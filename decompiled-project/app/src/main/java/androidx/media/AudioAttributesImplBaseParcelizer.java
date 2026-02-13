package androidx.media;

import d3.AbstractC1045a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC1045a abstractC1045a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f13562a = abstractC1045a.f(audioAttributesImplBase.f13562a, 1);
        audioAttributesImplBase.f13563b = abstractC1045a.f(audioAttributesImplBase.f13563b, 2);
        audioAttributesImplBase.f13564c = abstractC1045a.f(audioAttributesImplBase.f13564c, 3);
        audioAttributesImplBase.f13565d = abstractC1045a.f(audioAttributesImplBase.f13565d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC1045a abstractC1045a) {
        abstractC1045a.getClass();
        abstractC1045a.j(audioAttributesImplBase.f13562a, 1);
        abstractC1045a.j(audioAttributesImplBase.f13563b, 2);
        abstractC1045a.j(audioAttributesImplBase.f13564c, 3);
        abstractC1045a.j(audioAttributesImplBase.f13565d, 4);
    }
}
