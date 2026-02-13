package c3;

import q1.C1877c;

/* renamed from: c3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0894k extends AbstractC0893j {

    /* renamed from: a, reason: collision with root package name */
    public C1877c[] f14296a;

    /* renamed from: b, reason: collision with root package name */
    public String f14297b;

    /* renamed from: c, reason: collision with root package name */
    public int f14298c;

    public AbstractC0894k() {
        this.f14296a = null;
        this.f14298c = 0;
    }

    public AbstractC0894k(AbstractC0894k abstractC0894k) {
        this.f14296a = null;
        this.f14298c = 0;
        this.f14297b = abstractC0894k.f14297b;
        this.f14296a = tc.b.r(abstractC0894k.f14296a);
    }

    public C1877c[] getPathData() {
        return this.f14296a;
    }

    public String getPathName() {
        return this.f14297b;
    }

    public void setPathData(C1877c[] c1877cArr) {
        C1877c[] c1877cArr2 = this.f14296a;
        boolean z8 = false;
        if (c1877cArr2 != null && c1877cArr != null && c1877cArr2.length == c1877cArr.length) {
            int i7 = 0;
            while (true) {
                if (i7 >= c1877cArr2.length) {
                    z8 = true;
                    break;
                }
                C1877c c1877c = c1877cArr2[i7];
                char c10 = c1877c.f23345a;
                C1877c c1877c2 = c1877cArr[i7];
                if (c10 != c1877c2.f23345a || c1877c.f23346b.length != c1877c2.f23346b.length) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        if (!z8) {
            this.f14296a = tc.b.r(c1877cArr);
            return;
        }
        C1877c[] c1877cArr3 = this.f14296a;
        for (int i10 = 0; i10 < c1877cArr.length; i10++) {
            c1877cArr3[i10].f23345a = c1877cArr[i10].f23345a;
            int i11 = 0;
            while (true) {
                float[] fArr = c1877cArr[i10].f23346b;
                if (i11 < fArr.length) {
                    c1877cArr3[i10].f23346b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }
}
