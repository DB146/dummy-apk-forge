package Y5;

/* renamed from: Y5.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0645q {

    /* renamed from: a, reason: collision with root package name */
    public final String f11881a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11882b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11883c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11884d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11885e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11886f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f11887h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f11888i;
    public final Long j;
    public final Boolean k;

    public C0645q(String str, String str2, long j, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        com.google.android.gms.common.internal.G.d(str);
        com.google.android.gms.common.internal.G.d(str2);
        com.google.android.gms.common.internal.G.b(j >= 0);
        com.google.android.gms.common.internal.G.b(j10 >= 0);
        com.google.android.gms.common.internal.G.b(j11 >= 0);
        com.google.android.gms.common.internal.G.b(j13 >= 0);
        this.f11881a = str;
        this.f11882b = str2;
        this.f11883c = j;
        this.f11884d = j10;
        this.f11885e = j11;
        this.f11886f = j12;
        this.g = j13;
        this.f11887h = l10;
        this.f11888i = l11;
        this.j = l12;
        this.k = bool;
    }

    public final C0645q a(long j) {
        return new C0645q(this.f11881a, this.f11882b, this.f11883c, this.f11884d, this.f11885e, j, this.g, this.f11887h, this.f11888i, this.j, this.k);
    }

    public final C0645q b(Long l10, Long l11, Boolean bool) {
        return new C0645q(this.f11881a, this.f11882b, this.f11883c, this.f11884d, this.f11885e, this.f11886f, this.g, this.f11887h, l10, l11, bool);
    }
}
