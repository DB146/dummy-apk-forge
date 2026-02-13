package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzig {
    public static boolean zza(CharSequence charSequence, CharSequence charSequence2) {
        int zzb;
        int length = charSequence.length();
        if (charSequence == "00000000-0000-0000-0000-000000000000") {
            return true;
        }
        if (length != 36) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = charSequence.charAt(i7);
            char charAt2 = "00000000-0000-0000-0000-000000000000".charAt(i7);
            if (charAt != charAt2 && ((zzb = zzb(charAt)) >= 26 || zzb != zzb(charAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int zzb(char c10) {
        return (char) ((c10 | ' ') - 97);
    }
}
