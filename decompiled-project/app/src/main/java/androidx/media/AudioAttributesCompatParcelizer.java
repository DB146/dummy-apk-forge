package androidx.media;

import d3.AbstractC1045a;
import d3.InterfaceC1047c;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1045a abstractC1045a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC1047c interfaceC1047c = audioAttributesCompat.f13559a;
        if (abstractC1045a.e(1)) {
            interfaceC1047c = abstractC1045a.h();
        }
        audioAttributesCompat.f13559a = (AudioAttributesImpl) interfaceC1047c;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1045a abstractC1045a) {
        abstractC1045a.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f13559a;
        abstractC1045a.i(1);
        abstractC1045a.l(audioAttributesImpl);
    }
}
