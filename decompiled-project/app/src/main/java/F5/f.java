package F5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.internal.T;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4099a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f4100b;

    /* JADX WARN: Type inference failed for: r0v2, types: [F5.f, java.lang.Object] */
    static {
        int i7 = h.f4105e;
        f4099a = 12451000;
        f4100b = new Object();
    }

    public static int a(Context context) {
        int i7 = h.f4105e;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(int i7, Context context, String str) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return null;
            }
            int i10 = T.f15053a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && M5.c.h(context)) {
            int i11 = T.f15053a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f4099a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(O5.c.a(context).h(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb3 = sb2.toString();
        int i12 = T.f15053a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb3)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public int c(Context context) {
        return d(context, f4099a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|4|(4:8|2c|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:49)(1:47)|48)|50|(11:52|(1:54)(1:106)|55|(2:102|103)(1:57)|58|59|60|(1:62)(2:(2:72|(1:74))|(4:80|(1:82)(1:99)|(1:84)|(1:86)(4:87|(2:93|94)|89|(1:91)(1:92)))(1:79))|63|(1:(1:66)(1:67))|(1:69)(1:70)))|107|(0)(0)|55|(0)(0)|58|59|60|(0)(0)|63|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a7, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int d(Context context, int i7) {
        boolean z8;
        int i10;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        int i11 = h.f4105e;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !h.f4104d.get()) {
            synchronized (G.f15023a) {
                try {
                    if (!G.f15024b) {
                        G.f15024b = true;
                        try {
                            bundle = O5.c.a(context).g(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e2);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            G.f15025c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i12 = G.f15025c;
            if (i12 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i12 != 12451000) {
                throw new IllegalStateException(A3.c.e(f4099a, i12, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
            }
        }
        if (!M5.c.h(context)) {
            if (M5.c.f6785e == null) {
                M5.c.f6785e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!M5.c.f6785e.booleanValue()) {
                z8 = true;
                G.b(i7 < 0);
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                i10 = 9;
                if (z8) {
                    packageInfo = null;
                } else {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                }
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                i.b(context);
                if (i.e(packageInfo2, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                } else {
                    if (z8) {
                        G.g(packageInfo);
                        if (!i.e(packageInfo, true)) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                        }
                    }
                    if (!z8 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        int i13 = packageInfo2.versionCode;
                        if ((i13 == -1 ? -1 : i13 / 1000) < (i7 != -1 ? i7 / 1000 : -1)) {
                            Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i7 + " but found " + i13);
                            i10 = 2;
                        } else {
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e10) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                                    i10 = 1;
                                    if (i10 != 18 ? i10 == 1 ? h.b(context) : false : true) {
                                    }
                                }
                            }
                            i10 = !applicationInfo.enabled ? 3 : 0;
                        }
                    } else {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                }
                if (i10 != 18 ? i10 == 1 ? h.b(context) : false : true) {
                    return 18;
                }
                return i10;
            }
        }
        z8 = false;
        G.b(i7 < 0);
        String packageName2 = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        i10 = 9;
        if (z8) {
        }
        packageInfo2 = packageManager2.getPackageInfo("com.google.android.gms", 64);
        i.b(context);
        if (i.e(packageInfo2, true)) {
        }
        if (i10 != 18 ? i10 == 1 ? h.b(context) : false : true) {
        }
    }
}
