package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzyo {
    private static final int zza;

    static {
        int i7;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]");
            i7 = Integer.parseInt(split[0]);
            if (i7 == 1) {
                i7 = split.length > 1 ? Integer.parseInt(split[1]) : 1;
            }
        } catch (NumberFormatException unused) {
            i7 = -1;
        }
        if (i7 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < property.length(); i10++) {
                    char charAt = property.charAt(i10);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb2.append(charAt);
                }
                i7 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i7 = -1;
            }
        }
        if (i7 == -1) {
            i7 = 6;
        }
        zza = i7;
    }

    public static boolean zza() {
        return zza >= 9;
    }
}
