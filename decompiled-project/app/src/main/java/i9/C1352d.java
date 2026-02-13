package i9;

import H2.r0;
import ea.C1112g;

/* renamed from: i9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1352d extends C1112g {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18475d;

    public C1352d(C1350b c1350b, boolean z8) {
        super(c1350b);
        this.f18475d = z8;
    }

    public final r0 k() {
        C1349a c1349a = new C1349a();
        C1349a c1349a2 = new C1349a();
        C1349a c1349a3 = new C1349a();
        C1349a c1349a4 = new C1349a();
        r0[] r0VarArr = (r0[]) this.f16841c;
        for (r0 r0Var : r0VarArr) {
            if (r0Var != null) {
                r0Var.d();
                int i7 = r0Var.f4796e % 30;
                int i10 = r0Var.f4797f;
                if (!this.f18475d) {
                    i10 += 2;
                }
                int i11 = i10 % 3;
                if (i11 == 0) {
                    c1349a2.b((i7 * 3) + 1);
                } else if (i11 == 1) {
                    c1349a4.b(i7 / 3);
                    c1349a3.b(i7 % 3);
                } else if (i11 == 2) {
                    c1349a.b(i7 + 1);
                }
            }
        }
        if (c1349a.a().length == 0 || c1349a2.a().length == 0 || c1349a3.a().length == 0 || c1349a4.a().length == 0 || c1349a.a()[0] < 1 || c1349a2.a()[0] + c1349a3.a()[0] < 3 || c1349a2.a()[0] + c1349a3.a()[0] > 90) {
            return null;
        }
        r0 r0Var2 = new r0(c1349a.a()[0], c1349a2.a()[0], c1349a3.a()[0], c1349a4.a()[0], 2, (byte) 0);
        l(r0VarArr, r0Var2);
        return r0Var2;
    }

    public final void l(r0[] r0VarArr, r0 r0Var) {
        for (int i7 = 0; i7 < r0VarArr.length; i7++) {
            r0 r0Var2 = r0VarArr[i7];
            if (r0Var2 != null) {
                int i10 = r0Var2.f4796e % 30;
                int i11 = r0Var2.f4797f;
                if (i11 > r0Var.f4797f) {
                    r0VarArr[i7] = null;
                } else {
                    if (!this.f18475d) {
                        i11 += 2;
                    }
                    int i12 = i11 % 3;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2 && i10 + 1 != r0Var.f4793b) {
                                r0VarArr[i7] = null;
                            }
                        } else if (i10 / 3 != r0Var.f4794c || i10 % 3 != r0Var.f4796e) {
                            r0VarArr[i7] = null;
                        }
                    } else if ((i10 * 3) + 1 != r0Var.f4795d) {
                        r0VarArr[i7] = null;
                    }
                }
            }
        }
    }

    @Override // ea.C1112g
    public final String toString() {
        return "IsLeft: " + this.f18475d + '\n' + super.toString();
    }
}
