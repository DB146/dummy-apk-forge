package com.kt.apps.media.xemtv;

import Db.o;
import Eb.B;
import Eb.l;
import La.g;
import N6.r;
import N6.y0;
import Y1.a;
import a.AbstractC0672a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.google.shortcuts.ShortcutInfoChangeListenerImpl;
import androidx.core.graphics.drawable.IconCompat;
import c2.i;
import cb.b;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.media.xemtv.ui.main.MainActivity;
import db.InterfaceC1070c;
import g7.InterfaceC1200a;
import h3.InterfaceC1239a;
import h7.C1259e;
import i1.C1290a;
import i3.p;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l7.C1511c;
import m1.AbstractC1545c;
import m1.C1543a;
import m1.C1544b;
import m4.C1593w;
import oa.InterfaceC1826a;
import oa.j;
import org.json.JSONException;
import org.json.JSONObject;
import q7.EnumC1905i;
import r7.C1947c;
import r7.C1948d;
import ra.C1953a;
import u2.AbstractC2097a;
import u8.c;
import v8.C2150d;
import v8.C2151e;
import wa.f;

/* loaded from: classes2.dex */
public final class App extends Application implements b, Application.ActivityLifecycleCallbacks, InterfaceC1239a {

    /* renamed from: x, reason: collision with root package name */
    public static int f16182x;

    /* renamed from: y, reason: collision with root package name */
    public static App f16183y;

    /* renamed from: z, reason: collision with root package name */
    public static App f16184z;

    /* renamed from: a, reason: collision with root package name */
    public a f16185a;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16189e;

    /* renamed from: u, reason: collision with root package name */
    public O9.a f16191u;

    /* renamed from: v, reason: collision with root package name */
    public p f16192v;

    /* renamed from: w, reason: collision with root package name */
    public g f16193w;

    /* renamed from: b, reason: collision with root package name */
    public final o f16186b = android.support.v4.media.session.b.z(new f(21));

    /* renamed from: c, reason: collision with root package name */
    public boolean f16187c = false;

    /* renamed from: d, reason: collision with root package name */
    public final ab.f f16188d = new ab.f(new C1290a(this, 14));

    /* renamed from: f, reason: collision with root package name */
    public final long f16190f = System.currentTimeMillis();

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, m1.b] */
    /* JADX WARN: Type inference failed for: r1v3, types: [m1.a, java.lang.Object] */
    public final void a() {
        boolean isRateLimitingActive;
        List dynamicShortcuts;
        IconCompat iconCompat;
        int i7;
        InputStream f4;
        Bitmap decodeStream;
        IconCompat iconCompat2;
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setPackage("com.kt.apps.media.xemtv");
        intent.setAction("android.intent.action.VIEW");
        ?? obj = new Object();
        obj.f19770a = this;
        obj.f19772c = getString(R.string.shortcut_short_label1);
        obj.f19773d = getString(R.string.shortcut_long_label1);
        HashSet hashSet = new HashSet();
        hashSet.add("actions.intent.OPEN_APP_FEATURE");
        obj.f19771b = new Intent[]{intent};
        if (TextUtils.isEmpty(obj.f19772c)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = obj.f19771b;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        if (obj.f19775f == null) {
            obj.f19775f = new HashSet();
        }
        obj.f19775f.addAll(hashSet);
        int i10 = Build.VERSION.SDK_INT;
        int maxShortcutCountPerActivity = i10 >= 25 ? A1.a.f(getSystemService(A1.a.g())).getMaxShortcutCountPerActivity() : 5;
        if (maxShortcutCountPerActivity == 0) {
            return;
        }
        if (i10 <= 29 && (iconCompat = obj.f19774e) != null && (((i7 = iconCompat.f13275a) == 6 || i7 == 4) && (f4 = iconCompat.f(this)) != null && (decodeStream = BitmapFactory.decodeStream(f4)) != null)) {
            if (i7 == 6) {
                iconCompat2 = new IconCompat(5);
                iconCompat2.f13276b = decodeStream;
            } else {
                iconCompat2 = new IconCompat(1);
                iconCompat2.f13276b = decodeStream;
            }
            obj.f19774e = iconCompat2;
        }
        if (i10 >= 30) {
            A1.a.f(getSystemService(A1.a.g())).pushDynamicShortcut(obj.a());
        } else if (i10 >= 25) {
            ShortcutManager f10 = A1.a.f(getSystemService(A1.a.g()));
            isRateLimitingActive = f10.isRateLimitingActive();
            if (isRateLimitingActive) {
                return;
            }
            dynamicShortcuts = f10.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                f10.removeDynamicShortcuts(Arrays.asList(AbstractC1545c.a(dynamicShortcuts)));
            }
            f10.addDynamicShortcuts(Arrays.asList(obj.a()));
        }
        String str = null;
        if (i.f14158a == null) {
            try {
                i.f14158a = (C1544b) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, i.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, this);
            } catch (Exception unused) {
            }
            if (i.f14158a == null) {
                i.f14158a = new Object();
            }
        }
        try {
            i.f14158a.getClass();
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() >= maxShortcutCountPerActivity) {
                Iterator it = arrayList.iterator();
                char c10 = 65535;
                while (it.hasNext()) {
                    ((C1543a) it.next()).getClass();
                    if (c10 < 0) {
                        str = "com.kt.apps.media.xemtv.2";
                        c10 = 0;
                    }
                }
                Arrays.asList(str);
            }
            Arrays.asList(obj);
            Iterator it2 = ((ArrayList) i.s(this)).iterator();
            while (it2.hasNext()) {
                ((ShortcutInfoChangeListenerImpl) it2.next()).a(Collections.singletonList(obj));
            }
        } catch (Exception unused2) {
            Iterator it3 = ((ArrayList) i.s(this)).iterator();
            while (it3.hasNext()) {
                ((ShortcutInfoChangeListenerImpl) it3.next()).a(Collections.singletonList(obj));
            }
        } catch (Throwable th) {
            Iterator it4 = ((ArrayList) i.s(this)).iterator();
            while (it4.hasNext()) {
                ((ShortcutInfoChangeListenerImpl) it4.next()).a(Collections.singletonList(obj));
            }
            i.x(this);
            throw th;
        }
        i.x(this);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        HashSet hashSet = AbstractC2097a.f24828a;
        Log.i("MultiDex", "Installing application");
        try {
            if (AbstractC2097a.f24829b) {
                Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
                return;
            }
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException e2) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e2);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                AbstractC2097a.b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e10) {
            Log.e("MultiDex", "MultiDex installation failure", e10);
            throw new RuntimeException("MultiDex installation failed (" + e10.getMessage() + ").");
        }
    }

    public final void b(int i7) {
        if (i7 == 0) {
            return;
        }
        AbstractC0672a.i().b().addOnSuccessListener(new C1947c(new Ba.o(this, 27), 22)).addOnFailureListener(new C1593w(this, i7, 1));
    }

    public final l c() {
        return (l) this.f16186b.getValue();
    }

    public final void d() {
        if (!this.f16187c) {
            this.f16187c = true;
            j jVar = (j) ((InterfaceC1826a) this.f16188d.e());
            InterfaceC1070c interfaceC1070c = jVar.f22180o;
            InterfaceC1070c interfaceC1070c2 = jVar.f22181p;
            InterfaceC1070c interfaceC1070c3 = jVar.f22182q;
            InterfaceC1070c interfaceC1070c4 = jVar.f22183r;
            InterfaceC1070c interfaceC1070c5 = jVar.f22158A;
            r.d("com.kt.apps.core.workers.AutoRefreshExtensionsChannelWorker", interfaceC1070c);
            r.d("com.kt.apps.autoupdate.usecase.DownloadFileWorker", interfaceC1070c2);
            r.d("com.kt.apps.core.workers.PreloadDataWorker", interfaceC1070c3);
            r.d("com.kt.apps.core.workers.TVEpgWorkers", interfaceC1070c4);
            r.d("com.kt.apps.media.xemtv.workers.TVRecommendationWorkers", interfaceC1070c5);
            this.f16185a = new a(y0.c(5, new Object[]{"com.kt.apps.core.workers.AutoRefreshExtensionsChannelWorker", interfaceC1070c, "com.kt.apps.autoupdate.usecase.DownloadFileWorker", interfaceC1070c2, "com.kt.apps.core.workers.PreloadDataWorker", interfaceC1070c3, "com.kt.apps.core.workers.TVEpgWorkers", interfaceC1070c4, "com.kt.apps.media.xemtv.workers.TVRecommendationWorkers", interfaceC1070c5}, null));
            this.f16191u = jVar.b();
            this.f16192v = jVar.d();
            this.f16193w = (g) jVar.f22161D.get();
        }
        f();
    }

    @Override // cb.b
    public final Object e() {
        return this.f16188d.e();
    }

    public final void f() {
        FirebaseMessaging firebaseMessaging;
        int i7 = 9;
        super.onCreate();
        f16183y = this;
        Y6.i.i(this);
        C1259e c1259e = (C1259e) Y6.i.e().c(C1259e.class);
        kotlin.jvm.internal.l.d(c1259e, "getInstance()");
        boolean k = c1259e.f17836a.k();
        c1259e.f17844l = (InterfaceC1200a) c1259e.f17836a.c(C1511c.class);
        c1259e.f17841f.f17866f = k;
        c i10 = AbstractC0672a.i();
        Map H10 = B.H(new Db.j("use_online_data", Boolean.TRUE), new Db.j("version_need_refresh", 1L));
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : H10.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put((String) entry.getKey(), value.toString());
            }
        }
        try {
            C2150d c10 = C2151e.c();
            c10.f25203a = new JSONObject(hashMap);
            i10.f24886e.d(c10.a()).onSuccessTask(EnumC1905i.f23535a, new C1948d(8));
        } catch (JSONException e2) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e2);
            Tasks.forResult(null);
        }
        b(3);
        AbstractC0672a.i().f24887f.a(20L).onSuccessTask(EnumC1905i.f23535a, new C1948d(i7));
        C1290a c1290a = FirebaseMessaging.k;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(Y6.i.e());
        }
        firebaseMessaging.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        firebaseMessaging.f15869f.execute(new p5.j(i7, firebaseMessaging, taskCompletionSource));
        taskCompletionSource.getTask().addOnCompleteListener(new C1947c(this, 21));
        registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.e(activity, "activity");
        String flattenToString = activity.getComponentName().flattenToString();
        kotlin.jvm.internal.l.d(flattenToString, "flattenToString(...)");
        if (c().contains(flattenToString)) {
            synchronized (c()) {
                c().remove(flattenToString);
                c().addLast(flattenToString);
            }
        } else {
            f16182x++;
            c().addLast(flattenToString);
        }
        String message = "onActivityCreated: " + flattenToString + ", activityCount: " + f16182x;
        kotlin.jvm.internal.l.e(message, "message");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.l.e(activity, "activity");
        kotlin.jvm.internal.l.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.l.e(activity, "activity");
        String flattenToString = activity.getComponentName().flattenToString();
        kotlin.jvm.internal.l.d(flattenToString, "flattenToString(...)");
        if (kotlin.jvm.internal.l.a(c().D(), flattenToString)) {
            int i7 = f16182x;
            if (i7 > 0) {
                f16182x = i7 - 1;
            }
            synchronized (c()) {
                c().remove(flattenToString);
            }
        }
        String message = "onActivityStopped: " + flattenToString + ", activityCount: " + f16182x;
        kotlin.jvm.internal.l.e(message, "message");
    }

    @Override // android.app.Application
    public final void onCreate() {
        d();
        f16184z = this;
        g gVar = this.f16193w;
        if (gVar == null) {
            kotlin.jvm.internal.l.j("voiceSelectorManager");
            throw null;
        }
        Context applicationContext = gVar.f6439c.getApplicationContext();
        kotlin.jvm.internal.l.c(applicationContext, "null cannot be cast to non-null type com.kt.apps.core.base.HiltCoreApp");
        ((App) applicationContext).registerActivityLifecycleCallbacks(new La.f(gVar, 0));
        try {
            a();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        try {
            if (this.f16189e) {
                return;
            }
            O9.a aVar = this.f16191u;
            if (aVar == null) {
                kotlin.jvm.internal.l.j("actionLoggerImpl");
                throw null;
            }
            ((C1953a) aVar).a("LowMemory", com.bumptech.glide.c.f(new Db.j("LiveTimeBeforeLowMemory", String.valueOf(System.currentTimeMillis() - this.f16190f))));
            this.f16189e = true;
        } catch (Exception unused) {
        }
    }
}
