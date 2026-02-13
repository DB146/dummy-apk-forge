package s7;

import Eb.o;
import Eb.p;
import Eb.v;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import y7.C2416a0;
import y7.D0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f24187a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final c f24188b = new Object();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, y7.Z] */
    public static C2416a0 a(c cVar, String processName, int i7, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        cVar.getClass();
        l.e(processName, "processName");
        ?? obj = new Object();
        obj.f27216a = processName;
        obj.f27217b = i7;
        byte b2 = (byte) (obj.f27220e | 1);
        obj.f27218c = i10;
        obj.f27219d = false;
        obj.f27220e = (byte) (((byte) (b2 | 2)) | 4);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, y7.Z] */
    public static ArrayList d(Context context) {
        l.e(context, "context");
        int i7 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = v.f3891a;
        }
        ArrayList X10 = o.X(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        Iterator it = X10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i7) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.S(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            ?? obj = new Object();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            obj.f27216a = str2;
            obj.f27217b = runningAppProcessInfo.pid;
            byte b2 = (byte) (obj.f27220e | 1);
            obj.f27218c = runningAppProcessInfo.importance;
            obj.f27220e = (byte) (b2 | 2);
            obj.f27219d = l.a(str2, str);
            obj.f27220e = (byte) (obj.f27220e | 4);
            arrayList2.add(obj.a());
        }
        return arrayList2;
    }

    public boolean b(int i7) {
        return 4 <= i7 || Log.isLoggable("FirebaseCrashlytics", i7);
    }

    public void c(String str) {
        if (b(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r4 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D0 e(Context context) {
        Object obj;
        String str;
        l.e(context, "context");
        int myPid = Process.myPid();
        Iterator it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C2416a0) ((D0) obj)).f27226b == myPid) {
                break;
            }
        }
        D0 d02 = (D0) obj;
        if (d02 != null) {
            return d02;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 > 33) {
            str = Process.myProcessName();
            l.d(str, "{\n      Process.myProcessName()\n    }");
        } else if (i7 < 28 || str == null) {
            str = "";
        }
        return a(this, str, myPid, 0, 12);
    }

    public void f(String str) {
        if (b(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void g(String str, Exception exc) {
        if (b(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
