package rc;

import ac.AbstractC0796a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: rc.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1967k implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final C1967k f23967d = new C1967k(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f23968a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f23969b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f23970c;

    public C1967k(byte[] data) {
        kotlin.jvm.internal.l.e(data, "data");
        this.f23968a = data;
    }

    public static /* synthetic */ C1967k C(C1967k c1967k, int i7, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i7 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = -1234567890;
        }
        return c1967k.B(i7, i10);
    }

    public static int j(C1967k c1967k, C1967k other) {
        c1967k.getClass();
        kotlin.jvm.internal.l.e(other, "other");
        return c1967k.i(0, other.f23968a);
    }

    public static int u(C1967k c1967k, C1967k other) {
        c1967k.getClass();
        kotlin.jvm.internal.l.e(other, "other");
        return c1967k.t(other.f23968a);
    }

    public C1967k B(int i7, int i10) {
        if (i10 == -1234567890) {
            i10 = f();
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f23968a;
        if (i10 > bArr.length) {
            throw new IllegalArgumentException(X.c.k(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i10 - i7 >= 0) {
            return (i7 == 0 && i10 == bArr.length) ? this : new C1967k(Eb.n.S(i7, bArr, i10));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public C1967k D() {
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f23968a;
            if (i7 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i7];
            if (b2 >= 65 && b2 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
                copyOf[i7] = (byte) (b2 + 32);
                for (int i10 = i7 + 1; i10 < copyOf.length; i10++) {
                    byte b10 = copyOf[i10];
                    if (b10 >= 65 && b10 <= 90) {
                        copyOf[i10] = (byte) (b10 + 32);
                    }
                }
                return new C1967k(copyOf);
            }
            i7++;
        }
    }

    public final String E() {
        String str = this.f23970c;
        if (str != null) {
            return str;
        }
        byte[] o10 = o();
        kotlin.jvm.internal.l.e(o10, "<this>");
        String str2 = new String(o10, AbstractC0796a.f12815a);
        this.f23970c = str2;
        return str2;
    }

    public void F(C1964h buffer, int i7) {
        kotlin.jvm.internal.l.e(buffer, "buffer");
        buffer.j0(this.f23968a, 0, i7);
    }

    public String a() {
        byte[] map = AbstractC1957a.f23950a;
        byte[] bArr = this.f23968a;
        kotlin.jvm.internal.l.e(bArr, "<this>");
        kotlin.jvm.internal.l.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            byte b2 = bArr[i7];
            int i11 = i7 + 2;
            byte b10 = bArr[i7 + 1];
            i7 += 3;
            byte b11 = bArr[i11];
            bArr2[i10] = map[(b2 & 255) >> 2];
            bArr2[i10 + 1] = map[((b2 & 3) << 4) | ((b10 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr2[i10 + 2] = map[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i10 += 4;
            bArr2[i12] = map[b11 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b12 = bArr[i7];
            bArr2[i10] = map[(b12 & 255) >> 2];
            bArr2[i10 + 1] = map[(b12 & 3) << 4];
            bArr2[i10 + 2] = 61;
            bArr2[i10 + 3] = 61;
        } else if (length2 == 2) {
            int i13 = i7 + 1;
            byte b13 = bArr[i7];
            byte b14 = bArr[i13];
            bArr2[i10] = map[(b13 & 255) >> 2];
            bArr2[i10 + 1] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr2[i10 + 2] = map[(b14 & 15) << 2];
            bArr2[i10 + 3] = 61;
        }
        return new String(bArr2, AbstractC0796a.f12815a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(C1967k other) {
        kotlin.jvm.internal.l.e(other, "other");
        int f4 = f();
        int f10 = other.f();
        int min = Math.min(f4, f10);
        for (int i7 = 0; i7 < min; i7++) {
            int r10 = r(i7) & 255;
            int r11 = other.r(i7) & 255;
            if (r10 == r11) {
            }
        }
        if (f4 == f10) {
            return 0;
        }
    }

    public C1967k d(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f23968a, 0, f());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.l.b(digest);
        return new C1967k(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1967k) {
            C1967k c1967k = (C1967k) obj;
            int f4 = c1967k.f();
            byte[] bArr = this.f23968a;
            if (f4 == bArr.length && c1967k.y(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f23968a.length;
    }

    public String g() {
        byte[] bArr = this.f23968a;
        char[] cArr = new char[bArr.length * 2];
        int i7 = 0;
        for (byte b2 : bArr) {
            int i10 = i7 + 1;
            char[] cArr2 = sc.b.f24357a;
            cArr[i7] = cArr2[(b2 >> 4) & 15];
            i7 += 2;
            cArr[i10] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public int hashCode() {
        int i7 = this.f23969b;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.f23968a);
        this.f23969b = hashCode;
        return hashCode;
    }

    public int i(int i7, byte[] other) {
        kotlin.jvm.internal.l.e(other, "other");
        byte[] bArr = this.f23968a;
        int length = bArr.length - other.length;
        int max = Math.max(i7, 0);
        if (max <= length) {
            while (!AbstractC1958b.a(bArr, max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] o() {
        return this.f23968a;
    }

    public byte r(int i7) {
        return this.f23968a[i7];
    }

    public int t(byte[] other) {
        kotlin.jvm.internal.l.e(other, "other");
        int f4 = f();
        byte[] bArr = this.f23968a;
        for (int min = Math.min(f4, bArr.length - other.length); -1 < min; min--) {
            if (AbstractC1958b.a(bArr, min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00e8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0120, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0124, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00c8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0163, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x016a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x015c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x019b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x019e, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a1, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01a4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b2;
        int i7;
        byte[] bArr = this.f23968a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            if (i10 >= length) {
                break;
            }
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                int i13 = i12 + 1;
                if (i12 == 64) {
                    break;
                }
                if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (Byte.MAX_VALUE <= b10 && b10 < 160))) || b10 == 65533) {
                    break;
                }
                i11 += b10 < 65536 ? 1 : 2;
                i10++;
                while (true) {
                    i12 = i13;
                    if (i10 < length && (b2 = bArr[i10]) >= 0) {
                        i10++;
                        i13 = i12 + 1;
                        if (i12 == 64) {
                            break loop0;
                        }
                        if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                            break loop0;
                        }
                        i11 += b2 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b10 >> 5) == -2) {
                int i14 = i10 + 1;
                if (length > i14) {
                    byte b11 = bArr[i14];
                    if ((b11 & 192) == 128) {
                        int i15 = (b11 ^ 3968) ^ (b10 << 6);
                        if (i15 >= 128) {
                            i7 = i12 + 1;
                            if (i12 == 64) {
                                break;
                            }
                            if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                break;
                            }
                            i11 += i15 < 65536 ? 1 : 2;
                            i10 += 2;
                            i12 = i7;
                        }
                    }
                }
            } else if ((b10 >> 4) == -2) {
                int i16 = i10 + 2;
                if (length > i16) {
                    byte b12 = bArr[i10 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i16];
                        if ((b13 & 192) == 128) {
                            int i17 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b10 << 12);
                            if (i17 >= 2048) {
                                if (55296 > i17 || i17 >= 57344) {
                                    i7 = i12 + 1;
                                    if (i12 == 64) {
                                        break;
                                    }
                                    if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                        break;
                                    }
                                    i11 += i17 < 65536 ? 1 : 2;
                                    i10 += 3;
                                    i12 = i7;
                                }
                            }
                        }
                    }
                }
            } else if ((b10 >> 3) == -2) {
                int i18 = i10 + 3;
                if (length > i18) {
                    byte b14 = bArr[i10 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i10 + 2];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i18];
                            if ((b16 & 192) == 128) {
                                int i19 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b10 << 18);
                                if (i19 <= 1114111) {
                                    if (55296 > i19 || i19 >= 57344) {
                                        if (i19 >= 65536) {
                                            i7 = i12 + 1;
                                            if (i12 == 64) {
                                                break;
                                            }
                                            if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                                break;
                                            }
                                            i11 += i19 < 65536 ? 1 : 2;
                                            i10 += 4;
                                            i12 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i11 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + g() + ']';
            }
            StringBuilder sb2 = new StringBuilder("[size=");
            sb2.append(bArr.length);
            sb2.append(" hex=");
            if (64 > bArr.length) {
                throw new IllegalArgumentException(X.c.k(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
            }
            sb2.append((64 == bArr.length ? this : new C1967k(Eb.n.S(0, bArr, 64))).g());
            sb2.append("…]");
            return sb2.toString();
        }
        String E10 = E();
        String substring = E10.substring(0, i11);
        kotlin.jvm.internal.l.d(substring, "substring(...)");
        String W10 = ac.n.W(ac.n.W(ac.n.W(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i11 >= E10.length()) {
            return "[text=" + W10 + ']';
        }
        return "[size=" + bArr.length + " text=" + W10 + "…]";
    }

    public boolean v(int i7, C1967k other, int i10) {
        kotlin.jvm.internal.l.e(other, "other");
        return other.y(0, this.f23968a, i7, i10);
    }

    public boolean y(int i7, byte[] other, int i10, int i11) {
        kotlin.jvm.internal.l.e(other, "other");
        if (i7 >= 0) {
            byte[] bArr = this.f23968a;
            if (i7 <= bArr.length - i11 && i10 >= 0 && i10 <= other.length - i11 && AbstractC1958b.a(bArr, i7, other, i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public String z(Charset charset) {
        kotlin.jvm.internal.l.e(charset, "charset");
        return new String(this.f23968a, charset);
    }
}
