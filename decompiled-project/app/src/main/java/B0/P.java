package B0;

import K0.C0374d;
import android.content.res.Resources;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import u.AbstractC2060m;
import u.C2046I;
import u.C2070x;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator[] f1769a;

    /* renamed from: b, reason: collision with root package name */
    public static final N f1770b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i7 = 0;
        while (i7 < 2) {
            comparatorArr[i7] = new O(new O(i7 == 0 ? J0.f1707c : J0.f1706b), 1);
            i7++;
        }
        f1769a = comparatorArr;
        f1770b = N.f1751b;
    }

    public static final boolean a(H0.n nVar) {
        H0.i i7 = nVar.i();
        return !i7.f4494a.c(H0.q.f4546i);
    }

    public static final void b(H0.n nVar, ArrayList arrayList, C2070x c2070x, C2070x c2070x2, Resources resources) {
        boolean f4 = f(nVar);
        Object g = nVar.f4505d.f4494a.g(H0.q.f4548m);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        int i7 = nVar.g;
        if ((booleanValue || g(nVar, resources)) && c2070x2.a(i7)) {
            arrayList.add(nVar);
        }
        if (booleanValue) {
            c2070x.g(i7, h(f4, H0.n.h(7, nVar), c2070x2, resources));
            return;
        }
        List h10 = H0.n.h(7, nVar);
        int size = h10.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((H0.n) h10.get(i10), arrayList, c2070x, c2070x2, resources);
        }
    }

    public static final boolean c(H0.n nVar) {
        Object g = nVar.f4505d.f4494a.g(H0.q.f4533F);
        if (g == null) {
            g = null;
        }
        J0.a aVar = (J0.a) g;
        H0.t tVar = H0.q.f4557v;
        C2046I c2046i = nVar.f4505d.f4494a;
        Object g2 = c2046i.g(tVar);
        if (g2 == null) {
            g2 = null;
        }
        H0.f fVar = (H0.f) g2;
        boolean z8 = aVar != null;
        Object g10 = c2046i.g(H0.q.f4532E);
        if (((Boolean) (g10 != null ? g10 : null)) != null) {
            return fVar != null ? H0.f.a(5, 4) : false ? z8 : true;
        }
        return z8;
    }

    public static final String d(H0.n nVar, Resources resources) {
        Object g = nVar.f4505d.f4494a.g(H0.q.f4540b);
        String str = null;
        if (g == null) {
            g = null;
        }
        H0.t tVar = H0.q.f4533F;
        H0.i iVar = nVar.f4505d;
        C2046I c2046i = iVar.f4494a;
        Object g2 = c2046i.g(tVar);
        if (g2 == null) {
            g2 = null;
        }
        J0.a aVar = (J0.a) g2;
        Object g10 = c2046i.g(H0.q.f4557v);
        if (g10 == null) {
            g10 = null;
        }
        H0.f fVar = (H0.f) g10;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                if ((fVar == null ? false : H0.f.a(5, 2)) && g == null) {
                    g = resources.getString(R.string.state_on);
                }
            } else if (ordinal == 1) {
                if ((fVar == null ? false : H0.f.a(5, 2)) && g == null) {
                    g = resources.getString(R.string.state_off);
                }
            } else if (ordinal == 2 && g == null) {
                g = resources.getString(R.string.indeterminate);
            }
        }
        Object g11 = c2046i.g(H0.q.f4532E);
        if (g11 == null) {
            g11 = null;
        }
        Boolean bool = (Boolean) g11;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(fVar == null ? false : H0.f.a(5, 4)) && g == null) {
                g = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object g12 = c2046i.g(H0.q.f4541c);
        if (g12 == null) {
            g12 = null;
        }
        H0.e eVar = (H0.e) g12;
        if (eVar != null) {
            if (eVar != H0.e.f4466b) {
                if (g == null) {
                    g = resources.getString(R.string.template_percent, 0);
                }
            } else if (g == null) {
                g = resources.getString(R.string.in_progress);
            }
        }
        H0.t tVar2 = H0.q.f4530C;
        if (c2046i.c(tVar2)) {
            H0.i i7 = new H0.n(nVar.f4502a, true, nVar.f4504c, iVar).i();
            H0.t tVar3 = H0.q.f4539a;
            C2046I c2046i2 = i7.f4494a;
            Object g13 = c2046i2.g(tVar3);
            if (g13 == null) {
                g13 = null;
            }
            Collection collection = (Collection) g13;
            if (collection == null || collection.isEmpty()) {
                Object g14 = c2046i2.g(H0.q.f4560y);
                if (g14 == null) {
                    g14 = null;
                }
                Collection collection2 = (Collection) g14;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g15 = c2046i2.g(tVar2);
                    if (g15 == null) {
                        g15 = null;
                    }
                    CharSequence charSequence = (CharSequence) g15;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            g = str;
        }
        return (String) g;
    }

    public static final C0374d e(H0.n nVar) {
        H0.i iVar = nVar.f4505d;
        H0.t tVar = H0.q.f4539a;
        C0374d c0374d = (C0374d) vc.i.u(iVar, H0.q.f4530C);
        List list = (List) vc.i.u(nVar.f4505d, H0.q.f4560y);
        return c0374d == null ? list != null ? (C0374d) Eb.o.Z(list) : null : c0374d;
    }

    public static final boolean f(H0.n nVar) {
        return nVar.f4504c.f54M == V0.l.f9983b;
    }

    public static final boolean g(H0.n nVar, Resources resources) {
        Object g = nVar.f4505d.f4494a.g(H0.q.f4539a);
        if (g == null) {
            g = null;
        }
        List list = (List) g;
        boolean z8 = ((list != null ? (String) Eb.o.Z(list) : null) == null && e(nVar) == null && d(nVar, resources) == null && !c(nVar)) ? false : true;
        if (!X.i(nVar)) {
            if (nVar.f4505d.f4496c) {
                return true;
            }
            if (nVar.m() && z8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6 A[LOOP:1: B:8:0x0037->B:26:0x00d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9 A[EDGE_INSN: B:27:0x00d9->B:34:0x00d9 BREAK  A[LOOP:1: B:8:0x0037->B:26:0x00d6], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList h(boolean z8, List list, C2070x c2070x, Resources resources) {
        C2070x c2070x2 = AbstractC2060m.f24696a;
        C2070x c2070x3 = new C2070x();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            b((H0.n) list.get(i7), arrayList, c2070x3, c2070x, resources);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int s3 = y7.u0.s(arrayList);
        if (s3 >= 0) {
            int i10 = 0;
            while (true) {
                H0.n nVar = (H0.n) arrayList.get(i10);
                if (i10 != 0) {
                    i0.c f4 = nVar.f();
                    i0.c f10 = nVar.f();
                    float f11 = f4.f18175b;
                    float f12 = f10.f18177d;
                    boolean z10 = f11 >= f12;
                    int s10 = y7.u0.s(arrayList2);
                    if (s10 >= 0) {
                        int i11 = 0;
                        while (true) {
                            i0.c cVar = (i0.c) ((Db.j) arrayList2.get(i11)).f3354a;
                            float f13 = cVar.f18175b;
                            float f14 = cVar.f18177d;
                            boolean z11 = f13 >= f14;
                            if (!z10 && !z11 && Math.max(f11, f13) < Math.min(f12, f14)) {
                                arrayList2.set(i11, new Db.j(new i0.c(Math.max(cVar.f18174a, 0.0f), Math.max(cVar.f18175b, f11), Math.min(cVar.f18176c, Float.POSITIVE_INFINITY), Math.min(f14, f12)), ((Db.j) arrayList2.get(i11)).f3355b));
                                ((List) ((Db.j) arrayList2.get(i11)).f3355b).add(nVar);
                                break;
                            }
                            if (i11 == s10) {
                                break;
                            }
                            i11++;
                        }
                        if (i10 != s3) {
                            break;
                        }
                        i10++;
                    }
                }
                arrayList2.add(new Db.j(nVar.f(), y7.u0.B(nVar)));
                if (i10 != s3) {
                }
            }
        }
        Eb.r.T(arrayList2, J0.f1708d);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f1769a[!z8 ? 1 : 0];
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Db.j jVar = (Db.j) arrayList2.get(i12);
            Eb.r.T((List) jVar.f3355b, comparator);
            arrayList3.addAll((Collection) jVar.f3355b);
        }
        int i13 = 0;
        Eb.r.T(arrayList3, new M(f1770b, 0));
        while (i13 <= y7.u0.s(arrayList3)) {
            List list2 = (List) c2070x3.b(((H0.n) arrayList3.get(i13)).g);
            if (list2 != null) {
                if (g((H0.n) arrayList3.get(i13), resources)) {
                    i13++;
                } else {
                    arrayList3.remove(i13);
                }
                arrayList3.addAll(i13, list2);
                i13 += list2.size();
            } else {
                i13++;
            }
        }
        return arrayList3;
    }
}
