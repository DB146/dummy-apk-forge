package b5;

import a5.C0776b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n5.AbstractC1705a;
import n5.v;

/* renamed from: b5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843c extends i {

    /* renamed from: M, reason: collision with root package name */
    public static final int[] f13895M = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: N, reason: collision with root package name */
    public static final int[] f13896N = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: O, reason: collision with root package name */
    public static final int[] f13897O = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: P, reason: collision with root package name */
    public static final int[] f13898P = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f13899Q = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f13900R = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f13901S = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: T, reason: collision with root package name */
    public static final boolean[] f13902T = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: B, reason: collision with root package name */
    public List f13904B;

    /* renamed from: C, reason: collision with root package name */
    public List f13905C;

    /* renamed from: D, reason: collision with root package name */
    public int f13906D;

    /* renamed from: E, reason: collision with root package name */
    public int f13907E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f13908F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f13909G;

    /* renamed from: H, reason: collision with root package name */
    public byte f13910H;

    /* renamed from: I, reason: collision with root package name */
    public byte f13911I;

    /* renamed from: K, reason: collision with root package name */
    public boolean f13913K;
    public long L;

    /* renamed from: v, reason: collision with root package name */
    public final int f13915v;

    /* renamed from: w, reason: collision with root package name */
    public final int f13916w;

    /* renamed from: x, reason: collision with root package name */
    public final int f13917x;

    /* renamed from: u, reason: collision with root package name */
    public final v f13914u = new v();

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f13919z = new ArrayList();

    /* renamed from: A, reason: collision with root package name */
    public C0842b f13903A = new C0842b(0, 4);

    /* renamed from: J, reason: collision with root package name */
    public int f13912J = 0;

    /* renamed from: y, reason: collision with root package name */
    public final long f13918y = 16000000;

    public C0843c(String str, int i7) {
        this.f13915v = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i7 == 1) {
            this.f13917x = 0;
            this.f13916w = 0;
        } else if (i7 == 2) {
            this.f13917x = 1;
            this.f13916w = 0;
        } else if (i7 == 3) {
            this.f13917x = 0;
            this.f13916w = 1;
        } else if (i7 != 4) {
            AbstractC1705a.S("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f13917x = 0;
            this.f13916w = 0;
        } else {
            this.f13917x = 1;
            this.f13916w = 1;
        }
        k(0);
        j();
        this.f13913K = true;
        this.L = -9223372036854775807L;
    }

    @Override // b5.i
    public final j b() {
        List list = this.f13904B;
        this.f13905C = list;
        list.getClass();
        return new j(list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x01c5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // b5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(h hVar) {
        boolean z8;
        ByteBuffer byteBuffer = hVar.f23458d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        v vVar = this.f13914u;
        vVar.E(limit, array);
        boolean z10 = false;
        while (true) {
            int a9 = vVar.a();
            int i7 = this.f13915v;
            if (a9 < i7) {
                if (z10) {
                    int i10 = this.f13906D;
                    if (i10 == 1 || i10 == 3) {
                        this.f13904B = i();
                        this.L = this.f13972e;
                        return;
                    }
                    return;
                }
                return;
            }
            int v10 = i7 == 2 ? -4 : vVar.v();
            int v11 = vVar.v();
            int v12 = vVar.v();
            if ((v10 & 2) == 0 && (v10 & 1) == this.f13916w) {
                byte b2 = (byte) (v11 & 127);
                byte b10 = (byte) (v12 & 127);
                if (b2 != 0 || b10 != 0) {
                    boolean z11 = this.f13908F;
                    if ((v10 & 4) == 4) {
                        boolean[] zArr = f13902T;
                        if (zArr[v11] && zArr[v12]) {
                            z8 = true;
                            this.f13908F = z8;
                            if (z8 || (b2 & 240) != 16) {
                                this.f13909G = false;
                            } else if (this.f13909G && this.f13910H == b2 && this.f13911I == b10) {
                                this.f13909G = false;
                            } else {
                                this.f13909G = true;
                                this.f13910H = b2;
                                this.f13911I = b10;
                            }
                            if (!z8) {
                                if (1 <= b2 && b2 <= 15) {
                                    this.f13913K = false;
                                } else if ((b2 & 246) == 20) {
                                    if (b10 != 32 && b10 != 47) {
                                        switch (b10) {
                                            case 37:
                                            case 38:
                                            case 39:
                                                break;
                                            default:
                                                switch (b10) {
                                                    case 42:
                                                    case 43:
                                                        this.f13913K = false;
                                                        break;
                                                }
                                                z10 = true;
                                                break;
                                        }
                                    }
                                    this.f13913K = true;
                                }
                                if (this.f13913K) {
                                    int i11 = b2 & 224;
                                    if (i11 == 0) {
                                        this.f13912J = (b2 >> 3) & 1;
                                    }
                                    if (this.f13912J == this.f13917x) {
                                        if (i11 == 0) {
                                            int i12 = b2 & 247;
                                            if (i12 == 17 && (b10 & 240) == 48) {
                                                this.f13903A.a((char) f13899Q[b10 & 15]);
                                            } else {
                                                int i13 = b2 & 246;
                                                if (i13 == 18 && (b10 & 224) == 32) {
                                                    this.f13903A.b();
                                                    this.f13903A.a((char) ((b2 & 1) == 0 ? f13900R[b10 & 31] : f13901S[b10 & 31]));
                                                } else if (i12 == 17 && (b10 & 240) == 32) {
                                                    this.f13903A.a(' ');
                                                    boolean z12 = (b10 & 1) == 1;
                                                    C0842b c0842b = this.f13903A;
                                                    c0842b.f13888a.add(new C0841a(z12, (b10 >> 1) & 7, c0842b.f13890c.length()));
                                                } else if ((b2 & 240) == 16 && (b10 & 192) == 64) {
                                                    int i14 = f13895M[b2 & 7];
                                                    if ((b10 & 32) != 0) {
                                                        i14++;
                                                    }
                                                    C0842b c0842b2 = this.f13903A;
                                                    if (i14 != c0842b2.f13891d) {
                                                        if (this.f13906D != 1 && !c0842b2.e()) {
                                                            C0842b c0842b3 = new C0842b(this.f13906D, this.f13907E);
                                                            this.f13903A = c0842b3;
                                                            this.f13919z.add(c0842b3);
                                                        }
                                                        this.f13903A.f13891d = i14;
                                                    }
                                                    boolean z13 = (b10 & 16) == 16;
                                                    boolean z14 = (b10 & 1) == 1;
                                                    int i15 = (b10 >> 1) & 7;
                                                    C0842b c0842b4 = this.f13903A;
                                                    c0842b4.f13888a.add(new C0841a(z14, z13 ? 8 : i15, c0842b4.f13890c.length()));
                                                    if (z13) {
                                                        this.f13903A.f13892e = f13896N[i15];
                                                    }
                                                } else if (i12 == 23 && b10 >= 33 && b10 <= 35) {
                                                    this.f13903A.f13893f = b10 - 32;
                                                } else if (i13 == 20 && (b10 & 240) == 32) {
                                                    if (b10 == 32) {
                                                        k(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                k(1);
                                                                this.f13907E = 2;
                                                                this.f13903A.f13894h = 2;
                                                                break;
                                                            case 38:
                                                                k(1);
                                                                this.f13907E = 3;
                                                                this.f13903A.f13894h = 3;
                                                                break;
                                                            case 39:
                                                                k(1);
                                                                this.f13907E = 4;
                                                                this.f13903A.f13894h = 4;
                                                                break;
                                                            default:
                                                                int i16 = this.f13906D;
                                                                if (i16 != 0) {
                                                                    if (b10 == 33) {
                                                                        this.f13903A.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f13904B = Collections.emptyList();
                                                                                int i17 = this.f13906D;
                                                                                if (i17 == 1 || i17 == 3) {
                                                                                    j();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i16 == 1 && !this.f13903A.e()) {
                                                                                    C0842b c0842b5 = this.f13903A;
                                                                                    ArrayList arrayList = c0842b5.f13889b;
                                                                                    arrayList.add(c0842b5.d());
                                                                                    c0842b5.f13890c.setLength(0);
                                                                                    c0842b5.f13888a.clear();
                                                                                    int min = Math.min(c0842b5.f13894h, c0842b5.f13891d);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case 47:
                                                                                this.f13904B = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            C0842b c0842b6 = this.f13903A;
                                            int[] iArr = f13898P;
                                            c0842b6.a((char) iArr[(b2 & Byte.MAX_VALUE) - 32]);
                                            if ((b10 & 224) != 0) {
                                                this.f13903A.a((char) iArr[(b10 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z10 = true;
                                    }
                                }
                            } else if (z11) {
                                j();
                                z10 = true;
                            }
                        }
                    }
                    z8 = false;
                    this.f13908F = z8;
                    if (z8) {
                    }
                    this.f13909G = false;
                    if (!z8) {
                    }
                }
            }
        }
    }

    @Override // b5.i, q4.c
    /* renamed from: d */
    public final a5.d f() {
        a5.d dVar;
        a5.d f4 = super.f();
        if (f4 != null) {
            return f4;
        }
        long j = this.f13918y;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j10 = this.L;
        if (j10 == -9223372036854775807L || this.f13972e - j10 < j || (dVar = (a5.d) this.f13969b.pollFirst()) == null) {
            return null;
        }
        this.f13904B = Collections.emptyList();
        this.L = -9223372036854775807L;
        dVar.H(this.f13972e, b(), Long.MAX_VALUE);
        return dVar;
    }

    @Override // b5.i, q4.c
    public final void flush() {
        super.flush();
        this.f13904B = null;
        this.f13905C = null;
        k(0);
        this.f13907E = 4;
        this.f13903A.f13894h = 4;
        j();
        this.f13908F = false;
        this.f13909G = false;
        this.f13910H = (byte) 0;
        this.f13911I = (byte) 0;
        this.f13912J = 0;
        this.f13913K = true;
        this.L = -9223372036854775807L;
    }

    @Override // b5.i
    public final boolean g() {
        return this.f13904B != this.f13905C;
    }

    public final ArrayList i() {
        ArrayList arrayList = this.f13919z;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i7 = 2;
        for (int i10 = 0; i10 < size; i10++) {
            C0776b c10 = ((C0842b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(c10);
            if (c10 != null) {
                i7 = Math.min(i7, c10.f12739w);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            C0776b c0776b = (C0776b) arrayList2.get(i11);
            if (c0776b != null) {
                if (c0776b.f12739w != i7) {
                    c0776b = ((C0842b) arrayList.get(i11)).c(i7);
                    c0776b.getClass();
                }
                arrayList3.add(c0776b);
            }
        }
        return arrayList3;
    }

    public final void j() {
        C0842b c0842b = this.f13903A;
        c0842b.g = this.f13906D;
        c0842b.f13888a.clear();
        c0842b.f13889b.clear();
        c0842b.f13890c.setLength(0);
        c0842b.f13891d = 15;
        c0842b.f13892e = 0;
        c0842b.f13893f = 0;
        ArrayList arrayList = this.f13919z;
        arrayList.clear();
        arrayList.add(this.f13903A);
    }

    public final void k(int i7) {
        int i10 = this.f13906D;
        if (i10 == i7) {
            return;
        }
        this.f13906D = i7;
        if (i7 != 3) {
            j();
            if (i10 == 3 || i7 == 1 || i7 == 0) {
                this.f13904B = Collections.emptyList();
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f13919z;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((C0842b) arrayList.get(i11)).g = i7;
            i11++;
        }
    }

    @Override // b5.i, q4.c
    public final void release() {
    }
}
