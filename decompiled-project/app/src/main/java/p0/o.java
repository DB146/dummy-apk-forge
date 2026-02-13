package p0;

import Q.C0480b;
import Q.C0487e0;
import a.AbstractC0672a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import j0.AbstractC1362A;
import j0.AbstractC1365c;
import j0.C1364b;
import java.util.function.DoubleUnaryOperator;
import k0.C1403d;
import k0.C1415p;
import k0.C1416q;
import k0.C1417r;
import l0.C1442a;
import l0.C1443b;
import l0.InterfaceC1445d;
import x0.AbstractC2256a;

/* loaded from: classes.dex */
public final class o extends m {

    /* renamed from: b, reason: collision with root package name */
    public final b f23016b;

    /* renamed from: c, reason: collision with root package name */
    public String f23017c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23018d;

    /* renamed from: e, reason: collision with root package name */
    public final C1845a f23019e;

    /* renamed from: f, reason: collision with root package name */
    public kotlin.jvm.internal.m f23020f;
    public final C0487e0 g;

    /* renamed from: h, reason: collision with root package name */
    public j0.i f23021h;

    /* renamed from: i, reason: collision with root package name */
    public final C0487e0 f23022i;
    public long j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public float f23023l;

    /* renamed from: m, reason: collision with root package name */
    public final n f23024m;

    public o(b bVar) {
        this.f23016b = bVar;
        bVar.f22979i = new n(this, 0);
        this.f23017c = "";
        this.f23018d = true;
        this.f23019e = new C1845a();
        this.f23020f = e.f22994c;
        this.g = C0480b.o(null);
        this.f23022i = C0480b.o(new i0.e(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.f23023l = 1.0f;
        this.f23024m = new n(this, 1);
    }

    @Override // p0.m
    public final void a(InterfaceC1445d interfaceC1445d) {
        e(interfaceC1445d, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (j0.AbstractC1362A.j(r8, 3) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0045, code lost:
    
        if (r46 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0032, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (j0.AbstractC1362A.j(r8, 3) == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0163  */
    /* JADX WARN: Type inference failed for: r2v3, types: [j0.q] */
    /* JADX WARN: Type inference failed for: r3v6, types: [j0.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(InterfaceC1445d interfaceC1445d, float f4, j0.i iVar) {
        int i7;
        boolean z8;
        C1845a c1845a;
        long ceil;
        R7.b bVar;
        char c10;
        int i10;
        long j;
        V0.l lVar;
        C0487e0 c0487e0;
        C1845a c1845a2;
        Bitmap createBitmap;
        C1845a c1845a3;
        long j10;
        int i11;
        int i12;
        Bitmap.Config config;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        C1416q c1416q;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb d10;
        ColorSpace colorSpace2;
        ColorSpace.Named named2;
        int i13;
        int i14;
        Bitmap.Config config2;
        ColorSpace.Named named3;
        ColorSpace.Named named4;
        ColorSpace.Named named5;
        ColorSpace.Named named6;
        ColorSpace.Named named7;
        ColorSpace.Named named8;
        ColorSpace.Named named9;
        ColorSpace.Named named10;
        ColorSpace.Named named11;
        ColorSpace.Named named12;
        ColorSpace.Named named13;
        ColorSpace.Named named14;
        ColorSpace.Named named15;
        ColorSpace.Named named16;
        ColorSpace.Named named17;
        ColorSpace.Named named18;
        ColorSpace.Named named19;
        o oVar;
        int i15;
        Bitmap bitmap;
        j0.i iVar2;
        R7.b bVar2;
        R7.b bVar3;
        int i16;
        Bitmap.Config config3;
        Bitmap.Config config4;
        b bVar4 = this.f23016b;
        boolean z10 = bVar4.f22975d;
        C0487e0 c0487e02 = this.g;
        if (z10 && bVar4.f22976e != 16) {
            j0.i iVar3 = (j0.i) c0487e02.getValue();
            int i17 = q.f23027a;
            if (iVar3 != null) {
                int i18 = iVar3.f18545c;
                if (!AbstractC1362A.j(i18, 5)) {
                }
                if (iVar != null) {
                    int i19 = iVar.f18545c;
                    if (!AbstractC1362A.j(i19, 5)) {
                    }
                    i7 = 1;
                }
            }
            z8 = this.f23018d;
            c1845a = this.f23019e;
            if (!z8 && i0.e.a(this.j, interfaceC1445d.v())) {
                bVar3 = c1845a.f22968a;
                if (bVar3 != null) {
                    Bitmap.Config config5 = ((Bitmap) bVar3.f8929b).getConfig();
                    kotlin.jvm.internal.l.b(config5);
                    if (config5 == Bitmap.Config.ALPHA_8) {
                        i16 = 1;
                    } else if (config5 == Bitmap.Config.RGB_565) {
                        i16 = 2;
                    } else if (config5 != Bitmap.Config.ARGB_4444) {
                        int i20 = Build.VERSION.SDK_INT;
                        if (i20 >= 26) {
                            config4 = Bitmap.Config.RGBA_F16;
                            if (config5 == config4) {
                                i16 = 3;
                            }
                        }
                        if (i20 >= 26) {
                            config3 = Bitmap.Config.HARDWARE;
                            if (config5 == config3) {
                                i16 = 4;
                            }
                        }
                    }
                    if (AbstractC1362A.l(i7, i16)) {
                        oVar = this;
                        c0487e0 = c0487e02;
                        c1845a3 = c1845a;
                        if (iVar != null) {
                            iVar2 = iVar;
                        } else {
                            iVar2 = ((j0.i) c0487e0.getValue()) != null ? (j0.i) c0487e0.getValue() : oVar.f23021h;
                        }
                        bVar2 = c1845a3.f22968a;
                        if (bVar2 == null) {
                            AbstractC2256a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                        }
                        InterfaceC1445d.Y(interfaceC1445d, bVar2, c1845a3.f22970c, 0L, f4, iVar2, 0, 858);
                    }
                }
                i16 = 0;
                if (AbstractC1362A.l(i7, i16)) {
                }
            }
            this.f23021h = !AbstractC1362A.l(i7, 1) ? new j0.i(5, bVar4.f22976e) : null;
            float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC1445d.v() >> 32));
            C0487e0 c0487e03 = this.f23022i;
            this.k = intBitsToFloat / Float.intBitsToFloat((int) (((i0.e) c0487e03.getValue()).f18185a >> 32));
            this.f23023l = Float.intBitsToFloat((int) (interfaceC1445d.v() & 4294967295L)) / Float.intBitsToFloat((int) (((i0.e) c0487e03.getValue()).f18185a & 4294967295L));
            ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC1445d.v() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC1445d.v() >> 32)))) << 32);
            V0.l layoutDirection = interfaceC1445d.getLayoutDirection();
            bVar = c1845a.f22968a;
            C1364b c1364b = c1845a.f22969b;
            if (bVar != null && c1364b != null) {
                i15 = (int) (ceil >> 32);
                bitmap = (Bitmap) bVar.f8929b;
                if (i15 <= bitmap.getWidth()) {
                    if (((int) (ceil & 4294967295L)) <= bitmap.getHeight() && AbstractC1362A.l(c1845a.f22971d, i7)) {
                        j10 = ceil;
                        lVar = layoutDirection;
                        c0487e0 = c0487e02;
                        c1845a3 = c1845a;
                        c1845a3.f22970c = j10;
                        long u3 = AbstractC0672a.u(j10);
                        C1443b c1443b = c1845a3.f22972e;
                        C1442a c1442a = c1443b.f19141a;
                        V0.c cVar = c1442a.f19137a;
                        V0.l lVar2 = c1442a.f19138b;
                        j0.l lVar3 = c1442a.f19139c;
                        long j11 = c1442a.f19140d;
                        c1442a.f19137a = interfaceC1445d;
                        c1442a.f19138b = lVar;
                        c1442a.f19139c = c1364b;
                        c1442a.f19140d = u3;
                        c1364b.i();
                        InterfaceC1445d.s(c1443b, j0.n.f18548b, 0L, 0.0f, null, 62);
                        oVar = this;
                        oVar.f23024m.invoke(c1443b);
                        c1364b.g();
                        C1442a c1442a2 = c1443b.f19141a;
                        c1442a2.f19137a = cVar;
                        c1442a2.f19138b = lVar2;
                        c1442a2.f19139c = lVar3;
                        c1442a2.f19140d = j11;
                        ((Bitmap) bVar.f8929b).prepareToDraw();
                        oVar.f23018d = false;
                        oVar.j = interfaceC1445d.v();
                        if (iVar != null) {
                        }
                        bVar2 = c1845a3.f22968a;
                        if (bVar2 == null) {
                        }
                        InterfaceC1445d.Y(interfaceC1445d, bVar2, c1845a3.f22970c, 0L, f4, iVar2, 0, 858);
                    }
                    c10 = ' ';
                    int i21 = (int) (ceil >> c10);
                    int i22 = (int) (ceil & 4294967295L);
                    C1416q c1416q2 = C1403d.f18696e;
                    Bitmap.Config A10 = AbstractC1362A.A(i7);
                    i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 26) {
                        Bitmap.Config A11 = AbstractC1362A.A(i7);
                        if (kotlin.jvm.internal.l.a(c1416q2, c1416q2)) {
                            named19 = ColorSpace.Named.SRGB;
                            colorSpace = ColorSpace.get(named19);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18705q)) {
                            named18 = ColorSpace.Named.ACES;
                            colorSpace = ColorSpace.get(named18);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18706r)) {
                            named17 = ColorSpace.Named.ACESCG;
                            colorSpace = ColorSpace.get(named17);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18703o)) {
                            named16 = ColorSpace.Named.ADOBE_RGB;
                            colorSpace = ColorSpace.get(named16);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.j)) {
                            named15 = ColorSpace.Named.BT2020;
                            colorSpace = ColorSpace.get(named15);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18699i)) {
                            named14 = ColorSpace.Named.BT709;
                            colorSpace = ColorSpace.get(named14);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18708t)) {
                            named13 = ColorSpace.Named.CIE_LAB;
                            colorSpace = ColorSpace.get(named13);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18707s)) {
                            named12 = ColorSpace.Named.CIE_XYZ;
                            colorSpace = ColorSpace.get(named12);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.k)) {
                            named11 = ColorSpace.Named.DCI_P3;
                            colorSpace = ColorSpace.get(named11);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18700l)) {
                            named10 = ColorSpace.Named.DISPLAY_P3;
                            colorSpace = ColorSpace.get(named10);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.g)) {
                            named9 = ColorSpace.Named.EXTENDED_SRGB;
                            colorSpace = ColorSpace.get(named9);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18698h)) {
                            named8 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
                            colorSpace = ColorSpace.get(named8);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18697f)) {
                            named7 = ColorSpace.Named.LINEAR_SRGB;
                            colorSpace = ColorSpace.get(named7);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18701m)) {
                            named6 = ColorSpace.Named.NTSC_1953;
                            colorSpace = ColorSpace.get(named6);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18704p)) {
                            named5 = ColorSpace.Named.PRO_PHOTO_RGB;
                            colorSpace = ColorSpace.get(named5);
                        } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18702n)) {
                            named4 = ColorSpace.Named.SMPTE_C;
                            colorSpace = ColorSpace.get(named4);
                        } else {
                            if (i10 >= 34) {
                                if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18710v)) {
                                    named3 = ColorSpace.Named.BT2020_HLG;
                                    colorSpace2 = ColorSpace.get(named3);
                                } else if (kotlin.jvm.internal.l.a(c1416q2, C1403d.f18711w)) {
                                    named2 = ColorSpace.Named.BT2020_PQ;
                                    colorSpace2 = ColorSpace.get(named2);
                                } else {
                                    colorSpace2 = null;
                                }
                                if (colorSpace2 != null) {
                                    i13 = i21;
                                    j = ceil;
                                    i14 = i22;
                                    lVar = layoutDirection;
                                    c0487e0 = c0487e02;
                                    config2 = A11;
                                    c1845a2 = c1845a;
                                    createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i13, i14, config2, true, colorSpace2);
                                }
                            }
                            if (c1416q2 != null) {
                                float[] a9 = c1416q2.f18739d.a();
                                C1417r c1417r = c1416q2.g;
                                if (c1417r != null) {
                                    j0.p.m();
                                    i11 = i21;
                                    lVar = layoutDirection;
                                    c0487e0 = c0487e02;
                                    j = ceil;
                                    config = A11;
                                    c1845a2 = c1845a;
                                    i12 = i22;
                                    c1416q = c1416q2;
                                    transferParameters = d0.f.f(c1417r.f18751b, c1417r.f18752c, c1417r.f18753d, c1417r.f18754e, c1417r.f18755f, c1417r.g, c1417r.f18750a);
                                } else {
                                    i11 = i21;
                                    j = ceil;
                                    i12 = i22;
                                    c1416q = c1416q2;
                                    lVar = layoutDirection;
                                    c0487e0 = c0487e02;
                                    config = A11;
                                    c1845a2 = c1845a;
                                    transferParameters = null;
                                }
                                if (transferParameters != null) {
                                    j0.p.r();
                                    C1416q c1416q3 = c1416q;
                                    d10 = j0.p.c(c1416q3.f18689a, c1416q3.f18742h, a9, transferParameters);
                                } else {
                                    C1416q c1416q4 = c1416q;
                                    j0.p.r();
                                    String str = c1416q4.f18689a;
                                    final C1415p c1415p = c1416q4.f18744l;
                                    final int i23 = 0;
                                    ?? r22 = new DoubleUnaryOperator() { // from class: j0.q
                                        @Override // java.util.function.DoubleUnaryOperator
                                        public final double applyAsDouble(double d11) {
                                            switch (i23) {
                                                case 0:
                                                    return ((Number) ((C1415p) c1415p).invoke(Double.valueOf(d11))).doubleValue();
                                                default:
                                                    return ((Number) ((C1415p) c1415p).invoke(Double.valueOf(d11))).doubleValue();
                                            }
                                        }
                                    };
                                    final C1415p c1415p2 = c1416q4.f18747o;
                                    final int i24 = 1;
                                    d10 = j0.p.d(str, c1416q4.f18742h, a9, r22, new DoubleUnaryOperator() { // from class: j0.q
                                        @Override // java.util.function.DoubleUnaryOperator
                                        public final double applyAsDouble(double d11) {
                                            switch (i24) {
                                                case 0:
                                                    return ((Number) ((C1415p) c1415p2).invoke(Double.valueOf(d11))).doubleValue();
                                                default:
                                                    return ((Number) ((C1415p) c1415p2).invoke(Double.valueOf(d11))).doubleValue();
                                            }
                                        }
                                    }, c1416q4.f18740e, c1416q4.f18741f);
                                }
                                colorSpace = j0.p.f(d10);
                            } else {
                                i11 = i21;
                                j = ceil;
                                i12 = i22;
                                lVar = layoutDirection;
                                c0487e0 = c0487e02;
                                config = A11;
                                c1845a2 = c1845a;
                                named = ColorSpace.Named.SRGB;
                                colorSpace = ColorSpace.get(named);
                            }
                            colorSpace2 = colorSpace;
                            i13 = i11;
                            config2 = config;
                            i14 = i12;
                            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i13, i14, config2, true, colorSpace2);
                        }
                        i11 = i21;
                        j = ceil;
                        i12 = i22;
                        lVar = layoutDirection;
                        c0487e0 = c0487e02;
                        config = A11;
                        c1845a2 = c1845a;
                        colorSpace2 = colorSpace;
                        i13 = i11;
                        config2 = config;
                        i14 = i12;
                        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i13, i14, config2, true, colorSpace2);
                    } else {
                        j = ceil;
                        lVar = layoutDirection;
                        c0487e0 = c0487e02;
                        c1845a2 = c1845a;
                        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i21, i22, A10);
                        createBitmap.setHasAlpha(true);
                    }
                    bVar = new R7.b(createBitmap, 22);
                    Canvas canvas = AbstractC1365c.f18532a;
                    c1364b = new C1364b();
                    c1364b.f18529a = new Canvas((Bitmap) bVar.f8929b);
                    c1845a3 = c1845a2;
                    c1845a3.f22968a = bVar;
                    c1845a3.f22969b = c1364b;
                    c1845a3.f22971d = i7;
                    j10 = j;
                    c1845a3.f22970c = j10;
                    long u32 = AbstractC0672a.u(j10);
                    C1443b c1443b2 = c1845a3.f22972e;
                    C1442a c1442a3 = c1443b2.f19141a;
                    V0.c cVar2 = c1442a3.f19137a;
                    V0.l lVar22 = c1442a3.f19138b;
                    j0.l lVar32 = c1442a3.f19139c;
                    long j112 = c1442a3.f19140d;
                    c1442a3.f19137a = interfaceC1445d;
                    c1442a3.f19138b = lVar;
                    c1442a3.f19139c = c1364b;
                    c1442a3.f19140d = u32;
                    c1364b.i();
                    InterfaceC1445d.s(c1443b2, j0.n.f18548b, 0L, 0.0f, null, 62);
                    oVar = this;
                    oVar.f23024m.invoke(c1443b2);
                    c1364b.g();
                    C1442a c1442a22 = c1443b2.f19141a;
                    c1442a22.f19137a = cVar2;
                    c1442a22.f19138b = lVar22;
                    c1442a22.f19139c = lVar32;
                    c1442a22.f19140d = j112;
                    ((Bitmap) bVar.f8929b).prepareToDraw();
                    oVar.f23018d = false;
                    oVar.j = interfaceC1445d.v();
                    if (iVar != null) {
                    }
                    bVar2 = c1845a3.f22968a;
                    if (bVar2 == null) {
                    }
                    InterfaceC1445d.Y(interfaceC1445d, bVar2, c1845a3.f22970c, 0L, f4, iVar2, 0, 858);
                }
            }
            c10 = ' ';
            int i212 = (int) (ceil >> c10);
            int i222 = (int) (ceil & 4294967295L);
            C1416q c1416q22 = C1403d.f18696e;
            Bitmap.Config A102 = AbstractC1362A.A(i7);
            i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
            }
            bVar = new R7.b(createBitmap, 22);
            Canvas canvas2 = AbstractC1365c.f18532a;
            c1364b = new C1364b();
            c1364b.f18529a = new Canvas((Bitmap) bVar.f8929b);
            c1845a3 = c1845a2;
            c1845a3.f22968a = bVar;
            c1845a3.f22969b = c1364b;
            c1845a3.f22971d = i7;
            j10 = j;
            c1845a3.f22970c = j10;
            long u322 = AbstractC0672a.u(j10);
            C1443b c1443b22 = c1845a3.f22972e;
            C1442a c1442a32 = c1443b22.f19141a;
            V0.c cVar22 = c1442a32.f19137a;
            V0.l lVar222 = c1442a32.f19138b;
            j0.l lVar322 = c1442a32.f19139c;
            long j1122 = c1442a32.f19140d;
            c1442a32.f19137a = interfaceC1445d;
            c1442a32.f19138b = lVar;
            c1442a32.f19139c = c1364b;
            c1442a32.f19140d = u322;
            c1364b.i();
            InterfaceC1445d.s(c1443b22, j0.n.f18548b, 0L, 0.0f, null, 62);
            oVar = this;
            oVar.f23024m.invoke(c1443b22);
            c1364b.g();
            C1442a c1442a222 = c1443b22.f19141a;
            c1442a222.f19137a = cVar22;
            c1442a222.f19138b = lVar222;
            c1442a222.f19139c = lVar322;
            c1442a222.f19140d = j1122;
            ((Bitmap) bVar.f8929b).prepareToDraw();
            oVar.f23018d = false;
            oVar.j = interfaceC1445d.v();
            if (iVar != null) {
            }
            bVar2 = c1845a3.f22968a;
            if (bVar2 == null) {
            }
            InterfaceC1445d.Y(interfaceC1445d, bVar2, c1845a3.f22970c, 0L, f4, iVar2, 0, 858);
        }
        i7 = 0;
        z8 = this.f23018d;
        c1845a = this.f23019e;
        if (!z8) {
            bVar3 = c1845a.f22968a;
            if (bVar3 != null) {
            }
            i16 = 0;
            if (AbstractC1362A.l(i7, i16)) {
            }
        }
        this.f23021h = !AbstractC1362A.l(i7, 1) ? new j0.i(5, bVar4.f22976e) : null;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1445d.v() >> 32));
        C0487e0 c0487e032 = this.f23022i;
        this.k = intBitsToFloat2 / Float.intBitsToFloat((int) (((i0.e) c0487e032.getValue()).f18185a >> 32));
        this.f23023l = Float.intBitsToFloat((int) (interfaceC1445d.v() & 4294967295L)) / Float.intBitsToFloat((int) (((i0.e) c0487e032.getValue()).f18185a & 4294967295L));
        ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC1445d.v() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC1445d.v() >> 32)))) << 32);
        V0.l layoutDirection2 = interfaceC1445d.getLayoutDirection();
        bVar = c1845a.f22968a;
        C1364b c1364b2 = c1845a.f22969b;
        if (bVar != null) {
            i15 = (int) (ceil >> 32);
            bitmap = (Bitmap) bVar.f8929b;
            if (i15 <= bitmap.getWidth()) {
            }
        }
        c10 = ' ';
        int i2122 = (int) (ceil >> c10);
        int i2222 = (int) (ceil & 4294967295L);
        C1416q c1416q222 = C1403d.f18696e;
        Bitmap.Config A1022 = AbstractC1362A.A(i7);
        i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
        }
        bVar = new R7.b(createBitmap, 22);
        Canvas canvas22 = AbstractC1365c.f18532a;
        c1364b2 = new C1364b();
        c1364b2.f18529a = new Canvas((Bitmap) bVar.f8929b);
        c1845a3 = c1845a2;
        c1845a3.f22968a = bVar;
        c1845a3.f22969b = c1364b2;
        c1845a3.f22971d = i7;
        j10 = j;
        c1845a3.f22970c = j10;
        long u3222 = AbstractC0672a.u(j10);
        C1443b c1443b222 = c1845a3.f22972e;
        C1442a c1442a322 = c1443b222.f19141a;
        V0.c cVar222 = c1442a322.f19137a;
        V0.l lVar2222 = c1442a322.f19138b;
        j0.l lVar3222 = c1442a322.f19139c;
        long j11222 = c1442a322.f19140d;
        c1442a322.f19137a = interfaceC1445d;
        c1442a322.f19138b = lVar;
        c1442a322.f19139c = c1364b2;
        c1442a322.f19140d = u3222;
        c1364b2.i();
        InterfaceC1445d.s(c1443b222, j0.n.f18548b, 0L, 0.0f, null, 62);
        oVar = this;
        oVar.f23024m.invoke(c1443b222);
        c1364b2.g();
        C1442a c1442a2222 = c1443b222.f19141a;
        c1442a2222.f19137a = cVar222;
        c1442a2222.f19138b = lVar2222;
        c1442a2222.f19139c = lVar3222;
        c1442a2222.f19140d = j11222;
        ((Bitmap) bVar.f8929b).prepareToDraw();
        oVar.f23018d = false;
        oVar.j = interfaceC1445d.v();
        if (iVar != null) {
        }
        bVar2 = c1845a3.f22968a;
        if (bVar2 == null) {
        }
        InterfaceC1445d.Y(interfaceC1445d, bVar2, c1845a3.f22970c, 0L, f4, iVar2, 0, 858);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f23017c);
        sb2.append("\n\tviewportWidth: ");
        C0487e0 c0487e0 = this.f23022i;
        sb2.append(Float.intBitsToFloat((int) (((i0.e) c0487e0.getValue()).f18185a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((i0.e) c0487e0.getValue()).f18185a & 4294967295L)));
        sb2.append("\n");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
