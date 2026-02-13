package n5;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f21175a;

    public f(SparseBooleanArray sparseBooleanArray) {
        this.f21175a = sparseBooleanArray;
    }

    public final int a(int i7) {
        SparseBooleanArray sparseBooleanArray = this.f21175a;
        AbstractC1705a.k(i7, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        int i7 = D.f21141a;
        SparseBooleanArray sparseBooleanArray = this.f21175a;
        if (i7 >= 24) {
            return sparseBooleanArray.equals(fVar.f21175a);
        }
        if (sparseBooleanArray.size() != fVar.f21175a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            if (a(i10) != fVar.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = D.f21141a;
        SparseBooleanArray sparseBooleanArray = this.f21175a;
        if (i7 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }
}
