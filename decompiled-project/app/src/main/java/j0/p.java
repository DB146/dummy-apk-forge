package j0;

import android.graphics.ColorSpace;
import android.media.AudioFocusRequest;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p {
    public static /* synthetic */ ColorSpace.Rgb c(String str, float[] fArr, float[] fArr2, ColorSpace.Rgb.TransferParameters transferParameters) {
        return new ColorSpace.Rgb(str, fArr, fArr2, transferParameters);
    }

    public static /* synthetic */ ColorSpace.Rgb d(String str, float[] fArr, float[] fArr2, q qVar, q qVar2, float f4, float f10) {
        return new ColorSpace.Rgb(str, fArr, fArr2, qVar, qVar2, f4, f10);
    }

    public static /* bridge */ /* synthetic */ ColorSpace f(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* synthetic */ AudioFocusRequest.Builder g(int i7) {
        return new AudioFocusRequest.Builder(i7);
    }

    public static /* synthetic */ AudioFocusRequest.Builder k(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void w() {
    }
}
