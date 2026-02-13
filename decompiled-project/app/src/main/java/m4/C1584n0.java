package m4;

import P4.AbstractC0453a;
import P4.C0470s;
import P4.C0473v;
import P4.InterfaceC0476y;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import ea.C1111f;
import ia.C1358d;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import r4.C1941m;
import y6.C2401g;
import y6.C2404j;
import y6.C2406l;
import y6.InterfaceC2397c;

/* renamed from: m4.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1584n0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20442a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20443b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20444c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20445d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f20446e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f20447f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f20448h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f20449i;
    public final Object j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public Object f20450l;

    public C1584n0() {
        this.f20443b = new y6.s[4];
        this.f20444c = new Matrix[4];
        this.f20445d = new Matrix[4];
        this.f20446e = new PointF();
        this.f20447f = new Path();
        this.g = new Path();
        this.f20448h = new y6.s();
        this.f20449i = new float[2];
        this.j = new float[2];
        this.k = new Path();
        this.f20450l = new Path();
        this.f20442a = true;
        for (int i7 = 0; i7 < 4; i7++) {
            ((y6.s[]) this.f20443b)[i7] = new y6.s();
            ((Matrix[]) this.f20444c)[i7] = new Matrix();
            ((Matrix[]) this.f20445d)[i7] = new Matrix();
        }
    }

    public C1584n0(C1555I c1555i, n4.f fVar, n5.z zVar, n4.l lVar) {
        this.f20443b = lVar;
        this.g = c1555i;
        this.k = new P4.g0();
        this.f20445d = new IdentityHashMap();
        this.f20446e = new HashMap();
        this.f20444c = new ArrayList();
        this.f20449i = fVar;
        this.j = zVar;
        this.f20447f = new HashMap();
        this.f20448h = new HashSet();
    }

    public L0 a(int i7, ArrayList arrayList, P4.g0 g0Var) {
        if (!arrayList.isEmpty()) {
            this.k = g0Var;
            for (int i10 = i7; i10 < arrayList.size() + i7; i10++) {
                C1582m0 c1582m0 = (C1582m0) arrayList.get(i10 - i7);
                ArrayList arrayList2 = (ArrayList) this.f20444c;
                if (i10 > 0) {
                    C1582m0 c1582m02 = (C1582m0) arrayList2.get(i10 - 1);
                    c1582m0.f20438d = c1582m02.f20435a.f8144C.f8122b.o() + c1582m02.f20438d;
                    c1582m0.f20439e = false;
                    c1582m0.f20437c.clear();
                } else {
                    c1582m0.f20438d = 0;
                    c1582m0.f20439e = false;
                    c1582m0.f20437c.clear();
                }
                int o10 = c1582m0.f20435a.f8144C.f8122b.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((C1582m0) arrayList2.get(i11)).f20438d += o10;
                }
                arrayList2.add(i10, c1582m0);
                ((HashMap) this.f20446e).put(c1582m0.f20436b, c1582m0);
                if (this.f20442a) {
                    g(c1582m0);
                    if (((IdentityHashMap) this.f20445d).isEmpty()) {
                        ((HashSet) this.f20448h).add(c1582m0);
                    } else {
                        C1580l0 c1580l0 = (C1580l0) ((HashMap) this.f20447f).get(c1582m0);
                        if (c1580l0 != null) {
                            c1580l0.f20425a.c(c1580l0.f20426b);
                        }
                    }
                }
            }
        }
        return c();
    }

    public void b(C2404j c2404j, float f4, RectF rectF, C1358d c1358d, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        y6.s[] sVarArr;
        int i7;
        float[] fArr;
        int i10;
        C1584n0 c1584n0 = this;
        path.rewind();
        Path path2 = (Path) c1584n0.f20447f;
        path2.rewind();
        Path path3 = (Path) c1584n0.g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            matrixArr = (Matrix[]) c1584n0.f20445d;
            matrixArr2 = (Matrix[]) c1584n0.f20444c;
            sVarArr = (y6.s[]) c1584n0.f20443b;
            i7 = 4;
            fArr = (float[]) c1584n0.f20449i;
            if (i11 >= 4) {
                break;
            }
            InterfaceC2397c interfaceC2397c = i11 != 1 ? i11 != 2 ? i11 != 3 ? c2404j.f27053f : c2404j.f27052e : c2404j.f27054h : c2404j.g;
            y7.u0 u0Var = i11 != 1 ? i11 != 2 ? i11 != 3 ? c2404j.f27049b : c2404j.f27048a : c2404j.f27051d : c2404j.f27050c;
            y6.s sVar = sVarArr[i11];
            u0Var.getClass();
            u0Var.p(sVar, f4, interfaceC2397c.a(rectF));
            int i12 = i11 + 1;
            float f10 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = (PointF) c1584n0.f20446e;
            if (i11 == 1) {
                i10 = i12;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i11 == 2) {
                i10 = i12;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i11 != 3) {
                i10 = i12;
                pointF.set(rectF.right, rectF.top);
            } else {
                i10 = i12;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f10);
            y6.s sVar2 = sVarArr[i11];
            fArr[0] = sVar2.f27076b;
            fArr[1] = sVar2.f27077c;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f10);
            i11 = i10;
        }
        int i13 = 0;
        while (i13 < i7) {
            y6.s sVar3 = sVarArr[i13];
            sVar3.getClass();
            fArr[0] = 0.0f;
            fArr[1] = sVar3.f27075a;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            sVarArr[i13].b(matrixArr2[i13], path);
            if (c1358d != null) {
                y6.s sVar4 = sVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                C2401g c2401g = (C2401g) c1358d.f18487b;
                BitSet bitSet = c2401g.f27038d;
                sVar4.getClass();
                bitSet.set(i13, false);
                sVar4.a(sVar4.f27079e);
                c2401g.f27036b[i13] = new C2406l(new ArrayList(sVar4.g), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            y6.s sVar5 = sVarArr[i13];
            fArr[0] = sVar5.f27076b;
            fArr[1] = sVar5.f27077c;
            matrixArr2[i13].mapPoints(fArr);
            y6.s sVar6 = sVarArr[i15];
            sVar6.getClass();
            float[] fArr2 = (float[]) c1584n0.j;
            fArr2[0] = 0.0f;
            fArr2[1] = sVar6.f27075a;
            matrixArr2[i15].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            y6.s sVar7 = sVarArr[i13];
            fArr[0] = sVar7.f27076b;
            fArr[1] = sVar7.f27077c;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 1 || i13 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            y6.s sVar8 = (y6.s) c1584n0.f20448h;
            sVar8.d(0.0f, 270.0f, 0.0f);
            (i13 != 1 ? i13 != 2 ? i13 != 3 ? c2404j.j : c2404j.f27055i : c2404j.f27056l : c2404j.k).getClass();
            sVar8.c(max, 0.0f);
            Path path4 = (Path) c1584n0.k;
            path4.reset();
            sVar8.b(matrixArr[i13], path4);
            if (c1584n0.f20442a && (c1584n0.f(path4, i13) || c1584n0.f(path4, i15))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = sVar8.f27075a;
                matrixArr[i13].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                sVar8.b(matrixArr[i13], path2);
            } else {
                sVar8.b(matrixArr[i13], path);
            }
            if (c1358d != null) {
                Matrix matrix2 = matrixArr[i13];
                C2401g c2401g2 = (C2401g) c1358d.f18487b;
                c2401g2.f27038d.set(i13 + 4, false);
                sVar8.a(sVar8.f27079e);
                c2401g2.f27037c[i13] = new C2406l(new ArrayList(sVar8.g), new Matrix(matrix2));
            }
            i7 = 4;
            c1584n0 = this;
            i13 = i14;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public L0 c() {
        ArrayList arrayList = (ArrayList) this.f20444c;
        if (arrayList.isEmpty()) {
            return L0.f20097a;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C1582m0 c1582m0 = (C1582m0) arrayList.get(i10);
            c1582m0.f20438d = i7;
            i7 += c1582m0.f20435a.f8144C.f8122b.o();
        }
        return new B0(arrayList, (P4.g0) this.k);
    }

    public void d() {
        Iterator it = ((HashSet) this.f20448h).iterator();
        while (it.hasNext()) {
            C1582m0 c1582m0 = (C1582m0) it.next();
            if (c1582m0.f20437c.isEmpty()) {
                C1580l0 c1580l0 = (C1580l0) ((HashMap) this.f20447f).get(c1582m0);
                if (c1580l0 != null) {
                    c1580l0.f20425a.c(c1580l0.f20426b);
                }
                it.remove();
            }
        }
    }

    public void e(C1582m0 c1582m0) {
        if (c1582m0.f20439e && c1582m0.f20437c.isEmpty()) {
            C1580l0 c1580l0 = (C1580l0) ((HashMap) this.f20447f).remove(c1582m0);
            c1580l0.getClass();
            C1572h0 c1572h0 = c1580l0.f20426b;
            AbstractC0453a abstractC0453a = c1580l0.f20425a;
            abstractC0453a.q(c1572h0);
            C1111f c1111f = c1580l0.f20427c;
            abstractC0453a.u(c1111f);
            abstractC0453a.s(c1111f);
            ((HashSet) this.f20448h).remove(c1582m0);
        }
    }

    public boolean f(Path path, int i7) {
        Path path2 = (Path) this.f20450l;
        path2.reset();
        ((y6.s[]) this.f20443b)[i7].b(((Matrix[]) this.f20444c)[i7], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [m4.h0, P4.C] */
    /* JADX WARN: Type inference failed for: r4v2, types: [r4.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, P4.H] */
    public void g(C1582m0 c1582m0) {
        C0473v c0473v = c1582m0.f20435a;
        ?? r12 = new P4.C() { // from class: m4.h0
            @Override // P4.C
            public final void a(AbstractC0453a abstractC0453a, L0 l02) {
                ((C1555I) C1584n0.this.g).f19951v.d(22);
            }
        };
        C1111f c1111f = new C1111f(this, c1582m0);
        ((HashMap) this.f20447f).put(c1582m0, new C1580l0(c0473v, r12, c1111f));
        int i7 = n5.D.f21141a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        c0473v.getClass();
        A4.s sVar = c0473v.f7980c;
        sVar.getClass();
        ?? obj = new Object();
        obj.f7866a = handler;
        obj.f7867b = c1111f;
        ((CopyOnWriteArrayList) sVar.f472c).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        C1941m c1941m = c0473v.f7981d;
        c1941m.getClass();
        ?? obj2 = new Object();
        obj2.f23769a = handler2;
        obj2.f23770b = c1111f;
        c1941m.f23773c.add(obj2);
        c0473v.l(r12, (m5.T) this.f20450l, (n4.l) this.f20443b);
    }

    public void h(InterfaceC0476y interfaceC0476y) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f20445d;
        C1582m0 c1582m0 = (C1582m0) identityHashMap.remove(interfaceC0476y);
        c1582m0.getClass();
        c1582m0.f20435a.p(interfaceC0476y);
        c1582m0.f20437c.remove(((C0470s) interfaceC0476y).f8131a);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(c1582m0);
    }

    public void i(int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            ArrayList arrayList = (ArrayList) this.f20444c;
            C1582m0 c1582m0 = (C1582m0) arrayList.remove(i11);
            ((HashMap) this.f20446e).remove(c1582m0.f20436b);
            int i12 = -c1582m0.f20435a.f8144C.f8122b.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((C1582m0) arrayList.get(i13)).f20438d += i12;
            }
            c1582m0.f20439e = true;
            if (this.f20442a) {
                e(c1582m0);
            }
        }
    }
}
