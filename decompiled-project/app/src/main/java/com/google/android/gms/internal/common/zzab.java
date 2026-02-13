package com.google.android.gms.internal.common;

import X.c;
import h3.o;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzab {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String n6;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                n6 = "null";
            } else {
                try {
                    n6 = obj.toString();
                } catch (Exception e2) {
                    String i11 = c.i(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(i11), (Throwable) e2);
                    n6 = o.n("<", i11, " threw ", e2.getClass().getName(), ">");
                }
            }
            objArr[i10] = n6;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i7 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, indexOf);
            sb2.append(objArr[i7]);
            i12 = indexOf + 2;
            i7++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i7 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i13 = i7 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
