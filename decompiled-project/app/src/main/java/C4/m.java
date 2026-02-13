package C4;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final s4.v f2769a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2770b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2771c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2772d;

    /* renamed from: e, reason: collision with root package name */
    public int f2773e;

    /* renamed from: f, reason: collision with root package name */
    public int f2774f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f2775h;

    public m(s4.v vVar) {
        this.f2769a = vVar;
    }

    public final void a(int i7, byte[] bArr, int i10) {
        if (this.f2771c) {
            int i11 = this.f2774f;
            int i12 = (i7 + 1) - i11;
            if (i12 >= i10) {
                this.f2774f = (i10 - i7) + i11;
            } else {
                this.f2772d = ((bArr[i12] & 192) >> 6) == 0;
                this.f2771c = false;
            }
        }
    }
}
