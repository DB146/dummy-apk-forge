package F;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public int f3936a;

    /* renamed from: b, reason: collision with root package name */
    public int f3937b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3938c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f3939d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3940e;

    public static String c(Y6.i iVar) {
        iVar.b();
        Y6.m mVar = iVar.f12043c;
        String str = mVar.f12058e;
        if (str != null) {
            return str;
        }
        iVar.b();
        String str2 = mVar.f12055b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int a(long j) {
        int i7 = this.f3936a + 1;
        long[] jArr = (long[]) this.f3938c;
        int length = jArr.length;
        if (i7 > length) {
            int i10 = length * 2;
            long[] jArr2 = new long[i10];
            ?? r22 = new int[i10];
            Eb.n.O(jArr, jArr2, 0, 0, jArr.length);
            Eb.n.Q(0, 0, 14, (int[]) this.f3939d, r22);
            this.f3938c = jArr2;
            this.f3939d = r22;
        }
        int i11 = this.f3936a;
        this.f3936a = i11 + 1;
        int length2 = ((int[]) this.f3940e).length;
        if (this.f3937b >= length2) {
            int i12 = length2 * 2;
            int[] iArr = new int[i12];
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i13 + 1;
                iArr[i13] = i14;
                i13 = i14;
            }
            Eb.n.Q(0, 0, 14, (int[]) this.f3940e, iArr);
            this.f3940e = iArr;
        }
        int i15 = this.f3937b;
        int[] iArr2 = (int[]) this.f3940e;
        this.f3937b = iArr2[i15];
        long[] jArr3 = (long[]) this.f3938c;
        jArr3[i11] = j;
        ((int[]) this.f3939d)[i11] = i15;
        iArr2[i15] = i11;
        while (i11 > 0) {
            int i16 = ((i11 + 1) >> 1) - 1;
            if (jArr3[i16] <= j) {
                break;
            }
            h(i16, i11);
            i11 = i16;
        }
        return i15;
    }

    public synchronized String b() {
        try {
            if (((String) this.f3939d) == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f3939d;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.f3938c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Failed to find package " + e2);
            return null;
        }
    }

    public boolean e() {
        int i7;
        synchronized (this) {
            i7 = this.f3937b;
            if (i7 == 0) {
                PackageManager packageManager = ((Context) this.f3938c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i7 = 0;
                } else {
                    if (!M5.c.f()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f3937b = 1;
                            i7 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (M5.c.f()) {
                            this.f3937b = 2;
                        } else {
                            this.f3937b = 1;
                        }
                        i7 = this.f3937b;
                    } else {
                        this.f3937b = 2;
                        i7 = 2;
                    }
                }
            }
        }
        return i7 != 0;
    }

    public synchronized void f() {
        PackageInfo d10 = d(((Context) this.f3938c).getPackageName());
        if (d10 != null) {
            this.f3939d = Integer.toString(d10.versionCode);
            this.f3940e = d10.versionName;
        }
    }

    public void g(int i7) {
        boolean z8 = false;
        int i10 = this.f3937b;
        if (i7 >= 0 && i7 < i10) {
            z8 = true;
        }
        if (z8) {
            return;
        }
        P0.a.a("lineIndex(" + i7 + ") is out of bounds [0, " + i10 + ')');
    }

    public void h(int i7, int i10) {
        long[] jArr = (long[]) this.f3938c;
        int[] iArr = (int[]) this.f3939d;
        int[] iArr2 = (int[]) this.f3940e;
        long j = jArr[i7];
        jArr[i7] = jArr[i10];
        jArr[i10] = j;
        int i11 = iArr[i7];
        int i12 = iArr[i10];
        iArr[i7] = i12;
        iArr[i10] = i11;
        iArr2[i12] = i7;
        iArr2[i11] = i10;
    }
}
