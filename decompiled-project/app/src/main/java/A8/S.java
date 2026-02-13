package A8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public static final S f580a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final R7.a f581b;

    /* JADX WARN: Type inference failed for: r0v0, types: [A8.S, java.lang.Object] */
    static {
        c8.d dVar = new c8.d();
        dVar.a(Q.class, C0043g.f661a);
        dVar.a(a0.class, C0044h.f665a);
        dVar.a(C0047k.class, C0041e.f647a);
        dVar.a(C0038b.class, C0040d.f641a);
        dVar.a(C0037a.class, C0039c.f633a);
        dVar.a(D.class, C0042f.f654a);
        dVar.f14449d = true;
        f581b = new R7.a(dVar, 20);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        r3 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0038b a(Y6.i iVar) {
        String valueOf;
        Object obj;
        D d10;
        String d11;
        long longVersionCode;
        iVar.b();
        Context context = iVar.f12041a;
        kotlin.jvm.internal.l.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        iVar.b();
        String str2 = iVar.f12043c.f12055b;
        kotlin.jvm.internal.l.d(str2, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.l.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.l.d(RELEASE, "RELEASE");
        kotlin.jvm.internal.l.d(packageName, "packageName");
        String str3 = packageInfo.versionName;
        String str4 = str3 == null ? str : str3;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.l.d(MANUFACTURER, "MANUFACTURER");
        iVar.b();
        int myPid = Process.myPid();
        Iterator it = AbstractC0055t.a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((D) obj).f540b == myPid) {
                break;
            }
        }
        D d12 = (D) obj;
        if (d12 == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 > 33) {
                d11 = Process.myProcessName();
                kotlin.jvm.internal.l.d(d11, "myProcessName()");
            } else if ((i7 < 28 || d11 == null) && (d11 = M5.c.d()) == null) {
                d11 = "";
            }
            d10 = new D(myPid, 0, d11, false);
        } else {
            d10 = d12;
        }
        iVar.b();
        return new C0038b(str2, MODEL, RELEASE, new C0037a(packageName, str4, str, MANUFACTURER, d10, AbstractC0055t.a(context)));
    }
}
