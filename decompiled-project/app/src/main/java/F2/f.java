package F2;

import U9.i;
import a1.n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final n f4055a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4056b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static i f4057c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? d.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static i b() {
        i iVar = new i(5);
        f4057c = iVar;
        f4055a.t(iVar);
        return f4057c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(8:45|(1:49)|(1:68)(1:56)|57|(2:64|65)|61|62|63)|(1:72)(1:(1:74))|(1:49)|(1:51)|68|57|(1:59)|64|65|61|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z8) {
        boolean z10;
        e a9;
        e eVar;
        int i7;
        if (z8 || f4057c == null) {
            synchronized (f4056b) {
                if (!z8) {
                    if (f4057c != null) {
                        return;
                    }
                }
                int i10 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z10 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z10 = false;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && i11 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z11 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z12 = file2.exists() && length2 > 0;
                    try {
                        long a10 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a9 = e.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            a9 = null;
                        }
                        if (a9 != null && a9.f4053c == a10 && (i7 = a9.f4052b) != 2) {
                            i10 = i7;
                            if (z8 && z12 && i10 != 1) {
                                i10 = 2;
                            }
                            eVar = new e(1, (a9 == null && a9.f4052b == 2 && i10 == 1 && length < a9.f4054d) ? 3 : i10, a10, length2);
                            if (a9 != null || !a9.equals(eVar)) {
                                eVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z11) {
                            i10 = 1;
                        } else if (z12) {
                            i10 = 2;
                        }
                        if (z8) {
                            i10 = 2;
                        }
                        eVar = new e(1, (a9 == null && a9.f4052b == 2 && i10 == 1 && length < a9.f4054d) ? 3 : i10, a10, length2);
                        if (a9 != null) {
                        }
                        eVar.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
