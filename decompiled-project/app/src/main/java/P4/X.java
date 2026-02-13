package P4;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import m5.C1604a;
import m5.C1620q;
import q4.C1889b;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final C1620q f7968a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7969b;

    /* renamed from: c, reason: collision with root package name */
    public final n5.v f7970c;

    /* renamed from: d, reason: collision with root package name */
    public A4.e f7971d;

    /* renamed from: e, reason: collision with root package name */
    public A4.e f7972e;

    /* renamed from: f, reason: collision with root package name */
    public A4.e f7973f;
    public long g;

    public X(C1620q c1620q) {
        this.f7968a = c1620q;
        int i7 = c1620q.f20636b;
        this.f7969b = i7;
        this.f7970c = new n5.v(32);
        A4.e eVar = new A4.e(i7, 0L);
        this.f7971d = eVar;
        this.f7972e = eVar;
        this.f7973f = eVar;
    }

    public static A4.e d(A4.e eVar, long j, ByteBuffer byteBuffer, int i7) {
        while (j >= eVar.f378b) {
            eVar = (A4.e) eVar.f380d;
        }
        while (i7 > 0) {
            int min = Math.min(i7, (int) (eVar.f378b - j));
            C1604a c1604a = (C1604a) eVar.f379c;
            byteBuffer.put(c1604a.f20592a, ((int) (j - eVar.f377a)) + c1604a.f20593b, min);
            i7 -= min;
            j += min;
            if (j == eVar.f378b) {
                eVar = (A4.e) eVar.f380d;
            }
        }
        return eVar;
    }

    public static A4.e e(A4.e eVar, long j, byte[] bArr, int i7) {
        while (j >= eVar.f378b) {
            eVar = (A4.e) eVar.f380d;
        }
        int i10 = i7;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (eVar.f378b - j));
            C1604a c1604a = (C1604a) eVar.f379c;
            System.arraycopy(c1604a.f20592a, ((int) (j - eVar.f377a)) + c1604a.f20593b, bArr, i7 - i10, min);
            i10 -= min;
            j += min;
            if (j == eVar.f378b) {
                eVar = (A4.e) eVar.f380d;
            }
        }
        return eVar;
    }

    public static A4.e f(A4.e eVar, q4.g gVar, Z z8, n5.v vVar) {
        int i7;
        if (gVar.i(1073741824)) {
            long j = z8.f7976b;
            vVar.D(1);
            A4.e e2 = e(eVar, j, vVar.f21229a, 1);
            long j10 = j + 1;
            byte b2 = vVar.f21229a[0];
            boolean z10 = (b2 & 128) != 0;
            int i10 = b2 & Byte.MAX_VALUE;
            C1889b c1889b = gVar.f23457c;
            byte[] bArr = c1889b.f23440a;
            if (bArr == null) {
                c1889b.f23440a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            eVar = e(e2, j10, c1889b.f23440a, i10);
            long j11 = j10 + i10;
            if (z10) {
                vVar.D(2);
                eVar = e(eVar, j11, vVar.f21229a, 2);
                j11 += 2;
                i7 = vVar.A();
            } else {
                i7 = 1;
            }
            int[] iArr = c1889b.f23443d;
            if (iArr == null || iArr.length < i7) {
                iArr = new int[i7];
            }
            int[] iArr2 = c1889b.f23444e;
            if (iArr2 == null || iArr2.length < i7) {
                iArr2 = new int[i7];
            }
            if (z10) {
                int i11 = i7 * 6;
                vVar.D(i11);
                eVar = e(eVar, j11, vVar.f21229a, i11);
                j11 += i11;
                vVar.G(0);
                for (int i12 = 0; i12 < i7; i12++) {
                    iArr[i12] = vVar.A();
                    iArr2[i12] = vVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = z8.f7975a - ((int) (j11 - z8.f7976b));
            }
            s4.u uVar = (s4.u) z8.f7977c;
            int i13 = n5.D.f21141a;
            byte[] bArr2 = uVar.f24090b;
            byte[] bArr3 = c1889b.f23440a;
            c1889b.f23445f = i7;
            c1889b.f23443d = iArr;
            c1889b.f23444e = iArr2;
            c1889b.f23441b = bArr2;
            c1889b.f23440a = bArr3;
            int i14 = uVar.f24089a;
            c1889b.f23442c = i14;
            int i15 = uVar.f24091c;
            c1889b.g = i15;
            int i16 = uVar.f24092d;
            c1889b.f23446h = i16;
            MediaCodec.CryptoInfo cryptoInfo = c1889b.f23447i;
            cryptoInfo.numSubSamples = i7;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (n5.D.f21141a >= 24) {
                ha.g gVar2 = c1889b.j;
                gVar2.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) gVar2.f17916c;
                pattern.set(i15, i16);
                ((MediaCodec.CryptoInfo) gVar2.f17915b).setPattern(pattern);
            }
            long j12 = z8.f7976b;
            int i17 = (int) (j11 - j12);
            z8.f7976b = j12 + i17;
            z8.f7975a -= i17;
        }
        if (!gVar.i(268435456)) {
            gVar.I(z8.f7975a);
            return d(eVar, z8.f7976b, gVar.f23458d, z8.f7975a);
        }
        vVar.D(4);
        A4.e e10 = e(eVar, z8.f7976b, vVar.f21229a, 4);
        int y10 = vVar.y();
        z8.f7976b += 4;
        z8.f7975a -= 4;
        gVar.I(y10);
        A4.e d10 = d(e10, z8.f7976b, gVar.f23458d, y10);
        z8.f7976b += y10;
        int i18 = z8.f7975a - y10;
        z8.f7975a = i18;
        ByteBuffer byteBuffer = gVar.f23461u;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            gVar.f23461u = ByteBuffer.allocate(i18);
        } else {
            gVar.f23461u.clear();
        }
        return d(d10, z8.f7976b, gVar.f23461u, z8.f7975a);
    }

    public final void a(A4.e eVar) {
        if (((C1604a) eVar.f379c) == null) {
            return;
        }
        C1620q c1620q = this.f7968a;
        synchronized (c1620q) {
            A4.e eVar2 = eVar;
            while (eVar2 != null) {
                try {
                    C1604a[] c1604aArr = c1620q.f20640f;
                    int i7 = c1620q.f20639e;
                    c1620q.f20639e = i7 + 1;
                    C1604a c1604a = (C1604a) eVar2.f379c;
                    c1604a.getClass();
                    c1604aArr[i7] = c1604a;
                    c1620q.f20638d--;
                    eVar2 = (A4.e) eVar2.f380d;
                    if (eVar2 == null || ((C1604a) eVar2.f379c) == null) {
                        eVar2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c1620q.notifyAll();
        }
        eVar.f379c = null;
        eVar.f380d = null;
    }

    public final void b(long j) {
        A4.e eVar;
        if (j == -1) {
            return;
        }
        while (true) {
            eVar = this.f7971d;
            if (j < eVar.f378b) {
                break;
            }
            C1620q c1620q = this.f7968a;
            C1604a c1604a = (C1604a) eVar.f379c;
            synchronized (c1620q) {
                C1604a[] c1604aArr = c1620q.f20640f;
                int i7 = c1620q.f20639e;
                c1620q.f20639e = i7 + 1;
                c1604aArr[i7] = c1604a;
                c1620q.f20638d--;
                c1620q.notifyAll();
            }
            A4.e eVar2 = this.f7971d;
            eVar2.f379c = null;
            A4.e eVar3 = (A4.e) eVar2.f380d;
            eVar2.f380d = null;
            this.f7971d = eVar3;
        }
        if (this.f7972e.f377a < eVar.f377a) {
            this.f7972e = eVar;
        }
    }

    public final int c(int i7) {
        C1604a c1604a;
        A4.e eVar = this.f7973f;
        if (((C1604a) eVar.f379c) == null) {
            C1620q c1620q = this.f7968a;
            synchronized (c1620q) {
                try {
                    int i10 = c1620q.f20638d + 1;
                    c1620q.f20638d = i10;
                    int i11 = c1620q.f20639e;
                    if (i11 > 0) {
                        C1604a[] c1604aArr = c1620q.f20640f;
                        int i12 = i11 - 1;
                        c1620q.f20639e = i12;
                        c1604a = c1604aArr[i12];
                        c1604a.getClass();
                        c1620q.f20640f[c1620q.f20639e] = null;
                    } else {
                        C1604a c1604a2 = new C1604a(new byte[c1620q.f20636b], 0);
                        C1604a[] c1604aArr2 = c1620q.f20640f;
                        if (i10 > c1604aArr2.length) {
                            c1620q.f20640f = (C1604a[]) Arrays.copyOf(c1604aArr2, c1604aArr2.length * 2);
                        }
                        c1604a = c1604a2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            A4.e eVar2 = new A4.e(this.f7969b, this.f7973f.f378b);
            eVar.f379c = c1604a;
            eVar.f380d = eVar2;
        }
        return Math.min(i7, (int) (this.f7973f.f378b - this.g));
    }
}
