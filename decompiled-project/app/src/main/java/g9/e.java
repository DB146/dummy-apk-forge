package g9;

/* loaded from: classes2.dex */
public abstract class e extends d {
    public abstract void q(int i7, StringBuilder sb2);

    public abstract int r(int i7);

    public final void s(StringBuilder sb2, int i7, int i10) {
        int v10 = Q7.h.v(i7, i10, (V8.a) ((Q7.h) this.f1862b).f8695b);
        q(v10, sb2);
        int r10 = r(v10);
        int i11 = 100000;
        for (int i12 = 0; i12 < 5; i12++) {
            if (r10 / i11 == 0) {
                sb2.append('0');
            }
            i11 /= 10;
        }
        sb2.append(r10);
    }
}
