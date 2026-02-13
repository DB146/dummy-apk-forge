package H2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: H2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296j extends P {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f4723s;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f4724h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f4725i;
    public ArrayList j;
    public ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f4726l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4727m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f4728n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f4729o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f4730p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f4731q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f4732r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((i0) arrayList.get(size)).f4707a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [H2.h, java.lang.Object] */
    @Override // H2.P
    public final boolean a(i0 i0Var, i0 i0Var2, O o10, O o11) {
        int i7;
        int i10;
        int i11 = o10.f4603b;
        int i12 = o10.f4604c;
        if (i0Var2.r()) {
            int i13 = o10.f4603b;
            i10 = o10.f4604c;
            i7 = i13;
        } else {
            i7 = o11.f4603b;
            i10 = o11.f4604c;
        }
        if (i0Var == i0Var2) {
            return g(i0Var, i11, i12, i7, i10);
        }
        View view = i0Var.f4707a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(i0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(i0Var2);
        float f4 = -((int) ((i7 - i11) - translationX));
        View view2 = i0Var2.f4707a;
        view2.setTranslationX(f4);
        view2.setTranslationY(-((int) ((i10 - i12) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        ?? obj = new Object();
        obj.f4688a = i0Var;
        obj.f4689b = i0Var2;
        obj.f4690c = i11;
        obj.f4691d = i12;
        obj.f4692e = i7;
        obj.f4693f = i10;
        arrayList.add(obj);
        return true;
    }

    @Override // H2.P
    public final void d(i0 i0Var) {
        View view = i0Var.f4707a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0295i) arrayList.get(size)).f4701a == i0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(i0Var);
                arrayList.remove(size);
            }
        }
        j(this.k, i0Var);
        if (this.f4724h.remove(i0Var)) {
            view.setAlpha(1.0f);
            c(i0Var);
        }
        if (this.f4725i.remove(i0Var)) {
            view.setAlpha(1.0f);
            c(i0Var);
        }
        ArrayList arrayList2 = this.f4728n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, i0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f4727m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0295i) arrayList5.get(size4)).f4701a == i0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(i0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f4726l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(i0Var)) {
                view.setAlpha(1.0f);
                c(i0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f4731q.remove(i0Var);
        this.f4729o.remove(i0Var);
        this.f4732r.remove(i0Var);
        this.f4730p.remove(i0Var);
        i();
    }

    @Override // H2.P
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0295i c0295i = (C0295i) arrayList.get(size);
            View view = c0295i.f4701a.f4707a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0295i.f4701a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f4724h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((i0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f4725i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            i0 i0Var = (i0) arrayList3.get(size3);
            i0Var.f4707a.setAlpha(1.0f);
            c(i0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0294h c0294h = (C0294h) arrayList4.get(size4);
            i0 i0Var2 = c0294h.f4688a;
            if (i0Var2 != null) {
                k(c0294h, i0Var2);
            }
            i0 i0Var3 = c0294h.f4689b;
            if (i0Var3 != null) {
                k(c0294h, i0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f4727m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0295i c0295i2 = (C0295i) arrayList6.get(size6);
                    View view2 = c0295i2.f4701a.f4707a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0295i2.f4701a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f4726l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    i0 i0Var4 = (i0) arrayList8.get(size8);
                    i0Var4.f4707a.setAlpha(1.0f);
                    c(i0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f4728n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0294h c0294h2 = (C0294h) arrayList10.get(size10);
                    i0 i0Var5 = c0294h2.f4688a;
                    if (i0Var5 != null) {
                        k(c0294h2, i0Var5);
                    }
                    i0 i0Var6 = c0294h2.f4689b;
                    if (i0Var6 != null) {
                        k(c0294h2, i0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f4731q);
            h(this.f4730p);
            h(this.f4729o);
            h(this.f4732r);
            ArrayList arrayList11 = this.f4606b;
            if (arrayList11.size() > 0) {
                throw h3.o.i(0, arrayList11);
            }
            arrayList11.clear();
        }
    }

    @Override // H2.P
    public final boolean f() {
        return (this.f4725i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.f4724h.isEmpty() && this.f4730p.isEmpty() && this.f4731q.isEmpty() && this.f4729o.isEmpty() && this.f4732r.isEmpty() && this.f4727m.isEmpty() && this.f4726l.isEmpty() && this.f4728n.isEmpty()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [H2.i, java.lang.Object] */
    public final boolean g(i0 i0Var, int i7, int i10, int i11, int i12) {
        View view = i0Var.f4707a;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) i0Var.f4707a.getTranslationY());
        l(i0Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            c(i0Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList arrayList = this.j;
        ?? obj = new Object();
        obj.f4701a = i0Var;
        obj.f4702b = translationX;
        obj.f4703c = translationY;
        obj.f4704d = i11;
        obj.f4705e = i12;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f4606b;
        if (arrayList.size() > 0) {
            throw h3.o.i(0, arrayList);
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, i0 i0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0294h c0294h = (C0294h) arrayList.get(size);
            if (k(c0294h, i0Var) && c0294h.f4688a == null && c0294h.f4689b == null) {
                arrayList.remove(c0294h);
            }
        }
    }

    public final boolean k(C0294h c0294h, i0 i0Var) {
        if (c0294h.f4689b == i0Var) {
            c0294h.f4689b = null;
        } else {
            if (c0294h.f4688a != i0Var) {
                return false;
            }
            c0294h.f4688a = null;
        }
        i0Var.f4707a.setAlpha(1.0f);
        View view = i0Var.f4707a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(i0Var);
        return true;
    }

    public final void l(i0 i0Var) {
        if (f4723s == null) {
            f4723s = new ValueAnimator().getInterpolator();
        }
        i0Var.f4707a.animate().setInterpolator(f4723s);
        d(i0Var);
    }
}
