package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Locale;

/* renamed from: com.google.android.gms.common.internal.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1005v {

    /* renamed from: a, reason: collision with root package name */
    public static final u.T f15116a = new u.T(0);

    /* renamed from: b, reason: collision with root package name */
    public static Locale f15117b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = O5.c.a(context).f3530b;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i7) {
        Resources resources = context.getResources();
        String a9 = a(context);
        if (i7 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a9);
        }
        if (i7 == 2) {
            return M5.c.h(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a9);
        }
        if (i7 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a9);
        }
        if (i7 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a9);
        }
        if (i7 == 7) {
            return d(context, "common_google_play_services_network_error_text", a9);
        }
        if (i7 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a9);
        }
        if (i7 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a9);
        }
        switch (i7) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a9);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a9);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a9);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a9);
        }
    }

    public static String c(Context context, int i7) {
        Resources resources = context.getResources();
        switch (i7) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i7);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e2 = e(context, str);
        if (e2 == null) {
            e2 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e2, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        u.T t5 = f15116a;
        synchronized (t5) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(f15117b)) {
                    t5.clear();
                    f15117b = locale;
                }
                String str2 = (String) t5.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i7 = F5.h.f4105e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f15116a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
