package K7;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends Reader {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6204a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6205b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f6206c;

    /* renamed from: e, reason: collision with root package name */
    public int f6208e = this.f6206c;

    /* renamed from: d, reason: collision with root package name */
    public int f6207d;

    /* renamed from: f, reason: collision with root package name */
    public int f6209f = this.f6207d;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6210u = false;

    public b() {
        this.f6204a = null;
        this.f6204a = new ArrayList();
    }

    public final String F() {
        int i7 = this.f6207d;
        ArrayList arrayList = this.f6204a;
        if (i7 < arrayList.size()) {
            return (String) arrayList.get(this.f6207d);
        }
        return null;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n();
        this.f6205b = true;
    }

    public final long l(long j) {
        long j10 = 0;
        while (this.f6207d < this.f6204a.size() && j10 < j) {
            String F10 = F();
            long j11 = j - j10;
            long length = F10 == null ? 0 : F10.length() - this.f6206c;
            if (j11 < length) {
                this.f6206c = (int) (this.f6206c + j11);
                j10 += j11;
            } else {
                j10 += length;
                this.f6206c = 0;
                this.f6207d++;
            }
        }
        return j10;
    }

    @Override // java.io.Reader
    public final void mark(int i7) {
        n();
        this.f6208e = this.f6206c;
        this.f6209f = this.f6207d;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    public final void n() {
        if (this.f6205b) {
            throw new IOException("Stream already closed");
        }
        if (!this.f6210u) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    @Override // java.io.Reader
    public final int read() {
        n();
        String F10 = F();
        if (F10 == null) {
            return -1;
        }
        char charAt = F10.charAt(this.f6206c);
        l(1L);
        return charAt;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final int read(CharBuffer charBuffer) {
        n();
        int remaining = charBuffer.remaining();
        String F10 = F();
        int i7 = 0;
        while (remaining > 0 && F10 != null) {
            int min = Math.min(F10.length() - this.f6206c, remaining);
            String str = (String) this.f6204a.get(this.f6207d);
            int i10 = this.f6206c;
            charBuffer.put(str, i10, i10 + min);
            remaining -= min;
            i7 += min;
            l(min);
            F10 = F();
        }
        if (i7 > 0 || F10 != null) {
            return i7;
        }
        return -1;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i7, int i10) {
        n();
        String F10 = F();
        int i11 = 0;
        while (F10 != null && i11 < i10) {
            String F11 = F();
            int min = Math.min(F11 == null ? 0 : F11.length() - this.f6206c, i10 - i11);
            int i12 = this.f6206c;
            F10.getChars(i12, i12 + min, cArr, i7 + i11);
            i11 += min;
            l(min);
            F10 = F();
        }
        if (i11 > 0 || F10 != null) {
            return i11;
        }
        return -1;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        n();
        return true;
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f6206c = this.f6208e;
        this.f6207d = this.f6209f;
    }

    @Override // java.io.Reader
    public final long skip(long j) {
        n();
        return l(j);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f6204a.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        return sb2.toString();
    }
}
