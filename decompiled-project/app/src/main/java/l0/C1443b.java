package l0;

import E5.o;
import Q7.h;
import V0.l;
import android.graphics.Paint;
import android.graphics.Shader;
import j0.AbstractC1362A;
import j0.AbstractC1367e;
import j0.i;
import j0.n;
import j0.z;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1443b implements InterfaceC1445d {

    /* renamed from: a, reason: collision with root package name */
    public final C1442a f19141a;

    /* renamed from: b, reason: collision with root package name */
    public final h f19142b;

    /* renamed from: c, reason: collision with root package name */
    public o f19143c;

    /* renamed from: d, reason: collision with root package name */
    public o f19144d;

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.a, java.lang.Object] */
    public C1443b() {
        V0.d dVar = AbstractC1444c.f19145a;
        l lVar = l.f9982a;
        C1446e c1446e = C1446e.f19146a;
        ?? obj = new Object();
        obj.f19137a = dVar;
        obj.f19138b = lVar;
        obj.f19139c = c1446e;
        obj.f19140d = 0L;
        this.f19141a = obj;
        this.f19142b = new h(this);
    }

    public static o a(C1443b c1443b, long j, AbstractC1444c abstractC1444c, float f4, i iVar, int i7) {
        o c10 = c1443b.c(abstractC1444c);
        if (f4 != 1.0f) {
            j = n.b(j, n.d(j) * f4);
        }
        if (!n.c(AbstractC1362A.b(((Paint) c10.f3713b).getColor()), j)) {
            c10.d(j);
        }
        if (((Shader) c10.f3714c) != null) {
            c10.f3714c = null;
            ((Paint) c10.f3713b).setShader(null);
        }
        if (!kotlin.jvm.internal.l.a((i) c10.f3715d, iVar)) {
            c10.f(iVar);
        }
        if (!AbstractC1362A.j(c10.f3712a, i7)) {
            c10.c(i7);
        }
        if (!AbstractC1362A.k(((Paint) c10.f3713b).isFilterBitmap() ? 1 : 0, 1)) {
            ((Paint) c10.f3713b).setFilterBitmap(!AbstractC1362A.k(1, 0));
        }
        return c10;
    }

    @Override // l0.InterfaceC1445d
    public final void F(long j, long j10, long j11, float f4, AbstractC1444c abstractC1444c, i iVar, int i7) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        this.f19141a.f19139c.p(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i11), a(this, j, abstractC1444c, f4, iVar, i7));
    }

    public final o b(AbstractC1362A abstractC1362A, AbstractC1444c abstractC1444c, float f4, i iVar, int i7, int i10) {
        o c10 = c(abstractC1444c);
        if (abstractC1362A != null) {
            abstractC1362A.f(f4, v(), c10);
        } else {
            if (((Shader) c10.f3714c) != null) {
                c10.f3714c = null;
                ((Paint) c10.f3713b).setShader(null);
            }
            long b2 = AbstractC1362A.b(((Paint) c10.f3713b).getColor());
            long j = n.f18548b;
            if (!n.c(b2, j)) {
                c10.d(j);
            }
            if (((Paint) c10.f3713b).getAlpha() / 255.0f != f4) {
                c10.b(f4);
            }
        }
        if (!kotlin.jvm.internal.l.a((i) c10.f3715d, iVar)) {
            c10.f(iVar);
        }
        if (!AbstractC1362A.j(c10.f3712a, i7)) {
            c10.c(i7);
        }
        if (!AbstractC1362A.k(((Paint) c10.f3713b).isFilterBitmap() ? 1 : 0, i10)) {
            ((Paint) c10.f3713b).setFilterBitmap(!AbstractC1362A.k(i10, 0));
        }
        return c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o c(AbstractC1444c abstractC1444c) {
        int i7;
        int i10;
        int i11 = 0;
        if (kotlin.jvm.internal.l.a(abstractC1444c, C1447f.f19147b)) {
            o oVar = this.f19143c;
            if (oVar != null) {
                return oVar;
            }
            o e2 = AbstractC1362A.e();
            e2.i(0);
            this.f19143c = e2;
            return e2;
        }
        if (!(abstractC1444c instanceof AbstractC1448g)) {
            throw new Db.d(1);
        }
        o oVar2 = this.f19144d;
        if (oVar2 == null) {
            oVar2 = AbstractC1362A.e();
            oVar2.i(1);
            this.f19144d = oVar2;
        }
        Paint paint = (Paint) oVar2.f3713b;
        float strokeWidth = paint.getStrokeWidth();
        ((AbstractC1448g) abstractC1444c).getClass();
        if (strokeWidth != 0.0f) {
            ((Paint) oVar2.f3713b).setStrokeWidth(0.0f);
        }
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i12 = strokeCap == null ? -1 : AbstractC1367e.f18537a[strokeCap.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                i7 = 1;
            } else if (i12 == 3) {
                i7 = 2;
            }
            if (!AbstractC1362A.m(i7, 0)) {
                oVar2.g(0);
            }
            if (paint.getStrokeMiter() != 0.0f) {
                ((Paint) oVar2.f3713b).setStrokeMiter(0.0f);
            }
            Paint.Join strokeJoin = paint.getStrokeJoin();
            i10 = strokeJoin != null ? AbstractC1367e.f18538b[strokeJoin.ordinal()] : -1;
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 2;
                } else if (i10 == 3) {
                    i11 = 1;
                }
            }
            if (!AbstractC1362A.n(i11, 0)) {
                oVar2.h(0);
            }
            if (!kotlin.jvm.internal.l.a(null, null)) {
                ((Paint) oVar2.f3713b).setPathEffect(null);
            }
            return oVar2;
        }
        i7 = 0;
        if (!AbstractC1362A.m(i7, 0)) {
        }
        if (paint.getStrokeMiter() != 0.0f) {
        }
        Paint.Join strokeJoin2 = paint.getStrokeJoin();
        if (strokeJoin2 != null) {
        }
        if (i10 != 1) {
        }
        if (!AbstractC1362A.n(i11, 0)) {
        }
        if (!kotlin.jvm.internal.l.a(null, null)) {
        }
        return oVar2;
    }

    @Override // V0.c
    public final float f() {
        return this.f19141a.f19137a.f();
    }

    @Override // l0.InterfaceC1445d
    public final void g(z zVar, AbstractC1362A abstractC1362A, float f4, AbstractC1444c abstractC1444c, int i7) {
        this.f19141a.f19139c.k(zVar, b(abstractC1362A, abstractC1444c, f4, null, i7, 1));
    }

    @Override // l0.InterfaceC1445d
    public final l getLayoutDirection() {
        return this.f19141a.f19138b;
    }

    @Override // V0.c
    public final float k() {
        return this.f19141a.f19137a.k();
    }

    @Override // l0.InterfaceC1445d
    public final void o(R7.b bVar, long j, long j10, long j11, float f4, i iVar, int i7) {
        this.f19141a.f19139c.h(bVar, j, j10, j11, b(null, C1447f.f19147b, f4, iVar, 3, i7));
    }

    @Override // l0.InterfaceC1445d
    public final h u() {
        return this.f19142b;
    }
}
