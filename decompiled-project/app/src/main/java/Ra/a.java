package Ra;

import Eb.o;
import Eb.p;
import Y6.i;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.kt.apps.core.utils.UtilsKt;
import gb.h;
import h7.C1259e;
import h8.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements h, p7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8944c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8945d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f8942a = obj;
        this.f8943b = obj2;
        this.f8944c = obj3;
        this.f8945d = obj4;
    }

    @Override // gb.h
    public void f(qb.c cVar) {
        List<ResolveInfo> queryIntentActivities;
        List<ResolveInfo> queryIntentActivities2;
        PackageManager.ResolveInfoFlags of;
        PackageManager.ResolveInfoFlags of2;
        b bVar = (b) this.f8942a;
        Context context = (Context) bVar.f8947c;
        l.e(context, "<this>");
        String str = (String) this.f8943b;
        String str2 = (String) this.f8944c;
        Log.d(UtilsKt.getTAG(context), "getAllApps: action " + str + " category " + str2);
        Intent intent = new Intent(str);
        intent.addCategory(str2);
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            of2 = PackageManager.ResolveInfoFlags.of(128L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of2);
        } else {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        }
        l.b(queryIntentActivities);
        ArrayList arrayList = new ArrayList(p.S(queryIntentActivities, 10));
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String packageName = resolveInfo.activityInfo.packageName;
            l.d(packageName, "packageName");
            String obj = resolveInfo.loadLabel(context.getPackageManager()).toString();
            Drawable loadIcon = resolveInfo.loadIcon(context.getPackageManager());
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
            Intent intent2 = new Intent(str);
            intent2.addCategory(str2);
            intent2.setComponent(componentName);
            intent2.addFlags(270532608);
            arrayList.add(new Pa.a(packageName, obj, loadIcon, intent2));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((Pa.a) next).f8259a)) {
                arrayList2.add(next);
            }
        }
        Context context2 = (Context) bVar.f8947c;
        l.e(context2, "<this>");
        String str3 = (String) this.f8945d;
        Intent intent3 = new Intent(str);
        intent3.setData(Uri.parse(str3));
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager2 = context2.getPackageManager();
            of = PackageManager.ResolveInfoFlags.of(128L);
            queryIntentActivities2 = packageManager2.queryIntentActivities(intent3, of);
        } else {
            queryIntentActivities2 = context2.getPackageManager().queryIntentActivities(intent3, 128);
        }
        l.b(queryIntentActivities2);
        ArrayList arrayList3 = new ArrayList(p.S(queryIntentActivities2, 10));
        for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
            String packageName2 = resolveInfo2.activityInfo.packageName;
            l.d(packageName2, "packageName");
            String obj2 = resolveInfo2.loadLabel(context2.getPackageManager()).toString();
            Drawable loadIcon2 = resolveInfo2.loadIcon(context2.getPackageManager());
            Intent intent4 = new Intent(str);
            intent4.setData(Uri.parse(str3));
            intent4.setFlags(268435456);
            arrayList3.add(new Pa.a(packageName2, obj2, loadIcon2, intent4));
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (hashSet2.add(((Pa.a) next2).f8259a)) {
                arrayList4.add(next2);
            }
        }
        LinkedHashSet<Pa.a> linkedHashSet = new LinkedHashSet(arrayList2);
        o.U(linkedHashSet, arrayList4);
        for (Pa.a aVar : linkedHashSet) {
            Log.d(UtilsKt.getTAG(bVar), "query app : " + aVar.f8259a + " ");
        }
        cVar.d(o.s0(linkedHashSet));
    }

    @Override // p7.c
    public Object g(T6.a aVar) {
        return new C1259e((i) aVar.a(i.class), aVar.d(f.class), (Executor) aVar.g((p7.p) this.f8942a), (Executor) aVar.g((p7.p) this.f8943b), (Executor) aVar.g((p7.p) this.f8944c), (ScheduledExecutorService) aVar.g((p7.p) this.f8945d));
    }
}
