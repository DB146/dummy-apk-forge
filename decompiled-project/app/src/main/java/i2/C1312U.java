package i2;

/* renamed from: i2.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1312U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18232a;

    /* renamed from: b, reason: collision with root package name */
    public int f18233b;

    /* renamed from: c, reason: collision with root package name */
    public int f18234c;

    /* renamed from: d, reason: collision with root package name */
    public int f18235d;

    /* renamed from: e, reason: collision with root package name */
    public int f18236e;

    public C1312U() {
        this.f18232a = 0;
        this.f18234c = Integer.MIN_VALUE;
        this.f18233b = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public C1312U(int i7, int i10, int i11, int i12) {
        this.f18232a = 1;
        this.f18233b = i7;
        this.f18234c = i10;
        this.f18235d = i11;
        this.f18236e = i12;
    }

    public int a(int i7) {
        int i10;
        int i11;
        int i12 = (int) ((0 * 50.0f) / 100.0f);
        int i13 = this.f18234c;
        boolean z8 = i13 == Integer.MIN_VALUE;
        int i14 = this.f18233b;
        boolean z10 = i14 == Integer.MAX_VALUE;
        return (z8 || i7 - i13 > i12) ? (z10 || i14 - i7 > 0 - i12) ? i7 - i12 : (z8 || i14 >= (i10 = this.f18236e)) ? i14 : i10 : (z10 || i13 <= (i11 = this.f18235d)) ? i13 : i11;
    }

    public boolean b(int i7) {
        if (i7 == 1) {
            if (this.f18233b - this.f18234c <= 1) {
                return false;
            }
        } else if (this.f18235d - this.f18236e <= 1) {
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.f18232a) {
            case 0:
                return " min:" + this.f18234c + " " + this.f18236e + " max:" + this.f18233b + " " + this.f18235d;
            default:
                return super.toString();
        }
    }
}
