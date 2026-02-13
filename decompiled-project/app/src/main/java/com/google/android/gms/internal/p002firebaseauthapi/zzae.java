package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import h3.o;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzae {
    private static String zza(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String i7 = c.i(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", c.t("Exception during lenientFormat for ", i7), (Throwable) e2);
            return o.n("<", i7, " threw ", e2.getClass().getName(), ">");
        }
    }

    public static String zza(String str) {
        return zzr.zzb(str);
    }

    public static String zza(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i7 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i10 = 0; i10 < objArr.length; i10++) {
                objArr[i10] = zza(objArr[i10]);
            }
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i11 = 0;
        while (i7 < objArr.length && (indexOf = valueOf.indexOf("%s", i11)) != -1) {
            sb2.append((CharSequence) valueOf, i11, indexOf);
            sb2.append(objArr[i7]);
            i11 = indexOf + 2;
            i7++;
        }
        sb2.append((CharSequence) valueOf, i11, valueOf.length());
        if (i7 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i12 = i7 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String zzb(String str) {
        return zzr.zzc(str);
    }

    public static boolean zzc(String str) {
        return zzr.zzd(str);
    }
}
