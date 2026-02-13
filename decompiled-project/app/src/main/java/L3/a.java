package L3;

import A3.l;
import A3.n;
import C3.A;
import D3.f;
import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import q3.e;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6282a;

    /* renamed from: b, reason: collision with root package name */
    public final e f6283b;

    public /* synthetic */ a(e eVar, int i7) {
        this.f6282a = i7;
        this.f6283b = eVar;
    }

    @Override // A3.n
    public final boolean a(Object obj, l lVar) {
        switch (this.f6282a) {
            case 0:
                ImageHeaderParser$ImageType t5 = E6.b.t((ArrayList) this.f6283b.f23376b, (ByteBuffer) obj);
                return t5 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && t5 == ImageHeaderParser$ImageType.ANIMATED_AVIF);
            default:
                e eVar = this.f6283b;
                ImageHeaderParser$ImageType s3 = E6.b.s((ArrayList) eVar.f23376b, (InputStream) obj, (f) eVar.f23377c);
                return s3 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && s3 == ImageHeaderParser$ImageType.ANIMATED_AVIF);
        }
    }

    @Override // A3.n
    public final A b(Object obj, int i7, int i10, l lVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.f6282a) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return e.i(createSource, i7, i10, lVar);
            default:
                createSource2 = ImageDecoder.createSource(W3.b.b((InputStream) obj));
                return e.i(createSource2, i7, i10, lVar);
        }
    }
}
