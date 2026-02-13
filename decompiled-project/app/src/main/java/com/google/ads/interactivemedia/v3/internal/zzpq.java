package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzpq {
    public static boolean zza(int i7) {
        int i10 = i7 - 1;
        return i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int zzb(Context context, zzoy zzoyVar) {
        int i7;
        FileInputStream fileInputStream;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] listFiles = file.listFiles(new zzty(Pattern.compile(".*\\.so$", 2)));
            if (listFiles != null && listFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                } catch (IOException e2) {
                    zzd(null, e2.toString(), context, zzoyVar);
                }
                try {
                    byte[] bArr = new byte[20];
                    if (fileInputStream.read(bArr) == 20) {
                        byte[] bArr2 = {0, 0};
                        if (bArr[5] != 2) {
                            bArr2[0] = bArr[19];
                            bArr2[1] = bArr[18];
                            short s3 = ByteBuffer.wrap(bArr2).getShort();
                            if (s3 == 3) {
                                fileInputStream.close();
                                i7 = 5;
                            } else if (s3 == 40) {
                                fileInputStream.close();
                                i7 = 3;
                            } else if (s3 == 62) {
                                fileInputStream.close();
                                i7 = 7;
                            } else if (s3 != 183) {
                                zzd(bArr, null, context, zzoyVar);
                            } else {
                                fileInputStream.close();
                                i7 = 6;
                            }
                            if (i7 == 1000) {
                                String zzc = zzc(context, zzoyVar);
                                if (TextUtils.isEmpty(zzc)) {
                                    zzd(null, "Empty dev arch", context, zzoyVar);
                                } else if (zzc.equalsIgnoreCase("i686") || zzc.equalsIgnoreCase("x86")) {
                                    i7 = 5;
                                } else if (zzc.equalsIgnoreCase("x86_64")) {
                                    i7 = 7;
                                } else if (zzc.equalsIgnoreCase("arm64-v8a")) {
                                    i7 = 6;
                                } else if (zzc.equalsIgnoreCase("armeabi-v7a") || zzc.equalsIgnoreCase("armv71")) {
                                    i7 = 3;
                                } else {
                                    zzd(null, zzc, context, zzoyVar);
                                }
                                i7 = 1;
                            }
                            zzoyVar.zzb(5018, i7 != 1 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? i7 != 7 ? "null" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                            return i7;
                        }
                        zzd(bArr, null, context, zzoyVar);
                    }
                    fileInputStream.close();
                    i7 = 1;
                    if (i7 == 1000) {
                    }
                    zzoyVar.zzb(5018, i7 != 1 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? i7 != 7 ? "null" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                    return i7;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            }
            zzoyVar.zzb(5017, "No .so");
        } else {
            zzoyVar.zzb(5017, "No lib/");
        }
        i7 = 1000;
        if (i7 == 1000) {
        }
        zzoyVar.zzb(5018, i7 != 1 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? i7 != 7 ? "null" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
        return i7;
    }

    private static final String zzc(Context context, zzoy zzoyVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String zza = zzrn.OS_ARCH.zza();
        if (!TextUtils.isEmpty(zza) && hashSet.contains(zza)) {
            return zza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e2) {
            zzoyVar.zzc(2024, 0L, e2);
        } catch (NoSuchFieldException e10) {
            zzoyVar.zzc(2024, 0L, e10);
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzoy zzoyVar) {
        StringBuilder sb2 = new StringBuilder("os.arch:");
        sb2.append(zzrn.OS_ARCH.zza());
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            sb2.append("dbg:");
            sb2.append(str);
            sb2.append(";");
        }
        zzoyVar.zzb(4007, sb2.toString());
    }
}
