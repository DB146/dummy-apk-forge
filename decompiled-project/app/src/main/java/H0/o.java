package H0;

import A0.L;
import B0.D;
import K0.C0374d;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import d0.C1034b;
import d0.C1035c;
import u.C2042E;
import u.C2070x;
import u.y;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final L f4508a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4509b;

    /* renamed from: c, reason: collision with root package name */
    public final C2070x f4510c;

    /* renamed from: d, reason: collision with root package name */
    public final C2042E f4511d = new C2042E(2);

    public o(L l10, d dVar, C2070x c2070x) {
        this.f4508a = l10;
        this.f4509b = dVar;
        this.f4510c = c2070x;
    }

    public final n a() {
        return new n(this.f4509b, false, this.f4508a, new i());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (r5.f4494a.b(H0.q.f4551p) == true) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(L l10, i iVar) {
        String str;
        boolean z8;
        boolean z10;
        AutofillValue forText;
        C2042E c2042e = this.f4511d;
        Object[] objArr = c2042e.f24584a;
        int i7 = c2042e.f24585b;
        for (int i10 = 0; i10 < i7; i10++) {
            C1034b c1034b = (C1034b) objArr[i10];
            c1034b.getClass();
            i v10 = l10.v();
            int i11 = l10.f70b;
            String str2 = null;
            if (iVar != null) {
                Object g = iVar.f4494a.g(q.f4529B);
                if (g == null) {
                    g = null;
                }
                C0374d c0374d = (C0374d) g;
                if (c0374d != null) {
                    str = c0374d.f5871b;
                    if (v10 != null) {
                        Object g2 = v10.f4494a.g(q.f4529B);
                        if (g2 == null) {
                            g2 = null;
                        }
                        C0374d c0374d2 = (C0374d) g2;
                        if (c0374d2 != null) {
                            str2 = c0374d2.f5871b;
                        }
                    }
                    z8 = true;
                    if (str != str2) {
                        D d10 = c1034b.f16302c;
                        R7.a aVar = c1034b.f16300a;
                        if (str == null) {
                            aVar.E(d10, i11, true);
                        } else if (str2 == null) {
                            aVar.E(d10, i11, false);
                        } else if (kotlin.jvm.internal.l.a((C1035c) vc.i.u(v10, q.f4552q), d0.j.f16310a)) {
                            forText = AutofillValue.forText(str2.toString());
                            ((AutofillManager) aVar.f8927b).notifyValueChanged(d10, i11, forText);
                        }
                    }
                    if (iVar != null) {
                        if (iVar.f4494a.b(q.f4551p)) {
                            z10 = true;
                            if (v10 != null) {
                            }
                            z8 = false;
                            if (z10 != z8) {
                                y yVar = c1034b.g;
                                if (z8) {
                                    yVar.a(i11);
                                } else {
                                    yVar.e(i11);
                                }
                            }
                        }
                    }
                    z10 = false;
                    if (v10 != null) {
                    }
                    z8 = false;
                    if (z10 != z8) {
                    }
                }
            }
            str = null;
            if (v10 != null) {
            }
            z8 = true;
            if (str != str2) {
            }
            if (iVar != null) {
            }
            z10 = false;
            if (v10 != null) {
            }
            z8 = false;
            if (z10 != z8) {
            }
        }
    }
}
