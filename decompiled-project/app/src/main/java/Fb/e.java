package Fb;

import android.os.Build;
import android.view.View;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.l;
import y1.C2353a;
import y1.C2354b;
import y1.K;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public int f4193a;

    /* renamed from: b, reason: collision with root package name */
    public int f4194b;

    /* renamed from: c, reason: collision with root package name */
    public int f4195c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f4196d;

    public e(int i7, Class cls, int i10, int i11) {
        this.f4193a = i7;
        this.f4196d = cls;
        this.f4195c = i10;
        this.f4194b = i11;
    }

    public e(f map) {
        l.e(map, "map");
        this.f4196d = map;
        this.f4194b = -1;
        this.f4195c = map.f4206v;
        d();
    }

    public void a() {
        if (((f) this.f4196d).f4206v != this.f4195c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d() {
        while (true) {
            int i7 = this.f4193a;
            f fVar = (f) this.f4196d;
            if (i7 >= fVar.f4204f || fVar.f4201c[i7] >= 0) {
                return;
            } else {
                this.f4193a = i7 + 1;
            }
        }
    }

    public void e(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f4194b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f4194b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f4193a);
            if (!((Class) this.f4196d).isInstance(tag)) {
                tag = null;
            }
        }
        if (f(tag, obj)) {
            View.AccessibilityDelegate d10 = K.d(view);
            C2354b c2354b = d10 == null ? null : d10 instanceof C2353a ? ((C2353a) d10).f26677a : new C2354b(d10);
            if (c2354b == null) {
                c2354b = new C2354b();
            }
            K.n(view, c2354b);
            view.setTag(this.f4193a, obj);
            K.h(view, this.f4195c);
        }
    }

    public abstract boolean f(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f4193a < ((f) this.f4196d).f4204f;
    }

    public void remove() {
        a();
        if (this.f4194b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        f fVar = (f) this.f4196d;
        fVar.c();
        fVar.m(this.f4194b);
        this.f4194b = -1;
        this.f4195c = fVar.f4206v;
    }
}
