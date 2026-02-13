package v7;

import A0.B;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final B7.a f25112d = new B7.a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final B f25113e = new B(24);

    /* renamed from: a, reason: collision with root package name */
    public final B7.d f25114a;

    /* renamed from: b, reason: collision with root package name */
    public String f25115b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f25116c = null;

    public h(B7.d dVar) {
        this.f25114a = dVar;
    }

    public static void a(B7.d dVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            dVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
        }
    }
}
