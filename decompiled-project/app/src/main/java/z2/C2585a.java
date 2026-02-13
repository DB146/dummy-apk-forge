package z2;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2585a {

    /* renamed from: a, reason: collision with root package name */
    public final int f28177a;

    /* renamed from: b, reason: collision with root package name */
    public int f28178b;

    /* renamed from: c, reason: collision with root package name */
    public int f28179c;

    /* renamed from: d, reason: collision with root package name */
    public int f28180d;

    /* renamed from: e, reason: collision with root package name */
    public int f28181e;

    /* renamed from: f, reason: collision with root package name */
    public int f28182f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f28183h;

    /* renamed from: i, reason: collision with root package name */
    public int f28184i;
    public final /* synthetic */ b j;

    public C2585a(b bVar, int i7, int i10) {
        this.j = bVar;
        this.f28177a = i7;
        this.f28178b = i10;
        a();
    }

    public final void a() {
        b bVar = this.j;
        int[] iArr = bVar.f28186a;
        int[] iArr2 = bVar.f28187b;
        int i7 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = this.f28177a; i16 <= this.f28178b; i16++) {
            int i17 = iArr[i16];
            i13 += iArr2[i17];
            int i18 = (i17 >> 10) & 31;
            int i19 = (i17 >> 5) & 31;
            int i20 = i17 & 31;
            if (i18 > i10) {
                i10 = i18;
            }
            if (i18 < i7) {
                i7 = i18;
            }
            if (i19 > i11) {
                i11 = i19;
            }
            if (i19 < i14) {
                i14 = i19;
            }
            if (i20 > i12) {
                i12 = i20;
            }
            if (i20 < i15) {
                i15 = i20;
            }
        }
        this.f28180d = i7;
        this.f28181e = i10;
        this.f28182f = i14;
        this.g = i11;
        this.f28183h = i15;
        this.f28184i = i12;
        this.f28179c = i13;
    }

    public final int b() {
        return ((this.f28184i - this.f28183h) + 1) * ((this.g - this.f28182f) + 1) * ((this.f28181e - this.f28180d) + 1);
    }
}
