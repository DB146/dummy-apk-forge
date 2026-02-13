package Eb;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import y7.u0;

/* loaded from: classes2.dex */
public abstract class o extends r {
    public static void U(Collection collection, Iterable elements) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        kotlin.jvm.internal.l.e(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static boolean V(Iterable iterable, Object obj) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : a0(iterable, obj) >= 0;
    }

    public static List W(int i7, List list) {
        if (i7 < 0) {
            throw new IllegalArgumentException(A3.c.f(i7, "Requested element count ", " is less than zero.").toString());
        }
        if (i7 == 0) {
            return s0(list);
        }
        int size = list.size() - i7;
        if (size <= 0) {
            return v.f3891a;
        }
        if (size == 1) {
            return u0.x(e0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i7 < size2) {
                arrayList.add(list.get(i7));
                i7++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i7);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static ArrayList X(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object Y(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object Z(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int a0(Iterable iterable, Object obj) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i7 = 0;
        for (Object obj2 : iterable) {
            if (i7 < 0) {
                u0.M();
                throw null;
            }
            if (kotlin.jvm.internal.l.a(obj, obj2)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static final void b0(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Rb.c cVar) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        sb2.append(charSequence2);
        int i7 = 0;
        for (Object obj : iterable) {
            i7++;
            if (i7 > 1) {
                sb2.append(charSequence);
            }
            com.bumptech.glide.d.b(sb2, obj, cVar);
        }
        sb2.append(charSequence3);
    }

    public static /* synthetic */ void c0(ArrayList arrayList, StringBuilder sb2) {
        b0(arrayList, sb2, "\n", "", "", "...", null);
    }

    public static String d0(Iterable iterable, String str, String str2, String str3, Rb.c cVar, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i7 & 2) != 0 ? "" : str2;
        String str5 = (i7 & 4) != 0 ? "" : str3;
        if ((i7 & 32) != 0) {
            cVar = null;
        }
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        StringBuilder sb2 = new StringBuilder();
        b0(iterable, sb2, str4, prefix, str5, "...", cVar);
        return sb2.toString();
    }

    public static Object e0(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(u0.s(list));
    }

    public static Object f0(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable g0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList h0(Collection collection, Object obj) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList i0(Collection collection, List elements) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        kotlin.jvm.internal.l.e(elements, "elements");
        ArrayList arrayList = new ArrayList(elements.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(elements);
        return arrayList;
    }

    public static Object j0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object k0(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(u0.s(list));
    }

    public static List l0(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return s0(iterable);
        }
        List v02 = v0(iterable);
        Collections.reverse(v02);
        return v02;
    }

    public static List m0(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List v02 = v0(iterable);
            if (((ArrayList) v02).size() > 1) {
                Collections.sort(v02);
            }
            return v02;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return s0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.l.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return n.J(array);
    }

    public static List n0(Comparator comparator, Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List v02 = v0(iterable);
            r.T(v02, comparator);
            return v02;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return s0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.jvm.internal.l.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return n.J(array);
    }

    public static List o0(int i7, List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(A3.c.f(i7, "Requested element count ", " is less than zero.").toString());
        }
        if (i7 == 0) {
            return v.f3891a;
        }
        if (i7 >= list.size()) {
            return s0(list);
        }
        if (i7 == 1) {
            return u0.x(Y(list));
        }
        ArrayList arrayList = new ArrayList(i7);
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == i7) {
                break;
            }
        }
        return u0.C(arrayList);
    }

    public static byte[] p0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            bArr[i7] = ((Number) it.next()).byteValue();
            i7++;
        }
        return bArr;
    }

    public static final void q0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] r0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Number) it.next()).intValue();
            i7++;
        }
        return iArr;
    }

    public static List s0(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return u0.C(v0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return v.f3891a;
        }
        if (size != 1) {
            return u0(collection);
        }
        return u0.x(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] t0(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            jArr[i7] = ((Number) it.next()).longValue();
            i7++;
        }
        return jArr;
    }

    public static ArrayList u0(Collection collection) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List v0(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return u0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        q0(iterable, arrayList);
        return arrayList;
    }

    public static Set w0(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        boolean z8 = iterable instanceof Collection;
        x xVar = x.f3893a;
        if (!z8) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            q0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return xVar;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(linkedHashSet.iterator().next());
            kotlin.jvm.internal.l.d(singleton, "singleton(...)");
            return singleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return xVar;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(B.F(collection.size()));
            q0(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set singleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        kotlin.jvm.internal.l.d(singleton2, "singleton(...)");
        return singleton2;
    }
}
