package J3;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: J3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343g implements A3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5472a;

    /* renamed from: b, reason: collision with root package name */
    public final C0339c f5473b;

    public C0343g(int i7) {
        this.f5472a = i7;
        switch (i7) {
            case 1:
                this.f5473b = new C0339c();
                return;
            default:
                this.f5473b = new C0339c();
                return;
        }
    }

    @Override // A3.n
    public final /* bridge */ /* synthetic */ boolean a(Object obj, A3.l lVar) {
        switch (this.f5472a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // A3.n
    public final C3.A b(Object obj, int i7, int i10, A3.l lVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.f5472a) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return this.f5473b.c(createSource, i7, i10, lVar);
            default:
                createSource2 = ImageDecoder.createSource(W3.b.b((InputStream) obj));
                return this.f5473b.c(createSource2, i7, i10, lVar);
        }
    }
}
