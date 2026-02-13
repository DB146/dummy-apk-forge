package y;

import A0.AbstractC0025n;
import A0.InterfaceC0026o;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import ia.C1358d;
import j0.AbstractC1365c;
import j0.C1364b;
import l0.C1443b;
import m0.C1533b;

/* renamed from: y.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2284F extends AbstractC0025n implements InterfaceC0026o {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f26403E = 1;

    /* renamed from: F, reason: collision with root package name */
    public final C2305m f26404F;

    /* renamed from: G, reason: collision with root package name */
    public final y f26405G;

    /* renamed from: H, reason: collision with root package name */
    public Object f26406H;

    public C2284F(u0.y yVar, C2305m c2305m, y yVar2) {
        this.f26404F = c2305m;
        this.f26405G = yVar2;
        p0(yVar);
    }

    public C2284F(u0.y yVar, C2305m c2305m, y yVar2, C.F f4) {
        this.f26404F = c2305m;
        this.f26405G = yVar2;
        this.f26406H = f4;
        p0(yVar);
    }

    public static boolean s0(float f4, EdgeEffect edgeEffect, Canvas canvas) {
        if (f4 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f4);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean t0(float f4, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f4);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // A0.InterfaceC0026o
    public final void t(A0.N n6) {
        boolean z8;
        C2305m c2305m;
        C2305m c2305m2;
        RecordingCanvas beginRecording;
        boolean z10;
        float f4;
        switch (this.f26403E) {
            case 0:
                C1443b c1443b = n6.f90a;
                long v10 = c1443b.v();
                C2305m c2305m3 = this.f26404F;
                c2305m3.i(v10);
                if (i0.e.d(c1443b.v())) {
                    n6.a();
                    return;
                }
                n6.a();
                c2305m3.f26489d.getValue();
                Canvas a9 = AbstractC1365c.a(c1443b.f19142b.x());
                y yVar = this.f26405G;
                boolean f10 = y.f(yVar.f26542f);
                C.F f11 = (C.F) this.f26406H;
                if (f10) {
                    EdgeEffect c10 = yVar.c();
                    float f12 = -Float.intBitsToFloat((int) (c1443b.v() & 4294967295L));
                    z8 = t0(270.0f, (Float.floatToRawIntBits(n6.p(f11.a(n6.getLayoutDirection()))) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32), c10, a9);
                } else {
                    z8 = false;
                }
                if (y.f(yVar.f26540d)) {
                    EdgeEffect e2 = yVar.e();
                    float p10 = n6.p(f11.f2349b);
                    long floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                    int floatToRawIntBits2 = Float.floatToRawIntBits(p10);
                    c2305m = c2305m3;
                    z8 = t0(0.0f, (((long) floatToRawIntBits2) & 4294967295L) | (floatToRawIntBits << 32), e2, a9) || z8;
                } else {
                    c2305m = c2305m3;
                }
                if (y.f(yVar.g)) {
                    EdgeEffect d10 = yVar.d();
                    float p11 = n6.p(f11.b(n6.getLayoutDirection())) + (-Tb.a.F(Float.intBitsToFloat((int) (c1443b.v() >> 32))));
                    long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                    int floatToRawIntBits4 = Float.floatToRawIntBits(p11);
                    c2305m2 = c2305m;
                    z8 = t0(90.0f, (floatToRawIntBits3 << 32) | (((long) floatToRawIntBits4) & 4294967295L), d10, a9) || z8;
                } else {
                    c2305m2 = c2305m;
                }
                if (y.f(yVar.f26541e)) {
                    EdgeEffect b2 = yVar.b();
                    z8 = t0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c1443b.v() & 4294967295L))) + n6.p(f11.f2351d))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c1443b.v() >> 32)))) << 32), b2, a9) || z8;
                }
                if (z8) {
                    c2305m2.d();
                    return;
                }
                return;
            default:
                C1443b c1443b2 = n6.f90a;
                long v11 = c1443b2.v();
                C2305m c2305m4 = this.f26404F;
                c2305m4.i(v11);
                Canvas a10 = AbstractC1365c.a(c1443b2.f19142b.x());
                c2305m4.f26489d.getValue();
                if (i0.e.d(c1443b2.v())) {
                    n6.a();
                    return;
                }
                boolean isHardwareAccelerated = a10.isHardwareAccelerated();
                y yVar2 = this.f26405G;
                if (!isHardwareAccelerated) {
                    EdgeEffect edgeEffect = yVar2.f26540d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = yVar2.f26541e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = yVar2.f26542f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = yVar2.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = yVar2.f26543h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = yVar2.f26544i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = yVar2.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = yVar2.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    n6.a();
                    return;
                }
                float p12 = n6.p(AbstractC2311t.f26526a);
                boolean z11 = y.f(yVar2.f26540d) || y.g(yVar2.f26543h) || y.f(yVar2.f26541e) || y.g(yVar2.f26544i);
                boolean z12 = y.f(yVar2.f26542f) || y.g(yVar2.j) || y.f(yVar2.g) || y.g(yVar2.k);
                if (z11 && z12) {
                    u0().setPosition(0, 0, a10.getWidth(), a10.getHeight());
                } else if (z11) {
                    u0().setPosition(0, 0, (Tb.a.F(p12) * 2) + a10.getWidth(), a10.getHeight());
                } else {
                    if (!z12) {
                        n6.a();
                        return;
                    }
                    u0().setPosition(0, 0, a10.getWidth(), (Tb.a.F(p12) * 2) + a10.getHeight());
                }
                beginRecording = u0().beginRecording();
                if (y.g(yVar2.j)) {
                    EdgeEffect edgeEffect9 = yVar2.j;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = yVar2.a(z.V.f27944b);
                        yVar2.j = edgeEffect9;
                    }
                    s0(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (y.f(yVar2.f26542f)) {
                    EdgeEffect c11 = yVar2.c();
                    z10 = s0(270.0f, c11, beginRecording);
                    if (y.g(yVar2.f26542f)) {
                        float intBitsToFloat = Float.intBitsToFloat((int) (c2305m4.c() & 4294967295L));
                        EdgeEffect edgeEffect10 = yVar2.j;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = yVar2.a(z.V.f27944b);
                            yVar2.j = edgeEffect10;
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        float b10 = i7 >= 31 ? l3.d.b(c11) : 0.0f;
                        float f13 = 1 - intBitsToFloat;
                        if (i7 >= 31) {
                            l3.d.d(edgeEffect10, b10, f13);
                        } else {
                            edgeEffect10.onPull(b10, f13);
                        }
                    }
                } else {
                    z10 = false;
                }
                if (y.g(yVar2.f26543h)) {
                    EdgeEffect edgeEffect11 = yVar2.f26543h;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = yVar2.a(z.V.f27943a);
                        yVar2.f26543h = edgeEffect11;
                    }
                    s0(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (y.f(yVar2.f26540d)) {
                    EdgeEffect e10 = yVar2.e();
                    z10 = s0(0.0f, e10, beginRecording) || z10;
                    if (y.g(yVar2.f26540d)) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (c2305m4.c() >> 32));
                        EdgeEffect edgeEffect12 = yVar2.f26543h;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = yVar2.a(z.V.f27943a);
                            yVar2.f26543h = edgeEffect12;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        float b11 = i10 >= 31 ? l3.d.b(e10) : 0.0f;
                        if (i10 >= 31) {
                            l3.d.d(edgeEffect12, b11, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(b11, intBitsToFloat2);
                        }
                    }
                }
                if (y.g(yVar2.k)) {
                    EdgeEffect edgeEffect13 = yVar2.k;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = yVar2.a(z.V.f27944b);
                        yVar2.k = edgeEffect13;
                    }
                    s0(270.0f, edgeEffect13, beginRecording);
                    edgeEffect13.finish();
                }
                if (y.f(yVar2.g)) {
                    EdgeEffect d11 = yVar2.d();
                    z10 = s0(90.0f, d11, beginRecording) || z10;
                    if (y.g(yVar2.g)) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (c2305m4.c() & 4294967295L));
                        EdgeEffect edgeEffect14 = yVar2.k;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = yVar2.a(z.V.f27944b);
                            yVar2.k = edgeEffect14;
                        }
                        int i11 = Build.VERSION.SDK_INT;
                        float b12 = i11 >= 31 ? l3.d.b(d11) : 0.0f;
                        if (i11 >= 31) {
                            l3.d.d(edgeEffect14, b12, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(b12, intBitsToFloat3);
                        }
                    }
                }
                if (y.g(yVar2.f26544i)) {
                    EdgeEffect edgeEffect15 = yVar2.f26544i;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = yVar2.a(z.V.f27943a);
                        yVar2.f26544i = edgeEffect15;
                    }
                    f4 = 0.0f;
                    s0(0.0f, edgeEffect15, beginRecording);
                    edgeEffect15.finish();
                } else {
                    f4 = 0.0f;
                }
                if (y.f(yVar2.f26541e)) {
                    EdgeEffect b13 = yVar2.b();
                    boolean z13 = s0(180.0f, b13, beginRecording) || z10;
                    if (y.g(yVar2.f26541e)) {
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (c2305m4.c() >> 32));
                        EdgeEffect edgeEffect16 = yVar2.f26544i;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = yVar2.a(z.V.f27943a);
                            yVar2.f26544i = edgeEffect16;
                        }
                        int i12 = Build.VERSION.SDK_INT;
                        float b14 = i12 >= 31 ? l3.d.b(b13) : f4;
                        float f14 = 1 - intBitsToFloat4;
                        if (i12 >= 31) {
                            l3.d.d(edgeEffect16, b14, f14);
                        } else {
                            edgeEffect16.onPull(b14, f14);
                        }
                    }
                    z10 = z13;
                }
                if (z10) {
                    c2305m4.d();
                }
                float f15 = z12 ? 0.0f : p12;
                if (z11) {
                    p12 = 0.0f;
                }
                V0.l layoutDirection = n6.getLayoutDirection();
                C1364b c1364b = new C1364b();
                c1364b.f18529a = beginRecording;
                long v12 = c1443b2.v();
                V0.c y10 = c1443b2.f19142b.y();
                V0.l B10 = c1443b2.f19142b.B();
                j0.l x2 = c1443b2.f19142b.x();
                long D10 = c1443b2.f19142b.D();
                Q7.h hVar = c1443b2.f19142b;
                C1533b c1533b = (C1533b) hVar.f8696c;
                hVar.Q(n6);
                hVar.S(layoutDirection);
                hVar.P(c1364b);
                hVar.U(v12);
                hVar.f8696c = null;
                c1364b.i();
                try {
                    ((C1358d) c1443b2.f19142b.f8695b).u(f15, p12);
                    try {
                        n6.a();
                        float f16 = -f15;
                        float f17 = -p12;
                        ((C1358d) c1443b2.f19142b.f8695b).u(f16, f17);
                        c1364b.g();
                        Q7.h hVar2 = c1443b2.f19142b;
                        hVar2.Q(y10);
                        hVar2.S(B10);
                        hVar2.P(x2);
                        hVar2.U(D10);
                        hVar2.f8696c = c1533b;
                        u0().endRecording();
                        int save = a10.save();
                        a10.translate(f16, f17);
                        a10.drawRenderNode(u0());
                        a10.restoreToCount(save);
                        return;
                    } catch (Throwable th) {
                        ((C1358d) c1443b2.f19142b.f8695b).u(-f15, -p12);
                        throw th;
                    }
                } catch (Throwable th2) {
                    c1364b.g();
                    Q7.h hVar3 = c1443b2.f19142b;
                    hVar3.Q(y10);
                    hVar3.S(B10);
                    hVar3.P(x2);
                    hVar3.U(D10);
                    hVar3.f8696c = c1533b;
                    throw th2;
                }
        }
    }

    public RenderNode u0() {
        RenderNode renderNode = (RenderNode) this.f26406H;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode d10 = qc.a.d();
        this.f26406H = d10;
        return d10;
    }
}
