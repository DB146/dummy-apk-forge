package E8;

import Db.q;
import android.content.Context;
import android.os.Bundle;
import bc.C0849a;
import bc.EnumC0851c;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f3751a;

    public a(Context appContext) {
        kotlin.jvm.internal.l.e(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f3751a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // E8.o
    public final Boolean a() {
        Bundle bundle = this.f3751a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // E8.o
    public final Double b() {
        Bundle bundle = this.f3751a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // E8.o
    public final C0849a c() {
        Bundle bundle = this.f3751a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new C0849a(Tb.a.M(bundle.getInt("firebase_sessions_sessions_restart_timeout"), EnumC0851c.f13999d));
        }
        return null;
    }

    @Override // E8.o
    public final Object d(Hb.d dVar) {
        return q.f3365a;
    }
}
