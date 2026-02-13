package x7;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class l implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    public static final Logger f26263u = Logger.getLogger(l.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f26264a;

    /* renamed from: b, reason: collision with root package name */
    public int f26265b;

    /* renamed from: c, reason: collision with root package name */
    public int f26266c;

    /* renamed from: d, reason: collision with root package name */
    public i f26267d;

    /* renamed from: e, reason: collision with root package name */
    public i f26268e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f26269f;

    public l(File file) {
        byte[] bArr = new byte[16];
        this.f26269f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i7 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    a0(i7, bArr2, iArr[i10]);
                    i7 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f26264a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int T10 = T(0, bArr);
        this.f26265b = T10;
        if (T10 > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f26265b + ", Actual length: " + randomAccessFile2.length());
        }
        this.f26266c = T(4, bArr);
        int T11 = T(8, bArr);
        int T12 = T(12, bArr);
        this.f26267d = P(T11);
        this.f26268e = P(T12);
    }

    public static int T(int i7, byte[] bArr) {
        return ((bArr[i7] & 255) << 24) + ((bArr[i7 + 1] & 255) << 16) + ((bArr[i7 + 2] & 255) << 8) + (bArr[i7 + 3] & 255);
    }

    public static void a0(int i7, byte[] bArr, int i10) {
        bArr[i7] = (byte) (i10 >> 24);
        bArr[i7 + 1] = (byte) (i10 >> 16);
        bArr[i7 + 2] = (byte) (i10 >> 8);
        bArr[i7 + 3] = (byte) i10;
    }

    public final synchronized void F(k kVar) {
        int i7 = this.f26267d.f26258a;
        for (int i10 = 0; i10 < this.f26266c; i10++) {
            i P10 = P(i7);
            kVar.a(new j(this, P10), P10.f26259b);
            i7 = Y(P10.f26258a + 4 + P10.f26259b);
        }
    }

    public final synchronized boolean K() {
        return this.f26266c == 0;
    }

    public final i P(int i7) {
        if (i7 == 0) {
            return i.f26257c;
        }
        RandomAccessFile randomAccessFile = this.f26264a;
        randomAccessFile.seek(i7);
        return new i(i7, randomAccessFile.readInt());
    }

    public final synchronized void U() {
        if (K()) {
            throw new NoSuchElementException();
        }
        if (this.f26266c == 1) {
            synchronized (this) {
                Z(4096, 0, 0, 0);
                this.f26266c = 0;
                i iVar = i.f26257c;
                this.f26267d = iVar;
                this.f26268e = iVar;
                if (this.f26265b > 4096) {
                    RandomAccessFile randomAccessFile = this.f26264a;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f26265b = 4096;
            }
        } else {
            i iVar2 = this.f26267d;
            int Y2 = Y(iVar2.f26258a + 4 + iVar2.f26259b);
            V(Y2, this.f26269f, 0, 4);
            int T10 = T(0, this.f26269f);
            Z(this.f26265b, this.f26266c - 1, Y2, this.f26268e.f26258a);
            this.f26266c--;
            this.f26267d = new i(Y2, T10);
        }
    }

    public final void V(int i7, byte[] bArr, int i10, int i11) {
        int Y2 = Y(i7);
        int i12 = Y2 + i11;
        int i13 = this.f26265b;
        RandomAccessFile randomAccessFile = this.f26264a;
        if (i12 <= i13) {
            randomAccessFile.seek(Y2);
            randomAccessFile.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - Y2;
        randomAccessFile.seek(Y2);
        randomAccessFile.readFully(bArr, i10, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i10 + i14, i11 - i14);
    }

    public final void W(int i7, byte[] bArr, int i10) {
        int Y2 = Y(i7);
        int i11 = Y2 + i10;
        int i12 = this.f26265b;
        RandomAccessFile randomAccessFile = this.f26264a;
        if (i11 <= i12) {
            randomAccessFile.seek(Y2);
            randomAccessFile.write(bArr, 0, i10);
            return;
        }
        int i13 = i12 - Y2;
        randomAccessFile.seek(Y2);
        randomAccessFile.write(bArr, 0, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i13, i10 - i13);
    }

    public final int X() {
        if (this.f26266c == 0) {
            return 16;
        }
        i iVar = this.f26268e;
        int i7 = iVar.f26258a;
        int i10 = this.f26267d.f26258a;
        return i7 >= i10 ? (i7 - i10) + 4 + iVar.f26259b + 16 : (((i7 + 4) + iVar.f26259b) + this.f26265b) - i10;
    }

    public final int Y(int i7) {
        int i10 = this.f26265b;
        return i7 < i10 ? i7 : (i7 + 16) - i10;
    }

    public final void Z(int i7, int i10, int i11, int i12) {
        int[] iArr = {i7, i10, i11, i12};
        byte[] bArr = this.f26269f;
        int i13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            a0(i13, bArr, iArr[i14]);
            i13 += 4;
        }
        RandomAccessFile randomAccessFile = this.f26264a;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f26264a.close();
    }

    public final void l(byte[] bArr) {
        int Y2;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    n(length);
                    boolean K10 = K();
                    if (K10) {
                        Y2 = 16;
                    } else {
                        i iVar = this.f26268e;
                        Y2 = Y(iVar.f26258a + 4 + iVar.f26259b);
                    }
                    i iVar2 = new i(Y2, length);
                    a0(0, this.f26269f, length);
                    W(Y2, this.f26269f, 4);
                    W(Y2 + 4, bArr, length);
                    Z(this.f26265b, this.f26266c + 1, K10 ? Y2 : this.f26267d.f26258a, Y2);
                    this.f26268e = iVar2;
                    this.f26266c++;
                    if (K10) {
                        this.f26267d = iVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void n(int i7) {
        int i10 = i7 + 4;
        int X10 = this.f26265b - X();
        if (X10 >= i10) {
            return;
        }
        int i11 = this.f26265b;
        do {
            X10 += i11;
            i11 <<= 1;
        } while (X10 < i10);
        RandomAccessFile randomAccessFile = this.f26264a;
        randomAccessFile.setLength(i11);
        randomAccessFile.getChannel().force(true);
        i iVar = this.f26268e;
        int Y2 = Y(iVar.f26258a + 4 + iVar.f26259b);
        if (Y2 < this.f26267d.f26258a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f26265b);
            long j = Y2 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i12 = this.f26268e.f26258a;
        int i13 = this.f26267d.f26258a;
        if (i12 < i13) {
            int i14 = (this.f26265b + i12) - 16;
            Z(i11, this.f26266c, i13, i14);
            this.f26268e = new i(i14, this.f26268e.f26259b);
        } else {
            Z(i11, this.f26266c, i13, i12);
        }
        this.f26265b = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [A9.O, java.lang.Object, x7.k] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f26265b);
        sb2.append(", size=");
        sb2.append(this.f26266c);
        sb2.append(", first=");
        sb2.append(this.f26267d);
        sb2.append(", last=");
        sb2.append(this.f26268e);
        sb2.append(", element lengths=[");
        try {
            ?? obj = new Object();
            obj.f921b = sb2;
            obj.f920a = true;
            F(obj);
        } catch (IOException e2) {
            f26263u.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
