package x3;

import android.util.Log;
import h3.o;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: x3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2261c {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f26183b;

    /* renamed from: c, reason: collision with root package name */
    public C2260b f26184c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f26182a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f26185d = 0;

    public final boolean a() {
        return this.f26184c.f26175b != 0;
    }

    /* JADX WARN: Type inference failed for: r6v29, types: [x3.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37, types: [x3.a, java.lang.Object] */
    public final C2260b b() {
        byte[] bArr;
        if (this.f26183b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f26184c;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < 6; i7++) {
            sb2.append((char) c());
        }
        if (sb2.toString().startsWith("GIF")) {
            this.f26184c.f26179f = this.f26183b.getShort();
            this.f26184c.g = this.f26183b.getShort();
            int c10 = c();
            C2260b c2260b = this.f26184c;
            c2260b.f26180h = (c10 & 128) != 0;
            c2260b.f26181i = (int) Math.pow(2.0d, (c10 & 7) + 1);
            this.f26184c.j = c();
            C2260b c2260b2 = this.f26184c;
            c();
            c2260b2.getClass();
            if (this.f26184c.f26180h && !a()) {
                C2260b c2260b3 = this.f26184c;
                c2260b3.f26174a = e(c2260b3.f26181i);
                C2260b c2260b4 = this.f26184c;
                c2260b4.k = c2260b4.f26174a[c2260b4.j];
            }
        } else {
            this.f26184c.f26175b = 1;
        }
        if (!a()) {
            boolean z8 = false;
            while (!z8 && !a() && this.f26184c.f26176c <= Integer.MAX_VALUE) {
                int c11 = c();
                if (c11 == 33) {
                    int c12 = c();
                    if (c12 == 1) {
                        f();
                    } else if (c12 == 249) {
                        this.f26184c.f26177d = new Object();
                        c();
                        int c13 = c();
                        C2259a c2259a = this.f26184c.f26177d;
                        int i10 = (c13 & 28) >> 2;
                        c2259a.g = i10;
                        if (i10 == 0) {
                            c2259a.g = 1;
                        }
                        c2259a.f26171f = (c13 & 1) != 0;
                        short s3 = this.f26183b.getShort();
                        if (s3 < 2) {
                            s3 = 10;
                        }
                        C2259a c2259a2 = this.f26184c.f26177d;
                        c2259a2.f26173i = s3 * 10;
                        c2259a2.f26172h = c();
                        c();
                    } else if (c12 == 254) {
                        f();
                    } else if (c12 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb3 = new StringBuilder();
                        int i11 = 0;
                        while (true) {
                            bArr = this.f26182a;
                            if (i11 >= 11) {
                                break;
                            }
                            sb3.append((char) bArr[i11]);
                            i11++;
                        }
                        if (sb3.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b2 = bArr[1];
                                    byte b10 = bArr[2];
                                    this.f26184c.getClass();
                                }
                                if (this.f26185d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (c11 == 44) {
                    C2260b c2260b5 = this.f26184c;
                    if (c2260b5.f26177d == null) {
                        c2260b5.f26177d = new Object();
                    }
                    c2260b5.f26177d.f26166a = this.f26183b.getShort();
                    this.f26184c.f26177d.f26167b = this.f26183b.getShort();
                    this.f26184c.f26177d.f26168c = this.f26183b.getShort();
                    this.f26184c.f26177d.f26169d = this.f26183b.getShort();
                    int c14 = c();
                    boolean z10 = (c14 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (c14 & 7) + 1);
                    C2259a c2259a3 = this.f26184c.f26177d;
                    c2259a3.f26170e = (c14 & 64) != 0;
                    if (z10) {
                        c2259a3.k = e(pow);
                    } else {
                        c2259a3.k = null;
                    }
                    this.f26184c.f26177d.j = this.f26183b.position();
                    c();
                    f();
                    if (!a()) {
                        C2260b c2260b6 = this.f26184c;
                        c2260b6.f26176c++;
                        c2260b6.f26178e.add(c2260b6.f26177d);
                    }
                } else if (c11 != 59) {
                    this.f26184c.f26175b = 1;
                } else {
                    z8 = true;
                }
            }
            C2260b c2260b7 = this.f26184c;
            if (c2260b7.f26176c < 0) {
                c2260b7.f26175b = 1;
            }
        }
        return this.f26184c;
    }

    public final int c() {
        try {
            return this.f26183b.get() & 255;
        } catch (Exception unused) {
            this.f26184c.f26175b = 1;
            return 0;
        }
    }

    public final void d() {
        int c10 = c();
        this.f26185d = c10;
        if (c10 <= 0) {
            return;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            try {
                i10 = this.f26185d;
                if (i7 >= i10) {
                    return;
                }
                i10 -= i7;
                this.f26183b.get(this.f26182a, i7, i10);
                i7 += i10;
            } catch (Exception e2) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder q10 = o.q(i7, i10, "Error Reading Block n: ", " count: ", " blockSize: ");
                    q10.append(this.f26185d);
                    Log.d("GifHeaderParser", q10.toString(), e2);
                }
                this.f26184c.f26175b = 1;
                return;
            }
        }
    }

    public final int[] e(int i7) {
        byte[] bArr = new byte[i7 * 3];
        int[] iArr = null;
        try {
            this.f26183b.get(bArr);
            iArr = new int[256];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i7) {
                int i12 = bArr[i11] & 255;
                int i13 = i11 + 2;
                int i14 = bArr[i11 + 1] & 255;
                i11 += 3;
                int i15 = i10 + 1;
                iArr[i10] = (i14 << 8) | (i12 << 16) | (-16777216) | (bArr[i13] & 255);
                i10 = i15;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f26184c.f26175b = 1;
        }
        return iArr;
    }

    public final void f() {
        int c10;
        do {
            c10 = c();
            this.f26183b.position(Math.min(this.f26183b.position() + c10, this.f26183b.limit()));
        } while (c10 > 0);
    }
}
