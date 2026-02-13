package A9;

import android.os.Parcelable;
import android.util.SparseArray;
import u.C2066t;

/* renamed from: A9.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0122p implements H2.Z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0145v f1339a;

    public C0122p(AbstractC0145v abstractC0145v) {
        this.f1339a = abstractC0145v;
    }

    public final void a(H2.i0 i0Var) {
        N0 n02 = this.f1339a.f1419Y0;
        n02.getClass();
        int c10 = i0Var.c();
        if (c10 != -1) {
            A4.h hVar = n02.f903e0;
            int i7 = hVar.f385b;
            if (i7 == 1) {
                C2066t c2066t = (C2066t) hVar.f387d;
                if (c2066t == null || c2066t.size() == 0) {
                    return;
                }
                ((C2066t) hVar.f387d).remove(Integer.toString(c10));
                return;
            }
            if ((i7 == 2 || i7 == 3) && ((C2066t) hVar.f387d) != null) {
                String num = Integer.toString(c10);
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                i0Var.f4707a.saveHierarchyState(sparseArray);
                ((C2066t) hVar.f387d).put(num, sparseArray);
            }
        }
    }
}
