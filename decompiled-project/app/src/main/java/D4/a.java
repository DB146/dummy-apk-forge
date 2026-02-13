package D4;

import A4.i;
import m4.C1586o0;
import m4.K;
import m4.L;
import n5.D;
import s4.InterfaceC1984l;
import s4.v;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f3200m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f3201n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1984l f3202a;

    /* renamed from: b, reason: collision with root package name */
    public final v f3203b;

    /* renamed from: c, reason: collision with root package name */
    public final i f3204c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3205d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f3206e;

    /* renamed from: f, reason: collision with root package name */
    public final n5.v f3207f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final L f3208h;

    /* renamed from: i, reason: collision with root package name */
    public int f3209i;
    public long j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public long f3210l;

    public a(InterfaceC1984l interfaceC1984l, v vVar, i iVar) {
        this.f3202a = interfaceC1984l;
        this.f3203b = vVar;
        this.f3204c = iVar;
        int i7 = iVar.f389b;
        int max = Math.max(1, i7 / 10);
        this.g = max;
        n5.v vVar2 = new n5.v((byte[]) iVar.f392e);
        vVar2.o();
        int o10 = vVar2.o();
        this.f3205d = o10;
        int i10 = iVar.f388a;
        int i11 = iVar.f390c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (iVar.f391d * i10)) + 1;
        if (o10 != i12) {
            throw C1586o0.a("Expected frames per block: " + i12 + "; got: " + o10, null);
        }
        int f4 = D.f(max, o10);
        this.f3206e = new byte[f4 * i11];
        this.f3207f = new n5.v(o10 * 2 * i10 * f4);
        int i13 = ((i11 * i7) * 8) / o10;
        K k = new K();
        k.k = "audio/raw";
        k.f19981f = i13;
        k.g = i13;
        k.f19984l = max * 2 * i10;
        k.f19996x = i10;
        k.f19997y = i7;
        k.f19998z = 2;
        this.f3208h = new L(k);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:50:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // D4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(s4.C1979g r26, long r27) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.a.a(s4.g, long):boolean");
    }

    @Override // D4.b
    public final void b(int i7, long j) {
        this.f3202a.i(new f(this.f3204c, this.f3205d, i7, j));
        this.f3203b.a(this.f3208h);
    }

    @Override // D4.b
    public final void c(long j) {
        this.f3209i = 0;
        this.j = j;
        this.k = 0;
        this.f3210l = 0L;
    }

    public final void d(int i7) {
        long j = this.j;
        long j10 = this.f3210l;
        i iVar = this.f3204c;
        long T10 = j + D.T(j10, 1000000L, iVar.f389b);
        int i10 = i7 * 2 * iVar.f388a;
        this.f3203b.e(T10, 1, i10, this.k - i10, null);
        this.f3210l += i7;
        this.k -= i10;
    }
}
