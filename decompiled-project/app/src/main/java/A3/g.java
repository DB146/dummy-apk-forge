package A3;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface g {
    ImageHeaderParser$ImageType a(ByteBuffer byteBuffer);

    int b(ByteBuffer byteBuffer, D3.f fVar);

    int c(InputStream inputStream, D3.f fVar);

    ImageHeaderParser$ImageType d(InputStream inputStream);
}
