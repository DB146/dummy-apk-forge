package com.bumptech.glide;

import C3.x;
import I2.C0330t;
import W1.C;
import W1.G;
import Y5.C0656w;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import h3.o;
import i2.C1332t;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t8.C2034c;
import u.C2052e;

/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: v, reason: collision with root package name */
    public static volatile b f14597v;

    /* renamed from: w, reason: collision with root package name */
    public static volatile boolean f14598w;

    /* renamed from: a, reason: collision with root package name */
    public final D3.a f14599a;

    /* renamed from: b, reason: collision with root package name */
    public final E3.f f14600b;

    /* renamed from: c, reason: collision with root package name */
    public final f f14601c;

    /* renamed from: d, reason: collision with root package name */
    public final D3.f f14602d;

    /* renamed from: e, reason: collision with root package name */
    public final P3.l f14603e;

    /* renamed from: f, reason: collision with root package name */
    public final C1332t f14604f;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f14605u = new ArrayList();

    public b(Context context, C3.n nVar, E3.f fVar, D3.a aVar, D3.f fVar2, P3.l lVar, C1332t c1332t, int i7, C0656w c0656w, C2052e c2052e, List list, List list2, c cVar, R7.a aVar2) {
        this.f14599a = aVar;
        this.f14602d = fVar2;
        this.f14600b = fVar;
        this.f14603e = lVar;
        this.f14604f = c1332t;
        this.f14601c = new f(context, fVar2, new C0330t(this, list2, cVar), new U9.j(15), c0656w, c2052e, list, nVar, aVar2, i7);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f14597v == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (InstantiationException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            }
            synchronized (b.class) {
                if (f14597v == null) {
                    if (f14598w) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f14598w = true;
                    try {
                        c(context, generatedAppGlideModule);
                        f14598w = false;
                    } catch (Throwable th) {
                        f14598w = false;
                        throw th;
                    }
                }
            }
        }
        return f14597v;
    }

    public static P3.l b(Context context) {
        W3.g.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f14603e;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [W3.k, E3.f] */
    /* JADX WARN: Type inference failed for: r0v46, types: [F3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [F3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [F3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [F3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [E3.h, java.lang.Object] */
    public static void c(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        List list;
        ApplicationInfo applicationInfo;
        int i7 = 3;
        e eVar = new e();
        Context applicationContext = context.getApplicationContext();
        List emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || !(generatedAppGlideModule instanceof GeneratedAppGlideModuleImpl)) {
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            } catch (PackageManager.NameNotFoundException e2) {
                if (Log.isLoggable("ManifestParser", 6)) {
                    Log.e("ManifestParser", "Failed to parse glide modules", e2);
                }
            }
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        d.u(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
                list = arrayList;
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            list = arrayList;
        } else {
            list = emptyList;
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw o.j(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw o.j(it2);
            }
        }
        Iterator it3 = list.iterator();
        if (it3.hasNext()) {
            throw o.j(it3);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.d(applicationContext, eVar);
        }
        if (eVar.g == null) {
            ?? obj = new Object();
            if (F3.e.f4069c == 0) {
                F3.e.f4069c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i10 = F3.e.f4069c;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            eVar.g = new F3.e(new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new F3.c(obj, "source", false)));
        }
        if (eVar.f14619h == null) {
            int i11 = F3.e.f4069c;
            ?? obj2 = new Object();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            eVar.f14619h = new F3.e(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new F3.c(obj2, "disk-cache", true)));
        }
        if (eVar.f14623n == null) {
            if (F3.e.f4069c == 0) {
                F3.e.f4069c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i12 = F3.e.f4069c >= 4 ? 2 : 1;
            ?? obj3 = new Object();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            eVar.f14623n = new F3.e(new ThreadPoolExecutor(i12, i12, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new F3.c(obj3, "animation", true)));
        }
        if (eVar.j == null) {
            E3.g gVar = new E3.g(applicationContext);
            ?? obj4 = new Object();
            Context context2 = gVar.f3533a;
            ActivityManager activityManager = gVar.f3534b;
            int i13 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
            obj4.f3539c = i13;
            int round = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
            DisplayMetrics displayMetrics = (DisplayMetrics) gVar.f3535c.f3256b;
            float f4 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
            float f10 = gVar.f3536d;
            int round2 = Math.round(f4 * f10);
            int round3 = Math.round(f4 * 2.0f);
            int i14 = round - i13;
            int i15 = round3 + round2;
            if (i15 <= i14) {
                obj4.f3538b = round3;
                obj4.f3537a = round2;
            } else {
                float f11 = i14 / (f10 + 2.0f);
                obj4.f3538b = Math.round(2.0f * f11);
                obj4.f3537a = Math.round(f11 * f10);
            }
            if (Log.isLoggable("MemorySizeCalculator", 3)) {
                StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
                sb2.append(Formatter.formatFileSize(context2, obj4.f3538b));
                sb2.append(", pool size: ");
                sb2.append(Formatter.formatFileSize(context2, obj4.f3537a));
                sb2.append(", byte array size: ");
                sb2.append(Formatter.formatFileSize(context2, i13));
                sb2.append(", memory class limited? ");
                sb2.append(i15 > round);
                sb2.append(", max size: ");
                sb2.append(Formatter.formatFileSize(context2, round));
                sb2.append(", memoryClass: ");
                sb2.append(activityManager.getMemoryClass());
                sb2.append(", isLowMemoryDevice: ");
                sb2.append(activityManager.isLowRamDevice());
                Log.d("MemorySizeCalculator", sb2.toString());
            }
            eVar.j = obj4;
        }
        if (eVar.k == null) {
            eVar.k = new C1332t(11);
        }
        if (eVar.f14616d == null) {
            int i16 = eVar.j.f3537a;
            if (i16 > 0) {
                eVar.f14616d = new D3.g(i16);
            } else {
                eVar.f14616d = new Hc.e(i7);
            }
        }
        if (eVar.f14617e == null) {
            eVar.f14617e = new D3.f(eVar.j.f3539c);
        }
        if (eVar.f14618f == null) {
            eVar.f14618f = new W3.k(eVar.j.f3538b);
        }
        if (eVar.f14620i == null) {
            eVar.f14620i = new C2034c(applicationContext);
        }
        if (eVar.f14615c == null) {
            eVar.f14615c = new C3.n(eVar.f14618f, eVar.f14620i, eVar.f14619h, eVar.g, new F3.e(new ThreadPoolExecutor(0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, F3.e.f4068b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new F3.c(new Object(), "source-unlimited", false))), eVar.f14623n);
        }
        List list2 = eVar.f14624o;
        if (list2 == null) {
            eVar.f14624o = Collections.emptyList();
        } else {
            eVar.f14624o = Collections.unmodifiableList(list2);
        }
        x xVar = eVar.f14614b;
        xVar.getClass();
        b bVar = new b(applicationContext, eVar.f14615c, eVar.f14618f, eVar.f14616d, eVar.f14617e, new P3.l(), eVar.k, eVar.f14621l, eVar.f14622m, eVar.f14613a, eVar.f14624o, list, generatedAppGlideModule, new R7.a(xVar));
        applicationContext.registerComponentCallbacks(bVar);
        f14597v = bVar;
    }

    public static n d(Context context) {
        return b(context).e(context);
    }

    public static n e(View view) {
        P3.l b2 = b(view.getContext());
        b2.getClass();
        char[] cArr = W3.o.f10619a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return b2.e(view.getContext().getApplicationContext());
        }
        W3.g.c(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity a9 = P3.l.a(view.getContext());
        if (a9 != null && (a9 instanceof G)) {
            G g = (G) a9;
            C2052e c2052e = b2.f7832b;
            c2052e.clear();
            P3.l.b(g.j().f10357c.h(), c2052e);
            View findViewById = g.findViewById(R.id.content);
            C c10 = null;
            while (!view.equals(findViewById) && (c10 = (C) c2052e.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            c2052e.clear();
            return c10 != null ? b2.c(c10) : b2.d(g);
        }
        return b2.e(view.getContext().getApplicationContext());
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        W3.o.a();
        this.f14600b.e(0L);
        this.f14599a.o();
        D3.f fVar = this.f14602d;
        synchronized (fVar) {
            fVar.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        long j;
        W3.o.a();
        synchronized (this.f14605u) {
            try {
                Iterator it = this.f14605u.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        E3.f fVar = this.f14600b;
        fVar.getClass();
        if (i7 >= 40) {
            fVar.e(0L);
        } else if (i7 >= 20 || i7 == 15) {
            synchronized (fVar) {
                j = fVar.f10612b;
            }
            fVar.e(j / 2);
        }
        this.f14599a.k(i7);
        D3.f fVar2 = this.f14602d;
        synchronized (fVar2) {
            if (i7 >= 40) {
                synchronized (fVar2) {
                    fVar2.b(0);
                }
            } else if (i7 >= 20 || i7 == 15) {
                fVar2.b(fVar2.f3177e / 2);
            }
        }
    }
}
