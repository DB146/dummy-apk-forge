package com.google.android.gms.internal.atv_ads_framework;

import C1.i;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class zzd {
    public static final zza zza(Context context) {
        return context.getPackageManager().hasSystemFeature("com.google.android.tv.custom_launcher") ? zza.CUSTOM : context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE") ? zza.LAUNCHER_X : !context.getPackageManager().hasSystemFeature("android.software.leanback") ? zza.UNKNOWN : zza.TV_LAUNCHER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r3 != 2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0058 A[EDGE_INSN: B:69:0x0058->B:22:0x0058 BREAK  A[LOOP:0: B:7:0x0030->B:10:0x0056], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzae zzb(Context context) {
        String str;
        int length;
        int i7;
        int ordinal;
        int ordinal2;
        PackageManager packageManager;
        String authority;
        zzae zzc;
        zzad zzadVar = new zzad();
        String str2 = Build.FINGERPRINT;
        if (!TextUtils.isEmpty(str2)) {
            List zzc2 = zzr.zzb(':').zzc(str2);
            if (zzc2.size() == 3) {
                str = (String) zzc2.get(0);
                length = str.length();
                i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    if (zzf.zza(str.charAt(i7))) {
                        char[] charArray = str.toCharArray();
                        while (i7 < length) {
                            char c10 = charArray[i7];
                            if (zzf.zza(c10)) {
                                charArray[i7] = (char) (c10 ^ ' ');
                            }
                            i7++;
                        }
                        str = String.valueOf(charArray);
                    } else {
                        i7++;
                    }
                }
                if (!str.isEmpty()) {
                    zzadVar.zza(zzb.BUILD_FINGERPRINT_PREFIX.zza(), str);
                }
                zza zza = zza(context);
                zzadVar.zza(zzb.LAUNCHER_TYPE.zza(), zza.zza());
                if (context.getPackageManager().hasSystemFeature("com.google.android.tv.operator_tier")) {
                    zzadVar.zza(zzb.OPERATOR_TIER.zza(), "1");
                }
                zzadVar.zza(zzb.SDK_VERSION.zza(), "1.0.0-alpha02");
                ordinal = zza.ordinal();
                if (ordinal == 0) {
                    if (ordinal == 1) {
                        zzc(zzadVar, context, "com.google.android.apps.tv.launcherx", zzb.LAUNCHERX_VERSION_CODE.zza());
                    }
                    zzad zzadVar2 = new zzad();
                    Uri uri = Uri.EMPTY;
                    ordinal2 = zza(context).ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            uri = zzc.zza;
                        } else if (ordinal2 != 2) {
                            if (ordinal2 == 3) {
                                throw new IllegalStateException("Android TV ads library should be called from an Android TV app");
                            }
                        }
                        Uri uri2 = uri;
                        packageManager = context.getPackageManager();
                        authority = uri2.getAuthority();
                        zzt.zza(authority);
                        if (packageManager.resolveContentProvider(authority, 0) != null) {
                            zzc = zzadVar2.zzc();
                        } else {
                            Cursor query = context.getContentResolver().query(uri2, null, null, null, null);
                            zzt.zza(query);
                            while (query.moveToNext()) {
                                try {
                                    String string = query.getString(0);
                                    zzt.zza(string);
                                    String string2 = query.getString(1);
                                    zzt.zza(string2);
                                    zzadVar2.zza(string, string2);
                                } catch (Throwable th) {
                                    try {
                                        query.close();
                                    } catch (Throwable th2) {
                                        try {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        } catch (Exception unused) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                            query.close();
                            zzc = zzadVar2.zzc();
                        }
                        zzadVar.zzb(zzc.entrySet());
                        return zzadVar.zzc();
                    }
                    uri = zzc.zzb;
                    Uri uri22 = uri;
                    packageManager = context.getPackageManager();
                    authority = uri22.getAuthority();
                    zzt.zza(authority);
                    if (packageManager.resolveContentProvider(authority, 0) != null) {
                    }
                    zzadVar.zzb(zzc.entrySet());
                    return zzadVar.zzc();
                }
                zzc(zzadVar, context, "com.google.android.tvlauncher", zzb.TVLAUNCHER_VERSION_CODE.zza());
                zzc(zzadVar, context, "com.google.android.tvrecommendations", zzb.TVRECOMMENDATIONS_VERSION_CODE.zza());
                zzad zzadVar22 = new zzad();
                Uri uri3 = Uri.EMPTY;
                ordinal2 = zza(context).ordinal();
                if (ordinal2 != 0) {
                }
                uri3 = zzc.zzb;
                Uri uri222 = uri3;
                packageManager = context.getPackageManager();
                authority = uri222.getAuthority();
                zzt.zza(authority);
                if (packageManager.resolveContentProvider(authority, 0) != null) {
                }
                zzadVar.zzb(zzc.entrySet());
                return zzadVar.zzc();
            }
        }
        str = "";
        length = str.length();
        i7 = 0;
        while (true) {
            if (i7 >= length) {
            }
            i7++;
        }
        if (!str.isEmpty()) {
        }
        zza zza2 = zza(context);
        zzadVar.zza(zzb.LAUNCHER_TYPE.zza(), zza2.zza());
        if (context.getPackageManager().hasSystemFeature("com.google.android.tv.operator_tier")) {
        }
        zzadVar.zza(zzb.SDK_VERSION.zza(), "1.0.0-alpha02");
        ordinal = zza2.ordinal();
        if (ordinal == 0) {
        }
        zzc(zzadVar, context, "com.google.android.tvrecommendations", zzb.TVRECOMMENDATIONS_VERSION_CODE.zza());
        zzad zzadVar222 = new zzad();
        Uri uri32 = Uri.EMPTY;
        ordinal2 = zza(context).ordinal();
        if (ordinal2 != 0) {
        }
        uri32 = zzc.zzb;
        Uri uri2222 = uri32;
        packageManager = context.getPackageManager();
        authority = uri2222.getAuthority();
        zzt.zza(authority);
        if (packageManager.resolveContentProvider(authority, 0) != null) {
        }
        zzadVar.zzb(zzc.entrySet());
        return zzadVar.zzc();
    }

    private static void zzc(zzad zzadVar, Context context, String str, String str2) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                zzadVar.zza(str2, Long.toString(Build.VERSION.SDK_INT >= 28 ? i.d(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
