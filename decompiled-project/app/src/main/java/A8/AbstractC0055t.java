package A8;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: A8.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0055t {

    /* renamed from: a, reason: collision with root package name */
    public static final C0056u f716a = new C0056u(0);

    /* renamed from: b, reason: collision with root package name */
    public static final C0056u f717b = new C0056u(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Q1.g f718c = new Q1.g("session_id");

    public static ArrayList a(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        int i7 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = Eb.v.f3891a;
        }
        ArrayList X10 = Eb.o.X(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        Iterator it = X10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i7) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(Eb.p.S(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            String str2 = runningAppProcessInfo.processName;
            kotlin.jvm.internal.l.d(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new D(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, kotlin.jvm.internal.l.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }
}
