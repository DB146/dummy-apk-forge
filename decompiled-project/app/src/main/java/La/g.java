package La;

import A4.p;
import Db.j;
import Db.o;
import Eb.B;
import W1.G;
import Y5.A;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import c2.i;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.voiceselector.ui.VoiceSearchActivity;
import g3.C1191j;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.l;
import qb.n;
import qb.r;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final d f6437a;

    /* renamed from: b, reason: collision with root package name */
    public final Pa.d f6438b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6439c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f6440d;

    /* renamed from: e, reason: collision with root package name */
    public final O9.a f6441e;

    /* renamed from: f, reason: collision with root package name */
    public final o f6442f;
    public final Bb.b g;

    public g(d dVar, Pa.d dVar2, Context app, SharedPreferences sharedPreferences, O9.a aVar) {
        l.e(app, "app");
        l.e(sharedPreferences, "sharedPreferences");
        this.f6437a = dVar;
        this.f6438b = dVar2;
        this.f6439c = app;
        this.f6440d = sharedPreferences;
        this.f6441e = aVar;
        this.f6442f = android.support.v4.media.session.b.z(new I9.a(10));
        this.g = new Bb.b();
    }

    public final AtomicReference a() {
        return (AtomicReference) this.f6442f.getValue();
    }

    public final void b(Intent intent) {
        l.e(intent, "intent");
        Context context = this.f6439c;
        Context applicationContext = context.getApplicationContext();
        intent.setData(Uri.parse(""));
        intent.putExtra("calling_package_name", context.getPackageName());
        applicationContext.startActivity(intent);
        i.v(this.f6441e, Oa.f.f7537c);
        SharedPreferences.Editor edit = this.f6440d.edit();
        edit.putBoolean("key:ACTIVE_VOICE", true);
        edit.commit();
    }

    public final void c() {
        Context context = this.f6439c;
        Pa.d dVar = this.f6438b;
        try {
            Context applicationContext = context.getApplicationContext();
            dVar.getClass();
            dVar.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id="));
            intent.setFlags(268435456);
            applicationContext.startActivity(intent);
        } catch (Throwable th) {
            Log.d(UtilsKt.getTAG(this), "launchVoicePackageStore: " + th);
            Context applicationContext2 = context.getApplicationContext();
            dVar.getClass();
            dVar.getClass();
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id="));
            intent2.setFlags(268435456);
            applicationContext2.startActivity(intent2);
        }
    }

    public final r d(Bundle extraData) {
        l.e(extraData, "extraData");
        if (extraData.getBoolean("extra:reset_setting", false)) {
            SharedPreferences.Editor edit = this.f6440d.edit();
            edit.putBoolean("key:GG_ALWAYS", false);
            edit.putBoolean("key:GG_LAST_TIME", false);
            edit.remove("key:ACTIVE_VOICE");
            edit.apply();
        }
        Log.d(UtilsKt.getTAG(this), "openVoiceAssistant: ");
        Bundle bundle = Oa.g.f7538a;
        Oa.g.f7538a = com.bumptech.glide.c.e();
        r h10 = this.f6437a.f6433a.h(B.G(new j("bundle", extraData)));
        C1191j c1191j = new C1191j(this, 24);
        Y5.B b2 = lb.b.f19615d;
        A a9 = lb.b.f19614c;
        return new r(new n(new r(h10, c1191j, b2, a9, a9), e.f6434a, 1), b2, b2, a9, new p(28));
    }

    public final void e(Ra.d dVar) {
        Pa.a aVar;
        Pa.a aVar2;
        Pa.a aVar3;
        Pa.a aVar4;
        Pa.a aVar5;
        Log.d(UtilsKt.getTAG(this), "presentSelector: " + a().get());
        if (a().get() == null || !(a().get() instanceof G)) {
            throw new Throwable("Can't attach activity");
        }
        Object obj = a().get();
        l.c(obj, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        G g = (G) obj;
        SharedPreferences sharedPreferences = this.f6440d;
        boolean z8 = sharedPreferences.getBoolean("key:GG_ALWAYS", false);
        O9.a aVar6 = this.f6441e;
        Intent intent = null;
        if (z8) {
            String t5 = UtilsKt.getTAG(this);
            if (dVar != null && (aVar5 = dVar.f8951a) != null) {
                intent = aVar5.f8262d;
            }
            String message = "presentSelector GG_ALWAYS: show dialog " + intent;
            l.e(t5, "t");
            l.e(message, "message");
            i.v(aVar6, Oa.e.f7536c);
            f();
            return;
        }
        if (sharedPreferences.getBoolean("key:GG_LAST_TIME", false)) {
            Intent intent2 = (dVar == null || (aVar4 = dVar.f8951a) == null) ? null : aVar4.f8262d;
            Qa.b bVar = new Qa.b();
            bVar.l0(com.bumptech.glide.c.f(new j("extra:voice_intent", intent2)));
            i.v(aVar6, Oa.d.f7535c);
            String t10 = UtilsKt.getTAG(this);
            if (dVar != null && (aVar3 = dVar.f8951a) != null) {
                intent = aVar3.f8262d;
            }
            String message2 = "presentSelector GG_LAST_TIME: show dialog " + intent;
            l.e(t10, "t");
            l.e(message2, "message");
            bVar.t0(g.j(), UtilsKt.getTAG(Qa.b.f8710P0));
            return;
        }
        String t11 = UtilsKt.getTAG(this);
        String message3 = "presentSelector: show dialogL " + ((dVar == null || (aVar2 = dVar.f8951a) == null) ? null : aVar2.f8262d);
        l.e(t11, "t");
        l.e(message3, "message");
        if (dVar != null && (aVar = dVar.f8951a) != null) {
            intent = aVar.f8262d;
        }
        Qa.g gVar = new Qa.g();
        gVar.l0(com.bumptech.glide.c.f(new j("extra:voice_intent", intent)));
        i.v(aVar6, Oa.d.f7535c);
        gVar.t0(g.j(), UtilsKt.getTAG(Qa.g.f8728P0));
    }

    public final void f() {
        ComponentName componentName;
        Context context = this.f6439c;
        Context applicationContext = context.getApplicationContext();
        int i7 = VoiceSearchActivity.f16250d0;
        Activity activity = (Activity) a().get();
        Intent intent = new Intent(context, (Class<?>) VoiceSearchActivity.class);
        intent.setFlags(268435456);
        if (activity != null && (componentName = activity.getComponentName()) != null) {
            intent.putExtra("extra:calling_package_name", componentName.getPackageName());
            intent.putExtra("extra:calling_class_name", componentName.getClassName());
        }
        applicationContext.startActivity(intent);
        SharedPreferences.Editor edit = this.f6440d.edit();
        edit.putBoolean("key:GG_LAST_TIME", true);
        edit.commit();
    }
}
