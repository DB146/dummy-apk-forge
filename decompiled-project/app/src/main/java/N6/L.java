package N6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class L extends C implements Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f7237c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient H f7238b;

    public static int D(int i7) {
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static L E(int i7, Object... objArr) {
        if (i7 == 0) {
            return z0.f7379x;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new G0(obj);
        }
        int D10 = D(i7);
        Object[] objArr2 = new Object[D10];
        int i10 = D10 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(h3.o.l(i13, "at index "));
            }
            int hashCode = obj2.hashCode();
            int s3 = r.s(hashCode);
            while (true) {
                int i14 = s3 & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += hashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                s3++;
            }
        }
        Arrays.fill(objArr, i12, i7, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new G0(obj4);
        }
        if (D(i12) < D10 / 2) {
            return E(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new z0(objArr, i11, objArr2, i10, i12);
    }

    public static L F(Collection collection) {
        if ((collection instanceof L) && !(collection instanceof SortedSet)) {
            L l10 = (L) collection;
            if (!l10.z()) {
                return l10;
            }
        }
        Object[] array = collection.toArray();
        return E(array.length, array);
    }

    public H G() {
        Object[] array = toArray(C.f7214a);
        F f4 = H.f7232b;
        return H.D(array.length, array);
    }

    @Override // N6.C
    public H b() {
        H h10 = this.f7238b;
        if (h10 != null) {
            return h10;
        }
        H G9 = G();
        this.f7238b = G9;
        return G9;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof L) && (this instanceof z0)) {
            L l10 = (L) obj;
            l10.getClass();
            if ((l10 instanceof z0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return r.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return r.m(this);
    }
}
