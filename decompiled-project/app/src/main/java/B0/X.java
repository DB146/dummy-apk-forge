package B0;

import A0.AbstractC0017g;
import A0.InterfaceC0024m;
import a0.InterfaceC0689p;
import android.R;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import i0.C1288a;
import j0.AbstractC1362A;
import j0.C1368f;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u.AbstractC2060m;
import u.C2046I;
import u.C2070x;
import y0.AbstractC2328M;
import y0.InterfaceC2345m;

/* loaded from: classes.dex */
public abstract class X implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f1807a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: b, reason: collision with root package name */
    public static final i0.c f1808b = new i0.c(0.0f, 0.0f, 10.0f, 10.0f);

    public static final void a(H0.n nVar, z1.e eVar) {
        Object g = nVar.f4505d.f4494a.g(H0.q.f4557v);
        if (g == null) {
            g = null;
        }
        H0.f fVar = (H0.f) g;
        if (P.a(nVar)) {
            if (fVar == null ? false : H0.f.a(5, 8)) {
                return;
            }
            H0.t tVar = H0.h.f4490w;
            C2046I c2046i = nVar.f4505d.f4494a;
            Object g2 = c2046i.g(tVar);
            if (g2 == null) {
                g2 = null;
            }
            H0.a aVar = (H0.a) g2;
            if (aVar != null) {
                eVar.b(new z1.d(R.id.accessibilityActionPageUp, aVar.f4460a));
            }
            Object g10 = c2046i.g(H0.h.f4492y);
            if (g10 == null) {
                g10 = null;
            }
            H0.a aVar2 = (H0.a) g10;
            if (aVar2 != null) {
                eVar.b(new z1.d(R.id.accessibilityActionPageDown, aVar2.f4460a));
            }
            Object g11 = c2046i.g(H0.h.f4491x);
            if (g11 == null) {
                g11 = null;
            }
            H0.a aVar3 = (H0.a) g11;
            if (aVar3 != null) {
                eVar.b(new z1.d(R.id.accessibilityActionPageLeft, aVar3.f4460a));
            }
            Object g12 = c2046i.g(H0.h.f4493z);
            H0.a aVar4 = (H0.a) (g12 != null ? g12 : null);
            if (aVar4 != null) {
                eVar.b(new z1.d(R.id.accessibilityActionPageRight, aVar4.f4460a));
            }
        }
    }

    public static final boolean b(Object obj) {
        if (obj instanceof InterfaceC0689p) {
            InterfaceC0689p interfaceC0689p = (InterfaceC0689p) obj;
            if (interfaceC0689p.a() != Q.S.f8365c && interfaceC0689p.a() != Q.S.f8368f && interfaceC0689p.a() != Q.S.f8366d) {
                return false;
            }
            Object value = interfaceC0689p.getValue();
            if (value == null) {
                return true;
            }
            return b(value);
        }
        if ((obj instanceof Db.c) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = f1807a;
        for (int i7 = 0; i7 < 7; i7++) {
            if (clsArr[i7].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final int c(float f4) {
        return ((int) (f4 >= 0.0f ? Math.ceil(f4) : Math.floor(f4))) * (-1);
    }

    public static final float d(int i7, int i10, float[] fArr, float[] fArr2) {
        int i11 = i7 * 4;
        return (fArr[i11 + 3] * fArr2[12 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11] * fArr2[i10]);
    }

    public static final C2070x e(H0.o oVar) {
        H0.n a9 = oVar.a();
        A0.L l10 = a9.f4504c;
        if (!l10.G() || !l10.F()) {
            C2070x c2070x = AbstractC2060m.f24696a;
            kotlin.jvm.internal.l.c(c2070x, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return c2070x;
        }
        C2070x c2070x2 = new C2070x(48);
        i0.c e2 = a9.e();
        f(new Region(Math.round(e2.f18174a), Math.round(e2.f18175b), Math.round(e2.f18176c), Math.round(e2.f18177d)), a9, c2070x2, a9, new Region());
        return c2070x2;
    }

    public static final void f(Region region, H0.n nVar, C2070x c2070x, H0.n nVar2, Region region2) {
        A0.L l10;
        InterfaceC0024m t5;
        boolean G9 = nVar2.f4504c.G();
        A0.L l11 = nVar2.f4504c;
        boolean z8 = (G9 && l11.F()) ? false : true;
        boolean isEmpty = region.isEmpty();
        int i7 = nVar.g;
        int i10 = nVar2.g;
        if (!isEmpty || i10 == i7) {
            if (!z8 || nVar2.f4506e) {
                H0.i iVar = nVar2.f4505d;
                boolean z10 = iVar.f4496c;
                InterfaceC0024m interfaceC0024m = nVar2.f4502a;
                if (z10 && (t5 = y7.u0.t(l11)) != null) {
                    interfaceC0024m = t5;
                }
                c0.l lVar = ((c0.l) interfaceC0024m).f14113a;
                Object g = iVar.f4494a.g(H0.h.f4472b);
                if (g == null) {
                    g = null;
                }
                boolean z11 = g != null;
                boolean z12 = lVar.f14113a.f14112B;
                i0.c cVar = i0.c.f18173e;
                if (z12) {
                    if (z11) {
                        A0.n0 r10 = AbstractC0017g.r(lVar, 8);
                        if (r10.t0().f14112B) {
                            InterfaceC2345m g2 = AbstractC2328M.g(r10);
                            C1288a c1288a = r10.f285M;
                            if (c1288a == null) {
                                c1288a = new C1288a();
                                r10.f285M = c1288a;
                            }
                            long j02 = r10.j0(r10.s0());
                            int i11 = (int) (j02 >> 32);
                            c1288a.f18168a = -Float.intBitsToFloat(i11);
                            int i12 = (int) (j02 & 4294967295L);
                            c1288a.f18169b = -Float.intBitsToFloat(i12);
                            c1288a.f18170c = Float.intBitsToFloat(i11) + r10.I();
                            c1288a.f18171d = Float.intBitsToFloat(i12) + r10.H();
                            while (true) {
                                if (r10 == g2) {
                                    cVar = new i0.c(c1288a.f18168a, c1288a.f18169b, c1288a.f18170c, c1288a.f18171d);
                                    break;
                                }
                                r10.K0(c1288a, false, true);
                                if (c1288a.b()) {
                                    break;
                                }
                                r10 = r10.f275B;
                                kotlin.jvm.internal.l.b(r10);
                            }
                        }
                    } else {
                        A0.n0 r11 = AbstractC0017g.r(lVar, 8);
                        cVar = AbstractC2328M.g(r11).x(r11, true);
                    }
                }
                int round = Math.round(cVar.f18174a);
                int round2 = Math.round(cVar.f18175b);
                int round3 = Math.round(cVar.f18176c);
                int round4 = Math.round(cVar.f18177d);
                region2.set(round, round2, round3, round4);
                if (i10 == i7) {
                    i10 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (nVar2.f4506e) {
                        H0.n j = nVar2.j();
                        i0.c e2 = (j == null || (l10 = j.f4504c) == null || !l10.G()) ? f1808b : j.e();
                        c2070x.g(i10, new X0(nVar2, new Rect(Math.round(e2.f18174a), Math.round(e2.f18175b), Math.round(e2.f18176c), Math.round(e2.f18177d))));
                        return;
                    } else {
                        if (i10 == -1) {
                            c2070x.g(i10, new X0(nVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                c2070x.g(i10, new X0(nVar2, region2.getBounds()));
                List h10 = H0.n.h(4, nVar2);
                for (int size = h10.size() - 1; -1 < size; size--) {
                    if (!((H0.n) h10.get(size)).i().f4494a.c(H0.q.f4559x)) {
                        f(region, nVar, c2070x, (H0.n) h10.get(size), region2);
                    }
                }
                if (j(nVar2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final K0.C g(H0.i iVar) {
        Rb.c cVar;
        ArrayList arrayList = new ArrayList();
        Object g = iVar.f4494a.g(H0.h.f4471a);
        if (g == null) {
            g = null;
        }
        H0.a aVar = (H0.a) g;
        if (aVar == null || (cVar = (Rb.c) aVar.f4461b) == null || !((Boolean) cVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (K0.C) arrayList.get(0);
    }

    public static final boolean h(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f4 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[9];
        float f19 = fArr[10];
        float f20 = fArr[11];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[14];
        float f24 = fArr[15];
        float f25 = (f4 * f14) - (f10 * f13);
        float f26 = (f4 * f15) - (f11 * f13);
        float f27 = (f4 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (f30 * f31) + (((f28 * f33) + ((f27 * f34) + ((f25 * f36) - (f26 * f35)))) - (f29 * f32));
        if (f37 != 0.0f) {
            float f38 = 1.0f / f37;
            fArr2[0] = ((f16 * f34) + ((f14 * f36) - (f15 * f35))) * f38;
            fArr2[1] = (((f11 * f35) + ((-f10) * f36)) - (f12 * f34)) * f38;
            fArr2[2] = ((f24 * f28) + ((f22 * f30) - (f23 * f29))) * f38;
            fArr2[3] = (((f19 * f29) + ((-f18) * f30)) - (f20 * f28)) * f38;
            float f39 = -f13;
            fArr2[4] = (((f15 * f33) + (f39 * f36)) - (f16 * f32)) * f38;
            fArr2[5] = ((f12 * f32) + ((f36 * f4) - (f11 * f33))) * f38;
            float f40 = -f21;
            fArr2[6] = (((f23 * f27) + (f40 * f30)) - (f24 * f26)) * f38;
            fArr2[7] = ((f20 * f26) + ((f30 * f17) - (f19 * f27))) * f38;
            fArr2[8] = ((f16 * f31) + ((f13 * f35) - (f14 * f33))) * f38;
            fArr2[9] = (((f33 * f10) + ((-f4) * f35)) - (f12 * f31)) * f38;
            fArr2[10] = ((f24 * f25) + ((f21 * f29) - (f22 * f27))) * f38;
            fArr2[11] = (((f27 * f18) + ((-f17) * f29)) - (f20 * f25)) * f38;
            fArr2[12] = (((f14 * f32) + (f39 * f34)) - (f15 * f31)) * f38;
            fArr2[13] = ((f11 * f31) + ((f4 * f34) - (f10 * f32))) * f38;
            fArr2[14] = (((f22 * f26) + (f40 * f28)) - (f23 * f25)) * f38;
            fArr2[15] = ((f19 * f25) + ((f17 * f28) - (f18 * f26))) * f38;
        }
        return !(f37 == 0.0f);
    }

    public static final boolean i(H0.n nVar) {
        A0.n0 c10 = nVar.c();
        if (!(c10 != null ? c10.B0() : false)) {
            H0.t tVar = H0.q.f4539a;
            H0.t tVar2 = H0.q.f4550o;
            H0.i iVar = nVar.f4505d;
            if (!iVar.f4494a.c(tVar2)) {
                if (!iVar.f4494a.c(H0.q.f4549n)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean j(H0.n nVar) {
        if (i(nVar)) {
            return false;
        }
        H0.i iVar = nVar.f4505d;
        if (!iVar.f4496c) {
            C2046I c2046i = iVar.f4494a;
            Object[] objArr = c2046i.f24604b;
            Object[] objArr2 = c2046i.f24605c;
            long[] jArr = c2046i.f24603a;
            int length = jArr.length - 2;
            if (length < 0) {
                return false;
            }
            int i7 = 0;
            loop0: while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            int i12 = (i7 << 3) + i11;
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            if (((H0.t) obj).f4566c) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        return false;
                    }
                }
                if (i7 == length) {
                    return false;
                }
                i7++;
            }
        }
        return true;
    }

    public static final boolean k(AbstractC1362A abstractC1362A, float f4, float f10) {
        float f11;
        float f12;
        boolean m10;
        float f13 = f4;
        if (!(abstractC1362A instanceof j0.w)) {
            if (!(abstractC1362A instanceof j0.x)) {
                if (abstractC1362A instanceof j0.v) {
                    return l(((j0.v) abstractC1362A).f18559e, f13, f10);
                }
                throw new Db.d(1);
            }
            i0.d dVar = ((j0.x) abstractC1362A).f18561e;
            float f14 = dVar.f18178a;
            if (f13 < f14) {
                return false;
            }
            float f15 = dVar.f18180c;
            if (f13 >= f15) {
                return false;
            }
            float f16 = dVar.f18179b;
            if (f10 < f16) {
                return false;
            }
            float f17 = dVar.f18181d;
            if (f10 >= f17) {
                return false;
            }
            long j = dVar.f18182e;
            int i7 = (int) (j >> 32);
            float intBitsToFloat = Float.intBitsToFloat(i7);
            long j10 = dVar.f18183f;
            int i10 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i10) + intBitsToFloat <= dVar.b()) {
                long j11 = dVar.f18184h;
                int i11 = (int) (j11 >> 32);
                float intBitsToFloat2 = Float.intBitsToFloat(i11);
                long j12 = dVar.g;
                int i12 = (int) (j12 >> 32);
                if (Float.intBitsToFloat(i12) + intBitsToFloat2 <= dVar.b()) {
                    int i13 = (int) (j & 4294967295L);
                    int i14 = (int) (j11 & 4294967295L);
                    if (Float.intBitsToFloat(i14) + Float.intBitsToFloat(i13) <= dVar.a()) {
                        int i15 = (int) (j10 & 4294967295L);
                        int i16 = (int) (4294967295L & j12);
                        if (Float.intBitsToFloat(i16) + Float.intBitsToFloat(i15) <= dVar.a()) {
                            float intBitsToFloat3 = Float.intBitsToFloat(i7) + f14;
                            float intBitsToFloat4 = Float.intBitsToFloat(i13) + f16;
                            float intBitsToFloat5 = f15 - Float.intBitsToFloat(i10);
                            float intBitsToFloat6 = Float.intBitsToFloat(i15) + f16;
                            float intBitsToFloat7 = f15 - Float.intBitsToFloat(i12);
                            float intBitsToFloat8 = f17 - Float.intBitsToFloat(i16);
                            float intBitsToFloat9 = f17 - Float.intBitsToFloat(i14);
                            float intBitsToFloat10 = f14 + Float.intBitsToFloat(i11);
                            if (f4 < intBitsToFloat3) {
                                f12 = f10;
                                if (f12 < intBitsToFloat4) {
                                    m10 = m(f4, f10, intBitsToFloat3, intBitsToFloat4, dVar.f18182e);
                                    return m10;
                                }
                            } else {
                                f12 = f10;
                            }
                            if (f4 < intBitsToFloat10 && f12 > intBitsToFloat9) {
                                m10 = m(f4, f10, intBitsToFloat10, intBitsToFloat9, dVar.f18184h);
                            } else if (f4 > intBitsToFloat5 && f12 < intBitsToFloat6) {
                                m10 = m(f4, f10, intBitsToFloat5, intBitsToFloat6, dVar.f18183f);
                            } else if (f4 > intBitsToFloat7 && f12 > intBitsToFloat8) {
                                m10 = m(f4, f10, intBitsToFloat7, intBitsToFloat8, dVar.g);
                            }
                            return m10;
                        }
                    }
                }
                f13 = f4;
                f11 = f10;
            } else {
                f11 = f10;
            }
            C1368f a9 = j0.h.a();
            j0.z.a(a9, dVar);
            return l(a9, f13, f11);
        }
        i0.c cVar = ((j0.w) abstractC1362A).f18560e;
        if (cVar.f18174a > f13 || f13 >= cVar.f18176c || cVar.f18175b > f10 || f10 >= cVar.f18177d) {
            return false;
        }
        return true;
    }

    public static final boolean l(j0.z zVar, float f4, float f10) {
        float f11 = f4 - 0.005f;
        float f12 = f10 - 0.005f;
        float f13 = f4 + 0.005f;
        float f14 = f10 + 0.005f;
        C1368f a9 = j0.h.a();
        j0.y[] yVarArr = j0.y.f18563a;
        if (Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13) || Float.isNaN(f14)) {
            j0.h.b("Invalid rectangle, make sure no value is NaN");
        }
        if (a9.f18540b == null) {
            a9.f18540b = new RectF();
        }
        RectF rectF = a9.f18540b;
        kotlin.jvm.internal.l.b(rectF);
        rectF.set(f11, f12, f13, f14);
        RectF rectF2 = a9.f18540b;
        kotlin.jvm.internal.l.b(rectF2);
        a9.f18539a.addRect(rectF2, Path.Direction.CCW);
        C1368f a10 = j0.h.a();
        a10.getClass();
        Path.Op op = Path.Op.INTERSECT;
        if (!(zVar instanceof C1368f)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C1368f) zVar).f18539a;
        if (!(a9 instanceof C1368f)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        a10.f18539a.op(path, a9.f18539a, op);
        boolean isEmpty = a10.f18539a.isEmpty();
        a10.b();
        a9.b();
        return !isEmpty;
    }

    public static final boolean m(float f4, float f10, float f11, float f12, long j) {
        float f13 = f4 - f11;
        float f14 = f10 - f12;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f14 * f14) / (intBitsToFloat2 * intBitsToFloat2)) + ((f13 * f13) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final void n(float[] fArr, float[] fArr2) {
        float d10 = d(0, 0, fArr2, fArr);
        float d11 = d(0, 1, fArr2, fArr);
        float d12 = d(0, 2, fArr2, fArr);
        float d13 = d(0, 3, fArr2, fArr);
        float d14 = d(1, 0, fArr2, fArr);
        float d15 = d(1, 1, fArr2, fArr);
        float d16 = d(1, 2, fArr2, fArr);
        float d17 = d(1, 3, fArr2, fArr);
        float d18 = d(2, 0, fArr2, fArr);
        float d19 = d(2, 1, fArr2, fArr);
        float d20 = d(2, 2, fArr2, fArr);
        float d21 = d(2, 3, fArr2, fArr);
        float d22 = d(3, 0, fArr2, fArr);
        float d23 = d(3, 1, fArr2, fArr);
        float d24 = d(3, 2, fArr2, fArr);
        float d25 = d(3, 3, fArr2, fArr);
        fArr[0] = d10;
        fArr[1] = d11;
        fArr[2] = d12;
        fArr[3] = d13;
        fArr[4] = d14;
        fArr[5] = d15;
        fArr[6] = d16;
        fArr[7] = d17;
        fArr[8] = d18;
        fArr[9] = d19;
        fArr[10] = d20;
        fArr[11] = d21;
        fArr[12] = d22;
        fArr[13] = d23;
        fArr[14] = d24;
        fArr[15] = d25;
    }

    public static final Y0.j o(C0192n0 c0192n0, int i7) {
        Object obj;
        Iterator<T> it = c0192n0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((A0.L) ((Map.Entry) obj).getKey()).f70b == i7) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (Y0.j) entry.getValue();
        }
        return null;
    }

    public static final String p(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String q() {
        if (H0.f.a(5, 0)) {
            return "android.widget.Button";
        }
        if (H0.f.a(5, 1)) {
            return "android.widget.CheckBox";
        }
        if (H0.f.a(5, 3)) {
            return "android.widget.RadioButton";
        }
        if (H0.f.a(5, 5)) {
            return "android.widget.ImageView";
        }
        if (H0.f.a(5, 6)) {
            return "android.widget.Spinner";
        }
        if (H0.f.a(5, 7)) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static void r(View view) {
        try {
            if (!f1.f1889G) {
                f1.f1889G = true;
                if (Build.VERSION.SDK_INT < 28) {
                    f1.f1887E = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    f1.f1888F = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    f1.f1887E = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    f1.f1888F = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = f1.f1887E;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = f1.f1888F;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = f1.f1888F;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = f1.f1887E;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            f1.f1890H = true;
        }
    }
}
