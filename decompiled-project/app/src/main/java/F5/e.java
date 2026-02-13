package F5;

import A9.AbstractC0068b1;
import W1.G;
import W1.U;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC0972m;
import com.google.android.gms.common.internal.AbstractC1005v;
import com.google.android.gms.common.internal.DialogInterfaceOnClickListenerC1006w;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4097c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f4098d = new Object();

    public static AlertDialog f(Activity activity, int i7, DialogInterfaceOnClickListenerC1006w dialogInterfaceOnClickListenerC1006w, DialogInterface.OnCancelListener onCancelListener) {
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(AbstractC1005v.b(activity, i7));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i7 != 1 ? i7 != 2 ? i7 != 3 ? resources.getString(R.string.ok) : resources.getString(com.kt.apps.media.xemtv.beta.R.string.common_google_play_services_enable_button) : resources.getString(com.kt.apps.media.xemtv.beta.R.string.common_google_play_services_update_button) : resources.getString(com.kt.apps.media.xemtv.beta.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, dialogInterfaceOnClickListenerC1006w);
        }
        String c10 = AbstractC1005v.c(activity, i7);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        Log.w("GoogleApiAvailability", h3.o.l(i7, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [F5.c, android.app.DialogFragment] */
    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof G) {
                U j = ((G) activity).j();
                j jVar = new j();
                com.google.android.gms.common.internal.G.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.C0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.f4109D0 = onCancelListener;
                }
                jVar.t0(j, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        com.google.android.gms.common.internal.G.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f4091a = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f4092b = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    @Override // F5.f
    public final int c(Context context) {
        return d(context, f.f4099a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i7, GoogleApiActivity googleApiActivity2) {
        AlertDialog f4 = f(googleApiActivity, i7, new DialogInterfaceOnClickListenerC1006w(super.b(i7, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (f4 == null) {
            return;
        }
        g(googleApiActivity, f4, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [k1.o, java.lang.Object, C9.h] */
    public final void h(Context context, int i7, PendingIntent pendingIntent) {
        int i10;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", A3.c.f(i7, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i7 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e2 = i7 == 6 ? AbstractC1005v.e(context, "common_google_play_services_resolution_required_title") : AbstractC1005v.c(context, i7);
        if (e2 == null) {
            e2 = context.getResources().getString(com.kt.apps.media.xemtv.beta.R.string.common_google_play_services_notification_ticker);
        }
        String d10 = (i7 == 6 || i7 == 19) ? AbstractC1005v.d(context, "common_google_play_services_resolution_required_text", AbstractC1005v.a(context)) : AbstractC1005v.b(context, i7);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        com.google.android.gms.common.internal.G.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        k1.q qVar = new k1.q(context, null);
        qVar.f18794m = true;
        qVar.f18800s.flags |= 16;
        qVar.f18789e = k1.q.b(e2);
        ?? obj = new Object();
        obj.f18784b = k1.q.b(d10);
        qVar.d(obj);
        PackageManager packageManager = context.getPackageManager();
        if (M5.c.f6783c == null) {
            M5.c.f6783c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (M5.c.f6783c.booleanValue()) {
            qVar.f18800s.icon = context.getApplicationInfo().icon;
            qVar.j = 2;
            if (M5.c.h(context)) {
                qVar.f18786b.add(new k1.k(resources.getString(com.kt.apps.media.xemtv.beta.R.string.common_open_on_phone), pendingIntent));
            } else {
                qVar.g = pendingIntent;
            }
        } else {
            qVar.f18800s.icon = R.drawable.stat_sys_warning;
            qVar.f18800s.tickerText = k1.q.b(resources.getString(com.kt.apps.media.xemtv.beta.R.string.common_google_play_services_notification_ticker));
            qVar.f18800s.when = System.currentTimeMillis();
            qVar.g = pendingIntent;
            qVar.f18790f = k1.q.b(d10);
        }
        if (M5.c.f()) {
            com.google.android.gms.common.internal.G.j(M5.c.f());
            synchronized (f4097c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.kt.apps.media.xemtv.beta.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(AbstractC0068b1.c(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            qVar.f18798q = "com.google.android.gms.availability";
        }
        Notification a9 = qVar.a();
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            h.f4101a.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, a9);
    }

    public final void i(Activity activity, InterfaceC0972m interfaceC0972m, int i7, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog f4 = f(activity, i7, new DialogInterfaceOnClickListenerC1006w(super.b(i7, activity, "d"), interfaceC0972m, 1), onCancelListener);
        if (f4 == null) {
            return;
        }
        g(activity, f4, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
