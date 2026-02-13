package ac;

import Eb.p;
import Eb.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y7.u0;

/* loaded from: classes2.dex */
public abstract class h extends com.bumptech.glide.d {
    public static String P(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        return Zb.i.O(new Zb.j(new t(str, 3), new U9.b("    ", 8), 1), "\n");
    }

    public static String Q(String str) {
        int i7;
        Comparable comparable;
        String str2;
        kotlin.jvm.internal.l.e(str, "<this>");
        List P10 = Zb.i.P(new t(str, 3));
        ArrayList arrayList = new ArrayList();
        for (Object obj : P10) {
            if (!g.h0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i7 >= length) {
                    i7 = -1;
                    break;
                }
                if (!com.bumptech.glide.c.J(str3.charAt(i7))) {
                    break;
                }
                i7++;
            }
            if (i7 == -1) {
                i7 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i7));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        P10.size();
        int s3 = u0.s(P10);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : P10) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                u0.M();
                throw null;
            }
            String str4 = (String) obj2;
            if ((i7 == 0 || i7 == s3) && g.h0(str4)) {
                str2 = null;
            } else {
                kotlin.jvm.internal.l.e(str4, "<this>");
                if (intValue < 0) {
                    throw new IllegalArgumentException(A3.c.f(intValue, "Requested character count ", " is less than zero.").toString());
                }
                int length3 = str4.length();
                if (intValue <= length3) {
                    length3 = intValue;
                }
                str2 = str4.substring(length3);
                kotlin.jvm.internal.l.d(str2, "substring(...)");
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i7 = i10;
        }
        StringBuilder sb2 = new StringBuilder(length2);
        Eb.o.c0(arrayList3, sb2);
        return sb2.toString();
    }

    public static String R(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        if (g.h0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List P10 = Zb.i.P(new t(str, 3));
        int length = str.length();
        P10.size();
        int s3 = u0.s(P10);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        for (Object obj : P10) {
            int i10 = i7 + 1;
            String str2 = null;
            if (i7 < 0) {
                u0.M();
                throw null;
            }
            String str3 = (String) obj;
            if ((i7 != 0 && i7 != s3) || !g.h0(str3)) {
                int length2 = str3.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!com.bumptech.glide.c.J(str3.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && n.X(str3, i11, "|", false)) {
                    str2 = str3.substring("|".length() + i11);
                    kotlin.jvm.internal.l.d(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i7 = i10;
        }
        StringBuilder sb2 = new StringBuilder(length);
        Eb.o.c0(arrayList, sb2);
        return sb2.toString();
    }
}
