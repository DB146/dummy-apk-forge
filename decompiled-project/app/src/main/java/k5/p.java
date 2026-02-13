package k5;

import N6.A0;
import N6.AbstractC0452z;
import N6.r0;
import N6.t0;
import P4.m0;
import m4.AbstractC1565e;
import m4.L;
import n5.D;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f18941A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f18942B;

    /* renamed from: C, reason: collision with root package name */
    public final int f18943C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f18944D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f18945E;

    /* renamed from: F, reason: collision with root package name */
    public final int f18946F;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18947e;

    /* renamed from: f, reason: collision with root package name */
    public final i f18948f;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f18949u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f18950v;

    /* renamed from: w, reason: collision with root package name */
    public final int f18951w;

    /* renamed from: x, reason: collision with root package name */
    public final int f18952x;

    /* renamed from: y, reason: collision with root package name */
    public final int f18953y;

    /* renamed from: z, reason: collision with root package name */
    public final int f18954z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(int i7, m0 m0Var, int i10, i iVar, int i11, int i12, boolean z8) {
        super(i7, m0Var, i10);
        boolean z10;
        boolean z11;
        int i13;
        t0 t0Var;
        String str;
        boolean z12;
        L l10;
        boolean z13;
        L l11;
        int i14;
        int i15;
        float f4;
        int i16;
        L l12;
        int i17;
        int i18;
        int i19;
        int i20 = 4;
        int i21 = 0;
        this.f18948f = iVar;
        int i22 = iVar.f18913Q ? 24 : 16;
        this.f18942B = iVar.f18912P && (i12 & i22) != 0;
        if (z8 && (((i17 = (l12 = this.f18940d).f20068E) == -1 || i17 <= iVar.f19005a) && ((i18 = l12.f20069F) == -1 || i18 <= iVar.f19006b))) {
            float f10 = l12.f20070G;
            if ((f10 == -1.0f || f10 <= iVar.f19007c) && ((i19 = l12.f20092v) == -1 || i19 <= iVar.f19008d)) {
                z10 = true;
                this.f18947e = z10;
                if (z8 && (((i14 = (l11 = this.f18940d).f20068E) == -1 || i14 >= iVar.f19009e) && ((i15 = l11.f20069F) == -1 || i15 >= iVar.f19010f))) {
                    f4 = l11.f20070G;
                    if ((f4 != -1.0f || f4 >= iVar.f19011u) && ((i16 = l11.f20092v) == -1 || i16 >= iVar.f19012v)) {
                        z11 = true;
                        this.f18949u = z11;
                        this.f18950v = q.e(i11, false);
                        L l13 = this.f18940d;
                        this.f18951w = l13.f20092v;
                        this.f18952x = l13.b();
                        this.f18954z = q.a(this.f18940d.f20089e, iVar.f18992A);
                        int i23 = this.f18940d.f20089e;
                        this.f18941A = (i23 == 0 && (i23 & 1) == 0) ? false : true;
                        i13 = 0;
                        while (true) {
                            t0Var = iVar.f19016z;
                            if (i13 < t0Var.size()) {
                                i13 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                                break;
                            }
                            String str2 = this.f18940d.f20096z;
                            if (str2 != null && str2.equals(t0Var.get(i13))) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        this.f18953y = i13;
                        this.f18944D = AbstractC1565e.g(i11) != 128;
                        this.f18945E = AbstractC1565e.h(i11) != 64;
                        str = this.f18940d.f20096z;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -1851077871:
                                    if (str.equals("video/dolby-vision")) {
                                        z12 = false;
                                        break;
                                    }
                                    z12 = -1;
                                    break;
                                case -1662735862:
                                    if (str.equals("video/av01")) {
                                        z12 = true;
                                        break;
                                    }
                                    z12 = -1;
                                    break;
                                case -1662541442:
                                    if (str.equals("video/hevc")) {
                                        z12 = 2;
                                        break;
                                    }
                                    z12 = -1;
                                    break;
                                case 1331836730:
                                    if (str.equals("video/avc")) {
                                        z12 = 3;
                                        break;
                                    }
                                    z12 = -1;
                                    break;
                                case 1599127257:
                                    if (str.equals("video/x-vnd.on2.vp9")) {
                                        z12 = 4;
                                        break;
                                    }
                                    z12 = -1;
                                    break;
                                default:
                                    z12 = -1;
                                    break;
                            }
                            switch (z12) {
                                case false:
                                    i20 = 5;
                                    break;
                                case true:
                                    i20 = 3;
                                    break;
                                case true:
                                    i20 = 1;
                                    break;
                                case true:
                                    i20 = 2;
                                    break;
                            }
                            this.f18946F = i20;
                            l10 = this.f18940d;
                            if ((l10.f20089e & 16384) == 0) {
                                i iVar2 = this.f18948f;
                                if (q.e(i11, iVar2.f18921Y) && ((z13 = this.f18947e) || iVar2.f18911O)) {
                                    i21 = (!q.e(i11, false) || !this.f18949u || !z13 || l10.f20092v == -1 || iVar2.L || iVar2.f19002K || (i22 & i11) == 0) ? 1 : 2;
                                }
                            }
                            this.f18943C = i21;
                        }
                        i20 = 0;
                        this.f18946F = i20;
                        l10 = this.f18940d;
                        if ((l10.f20089e & 16384) == 0) {
                        }
                        this.f18943C = i21;
                    }
                }
                z11 = false;
                this.f18949u = z11;
                this.f18950v = q.e(i11, false);
                L l132 = this.f18940d;
                this.f18951w = l132.f20092v;
                this.f18952x = l132.b();
                this.f18954z = q.a(this.f18940d.f20089e, iVar.f18992A);
                int i232 = this.f18940d.f20089e;
                this.f18941A = (i232 == 0 && (i232 & 1) == 0) ? false : true;
                i13 = 0;
                while (true) {
                    t0Var = iVar.f19016z;
                    if (i13 < t0Var.size()) {
                    }
                    i13++;
                }
                this.f18953y = i13;
                this.f18944D = AbstractC1565e.g(i11) != 128;
                this.f18945E = AbstractC1565e.h(i11) != 64;
                str = this.f18940d.f20096z;
                if (str != null) {
                }
                i20 = 0;
                this.f18946F = i20;
                l10 = this.f18940d;
                if ((l10.f20089e & 16384) == 0) {
                }
                this.f18943C = i21;
            }
        }
        z10 = false;
        this.f18947e = z10;
        if (z8) {
            f4 = l11.f20070G;
            if (f4 != -1.0f) {
            }
            z11 = true;
            this.f18949u = z11;
            this.f18950v = q.e(i11, false);
            L l1322 = this.f18940d;
            this.f18951w = l1322.f20092v;
            this.f18952x = l1322.b();
            this.f18954z = q.a(this.f18940d.f20089e, iVar.f18992A);
            int i2322 = this.f18940d.f20089e;
            this.f18941A = (i2322 == 0 && (i2322 & 1) == 0) ? false : true;
            i13 = 0;
            while (true) {
                t0Var = iVar.f19016z;
                if (i13 < t0Var.size()) {
                }
                i13++;
            }
            this.f18953y = i13;
            this.f18944D = AbstractC1565e.g(i11) != 128;
            this.f18945E = AbstractC1565e.h(i11) != 64;
            str = this.f18940d.f20096z;
            if (str != null) {
            }
            i20 = 0;
            this.f18946F = i20;
            l10 = this.f18940d;
            if ((l10.f20089e & 16384) == 0) {
            }
            this.f18943C = i21;
        }
        z11 = false;
        this.f18949u = z11;
        this.f18950v = q.e(i11, false);
        L l13222 = this.f18940d;
        this.f18951w = l13222.f20092v;
        this.f18952x = l13222.b();
        this.f18954z = q.a(this.f18940d.f20089e, iVar.f18992A);
        int i23222 = this.f18940d.f20089e;
        this.f18941A = (i23222 == 0 && (i23222 & 1) == 0) ? false : true;
        i13 = 0;
        while (true) {
            t0Var = iVar.f19016z;
            if (i13 < t0Var.size()) {
            }
            i13++;
        }
        this.f18953y = i13;
        this.f18944D = AbstractC1565e.g(i11) != 128;
        this.f18945E = AbstractC1565e.h(i11) != 64;
        str = this.f18940d.f20096z;
        if (str != null) {
        }
        i20 = 0;
        this.f18946F = i20;
        l10 = this.f18940d;
        if ((l10.f20089e & 16384) == 0) {
        }
        this.f18943C = i21;
    }

    public static int d(p pVar, p pVar2) {
        AbstractC0452z c10 = AbstractC0452z.f7375a.c(pVar.f18950v, pVar2.f18950v).a(pVar.f18954z, pVar2.f18954z).c(pVar.f18941A, pVar2.f18941A).c(pVar.f18947e, pVar2.f18947e).c(pVar.f18949u, pVar2.f18949u);
        Integer valueOf = Integer.valueOf(pVar.f18953y);
        Integer valueOf2 = Integer.valueOf(pVar2.f18953y);
        r0.f7332a.getClass();
        AbstractC0452z b2 = c10.b(valueOf, valueOf2, A0.f7209a);
        boolean z8 = pVar2.f18944D;
        boolean z10 = pVar.f18944D;
        AbstractC0452z c11 = b2.c(z10, z8);
        boolean z11 = pVar2.f18945E;
        boolean z12 = pVar.f18945E;
        AbstractC0452z c12 = c11.c(z12, z11);
        if (z10 && z12) {
            c12 = c12.a(pVar.f18946F, pVar2.f18946F);
        }
        return c12.e();
    }

    @Override // k5.o
    public final int a() {
        return this.f18943C;
    }

    @Override // k5.o
    public final boolean b(o oVar) {
        p pVar = (p) oVar;
        if (this.f18942B || D.a(this.f18940d.f20096z, pVar.f18940d.f20096z)) {
            if (!this.f18948f.f18914R) {
                if (this.f18944D != pVar.f18944D || this.f18945E != pVar.f18945E) {
                }
            }
            return true;
        }
        return false;
    }
}
