package androidx.profileinstaller;

import E2.d;
import F2.b;
import F2.c;
import F2.f;
import X4.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import t8.C2034c;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX WARN: Can't wrap try/catch for region: R(17:16|(2:18|(1:20))(3:226|227|(1:229))|21|(3:22|23|24)|25|26|(3:188|189|(4:191|192|193|194)(2:198|199))|28|(3:36|37|(3:44|45|(4:47|48|49|(1:43))(2:50|51))(3:(1:40)|41|(0)))|68|(2:72|(5:76|77|78|79|(2:81|82)(3:83|84|85))(2:74|75))|100|(3:105|106|(11:110|111|112|113|114|115|116|117|(3:121|122|(11:124|(2:125|(1:127)(1:128))|129|130|131|132|133|134|(1:104)|14|15))|119|120)(2:108|109))|102|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00fb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00fc, code lost:
    
        r3.j(7, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        FileInputStream fileInputStream;
        e[] eVarArr;
        e[] eVarArr2;
        e[] eVarArr3;
        byte[] bArr;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        FileChannel channel;
        FileLock tryLock;
        boolean z8;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        int i7;
        b bVar;
        FileInputStream a9;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (!"androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if (!"WRITE_SKIP_FILE".equals(string)) {
                        if ("DELETE_SKIP_FILE".equals(string)) {
                            new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                            Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                            setResultCode(11);
                            return;
                        }
                        return;
                    }
                    C2034c c2034c = new C2034c(this, 13);
                    try {
                        c.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        c2034c.j(10, null);
                        return;
                    } catch (PackageManager.NameNotFoundException e2) {
                        c2034c.j(7, e2);
                        return;
                    }
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                setResultCode(12);
                return;
            } else {
                if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                    return;
                }
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                C2034c c2034c2 = new C2034c(this, 13);
                if (!"DROP_SHADER_CACHE".equals(string2)) {
                    c2034c2.j(16, null);
                    return;
                }
                if (c.c(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    c2034c2.j(14, null);
                    return;
                } else {
                    c2034c2.j(15, null);
                    return;
                }
            }
        }
        d dVar = new d(0);
        C2034c c2034c3 = new C2034c(this, 13);
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, dVar, c2034c3, name, file);
            byte[] bArr3 = bVar2.f4038b;
            if (bArr3 == null) {
                bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                if (!file.exists()) {
                    try {
                        if (!file.createNewFile()) {
                            bVar2.b(4, null);
                        }
                    } catch (IOException unused) {
                        bVar2.b(4, null);
                    }
                } else if (!file.canWrite()) {
                    bVar2.b(4, null);
                }
                bVar2.f4041e = true;
                byte[] bArr4 = c.f4043a;
                try {
                    try {
                        fileInputStream = bVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e10) {
                        c2034c3.j(6, e10);
                        fileInputStream = null;
                        if (fileInputStream != null) {
                        }
                        eVarArr2 = bVar2.f4042f;
                        if (eVarArr2 != null) {
                        }
                        C2034c c2034c4 = bVar2.f4037a;
                        eVarArr3 = bVar2.f4042f;
                        if (eVarArr3 != null) {
                        }
                        bArr = bVar2.g;
                        if (bArr != null) {
                        }
                        z8 = false;
                        if (z8) {
                        }
                        f.c(context, z8);
                    } catch (IOException e11) {
                        c2034c3.j(7, e11);
                        fileInputStream = null;
                        if (fileInputStream != null) {
                        }
                        eVarArr2 = bVar2.f4042f;
                        if (eVarArr2 != null) {
                        }
                        C2034c c2034c42 = bVar2.f4037a;
                        eVarArr3 = bVar2.f4042f;
                        if (eVarArr3 != null) {
                        }
                        bArr = bVar2.g;
                        if (bArr != null) {
                        }
                        z8 = false;
                        if (z8) {
                        }
                        f.c(context, z8);
                    }
                    if (fileInputStream != null) {
                        try {
                            try {
                            } catch (IOException e12) {
                                c2034c3.j(7, e12);
                                fileInputStream.close();
                                eVarArr = null;
                                bVar2.f4042f = eVarArr;
                                eVarArr2 = bVar2.f4042f;
                                if (eVarArr2 != null) {
                                    try {
                                        a9 = bVar2.a(assets, "dexopt/baseline.profm");
                                        if (a9 == null) {
                                        }
                                    } catch (FileNotFoundException e13) {
                                        c2034c3.j(9, e13);
                                    } catch (IOException e14) {
                                        c2034c3.j(7, e14);
                                    } catch (IllegalStateException e15) {
                                        bVar2.f4042f = null;
                                        c2034c3.j(8, e15);
                                    }
                                }
                                C2034c c2034c422 = bVar2.f4037a;
                                eVarArr3 = bVar2.f4042f;
                                if (eVarArr3 != null) {
                                    if (bVar2.f4041e) {
                                    }
                                }
                                bArr = bVar2.g;
                                if (bArr != null) {
                                }
                                z8 = false;
                                if (z8) {
                                }
                                f.c(context, z8);
                            }
                        } catch (IllegalStateException e16) {
                            c2034c3.j(8, e16);
                            fileInputStream.close();
                            eVarArr = null;
                            bVar2.f4042f = eVarArr;
                            eVarArr2 = bVar2.f4042f;
                            if (eVarArr2 != null) {
                            }
                            C2034c c2034c4222 = bVar2.f4037a;
                            eVarArr3 = bVar2.f4042f;
                            if (eVarArr3 != null) {
                            }
                            bArr = bVar2.g;
                            if (bArr != null) {
                            }
                            z8 = false;
                            if (z8) {
                            }
                            f.c(context, z8);
                        }
                        if (!Arrays.equals(bArr4, c.f(fileInputStream, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        eVarArr = c.l(fileInputStream, c.f(fileInputStream, 4), bVar2.f4040d);
                        try {
                            fileInputStream.close();
                        } catch (IOException e17) {
                            c2034c3.j(7, e17);
                        }
                        bVar2.f4042f = eVarArr;
                    }
                    eVarArr2 = bVar2.f4042f;
                    if (eVarArr2 != null && ((i7 = Build.VERSION.SDK_INT) >= 31 || i7 == 24 || i7 == 25)) {
                        a9 = bVar2.a(assets, "dexopt/baseline.profm");
                        if (a9 == null) {
                            try {
                                if (!Arrays.equals(c.f4044b, c.f(a9, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                bVar2.f4042f = c.i(a9, c.f(a9, 4), bArr3, eVarArr2);
                                a9.close();
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar2 = bVar;
                                }
                            } finally {
                            }
                        } else {
                            if (a9 != null) {
                                a9.close();
                            }
                            bVar = null;
                            if (bVar != null) {
                            }
                        }
                    }
                    C2034c c2034c42222 = bVar2.f4037a;
                    eVarArr3 = bVar2.f4042f;
                    if (eVarArr3 != null && (bArr2 = bVar2.f4038b) != null) {
                        if (bVar2.f4041e) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr2);
                            } finally {
                            }
                        } catch (IOException e18) {
                            c2034c42222.j(7, e18);
                        } catch (IllegalStateException e19) {
                            c2034c42222.j(8, e19);
                        }
                        if (c.o(byteArrayOutputStream, bArr2, eVarArr3)) {
                            bVar2.g = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bVar2.f4042f = null;
                        } else {
                            c2034c42222.j(5, null);
                            bVar2.f4042f = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr = bVar2.g;
                    if (bArr != null) {
                        try {
                            if (!bVar2.f4041e) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                                    try {
                                        fileOutputStream = new FileOutputStream(bVar2.f4039c);
                                        try {
                                            channel = fileOutputStream.getChannel();
                                            try {
                                                tryLock = channel.tryLock();
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } catch (IOException e20) {
                                    bVar2.b(7, e20);
                                    z8 = false;
                                    if (z8) {
                                    }
                                    f.c(context, z8);
                                }
                            } catch (FileNotFoundException e21) {
                                bVar2.b(6, e21);
                                z8 = false;
                                if (z8) {
                                }
                                f.c(context, z8);
                            }
                            if (tryLock != null) {
                                try {
                                    if (tryLock.isValid()) {
                                        byte[] bArr5 = new byte[512];
                                        while (true) {
                                            int read = byteArrayInputStream.read(bArr5);
                                            if (read <= 0) {
                                                break;
                                            } else {
                                                fileOutputStream.write(bArr5, 0, read);
                                            }
                                        }
                                        bVar2.b(1, null);
                                        tryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        bVar2.g = null;
                                        bVar2.f4042f = null;
                                        z8 = true;
                                        if (z8) {
                                            c.e(packageInfo, filesDir);
                                        }
                                        f.c(context, z8);
                                    }
                                } finally {
                                }
                            }
                            throw new IOException("Unable to acquire a lock on the underlying file channel.");
                        } finally {
                            bVar2.g = null;
                            bVar2.f4042f = null;
                        }
                    }
                    z8 = false;
                    if (z8) {
                    }
                    f.c(context, z8);
                } finally {
                }
            }
            z8 = false;
            f.c(context, z8);
        } catch (PackageManager.NameNotFoundException e22) {
            c2034c3.j(7, e22);
            f.c(context, false);
        }
    }
}
