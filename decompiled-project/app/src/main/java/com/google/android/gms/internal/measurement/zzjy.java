package com.google.android.gms.internal.measurement;

import M6.a;
import M6.k;
import M6.o;
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
public final class zzjy {
    private static volatile k zza;

    private zzjy() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:92)(1:24)|25|26|27|28|29|30|31|(1:33)(1:84)|34|(10:36|37|38|39|40|(2:41|(3:43|(3:59|60|61)(7:45|46|(2:48|(1:51))|52|(1:54)(1:58)|55|56)|57)(1:62))|63|64|65|66)(1:83)|67|14) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0075, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0076, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
        r5 = M6.a.f6794a;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k zza(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads;
        char c10;
        k kVar = zza;
        if (kVar == null) {
            synchronized (zzjy.class) {
                try {
                    kVar = zza;
                    if (kVar == null) {
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        int i7 = zzka.zza;
                        if (!str.equals("eng")) {
                            if (str.equals("userdebug")) {
                            }
                            kVar = a.f6794a;
                            zza = kVar;
                        }
                        if (!str2.contains("dev-keys")) {
                            if (str2.contains("test-keys")) {
                            }
                            kVar = a.f6794a;
                            zza = kVar;
                        }
                        Context createDeviceProtectedStorageContext = (!zzjm.zza() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        StrictMode.allowThreadDiskWrites();
                        char c11 = 0;
                        File file = new File(createDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                        k kVar2 = file.exists() ? new o(file) : a.f6794a;
                        if (kVar2.b()) {
                            File file2 = (File) kVar2.a();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
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
                                            StringBuilder sb2 = new StringBuilder(readLine.length() + 9);
                                            sb2.append("Invalid: ");
                                            sb2.append(readLine);
                                            Log.e("HermeticFileOverrides", sb2.toString());
                                        } else {
                                            String str3 = new String(split[c11]);
                                            String decode = Uri.decode(new String(split[1]));
                                            String str4 = (String) hashMap.get(split[2]);
                                            if (str4 == null) {
                                                String str5 = new String(split[2]);
                                                str4 = Uri.decode(str5);
                                                if (str4.length() < 1024 || str4 == str5) {
                                                    hashMap.put(str5, str4);
                                                }
                                            }
                                            T t10 = (T) t5.get(str3);
                                            if (t10 == null) {
                                                c10 = 0;
                                                t10 = new T(0);
                                                t5.put(str3, t10);
                                            } else {
                                                c10 = 0;
                                            }
                                            t10.put(decode, str4);
                                            c11 = c10;
                                        }
                                    }
                                    String obj = file2.toString();
                                    String packageName = createDeviceProtectedStorageContext.getPackageName();
                                    StringBuilder sb3 = new StringBuilder(obj.length() + 28 + String.valueOf(packageName).length());
                                    sb3.append("Parsed ");
                                    sb3.append(obj);
                                    sb3.append(" for Android package ");
                                    sb3.append(packageName);
                                    Log.w("HermeticFileOverrides", sb3.toString());
                                    zzjs zzjsVar = new zzjs(t5);
                                    bufferedReader.close();
                                    kVar = new o(zzjsVar);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } else {
                            kVar = a.f6794a;
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        zza = kVar;
                    }
                } catch (Throwable th3) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th3;
                } finally {
                }
            }
        }
        return kVar;
    }
}
