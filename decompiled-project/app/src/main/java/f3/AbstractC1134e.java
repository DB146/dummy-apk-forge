package f3;

import android.content.pm.PackageInfo;
import android.net.Uri;

/* renamed from: f3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1134e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16939a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
