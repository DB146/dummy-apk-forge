package I3;

import A3.k;
import A3.l;
import A3.m;
import J3.o;
import J3.q;
import J3.w;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* loaded from: classes.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final w f5213a = w.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f5214b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5215c;

    /* renamed from: d, reason: collision with root package name */
    public final A3.b f5216d;

    /* renamed from: e, reason: collision with root package name */
    public final o f5217e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5218f;
    public final m g;

    public b(int i7, int i10, l lVar) {
        this.f5214b = i7;
        this.f5215c = i10;
        this.f5216d = (A3.b) lVar.c(q.f5487f);
        this.f5217e = (o) lVar.c(o.g);
        k kVar = q.f5489i;
        this.f5218f = lVar.c(kVar) != null && ((Boolean) lVar.c(kVar)).booleanValue();
        this.g = (m) lVar.c(q.g);
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, I3.a] */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        if (this.f5213a.c(this.f5214b, this.f5215c, this.f5218f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f5216d == A3.b.f349b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new Object());
        size = imageInfo.getSize();
        int i7 = this.f5214b;
        if (i7 == Integer.MIN_VALUE) {
            i7 = size.getWidth();
        }
        int i10 = this.f5215c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getHeight();
        }
        float b2 = this.f5217e.b(size.getWidth(), size.getHeight(), i7, i10);
        int round = Math.round(size.getWidth() * b2);
        int round2 = Math.round(size.getHeight() * b2);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b2);
        }
        imageDecoder.setTargetSize(round, round2);
        m mVar = this.g;
        if (mVar != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 28) {
                if (i11 >= 26) {
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    return;
                }
                return;
            }
            if (mVar == m.f361a) {
                colorSpace3 = imageInfo.getColorSpace();
                if (colorSpace3 != null) {
                    colorSpace4 = imageInfo.getColorSpace();
                    isWideGamut = colorSpace4.isWideGamut();
                    if (isWideGamut) {
                        named2 = ColorSpace.Named.DISPLAY_P3;
                        colorSpace2 = ColorSpace.get(named2);
                        imageDecoder.setTargetColorSpace(colorSpace2);
                    }
                }
            }
            named2 = ColorSpace.Named.SRGB;
            colorSpace2 = ColorSpace.get(named2);
            imageDecoder.setTargetColorSpace(colorSpace2);
        }
    }
}
