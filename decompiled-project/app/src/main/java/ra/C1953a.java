package ra;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.l;

/* renamed from: ra.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1953a implements O9.a {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAnalytics f23906a;

    public C1953a(FirebaseAnalytics analytics) {
        l.e(analytics, "analytics");
        this.f23906a = analytics;
    }

    public final void a(String event, Bundle bundle) {
        l.e(event, "event");
        String.valueOf(bundle);
        this.f23906a.a(event.concat("_AndroidTV"), bundle);
    }
}
