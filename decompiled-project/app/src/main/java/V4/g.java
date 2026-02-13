package V4;

import r4.C1936h;

/* loaded from: classes.dex */
public abstract class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f10066a;

    /* renamed from: b, reason: collision with root package name */
    public final f f10067b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10068c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10069d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10070e;

    /* renamed from: f, reason: collision with root package name */
    public final C1936h f10071f;

    /* renamed from: u, reason: collision with root package name */
    public final String f10072u;

    /* renamed from: v, reason: collision with root package name */
    public final String f10073v;

    /* renamed from: w, reason: collision with root package name */
    public final long f10074w;

    /* renamed from: x, reason: collision with root package name */
    public final long f10075x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f10076y;

    public g(String str, f fVar, long j, int i7, long j10, C1936h c1936h, String str2, String str3, long j11, long j12, boolean z8) {
        this.f10066a = str;
        this.f10067b = fVar;
        this.f10068c = j;
        this.f10069d = i7;
        this.f10070e = j10;
        this.f10071f = c1936h;
        this.f10072u = str2;
        this.f10073v = str3;
        this.f10074w = j11;
        this.f10075x = j12;
        this.f10076y = z8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j = this.f10070e;
        if (j > longValue) {
            return 1;
        }
        return j < l10.longValue() ? -1 : 0;
    }
}
