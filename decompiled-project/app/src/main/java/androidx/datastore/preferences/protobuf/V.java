package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0817u f13358a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13359b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f13360c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13361d;

    public V(AbstractC0817u abstractC0817u, String str, Object[] objArr) {
        this.f13358a = abstractC0817u;
        this.f13359b = str;
        this.f13360c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f13361d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.f13361d = i7 | (charAt2 << i11);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final AbstractC0798a a() {
        return this.f13358a;
    }

    public final Object[] b() {
        return this.f13360c;
    }

    public final String c() {
        return this.f13359b;
    }

    public final int d() {
        int i7 = this.f13361d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }
}
