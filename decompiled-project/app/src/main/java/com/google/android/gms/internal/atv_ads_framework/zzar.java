package com.google.android.gms.internal.atv_ads_framework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzar {
    private static final Set zza = zzb("http", "https", "mailto", "ftp");
    private static final Set zzb = zzb("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska");
    private static final Set zzc = Collections.emptySet();

    public static String zza(String str, String str2) {
        char charAt;
        int i7;
        char charAt2;
        char charAt3;
        Set set = zzc;
        String lowerCase = str.toLowerCase();
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            if (lowerCase.startsWith(String.valueOf((String) it.next()).concat(":"))) {
                return str;
            }
        }
        if (!lowerCase.startsWith("data:")) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                if (lowerCase.startsWith(String.valueOf(((zzaq) it2.next()).name().toLowerCase().replace('_', '-')).concat(":"))) {
                    return str;
                }
            }
            for (int i10 = 0; i10 < str.length() && (charAt = str.charAt(i10)) != '#' && charAt != '/'; i10++) {
                if (charAt != ':') {
                    if (charAt == '?') {
                        return str;
                    }
                }
            }
            return str;
        }
        String lowerCase2 = str.toLowerCase();
        if (lowerCase2.startsWith("data:") && lowerCase2.length() > 5) {
            int i11 = 5;
            while (i11 < lowerCase2.length() && (charAt3 = lowerCase2.charAt(i11)) != ';' && charAt3 != ',') {
                i11++;
            }
            if (zzb.contains(lowerCase2.substring(5, i11)) && lowerCase2.startsWith(";base64,", i11) && (i7 = i11 + 8) < lowerCase2.length()) {
                while (i7 < lowerCase2.length() && (charAt2 = lowerCase2.charAt(i7)) != '=') {
                    if ((charAt2 < 'a' || charAt2 > 'z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '/')) {
                        break;
                    }
                    i7++;
                }
                while (i7 < lowerCase2.length()) {
                    if (lowerCase2.charAt(i7) == '=') {
                        i7++;
                    }
                }
                return str;
            }
        }
        return "about:invalid#zTvAdsFrameworkz";
    }

    private static final Set zzb(String... strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
