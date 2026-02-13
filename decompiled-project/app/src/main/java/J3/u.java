package J3;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u implements A3.g {
    @Override // A3.g
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // A3.g
    public final int b(ByteBuffer byteBuffer, D3.f fVar) {
        AtomicReference atomicReference = W3.b.f10596a;
        return c(new W3.a(byteBuffer), fVar);
    }

    @Override // A3.g
    public final int c(InputStream inputStream, D3.f fVar) {
        U1.g gVar = new U1.g(inputStream);
        U1.c c10 = gVar.c("Orientation");
        int i7 = 1;
        if (c10 != null) {
            try {
                i7 = c10.e(gVar.f9503f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i7 == 0) {
            return -1;
        }
        return i7;
    }

    @Override // A3.g
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
