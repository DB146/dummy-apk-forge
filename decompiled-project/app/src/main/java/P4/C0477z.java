package P4;

/* renamed from: P4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0477z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8158b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8159c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8160d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8161e;

    public C0477z(C0477z c0477z) {
        this.f8157a = c0477z.f8157a;
        this.f8158b = c0477z.f8158b;
        this.f8159c = c0477z.f8159c;
        this.f8160d = c0477z.f8160d;
        this.f8161e = c0477z.f8161e;
    }

    public C0477z(Object obj) {
        this(obj, -1L);
    }

    public C0477z(Object obj, int i7, int i10, long j, int i11) {
        this.f8157a = obj;
        this.f8158b = i7;
        this.f8159c = i10;
        this.f8160d = j;
        this.f8161e = i11;
    }

    public C0477z(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean a() {
        return this.f8158b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0477z)) {
            return false;
        }
        C0477z c0477z = (C0477z) obj;
        return this.f8157a.equals(c0477z.f8157a) && this.f8158b == c0477z.f8158b && this.f8159c == c0477z.f8159c && this.f8160d == c0477z.f8160d && this.f8161e == c0477z.f8161e;
    }

    public final int hashCode() {
        return ((((((((this.f8157a.hashCode() + 527) * 31) + this.f8158b) * 31) + this.f8159c) * 31) + ((int) this.f8160d)) * 31) + this.f8161e;
    }
}
