package F5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.common.zzc;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;
import t8.C2034c;
import y6.C2399e;

/* loaded from: classes.dex */
public final class i implements W3.h {

    /* renamed from: c, reason: collision with root package name */
    public static i f4106c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4107a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f4108b;

    public i() {
        this.f4107a = new CopyOnWriteArraySet();
    }

    public i(Context context) {
        this.f4107a = context.getApplicationContext();
    }

    public /* synthetic */ i(Object obj) {
        this.f4107a = obj;
    }

    public static i b(Context context) {
        G.g(context);
        synchronized (i.class) {
            if (f4106c == null) {
                m mVar = q.f4123a;
                synchronized (q.class) {
                    if (q.f4127e == null) {
                        q.f4127e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f4106c = new i(context);
            }
        }
        return f4106c;
    }

    public static final n d(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < nVarArr.length; i7++) {
                if (nVarArr[i7].equals(oVar)) {
                    return nVarArr[i7];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean e(PackageInfo packageInfo, boolean z8) {
        PackageInfo packageInfo2;
        if (z8) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z8 ? d(packageInfo2, p.f4122a) : d(packageInfo2, p.f4122a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z8 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if ((!z8 ? d(packageInfo2, p.f4122a) : d(packageInfo2, p.f4122a[0])) == null) {
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [E3.d, java.lang.Object] */
    public E3.a a() {
        if (((E3.a) this.f4108b) == null) {
            synchronized (this) {
                try {
                    if (((E3.a) this.f4108b) == null) {
                        File cacheDir = ((E3.e) ((C2034c) this.f4107a).f24513b).f3530b.getCacheDir();
                        Object obj = null;
                        obj = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            ?? obj2 = new Object();
                            obj2.f3527d = new q3.l(5);
                            obj2.f3526c = file;
                            obj2.f3524a = 262144000L;
                            obj2.f3525b = new q3.s(5);
                            obj = obj2;
                        }
                        this.f4108b = obj;
                    }
                    if (((E3.a) this.f4108b) == null) {
                        this.f4108b = new C2399e(3);
                    }
                } finally {
                }
            }
        }
        return (E3.a) this.f4108b;
    }

    public boolean c(int i7) {
        v vVar;
        int length;
        boolean z8;
        ApplicationInfo applicationInfo;
        v vVar2;
        s sVar;
        String[] packagesForUid = ((Context) this.f4107a).getPackageManager().getPackagesForUid(i7);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            vVar = new v(false, "no pkgs", null);
        } else {
            vVar = null;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    G.g(vVar);
                    break;
                }
                String str = packagesForUid[i10];
                if (str == null) {
                    vVar = new v(false, "null pkg", null);
                } else if (str.equals((String) this.f4108b)) {
                    vVar = v.f4143d;
                } else {
                    m mVar = q.f4123a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            q.b();
                            D d10 = (D) q.f4125c;
                            Parcel zzB = d10.zzB(7, d10.zza());
                            z8 = zzc.zzf(zzB);
                            zzB.recycle();
                        } finally {
                        }
                    } catch (Q5.a | RemoteException e2) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                        z8 = false;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    if (z8) {
                        boolean a9 = h.a((Context) this.f4107a);
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            G.g(q.f4127e);
                            try {
                                q.b();
                                r rVar = new r(str, a9, false, new P5.b(q.f4127e), false, true);
                                try {
                                    D d11 = (D) q.f4125c;
                                    Parcel zza = d11.zza();
                                    zzc.zzc(zza, rVar);
                                    Parcel zzB2 = d11.zzB(6, zza);
                                    sVar = (s) zzc.zza(zzB2, s.CREATOR);
                                    zzB2.recycle();
                                } catch (RemoteException e10) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                                    vVar = new v(false, "module call", e10);
                                }
                            } catch (Q5.a e11) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                                vVar2 = new v(false, "module init: ".concat(String.valueOf(e11.getMessage())), e11);
                            }
                            if (sVar.f4134a) {
                                Tb.a.O(sVar.f4137d);
                                vVar = new v(true, null, null);
                            } else {
                                String str2 = sVar.f4135b;
                                PackageManager.NameNotFoundException nameNotFoundException = Y6.b.z(sVar.f4136c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                if (str2 == null) {
                                    str2 = "error checking package certificate";
                                }
                                Tb.a.O(sVar.f4137d);
                                Y6.b.z(sVar.f4136c);
                                vVar2 = new v(false, str2, nameNotFoundException);
                                vVar = vVar2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = ((Context) this.f4107a).getPackageManager().getPackageInfo(str, 64);
                            boolean a10 = h.a((Context) this.f4107a);
                            if (packageInfo == null) {
                                vVar = new v(false, "null pkg", null);
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    vVar = new v(false, "single cert required", null);
                                } else {
                                    o oVar = new o(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        v a11 = q.a(str3, oVar, a10, false);
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        if (a11.f4144a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                            try {
                                                v a12 = q.a(str3, oVar, false, true);
                                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                                if (a12.f4144a) {
                                                    vVar = new v(false, "debuggable release cert app rejected", null);
                                                }
                                            } finally {
                                            }
                                        }
                                        vVar = a11;
                                    } finally {
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e12) {
                            vVar = new v(false, "no pkg ".concat(str), e12);
                        }
                    }
                    if (vVar.f4144a) {
                        this.f4108b = str;
                    }
                }
                if (vVar.f4144a) {
                    break;
                }
                i10++;
            }
        }
        if (!vVar.f4144a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Exception exc = vVar.f4146c;
            if (exc != null) {
                Log.d("GoogleCertificatesRslt", vVar.a(), exc);
            } else {
                Log.d("GoogleCertificatesRslt", vVar.a());
            }
        }
        return vVar.f4144a;
    }

    @Override // W3.h
    public Object get() {
        if (this.f4108b == null) {
            synchronized (this) {
                try {
                    if (this.f4108b == null) {
                        Object obj = ((W3.h) this.f4107a).get();
                        W3.g.c(obj, "Argument must not be null");
                        this.f4108b = obj;
                    }
                } finally {
                }
            }
        }
        return this.f4108b;
    }
}
