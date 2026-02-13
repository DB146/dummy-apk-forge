package O8;

import P1.g;
import U9.j;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import h3.o;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    public String[] f7503A;

    /* renamed from: B, reason: collision with root package name */
    public int[] f7504B;

    /* renamed from: a, reason: collision with root package name */
    public final StringReader f7506a;

    /* renamed from: v, reason: collision with root package name */
    public long f7513v;

    /* renamed from: w, reason: collision with root package name */
    public int f7514w;

    /* renamed from: x, reason: collision with root package name */
    public String f7515x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f7516y;

    /* renamed from: C, reason: collision with root package name */
    public int f7505C = 2;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f7507b = new char[1024];

    /* renamed from: c, reason: collision with root package name */
    public int f7508c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f7509d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f7510e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f7511f = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f7512u = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f7517z = 1;

    static {
        j.f9883b = new j(11);
    }

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f7516y = iArr;
        iArr[0] = 6;
        this.f7503A = new String[32];
        this.f7504B = new int[32];
        this.f7506a = stringReader;
    }

    public final void F() {
        if (this.f7505C == 1) {
            return;
        }
        q0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0219, code lost:
    
        if (X(r1) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a2, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021c, code lost:
    
        if (r6 != 2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021e, code lost:
    
        if (r11 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0224, code lost:
    
        if (r7 != Long.MIN_VALUE) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0226, code lost:
    
        if (r15 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022d, code lost:
    
        if (r7 != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022f, code lost:
    
        if (r15 != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0231, code lost:
    
        if (r15 == 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0234, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0235, code lost:
    
        r19.f7513v = r7;
        r19.f7508c += r9;
        r10 = 15;
        r19.f7512u = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0229, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0241, code lost:
    
        if (r6 == r1) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0244, code lost:
    
        if (r6 == 4) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0247, code lost:
    
        if (r6 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0249, code lost:
    
        r19.f7514w = r9;
        r10 = 16;
        r19.f7512u = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int K() {
        int i7;
        int e02;
        int i10;
        int e03;
        int i11;
        String str;
        String str2;
        int i12;
        char c10;
        int i13;
        int i14;
        int[] iArr = this.f7516y;
        int i15 = 1;
        int i16 = this.f7517z - 1;
        int i17 = iArr[i16];
        char[] cArr = this.f7507b;
        if (i17 == 1) {
            iArr[i16] = 2;
        } else {
            if (i17 != 2) {
                if (i17 == 3) {
                    i7 = 4;
                } else if (i17 == 5) {
                    i7 = 4;
                } else if (i17 == 4) {
                    iArr[i16] = 5;
                    int e04 = e0(true);
                    if (e04 != 58) {
                        if (e04 != 61) {
                            q0("Expected ':'");
                            throw null;
                        }
                        F();
                        if (this.f7508c < this.f7509d || U(1)) {
                            int i18 = this.f7508c;
                            if (cArr[i18] == '>') {
                                this.f7508c = i18 + 1;
                            }
                        }
                    }
                } else {
                    if (i17 != 6) {
                        if (i17 == 7) {
                            i10 = 0;
                            if (e0(false) == -1) {
                                this.f7512u = 17;
                                return 17;
                            }
                            F();
                            this.f7508c--;
                        } else {
                            i10 = 0;
                            if (i17 == 8) {
                                throw new IllegalStateException("JsonReader is closed");
                            }
                        }
                        e03 = e0(true);
                        if (e03 != 34) {
                            this.f7512u = 9;
                            return 9;
                        }
                        if (e03 == 39) {
                            F();
                            this.f7512u = 8;
                            return 8;
                        }
                        if (e03 == 44 || e03 == 59) {
                            i11 = 1;
                        } else {
                            if (e03 == 91) {
                                this.f7512u = 3;
                                return 3;
                            }
                            if (e03 == 93) {
                                i11 = 1;
                                if (i17 == 1) {
                                    this.f7512u = 4;
                                    return 4;
                                }
                            } else {
                                if (e03 == 123) {
                                    this.f7512u = 1;
                                    return 1;
                                }
                                int i19 = this.f7508c - 1;
                                this.f7508c = i19;
                                char c11 = cArr[i19];
                                if (c11 == 't' || c11 == 'T') {
                                    str = "true";
                                    str2 = "TRUE";
                                    i12 = 5;
                                } else if (c11 == 'f' || c11 == 'F') {
                                    str = "false";
                                    str2 = "FALSE";
                                    i12 = 6;
                                } else {
                                    if (c11 == 'n' || c11 == 'N') {
                                        str = "null";
                                        str2 = "NULL";
                                        i12 = 7;
                                    }
                                    i12 = i10;
                                    if (i12 == 0) {
                                        return i12;
                                    }
                                    int i20 = this.f7508c;
                                    int i21 = this.f7509d;
                                    int i22 = i10;
                                    int i23 = i22;
                                    int i24 = i23;
                                    boolean z8 = true;
                                    long j = 0;
                                    while (true) {
                                        if (i20 + i23 == i21) {
                                            if (i23 == cArr.length) {
                                                break;
                                            }
                                            if (!U(i23 + 1)) {
                                                break;
                                            }
                                            int i25 = this.f7508c;
                                            i21 = this.f7509d;
                                            i20 = i25;
                                        }
                                        char c12 = cArr[i20 + i23];
                                        if (c12 != '+') {
                                            if (c12 == 'E' || c12 == 'e') {
                                                i13 = i21;
                                                if (i22 != 2 && i22 != 4) {
                                                    break;
                                                }
                                                i22 = 5;
                                                i23++;
                                                i21 = i13;
                                                i15 = 1;
                                            } else if (c12 == '-') {
                                                i13 = i21;
                                                if (i22 == 0) {
                                                    i22 = 1;
                                                    i24 = 1;
                                                    i23++;
                                                    i21 = i13;
                                                    i15 = 1;
                                                } else {
                                                    if (i22 != 5) {
                                                        break;
                                                    }
                                                    i22 = 6;
                                                    i23++;
                                                    i21 = i13;
                                                    i15 = 1;
                                                }
                                            } else if (c12 == '.') {
                                                i13 = i21;
                                                if (i22 != 2) {
                                                    break;
                                                }
                                                i22 = 3;
                                                i23++;
                                                i21 = i13;
                                                i15 = 1;
                                            } else {
                                                if (c12 < '0' || c12 > '9') {
                                                    break;
                                                }
                                                if (i22 == i15 || i22 == 0) {
                                                    i13 = i21;
                                                    j = -(c12 - '0');
                                                    i22 = 2;
                                                } else if (i22 != 2) {
                                                    i13 = i21;
                                                    if (i22 == 3) {
                                                        i22 = 4;
                                                    } else if (i22 == 5 || i22 == 6) {
                                                        i22 = 7;
                                                    }
                                                } else {
                                                    if (j == 0) {
                                                        break;
                                                    }
                                                    i13 = i21;
                                                    long j10 = (10 * j) - (c12 - '0');
                                                    z8 &= j > -922337203685477580L || (j == -922337203685477580L && j10 < j);
                                                    j = j10;
                                                }
                                                i23++;
                                                i21 = i13;
                                                i15 = 1;
                                            }
                                            if (i14 == 0) {
                                                return i14;
                                            }
                                            if (!X(cArr[this.f7508c])) {
                                                q0("Expected value");
                                                throw null;
                                            }
                                            F();
                                            this.f7512u = 10;
                                            return 10;
                                        }
                                        i13 = i21;
                                        if (i22 != 5) {
                                            break;
                                        }
                                        i22 = 6;
                                        i23++;
                                        i21 = i13;
                                        i15 = 1;
                                    }
                                    i14 = 0;
                                    if (i14 == 0) {
                                    }
                                }
                                int i26 = this.f7505C != 3 ? 1 : i10;
                                int length = str.length();
                                int i27 = i10;
                                while (true) {
                                    if (i27 < length) {
                                        if ((this.f7508c + i27 >= this.f7509d && !U(i27 + 1)) || ((c10 = cArr[this.f7508c + i27]) != str.charAt(i27) && (i26 == 0 || c10 != str2.charAt(i27)))) {
                                            break;
                                        }
                                        i27++;
                                    } else if ((this.f7508c + length >= this.f7509d && !U(length + 1)) || !X(cArr[this.f7508c + length])) {
                                        this.f7508c += length;
                                        this.f7512u = i12;
                                    }
                                }
                                i12 = i10;
                                if (i12 == 0) {
                                }
                            }
                        }
                        if (i17 != i11 && i17 != 2) {
                            q0("Unexpected value");
                            throw null;
                        }
                        F();
                        this.f7508c -= i11;
                        this.f7512u = 7;
                        return 7;
                    }
                    if (this.f7505C == 1) {
                        e0(true);
                        int i28 = this.f7508c;
                        this.f7508c = i28 - 1;
                        if (i28 + 4 <= this.f7509d || U(5)) {
                            int i29 = this.f7508c;
                            if (cArr[i29] == ')' && cArr[i29 + 1] == ']' && cArr[i29 + 2] == '}' && cArr[i29 + 3] == '\'' && cArr[i29 + 4] == '\n') {
                                this.f7508c = i29 + 5;
                            }
                        }
                    }
                    this.f7516y[this.f7517z - 1] = 7;
                }
                iArr[i16] = i7;
                if (i17 == 5 && (e02 = e0(true)) != 44) {
                    if (e02 != 59) {
                        if (e02 == 125) {
                            this.f7512u = 2;
                            return 2;
                        }
                        q0("Unterminated object");
                        throw null;
                    }
                    F();
                }
                int e05 = e0(true);
                if (e05 == 34) {
                    this.f7512u = 13;
                    return 13;
                }
                if (e05 == 39) {
                    F();
                    this.f7512u = 12;
                    return 12;
                }
                if (e05 == 125) {
                    if (i17 != 5) {
                        this.f7512u = 2;
                        return 2;
                    }
                    q0("Expected name");
                    throw null;
                }
                F();
                this.f7508c--;
                if (X((char) e05)) {
                    this.f7512u = 14;
                    return 14;
                }
                q0("Expected name");
                throw null;
            }
            int e06 = e0(true);
            if (e06 != 44) {
                if (e06 != 59) {
                    if (e06 == 93) {
                        this.f7512u = 4;
                        return 4;
                    }
                    q0("Unterminated array");
                    throw null;
                }
                F();
            }
        }
        i10 = 0;
        e03 = e0(true);
        if (e03 != 34) {
        }
    }

    public final void P() {
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        if (i7 != 4) {
            throw r0("END_ARRAY");
        }
        int i10 = this.f7517z;
        this.f7517z = i10 - 1;
        int[] iArr = this.f7504B;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f7512u = 0;
    }

    public final void T() {
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        if (i7 != 2) {
            throw r0("END_OBJECT");
        }
        int i10 = this.f7517z;
        int i11 = i10 - 1;
        this.f7517z = i11;
        this.f7503A[i11] = null;
        int[] iArr = this.f7504B;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f7512u = 0;
    }

    public final boolean U(int i7) {
        int i10;
        int i11;
        int i12 = this.f7511f;
        int i13 = this.f7508c;
        this.f7511f = i12 - i13;
        int i14 = this.f7509d;
        char[] cArr = this.f7507b;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f7509d = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f7509d = 0;
        }
        this.f7508c = 0;
        do {
            int i16 = this.f7509d;
            int read = this.f7506a.read(cArr, i16, cArr.length - i16);
            if (read == -1) {
                return false;
            }
            i10 = this.f7509d + read;
            this.f7509d = i10;
            if (this.f7510e == 0 && (i11 = this.f7511f) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f7508c++;
                this.f7511f = i11 + 1;
                i7++;
            }
        } while (i10 < i7);
        return true;
    }

    public final String V(boolean z8) {
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = 0;
        while (true) {
            int i10 = this.f7517z;
            if (i7 >= i10) {
                return sb2.toString();
            }
            int i11 = this.f7516y[i7];
            switch (i11) {
                case 1:
                case 2:
                    int i12 = this.f7504B[i7];
                    if (z8 && i12 > 0 && i7 == i10 - 1) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f7503A[i7];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    break;
                default:
                    throw new AssertionError(o.l(i11, "Unknown scope value: "));
            }
            i7++;
        }
    }

    public final boolean W() {
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        return (i7 == 2 || i7 == 4 || i7 == 17) ? false : true;
    }

    public final boolean X(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        F();
        return false;
    }

    public final String Y() {
        StringBuilder q10 = o.q(this.f7510e + 1, (this.f7508c - this.f7511f) + 1, " at line ", " column ", " path ");
        q10.append(V(false));
        return q10.toString();
    }

    public final boolean Z() {
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        if (i7 == 5) {
            this.f7512u = 0;
            int[] iArr = this.f7504B;
            int i10 = this.f7517z - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (i7 != 6) {
            throw r0("a boolean");
        }
        this.f7512u = 0;
        int[] iArr2 = this.f7504B;
        int i11 = this.f7517z - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final double a0() {
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        if (i7 == 15) {
            this.f7512u = 0;
            int[] iArr = this.f7504B;
            int i10 = this.f7517z - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f7513v;
        }
        if (i7 == 16) {
            this.f7515x = new String(this.f7507b, this.f7508c, this.f7514w);
            this.f7508c += this.f7514w;
        } else if (i7 == 8 || i7 == 9) {
            this.f7515x = g0(i7 == 8 ? '\'' : '\"');
        } else if (i7 == 10) {
            this.f7515x = i0();
        } else if (i7 != 11) {
            throw r0("a double");
        }
        this.f7512u = 11;
        double parseDouble = Double.parseDouble(this.f7515x);
        if (this.f7505C != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            q0("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.f7515x = null;
        this.f7512u = 0;
        int[] iArr2 = this.f7504B;
        int i11 = this.f7517z - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return parseDouble;
    }

    public final int b0() {
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        if (i7 == 15) {
            long j = this.f7513v;
            int i10 = (int) j;
            if (j != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f7513v + Y());
            }
            this.f7512u = 0;
            int[] iArr = this.f7504B;
            int i11 = this.f7517z - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (i7 == 16) {
            this.f7515x = new String(this.f7507b, this.f7508c, this.f7514w);
            this.f7508c += this.f7514w;
        } else {
            if (i7 != 8 && i7 != 9 && i7 != 10) {
                throw r0("an int");
            }
            if (i7 == 10) {
                this.f7515x = i0();
            } else {
                this.f7515x = g0(i7 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f7515x);
                this.f7512u = 0;
                int[] iArr2 = this.f7504B;
                int i12 = this.f7517z - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f7512u = 11;
        double parseDouble = Double.parseDouble(this.f7515x);
        int i13 = (int) parseDouble;
        if (i13 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f7515x + Y());
        }
        this.f7515x = null;
        this.f7512u = 0;
        int[] iArr3 = this.f7504B;
        int i14 = this.f7517z - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return i13;
    }

    public final long c0() {
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        if (i7 == 15) {
            this.f7512u = 0;
            int[] iArr = this.f7504B;
            int i10 = this.f7517z - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f7513v;
        }
        if (i7 == 16) {
            this.f7515x = new String(this.f7507b, this.f7508c, this.f7514w);
            this.f7508c += this.f7514w;
        } else {
            if (i7 != 8 && i7 != 9 && i7 != 10) {
                throw r0("a long");
            }
            if (i7 == 10) {
                this.f7515x = i0();
            } else {
                this.f7515x = g0(i7 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f7515x);
                this.f7512u = 0;
                int[] iArr2 = this.f7504B;
                int i11 = this.f7517z - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f7512u = 11;
        double parseDouble = Double.parseDouble(this.f7515x);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f7515x + Y());
        }
        this.f7515x = null;
        this.f7512u = 0;
        int[] iArr3 = this.f7504B;
        int i12 = this.f7517z - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7512u = 0;
        this.f7516y[0] = 8;
        this.f7517z = 1;
        this.f7506a.close();
    }

    public final String d0() {
        String g02;
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        if (i7 == 14) {
            g02 = i0();
        } else if (i7 == 12) {
            g02 = g0('\'');
        } else {
            if (i7 != 13) {
                throw r0("a name");
            }
            g02 = g0('\"');
        }
        this.f7512u = 0;
        this.f7503A[this.f7517z - 1] = g02;
        return g02;
    }

    public final int e0(boolean z8) {
        int i7 = this.f7508c;
        int i10 = this.f7509d;
        while (true) {
            if (i7 == i10) {
                this.f7508c = i7;
                if (!U(1)) {
                    if (!z8) {
                        return -1;
                    }
                    throw new EOFException("End of input" + Y());
                }
                i7 = this.f7508c;
                i10 = this.f7509d;
            }
            int i11 = i7 + 1;
            char[] cArr = this.f7507b;
            char c10 = cArr[i7];
            if (c10 == '\n') {
                this.f7510e++;
                this.f7511f = i11;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f7508c = i11;
                    if (i11 == i10) {
                        this.f7508c = i7;
                        boolean U8 = U(2);
                        this.f7508c++;
                        if (!U8) {
                            return c10;
                        }
                    }
                    F();
                    int i12 = this.f7508c;
                    char c11 = cArr[i12];
                    if (c11 == '*') {
                        this.f7508c = i12 + 1;
                        while (true) {
                            if (this.f7508c + 2 > this.f7509d && !U(2)) {
                                q0("Unterminated comment");
                                throw null;
                            }
                            int i13 = this.f7508c;
                            if (cArr[i13] != '\n') {
                                for (int i14 = 0; i14 < 2; i14++) {
                                    if (cArr[this.f7508c + i14] != "*/".charAt(i14)) {
                                        break;
                                    }
                                }
                                i7 = this.f7508c + 2;
                                i10 = this.f7509d;
                                break;
                            }
                            this.f7510e++;
                            this.f7511f = i13 + 1;
                            this.f7508c++;
                        }
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f7508c = i12 + 1;
                        n0();
                        i7 = this.f7508c;
                        i10 = this.f7509d;
                    }
                } else {
                    if (c10 != '#') {
                        this.f7508c = i11;
                        return c10;
                    }
                    this.f7508c = i11;
                    F();
                    n0();
                    i7 = this.f7508c;
                    i10 = this.f7509d;
                }
            }
            i7 = i11;
        }
    }

    public final void f0() {
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        if (i7 != 7) {
            throw r0("null");
        }
        this.f7512u = 0;
        int[] iArr = this.f7504B;
        int i10 = this.f7517z - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r11.f7508c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r11.f7508c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String g0(char c10) {
        char[] cArr;
        int i7;
        StringBuilder sb2 = null;
        do {
            int i10 = this.f7508c;
            int i11 = this.f7509d;
            while (true) {
                int i12 = i11;
                int i13 = i10;
                while (true) {
                    cArr = this.f7507b;
                    if (i10 >= i12) {
                        break;
                    }
                    int i14 = i10 + 1;
                    char c11 = cArr[i10];
                    if (this.f7505C == 3 && c11 < ' ') {
                        q0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c11 == c10) {
                        this.f7508c = i14;
                        int i15 = (i14 - i13) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i13, i15);
                        }
                        sb2.append(cArr, i13, i15);
                        return sb2.toString();
                    }
                    if (c11 == '\\') {
                        break;
                    }
                    if (c11 == '\n') {
                        this.f7510e++;
                        this.f7511f = i14;
                    }
                    i10 = i14;
                }
                sb2.append(cArr, i13, i7);
                sb2.append(l0());
                i10 = this.f7508c;
                i11 = this.f7509d;
            }
        } while (U(1));
        q0("Unterminated string");
        throw null;
    }

    public final String h0() {
        String str;
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        if (i7 == 10) {
            str = i0();
        } else if (i7 == 8) {
            str = g0('\'');
        } else if (i7 == 9) {
            str = g0('\"');
        } else if (i7 == 11) {
            str = this.f7515x;
            this.f7515x = null;
        } else if (i7 == 15) {
            str = Long.toString(this.f7513v);
        } else {
            if (i7 != 16) {
                throw r0("a string");
            }
            str = new String(this.f7507b, this.f7508c, this.f7514w);
            this.f7508c += this.f7514w;
        }
        this.f7512u = 0;
        int[] iArr = this.f7504B;
        int i10 = this.f7517z - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        F();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String i0() {
        char[] cArr;
        String sb2;
        StringBuilder sb3 = null;
        int i7 = 0;
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f7508c;
                int i12 = i11 + i10;
                int i13 = this.f7509d;
                cArr = this.f7507b;
                if (i12 < i13) {
                    char c10 = cArr[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i10 >= cArr.length) {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i10, 16));
                    }
                    sb3.append(cArr, this.f7508c, i10);
                    this.f7508c += i10;
                } else if (U(i10 + 1)) {
                }
            }
            i7 = i10;
            if (sb3 != null) {
                sb2 = new String(cArr, this.f7508c, i7);
            } else {
                sb3.append(cArr, this.f7508c, i7);
                sb2 = sb3.toString();
            }
            this.f7508c += i7;
            return sb2;
        } while (U(1));
        if (sb3 != null) {
        }
        this.f7508c += i7;
        return sb2;
    }

    public final int j0() {
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        switch (i7) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void k0(int i7) {
        int i10 = this.f7517z;
        if (i10 - 1 >= 255) {
            throw new IOException("Nesting limit 255 reached" + Y());
        }
        int[] iArr = this.f7516y;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.f7516y = Arrays.copyOf(iArr, i11);
            this.f7504B = Arrays.copyOf(this.f7504B, i11);
            this.f7503A = (String[]) Arrays.copyOf(this.f7503A, i11);
        }
        int[] iArr2 = this.f7516y;
        int i12 = this.f7517z;
        this.f7517z = i12 + 1;
        iArr2[i12] = i7;
    }

    public final void l() {
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        if (i7 != 3) {
            throw r0("BEGIN_ARRAY");
        }
        k0(1);
        this.f7504B[this.f7517z - 1] = 0;
        this.f7512u = 0;
    }

    public final char l0() {
        int i7;
        if (this.f7508c == this.f7509d && !U(1)) {
            q0("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.f7508c;
        int i11 = i10 + 1;
        this.f7508c = i11;
        char[] cArr = this.f7507b;
        char c10 = cArr[i10];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
                        if (c10 == 'b') {
                            return '\b';
                        }
                        if (c10 == 'f') {
                            return '\f';
                        }
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 == 'r') {
                            return '\r';
                        }
                        if (c10 == 't') {
                            return '\t';
                        }
                        if (c10 != 'u') {
                            q0("Invalid escape sequence");
                            throw null;
                        }
                        if (i10 + 5 > this.f7509d && !U(4)) {
                            q0("Unterminated escape sequence");
                            throw null;
                        }
                        int i12 = this.f7508c;
                        int i13 = i12 + 4;
                        int i14 = 0;
                        while (i12 < i13) {
                            char c11 = cArr[i12];
                            int i15 = i14 << 4;
                            if (c11 >= '0' && c11 <= '9') {
                                i7 = c11 - '0';
                            } else if (c11 >= 'a' && c11 <= 'f') {
                                i7 = c11 - 'W';
                            } else {
                                if (c11 < 'A' || c11 > 'F') {
                                    q0("Malformed Unicode escape \\u".concat(new String(cArr, this.f7508c, 4)));
                                    throw null;
                                }
                                i7 = c11 - '7';
                            }
                            i14 = i7 + i15;
                            i12++;
                        }
                        this.f7508c += 4;
                        return (char) i14;
                    }
                }
            }
            return c10;
        }
        if (this.f7505C == 3) {
            q0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f7510e++;
        this.f7511f = i11;
        if (this.f7505C == 3) {
            q0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c10;
    }

    public final void m0(char c10) {
        do {
            int i7 = this.f7508c;
            int i10 = this.f7509d;
            while (i7 < i10) {
                int i11 = i7 + 1;
                char c11 = this.f7507b[i7];
                if (c11 == c10) {
                    this.f7508c = i11;
                    return;
                }
                if (c11 == '\\') {
                    this.f7508c = i11;
                    l0();
                    i7 = this.f7508c;
                    i10 = this.f7509d;
                } else {
                    if (c11 == '\n') {
                        this.f7510e++;
                        this.f7511f = i11;
                    }
                    i7 = i11;
                }
            }
            this.f7508c = i7;
        } while (U(1));
        q0("Unterminated string");
        throw null;
    }

    public final void n() {
        int i7 = this.f7512u;
        if (i7 == 0) {
            i7 = K();
        }
        if (i7 != 1) {
            throw r0("BEGIN_OBJECT");
        }
        k0(3);
        this.f7512u = 0;
    }

    public final void n0() {
        char c10;
        do {
            if (this.f7508c >= this.f7509d && !U(1)) {
                return;
            }
            int i7 = this.f7508c;
            int i10 = i7 + 1;
            this.f7508c = i10;
            c10 = this.f7507b[i7];
            if (c10 == '\n') {
                this.f7510e++;
                this.f7511f = i10;
                return;
            }
        } while (c10 != '\r');
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void o0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f7508c
            int r2 = r1 + r0
            int r3 = r4.f7509d
            if (r2 >= r3) goto L51
            char[] r2 = r4.f7507b
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.F()
        L4b:
            int r1 = r4.f7508c
            int r1 = r1 + r0
            r4.f7508c = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f7508c = r1
            r0 = 1
            boolean r0 = r4.U(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O8.a.o0():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public final void p0() {
        int i7 = 0;
        do {
            int i10 = this.f7512u;
            if (i10 == 0) {
                i10 = K();
            }
            switch (i10) {
                case 1:
                    k0(3);
                    i7++;
                    this.f7512u = 0;
                    break;
                case 2:
                    if (i7 == 0) {
                        this.f7503A[this.f7517z - 1] = null;
                    }
                    this.f7517z--;
                    i7--;
                    this.f7512u = 0;
                    break;
                case 3:
                    k0(1);
                    i7++;
                    this.f7512u = 0;
                    break;
                case 4:
                    this.f7517z--;
                    i7--;
                    this.f7512u = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                case 15:
                default:
                    this.f7512u = 0;
                    break;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    m0('\'');
                    this.f7512u = 0;
                    break;
                case 9:
                    m0('\"');
                    this.f7512u = 0;
                    break;
                case 10:
                    o0();
                    this.f7512u = 0;
                    break;
                case 12:
                    m0('\'');
                    if (i7 == 0) {
                        this.f7503A[this.f7517z - 1] = "<skipped>";
                    }
                    this.f7512u = 0;
                    break;
                case 13:
                    m0('\"');
                    if (i7 == 0) {
                        this.f7503A[this.f7517z - 1] = "<skipped>";
                    }
                    this.f7512u = 0;
                    break;
                case 14:
                    o0();
                    if (i7 == 0) {
                        this.f7503A[this.f7517z - 1] = "<skipped>";
                    }
                    this.f7512u = 0;
                    break;
                case 16:
                    this.f7508c += this.f7514w;
                    this.f7512u = 0;
                    break;
                case 17:
                    return;
            }
        } while (i7 > 0);
        int[] iArr = this.f7504B;
        int i11 = this.f7517z - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void q0(String str) {
        StringBuilder m10 = X.c.m(str);
        m10.append(Y());
        m10.append("\nSee ");
        m10.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new IOException(m10.toString());
    }

    public final IllegalStateException r0(String str) {
        String str2 = j0() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder n6 = X.c.n("Expected ", str, " but was ");
        n6.append(A3.c.t(j0()));
        n6.append(Y());
        n6.append("\nSee ");
        n6.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(n6.toString());
    }

    public final String toString() {
        return a.class.getSimpleName() + Y();
    }
}
