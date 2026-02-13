package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import u.T;

/* loaded from: classes.dex */
public final class zzcp {
    private static volatile zzdh zza;

    private zzcp() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:6|(5:8|(1:10)|11|12|13)|14|(5:16|(1:18)|11|12|13)|19|(1:23)|24|25|26|27|28|29|30|(1:32)(1:82)|33|(9:35|36|37|38|39|(2:40|(3:42|(3:57|58|59)(7:44|45|(2:47|(1:50))|51|(1:53)|54|55)|56)(1:60))|61|62|63)(1:81)|64|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x006f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0070, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r3);
        r3 = com.google.android.gms.internal.auth.zzdh.zzc();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzdh zza(Context context) {
        zzdh zzdhVar;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        zzdh zzc;
        synchronized (zzcp.class) {
            try {
                zzdhVar = zza;
                if (zzdhVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        zzc = zzdh.zzc();
                        zzdhVar = zzc;
                        zza = zzdhVar;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        zzc = zzdh.zzc();
                        zzdhVar = zzc;
                        zza = zzdhVar;
                    }
                    if (zzcc.zzb() && !context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                    zzdh zzc2 = file.exists() ? zzdh.zzd(file) : zzdh.zzc();
                    if (zzc2.zzb()) {
                        Object zza2 = zzc2.zza();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) zza2)));
                            try {
                                T t5 = new T(0);
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                                    } else {
                                        String str3 = new String(split[0]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        if (!t5.containsKey(str3)) {
                                            t5.put(str3, new T(0));
                                        }
                                        ((T) t5.get(str3)).put(decode, str4);
                                    }
                                }
                                Log.w("HermeticFileOverrides", "Parsed " + zza2.toString() + " for Android package " + context.getPackageName());
                                zzci zzciVar = new zzci(t5);
                                bufferedReader.close();
                                zzc = zzdh.zzd(zzciVar);
                            } finally {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        zzc = zzdh.zzc();
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    zzdhVar = zzc;
                    zza = zzdhVar;
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th2;
            } finally {
            }
        }
        return zzdhVar;
    }
}
