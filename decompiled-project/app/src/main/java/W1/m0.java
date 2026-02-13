package W1;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class m0 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f10514b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f10513a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        l();
    }

    public final void l() {
        StringBuilder sb2 = this.f10514b;
        if (sb2.length() > 0) {
            Log.d(this.f10513a, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i7 + i11];
            if (c10 == '\n') {
                l();
            } else {
                this.f10514b.append(c10);
            }
        }
    }
}
