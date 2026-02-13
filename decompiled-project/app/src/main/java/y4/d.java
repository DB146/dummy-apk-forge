package y4;

import F.C0257a;
import N6.H;
import P1.g;
import android.util.Pair;
import android.util.SparseArray;
import b5.f;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import m4.AbstractC1571h;
import m4.C1586o0;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import n5.m;
import n5.v;
import o4.AbstractC1787a;
import o4.M;
import o5.C1806a;
import o5.C1807b;
import o7.o;
import r4.C1935g;
import r4.C1936h;
import s4.C1978f;
import s4.C1979g;
import s4.C1986n;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;
import s4.s;
import s4.u;
import s4.w;
import y.S;

/* loaded from: classes.dex */
public final class d implements InterfaceC1982j {

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f26901c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f26902d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f26903e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f26904f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final UUID f26905g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final Map f26906h0;

    /* renamed from: A, reason: collision with root package name */
    public long f26907A;

    /* renamed from: B, reason: collision with root package name */
    public long f26908B;

    /* renamed from: C, reason: collision with root package name */
    public m f26909C;

    /* renamed from: D, reason: collision with root package name */
    public m f26910D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f26911E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f26912F;

    /* renamed from: G, reason: collision with root package name */
    public int f26913G;

    /* renamed from: H, reason: collision with root package name */
    public long f26914H;

    /* renamed from: I, reason: collision with root package name */
    public long f26915I;

    /* renamed from: J, reason: collision with root package name */
    public int f26916J;

    /* renamed from: K, reason: collision with root package name */
    public int f26917K;
    public int[] L;

    /* renamed from: M, reason: collision with root package name */
    public int f26918M;

    /* renamed from: N, reason: collision with root package name */
    public int f26919N;

    /* renamed from: O, reason: collision with root package name */
    public int f26920O;

    /* renamed from: P, reason: collision with root package name */
    public int f26921P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f26922Q;

    /* renamed from: R, reason: collision with root package name */
    public long f26923R;

    /* renamed from: S, reason: collision with root package name */
    public int f26924S;

    /* renamed from: T, reason: collision with root package name */
    public int f26925T;

    /* renamed from: U, reason: collision with root package name */
    public int f26926U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f26927V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f26928W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f26929X;

    /* renamed from: Y, reason: collision with root package name */
    public int f26930Y;

    /* renamed from: Z, reason: collision with root package name */
    public byte f26931Z;

    /* renamed from: a, reason: collision with root package name */
    public final C2386b f26932a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f26933a0;

    /* renamed from: b, reason: collision with root package name */
    public final e f26934b;

    /* renamed from: b0, reason: collision with root package name */
    public InterfaceC1984l f26935b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f26936c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26937d;

    /* renamed from: e, reason: collision with root package name */
    public final v f26938e;

    /* renamed from: f, reason: collision with root package name */
    public final v f26939f;
    public final v g;

    /* renamed from: h, reason: collision with root package name */
    public final v f26940h;

    /* renamed from: i, reason: collision with root package name */
    public final v f26941i;
    public final v j;
    public final v k;

    /* renamed from: l, reason: collision with root package name */
    public final v f26942l;

    /* renamed from: m, reason: collision with root package name */
    public final v f26943m;

    /* renamed from: n, reason: collision with root package name */
    public final v f26944n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f26945o;

    /* renamed from: p, reason: collision with root package name */
    public long f26946p;

    /* renamed from: q, reason: collision with root package name */
    public long f26947q;

    /* renamed from: r, reason: collision with root package name */
    public long f26948r;

    /* renamed from: s, reason: collision with root package name */
    public long f26949s;

    /* renamed from: t, reason: collision with root package name */
    public long f26950t;

    /* renamed from: u, reason: collision with root package name */
    public C2387c f26951u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f26952v;

    /* renamed from: w, reason: collision with root package name */
    public int f26953w;

    /* renamed from: x, reason: collision with root package name */
    public long f26954x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f26955y;

    /* renamed from: z, reason: collision with root package name */
    public long f26956z;

    static {
        int i7 = D.f21141a;
        f26902d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(M6.e.f6799c);
        f26903e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f26904f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f26905g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        S.c(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        S.c(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f26906h0 = Collections.unmodifiableMap(hashMap);
    }

    public d(int i7) {
        C2386b c2386b = new C2386b();
        this.f26947q = -1L;
        this.f26948r = -9223372036854775807L;
        this.f26949s = -9223372036854775807L;
        this.f26950t = -9223372036854775807L;
        this.f26956z = -1L;
        this.f26907A = -1L;
        this.f26908B = -9223372036854775807L;
        this.f26932a = c2386b;
        c2386b.f26851d = new o(this, 17);
        this.f26937d = (i7 & 1) == 0;
        this.f26934b = new e();
        this.f26936c = new SparseArray();
        this.g = new v(4);
        this.f26940h = new v(ByteBuffer.allocate(4).putInt(-1).array());
        this.f26941i = new v(4);
        this.f26938e = new v(AbstractC1705a.f21155d);
        this.f26939f = new v(4);
        this.j = new v();
        this.k = new v();
        this.f26942l = new v(8);
        this.f26943m = new v();
        this.f26944n = new v();
        this.L = new int[1];
    }

    public static byte[] h(long j, long j10, String str) {
        AbstractC1705a.h(j != -9223372036854775807L);
        int i7 = (int) (j / 3600000000L);
        long j11 = j - (i7 * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        long j12 = j11 - (i10 * 60000000);
        int i11 = (int) (j12 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (i11 * 1000000)) / j10)));
        int i12 = D.f21141a;
        return format.getBytes(M6.e.f6799c);
    }

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        this.f26908B = -9223372036854775807L;
        this.f26913G = 0;
        C2386b c2386b = this.f26932a;
        c2386b.f26852e = 0;
        c2386b.f26849b.clear();
        e eVar = c2386b.f26850c;
        eVar.f26959b = 0;
        eVar.f26960c = 0;
        e eVar2 = this.f26934b;
        eVar2.f26959b = 0;
        eVar2.f26960c = 0;
        j();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f26936c;
            if (i7 >= sparseArray.size()) {
                return;
            }
            w wVar = ((C2387c) sparseArray.valueAt(i7)).f26872T;
            if (wVar != null) {
                wVar.f24094b = false;
                wVar.f24095c = 0;
            }
            i7++;
        }
    }

    public final void b(int i7) {
        if (this.f26909C == null || this.f26910D == null) {
            throw C1586o0.a("Element " + i7 + " must be in a Cues", null);
        }
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        A7.a aVar = new A7.a(11, false);
        C1979g c1979g = (C1979g) interfaceC1983k;
        long j = c1979g.f24054c;
        long j10 = 1024;
        if (j != -1 && j <= 1024) {
            j10 = j;
        }
        int i7 = (int) j10;
        v vVar = (v) aVar.f532b;
        c1979g.x(vVar.f21229a, 0, 4, false);
        aVar.f531a = 4;
        for (long w10 = vVar.w(); w10 != 440786851; w10 = ((w10 << 8) & (-256)) | (vVar.f21229a[0] & 255)) {
            int i10 = aVar.f531a + 1;
            aVar.f531a = i10;
            if (i10 == i7) {
                return false;
            }
            c1979g.x(vVar.f21229a, 0, 1, false);
        }
        long l10 = aVar.l(c1979g);
        long j11 = aVar.f531a;
        if (l10 == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j11 + l10 >= j) {
            return false;
        }
        while (true) {
            long j12 = aVar.f531a;
            long j13 = j11 + l10;
            if (j12 >= j13) {
                return j12 == j13;
            }
            if (aVar.l(c1979g) == Long.MIN_VALUE) {
                return false;
            }
            long l11 = aVar.l(c1979g);
            if (l11 < 0 || l11 > 2147483647L) {
                return false;
            }
            if (l11 != 0) {
                int i11 = (int) l11;
                c1979g.b(i11, false);
                aVar.f531a += i11;
            }
        }
    }

    public final void d(int i7) {
        if (this.f26951u != null) {
            return;
        }
        throw C1586o0.a("Element " + i7 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0a69, code lost:
    
        if (r1.p() == r11.getLeastSignificantBits()) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0dbb, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:260:0x0243. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:269:0x04a9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:272:0x069a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0cd3  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0ad7  */
    /* JADX WARN: Type inference failed for: r0v102, types: [y4.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v21, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v22, types: [s4.g] */
    @Override // s4.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        String str;
        String str2;
        String str3;
        String str4;
        ArrayDeque arrayDeque;
        String str5;
        d dVar;
        C0257a c0257a2;
        boolean z8;
        int i7;
        String str6;
        ?? r52;
        int b2;
        int a9;
        String str7;
        String str8;
        String str9;
        char c10;
        char c11;
        char c12;
        String str10;
        List singletonList;
        int i10;
        String str11;
        int i11;
        Exception exc;
        Pair pair;
        String str12;
        int i12;
        String str13;
        K k;
        boolean j;
        int i13;
        int i14;
        C1807b c1807b;
        byte[] bArr;
        int i15;
        String str14;
        C2387c c2387c;
        D9.a a10;
        List list;
        String str15;
        String str16;
        String str17;
        String str18;
        s c1986n;
        int i16;
        d dVar2 = this;
        String str19 = "A_MPEG/L2";
        String str20 = "A_VORBIS";
        String str21 = "A_TRUEHD";
        String str22 = "A_MS/ACM";
        String str23 = "V_MPEG4/ISO/SP";
        String str24 = "V_MPEG4/ISO/AP";
        String str25 = "A_OPUS";
        dVar2.f26912F = false;
        boolean z10 = true;
        while (z10 && !dVar2.f26912F) {
            C2386b c2386b = dVar2.f26932a;
            AbstractC1705a.n(c2386b.f26851d);
            while (true) {
                ArrayDeque arrayDeque2 = c2386b.f26849b;
                C2385a c2385a = (C2385a) arrayDeque2.peek();
                if (c2385a != null) {
                    arrayDeque = arrayDeque2;
                    if (((C1979g) interfaceC1983k).f24055d >= c2385a.f26847b) {
                        o oVar = c2386b.f26851d;
                        int i17 = ((C2385a) arrayDeque.pop()).f26846a;
                        d dVar3 = (d) oVar.f22101b;
                        AbstractC1705a.n(dVar3.f26935b0);
                        SparseArray sparseArray = dVar3.f26936c;
                        if (i17 == 160) {
                            str = str19;
                            str2 = str20;
                            str3 = str21;
                            str4 = str22;
                            str7 = str25;
                            if (dVar3.f26913G == 2) {
                                C2387c c2387c2 = (C2387c) sparseArray.get(dVar3.f26918M);
                                c2387c2.f26876X.getClass();
                                if (dVar3.f26923R > 0) {
                                    str5 = str7;
                                    if (str5.equals(c2387c2.f26879b)) {
                                        byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(dVar3.f26923R).array();
                                        v vVar = dVar3.f26944n;
                                        vVar.getClass();
                                        vVar.E(array.length, array);
                                    }
                                } else {
                                    str5 = str7;
                                }
                                int i18 = 0;
                                for (int i19 = 0; i19 < dVar3.f26917K; i19++) {
                                    i18 += dVar3.L[i19];
                                }
                                for (int i20 = 0; i20 < dVar3.f26917K; i20++) {
                                    long j10 = dVar3.f26914H + ((c2387c2.f26882e * i20) / 1000);
                                    int i21 = dVar3.f26920O;
                                    if (i20 == 0 && !dVar3.f26922Q) {
                                        i21 |= 1;
                                    }
                                    int i22 = dVar3.L[i20];
                                    i18 -= i22;
                                    dVar3.g(c2387c2, j10, i21, i22, i18);
                                }
                                dVar3.f26913G = 0;
                            }
                            str5 = str7;
                        } else if (i17 != 174) {
                            if (i17 == 19899) {
                                str15 = str21;
                                str16 = str22;
                                str17 = str23;
                                str18 = str24;
                                int i23 = dVar3.f26953w;
                                if (i23 != -1) {
                                    long j11 = dVar3.f26954x;
                                    if (j11 != -1) {
                                        if (i23 == 475249515) {
                                            dVar3.f26956z = j11;
                                        }
                                    }
                                }
                                throw C1586o0.a("Mandatory element SeekID or SeekPosition not found", null);
                            }
                            if (i17 == 25152) {
                                str15 = str21;
                                str16 = str22;
                                str17 = str23;
                                str18 = str24;
                                dVar3.d(i17);
                                C2387c c2387c3 = dVar3.f26951u;
                                if (c2387c3.f26884h) {
                                    u uVar = c2387c3.j;
                                    if (uVar == null) {
                                        throw C1586o0.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                    }
                                    c2387c3.f26886l = new C1936h(new C1935g(AbstractC1571h.f20382a, null, "video/webm", uVar.f24090b));
                                }
                            } else if (i17 == 28032) {
                                str15 = str21;
                                str16 = str22;
                                str17 = str23;
                                str18 = str24;
                                dVar3.d(i17);
                                C2387c c2387c4 = dVar3.f26951u;
                                if (c2387c4.f26884h && c2387c4.f26885i != null) {
                                    throw C1586o0.a("Combining encryption and compression is not supported", null);
                                }
                            } else if (i17 == 357149030) {
                                str15 = str21;
                                str16 = str22;
                                str17 = str23;
                                str18 = str24;
                                if (dVar3.f26948r == -9223372036854775807L) {
                                    dVar3.f26948r = 1000000L;
                                }
                                long j12 = dVar3.f26949s;
                                if (j12 != -9223372036854775807L) {
                                    dVar3.f26950t = dVar3.k(j12);
                                }
                            } else if (i17 == 374648427) {
                                str15 = str21;
                                str16 = str22;
                                str17 = str23;
                                str18 = str24;
                                if (sparseArray.size() == 0) {
                                    throw C1586o0.a("No valid tracks were found", null);
                                }
                                dVar3.f26935b0.f();
                            } else if (i17 != 475249515) {
                                str = str19;
                                str2 = str20;
                                str3 = str21;
                                str4 = str22;
                                str5 = str25;
                            } else {
                                if (dVar3.f26952v) {
                                    str15 = str21;
                                    str16 = str22;
                                    str17 = str23;
                                    str18 = str24;
                                } else {
                                    InterfaceC1984l interfaceC1984l = dVar3.f26935b0;
                                    m mVar = dVar3.f26909C;
                                    m mVar2 = dVar3.f26910D;
                                    if (dVar3.f26947q == -1 || dVar3.f26950t == -9223372036854775807L || mVar == null || (i16 = mVar.f21191b) == 0 || mVar2 == null || mVar2.f21191b != i16) {
                                        str15 = str21;
                                        str16 = str22;
                                        str17 = str23;
                                        str18 = str24;
                                        c1986n = new C1986n(dVar3.f26950t);
                                    } else {
                                        int[] iArr = new int[i16];
                                        long[] jArr = new long[i16];
                                        long[] jArr2 = new long[i16];
                                        str18 = str24;
                                        long[] jArr3 = new long[i16];
                                        str17 = str23;
                                        int i24 = 0;
                                        while (i24 < i16) {
                                            jArr3[i24] = mVar.c(i24);
                                            jArr[i24] = mVar2.c(i24) + dVar3.f26947q;
                                            i24++;
                                            str21 = str21;
                                            str22 = str22;
                                        }
                                        str15 = str21;
                                        str16 = str22;
                                        int i25 = 0;
                                        while (true) {
                                            int i26 = i16 - 1;
                                            if (i25 < i26) {
                                                int i27 = i25 + 1;
                                                iArr[i25] = (int) (jArr[i27] - jArr[i25]);
                                                jArr2[i25] = jArr3[i27] - jArr3[i25];
                                                i25 = i27;
                                            } else {
                                                iArr[i26] = (int) ((dVar3.f26947q + dVar3.f26946p) - jArr[i26]);
                                                long j13 = dVar3.f26950t - jArr3[i26];
                                                jArr2[i26] = j13;
                                                if (j13 <= 0) {
                                                    AbstractC1705a.S("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j13);
                                                    iArr = Arrays.copyOf(iArr, i26);
                                                    jArr = Arrays.copyOf(jArr, i26);
                                                    jArr2 = Arrays.copyOf(jArr2, i26);
                                                    jArr3 = Arrays.copyOf(jArr3, i26);
                                                }
                                                c1986n = new C1978f(iArr, jArr, jArr2, jArr3);
                                            }
                                        }
                                    }
                                    interfaceC1984l.i(c1986n);
                                    dVar3.f26952v = true;
                                }
                                dVar3.f26909C = null;
                                dVar3.f26910D = null;
                            }
                            str24 = str18;
                            str23 = str17;
                            str4 = str16;
                            str = str19;
                            str3 = str15;
                            str2 = str20;
                            str5 = str25;
                        } else {
                            String str26 = str21;
                            String str27 = str22;
                            String str28 = str23;
                            String str29 = str24;
                            ?? r02 = dVar3.f26951u;
                            AbstractC1705a.n(r02);
                            String str30 = r02.f26879b;
                            if (str30 == null) {
                                throw C1586o0.a("CodecId is missing in TrackEntry element", null);
                            }
                            switch (str30.hashCode()) {
                                case -2095576542:
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    if (str30.equals(str24)) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -2095575984:
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    if (str30.equals(str23)) {
                                        str24 = str29;
                                        c10 = 1;
                                        break;
                                    } else {
                                        str24 = str29;
                                        c10 = 65535;
                                        break;
                                    }
                                case -1985379776:
                                    str8 = str26;
                                    str9 = str27;
                                    str24 = str29;
                                    if (str30.equals(str9)) {
                                        str23 = str28;
                                        c10 = 2;
                                        break;
                                    } else {
                                        str23 = str28;
                                        c10 = 65535;
                                        break;
                                    }
                                case -1784763192:
                                    str8 = str26;
                                    str24 = str29;
                                    str23 = str28;
                                    if (str30.equals(str8)) {
                                        str9 = str27;
                                        c10 = 3;
                                        break;
                                    }
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case -1730367663:
                                    if (str30.equals(str20)) {
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        c10 = 4;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case -1482641358:
                                    if (str30.equals(str19)) {
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        c10 = 5;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case -1482641357:
                                    if (str30.equals("A_MPEG/L3")) {
                                        c11 = 6;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case -1373388978:
                                    if (str30.equals("V_MS/VFW/FOURCC")) {
                                        c11 = 7;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case -933872740:
                                    if (str30.equals("S_DVBSUB")) {
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        c10 = '\b';
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case -538363189:
                                    if (str30.equals("V_MPEG4/ISO/ASP")) {
                                        c11 = '\t';
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case -538363109:
                                    if (str30.equals("V_MPEG4/ISO/AVC")) {
                                        c11 = '\n';
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case -425012669:
                                    if (str30.equals("S_VOBSUB")) {
                                        c11 = 11;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case -356037306:
                                    if (str30.equals("A_DTS/LOSSLESS")) {
                                        c11 = '\f';
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 62923557:
                                    if (str30.equals("A_AAC")) {
                                        c11 = '\r';
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 62923603:
                                    if (str30.equals("A_AC3")) {
                                        c11 = 14;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 62927045:
                                    if (str30.equals("A_DTS")) {
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        c10 = 15;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 82318131:
                                    if (str30.equals("V_AV1")) {
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        c10 = 16;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 82338133:
                                    if (str30.equals("V_VP8")) {
                                        c11 = 17;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 82338134:
                                    if (str30.equals("V_VP9")) {
                                        c11 = 18;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 99146302:
                                    if (str30.equals("S_HDMV/PGS")) {
                                        c11 = 19;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 444813526:
                                    if (str30.equals("V_THEORA")) {
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        c10 = 20;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 542569478:
                                    if (str30.equals("A_DTS/EXPRESS")) {
                                        c11 = 21;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 635596514:
                                    if (str30.equals("A_PCM/FLOAT/IEEE")) {
                                        c11 = 22;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 725948237:
                                    if (str30.equals("A_PCM/INT/BIG")) {
                                        c11 = 23;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 725957860:
                                    if (str30.equals("A_PCM/INT/LIT")) {
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        c10 = 24;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 738597099:
                                    if (str30.equals("S_TEXT/ASS")) {
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        c10 = 25;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 855502857:
                                    if (str30.equals("V_MPEGH/ISO/HEVC")) {
                                        c11 = 26;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 1045209816:
                                    if (str30.equals("S_TEXT/WEBVTT")) {
                                        c11 = 27;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 1422270023:
                                    if (str30.equals("S_TEXT/UTF8")) {
                                        c11 = 28;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 1809237540:
                                    if (str30.equals("V_MPEG2")) {
                                        c11 = 29;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 1950749482:
                                    if (str30.equals("A_EAC3")) {
                                        c11 = 30;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 1950789798:
                                    if (str30.equals("A_FLAC")) {
                                        c11 = 31;
                                        c10 = c11;
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                case 1951062397:
                                    if (str30.equals(str25)) {
                                        str24 = str29;
                                        str23 = str28;
                                        str8 = str26;
                                        str9 = str27;
                                        c10 = ' ';
                                        break;
                                    }
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                                default:
                                    str24 = str29;
                                    str23 = str28;
                                    str8 = str26;
                                    str9 = str27;
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case g.BYTES_FIELD_NUMBER /* 8 */:
                                case '\t':
                                case '\n':
                                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                case '\f':
                                case '\r':
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case ' ':
                                    InterfaceC1984l interfaceC1984l2 = dVar3.f26935b0;
                                    int i28 = r02.f26880c;
                                    String str31 = "video/x-unknown";
                                    switch (str30.hashCode()) {
                                        case -2095576542:
                                            str7 = str25;
                                            if (str30.equals(str24)) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -2095575984:
                                            str7 = str25;
                                            if (str30.equals(str23)) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1985379776:
                                            str7 = str25;
                                            if (str30.equals(str9)) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1784763192:
                                            str7 = str25;
                                            if (str30.equals(str8)) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1730367663:
                                            str7 = str25;
                                            if (str30.equals(str20)) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1482641358:
                                            str7 = str25;
                                            if (str30.equals(str19)) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1482641357:
                                            str7 = str25;
                                            if (str30.equals("A_MPEG/L3")) {
                                                c12 = 6;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1373388978:
                                            str7 = str25;
                                            if (str30.equals("V_MS/VFW/FOURCC")) {
                                                c12 = 7;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -933872740:
                                            str7 = str25;
                                            if (str30.equals("S_DVBSUB")) {
                                                c12 = '\b';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -538363189:
                                            str7 = str25;
                                            if (str30.equals("V_MPEG4/ISO/ASP")) {
                                                c12 = '\t';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -538363109:
                                            str7 = str25;
                                            if (str30.equals("V_MPEG4/ISO/AVC")) {
                                                c12 = '\n';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -425012669:
                                            str7 = str25;
                                            if (str30.equals("S_VOBSUB")) {
                                                c12 = 11;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -356037306:
                                            str7 = str25;
                                            if (str30.equals("A_DTS/LOSSLESS")) {
                                                c12 = '\f';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 62923557:
                                            str7 = str25;
                                            if (str30.equals("A_AAC")) {
                                                c12 = '\r';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 62923603:
                                            str7 = str25;
                                            if (str30.equals("A_AC3")) {
                                                c12 = 14;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 62927045:
                                            str7 = str25;
                                            if (str30.equals("A_DTS")) {
                                                c12 = 15;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 82318131:
                                            str7 = str25;
                                            if (str30.equals("V_AV1")) {
                                                c12 = 16;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 82338133:
                                            str7 = str25;
                                            if (str30.equals("V_VP8")) {
                                                c12 = 17;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 82338134:
                                            str7 = str25;
                                            if (str30.equals("V_VP9")) {
                                                c12 = 18;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 99146302:
                                            str7 = str25;
                                            if (str30.equals("S_HDMV/PGS")) {
                                                c12 = 19;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 444813526:
                                            str7 = str25;
                                            if (str30.equals("V_THEORA")) {
                                                c12 = 20;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 542569478:
                                            str7 = str25;
                                            if (str30.equals("A_DTS/EXPRESS")) {
                                                c12 = 21;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 635596514:
                                            str7 = str25;
                                            if (str30.equals("A_PCM/FLOAT/IEEE")) {
                                                c12 = 22;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 725948237:
                                            str7 = str25;
                                            if (str30.equals("A_PCM/INT/BIG")) {
                                                c12 = 23;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 725957860:
                                            str7 = str25;
                                            if (str30.equals("A_PCM/INT/LIT")) {
                                                c12 = 24;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 738597099:
                                            str7 = str25;
                                            if (str30.equals("S_TEXT/ASS")) {
                                                c12 = 25;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 855502857:
                                            str7 = str25;
                                            if (str30.equals("V_MPEGH/ISO/HEVC")) {
                                                c12 = 26;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1045209816:
                                            str7 = str25;
                                            if (str30.equals("S_TEXT/WEBVTT")) {
                                                c12 = 27;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1422270023:
                                            str7 = str25;
                                            if (str30.equals("S_TEXT/UTF8")) {
                                                c12 = 28;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1809237540:
                                            str7 = str25;
                                            if (str30.equals("V_MPEG2")) {
                                                c12 = 29;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1950749482:
                                            str7 = str25;
                                            if (str30.equals("A_EAC3")) {
                                                c12 = 30;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1950789798:
                                            str7 = str25;
                                            if (str30.equals("A_FLAC")) {
                                                c12 = 31;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1951062397:
                                            if (str30.equals(str25)) {
                                                str7 = str25;
                                                c12 = ' ';
                                                break;
                                            }
                                        default:
                                            str7 = str25;
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                        case 1:
                                        case '\t':
                                            str = str19;
                                            str10 = "text/x-ssa";
                                            byte[] bArr2 = r02.k;
                                            str31 = "video/mp4v-es";
                                            singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                                            i10 = -1;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null && (a10 = D9.a.a(new v(r02.f26866N))) != null) {
                                                str11 = a10.f3289a;
                                                str31 = "video/dolby-vision";
                                            }
                                            int i29 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map = f26906h0;
                                            if (j) {
                                                k.f19996x = r02.f26867O;
                                                k.f19997y = r02.f26869Q;
                                                k.f19998z = i10;
                                                str3 = str8;
                                                str4 = str9;
                                                i13 = 1;
                                            } else if (n5.o.l(str31)) {
                                                if (r02.f26891q == 0) {
                                                    int i30 = r02.f26889o;
                                                    i14 = -1;
                                                    if (i30 == -1) {
                                                        i30 = r02.f26887m;
                                                    }
                                                    r02.f26889o = i30;
                                                    int i31 = r02.f26890p;
                                                    if (i31 == -1) {
                                                        i31 = r02.f26888n;
                                                    }
                                                    r02.f26890p = i31;
                                                } else {
                                                    i14 = -1;
                                                }
                                                float f4 = (r02.f26889o == i14 || (i15 = r02.f26890p) == i14) ? -1.0f : (r02.f26888n * r1) / (r02.f26887m * i15);
                                                if (r02.f26898x) {
                                                    if (r02.f26857D == -1.0f || r02.f26858E == -1.0f || r02.f26859F == -1.0f || r02.f26860G == -1.0f || r02.f26861H == -1.0f || r02.f26862I == -1.0f || r02.f26863J == -1.0f || r02.f26864K == -1.0f || r02.L == -1.0f || r02.f26865M == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = new byte[25];
                                                        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                                        order.put((byte) 0);
                                                        order.putShort((short) ((r02.f26857D * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r02.f26858E * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r02.f26859F * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r02.f26860G * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r02.f26861H * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r02.f26862I * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r02.f26863J * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r02.f26864K * 50000.0f) + 0.5f));
                                                        order.putShort((short) (r02.L + 0.5f));
                                                        order.putShort((short) (r02.f26865M + 0.5f));
                                                        order.putShort((short) r02.f26855B);
                                                        order.putShort((short) r02.f26856C);
                                                    }
                                                    str3 = str8;
                                                    str4 = str9;
                                                    c1807b = new C1807b(r02.f26899y, bArr, r02.f26854A, r02.f26900z);
                                                } else {
                                                    str3 = str8;
                                                    str4 = str9;
                                                    c1807b = null;
                                                }
                                                String str32 = r02.f26878a;
                                                int intValue = (str32 == null || !map.containsKey(str32)) ? -1 : ((Integer) map.get(r02.f26878a)).intValue();
                                                if (r02.f26892r == 0 && Float.compare(r02.f26893s, 0.0f) == 0 && Float.compare(r02.f26894t, 0.0f) == 0) {
                                                    if (Float.compare(r02.f26895u, 0.0f) == 0) {
                                                        intValue = 0;
                                                    } else if (Float.compare(r02.f26894t, 90.0f) == 0) {
                                                        intValue = 90;
                                                    } else if (Float.compare(r02.f26894t, -180.0f) == 0 || Float.compare(r02.f26894t, 180.0f) == 0) {
                                                        intValue = 180;
                                                    } else if (Float.compare(r02.f26894t, -90.0f) == 0) {
                                                        intValue = 270;
                                                    }
                                                }
                                                k.f19988p = r02.f26887m;
                                                k.f19989q = r02.f26888n;
                                                k.f19992t = f4;
                                                k.f19991s = intValue;
                                                k.f19993u = r02.f26896v;
                                                k.f19994v = r02.f26897w;
                                                k.f19995w = c1807b;
                                                i13 = 2;
                                            } else {
                                                str3 = str8;
                                                str4 = str9;
                                                if (!"application/x-subrip".equals(str31) && !str10.equals(str31) && !"text/vtt".equals(str31) && !"application/vobsub".equals(str31) && !"application/pgs".equals(str31) && !"application/dvbsubs".equals(str31)) {
                                                    throw C1586o0.a("Unexpected MIME type.", null);
                                                }
                                                i13 = 3;
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null && !map.containsKey(str14)) {
                                                k.f19977b = r02.f26878a;
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i29;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l10 = new L(k);
                                            s4.v u3 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u3;
                                            u3.a(l10);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 2:
                                            str = str19;
                                            str10 = "text/x-ssa";
                                            v vVar2 = new v(r02.a(r02.f26879b));
                                            try {
                                                int o10 = vVar2.o();
                                                if (o10 != 1) {
                                                    if (o10 == 65534) {
                                                        vVar2.G(24);
                                                        long p10 = vVar2.p();
                                                        UUID uuid = f26905g0;
                                                        if (p10 == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    AbstractC1705a.S("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str31 = "audio/x-unknown";
                                                    i10 = -1;
                                                    singletonList = null;
                                                    str11 = null;
                                                    i11 = -1;
                                                    if (r02.f26866N != null) {
                                                        str11 = a10.f3289a;
                                                        str31 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i292 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                                    k = new K();
                                                    j = n5.o.j(str31);
                                                    str2 = str20;
                                                    Map map2 = f26906h0;
                                                    if (j) {
                                                    }
                                                    str14 = r02.f26878a;
                                                    if (str14 != null) {
                                                        k.f19977b = r02.f26878a;
                                                        break;
                                                    }
                                                    k.f19976a = Integer.toString(i28);
                                                    k.k = str31;
                                                    k.f19984l = i11;
                                                    k.f19978c = r02.f26875W;
                                                    k.f19979d = i292;
                                                    k.f19985m = singletonList;
                                                    k.f19982h = str11;
                                                    k.f19986n = r02.f26886l;
                                                    L l102 = new L(k);
                                                    s4.v u32 = interfaceC1984l2.u(r02.f26880c, i13);
                                                    r02.f26876X = u32;
                                                    u32.a(l102);
                                                    sparseArray.put(r02.f26880c, r02);
                                                    dVar3 = dVar3;
                                                    c2387c = null;
                                                    break;
                                                }
                                                i10 = D.y(r02.f26868P);
                                                if (i10 == 0) {
                                                    AbstractC1705a.S("MatroskaExtractor", "Unsupported PCM bit depth: " + r02.f26868P + ". Setting mimeType to audio/x-unknown");
                                                    str31 = "audio/x-unknown";
                                                    i10 = -1;
                                                    singletonList = null;
                                                    str11 = null;
                                                    i11 = -1;
                                                    if (r02.f26866N != null) {
                                                    }
                                                    int i2922 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                                    k = new K();
                                                    j = n5.o.j(str31);
                                                    str2 = str20;
                                                    Map map22 = f26906h0;
                                                    if (j) {
                                                    }
                                                    str14 = r02.f26878a;
                                                    if (str14 != null) {
                                                    }
                                                    k.f19976a = Integer.toString(i28);
                                                    k.k = str31;
                                                    k.f19984l = i11;
                                                    k.f19978c = r02.f26875W;
                                                    k.f19979d = i2922;
                                                    k.f19985m = singletonList;
                                                    k.f19982h = str11;
                                                    k.f19986n = r02.f26886l;
                                                    L l1022 = new L(k);
                                                    s4.v u322 = interfaceC1984l2.u(r02.f26880c, i13);
                                                    r02.f26876X = u322;
                                                    u322.a(l1022);
                                                    sparseArray.put(r02.f26880c, r02);
                                                    dVar3 = dVar3;
                                                    c2387c = null;
                                                } else {
                                                    str31 = "audio/raw";
                                                    singletonList = null;
                                                    str11 = null;
                                                    i11 = -1;
                                                    if (r02.f26866N != null) {
                                                    }
                                                    int i29222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                                    k = new K();
                                                    j = n5.o.j(str31);
                                                    str2 = str20;
                                                    Map map222 = f26906h0;
                                                    if (j) {
                                                    }
                                                    str14 = r02.f26878a;
                                                    if (str14 != null) {
                                                    }
                                                    k.f19976a = Integer.toString(i28);
                                                    k.k = str31;
                                                    k.f19984l = i11;
                                                    k.f19978c = r02.f26875W;
                                                    k.f19979d = i29222;
                                                    k.f19985m = singletonList;
                                                    k.f19982h = str11;
                                                    k.f19986n = r02.f26886l;
                                                    L l10222 = new L(k);
                                                    s4.v u3222 = interfaceC1984l2.u(r02.f26880c, i13);
                                                    r02.f26876X = u3222;
                                                    u3222.a(l10222);
                                                    sparseArray.put(r02.f26880c, r02);
                                                    dVar3 = dVar3;
                                                    c2387c = null;
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw C1586o0.a("Error parsing MS/ACM codec private", null);
                                            }
                                            break;
                                        case 3:
                                            str = str19;
                                            str10 = "text/x-ssa";
                                            r02.f26872T = new w();
                                            str31 = "audio/true-hd";
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i292222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map2222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i292222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l102222 = new L(k);
                                            s4.v u32222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u32222;
                                            u32222.a(l102222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 4:
                                            str10 = "text/x-ssa";
                                            byte[] a11 = r02.a(str30);
                                            try {
                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                r02 = 0;
                                            }
                                            try {
                                                if (a11[0] != 2) {
                                                    throw C1586o0.a("Error parsing vorbis codec private", null);
                                                }
                                                int i32 = 0;
                                                int i33 = 1;
                                                while (true) {
                                                    int i34 = a11[i33] & 255;
                                                    if (i34 != 255) {
                                                        int i35 = i33 + 1;
                                                        int i36 = i32 + i34;
                                                        int i37 = 0;
                                                        while (true) {
                                                            str = str19;
                                                            int i38 = a11[i35] & 255;
                                                            if (i38 != 255) {
                                                                int i39 = i35 + 1;
                                                                int i40 = i37 + i38;
                                                                if (a11[i39] != 1) {
                                                                    throw C1586o0.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr3 = new byte[i36];
                                                                System.arraycopy(a11, i39, bArr3, 0, i36);
                                                                int i41 = i39 + i36;
                                                                if (a11[i41] != 3) {
                                                                    throw C1586o0.a("Error parsing vorbis codec private", null);
                                                                }
                                                                int i42 = i41 + i40;
                                                                if (a11[i42] != 5) {
                                                                    throw C1586o0.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr4 = new byte[a11.length - i42];
                                                                System.arraycopy(a11, i42, bArr4, 0, a11.length - i42);
                                                                ArrayList arrayList = new ArrayList(2);
                                                                arrayList.add(bArr3);
                                                                arrayList.add(bArr4);
                                                                str31 = "audio/vorbis";
                                                                singletonList = arrayList;
                                                                i11 = 8192;
                                                                i10 = -1;
                                                                str11 = null;
                                                                if (r02.f26866N != null) {
                                                                }
                                                                int i2922222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                                                k = new K();
                                                                j = n5.o.j(str31);
                                                                str2 = str20;
                                                                Map map22222 = f26906h0;
                                                                if (j) {
                                                                }
                                                                str14 = r02.f26878a;
                                                                if (str14 != null) {
                                                                }
                                                                k.f19976a = Integer.toString(i28);
                                                                k.k = str31;
                                                                k.f19984l = i11;
                                                                k.f19978c = r02.f26875W;
                                                                k.f19979d = i2922222;
                                                                k.f19985m = singletonList;
                                                                k.f19982h = str11;
                                                                k.f19986n = r02.f26886l;
                                                                L l1022222 = new L(k);
                                                                s4.v u322222 = interfaceC1984l2.u(r02.f26880c, i13);
                                                                r02.f26876X = u322222;
                                                                u322222.a(l1022222);
                                                                sparseArray.put(r02.f26880c, r02);
                                                                dVar3 = dVar3;
                                                                c2387c = null;
                                                                break;
                                                            } else {
                                                                i37 += 255;
                                                                i35++;
                                                                str19 = str;
                                                            }
                                                        }
                                                    } else {
                                                        i32 += 255;
                                                        i33++;
                                                    }
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                throw C1586o0.a("Error parsing vorbis codec private", r02);
                                            }
                                            break;
                                        case 5:
                                            str10 = "text/x-ssa";
                                            str31 = "audio/mpeg-L2";
                                            str = str19;
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = 4096;
                                            if (r02.f26866N != null) {
                                            }
                                            int i29222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i29222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l10222222 = new L(k);
                                            s4.v u3222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u3222222;
                                            u3222222.a(l10222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 6:
                                            str10 = "text/x-ssa";
                                            str31 = "audio/mpeg";
                                            str = str19;
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = 4096;
                                            if (r02.f26866N != null) {
                                            }
                                            int i292222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map2222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i292222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l102222222 = new L(k);
                                            s4.v u32222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u32222222;
                                            u32222222.a(l102222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 7:
                                            str10 = "text/x-ssa";
                                            v vVar3 = new v(r02.a(r02.f26879b));
                                            try {
                                                vVar3.H(16);
                                                long m10 = vVar3.m();
                                                if (m10 == 1482049860) {
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        exc = null;
                                                        throw C1586o0.a("Error parsing FourCC private data", exc);
                                                    }
                                                } else if (m10 != 859189832) {
                                                    if (m10 == 826496599) {
                                                        int i43 = vVar3.f21230b + 20;
                                                        byte[] bArr5 = vVar3.f21229a;
                                                        while (i43 < bArr5.length - 4) {
                                                            if (bArr5[i43] == 0) {
                                                                i12 = 1;
                                                                if (bArr5[i43 + 1] != 0 || bArr5[i43 + 2] != 1) {
                                                                    i43 += i12;
                                                                } else if (bArr5[i43 + 3] == 15) {
                                                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr5, i43, bArr5.length)));
                                                                    str12 = null;
                                                                }
                                                            }
                                                            i12 = 1;
                                                            i43 += i12;
                                                        }
                                                        try {
                                                            throw C1586o0.a("Failed to find FourCC VC1 initialization data", null);
                                                        } catch (ArrayIndexOutOfBoundsException unused5) {
                                                            exc = null;
                                                            throw C1586o0.a("Error parsing FourCC private data", exc);
                                                        }
                                                    }
                                                    AbstractC1705a.S("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str12 = null;
                                                    pair = new Pair("video/x-unknown", null);
                                                    str31 = (String) pair.first;
                                                    str = str19;
                                                    str11 = str12;
                                                    singletonList = (List) pair.second;
                                                    i10 = -1;
                                                    i11 = -1;
                                                    if (r02.f26866N != null) {
                                                    }
                                                    int i2922222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                                    k = new K();
                                                    j = n5.o.j(str31);
                                                    str2 = str20;
                                                    Map map22222222 = f26906h0;
                                                    if (j) {
                                                    }
                                                    str14 = r02.f26878a;
                                                    if (str14 != null) {
                                                    }
                                                    k.f19976a = Integer.toString(i28);
                                                    k.k = str31;
                                                    k.f19984l = i11;
                                                    k.f19978c = r02.f26875W;
                                                    k.f19979d = i2922222222;
                                                    k.f19985m = singletonList;
                                                    k.f19982h = str11;
                                                    k.f19986n = r02.f26886l;
                                                    L l1022222222 = new L(k);
                                                    s4.v u322222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                                    r02.f26876X = u322222222;
                                                    u322222222.a(l1022222222);
                                                    sparseArray.put(r02.f26880c, r02);
                                                    dVar3 = dVar3;
                                                    c2387c = null;
                                                    break;
                                                } else {
                                                    pair = new Pair("video/3gpp", null);
                                                }
                                                str12 = null;
                                                str31 = (String) pair.first;
                                                str = str19;
                                                str11 = str12;
                                                singletonList = (List) pair.second;
                                                i10 = -1;
                                                i11 = -1;
                                                if (r02.f26866N != null) {
                                                }
                                                int i29222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                                k = new K();
                                                j = n5.o.j(str31);
                                                str2 = str20;
                                                Map map222222222 = f26906h0;
                                                if (j) {
                                                }
                                                str14 = r02.f26878a;
                                                if (str14 != null) {
                                                }
                                                k.f19976a = Integer.toString(i28);
                                                k.k = str31;
                                                k.f19984l = i11;
                                                k.f19978c = r02.f26875W;
                                                k.f19979d = i29222222222;
                                                k.f19985m = singletonList;
                                                k.f19982h = str11;
                                                k.f19986n = r02.f26886l;
                                                L l10222222222 = new L(k);
                                                s4.v u3222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                                r02.f26876X = u3222222222;
                                                u3222222222.a(l10222222222);
                                                sparseArray.put(r02.f26880c, r02);
                                                dVar3 = dVar3;
                                                c2387c = null;
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                exc = null;
                                            }
                                            break;
                                        case g.BYTES_FIELD_NUMBER /* 8 */:
                                            str10 = "text/x-ssa";
                                            byte[] bArr6 = new byte[4];
                                            System.arraycopy(r02.a(str30), 0, bArr6, 0, 4);
                                            singletonList = H.K(bArr6);
                                            str = str19;
                                            str31 = "application/dvbsubs";
                                            i10 = -1;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i292222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map2222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i292222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l102222222222 = new L(k);
                                            s4.v u32222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u32222222222;
                                            u32222222222.a(l102222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case '\n':
                                            str10 = "text/x-ssa";
                                            C1806a a12 = C1806a.a(new v(r02.a(r02.f26879b)));
                                            r02.f26877Y = a12.f21928b;
                                            singletonList = a12.f21927a;
                                            str31 = "video/avc";
                                            str13 = a12.f21934i;
                                            str11 = str13;
                                            str = str19;
                                            i10 = -1;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i2922222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map22222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i2922222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l1022222222222 = new L(k);
                                            s4.v u322222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u322222222222;
                                            u322222222222.a(l1022222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                            str10 = "text/x-ssa";
                                            singletonList = H.K(r02.a(str30));
                                            str = str19;
                                            str31 = "application/vobsub";
                                            i10 = -1;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i29222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i29222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l10222222222222 = new L(k);
                                            s4.v u3222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u3222222222222;
                                            u3222222222222.a(l10222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case '\f':
                                            str10 = "text/x-ssa";
                                            str31 = "audio/vnd.dts.hd";
                                            str = str19;
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i292222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map2222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i292222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l102222222222222 = new L(k);
                                            s4.v u32222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u32222222222222;
                                            u32222222222222.a(l102222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case '\r':
                                            str10 = "text/x-ssa";
                                            List singletonList2 = Collections.singletonList(r02.a(str30));
                                            byte[] bArr7 = r02.k;
                                            M k7 = AbstractC1787a.k(new f(bArr7, bArr7.length), false);
                                            r02.f26869Q = k7.f21766a;
                                            r02.f26867O = k7.f21767b;
                                            str31 = "audio/mp4a-latm";
                                            str = str19;
                                            str11 = (String) k7.f21768c;
                                            i11 = -1;
                                            list = singletonList2;
                                            singletonList = list;
                                            i10 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i2922222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map22222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i2922222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l1022222222222222 = new L(k);
                                            s4.v u322222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u322222222222222;
                                            u322222222222222.a(l1022222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 14:
                                            str10 = "text/x-ssa";
                                            str31 = "audio/ac3";
                                            str = str19;
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i29222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i29222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l10222222222222222 = new L(k);
                                            s4.v u3222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u3222222222222222;
                                            u3222222222222222.a(l10222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 15:
                                        case 21:
                                            str10 = "text/x-ssa";
                                            str31 = "audio/vnd.dts";
                                            str = str19;
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i292222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map2222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i292222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l102222222222222222 = new L(k);
                                            s4.v u32222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u32222222222222222;
                                            u32222222222222222.a(l102222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 16:
                                            str10 = "text/x-ssa";
                                            str31 = "video/av01";
                                            str = str19;
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i2922222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map22222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i2922222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l1022222222222222222 = new L(k);
                                            s4.v u322222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u322222222222222222;
                                            u322222222222222222.a(l1022222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 17:
                                            str10 = "text/x-ssa";
                                            str31 = "video/x-vnd.on2.vp8";
                                            str = str19;
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i29222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i29222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l10222222222222222222 = new L(k);
                                            s4.v u3222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u3222222222222222222;
                                            u3222222222222222222.a(l10222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 18:
                                            str10 = "text/x-ssa";
                                            str31 = "video/x-vnd.on2.vp9";
                                            str = str19;
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i292222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map2222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i292222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l102222222222222222222 = new L(k);
                                            s4.v u32222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u32222222222222222222;
                                            u32222222222222222222.a(l102222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 19:
                                            str10 = "text/x-ssa";
                                            str = str19;
                                            str31 = "application/pgs";
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i2922222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map22222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i2922222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l1022222222222222222222 = new L(k);
                                            s4.v u322222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u322222222222222222222;
                                            u322222222222222222222.a(l1022222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 20:
                                            str10 = "text/x-ssa";
                                            str = str19;
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i29222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map222222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i29222222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l10222222222222222222222 = new L(k);
                                            s4.v u3222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u3222222222222222222222;
                                            u3222222222222222222222.a(l10222222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 22:
                                            str10 = "text/x-ssa";
                                            if (r02.f26868P == 32) {
                                                str = str19;
                                                str31 = "audio/raw";
                                                i10 = 4;
                                                singletonList = null;
                                                str11 = null;
                                                i11 = -1;
                                                if (r02.f26866N != null) {
                                                }
                                                int i292222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                                k = new K();
                                                j = n5.o.j(str31);
                                                str2 = str20;
                                                Map map2222222222222222222222 = f26906h0;
                                                if (j) {
                                                }
                                                str14 = r02.f26878a;
                                                if (str14 != null) {
                                                }
                                                k.f19976a = Integer.toString(i28);
                                                k.k = str31;
                                                k.f19984l = i11;
                                                k.f19978c = r02.f26875W;
                                                k.f19979d = i292222222222222222222222;
                                                k.f19985m = singletonList;
                                                k.f19982h = str11;
                                                k.f19986n = r02.f26886l;
                                                L l102222222222222222222222 = new L(k);
                                                s4.v u32222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                                r02.f26876X = u32222222222222222222222;
                                                u32222222222222222222222.a(l102222222222222222222222);
                                                sparseArray.put(r02.f26880c, r02);
                                                dVar3 = dVar3;
                                                c2387c = null;
                                                break;
                                            } else {
                                                AbstractC1705a.S("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + r02.f26868P + ". Setting mimeType to audio/x-unknown");
                                                str = str19;
                                                str31 = "audio/x-unknown";
                                                i10 = -1;
                                                singletonList = null;
                                                str11 = null;
                                                i11 = -1;
                                                if (r02.f26866N != null) {
                                                }
                                                int i2922222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                                k = new K();
                                                j = n5.o.j(str31);
                                                str2 = str20;
                                                Map map22222222222222222222222 = f26906h0;
                                                if (j) {
                                                }
                                                str14 = r02.f26878a;
                                                if (str14 != null) {
                                                }
                                                k.f19976a = Integer.toString(i28);
                                                k.k = str31;
                                                k.f19984l = i11;
                                                k.f19978c = r02.f26875W;
                                                k.f19979d = i2922222222222222222222222;
                                                k.f19985m = singletonList;
                                                k.f19982h = str11;
                                                k.f19986n = r02.f26886l;
                                                L l1022222222222222222222222 = new L(k);
                                                s4.v u322222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                                r02.f26876X = u322222222222222222222222;
                                                u322222222222222222222222.a(l1022222222222222222222222);
                                                sparseArray.put(r02.f26880c, r02);
                                                dVar3 = dVar3;
                                                c2387c = null;
                                            }
                                            break;
                                        case 23:
                                            str10 = "text/x-ssa";
                                            int i44 = r02.f26868P;
                                            if (i44 == 8) {
                                                str = str19;
                                                str31 = "audio/raw";
                                                i10 = 3;
                                                singletonList = null;
                                                str11 = null;
                                                i11 = -1;
                                                if (r02.f26866N != null) {
                                                }
                                                int i29222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                                k = new K();
                                                j = n5.o.j(str31);
                                                str2 = str20;
                                                Map map222222222222222222222222 = f26906h0;
                                                if (j) {
                                                }
                                                str14 = r02.f26878a;
                                                if (str14 != null) {
                                                }
                                                k.f19976a = Integer.toString(i28);
                                                k.k = str31;
                                                k.f19984l = i11;
                                                k.f19978c = r02.f26875W;
                                                k.f19979d = i29222222222222222222222222;
                                                k.f19985m = singletonList;
                                                k.f19982h = str11;
                                                k.f19986n = r02.f26886l;
                                                L l10222222222222222222222222 = new L(k);
                                                s4.v u3222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                                r02.f26876X = u3222222222222222222222222;
                                                u3222222222222222222222222.a(l10222222222222222222222222);
                                                sparseArray.put(r02.f26880c, r02);
                                                dVar3 = dVar3;
                                                c2387c = null;
                                                break;
                                            } else if (i44 == 16) {
                                                i10 = 268435456;
                                                str = str19;
                                                str31 = "audio/raw";
                                                singletonList = null;
                                                str11 = null;
                                                i11 = -1;
                                                if (r02.f26866N != null) {
                                                }
                                                int i292222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                                k = new K();
                                                j = n5.o.j(str31);
                                                str2 = str20;
                                                Map map2222222222222222222222222 = f26906h0;
                                                if (j) {
                                                }
                                                str14 = r02.f26878a;
                                                if (str14 != null) {
                                                }
                                                k.f19976a = Integer.toString(i28);
                                                k.k = str31;
                                                k.f19984l = i11;
                                                k.f19978c = r02.f26875W;
                                                k.f19979d = i292222222222222222222222222;
                                                k.f19985m = singletonList;
                                                k.f19982h = str11;
                                                k.f19986n = r02.f26886l;
                                                L l102222222222222222222222222 = new L(k);
                                                s4.v u32222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                                r02.f26876X = u32222222222222222222222222;
                                                u32222222222222222222222222.a(l102222222222222222222222222);
                                                sparseArray.put(r02.f26880c, r02);
                                                dVar3 = dVar3;
                                                c2387c = null;
                                            } else {
                                                AbstractC1705a.S("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + r02.f26868P + ". Setting mimeType to audio/x-unknown");
                                                str = str19;
                                                str31 = "audio/x-unknown";
                                                i10 = -1;
                                                singletonList = null;
                                                str11 = null;
                                                i11 = -1;
                                                if (r02.f26866N != null) {
                                                }
                                                int i2922222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                                k = new K();
                                                j = n5.o.j(str31);
                                                str2 = str20;
                                                Map map22222222222222222222222222 = f26906h0;
                                                if (j) {
                                                }
                                                str14 = r02.f26878a;
                                                if (str14 != null) {
                                                }
                                                k.f19976a = Integer.toString(i28);
                                                k.k = str31;
                                                k.f19984l = i11;
                                                k.f19978c = r02.f26875W;
                                                k.f19979d = i2922222222222222222222222222;
                                                k.f19985m = singletonList;
                                                k.f19982h = str11;
                                                k.f19986n = r02.f26886l;
                                                L l1022222222222222222222222222 = new L(k);
                                                s4.v u322222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                                r02.f26876X = u322222222222222222222222222;
                                                u322222222222222222222222222.a(l1022222222222222222222222222);
                                                sparseArray.put(r02.f26880c, r02);
                                                dVar3 = dVar3;
                                                c2387c = null;
                                            }
                                            break;
                                        case 24:
                                            str10 = "text/x-ssa";
                                            i10 = D.y(r02.f26868P);
                                            if (i10 == 0) {
                                                AbstractC1705a.S("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + r02.f26868P + ". Setting mimeType to audio/x-unknown");
                                                str = str19;
                                                str31 = "audio/x-unknown";
                                                i10 = -1;
                                                singletonList = null;
                                                str11 = null;
                                                i11 = -1;
                                                if (r02.f26866N != null) {
                                                }
                                                int i29222222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                                k = new K();
                                                j = n5.o.j(str31);
                                                str2 = str20;
                                                Map map222222222222222222222222222 = f26906h0;
                                                if (j) {
                                                }
                                                str14 = r02.f26878a;
                                                if (str14 != null) {
                                                }
                                                k.f19976a = Integer.toString(i28);
                                                k.k = str31;
                                                k.f19984l = i11;
                                                k.f19978c = r02.f26875W;
                                                k.f19979d = i29222222222222222222222222222;
                                                k.f19985m = singletonList;
                                                k.f19982h = str11;
                                                k.f19986n = r02.f26886l;
                                                L l10222222222222222222222222222 = new L(k);
                                                s4.v u3222222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                                r02.f26876X = u3222222222222222222222222222;
                                                u3222222222222222222222222222.a(l10222222222222222222222222222);
                                                sparseArray.put(r02.f26880c, r02);
                                                dVar3 = dVar3;
                                                c2387c = null;
                                                break;
                                            }
                                            str = str19;
                                            str31 = "audio/raw";
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i292222222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map2222222222222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i292222222222222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l102222222222222222222222222222 = new L(k);
                                            s4.v u32222222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u32222222222222222222222222222;
                                            u32222222222222222222222222222.a(l102222222222222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                            str10 = "text/x-ssa";
                                            singletonList = H.L(f26902d0, r02.a(str30));
                                            str = str19;
                                            str31 = str10;
                                            i10 = -1;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i2922222222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map22222222222222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i2922222222222222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l1022222222222222222222222222222 = new L(k);
                                            s4.v u322222222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u322222222222222222222222222222;
                                            u322222222222222222222222222222.a(l1022222222222222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 26:
                                            str10 = "text/x-ssa";
                                            o5.e a13 = o5.e.a(new v(r02.a(r02.f26879b)));
                                            r02.f26877Y = a13.f21959b;
                                            str31 = "video/hevc";
                                            singletonList = a13.f21958a;
                                            str13 = a13.g;
                                            str11 = str13;
                                            str = str19;
                                            i10 = -1;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i29222222222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map222222222222222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i29222222222222222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l10222222222222222222222222222222 = new L(k);
                                            s4.v u3222222222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u3222222222222222222222222222222;
                                            u3222222222222222222222222222222.a(l10222222222222222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 27:
                                            str10 = "text/x-ssa";
                                            str = str19;
                                            str31 = "text/vtt";
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i292222222222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map2222222222222222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i292222222222222222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l102222222222222222222222222222222 = new L(k);
                                            s4.v u32222222222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u32222222222222222222222222222222;
                                            u32222222222222222222222222222222.a(l102222222222222222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 28:
                                            str10 = "text/x-ssa";
                                            str = str19;
                                            str31 = "application/x-subrip";
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i2922222222222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map22222222222222222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i2922222222222222222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l1022222222222222222222222222222222 = new L(k);
                                            s4.v u322222222222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u322222222222222222222222222222222;
                                            u322222222222222222222222222222222.a(l1022222222222222222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 29:
                                            str10 = "text/x-ssa";
                                            str31 = "video/mpeg2";
                                            str = str19;
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i29222222222222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map222222222222222222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i29222222222222222222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l10222222222222222222222222222222222 = new L(k);
                                            s4.v u3222222222222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u3222222222222222222222222222222222;
                                            u3222222222222222222222222222222222.a(l10222222222222222222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 30:
                                            str10 = "text/x-ssa";
                                            str31 = "audio/eac3";
                                            str = str19;
                                            i10 = -1;
                                            singletonList = null;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i292222222222222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map2222222222222222222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i292222222222222222222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l102222222222222222222222222222222222 = new L(k);
                                            s4.v u32222222222222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u32222222222222222222222222222222222;
                                            u32222222222222222222222222222222222.a(l102222222222222222222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case 31:
                                            str10 = "text/x-ssa";
                                            str31 = "audio/flac";
                                            singletonList = Collections.singletonList(r02.a(str30));
                                            str = str19;
                                            i10 = -1;
                                            str11 = null;
                                            i11 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i2922222222222222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map22222222222222222222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i2922222222222222222222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l1022222222222222222222222222222222222 = new L(k);
                                            s4.v u322222222222222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u322222222222222222222222222222222222;
                                            u322222222222222222222222222222222222.a(l1022222222222222222222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        case ' ':
                                            ArrayList arrayList2 = new ArrayList(3);
                                            arrayList2.add(r02.a(r02.f26879b));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            str10 = "text/x-ssa";
                                            arrayList2.add(allocate.order(byteOrder).putLong(r02.f26870R).array());
                                            arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r02.f26871S).array());
                                            str31 = "audio/opus";
                                            str = str19;
                                            i11 = 5760;
                                            str11 = null;
                                            list = arrayList2;
                                            singletonList = list;
                                            i10 = -1;
                                            if (r02.f26866N != null) {
                                            }
                                            int i29222222222222222222222222222222222222 = (r02.f26874V ? 1 : 0) | (r02.f26873U ? 2 : 0);
                                            k = new K();
                                            j = n5.o.j(str31);
                                            str2 = str20;
                                            Map map222222222222222222222222222222222222 = f26906h0;
                                            if (j) {
                                            }
                                            str14 = r02.f26878a;
                                            if (str14 != null) {
                                            }
                                            k.f19976a = Integer.toString(i28);
                                            k.k = str31;
                                            k.f19984l = i11;
                                            k.f19978c = r02.f26875W;
                                            k.f19979d = i29222222222222222222222222222222222222;
                                            k.f19985m = singletonList;
                                            k.f19982h = str11;
                                            k.f19986n = r02.f26886l;
                                            L l10222222222222222222222222222222222222 = new L(k);
                                            s4.v u3222222222222222222222222222222222222 = interfaceC1984l2.u(r02.f26880c, i13);
                                            r02.f26876X = u3222222222222222222222222222222222222;
                                            u3222222222222222222222222222222222222.a(l10222222222222222222222222222222222222);
                                            sparseArray.put(r02.f26880c, r02);
                                            dVar3 = dVar3;
                                            c2387c = null;
                                            break;
                                        default:
                                            throw C1586o0.a("Unrecognized codec identifier.", null);
                                    }
                                default:
                                    str = str19;
                                    str2 = str20;
                                    str3 = str8;
                                    str4 = str9;
                                    str7 = str25;
                                    c2387c = null;
                                    break;
                            }
                            dVar3.f26951u = c2387c;
                            str5 = str7;
                        }
                    } else {
                        str = str19;
                        str2 = str20;
                        str3 = str21;
                        str4 = str22;
                    }
                } else {
                    str = str19;
                    str2 = str20;
                    str3 = str21;
                    str4 = str22;
                    arrayDeque = arrayDeque2;
                }
                str5 = str25;
                ?? r22 = 0;
                int i45 = c2386b.f26852e;
                e eVar = c2386b.f26850c;
                if (i45 == 0) {
                    C1979g c1979g = (C1979g) interfaceC1983k;
                    int i46 = 4;
                    long c13 = eVar.c(c1979g, true, false, 4);
                    if (c13 == -2) {
                        c1979g.f24057f = 0;
                        while (true) {
                            byte[] bArr8 = c2386b.f26848a;
                            r52 = (C1979g) interfaceC1983k;
                            r52.x(bArr8, r22, i46, r22);
                            b2 = e.b(bArr8[r22]);
                            if (b2 != -1 && b2 <= i46) {
                                a9 = (int) e.a(b2, r22, bArr8);
                                ((d) c2386b.f26851d.f22101b).getClass();
                                if (a9 == 357149030 || a9 == 524531317 || a9 == 475249515 || a9 == 374648427) {
                                }
                            }
                            r52.r(1);
                            r22 = 0;
                            i46 = 4;
                        }
                        r52.r(b2);
                        c13 = a9;
                    }
                    z8 = true;
                    if (c13 == -1) {
                        z10 = false;
                    } else {
                        c2386b.f26853f = (int) c13;
                        c2386b.f26852e = 1;
                    }
                } else {
                    z8 = true;
                }
                if (c2386b.f26852e == z8) {
                    c2386b.g = eVar.c((C1979g) interfaceC1983k, false, z8, 8);
                    c2386b.f26852e = 2;
                }
                o oVar2 = c2386b.f26851d;
                int i47 = c2386b.f26853f;
                ((d) oVar2.f22101b).getClass();
                switch (i47) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        i7 = 2;
                        break;
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        i7 = 3;
                        break;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        i7 = 1;
                        break;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        i7 = 4;
                        break;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        i7 = 5;
                        break;
                    default:
                        i7 = 0;
                        break;
                }
                if (i7 == 0) {
                    ((C1979g) interfaceC1983k).r((int) c2386b.g);
                    c2386b.f26852e = 0;
                    str25 = str5;
                    str19 = str;
                    str20 = str2;
                    str21 = str3;
                    str22 = str4;
                } else if (i7 == 1) {
                    long j14 = ((C1979g) interfaceC1983k).f24055d;
                    arrayDeque.push(new C2385a(c2386b.f26853f, c2386b.g + j14));
                    c2386b.f26851d.r(c2386b.f26853f, j14, c2386b.g);
                    c2386b.f26852e = 0;
                } else if (i7 == 2) {
                    long j15 = c2386b.g;
                    if (j15 > 8) {
                        throw C1586o0.a("Invalid integer size: " + c2386b.g, null);
                    }
                    c2386b.f26851d.l(c2386b.f26853f, c2386b.a((C1979g) interfaceC1983k, (int) j15));
                    c2386b.f26852e = 0;
                } else if (i7 == 3) {
                    long j16 = c2386b.g;
                    if (j16 > 2147483647L) {
                        throw C1586o0.a("String element size: " + c2386b.g, null);
                    }
                    o oVar3 = c2386b.f26851d;
                    int i48 = c2386b.f26853f;
                    int i49 = (int) j16;
                    if (i49 == 0) {
                        str6 = "";
                    } else {
                        byte[] bArr9 = new byte[i49];
                        ((C1979g) interfaceC1983k).h(bArr9, 0, i49, false);
                        while (i49 > 0 && bArr9[i49 - 1] == 0) {
                            i49--;
                        }
                        str6 = new String(bArr9, 0, i49);
                    }
                    d dVar4 = (d) oVar3.f22101b;
                    dVar4.getClass();
                    if (i48 == 134) {
                        dVar4.d(i48);
                        dVar4.f26951u.f26879b = str6;
                    } else if (i48 != 17026) {
                        if (i48 == 21358) {
                            dVar4.d(i48);
                            dVar4.f26951u.f26878a = str6;
                        } else if (i48 == 2274716) {
                            dVar4.d(i48);
                            dVar4.f26951u.f26875W = str6;
                        }
                    } else if (!"webm".equals(str6) && !"matroska".equals(str6)) {
                        throw C1586o0.a("DocType " + str6 + " not supported", null);
                    }
                    c2386b.f26852e = 0;
                } else if (i7 == 4) {
                    c2386b.f26851d.k(c2386b.f26853f, (int) c2386b.g, (C1979g) interfaceC1983k);
                    c2386b.f26852e = 0;
                } else {
                    if (i7 != 5) {
                        throw C1586o0.a("Invalid element type " + i7, null);
                    }
                    long j17 = c2386b.g;
                    if (j17 != 4 && j17 != 8) {
                        throw C1586o0.a("Invalid float size: " + c2386b.g, null);
                    }
                    o oVar4 = c2386b.f26851d;
                    int i50 = c2386b.f26853f;
                    int i51 = (int) j17;
                    double intBitsToFloat = i51 == 4 ? Float.intBitsToFloat((int) r11) : Double.longBitsToDouble(c2386b.a((C1979g) interfaceC1983k, i51));
                    d dVar5 = (d) oVar4.f22101b;
                    if (i50 == 181) {
                        dVar5.d(i50);
                        dVar5.f26951u.f26869Q = (int) intBitsToFloat;
                    } else if (i50 != 17545) {
                        switch (i50) {
                            case 21969:
                                dVar5.d(i50);
                                dVar5.f26951u.f26857D = (float) intBitsToFloat;
                                break;
                            case 21970:
                                dVar5.d(i50);
                                dVar5.f26951u.f26858E = (float) intBitsToFloat;
                                break;
                            case 21971:
                                dVar5.d(i50);
                                dVar5.f26951u.f26859F = (float) intBitsToFloat;
                                break;
                            case 21972:
                                dVar5.d(i50);
                                dVar5.f26951u.f26860G = (float) intBitsToFloat;
                                break;
                            case 21973:
                                dVar5.d(i50);
                                dVar5.f26951u.f26861H = (float) intBitsToFloat;
                                break;
                            case 21974:
                                dVar5.d(i50);
                                dVar5.f26951u.f26862I = (float) intBitsToFloat;
                                break;
                            case 21975:
                                dVar5.d(i50);
                                dVar5.f26951u.f26863J = (float) intBitsToFloat;
                                break;
                            case 21976:
                                dVar5.d(i50);
                                dVar5.f26951u.f26864K = (float) intBitsToFloat;
                                break;
                            case 21977:
                                dVar5.d(i50);
                                dVar5.f26951u.L = (float) intBitsToFloat;
                                break;
                            case 21978:
                                dVar5.d(i50);
                                dVar5.f26951u.f26865M = (float) intBitsToFloat;
                                break;
                            default:
                                switch (i50) {
                                    case 30323:
                                        dVar5.d(i50);
                                        dVar5.f26951u.f26893s = (float) intBitsToFloat;
                                        break;
                                    case 30324:
                                        dVar5.d(i50);
                                        dVar5.f26951u.f26894t = (float) intBitsToFloat;
                                        break;
                                    case 30325:
                                        dVar5.d(i50);
                                        dVar5.f26951u.f26895u = (float) intBitsToFloat;
                                        break;
                                    default:
                                        dVar5.getClass();
                                        break;
                                }
                        }
                    } else {
                        dVar5.f26949s = (long) intBitsToFloat;
                    }
                    c2386b.f26852e = 0;
                }
            }
            if (z10) {
                long j18 = ((C1979g) interfaceC1983k).f24055d;
                dVar = this;
                if (dVar.f26955y) {
                    dVar.f26907A = j18;
                    c0257a.f3957a = dVar.f26956z;
                    dVar.f26955y = false;
                    return 1;
                }
                c0257a2 = c0257a;
                if (dVar.f26952v) {
                    long j19 = dVar.f26907A;
                    if (j19 != -1) {
                        c0257a2.f3957a = j19;
                        dVar.f26907A = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                dVar = this;
                c0257a2 = c0257a;
            }
            dVar2 = dVar;
            str25 = str5;
            str19 = str;
            str20 = str2;
            str21 = str3;
            str22 = str4;
        }
        d dVar6 = dVar2;
        if (z10) {
            return 0;
        }
        int i52 = 0;
        while (true) {
            SparseArray sparseArray2 = dVar6.f26936c;
            if (i52 >= sparseArray2.size()) {
                return -1;
            }
            C2387c c2387c5 = (C2387c) sparseArray2.valueAt(i52);
            c2387c5.f26876X.getClass();
            w wVar = c2387c5.f26872T;
            if (wVar != null) {
                wVar.a(c2387c5.f26876X, c2387c5.j);
            }
            i52++;
        }
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f26935b0 = interfaceC1984l;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(C2387c c2387c, long j, int i7, int i10, int i11) {
        byte[] h10;
        int i12;
        int i13;
        w wVar = c2387c.f26872T;
        if (wVar != null) {
            wVar.b(c2387c.f26876X, j, i7, i10, i11, c2387c.j);
        } else {
            if ("S_TEXT/UTF8".equals(c2387c.f26879b) || "S_TEXT/ASS".equals(c2387c.f26879b) || "S_TEXT/WEBVTT".equals(c2387c.f26879b)) {
                if (this.f26917K > 1) {
                    AbstractC1705a.S("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j10 = this.f26915I;
                    if (j10 == -9223372036854775807L) {
                        AbstractC1705a.S("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = c2387c.f26879b;
                        v vVar = this.k;
                        byte[] bArr = vVar.f21229a;
                        str.getClass();
                        char c10 = 65535;
                        switch (str.hashCode()) {
                            case 738597099:
                                if (str.equals("S_TEXT/ASS")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 1045209816:
                                if (str.equals("S_TEXT/WEBVTT")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 1422270023:
                                if (str.equals("S_TEXT/UTF8")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c10) {
                            case 0:
                                h10 = h(j10, 10000L, "%01d:%02d:%02d:%02d");
                                i12 = 21;
                                break;
                            case 1:
                                h10 = h(j10, 1000L, "%02d:%02d:%02d.%03d");
                                i12 = 25;
                                break;
                            case 2:
                                h10 = h(j10, 1000L, "%02d:%02d:%02d,%03d");
                                i12 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(h10, 0, bArr, i12, h10.length);
                        int i14 = vVar.f21230b;
                        while (true) {
                            if (i14 < vVar.f21231c) {
                                if (vVar.f21229a[i14] == 0) {
                                    vVar.F(i14);
                                } else {
                                    i14++;
                                }
                            }
                        }
                        c2387c.f26876X.c(vVar.f21231c, vVar);
                        i13 = i10 + vVar.f21231c;
                        if ((i7 & 268435456) != 0) {
                            int i15 = this.f26917K;
                            v vVar2 = this.f26944n;
                            if (i15 > 1) {
                                vVar2.D(0);
                            } else {
                                int i16 = vVar2.f21231c;
                                c2387c.f26876X.c(i16, vVar2);
                                i13 += i16;
                            }
                        }
                        c2387c.f26876X.e(j, i7, i13, i11, c2387c.j);
                    }
                }
            }
            i13 = i10;
            if ((i7 & 268435456) != 0) {
            }
            c2387c.f26876X.e(j, i7, i13, i11, c2387c.j);
        }
        this.f26912F = true;
    }

    public final void i(C1979g c1979g, int i7) {
        v vVar = this.g;
        if (vVar.f21231c >= i7) {
            return;
        }
        byte[] bArr = vVar.f21229a;
        if (bArr.length < i7) {
            vVar.b(Math.max(bArr.length * 2, i7));
        }
        byte[] bArr2 = vVar.f21229a;
        int i10 = vVar.f21231c;
        c1979g.h(bArr2, i10, i7 - i10, false);
        vVar.F(i7);
    }

    public final void j() {
        this.f26924S = 0;
        this.f26925T = 0;
        this.f26926U = 0;
        this.f26927V = false;
        this.f26928W = false;
        this.f26929X = false;
        this.f26930Y = 0;
        this.f26931Z = (byte) 0;
        this.f26933a0 = false;
        this.j.D(0);
    }

    public final long k(long j) {
        long j10 = this.f26948r;
        if (j10 != -9223372036854775807L) {
            return D.T(j, j10, 1000L);
        }
        throw C1586o0.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(C1979g c1979g, C2387c c2387c, int i7, boolean z8) {
        int d10;
        int d11;
        int i10;
        if ("S_TEXT/UTF8".equals(c2387c.f26879b)) {
            m(c1979g, f26901c0, i7);
            int i11 = this.f26925T;
            j();
            return i11;
        }
        if ("S_TEXT/ASS".equals(c2387c.f26879b)) {
            m(c1979g, f26903e0, i7);
            int i12 = this.f26925T;
            j();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(c2387c.f26879b)) {
            m(c1979g, f26904f0, i7);
            int i13 = this.f26925T;
            j();
            return i13;
        }
        s4.v vVar = c2387c.f26876X;
        boolean z10 = this.f26927V;
        v vVar2 = this.j;
        if (!z10) {
            boolean z11 = c2387c.f26884h;
            v vVar3 = this.g;
            if (z11) {
                this.f26920O &= -1073741825;
                if (!this.f26928W) {
                    c1979g.h(vVar3.f21229a, 0, 1, false);
                    this.f26924S++;
                    byte b2 = vVar3.f21229a[0];
                    if ((b2 & 128) == 128) {
                        throw C1586o0.a("Extension bit is set in signal byte", null);
                    }
                    this.f26931Z = b2;
                    this.f26928W = true;
                }
                byte b10 = this.f26931Z;
                if ((b10 & 1) == 1) {
                    boolean z12 = (b10 & 2) == 2;
                    this.f26920O |= 1073741824;
                    if (!this.f26933a0) {
                        v vVar4 = this.f26942l;
                        c1979g.h(vVar4.f21229a, 0, 8, false);
                        this.f26924S += 8;
                        this.f26933a0 = true;
                        vVar3.f21229a[0] = (byte) ((z12 ? 128 : 0) | 8);
                        vVar3.G(0);
                        vVar.c(1, vVar3);
                        this.f26925T++;
                        vVar4.G(0);
                        vVar.c(8, vVar4);
                        this.f26925T += 8;
                    }
                    if (z12) {
                        if (!this.f26929X) {
                            c1979g.h(vVar3.f21229a, 0, 1, false);
                            this.f26924S++;
                            vVar3.G(0);
                            this.f26930Y = vVar3.v();
                            this.f26929X = true;
                        }
                        int i14 = this.f26930Y * 4;
                        vVar3.D(i14);
                        c1979g.h(vVar3.f21229a, 0, i14, false);
                        this.f26924S += i14;
                        short s3 = (short) ((this.f26930Y / 2) + 1);
                        int i15 = (s3 * 6) + 2;
                        ByteBuffer byteBuffer = this.f26945o;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.f26945o = ByteBuffer.allocate(i15);
                        }
                        this.f26945o.position(0);
                        this.f26945o.putShort(s3);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i10 = this.f26930Y;
                            if (i16 >= i10) {
                                break;
                            }
                            int y10 = vVar3.y();
                            if (i16 % 2 == 0) {
                                this.f26945o.putShort((short) (y10 - i17));
                            } else {
                                this.f26945o.putInt(y10 - i17);
                            }
                            i16++;
                            i17 = y10;
                        }
                        int i18 = (i7 - this.f26924S) - i17;
                        if (i10 % 2 == 1) {
                            this.f26945o.putInt(i18);
                        } else {
                            this.f26945o.putShort((short) i18);
                            this.f26945o.putInt(0);
                        }
                        byte[] array = this.f26945o.array();
                        v vVar5 = this.f26943m;
                        vVar5.E(i15, array);
                        vVar.c(i15, vVar5);
                        this.f26925T += i15;
                    }
                }
            } else {
                byte[] bArr = c2387c.f26885i;
                if (bArr != null) {
                    vVar2.E(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(c2387c.f26879b) ? z8 : c2387c.f26883f > 0) {
                this.f26920O |= 268435456;
                this.f26944n.D(0);
                int i19 = (vVar2.f21231c + i7) - this.f26924S;
                vVar3.D(4);
                byte[] bArr2 = vVar3.f21229a;
                bArr2[0] = (byte) ((i19 >> 24) & 255);
                bArr2[1] = (byte) ((i19 >> 16) & 255);
                bArr2[2] = (byte) ((i19 >> 8) & 255);
                bArr2[3] = (byte) (i19 & 255);
                vVar.c(4, vVar3);
                this.f26925T += 4;
            }
            this.f26927V = true;
        }
        int i20 = i7 + vVar2.f21231c;
        if (!"V_MPEG4/ISO/AVC".equals(c2387c.f26879b) && !"V_MPEGH/ISO/HEVC".equals(c2387c.f26879b)) {
            if (c2387c.f26872T != null) {
                AbstractC1705a.m(vVar2.f21231c == 0);
                c2387c.f26872T.c(c1979g);
            }
            while (true) {
                int i21 = this.f26924S;
                if (i21 >= i20) {
                    break;
                }
                int i22 = i20 - i21;
                int a9 = vVar2.a();
                if (a9 > 0) {
                    d11 = Math.min(i22, a9);
                    vVar.c(d11, vVar2);
                } else {
                    d11 = vVar.d(c1979g, i22, false);
                }
                this.f26924S += d11;
                this.f26925T += d11;
            }
        } else {
            v vVar6 = this.f26939f;
            byte[] bArr3 = vVar6.f21229a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i23 = c2387c.f26877Y;
            int i24 = 4 - i23;
            while (this.f26924S < i20) {
                int i25 = this.f26926U;
                if (i25 == 0) {
                    int min = Math.min(i23, vVar2.a());
                    c1979g.h(bArr3, i24 + min, i23 - min, false);
                    if (min > 0) {
                        vVar2.f(i24, bArr3, min);
                    }
                    this.f26924S += i23;
                    vVar6.G(0);
                    this.f26926U = vVar6.y();
                    v vVar7 = this.f26938e;
                    vVar7.G(0);
                    vVar.c(4, vVar7);
                    this.f26925T += 4;
                } else {
                    int a10 = vVar2.a();
                    if (a10 > 0) {
                        d10 = Math.min(i25, a10);
                        vVar.c(d10, vVar2);
                    } else {
                        d10 = vVar.d(c1979g, i25, false);
                    }
                    this.f26924S += d10;
                    this.f26925T += d10;
                    this.f26926U -= d10;
                }
            }
        }
        if ("A_VORBIS".equals(c2387c.f26879b)) {
            v vVar8 = this.f26940h;
            vVar8.G(0);
            vVar.c(4, vVar8);
            this.f26925T += 4;
        }
        int i26 = this.f26925T;
        j();
        return i26;
    }

    public final void m(C1979g c1979g, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        v vVar = this.k;
        byte[] bArr2 = vVar.f21229a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i7);
            vVar.E(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c1979g.h(vVar.f21229a, bArr.length, i7, false);
        vVar.G(0);
        vVar.F(length);
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
