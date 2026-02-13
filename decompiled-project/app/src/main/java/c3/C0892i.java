package c3;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import u.C2052e;

/* renamed from: c3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892i extends AbstractC0893j {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f14288a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14289b;

    /* renamed from: c, reason: collision with root package name */
    public float f14290c;

    /* renamed from: d, reason: collision with root package name */
    public float f14291d;

    /* renamed from: e, reason: collision with root package name */
    public float f14292e;

    /* renamed from: f, reason: collision with root package name */
    public float f14293f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public float f14294h;

    /* renamed from: i, reason: collision with root package name */
    public float f14295i;
    public final Matrix j;
    public String k;

    public C0892i() {
        this.f14288a = new Matrix();
        this.f14289b = new ArrayList();
        this.f14290c = 0.0f;
        this.f14291d = 0.0f;
        this.f14292e = 0.0f;
        this.f14293f = 1.0f;
        this.g = 1.0f;
        this.f14294h = 0.0f;
        this.f14295i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [c3.k, c3.h] */
    public C0892i(C0892i c0892i, C2052e c2052e) {
        AbstractC0894k abstractC0894k;
        this.f14288a = new Matrix();
        this.f14289b = new ArrayList();
        this.f14290c = 0.0f;
        this.f14291d = 0.0f;
        this.f14292e = 0.0f;
        this.f14293f = 1.0f;
        this.g = 1.0f;
        this.f14294h = 0.0f;
        this.f14295i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.f14290c = c0892i.f14290c;
        this.f14291d = c0892i.f14291d;
        this.f14292e = c0892i.f14292e;
        this.f14293f = c0892i.f14293f;
        this.g = c0892i.g;
        this.f14294h = c0892i.f14294h;
        this.f14295i = c0892i.f14295i;
        String str = c0892i.k;
        this.k = str;
        if (str != null) {
            c2052e.put(str, this);
        }
        matrix.set(c0892i.j);
        ArrayList arrayList = c0892i.f14289b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Object obj = arrayList.get(i7);
            if (obj instanceof C0892i) {
                this.f14289b.add(new C0892i((C0892i) obj, c2052e));
            } else {
                if (obj instanceof C0891h) {
                    C0891h c0891h = (C0891h) obj;
                    ?? abstractC0894k2 = new AbstractC0894k(c0891h);
                    abstractC0894k2.f14281e = 0.0f;
                    abstractC0894k2.g = 1.0f;
                    abstractC0894k2.f14283h = 1.0f;
                    abstractC0894k2.f14284i = 0.0f;
                    abstractC0894k2.j = 1.0f;
                    abstractC0894k2.k = 0.0f;
                    abstractC0894k2.f14285l = Paint.Cap.BUTT;
                    abstractC0894k2.f14286m = Paint.Join.MITER;
                    abstractC0894k2.f14287n = 4.0f;
                    abstractC0894k2.f14280d = c0891h.f14280d;
                    abstractC0894k2.f14281e = c0891h.f14281e;
                    abstractC0894k2.g = c0891h.g;
                    abstractC0894k2.f14282f = c0891h.f14282f;
                    abstractC0894k2.f14298c = c0891h.f14298c;
                    abstractC0894k2.f14283h = c0891h.f14283h;
                    abstractC0894k2.f14284i = c0891h.f14284i;
                    abstractC0894k2.j = c0891h.j;
                    abstractC0894k2.k = c0891h.k;
                    abstractC0894k2.f14285l = c0891h.f14285l;
                    abstractC0894k2.f14286m = c0891h.f14286m;
                    abstractC0894k2.f14287n = c0891h.f14287n;
                    abstractC0894k = abstractC0894k2;
                } else {
                    if (!(obj instanceof C0890g)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    abstractC0894k = new AbstractC0894k((C0890g) obj);
                }
                this.f14289b.add(abstractC0894k);
                Object obj2 = abstractC0894k.f14297b;
                if (obj2 != null) {
                    c2052e.put(obj2, abstractC0894k);
                }
            }
        }
    }

    @Override // c3.AbstractC0893j
    public final boolean a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f14289b;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0893j) arrayList.get(i7)).a()) {
                return true;
            }
            i7++;
        }
    }

    @Override // c3.AbstractC0893j
    public final boolean b(int[] iArr) {
        int i7 = 0;
        boolean z8 = false;
        while (true) {
            ArrayList arrayList = this.f14289b;
            if (i7 >= arrayList.size()) {
                return z8;
            }
            z8 |= ((AbstractC0893j) arrayList.get(i7)).b(iArr);
            i7++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f14291d, -this.f14292e);
        matrix.postScale(this.f14293f, this.g);
        matrix.postRotate(this.f14290c, 0.0f, 0.0f);
        matrix.postTranslate(this.f14294h + this.f14291d, this.f14295i + this.f14292e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f14291d;
    }

    public float getPivotY() {
        return this.f14292e;
    }

    public float getRotation() {
        return this.f14290c;
    }

    public float getScaleX() {
        return this.f14293f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.f14294h;
    }

    public float getTranslateY() {
        return this.f14295i;
    }

    public void setPivotX(float f4) {
        if (f4 != this.f14291d) {
            this.f14291d = f4;
            c();
        }
    }

    public void setPivotY(float f4) {
        if (f4 != this.f14292e) {
            this.f14292e = f4;
            c();
        }
    }

    public void setRotation(float f4) {
        if (f4 != this.f14290c) {
            this.f14290c = f4;
            c();
        }
    }

    public void setScaleX(float f4) {
        if (f4 != this.f14293f) {
            this.f14293f = f4;
            c();
        }
    }

    public void setScaleY(float f4) {
        if (f4 != this.g) {
            this.g = f4;
            c();
        }
    }

    public void setTranslateX(float f4) {
        if (f4 != this.f14294h) {
            this.f14294h = f4;
            c();
        }
    }

    public void setTranslateY(float f4) {
        if (f4 != this.f14295i) {
            this.f14295i = f4;
            c();
        }
    }
}
