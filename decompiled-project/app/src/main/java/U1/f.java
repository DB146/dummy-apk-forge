package U1;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.f9454a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public f(byte[] bArr) {
        super(bArr);
        this.f9454a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final void n(long j) {
        int i7 = this.f9456c;
        if (i7 > j) {
            this.f9456c = 0;
            this.f9454a.reset();
        } else {
            j -= i7;
        }
        l((int) j);
    }
}
