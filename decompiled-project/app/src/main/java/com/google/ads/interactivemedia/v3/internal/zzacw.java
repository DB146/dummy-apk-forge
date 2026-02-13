package com.google.ads.interactivemedia.v3.internal;

import P1.g;
import X.c;

/* loaded from: classes.dex */
public final class zzacw {
    public static /* synthetic */ String zza(int i7) {
        switch (i7) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case g.BYTES_FIELD_NUMBER /* 8 */:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static /* synthetic */ String zzb(zzacv zzacvVar, String str) {
        return c.i(str, zza(zzacvVar.zzt()), zzacvVar.zzg());
    }
}
