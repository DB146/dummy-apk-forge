package yc;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: yc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2480b implements AutoCloseable {

    /* renamed from: B, reason: collision with root package name */
    public static final ha.g f27699B = new ha.g(new wc.d(4));

    /* renamed from: C, reason: collision with root package name */
    public static final ha.g f27700C = new ha.g(new wc.d(5));

    /* renamed from: A, reason: collision with root package name */
    public int f27701A;

    /* renamed from: a, reason: collision with root package name */
    public String[] f27702a;

    /* renamed from: b, reason: collision with root package name */
    public Reader f27703b;

    /* renamed from: c, reason: collision with root package name */
    public char[] f27704c;

    /* renamed from: d, reason: collision with root package name */
    public int f27705d;

    /* renamed from: e, reason: collision with root package name */
    public int f27706e;

    /* renamed from: f, reason: collision with root package name */
    public int f27707f;

    /* renamed from: u, reason: collision with root package name */
    public int f27708u;

    /* renamed from: v, reason: collision with root package name */
    public int f27709v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27710w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f27711x;

    /* renamed from: y, reason: collision with root package name */
    public int f27712y;

    /* renamed from: z, reason: collision with root package name */
    public String f27713z;

    public C2480b(Reader reader) {
        this.f27707f = 0;
        this.f27709v = -1;
        this.f27711x = null;
        this.f27712y = 1;
        this.f27703b = reader;
        this.f27704c = (char[]) f27700C.d();
        this.f27702a = (String[]) f27699B.d();
        n();
    }

    public C2480b(String str) {
        this(new StringReader(str));
    }

    public static String F(char[] cArr, String[] strArr, int i7, int i10) {
        if (i10 > 12) {
            return new String(cArr, i7, i10);
        }
        if (i10 < 1) {
            return "";
        }
        int i11 = i10 + i7;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i7; i14 < i11; i14++) {
            i13 = (i13 * 31) + cArr[i14];
        }
        int i15 = i13 & 511;
        String str = strArr[i15];
        if (str != null && i10 == str.length()) {
            int i16 = i7;
            int i17 = i10;
            while (true) {
                int i18 = i17 - 1;
                if (i17 == 0) {
                    return str;
                }
                int i19 = i16 + 1;
                int i20 = i12 + 1;
                if (cArr[i16] != str.charAt(i12)) {
                    break;
                }
                i16 = i19;
                i17 = i18;
                i12 = i20;
            }
        }
        String str2 = new String(cArr, i7, i10);
        strArr[i15] = str2;
        return str2;
    }

    public final char K() {
        n();
        int i7 = this.f27705d;
        char c10 = i7 >= this.f27706e ? (char) 65535 : this.f27704c[i7];
        this.f27705d = i7 + 1;
        return c10;
    }

    public final String P() {
        n();
        int i7 = this.f27705d;
        int i10 = this.f27706e;
        char[] cArr = this.f27704c;
        int i11 = i7;
        while (i11 < i10 && Character.isLetter(cArr[i11])) {
            i11++;
        }
        this.f27705d = i11;
        return i11 > i7 ? F(this.f27704c, this.f27702a, i7, i11 - i7) : "";
    }

    public final String T(InterfaceC2478a interfaceC2478a) {
        n();
        int i7 = this.f27705d;
        int i10 = this.f27706e;
        char[] cArr = this.f27704c;
        int i11 = i7;
        while (i11 < i10 && interfaceC2478a.b(cArr[i11])) {
            i11++;
        }
        this.f27705d = i11;
        return i11 > i7 ? F(this.f27704c, this.f27702a, i7, i11 - i7) : "";
    }

    public final String U(char c10) {
        int i7;
        n();
        int i10 = this.f27705d;
        while (true) {
            if (i10 >= this.f27706e) {
                i7 = -1;
                break;
            }
            if (c10 == this.f27704c[i10]) {
                i7 = i10 - this.f27705d;
                break;
            }
            i10++;
        }
        if (i7 == -1) {
            return W();
        }
        String F10 = F(this.f27704c, this.f27702a, this.f27705d, i7);
        this.f27705d += i7;
        return F10;
    }

    public final String V(char... cArr) {
        n();
        int i7 = this.f27705d;
        int i10 = this.f27706e;
        char[] cArr2 = this.f27704c;
        int i11 = i7;
        while (i11 < i10 && Arrays.binarySearch(cArr, cArr2[i11]) < 0) {
            i11++;
        }
        this.f27705d = i11;
        return i11 > i7 ? F(this.f27704c, this.f27702a, i7, i11 - i7) : "";
    }

    public final String W() {
        n();
        char[] cArr = this.f27704c;
        String[] strArr = this.f27702a;
        int i7 = this.f27705d;
        String F10 = F(cArr, strArr, i7, this.f27706e - i7);
        this.f27705d = this.f27706e;
        return F10;
    }

    public final char X() {
        n();
        int i7 = this.f27705d;
        if (i7 >= this.f27706e) {
            return (char) 65535;
        }
        return this.f27704c[i7];
    }

    public final boolean Y() {
        n();
        return this.f27705d >= this.f27706e;
    }

    public final int Z(int i7) {
        ArrayList arrayList = this.f27711x;
        if (arrayList == null) {
            return 0;
        }
        int binarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i7));
        return binarySearch < -1 ? Math.abs(binarySearch) - 2 : binarySearch;
    }

    public final boolean a0(String str) {
        n();
        n();
        int length = str.length();
        if (length <= this.f27706e - this.f27705d) {
            for (int i7 = 0; i7 < length; i7++) {
                if (str.charAt(i7) == this.f27704c[this.f27705d + i7]) {
                }
            }
            this.f27705d = str.length() + this.f27705d;
            return true;
        }
        return false;
    }

    public final boolean b0(String str) {
        if (!f0(str)) {
            return false;
        }
        this.f27705d = str.length() + this.f27705d;
        return true;
    }

    public final boolean c0(char c10) {
        return !Y() && this.f27704c[this.f27705d] == c10;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ha.g gVar = f27699B;
        ha.g gVar2 = f27700C;
        Reader reader = this.f27703b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
            this.f27703b = null;
            Arrays.fill(this.f27704c, (char) 0);
            gVar2.o(this.f27704c);
            this.f27704c = null;
            gVar.o(this.f27702a);
        } catch (IOException unused) {
            this.f27703b = null;
            Arrays.fill(this.f27704c, (char) 0);
            gVar2.o(this.f27704c);
            this.f27704c = null;
            gVar.o(this.f27702a);
        } catch (Throwable th) {
            this.f27703b = null;
            Arrays.fill(this.f27704c, (char) 0);
            gVar2.o(this.f27704c);
            this.f27704c = null;
            gVar.o(this.f27702a);
            this.f27702a = null;
            throw th;
        }
        this.f27702a = null;
    }

    public final boolean d0(char... cArr) {
        if (Y()) {
            return false;
        }
        n();
        char c10 = this.f27704c[this.f27705d];
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public final boolean e0() {
        if (Y()) {
            return false;
        }
        return wc.l.e(this.f27704c[this.f27705d]);
    }

    public final boolean f0(String str) {
        n();
        int length = str.length();
        if (length > this.f27706e - this.f27705d) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            char c10 = this.f27704c[this.f27705d + i7];
            if (charAt != c10 && Character.toUpperCase(charAt) != Character.toUpperCase(c10)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r2 = r1 + 1;
        r4 = (r9.length() + r2) - 1;
        r5 = r8.f27706e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 >= r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r4 > r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5 >= r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r9.charAt(r3) != r8.f27704c[r5]) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r5 = r5 + 1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        return r1 - r8.f27705d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r0 != r8.f27704c[r1]) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r1 >= r8.f27706e) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0 == r8.f27704c[r1]) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g0(String str) {
        n();
        char charAt = str.charAt(0);
        int i7 = this.f27705d;
        while (i7 < this.f27706e) {
            int i10 = 1;
        }
        return -1;
    }

    public final int h0() {
        return this.f27708u + this.f27705d;
    }

    public final String i0() {
        int Z7;
        StringBuilder sb2 = new StringBuilder();
        int h02 = h0();
        int i7 = 1;
        if (this.f27711x != null) {
            int Z10 = Z(h02);
            i7 = Z10 == -1 ? this.f27712y : 1 + Z10 + this.f27712y;
        }
        sb2.append(i7);
        sb2.append(":");
        int h03 = h0();
        if ((this.f27711x != null) && (Z7 = Z(h03)) != -1) {
            h03 -= ((Integer) this.f27711x.get(Z7)).intValue();
        }
        sb2.append(h03 + 1);
        return sb2.toString();
    }

    public final void j0() {
        int i7 = this.f27709v;
        if (i7 == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.f27705d = i7;
        this.f27709v = -1;
    }

    public final void k0() {
        int i7 = this.f27705d;
        if (i7 < 1) {
            throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f27705d = i7 - 1;
    }

    public final void l() {
        this.f27705d++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        r5.f27710w = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        int i7;
        if (this.f27710w || (i7 = this.f27705d) < this.f27707f || this.f27709v != -1) {
            return;
        }
        this.f27708u += i7;
        int i10 = this.f27706e - i7;
        this.f27706e = i10;
        if (i10 > 0) {
            char[] cArr = this.f27704c;
            System.arraycopy(cArr, i7, cArr, 0, i10);
        }
        this.f27705d = 0;
        while (true) {
            int i11 = this.f27706e;
            if (i11 >= 2048) {
                break;
            }
            try {
                Reader reader = this.f27703b;
                char[] cArr2 = this.f27704c;
                int read = reader.read(cArr2, i11, cArr2.length - i11);
                if (read == -1) {
                    break;
                } else {
                    this.f27706e += read;
                }
            } catch (IOException e2) {
                throw new UncheckedIOException(e2);
            }
        }
        this.f27707f = Math.min(this.f27706e, 1024);
        ArrayList arrayList = this.f27711x;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                int Z7 = Z(this.f27708u);
                if (Z7 == -1) {
                    Z7 = 0;
                }
                Integer num = (Integer) this.f27711x.get(Z7);
                num.getClass();
                this.f27712y += Z7;
                this.f27711x.clear();
                this.f27711x.add(num);
            }
            for (int i12 = this.f27705d; i12 < this.f27706e; i12++) {
                if (this.f27704c[i12] == '\n') {
                    this.f27711x.add(Integer.valueOf(this.f27708u + 1 + i12));
                }
            }
        }
        this.f27713z = null;
    }

    public final String toString() {
        int i7 = this.f27706e;
        int i10 = this.f27705d;
        return i7 - i10 < 0 ? "" : new String(this.f27704c, i10, i7 - i10);
    }
}
