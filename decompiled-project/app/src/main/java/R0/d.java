package R0;

import A0.J;
import E5.o;
import Q.I0;
import Q7.h;
import U0.l;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import j0.AbstractC1362A;
import j0.C;
import j0.F;
import j0.k;
import j0.n;
import l0.AbstractC1444c;
import l0.AbstractC1448g;
import l0.C1447f;
import y7.u0;

/* loaded from: classes.dex */
public final class d extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public o f8794a;

    /* renamed from: b, reason: collision with root package name */
    public l f8795b;

    /* renamed from: c, reason: collision with root package name */
    public int f8796c;

    /* renamed from: d, reason: collision with root package name */
    public C f8797d;

    /* renamed from: e, reason: collision with root package name */
    public n f8798e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1362A f8799f;
    public Q.C g;

    /* renamed from: h, reason: collision with root package name */
    public i0.e f8800h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC1444c f8801i;

    public final o a() {
        o oVar = this.f8794a;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(this);
        this.f8794a = oVar2;
        return oVar2;
    }

    public final void b(int i7) {
        if (AbstractC1362A.j(i7, this.f8796c)) {
            return;
        }
        a().c(i7);
        this.f8796c = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if ((r1 == null ? false : i0.e.a(r1.f18185a, r7)) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(AbstractC1362A abstractC1362A, long j, float f4) {
        if (abstractC1362A == null) {
            this.g = null;
            this.f8799f = null;
            this.f8800h = null;
            setShader(null);
            return;
        }
        if (abstractC1362A instanceof F) {
            d(q3.f.w(((F) abstractC1362A).f18525e, f4));
            return;
        }
        if (abstractC1362A instanceof k) {
            if (kotlin.jvm.internal.l.a(this.f8799f, abstractC1362A)) {
                i0.e eVar = this.f8800h;
            }
            if (j != 9205357640488583168L) {
                this.f8799f = abstractC1362A;
                this.f8800h = new i0.e(j);
                J j10 = new J(abstractC1362A, j);
                h hVar = I0.f8308a;
                this.g = new Q.C(j10, null);
            }
            o a9 = a();
            Q.C c10 = this.g;
            Shader shader = c10 != null ? (Shader) c10.getValue() : null;
            a9.f3714c = shader;
            ((Paint) a9.f3713b).setShader(shader);
            this.f8798e = null;
            u0.G(this, f4);
        }
    }

    public final void d(long j) {
        n nVar = this.f8798e;
        if (nVar == null ? false : n.c(nVar.f18554a, j)) {
            return;
        }
        if (j != 16) {
            this.f8798e = new n(j);
            setColor(AbstractC1362A.z(j));
            this.g = null;
            this.f8799f = null;
            this.f8800h = null;
            setShader(null);
        }
    }

    public final void e(AbstractC1444c abstractC1444c) {
        if (abstractC1444c == null || kotlin.jvm.internal.l.a(this.f8801i, abstractC1444c)) {
            return;
        }
        this.f8801i = abstractC1444c;
        if (abstractC1444c.equals(C1447f.f19147b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (abstractC1444c instanceof AbstractC1448g) {
            a().i(1);
            ((Paint) a().f3713b).setStrokeWidth(0.0f);
            ((Paint) a().f3713b).setStrokeMiter(0.0f);
            a().h(0);
            a().g(0);
            ((Paint) a().f3713b).setPathEffect(null);
        }
    }

    public final void f(C c10) {
        if (c10 == null || kotlin.jvm.internal.l.a(this.f8797d, c10)) {
            return;
        }
        this.f8797d = c10;
        if (c10.equals(C.f18511d)) {
            clearShadowLayer();
            return;
        }
        C c11 = this.f8797d;
        float f4 = c11.f18514c;
        if (f4 == 0.0f) {
            f4 = Float.MIN_VALUE;
        }
        setShadowLayer(f4, Float.intBitsToFloat((int) (c11.f18513b >> 32)), Float.intBitsToFloat((int) (this.f8797d.f18513b & 4294967295L)), AbstractC1362A.z(this.f8797d.f18512a));
    }

    public final void g(l lVar) {
        if (lVar == null || kotlin.jvm.internal.l.a(this.f8795b, lVar)) {
            return;
        }
        this.f8795b = lVar;
        int i7 = lVar.f9434a;
        setUnderlineText((i7 | 1) == i7);
        l lVar2 = this.f8795b;
        lVar2.getClass();
        int i10 = lVar2.f9434a;
        setStrikeThruText((i10 | 2) == i10);
    }
}
