package e7;

import Y6.i;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.l;

/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1097a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile FirebaseAnalytics f16806a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f16807b = new Object();

    public static final FirebaseAnalytics a() {
        if (f16806a == null) {
            synchronized (f16807b) {
                if (f16806a == null) {
                    i e2 = i.e();
                    e2.b();
                    f16806a = FirebaseAnalytics.getInstance(e2.f12041a);
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f16806a;
        l.b(firebaseAnalytics);
        return firebaseAnalytics;
    }
}
