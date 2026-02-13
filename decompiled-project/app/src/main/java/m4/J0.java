package m4;

/* loaded from: classes.dex */
public final class J0 implements InterfaceC1569g {

    /* renamed from: v, reason: collision with root package name */
    public static final String f19958v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f19959w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f19960x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f19961y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f19962z;

    /* renamed from: a, reason: collision with root package name */
    public Object f19963a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19964b;

    /* renamed from: c, reason: collision with root package name */
    public int f19965c;

    /* renamed from: d, reason: collision with root package name */
    public long f19966d;

    /* renamed from: e, reason: collision with root package name */
    public long f19967e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19968f;

    /* renamed from: u, reason: collision with root package name */
    public Q4.b f19969u = Q4.b.f8638f;

    static {
        int i7 = n5.D.f21141a;
        f19958v = Integer.toString(0, 36);
        f19959w = Integer.toString(1, 36);
        f19960x = Integer.toString(2, 36);
        f19961y = Integer.toString(3, 36);
        f19962z = Integer.toString(4, 36);
    }

    public final long a(int i7, int i10) {
        Q4.a a9 = this.f19969u.a(i7);
        if (a9.f8631b != -1) {
            return a9.f8635f[i10];
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(long j) {
        Q4.a a9;
        int i7;
        Q4.b bVar = this.f19969u;
        long j10 = this.f19966d;
        bVar.getClass();
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j10 != -9223372036854775807L && j >= j10) {
            return -1;
        }
        int i10 = bVar.f8648d;
        while (true) {
            int i11 = bVar.f8645a;
            if (i10 >= i11 || ((bVar.a(i10).f8630a == Long.MIN_VALUE || bVar.a(i10).f8630a > j) && ((i7 = (a9 = bVar.a(i10)).f8631b) == -1 || a9.a(-1) < i7))) {
                break;
            }
            i10++;
        }
        return -1;
    }

    public final int c(long j) {
        Q4.b bVar = this.f19969u;
        long j10 = this.f19966d;
        int i7 = bVar.f8645a - 1;
        int i10 = i7 - (bVar.b(i7) ? 1 : 0);
        while (i10 >= 0 && j != Long.MIN_VALUE) {
            Q4.a a9 = bVar.a(i10);
            long j11 = a9.f8630a;
            if (j11 != Long.MIN_VALUE) {
                if (j >= j11) {
                    break;
                }
                i10--;
            } else {
                if (j10 != -9223372036854775807L && ((!a9.f8637v || a9.f8631b != -1) && j >= j10)) {
                    break;
                }
                i10--;
            }
        }
        if (i10 >= 0) {
            Q4.a a10 = bVar.a(i10);
            int i11 = a10.f8631b;
            if (i11 == -1) {
                return i10;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = a10.f8634e[i12];
                if (i13 == 0 || i13 == 1) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public final long d(int i7) {
        return this.f19969u.a(i7).f8630a;
    }

    public final int e(int i7, int i10) {
        Q4.a a9 = this.f19969u.a(i7);
        if (a9.f8631b != -1) {
            return a9.f8634e[i10];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !J0.class.equals(obj.getClass())) {
            return false;
        }
        J0 j02 = (J0) obj;
        return n5.D.a(this.f19963a, j02.f19963a) && n5.D.a(this.f19964b, j02.f19964b) && this.f19965c == j02.f19965c && this.f19966d == j02.f19966d && this.f19967e == j02.f19967e && this.f19968f == j02.f19968f && n5.D.a(this.f19969u, j02.f19969u);
    }

    public final int f(int i7) {
        return this.f19969u.a(i7).a(-1);
    }

    public final boolean g(int i7) {
        Q4.b bVar = this.f19969u;
        return i7 == bVar.f8645a - 1 && bVar.b(i7);
    }

    public final boolean h(int i7) {
        return this.f19969u.a(i7).f8637v;
    }

    public final int hashCode() {
        Object obj = this.f19963a;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f19964b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f19965c) * 31;
        long j = this.f19966d;
        int i7 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j10 = this.f19967e;
        return this.f19969u.hashCode() + ((((i7 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f19968f ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i7, long j, long j10, Q4.b bVar, boolean z8) {
        this.f19963a = obj;
        this.f19964b = obj2;
        this.f19965c = i7;
        this.f19966d = j;
        this.f19967e = j10;
        this.f19969u = bVar;
        this.f19968f = z8;
    }
}
