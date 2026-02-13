package E8;

import A8.C0037a;
import A8.C0038b;
import android.net.Uri;
import java.net.URL;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final C0038b f3773a;

    /* renamed from: b, reason: collision with root package name */
    public final Hb.i f3774b;

    public g(C0038b appInfo, Hb.i blockingDispatcher) {
        kotlin.jvm.internal.l.e(appInfo, "appInfo");
        kotlin.jvm.internal.l.e(blockingDispatcher, "blockingDispatcher");
        this.f3773a = appInfo;
        this.f3774b = blockingDispatcher;
    }

    public static final URL a(g gVar) {
        gVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C0038b c0038b = gVar.f3773a;
        Uri.Builder appendPath2 = appendPath.appendPath(c0038b.f627a).appendPath("settings");
        C0037a c0037a = c0038b.f630d;
        return new URL(appendPath2.appendQueryParameter("build_version", c0037a.f617c).appendQueryParameter("display_version", c0037a.f616b).build().toString());
    }
}
