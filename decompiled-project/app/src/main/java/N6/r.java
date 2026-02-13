package N6;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class r {
    public static int b(int i7) {
        if (i7 >= 3) {
            return i7 < 1073741824 ? (int) Math.ceil(i7 / 0.75d) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        e(i7, "expectedSize");
        return i7 + 1;
    }

    public static void c(int i7, Object[] objArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(h3.o.l(i10, "at index "));
            }
        }
    }

    public static void d(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(X.c.g(obj2, "null key in entry: null="));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void e(int i7, String str) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i7);
    }

    public static Object g(int i7) {
        if (i7 < 2 || i7 > 1073741824 || Integer.highestOneBit(i7) != i7) {
            throw new IllegalArgumentException(h3.o.l(i7, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i7 <= 256 ? new byte[i7] : i7 <= 65536 ? new short[i7] : new int[i7];
    }

    public static boolean h(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean i(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static E0 j(Set set, M6.m mVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof E0)) {
                set.getClass();
                return new E0(set, mVar);
            }
            E0 e02 = (E0) set;
            M6.m mVar2 = e02.f7224b;
            mVar2.getClass();
            return new E0(e02.f7223a, new M6.n(Arrays.asList(mVar2, mVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof E0)) {
            set2.getClass();
            return new E0(set2, mVar);
        }
        E0 e03 = (E0) set2;
        M6.m mVar3 = e03.f7224b;
        mVar3.getClass();
        return new E0((SortedSet) e03.f7223a, new M6.n(Arrays.asList(mVar3, mVar)));
    }

    public static Object k(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object l(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int m(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ~(~(i7 + (next != null ? next.hashCode() : 0)));
        }
        return i7;
    }

    public static D0 n(L l10, L l11) {
        Q5.e.m(l10, "set1");
        Q5.e.m(l11, "set2");
        return new D0(l10, l11, 1);
    }

    public static int o(int i7, int i10, int i11) {
        return (i7 & (~i11)) | (i10 & i11);
    }

    public static ArrayList p(Object... objArr) {
        int length = objArr.length;
        e(length, "arraySize");
        ArrayList arrayList = new ArrayList(h3.H.C(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        v(r12, r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r13[r5] = o(r13[r5], r9, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int q(Object obj, Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int t5 = t(obj);
        int i10 = t5 & i7;
        int u3 = u(i10, obj3);
        if (u3 == 0) {
            return -1;
        }
        int i11 = ~i7;
        int i12 = t5 & i11;
        int i13 = -1;
        while (true) {
            int i14 = u3 - 1;
            int i15 = iArr[i14];
            if ((i15 & i11) != i12 || !O5.b.o(obj, objArr[i14]) || (objArr2 != null && !O5.b.o(obj2, objArr2[i14]))) {
                int i16 = i15 & i7;
                if (i16 == 0) {
                    return -1;
                }
                i13 = i14;
                u3 = i16;
            }
        }
    }

    public static void r(List list, M6.m mVar, int i7, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (mVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            list.remove(i11);
        }
    }

    public static int s(int i7) {
        return (int) (Integer.rotateLeft((int) (i7 * (-862048943)), 15) * 461845907);
    }

    public static int t(Object obj) {
        return s(obj == null ? 0 : obj.hashCode());
    }

    public static int u(int i7, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i7] & 255 : obj instanceof short[] ? ((short[]) obj)[i7] & 65535 : ((int[]) obj)[i7];
    }

    public static void v(Object obj, int i7, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i10;
        } else {
            ((int[]) obj)[i7] = i10;
        }
    }

    public D5.i a() {
        e(2, "expectedValuesPerKey");
        return new D5.i(this, 27);
    }

    public abstract Map f();
}
