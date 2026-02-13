package N3;

import A3.l;
import A3.n;
import C3.A;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7203a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7204b;

    /* renamed from: c, reason: collision with root package name */
    public final D3.f f7205c;

    public i(ArrayList arrayList, a aVar, D3.f fVar) {
        this.f7203a = arrayList;
        this.f7204b = aVar;
        this.f7205c = fVar;
    }

    @Override // A3.n
    public final boolean a(Object obj, l lVar) {
        return !((Boolean) lVar.c(h.f7202b)).booleanValue() && E6.b.s(this.f7203a, (InputStream) obj, this.f7205c) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // A3.n
    public final A b(Object obj, int i7, int i10, l lVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f7204b.b(ByteBuffer.wrap(bArr), i7, i10, lVar);
    }
}
