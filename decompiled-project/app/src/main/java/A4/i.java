package A4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: d, reason: collision with root package name */
    public int f391d;

    /* renamed from: a, reason: collision with root package name */
    public int f388a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f389b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f390c = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f392e = new int[16];

    public i() {
        this.f391d = r0.length - 1;
    }

    @Override // A4.g
    public int a() {
        return -1;
    }

    public void b(int i7) {
        int i10 = this.f390c;
        int[] iArr = (int[]) this.f392e;
        if (i10 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i11 = this.f388a;
            int i12 = length2 - i11;
            System.arraycopy(iArr, i11, iArr2, 0, i12);
            System.arraycopy((int[]) this.f392e, 0, iArr2, i12, i11);
            this.f388a = 0;
            this.f389b = this.f390c - 1;
            this.f392e = iArr2;
            this.f391d = length - 1;
        }
        int i13 = (this.f389b + 1) & this.f391d;
        this.f389b = i13;
        ((int[]) this.f392e)[i13] = i7;
        this.f390c++;
    }

    @Override // A4.g
    public int c() {
        return this.f388a;
    }

    public int d() {
        int i7 = this.f390c;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.f392e;
        int i10 = this.f388a;
        int i11 = iArr[i10];
        this.f388a = (i10 + 1) & this.f391d;
        this.f390c = i7 - 1;
        return i11;
    }

    @Override // A4.g
    public int i() {
        n5.v vVar = (n5.v) this.f392e;
        int i7 = this.f389b;
        if (i7 == 8) {
            return vVar.v();
        }
        if (i7 == 16) {
            return vVar.A();
        }
        int i10 = this.f390c;
        this.f390c = i10 + 1;
        if (i10 % 2 != 0) {
            return this.f391d & 15;
        }
        int v10 = vVar.v();
        this.f391d = v10;
        return (v10 & 240) >> 4;
    }
}
