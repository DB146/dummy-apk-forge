package M5;

import F5.h;
import F5.i;
import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.G;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f6781a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f6782b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f6783c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f6784d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f6785e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f6786f;
    public static String g;

    /* renamed from: h, reason: collision with root package name */
    public static int f6787h;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f6788i;

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i7 = 0;
        for (byte b2 : bArr) {
            char[] cArr2 = f6782b;
            cArr[i7] = cArr2[(b2 & 255) >>> 4];
            cArr[i7 + 1] = cArr2[b2 & 15];
            i7 += 2;
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i7 = 0; i7 < length; i7++) {
            char[] cArr = f6781a;
            sb2.append(cArr[(bArr[i7] & 240) >>> 4]);
            sb2.append(cArr[bArr[i7] & 15]);
        }
        return sb2.toString();
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String d() {
        BufferedReader bufferedReader;
        String processName;
        if (g == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                g = processName;
            } else {
                int i7 = f6787h;
                if (i7 == 0) {
                    i7 = Process.myPid();
                    f6787h = i7;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i7 > 0) {
                    try {
                        String str2 = "/proc/" + i7 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                G.g(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                c(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    c(bufferedReader);
                }
                g = str;
            }
        }
        return g;
    }

    public static byte[] e(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo h10 = O5.c.a(context).h(64, str);
        Signature[] signatureArr = h10.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i7 = 0;
            while (true) {
                if (i7 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i7++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(h10.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean g(Context context, int i7) {
        if (j(i7, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                i b2 = i.b(context);
                b2.getClass();
                if (packageInfo == null) {
                    return false;
                }
                if (!i.e(packageInfo, false)) {
                    if (!i.e(packageInfo, true)) {
                        return false;
                    }
                    if (!h.a((Context) b2.f4107a)) {
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        return false;
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean h(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f6783c == null) {
            f6783c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f6783c.booleanValue();
        if (f6784d == null) {
            f6784d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f6784d.booleanValue()) {
            return !f() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static byte[] i(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i7 = 0;
        while (i7 < length) {
            int i10 = i7 + 2;
            bArr[i7 / 2] = (byte) Integer.parseInt(str.substring(i7, i10), 16);
            i7 = i10;
        }
        return bArr;
    }

    public static boolean j(int i7, Context context, String str) {
        E3.e a9 = O5.c.a(context);
        a9.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a9.f3530b.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i7, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static void k(StringBuilder sb2, HashMap hashMap) {
        sb2.append("{");
        boolean z8 = true;
        for (String str : hashMap.keySet()) {
            if (!z8) {
                sb2.append(",");
            }
            String str2 = (String) hashMap.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z8 = false;
        }
        sb2.append("}");
    }
}
