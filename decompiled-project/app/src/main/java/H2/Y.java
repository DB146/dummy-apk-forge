package H2;

import A9.C0122p;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import u1.AbstractC2096f;
import y1.C2353a;
import y1.C2354b;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4626a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4627b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4628c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4629d;

    /* renamed from: e, reason: collision with root package name */
    public int f4630e;

    /* renamed from: f, reason: collision with root package name */
    public int f4631f;
    public X g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4632h;

    public Y(RecyclerView recyclerView) {
        this.f4632h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f4626a = arrayList;
        this.f4627b = null;
        this.f4628c = new ArrayList();
        this.f4629d = Collections.unmodifiableList(arrayList);
        this.f4630e = 2;
        this.f4631f = 2;
    }

    public final void a(i0 i0Var, boolean z8) {
        RecyclerView.l(i0Var);
        RecyclerView recyclerView = this.f4632h;
        k0 k0Var = recyclerView.C0;
        View view = i0Var.f4707a;
        if (k0Var != null) {
            j0 j0Var = k0Var.f4738e;
            y1.K.n(view, j0Var != null ? (C2354b) j0Var.f4734e.remove(view) : null);
        }
        if (z8) {
            Z z10 = recyclerView.f13616C;
            if (z10 != null) {
                ((C0122p) z10).a(i0Var);
            }
            ArrayList arrayList = recyclerView.f13617D;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((C0122p) ((Z) arrayList.get(i7))).a(i0Var);
            }
            K k = recyclerView.f13612A;
            if (k != null) {
                k.k(i0Var);
            }
            if (recyclerView.f13676v0 != null) {
                recyclerView.f13673u.J(i0Var);
            }
            if (RecyclerView.f13603P0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + i0Var);
            }
        }
        i0Var.f4722s = null;
        i0Var.f4721r = null;
        X c10 = c();
        c10.getClass();
        int i10 = i0Var.f4712f;
        ArrayList arrayList2 = c10.a(i10).f4619a;
        if (((W) c10.f4623a.get(i10)).f4620b <= arrayList2.size()) {
            android.support.v4.media.session.b.e(view);
        } else {
            if (RecyclerView.f13602O0 && arrayList2.contains(i0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            i0Var.p();
            arrayList2.add(i0Var);
        }
    }

    public final int b(int i7) {
        RecyclerView recyclerView = this.f4632h;
        if (i7 >= 0 && i7 < recyclerView.f13676v0.b()) {
            return !recyclerView.f13676v0.g ? i7 : recyclerView.f13655e.g(i7, 0);
        }
        StringBuilder r10 = h3.o.r(i7, "invalid position ", ". State item count is ");
        r10.append(recyclerView.f13676v0.b());
        r10.append(recyclerView.B());
        throw new IndexOutOfBoundsException(r10.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [H2.X, java.lang.Object] */
    public final X c() {
        if (this.g == null) {
            ?? obj = new Object();
            obj.f4623a = new SparseArray();
            obj.f4624b = 0;
            obj.f4625c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = obj;
            e();
        }
        return this.g;
    }

    public final View d(int i7) {
        return l(i7, Long.MAX_VALUE).f4707a;
    }

    public final void e() {
        RecyclerView recyclerView;
        K k;
        X x2 = this.g;
        if (x2 == null || (k = (recyclerView = this.f4632h).f13612A) == null || !recyclerView.f13625H) {
            return;
        }
        x2.f4625c.add(k);
    }

    public final void f(K k, boolean z8) {
        X x2 = this.g;
        if (x2 == null) {
            return;
        }
        Set set = x2.f4625c;
        set.remove(k);
        if (set.size() != 0 || z8) {
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = x2.f4623a;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((W) sparseArray.get(sparseArray.keyAt(i7))).f4619a;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                android.support.v4.media.session.b.e(((i0) arrayList.get(i10)).f4707a);
            }
            i7++;
        }
    }

    public final void g() {
        ArrayList arrayList = this.f4628c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.f13608U0) {
            C0305t c0305t = this.f4632h.f13674u0;
            int[] iArr = (int[]) c0305t.f4829e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0305t.f4828d = 0;
        }
    }

    public final void h(int i7) {
        if (RecyclerView.f13603P0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i7);
        }
        ArrayList arrayList = this.f4628c;
        i0 i0Var = (i0) arrayList.get(i7);
        if (RecyclerView.f13603P0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + i0Var);
        }
        a(i0Var, true);
        arrayList.remove(i7);
    }

    public final void i(View view) {
        i0 M3 = RecyclerView.M(view);
        boolean m10 = M3.m();
        RecyclerView recyclerView = this.f4632h;
        if (m10) {
            recyclerView.removeDetachedView(view, false);
        }
        if (M3.l()) {
            M3.f4717n.m(M3);
        } else if (M3.s()) {
            M3.j &= -33;
        }
        j(M3);
        if (recyclerView.f13654d0 == null || M3.j()) {
            return;
        }
        recyclerView.f13654d0.d(M3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(i0 i0Var) {
        boolean z8;
        K k;
        boolean z10;
        boolean z11;
        boolean l10 = i0Var.l();
        boolean z12 = true;
        RecyclerView recyclerView = this.f4632h;
        View view = i0Var.f4707a;
        if (l10 || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(i0Var.l());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.B());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i0Var.m()) {
            StringBuilder sb3 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb3.append(i0Var);
            throw new IllegalArgumentException(A3.c.g(recyclerView, sb3));
        }
        if (i0Var.r()) {
            throw new IllegalArgumentException(A3.c.g(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((i0Var.j & 16) == 0) {
            WeakHashMap weakHashMap = y1.K.f26642a;
            if (view.hasTransientState()) {
                z8 = true;
                k = recyclerView.f13612A;
                if (k != null && z8) {
                    k.h(i0Var);
                }
                z10 = RecyclerView.f13602O0;
                ArrayList arrayList = this.f4628c;
                if (!z10 && arrayList.contains(i0Var)) {
                    StringBuilder sb4 = new StringBuilder("cached view received recycle internal? ");
                    sb4.append(i0Var);
                    throw new IllegalArgumentException(A3.c.g(recyclerView, sb4));
                }
                if (i0Var.j()) {
                    if (RecyclerView.f13603P0) {
                        Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.B());
                    }
                    z12 = false;
                } else {
                    if (this.f4631f <= 0 || i0Var.f(526)) {
                        z11 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.f4631f && size > 0) {
                            h(0);
                            size--;
                        }
                        if (RecyclerView.f13608U0 && size > 0) {
                            C0305t c0305t = recyclerView.f13674u0;
                            int i7 = i0Var.f4709c;
                            if (((int[]) c0305t.f4829e) != null) {
                                int i10 = c0305t.f4828d * 2;
                                for (int i11 = 0; i11 < i10; i11 += 2) {
                                    if (((int[]) c0305t.f4829e)[i11] == i7) {
                                        break;
                                    }
                                }
                            }
                            int i12 = size - 1;
                            loop1: while (i12 >= 0) {
                                int i13 = ((i0) arrayList.get(i12)).f4709c;
                                C0305t c0305t2 = recyclerView.f13674u0;
                                if (((int[]) c0305t2.f4829e) == null) {
                                    break;
                                }
                                int i14 = c0305t2.f4828d * 2;
                                for (int i15 = 0; i15 < i14; i15 += 2) {
                                    if (((int[]) c0305t2.f4829e)[i15] == i13) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i12 + 1;
                        }
                        arrayList.add(size, i0Var);
                        z11 = true;
                    }
                    if (z11) {
                        z12 = false;
                    } else {
                        a(i0Var, true);
                    }
                    r1 = z11;
                }
                recyclerView.f13673u.J(i0Var);
                if (r1 && !z12 && z8) {
                    android.support.v4.media.session.b.e(view);
                    i0Var.f4722s = null;
                    i0Var.f4721r = null;
                    return;
                }
                return;
            }
        }
        z8 = false;
        k = recyclerView.f13612A;
        if (k != null) {
            k.h(i0Var);
        }
        z10 = RecyclerView.f13602O0;
        ArrayList arrayList2 = this.f4628c;
        if (!z10) {
        }
        if (i0Var.j()) {
        }
        recyclerView.f13673u.J(i0Var);
        if (r1) {
        }
    }

    public final void k(View view) {
        P p10;
        i0 M3 = RecyclerView.M(view);
        boolean f4 = M3.f(12);
        RecyclerView recyclerView = this.f4632h;
        if (!f4 && M3.n() && (p10 = recyclerView.f13654d0) != null) {
            C0296j c0296j = (C0296j) p10;
            if (M3.e().isEmpty() && c0296j.g && !M3.i()) {
                if (this.f4627b == null) {
                    this.f4627b = new ArrayList();
                }
                M3.f4717n = this;
                M3.f4718o = true;
                this.f4627b.add(M3);
                return;
            }
        }
        if (M3.i() && !M3.k() && !recyclerView.f13612A.f4600b) {
            throw new IllegalArgumentException(A3.c.g(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        M3.f4717n = this;
        M3.f4718o = false;
        this.f4626a.add(M3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x044d, code lost:
    
        if (r11.i() == false) goto L247;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x060c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i0 l(int i7, long j) {
        boolean z8;
        i0 i0Var;
        boolean z10;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        boolean z11;
        boolean z12;
        ViewGroup.LayoutParams layoutParams;
        T t5;
        RecyclerView G9;
        i0 i0Var2;
        i0 i0Var3;
        View view;
        boolean z13;
        int size;
        int g;
        RecyclerView recyclerView3 = this.f4632h;
        if (i7 < 0 || i7 >= recyclerView3.f13676v0.b()) {
            StringBuilder q10 = h3.o.q(i7, i7, "Invalid item position ", "(", "). Item count:");
            q10.append(recyclerView3.f13676v0.b());
            q10.append(recyclerView3.B());
            throw new IndexOutOfBoundsException(q10.toString());
        }
        e0 e0Var = recyclerView3.f13676v0;
        if (e0Var.g) {
            ArrayList arrayList = this.f4627b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        i0Var = (i0) this.f4627b.get(i10);
                        if (!i0Var.s() && i0Var.d() == i7) {
                            i0Var.a(32);
                            break;
                        }
                        i10++;
                    } else if (recyclerView3.f13612A.f4600b && (g = recyclerView3.f13655e.g(i7, 0)) > 0 && g < recyclerView3.f13612A.a()) {
                        long b2 = recyclerView3.f13612A.b(g);
                        for (int i11 = 0; i11 < size; i11++) {
                            i0 i0Var4 = (i0) this.f4627b.get(i11);
                            if (!i0Var4.s() && i0Var4.f4711e == b2) {
                                i0Var4.a(32);
                                i0Var = i0Var4;
                                break;
                            }
                        }
                    }
                }
                z8 = i0Var == null;
            }
            i0Var = null;
            if (i0Var == null) {
            }
        } else {
            z8 = false;
            i0Var = null;
        }
        ArrayList arrayList2 = this.f4628c;
        ArrayList arrayList3 = this.f4626a;
        if (i0Var == null) {
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                i0 i0Var5 = (i0) arrayList3.get(i12);
                if (!i0Var5.s() && i0Var5.d() == i7 && !i0Var5.i() && (e0Var.g || !i0Var5.k())) {
                    i0Var5.a(32);
                    i0Var = i0Var5;
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView3.f13657f.f2092e;
            int size3 = arrayList4.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i13);
                i0 M3 = RecyclerView.M(view);
                if (M3.d() == i7 && !M3.i() && !M3.k()) {
                    break;
                }
                i13++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        i0Var = null;
                        break;
                    }
                    i0Var = (i0) arrayList2.get(i14);
                    if (i0Var.i() || i0Var.d() != i7 || i0Var.g()) {
                        i14++;
                    } else {
                        arrayList2.remove(i14);
                        if (RecyclerView.f13603P0) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i7 + ") found match in cache: " + i0Var);
                        }
                    }
                }
            } else {
                i0 M10 = RecyclerView.M(view);
                B4.j jVar = recyclerView3.f13657f;
                int indexOfChild = ((RecyclerView) ((D5.i) jVar.f2090c).f3256b).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                A4.f fVar = (A4.f) jVar.f2091d;
                if (!fVar.J(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                fVar.G(indexOfChild);
                jVar.A(view);
                int r10 = recyclerView3.f13657f.r(view);
                if (r10 == -1) {
                    StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb2.append(M10);
                    throw new IllegalStateException(A3.c.g(recyclerView3, sb2));
                }
                recyclerView3.f13657f.g(r10);
                k(view);
                M10.a(8224);
                i0Var = M10;
            }
            if (i0Var != null) {
                if (!i0Var.k()) {
                    int i15 = i0Var.f4709c;
                    if (i15 < 0 || i15 >= recyclerView3.f13612A.a()) {
                        StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb3.append(i0Var);
                        throw new IndexOutOfBoundsException(A3.c.g(recyclerView3, sb3));
                    }
                    if (e0Var.g || recyclerView3.f13612A.c(i0Var.f4709c) == i0Var.f4712f) {
                        K k = recyclerView3.f13612A;
                        if (!k.f4600b || i0Var.f4711e == k.b(i0Var.f4709c)) {
                            z13 = true;
                        }
                    }
                    z13 = false;
                } else {
                    if (RecyclerView.f13602O0 && !e0Var.g) {
                        throw new IllegalStateException(A3.c.g(recyclerView3, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z13 = e0Var.g;
                }
                if (z13) {
                    z8 = true;
                } else {
                    i0Var.a(4);
                    if (i0Var.l()) {
                        recyclerView3.removeDetachedView(i0Var.f4707a, false);
                        i0Var.f4717n.m(i0Var);
                    } else if (i0Var.s()) {
                        i0Var.j &= -33;
                    }
                    j(i0Var);
                    i0Var = null;
                }
            }
        }
        if (i0Var == null) {
            int g2 = recyclerView3.f13655e.g(i7, 0);
            if (g2 < 0 || g2 >= recyclerView3.f13612A.a()) {
                StringBuilder q11 = h3.o.q(i7, g2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                q11.append(e0Var.b());
                q11.append(recyclerView3.B());
                throw new IndexOutOfBoundsException(q11.toString());
            }
            int c10 = recyclerView3.f13612A.c(g2);
            K k7 = recyclerView3.f13612A;
            if (k7.f4600b) {
                long b10 = k7.b(g2);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        i0 i0Var6 = (i0) arrayList3.get(size5);
                        if (i0Var6.f4711e == b10 && !i0Var6.s()) {
                            if (c10 == i0Var6.f4712f) {
                                i0Var6.a(32);
                                if (i0Var6.k() && !e0Var.g) {
                                    i0Var6.j = (i0Var6.j & (-15)) | 2;
                                }
                                i0Var3 = i0Var6;
                            } else {
                                arrayList3.remove(size5);
                                View view2 = i0Var6.f4707a;
                                recyclerView3.removeDetachedView(view2, false);
                                i0 M11 = RecyclerView.M(view2);
                                M11.f4717n = null;
                                M11.f4718o = false;
                                M11.j &= -33;
                                j(M11);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            i0Var3 = (i0) arrayList2.get(size6);
                            if (i0Var3.f4711e != b10 || i0Var3.g()) {
                                size6--;
                            } else if (c10 == i0Var3.f4712f) {
                                arrayList2.remove(size6);
                            } else {
                                h(size6);
                            }
                        }
                        i0Var3 = null;
                    }
                }
                if (i0Var3 != null) {
                    i0Var3.f4709c = g2;
                    i0Var = i0Var3;
                    z8 = true;
                } else {
                    i0Var = i0Var3;
                }
            }
            if (i0Var == null) {
                if (RecyclerView.f13603P0) {
                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i7 + ") fetching from shared pool");
                }
                W w10 = (W) c().f4623a.get(c10);
                if (w10 != null) {
                    ArrayList arrayList5 = w10.f4619a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((i0) arrayList5.get(size7)).g()) {
                                i0Var2 = (i0) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                i0Var2 = null;
                if (i0Var2 != null) {
                    i0Var2.p();
                    boolean z14 = RecyclerView.f13602O0;
                }
                i0Var = i0Var2;
            }
            if (i0Var == null) {
                long nanoTime = recyclerView3.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j10 = this.g.a(c10).f4621c;
                    if (!(j10 == 0 || j10 + nanoTime < j)) {
                        return null;
                    }
                }
                K k10 = recyclerView3.f13612A;
                k10.getClass();
                try {
                    int i16 = AbstractC2096f.f24827a;
                    Trace.beginSection("RV CreateView");
                    i0Var = k10.g(recyclerView3, c10);
                    if (i0Var.f4707a.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    i0Var.f4712f = c10;
                    Trace.endSection();
                    if (RecyclerView.f13608U0 && (G9 = RecyclerView.G(i0Var.f4707a)) != null) {
                        i0Var.f4708b = new WeakReference(G9);
                    }
                    long nanoTime2 = recyclerView3.getNanoTime() - nanoTime;
                    W a9 = this.g.a(c10);
                    long j11 = a9.f4621c;
                    if (j11 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j11 / 4) * 3);
                    }
                    a9.f4621c = nanoTime2;
                    if (RecyclerView.f13603P0) {
                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                    }
                } finally {
                    int i17 = AbstractC2096f.f24827a;
                    Trace.endSection();
                }
            }
        }
        if (z8 && !e0Var.g && i0Var.f(8192)) {
            i0Var.j &= -8193;
            if (e0Var.j) {
                P.b(i0Var);
                P p10 = recyclerView3.f13654d0;
                i0Var.e();
                p10.getClass();
                O o10 = new O(0);
                o10.b(i0Var);
                recyclerView3.a0(i0Var, o10);
            }
        }
        boolean z15 = e0Var.g;
        View view3 = i0Var.f4707a;
        if (!z15 || !i0Var.h()) {
            if (i0Var.h()) {
                if (!((i0Var.j & 2) != 0)) {
                }
            }
            if (RecyclerView.f13602O0 && i0Var.k()) {
                StringBuilder sb4 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb4.append(i0Var);
                throw new IllegalStateException(A3.c.g(recyclerView3, sb4));
            }
            int g10 = recyclerView3.f13655e.g(i7, 0);
            i0Var.f4722s = null;
            i0Var.f4721r = recyclerView3;
            int i18 = i0Var.f4712f;
            long nanoTime3 = recyclerView3.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j12 = this.g.a(i18).f4622d;
                if (j12 != 0 && j12 + nanoTime3 >= j) {
                    z12 = false;
                    recyclerView2 = recyclerView3;
                    z11 = true;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        t5 = (T) recyclerView2.generateDefaultLayoutParams();
                        view3.setLayoutParams(t5);
                    } else if (recyclerView2.checkLayoutParams(layoutParams)) {
                        t5 = (T) layoutParams;
                    } else {
                        t5 = (T) recyclerView2.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(t5);
                    }
                    t5.f4615a = i0Var;
                    if (z8 || !z12) {
                        z11 = false;
                    }
                    t5.f4618d = z11;
                    return i0Var;
                }
            }
            if (i0Var.m()) {
                recyclerView3.attachViewToParent(view3, recyclerView3.getChildCount(), view3.getLayoutParams());
                z10 = true;
            } else {
                z10 = false;
            }
            K k11 = recyclerView3.f13612A;
            k11.getClass();
            boolean z16 = i0Var.f4722s == null;
            if (z16) {
                i0Var.f4709c = g10;
                if (k11.f4600b) {
                    recyclerView = recyclerView3;
                    i0Var.f4711e = k11.b(g10);
                } else {
                    recyclerView = recyclerView3;
                }
                i0Var.j = (i0Var.j & (-520)) | 1;
                int i19 = AbstractC2096f.f24827a;
                Trace.beginSection("RV OnBindView");
            } else {
                recyclerView = recyclerView3;
            }
            i0Var.f4722s = k11;
            if (RecyclerView.f13602O0) {
                if (view3.getParent() == null) {
                    WeakHashMap weakHashMap = y1.K.f26642a;
                    if (view3.isAttachedToWindow() != i0Var.m()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + i0Var.m() + ", attached to window: " + view3.isAttachedToWindow() + ", holder: " + i0Var);
                    }
                }
                if (view3.getParent() == null) {
                    WeakHashMap weakHashMap2 = y1.K.f26642a;
                    if (view3.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + i0Var);
                    }
                }
            }
            i0Var.e();
            k11.f(i0Var, g10);
            if (z16) {
                ArrayList arrayList6 = i0Var.k;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                i0Var.j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 instanceof T) {
                    ((T) layoutParams2).f4617c = true;
                }
            }
            recyclerView2 = recyclerView;
            if (z10) {
                recyclerView2.detachViewFromParent(view3);
            }
            long nanoTime4 = recyclerView2.getNanoTime() - nanoTime3;
            W a10 = this.g.a(i0Var.f4712f);
            long j13 = a10.f4622d;
            if (j13 != 0) {
                nanoTime4 = (nanoTime4 / 4) + ((j13 / 4) * 3);
            }
            a10.f4622d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView2.f13640Q;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap3 = y1.K.f26642a;
                if (view3.getImportantForAccessibility() == 0) {
                    z11 = true;
                    view3.setImportantForAccessibility(1);
                } else {
                    z11 = true;
                }
                k0 k0Var = recyclerView2.C0;
                if (k0Var != null) {
                    j0 j0Var = k0Var.f4738e;
                    if (j0Var != null) {
                        View.AccessibilityDelegate d10 = y1.K.d(view3);
                        C2354b c2354b = d10 != null ? d10 instanceof C2353a ? ((C2353a) d10).f26677a : new C2354b(d10) : null;
                        if (c2354b != null && c2354b != j0Var) {
                            j0Var.f4734e.put(view3, c2354b);
                        }
                    }
                    y1.K.n(view3, j0Var);
                }
            } else {
                z11 = true;
            }
            if (e0Var.g) {
                i0Var.g = i7;
            }
            z12 = z11;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            t5.f4615a = i0Var;
            if (z8) {
            }
            z11 = false;
            t5.f4618d = z11;
            return i0Var;
        }
        i0Var.g = i7;
        recyclerView2 = recyclerView3;
        z12 = false;
        z11 = true;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        t5.f4615a = i0Var;
        if (z8) {
        }
        z11 = false;
        t5.f4618d = z11;
        return i0Var;
    }

    public final void m(i0 i0Var) {
        if (i0Var.f4718o) {
            this.f4627b.remove(i0Var);
        } else {
            this.f4626a.remove(i0Var);
        }
        i0Var.f4717n = null;
        i0Var.f4718o = false;
        i0Var.j &= -33;
    }

    public final void n() {
        androidx.recyclerview.widget.a aVar = this.f4632h.f13614B;
        this.f4631f = this.f4630e + (aVar != null ? aVar.j : 0);
        ArrayList arrayList = this.f4628c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f4631f; size--) {
            h(size);
        }
    }
}
