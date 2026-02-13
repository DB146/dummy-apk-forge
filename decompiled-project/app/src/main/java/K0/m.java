package K0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final C0371a f5916a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5918c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5919d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5920e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5921f;
    public final float g;

    public m(C0371a c0371a, int i7, int i10, int i11, int i12, float f4, float f10) {
        this.f5916a = c0371a;
        this.f5917b = i7;
        this.f5918c = i10;
        this.f5919d = i11;
        this.f5920e = i12;
        this.f5921f = f4;
        this.g = f10;
    }

    public final int a(int i7) {
        int i10 = this.f5918c;
        int i11 = this.f5917b;
        return h3.H.k(i7, i11, i10) - i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f5916a.equals(mVar.f5916a) && this.f5917b == mVar.f5917b && this.f5918c == mVar.f5918c && this.f5919d == mVar.f5919d && this.f5920e == mVar.f5920e && Float.compare(this.f5921f, mVar.f5921f) == 0 && Float.compare(this.g, mVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + h3.o.e(this.f5921f, A3.c.c(this.f5920e, A3.c.c(this.f5919d, A3.c.c(this.f5918c, A3.c.c(this.f5917b, this.f5916a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.f5916a + ", startIndex=" + this.f5917b + ", endIndex=" + this.f5918c + ", startLineIndex=" + this.f5919d + ", endLineIndex=" + this.f5920e + ", top=" + this.f5921f + ", bottom=" + this.g + ')';
    }
}
