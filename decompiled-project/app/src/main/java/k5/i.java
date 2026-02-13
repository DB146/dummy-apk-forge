package k5;

import P4.n0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import n5.D;

/* loaded from: classes.dex */
public final class i extends x {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f18910e0 = 0;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f18911O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f18912P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f18913Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f18914R;

    /* renamed from: S, reason: collision with root package name */
    public final boolean f18915S;

    /* renamed from: T, reason: collision with root package name */
    public final boolean f18916T;

    /* renamed from: U, reason: collision with root package name */
    public final boolean f18917U;

    /* renamed from: V, reason: collision with root package name */
    public final boolean f18918V;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f18919W;

    /* renamed from: X, reason: collision with root package name */
    public final boolean f18920X;

    /* renamed from: Y, reason: collision with root package name */
    public final boolean f18921Y;

    /* renamed from: Z, reason: collision with root package name */
    public final boolean f18922Z;

    /* renamed from: a0, reason: collision with root package name */
    public final boolean f18923a0;

    /* renamed from: b0, reason: collision with root package name */
    public final boolean f18924b0;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseArray f18925c0;

    /* renamed from: d0, reason: collision with root package name */
    public final SparseBooleanArray f18926d0;

    static {
        new i(new C1429h());
        int i7 = D.f21141a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
    }

    public i(C1429h c1429h) {
        super(c1429h);
        this.f18911O = c1429h.f18895A;
        this.f18912P = c1429h.f18896B;
        this.f18913Q = c1429h.f18897C;
        this.f18914R = c1429h.f18898D;
        this.f18915S = c1429h.f18899E;
        this.f18916T = c1429h.f18900F;
        this.f18917U = c1429h.f18901G;
        this.f18918V = c1429h.f18902H;
        this.f18919W = c1429h.f18903I;
        this.f18920X = c1429h.f18904J;
        this.f18921Y = c1429h.f18905K;
        this.f18922Z = c1429h.L;
        this.f18923a0 = c1429h.f18906M;
        this.f18924b0 = c1429h.f18907N;
        this.f18925c0 = c1429h.f18908O;
        this.f18926d0 = c1429h.f18909P;
    }

    @Override // k5.x
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (super.equals(iVar) && this.f18911O == iVar.f18911O && this.f18912P == iVar.f18912P && this.f18913Q == iVar.f18913Q && this.f18914R == iVar.f18914R && this.f18915S == iVar.f18915S && this.f18916T == iVar.f18916T && this.f18917U == iVar.f18917U && this.f18918V == iVar.f18918V && this.f18919W == iVar.f18919W && this.f18920X == iVar.f18920X && this.f18921Y == iVar.f18921Y && this.f18922Z == iVar.f18922Z && this.f18923a0 == iVar.f18923a0 && this.f18924b0 == iVar.f18924b0) {
            SparseBooleanArray sparseBooleanArray = this.f18926d0;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = iVar.f18926d0;
            if (sparseBooleanArray2.size() == size) {
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        SparseArray sparseArray = this.f18925c0;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = iVar.f18925c0;
                        if (sparseArray2.size() == size2) {
                            for (int i10 = 0; i10 < size2; i10++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i10);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            n0 n0Var = (n0) entry.getKey();
                                            if (map2.containsKey(n0Var) && D.a(entry.getValue(), map2.get(n0Var))) {
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    } else {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) < 0) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        return false;
    }

    @Override // k5.x
    public final int hashCode() {
        return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f18911O ? 1 : 0)) * 31) + (this.f18912P ? 1 : 0)) * 31) + (this.f18913Q ? 1 : 0)) * 31) + (this.f18914R ? 1 : 0)) * 31) + (this.f18915S ? 1 : 0)) * 31) + (this.f18916T ? 1 : 0)) * 31) + (this.f18917U ? 1 : 0)) * 31) + (this.f18918V ? 1 : 0)) * 31) + (this.f18919W ? 1 : 0)) * 31) + (this.f18920X ? 1 : 0)) * 31) + (this.f18921Y ? 1 : 0)) * 31) + (this.f18922Z ? 1 : 0)) * 31) + (this.f18923a0 ? 1 : 0)) * 31) + (this.f18924b0 ? 1 : 0);
    }
}
