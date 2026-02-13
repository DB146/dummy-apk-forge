package H2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g3.C1191j;
import h.AbstractC1213a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import m4.O0;
import o.AbstractC1737h0;
import y1.AbstractC2352B;

/* renamed from: H2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288b {

    /* renamed from: a, reason: collision with root package name */
    public int f4638a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4639b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4640c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4641d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4642e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4643f;

    public C0288b(View view) {
        this.f4638a = -1;
        this.f4639b = view;
        this.f4640c = o.r.a();
    }

    public C0288b(C1191j c1191j) {
        this.f4639b = new b1.d(30);
        this.f4640c = new ArrayList();
        this.f4641d = new ArrayList();
        this.f4638a = 0;
        this.f4642e = c1191j;
        this.f4643f = new C1191j(this, 13);
    }

    public C0288b(v2.q destination) {
        kotlin.jvm.internal.l.e(destination, "destination");
        this.f4639b = destination;
        this.f4640c = new ArrayList();
        this.f4641d = new LinkedHashMap();
    }

    public C0288b(int[] iArr, P4.n0[] n0VarArr, int[] iArr2, int[][][] iArr3, P4.n0 n0Var) {
        this.f4639b = iArr;
        this.f4640c = n0VarArr;
        this.f4642e = iArr3;
        this.f4641d = iArr2;
        this.f4643f = n0Var;
        this.f4638a = iArr.length;
    }

    public void a() {
        View view = (View) this.f4639b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((O0) this.f4641d) != null) {
                if (((O0) this.f4643f) == null) {
                    this.f4643f = new Object();
                }
                O0 o02 = (O0) this.f4643f;
                o02.f20120c = null;
                o02.f20119b = false;
                o02.f20121d = null;
                o02.f20118a = false;
                WeakHashMap weakHashMap = y1.K.f26642a;
                ColorStateList c10 = AbstractC2352B.c(view);
                if (c10 != null) {
                    o02.f20119b = true;
                    o02.f20120c = c10;
                }
                PorterDuff.Mode d10 = AbstractC2352B.d(view);
                if (d10 != null) {
                    o02.f20118a = true;
                    o02.f20121d = d10;
                }
                if (o02.f20119b || o02.f20118a) {
                    o.r.e(background, o02, view.getDrawableState());
                    return;
                }
            }
            O0 o03 = (O0) this.f4642e;
            if (o03 != null) {
                o.r.e(background, o03, view.getDrawableState());
                return;
            }
            O0 o04 = (O0) this.f4641d;
            if (o04 != null) {
                o.r.e(background, o04, view.getDrawableState());
            }
        }
    }

    public boolean b(int i7) {
        ArrayList arrayList = (ArrayList) this.f4641d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0287a c0287a = (C0287a) arrayList.get(i10);
            int i11 = c0287a.f4633a;
            if (i11 == 8) {
                if (g(c0287a.f4636d, i10 + 1) == i7) {
                    return true;
                }
            } else if (i11 == 1) {
                int i12 = c0287a.f4634b;
                int i13 = c0287a.f4636d + i12;
                while (i12 < i13) {
                    if (g(i12, i10 + 1) == i7) {
                        return true;
                    }
                    i12++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f4641d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C1191j) this.f4642e).t((C0287a) arrayList.get(i7));
        }
        r(arrayList);
        this.f4638a = 0;
    }

    public void d() {
        c();
        ArrayList arrayList = (ArrayList) this.f4640c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0287a c0287a = (C0287a) arrayList.get(i7);
            int i10 = c0287a.f4633a;
            C1191j c1191j = (C1191j) this.f4642e;
            if (i10 == 1) {
                c1191j.t(c0287a);
                c1191j.w(c0287a.f4634b, c0287a.f4636d);
            } else if (i10 == 2) {
                c1191j.t(c0287a);
                int i11 = c0287a.f4634b;
                int i12 = c0287a.f4636d;
                RecyclerView recyclerView = (RecyclerView) c1191j.f17441b;
                recyclerView.T(true, i11, i12);
                recyclerView.f13682y0 = true;
                recyclerView.f13676v0.f4666c += i12;
            } else if (i10 == 4) {
                c1191j.t(c0287a);
                c1191j.v(c0287a.f4635c, c0287a.f4634b, c0287a.f4636d);
            } else if (i10 == 8) {
                c1191j.t(c0287a);
                c1191j.x(c0287a.f4634b, c0287a.f4636d);
            }
        }
        r(arrayList);
        this.f4638a = 0;
    }

    public void e(C0287a c0287a) {
        int i7;
        int i10 = c0287a.f4633a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v10 = v(c0287a.f4634b, i10);
        int i11 = c0287a.f4634b;
        int i12 = c0287a.f4633a;
        if (i12 == 2) {
            i7 = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0287a);
            }
            i7 = 1;
        }
        int i13 = 1;
        for (int i14 = 1; i14 < c0287a.f4636d; i14++) {
            int v11 = v((i7 * i14) + c0287a.f4634b, c0287a.f4633a);
            int i15 = c0287a.f4633a;
            if (i15 == 2 ? v11 != v10 : !(i15 == 4 && v11 == v10 + 1)) {
                C0287a m10 = m(c0287a.f4635c, i15, v10, i13);
                f(m10, i11);
                m10.f4635c = null;
                ((b1.d) this.f4639b).c(m10);
                if (c0287a.f4633a == 4) {
                    i11 += i13;
                }
                i13 = 1;
                v10 = v11;
            } else {
                i13++;
            }
        }
        Object obj = c0287a.f4635c;
        c0287a.f4635c = null;
        ((b1.d) this.f4639b).c(c0287a);
        if (i13 > 0) {
            C0287a m11 = m(obj, c0287a.f4633a, v10, i13);
            f(m11, i11);
            m11.f4635c = null;
            ((b1.d) this.f4639b).c(m11);
        }
    }

    public void f(C0287a c0287a, int i7) {
        C1191j c1191j = (C1191j) this.f4642e;
        c1191j.t(c0287a);
        int i10 = c0287a.f4633a;
        if (i10 != 2) {
            if (i10 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c1191j.v(c0287a.f4635c, i7, c0287a.f4636d);
            return;
        }
        int i11 = c0287a.f4636d;
        RecyclerView recyclerView = (RecyclerView) c1191j.f17441b;
        recyclerView.T(true, i7, i11);
        recyclerView.f13682y0 = true;
        recyclerView.f13676v0.f4666c += i11;
    }

    public int g(int i7, int i10) {
        ArrayList arrayList = (ArrayList) this.f4641d;
        int size = arrayList.size();
        while (i10 < size) {
            C0287a c0287a = (C0287a) arrayList.get(i10);
            int i11 = c0287a.f4633a;
            if (i11 == 8) {
                int i12 = c0287a.f4634b;
                if (i12 == i7) {
                    i7 = c0287a.f4636d;
                } else {
                    if (i12 < i7) {
                        i7--;
                    }
                    if (c0287a.f4636d <= i7) {
                        i7++;
                    }
                }
            } else {
                int i13 = c0287a.f4634b;
                if (i13 > i7) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = c0287a.f4636d;
                    if (i7 < i13 + i14) {
                        return -1;
                    }
                    i7 -= i14;
                } else if (i11 == 1) {
                    i7 += c0287a.f4636d;
                }
            }
            i10++;
        }
        return i7;
    }

    public ColorStateList h() {
        O0 o02 = (O0) this.f4642e;
        if (o02 != null) {
            return (ColorStateList) o02.f20120c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        O0 o02 = (O0) this.f4642e;
        if (o02 != null) {
            return (PorterDuff.Mode) o02.f20121d;
        }
        return null;
    }

    public boolean j() {
        return ((ArrayList) this.f4640c).size() > 0;
    }

    public void k(AttributeSet attributeSet, int i7) {
        ColorStateList f4;
        View view = (View) this.f4639b;
        Context context = view.getContext();
        int[] iArr = AbstractC1213a.f17588z;
        l2.X u3 = l2.X.u(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) u3.f19195c;
        View view2 = (View) this.f4639b;
        y1.K.m(view2, view2.getContext(), iArr, attributeSet, (TypedArray) u3.f19195c, i7, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f4638a = typedArray.getResourceId(0, -1);
                o.r rVar = (o.r) this.f4640c;
                Context context2 = view.getContext();
                int i10 = this.f4638a;
                synchronized (rVar) {
                    f4 = rVar.f21581a.f(context2, i10);
                }
                if (f4 != null) {
                    s(f4);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC2352B.i(view, u3.m(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC2352B.j(view, AbstractC1737h0.c(typedArray.getInt(2, -1), null));
            }
        } finally {
            u3.w();
        }
    }

    public v2.p l(String route) {
        v2.o oVar;
        kotlin.jvm.internal.l.e(route, "route");
        Db.o oVar2 = (Db.o) this.f4643f;
        if (oVar2 == null || (oVar = (v2.o) oVar2.getValue()) == null) {
            return null;
        }
        int i7 = v2.q.f25015e;
        String uriString = "android-app://androidx.navigation/".concat(route);
        kotlin.jvm.internal.l.e(uriString, "uriString");
        Uri parse = Uri.parse(uriString);
        kotlin.jvm.internal.l.d(parse, "parse(...)");
        Bundle d10 = oVar.d(parse, (LinkedHashMap) this.f4641d);
        if (d10 == null) {
            return null;
        }
        return new v2.p((v2.q) this.f4639b, d10, oVar.f25009l, oVar.b(parse), false);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, H2.a] */
    public C0287a m(Object obj, int i7, int i10, int i11) {
        C0287a c0287a = (C0287a) ((b1.d) this.f4639b).a();
        if (c0287a != null) {
            c0287a.f4633a = i7;
            c0287a.f4634b = i10;
            c0287a.f4636d = i11;
            c0287a.f4635c = obj;
            return c0287a;
        }
        ?? obj2 = new Object();
        obj2.f4633a = i7;
        obj2.f4634b = i10;
        obj2.f4636d = i11;
        obj2.f4635c = obj;
        return obj2;
    }

    public void n() {
        this.f4638a = -1;
        s(null);
        a();
    }

    public void o(int i7) {
        ColorStateList colorStateList;
        this.f4638a = i7;
        o.r rVar = (o.r) this.f4640c;
        if (rVar != null) {
            Context context = ((View) this.f4639b).getContext();
            synchronized (rVar) {
                colorStateList = rVar.f21581a.f(context, i7);
            }
        } else {
            colorStateList = null;
        }
        s(colorStateList);
        a();
    }

    public void p(C0287a c0287a) {
        ((ArrayList) this.f4641d).add(c0287a);
        int i7 = c0287a.f4633a;
        C1191j c1191j = (C1191j) this.f4642e;
        if (i7 == 1) {
            c1191j.w(c0287a.f4634b, c0287a.f4636d);
            return;
        }
        if (i7 == 2) {
            int i10 = c0287a.f4634b;
            int i11 = c0287a.f4636d;
            RecyclerView recyclerView = (RecyclerView) c1191j.f17441b;
            recyclerView.T(false, i10, i11);
            recyclerView.f13682y0 = true;
            return;
        }
        if (i7 == 4) {
            c1191j.v(c0287a.f4635c, c0287a.f4634b, c0287a.f4636d);
        } else if (i7 == 8) {
            c1191j.x(c0287a.f4634b, c0287a.f4636d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0287a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q() {
        char c10;
        boolean z8;
        char c11;
        C0287a m10;
        int i7;
        int i10;
        C0287a m11;
        boolean z10;
        boolean z11;
        C0287a m12;
        ArrayList arrayList = (ArrayList) this.f4640c;
        C1191j c1191j = (C1191j) this.f4643f;
        c1191j.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z12 = false;
            while (true) {
                c10 = 65535;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C0287a) arrayList.get(size)).f4633a != 8) {
                    z12 = true;
                } else if (z12) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i11 = size + 1;
            C0287a c0287a = (C0287a) arrayList.get(size);
            C0287a c0287a2 = (C0287a) arrayList.get(i11);
            int i12 = c0287a2.f4633a;
            if (i12 != 1) {
                C0288b c0288b = (C0288b) c1191j.f17441b;
                if (i12 == 2) {
                    int i13 = c0287a.f4634b;
                    int i14 = c0287a.f4636d;
                    if (i13 < i14) {
                        z11 = c0287a2.f4634b == i13 && c0287a2.f4636d == i14 - i13;
                        z10 = false;
                    } else if (c0287a2.f4634b == i14 + 1 && c0287a2.f4636d == i13 - i14) {
                        z11 = true;
                        z10 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    int i15 = c0287a2.f4634b;
                    if (i14 < i15) {
                        c0287a2.f4634b = i15 - 1;
                    } else {
                        int i16 = c0287a2.f4636d;
                        if (i14 < i15 + i16) {
                            c0287a2.f4636d = i16 - 1;
                            c0287a.f4633a = 2;
                            c0287a.f4636d = 1;
                            if (c0287a2.f4636d == 0) {
                                arrayList.remove(i11);
                                c0288b.getClass();
                                c0287a2.f4635c = null;
                                ((b1.d) c0288b.f4639b).c(c0287a2);
                            }
                        }
                    }
                    int i17 = c0287a.f4634b;
                    int i18 = c0287a2.f4634b;
                    if (i17 <= i18) {
                        c0287a2.f4634b = i18 + 1;
                    } else {
                        int i19 = i18 + c0287a2.f4636d;
                        if (i17 < i19) {
                            m12 = c0288b.m(null, 2, i17 + 1, i19 - i17);
                            c0287a2.f4636d = c0287a.f4634b - c0287a2.f4634b;
                            if (z11) {
                                if (z10) {
                                    if (m12 != null) {
                                        int i20 = c0287a.f4634b;
                                        if (i20 > m12.f4634b) {
                                            c0287a.f4634b = i20 - m12.f4636d;
                                        }
                                        int i21 = c0287a.f4636d;
                                        if (i21 > m12.f4634b) {
                                            c0287a.f4636d = i21 - m12.f4636d;
                                        }
                                    }
                                    int i22 = c0287a.f4634b;
                                    if (i22 > c0287a2.f4634b) {
                                        c0287a.f4634b = i22 - c0287a2.f4636d;
                                    }
                                    int i23 = c0287a.f4636d;
                                    if (i23 > c0287a2.f4634b) {
                                        c0287a.f4636d = i23 - c0287a2.f4636d;
                                    }
                                } else {
                                    if (m12 != null) {
                                        int i24 = c0287a.f4634b;
                                        if (i24 >= m12.f4634b) {
                                            c0287a.f4634b = i24 - m12.f4636d;
                                        }
                                        int i25 = c0287a.f4636d;
                                        if (i25 >= m12.f4634b) {
                                            c0287a.f4636d = i25 - m12.f4636d;
                                        }
                                    }
                                    int i26 = c0287a.f4634b;
                                    if (i26 >= c0287a2.f4634b) {
                                        c0287a.f4634b = i26 - c0287a2.f4636d;
                                    }
                                    int i27 = c0287a.f4636d;
                                    if (i27 >= c0287a2.f4634b) {
                                        c0287a.f4636d = i27 - c0287a2.f4636d;
                                    }
                                }
                                arrayList.set(size, c0287a2);
                                if (c0287a.f4634b != c0287a.f4636d) {
                                    arrayList.set(i11, c0287a);
                                } else {
                                    arrayList.remove(i11);
                                }
                                if (m12 != null) {
                                    arrayList.add(size, m12);
                                }
                            } else {
                                arrayList.set(size, c0287a2);
                                arrayList.remove(i11);
                                c0288b.getClass();
                                c0287a.f4635c = null;
                                ((b1.d) c0288b.f4639b).c(c0287a);
                            }
                        }
                    }
                    m12 = null;
                    if (z11) {
                    }
                } else if (i12 == 4) {
                    int i28 = c0287a.f4636d;
                    int i29 = c0287a2.f4634b;
                    if (i28 < i29) {
                        c0287a2.f4634b = i29 - 1;
                    } else {
                        int i30 = c0287a2.f4636d;
                        if (i28 < i29 + i30) {
                            c0287a2.f4636d = i30 - 1;
                            m10 = c0288b.m(c0287a2.f4635c, 4, c0287a.f4634b, 1);
                            i7 = c0287a.f4634b;
                            i10 = c0287a2.f4634b;
                            if (i7 > i10) {
                                c0287a2.f4634b = i10 + 1;
                            } else {
                                int i31 = i10 + c0287a2.f4636d;
                                if (i7 < i31) {
                                    int i32 = i31 - i7;
                                    m11 = c0288b.m(c0287a2.f4635c, 4, i7 + 1, i32);
                                    c0287a2.f4636d -= i32;
                                    arrayList.set(i11, c0287a);
                                    if (c0287a2.f4636d > 0) {
                                        arrayList.set(size, c0287a2);
                                    } else {
                                        arrayList.remove(size);
                                        c0288b.getClass();
                                        c0287a2.f4635c = null;
                                        ((b1.d) c0288b.f4639b).c(c0287a2);
                                    }
                                    if (m10 != null) {
                                        arrayList.add(size, m10);
                                    }
                                    if (m11 != null) {
                                        arrayList.add(size, m11);
                                    }
                                }
                            }
                            m11 = null;
                            arrayList.set(i11, c0287a);
                            if (c0287a2.f4636d > 0) {
                            }
                            if (m10 != null) {
                            }
                            if (m11 != null) {
                            }
                        }
                    }
                    m10 = null;
                    i7 = c0287a.f4634b;
                    i10 = c0287a2.f4634b;
                    if (i7 > i10) {
                    }
                    m11 = null;
                    arrayList.set(i11, c0287a);
                    if (c0287a2.f4636d > 0) {
                    }
                    if (m10 != null) {
                    }
                    if (m11 != null) {
                    }
                }
            } else {
                int i33 = c0287a.f4636d;
                int i34 = c0287a2.f4634b;
                int i35 = i33 < i34 ? -1 : 0;
                int i36 = c0287a.f4634b;
                if (i36 < i34) {
                    i35++;
                }
                if (i34 <= i36) {
                    c0287a.f4634b = i36 + c0287a2.f4636d;
                }
                int i37 = c0287a2.f4634b;
                if (i37 <= i33) {
                    c0287a.f4636d = i33 + c0287a2.f4636d;
                }
                c0287a2.f4634b = i37 + i35;
                arrayList.set(size, c0287a2);
                arrayList.set(i11, c0287a);
            }
        }
        int size2 = arrayList.size();
        int i38 = 0;
        while (i38 < size2) {
            C0287a c0287a3 = (C0287a) arrayList.get(i38);
            int i39 = c0287a3.f4633a;
            if (i39 != 1) {
                C1191j c1191j2 = (C1191j) this.f4642e;
                if (i39 == 2) {
                    int i40 = c0287a3.f4634b;
                    int i41 = c0287a3.f4636d + i40;
                    int i42 = i40;
                    int i43 = 0;
                    char c12 = 65535;
                    while (i42 < i41) {
                        if (c1191j2.u(i42) != null || b(i42)) {
                            if (c12 == 0) {
                                e(m(null, 2, i40, i43));
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            c11 = 1;
                        } else {
                            if (c12 == 1) {
                                p(m(null, 2, i40, i43));
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            c11 = 0;
                        }
                        if (z8) {
                            i42 -= i43;
                            i41 -= i43;
                            i43 = 1;
                        } else {
                            i43++;
                        }
                        i42++;
                        c12 = c11;
                    }
                    if (i43 != c0287a3.f4636d) {
                        c0287a3.f4635c = null;
                        ((b1.d) this.f4639b).c(c0287a3);
                        c0287a3 = m(null, 2, i40, i43);
                    }
                    if (c12 == 0) {
                        e(c0287a3);
                    } else {
                        p(c0287a3);
                    }
                } else if (i39 == 4) {
                    int i44 = c0287a3.f4634b;
                    int i45 = c0287a3.f4636d + i44;
                    int i46 = i44;
                    int i47 = 0;
                    while (i44 < i45) {
                        if (c1191j2.u(i44) != null || b(i44)) {
                            if (c10 == 0) {
                                e(m(c0287a3.f4635c, 4, i46, i47));
                                i46 = i44;
                                i47 = 0;
                            }
                            c10 = 1;
                        } else {
                            if (c10 == 1) {
                                p(m(c0287a3.f4635c, 4, i46, i47));
                                i46 = i44;
                                i47 = 0;
                            }
                            c10 = 0;
                        }
                        i47++;
                        i44++;
                    }
                    if (i47 != c0287a3.f4636d) {
                        Object obj = c0287a3.f4635c;
                        c0287a3.f4635c = null;
                        ((b1.d) this.f4639b).c(c0287a3);
                        c0287a3 = m(obj, 4, i46, i47);
                    }
                    if (c10 == 0) {
                        e(c0287a3);
                    } else {
                        p(c0287a3);
                    }
                } else if (i39 == 8) {
                    p(c0287a3);
                }
            } else {
                p(c0287a3);
            }
            i38++;
            c10 = 65535;
        }
        arrayList.clear();
    }

    public void r(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0287a c0287a = (C0287a) arrayList.get(i7);
            c0287a.f4635c = null;
            ((b1.d) this.f4639b).c(c0287a);
        }
        arrayList.clear();
    }

    public void s(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((O0) this.f4641d) == null) {
                this.f4641d = new Object();
            }
            O0 o02 = (O0) this.f4641d;
            o02.f20120c = colorStateList;
            o02.f20119b = true;
        } else {
            this.f4641d = null;
        }
        a();
    }

    public void t(ColorStateList colorStateList) {
        if (((O0) this.f4642e) == null) {
            this.f4642e = new Object();
        }
        O0 o02 = (O0) this.f4642e;
        o02.f20120c = colorStateList;
        o02.f20119b = true;
        a();
    }

    public void u(PorterDuff.Mode mode) {
        if (((O0) this.f4642e) == null) {
            this.f4642e = new Object();
        }
        O0 o02 = (O0) this.f4642e;
        o02.f20121d = mode;
        o02.f20118a = true;
        a();
    }

    public int v(int i7, int i10) {
        int i11;
        int i12;
        ArrayList arrayList = (ArrayList) this.f4641d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0287a c0287a = (C0287a) arrayList.get(size);
            int i13 = c0287a.f4633a;
            if (i13 == 8) {
                int i14 = c0287a.f4634b;
                int i15 = c0287a.f4636d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i7 < i12 || i7 > i11) {
                    if (i7 < i14) {
                        if (i10 == 1) {
                            c0287a.f4634b = i14 + 1;
                            c0287a.f4636d = i15 + 1;
                        } else if (i10 == 2) {
                            c0287a.f4634b = i14 - 1;
                            c0287a.f4636d = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        c0287a.f4636d = i15 + 1;
                    } else if (i10 == 2) {
                        c0287a.f4636d = i15 - 1;
                    }
                    i7++;
                } else {
                    if (i10 == 1) {
                        c0287a.f4634b = i14 + 1;
                    } else if (i10 == 2) {
                        c0287a.f4634b = i14 - 1;
                    }
                    i7--;
                }
            } else {
                int i16 = c0287a.f4634b;
                if (i16 <= i7) {
                    if (i13 == 1) {
                        i7 -= c0287a.f4636d;
                    } else if (i13 == 2) {
                        i7 += c0287a.f4636d;
                    }
                } else if (i10 == 1) {
                    c0287a.f4634b = i16 + 1;
                } else if (i10 == 2) {
                    c0287a.f4634b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0287a c0287a2 = (C0287a) arrayList.get(size2);
            if (c0287a2.f4633a == 8) {
                int i17 = c0287a2.f4636d;
                if (i17 == c0287a2.f4634b || i17 < 0) {
                    arrayList.remove(size2);
                    c0287a2.f4635c = null;
                    ((b1.d) this.f4639b).c(c0287a2);
                }
            } else if (c0287a2.f4636d <= 0) {
                arrayList.remove(size2);
                c0287a2.f4635c = null;
                ((b1.d) this.f4639b).c(c0287a2);
            }
        }
        return i7;
    }
}
