package com.google.android.gms.internal.pal;

import X.c;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzir {
    public static String zza(String str) {
        return zzio.zza(str);
    }

    public static String zzb(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder n6 = c.n("<", str2, " threw ");
                    n6.append(e2.getClass().getName());
                    n6.append(">");
                    sb2 = n6.toString();
                }
            }
            objArr[i10] = sb2;
            i10++;
        }
        StringBuilder sb3 = new StringBuilder((length * 16) + str.length());
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i7 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i11, indexOf);
            sb3.append(objArr[i7]);
            i11 = indexOf + 2;
            i7++;
        }
        sb3.append((CharSequence) str, i11, str.length());
        if (i7 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i7]);
            for (int i12 = i7 + 1; i12 < objArr.length; i12++) {
                sb3.append(", ");
                sb3.append(objArr[i12]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
