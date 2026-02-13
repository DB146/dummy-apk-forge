package M7;

import O7.k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f6826d = new d(1, null, false);

    /* renamed from: e, reason: collision with root package name */
    public static final d f6827e = new d(2, null, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f6828a;

    /* renamed from: b, reason: collision with root package name */
    public final Q7.e f6829b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6830c;

    public d(int i7, Q7.e eVar, boolean z8) {
        this.f6828a = i7;
        this.f6829b = eVar;
        this.f6830c = z8;
        k.c(!z8 || i7 == 2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperationSource{source=");
        int i7 = this.f6828a;
        sb2.append(i7 != 1 ? i7 != 2 ? "null" : "Server" : "User");
        sb2.append(", queryParams=");
        sb2.append(this.f6829b);
        sb2.append(", tagged=");
        sb2.append(this.f6830c);
        sb2.append('}');
        return sb2.toString();
    }
}
