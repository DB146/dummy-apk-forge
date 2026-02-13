package S3;

import A3.k;
import A3.l;
import A3.p;
import C3.m;
import J3.AbstractC0341e;
import J3.o;
import J3.t;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import u.T;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: D, reason: collision with root package name */
    public boolean f8993D;

    /* renamed from: E, reason: collision with root package name */
    public Resources.Theme f8994E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8995F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8997H;

    /* renamed from: a, reason: collision with root package name */
    public int f8998a;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f9001d;

    /* renamed from: e, reason: collision with root package name */
    public int f9002e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f9003f;

    /* renamed from: u, reason: collision with root package name */
    public int f9004u;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9009z;

    /* renamed from: b, reason: collision with root package name */
    public m f8999b = m.f2580d;

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.g f9000c = com.bumptech.glide.g.f14635c;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9005v = true;

    /* renamed from: w, reason: collision with root package name */
    public int f9006w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f9007x = -1;

    /* renamed from: y, reason: collision with root package name */
    public A3.h f9008y = V3.c.f10030b;

    /* renamed from: A, reason: collision with root package name */
    public l f8990A = new l();

    /* renamed from: B, reason: collision with root package name */
    public W3.c f8991B = new T(0);

    /* renamed from: C, reason: collision with root package name */
    public Class f8992C = Object.class;

    /* renamed from: G, reason: collision with root package name */
    public boolean f8996G = true;

    public static boolean i(int i7, int i10) {
        return (i7 & i10) != 0;
    }

    public a a(a aVar) {
        if (this.f8995F) {
            return clone().a(aVar);
        }
        int i7 = aVar.f8998a;
        if (i(aVar.f8998a, 1048576)) {
            this.f8997H = aVar.f8997H;
        }
        if (i(aVar.f8998a, 4)) {
            this.f8999b = aVar.f8999b;
        }
        if (i(aVar.f8998a, 8)) {
            this.f9000c = aVar.f9000c;
        }
        if (i(aVar.f8998a, 16)) {
            this.f9001d = aVar.f9001d;
            this.f9002e = 0;
            this.f8998a &= -33;
        }
        if (i(aVar.f8998a, 32)) {
            this.f9002e = aVar.f9002e;
            this.f9001d = null;
            this.f8998a &= -17;
        }
        if (i(aVar.f8998a, 64)) {
            this.f9003f = aVar.f9003f;
            this.f9004u = 0;
            this.f8998a &= -129;
        }
        if (i(aVar.f8998a, 128)) {
            this.f9004u = aVar.f9004u;
            this.f9003f = null;
            this.f8998a &= -65;
        }
        if (i(aVar.f8998a, 256)) {
            this.f9005v = aVar.f9005v;
        }
        if (i(aVar.f8998a, 512)) {
            this.f9007x = aVar.f9007x;
            this.f9006w = aVar.f9006w;
        }
        if (i(aVar.f8998a, 1024)) {
            this.f9008y = aVar.f9008y;
        }
        if (i(aVar.f8998a, 4096)) {
            this.f8992C = aVar.f8992C;
        }
        if (i(aVar.f8998a, 8192)) {
            this.f8998a &= -16385;
        }
        if (i(aVar.f8998a, 16384)) {
            this.f8998a &= -8193;
        }
        if (i(aVar.f8998a, 32768)) {
            this.f8994E = aVar.f8994E;
        }
        if (i(aVar.f8998a, 131072)) {
            this.f9009z = aVar.f9009z;
        }
        if (i(aVar.f8998a, 2048)) {
            this.f8991B.putAll(aVar.f8991B);
            this.f8996G = aVar.f8996G;
        }
        this.f8998a |= aVar.f8998a;
        this.f8990A.f360b.g(aVar.f8990A.f360b);
        p();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [J3.e, java.lang.Object] */
    public final a b() {
        return v(o.f5482d, new Object());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [W3.c, u.T, u.e] */
    @Override // 
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            l lVar = new l();
            aVar.f8990A = lVar;
            lVar.f360b.g(this.f8990A.f360b);
            ?? t5 = new T(0);
            aVar.f8991B = t5;
            t5.putAll(this.f8991B);
            aVar.f8993D = false;
            aVar.f8995F = false;
            return aVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final a d(Class cls) {
        if (this.f8995F) {
            return clone().d(cls);
        }
        this.f8992C = cls;
        this.f8998a |= 4096;
        p();
        return this;
    }

    public final a e(m mVar) {
        if (this.f8995F) {
            return clone().e(mVar);
        }
        this.f8999b = mVar;
        this.f8998a |= 4;
        p();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return h((a) obj);
        }
        return false;
    }

    public final a f(int i7) {
        if (this.f8995F) {
            return clone().f(i7);
        }
        this.f9002e = i7;
        int i10 = this.f8998a | 32;
        this.f9001d = null;
        this.f8998a = i10 & (-17);
        p();
        return this;
    }

    public final a g(Drawable drawable) {
        if (this.f8995F) {
            return clone().g(drawable);
        }
        this.f9001d = drawable;
        int i7 = this.f8998a | 16;
        this.f9002e = 0;
        this.f8998a = i7 & (-33);
        p();
        return this;
    }

    public final boolean h(a aVar) {
        aVar.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.f9002e == aVar.f9002e && W3.o.b(this.f9001d, aVar.f9001d) && this.f9004u == aVar.f9004u && W3.o.b(this.f9003f, aVar.f9003f) && W3.o.b(null, null) && this.f9005v == aVar.f9005v && this.f9006w == aVar.f9006w && this.f9007x == aVar.f9007x && this.f9009z == aVar.f9009z && this.f8999b.equals(aVar.f8999b) && this.f9000c == aVar.f9000c && this.f8990A.equals(aVar.f8990A) && this.f8991B.equals(aVar.f8991B) && this.f8992C.equals(aVar.f8992C) && this.f9008y.equals(aVar.f9008y) && W3.o.b(this.f8994E, aVar.f8994E);
    }

    public int hashCode() {
        char[] cArr = W3.o.f10619a;
        return W3.o.h(W3.o.h(W3.o.h(W3.o.h(W3.o.h(W3.o.h(W3.o.h(W3.o.g(0, W3.o.g(0, W3.o.g(1, W3.o.g(this.f9009z ? 1 : 0, W3.o.g(this.f9007x, W3.o.g(this.f9006w, W3.o.g(this.f9005v ? 1 : 0, W3.o.h(W3.o.g(0, W3.o.h(W3.o.g(this.f9004u, W3.o.h(W3.o.g(this.f9002e, W3.o.g(Float.floatToIntBits(1.0f), 17)), this.f9001d)), this.f9003f)), null)))))))), this.f8999b), this.f9000c), this.f8990A), this.f8991B), this.f8992C), this.f9008y), this.f8994E);
    }

    public final a j(o oVar, AbstractC0341e abstractC0341e) {
        if (this.f8995F) {
            return clone().j(oVar, abstractC0341e);
        }
        q(o.g, oVar);
        return u(abstractC0341e, false);
    }

    public final a k(int i7, int i10) {
        if (this.f8995F) {
            return clone().k(i7, i10);
        }
        this.f9007x = i7;
        this.f9006w = i10;
        this.f8998a |= 512;
        p();
        return this;
    }

    public final a l(int i7) {
        if (this.f8995F) {
            return clone().l(i7);
        }
        this.f9004u = i7;
        int i10 = this.f8998a | 128;
        this.f9003f = null;
        this.f8998a = i10 & (-65);
        p();
        return this;
    }

    public final a m() {
        com.bumptech.glide.g gVar = com.bumptech.glide.g.f14636d;
        if (this.f8995F) {
            return clone().m();
        }
        this.f9000c = gVar;
        this.f8998a |= 8;
        p();
        return this;
    }

    public final a n(k kVar) {
        if (this.f8995F) {
            return clone().n(kVar);
        }
        this.f8990A.f360b.remove(kVar);
        p();
        return this;
    }

    public final a o(o oVar, AbstractC0341e abstractC0341e, boolean z8) {
        a v10 = z8 ? v(oVar, abstractC0341e) : j(oVar, abstractC0341e);
        v10.f8996G = true;
        return v10;
    }

    public final void p() {
        if (this.f8993D) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a q(k kVar, Object obj) {
        if (this.f8995F) {
            return clone().q(kVar, obj);
        }
        W3.g.b(kVar);
        W3.g.b(obj);
        this.f8990A.f360b.put(kVar, obj);
        p();
        return this;
    }

    public final a r(A3.h hVar) {
        if (this.f8995F) {
            return clone().r(hVar);
        }
        this.f9008y = hVar;
        this.f8998a |= 1024;
        p();
        return this;
    }

    public final a s() {
        if (this.f8995F) {
            return clone().s();
        }
        this.f9005v = false;
        this.f8998a |= 256;
        p();
        return this;
    }

    public final a t(Resources.Theme theme) {
        if (this.f8995F) {
            return clone().t(theme);
        }
        this.f8994E = theme;
        if (theme != null) {
            this.f8998a |= 32768;
            return q(L3.c.f6286b, theme);
        }
        this.f8998a &= -32769;
        return n(L3.c.f6286b);
    }

    public final a u(p pVar, boolean z8) {
        if (this.f8995F) {
            return clone().u(pVar, z8);
        }
        t tVar = new t(pVar, z8);
        w(Bitmap.class, pVar, z8);
        w(Drawable.class, tVar, z8);
        w(BitmapDrawable.class, tVar, z8);
        w(N3.c.class, new N3.d(pVar), z8);
        p();
        return this;
    }

    public final a v(o oVar, AbstractC0341e abstractC0341e) {
        if (this.f8995F) {
            return clone().v(oVar, abstractC0341e);
        }
        q(o.g, oVar);
        return u(abstractC0341e, true);
    }

    public final a w(Class cls, p pVar, boolean z8) {
        if (this.f8995F) {
            return clone().w(cls, pVar, z8);
        }
        W3.g.b(pVar);
        this.f8991B.put(cls, pVar);
        int i7 = this.f8998a;
        this.f8998a = 67584 | i7;
        this.f8996G = false;
        if (z8) {
            this.f8998a = i7 | 198656;
            this.f9009z = true;
        }
        p();
        return this;
    }

    public final a x() {
        if (this.f8995F) {
            return clone().x();
        }
        this.f8997H = true;
        this.f8998a |= 1048576;
        p();
        return this;
    }
}
