package J3;

import B0.h1;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import x3.C2262d;

/* renamed from: J3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339c implements A3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5465a;

    /* renamed from: b, reason: collision with root package name */
    public final D3.a f5466b;

    public C0339c() {
        this.f5465a = 0;
        this.f5466b = new Hc.e(3);
    }

    public C0339c(D3.a aVar) {
        this.f5465a = 1;
        this.f5466b = aVar;
    }

    @Override // A3.n
    public final /* bridge */ /* synthetic */ boolean a(Object obj, A3.l lVar) {
        switch (this.f5465a) {
            case 0:
                h1.u(obj);
                return true;
            default:
                return true;
        }
    }

    @Override // A3.n
    public final C3.A b(Object obj, int i7, int i10, A3.l lVar) {
        switch (this.f5465a) {
            case 0:
                return c(h1.f(obj), i7, i10, lVar);
            default:
                return C0340d.e(this.f5466b, ((C2262d) obj).b());
        }
    }

    public C0340d c(ImageDecoder.Source source, int i7, int i10, A3.l lVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new I3.b(i7, i10, lVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i7 + "x" + i10 + "]");
        }
        return new C0340d((Hc.e) this.f5466b, decodeBitmap);
    }
}
