package La;

import Y5.C0605c1;
import Y5.C0640o0;
import Y5.C0646q0;
import Y5.C0654v;
import Y5.L0;
import Y5.RunnableC0597a;
import Y5.RunnableC0602b1;
import Y5.RunnableC0652u;
import Y5.S0;
import Y5.W;
import Y5.Z0;
import Y5.q1;
import Y5.t1;
import Y6.i;
import Z9.x;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import c7.C0914c;
import c7.InterfaceC0913b;
import com.google.android.gms.internal.measurement.zzdf;
import com.kt.apps.voiceselector.ui.VoiceSearchActivity;
import d7.AbstractC1054a;
import java.util.ArrayDeque;
import java.util.Objects;
import kotlin.jvm.internal.l;
import p5.j;

/* loaded from: classes2.dex */
public final class f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6435a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6436b;

    public f() {
        this.f6435a = 2;
        this.f6436b = new ArrayDeque(10);
    }

    public /* synthetic */ f(Object obj, int i7) {
        this.f6435a = i7;
        this.f6436b = obj;
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    public void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f6436b;
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e2) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e2);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    InterfaceC0913b interfaceC0913b = (InterfaceC0913b) i.e().c(InterfaceC0913b.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (interfaceC0913b != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        C0914c c0914c = (C0914c) interfaceC0913b;
                        if (AbstractC1054a.a("fcm") && AbstractC1054a.c("fcm", "_ln")) {
                            c0914c.f14438a.f10991a.zzk("fcm", "_ln", string2, true);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        c0914c.a("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            x.G("_no", bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[Catch: all -> 0x0027, RuntimeException -> 0x002a, TryCatch #1 {RuntimeException -> 0x002a, blocks: (B:3:0x0004, B:5:0x0018, B:7:0x001e, B:12:0x0048, B:15:0x004f, B:17:0x0062, B:19:0x006a, B:24:0x007a, B:28:0x0087, B:35:0x002d, B:37:0x0034, B:39:0x0040), top: B:2:0x0004, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(zzdf zzdfVar, Bundle bundle) {
        C0646q0 c0646q0;
        Intent intent;
        Uri uri;
        String stringExtra;
        String str;
        S0 s02 = (S0) this.f6436b;
        try {
            try {
                c0646q0 = (C0646q0) s02.f3094a;
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11573B.a("onActivityCreated");
                intent = zzdfVar.zzc;
            } catch (RuntimeException e2) {
                W w11 = ((C0646q0) s02.f3094a).f11912f;
                C0646q0.l(w11);
                w11.f11577f.b(e2, "Throwable caught in onActivityCreated");
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (!data.isHierarchical()) {
                    }
                    uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        C0646q0.j(c0646q0.f11915w);
                        stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = "auto";
                            String str2 = str;
                            String queryParameter = uri.getQueryParameter("referrer");
                            boolean z8 = bundle != null;
                            C0640o0 c0640o0 = c0646q0.f11913u;
                            C0646q0.l(c0640o0);
                            c0640o0.S(new L0(this, z8, uri, str2, queryParameter));
                            C0605c1 c0605c1 = ((C0646q0) s02.f3094a).f11918z;
                            C0646q0.k(c0605c1);
                            c0605c1.R(zzdfVar, bundle);
                            return;
                        }
                        str = "gs";
                        String str22 = str;
                        String queryParameter2 = uri.getQueryParameter("referrer");
                        boolean z82 = bundle != null;
                        C0640o0 c0640o02 = c0646q0.f11913u;
                        C0646q0.l(c0640o02);
                        c0640o02.S(new L0(this, z82, uri, str22, queryParameter2));
                        C0605c1 c0605c12 = ((C0646q0) s02.f3094a).f11918z;
                        C0646q0.k(c0605c12);
                        c0605c12.R(zzdfVar, bundle);
                        return;
                    }
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                        uri = data;
                        if (uri != null) {
                            C0646q0.j(c0646q0.f11915w);
                            stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                            if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                                str = "auto";
                                String str222 = str;
                                String queryParameter22 = uri.getQueryParameter("referrer");
                                boolean z822 = bundle != null;
                                C0640o0 c0640o022 = c0646q0.f11913u;
                                C0646q0.l(c0640o022);
                                c0640o022.S(new L0(this, z822, uri, str222, queryParameter22));
                                C0605c1 c0605c122 = ((C0646q0) s02.f3094a).f11918z;
                                C0646q0.k(c0605c122);
                                c0605c122.R(zzdfVar, bundle);
                                return;
                            }
                            str = "gs";
                            String str2222 = str;
                            String queryParameter222 = uri.getQueryParameter("referrer");
                            boolean z8222 = bundle != null;
                            C0640o0 c0640o0222 = c0646q0.f11913u;
                            C0646q0.l(c0640o0222);
                            c0640o0222.S(new L0(this, z8222, uri, str2222, queryParameter222));
                            C0605c1 c0605c1222 = ((C0646q0) s02.f3094a).f11918z;
                            C0646q0.k(c0605c1222);
                            c0605c1222.R(zzdfVar, bundle);
                            return;
                        }
                    }
                }
                uri = null;
                if (uri != null) {
                }
            }
        } finally {
            C0605c1 c0605c13 = ((C0646q0) s02.f3094a).f11918z;
            C0646q0.k(c0605c13);
            c0605c13.R(zzdfVar, bundle);
        }
    }

    public void k(zzdf zzdfVar) {
        C0605c1 c0605c1 = ((C0646q0) ((S0) this.f6436b).f3094a).f11918z;
        C0646q0.k(c0605c1);
        synchronized (c0605c1.f11695z) {
            try {
                if (Objects.equals(c0605c1.f11690u, zzdfVar)) {
                    c0605c1.f11690u = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C0646q0) c0605c1.f3094a).f11910d.X()) {
            c0605c1.f11689f.remove(Integer.valueOf(zzdfVar.zza));
        }
    }

    public void l(zzdf zzdfVar) {
        C0646q0 c0646q0 = (C0646q0) ((S0) this.f6436b).f3094a;
        C0605c1 c0605c1 = c0646q0.f11918z;
        C0646q0.k(c0605c1);
        synchronized (c0605c1.f11695z) {
            c0605c1.f11694y = false;
            c0605c1.f11691v = true;
        }
        C0646q0 c0646q02 = (C0646q0) c0605c1.f3094a;
        c0646q02.f11917y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (c0646q02.f11910d.X()) {
            Z0 O10 = c0605c1.O(zzdfVar);
            c0605c1.f11687d = c0605c1.f11686c;
            c0605c1.f11686c = null;
            C0640o0 c0640o0 = c0646q02.f11913u;
            C0646q0.l(c0640o0);
            c0640o0.S(new RunnableC0597a(c0605c1, O10, elapsedRealtime));
        } else {
            c0605c1.f11686c = null;
            C0640o0 c0640o02 = c0646q02.f11913u;
            C0646q0.l(c0640o02);
            c0640o02.S(new RunnableC0652u(c0605c1, elapsedRealtime));
        }
        t1 t1Var = c0646q0.f11914v;
        C0646q0.k(t1Var);
        C0646q0 c0646q03 = (C0646q0) t1Var.f3094a;
        c0646q03.f11917y.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C0640o0 c0640o03 = c0646q03.f11913u;
        C0646q0.l(c0640o03);
        c0640o03.S(new q1(t1Var, elapsedRealtime2, 1));
    }

    public void m(zzdf zzdfVar) {
        C0646q0 c0646q0 = (C0646q0) ((S0) this.f6436b).f3094a;
        t1 t1Var = c0646q0.f11914v;
        C0646q0.k(t1Var);
        C0646q0 c0646q02 = (C0646q0) t1Var.f3094a;
        c0646q02.f11917y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C0640o0 c0640o0 = c0646q02.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new q1(t1Var, elapsedRealtime, 0));
        C0605c1 c0605c1 = c0646q0.f11918z;
        C0646q0.k(c0605c1);
        Object obj = c0605c1.f11695z;
        synchronized (obj) {
            c0605c1.f11694y = true;
            if (!Objects.equals(zzdfVar, c0605c1.f11690u)) {
                synchronized (obj) {
                    c0605c1.f11690u = zzdfVar;
                    c0605c1.f11691v = false;
                    C0646q0 c0646q03 = (C0646q0) c0605c1.f3094a;
                    if (c0646q03.f11910d.X()) {
                        c0605c1.f11692w = null;
                        C0640o0 c0640o02 = c0646q03.f11913u;
                        C0646q0.l(c0640o02);
                        c0640o02.S(new RunnableC0602b1(c0605c1, 1));
                    }
                }
            }
        }
        C0646q0 c0646q04 = (C0646q0) c0605c1.f3094a;
        if (!c0646q04.f11910d.X()) {
            c0605c1.f11686c = c0605c1.f11692w;
            C0640o0 c0640o03 = c0646q04.f11913u;
            C0646q0.l(c0640o03);
            c0640o03.S(new RunnableC0602b1(c0605c1, 0));
            return;
        }
        c0605c1.S(zzdfVar.zzb, c0605c1.O(zzdfVar), false);
        C0654v c0654v = ((C0646q0) c0605c1.f3094a).f11891B;
        C0646q0.i(c0654v);
        C0646q0 c0646q05 = (C0646q0) c0654v.f3094a;
        c0646q05.f11917y.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C0640o0 c0640o04 = c0646q05.f11913u;
        C0646q0.l(c0640o04);
        c0640o04.S(new RunnableC0652u(c0654v, elapsedRealtime2));
    }

    public void n(zzdf zzdfVar, Bundle bundle) {
        Z0 z02;
        C0605c1 c0605c1 = ((C0646q0) ((S0) this.f6436b).f3094a).f11918z;
        C0646q0.k(c0605c1);
        if (!((C0646q0) c0605c1.f3094a).f11910d.X() || bundle == null || (z02 = (Z0) c0605c1.f11689f.get(Integer.valueOf(zzdfVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", z02.f11613c);
        bundle2.putString("name", z02.f11611a);
        bundle2.putString("referrer_name", z02.f11612b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f6435a) {
            case 0:
                l.e(activity, "activity");
                g gVar = (g) this.f6436b;
                if (gVar.a().get() == null) {
                    gVar.a().set(activity);
                    return;
                }
                return;
            case 1:
                j(zzdf.zza(activity), bundle);
                return;
            default:
                Intent intent = activity.getIntent();
                if (intent == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT <= 25) {
                    new Handler(Looper.getMainLooper()).post(new j(8, this, intent));
                    return;
                } else {
                    a(intent);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f6435a) {
            case 0:
                l.e(activity, "activity");
                g gVar = (g) this.f6436b;
                if (l.a(gVar.a().get(), activity)) {
                    gVar.a().set(null);
                    return;
                }
                return;
            case 1:
                k(zzdf.zza(activity));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f6435a) {
            case 0:
                l.e(activity, "activity");
                return;
            case 1:
                l(zzdf.zza(activity));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f6435a) {
            case 0:
                l.e(activity, "activity");
                g gVar = (g) this.f6436b;
                gVar.getClass();
                Bundle bundle = Oa.g.f7538a;
                Oa.g.f7538a = com.bumptech.glide.c.e();
                if (activity instanceof VoiceSearchActivity) {
                    return;
                }
                gVar.a().set(activity);
                return;
            case 1:
                m(zzdf.zza(activity));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        switch (this.f6435a) {
            case 0:
                l.e(activity, "activity");
                l.e(outState, "outState");
                return;
            case 1:
                n(zzdf.zza(activity), outState);
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f6435a) {
            case 0:
                l.e(activity, "activity");
                g gVar = (g) this.f6436b;
                if (gVar.a().get() == null) {
                    gVar.a().set(activity);
                    return;
                }
                return;
            case 1:
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f6435a) {
            case 0:
                l.e(activity, "activity");
                return;
            case 1:
            default:
                return;
        }
    }
}
