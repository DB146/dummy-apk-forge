package U1;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f9450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9451b;

    public a(f fVar) {
        this.f9451b = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j10 = this.f9450a;
            f fVar = this.f9451b;
            if (j10 != j) {
                if (j10 >= 0 && j >= j10 + fVar.f9454a.available()) {
                    return -1;
                }
                fVar.n(j);
                this.f9450a = j;
            }
            if (i10 > fVar.f9454a.available()) {
                i10 = fVar.f9454a.available();
            }
            int read = fVar.read(bArr, i7, i10);
            if (read >= 0) {
                this.f9450a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f9450a = -1L;
        return -1;
    }
}
