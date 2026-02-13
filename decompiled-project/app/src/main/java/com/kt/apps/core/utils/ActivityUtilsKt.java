package com.kt.apps.core.utils;

import Db.m;
import W1.C;
import W1.G;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import cc.F;
import cn.pedant.SweetAlert.SweetAlertDialog;
import com.kt.apps.core.update.AppUpdateRepository;
import com.kt.apps.media.xemtv.beta.R;
import f.AbstractC1119c;
import java.util.Locale;
import l1.AbstractC1449a;
import l2.InterfaceC1477v;
import l2.InterfaceC1479x;
import l2.Q;
import l2.r;
import y9.AbstractActivityC2461d;

/* loaded from: classes2.dex */
public final class ActivityUtilsKt {
    public static final /* synthetic */ void access$startDownloadUpdate(G g) {
        startDownloadUpdate(g);
    }

    private static final void checkForUpdate(G g) {
        AppUpdateRepository.Companion companion = AppUpdateRepository.Companion;
        Application application = g.getApplication();
        kotlin.jvm.internal.l.d(application, "getApplication(...)");
        F.B(Q.f(g), null, 0, new ActivityUtilsKt$checkForUpdate$1(companion.getInstance(application), g, null), 3);
    }

    public static final String getDefScheme(Context context) {
        kotlin.jvm.internal.l.e(context, "<this>");
        return isRindoTV(context) ? "rindo" : "xemtv";
    }

    public static final void hideKeyboard(C c10) {
        kotlin.jvm.internal.l.e(c10, "<this>");
        hideKeyboard(c10.g0());
    }

    public static final void hideKeyboard(Activity activity) {
        InputMethodManager inputMethodManager;
        kotlin.jvm.internal.l.e(activity, "<this>");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null || (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static final boolean isPermissionGranted(Context context, String permission) {
        kotlin.jvm.internal.l.e(context, "<this>");
        kotlin.jvm.internal.l.e(permission, "permission");
        return AbstractC1449a.checkSelfPermission(context, permission) == 0;
    }

    public static final boolean isPermissionWriteExternalStorageGranted(Context context) {
        kotlin.jvm.internal.l.e(context, "<this>");
        if (Build.VERSION.SDK_INT < 33) {
            return isPermissionGranted(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return true;
    }

    public static final boolean isRindoTV(Context context) {
        kotlin.jvm.internal.l.e(context, "<this>");
        return kotlin.jvm.internal.l.a(context.getPackageName(), "tss.t.rindo");
    }

    public static final boolean isSystemApps(Context context) {
        Object n6;
        kotlin.jvm.internal.l.e(context, "<this>");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            kotlin.jvm.internal.l.d(applicationInfo, "getApplicationInfo(...)");
            n6 = Boolean.valueOf((applicationInfo.flags & 1) != 0);
        } catch (Throwable th) {
            n6 = com.bumptech.glide.c.n(th);
        }
        Throwable a9 = m.a(n6);
        if (a9 != null) {
            a9.printStackTrace();
        }
        Boolean bool = Boolean.FALSE;
        if (n6 instanceof Db.l) {
            n6 = bool;
        }
        return ((Boolean) n6).booleanValue();
    }

    private static final void requestPhotosPermission(AbstractC1119c abstractC1119c) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            abstractC1119c.a(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        } else if (i7 >= 33) {
            abstractC1119c.a(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"});
        } else {
            abstractC1119c.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
        }
    }

    public static final SweetAlertDialog showErrorDialog(final C c10, Rb.a aVar, String str, String str2, String str3, Integer num, boolean z8, boolean z10, final Rb.a aVar2, Rb.a aVar3) {
        kotlin.jvm.internal.l.e(c10, "<this>");
        if (c10.f10272P || c10.L() || c10.C() == null) {
            return null;
        }
        final SweetAlertDialog showCancelButton = new SweetAlertDialog(c10.i0(), 0).showCancelButton(false);
        showCancelButton.showContentText(str != null);
        showCancelButton.setCancelable(z8);
        showCancelButton.setContentText(str);
        showCancelButton.setTitleText(str2);
        showCancelButton.setConfirmText(str3);
        if (z10) {
            showCancelButton.showCancelButton(true).setCancelText(c10.G(R.string.dialog_update_new_version_title)).setCancelClickListener(new e(c10, 1));
        }
        showCancelButton.setBackground(new ColorDrawable(0));
        View view = c10.f10277U;
        final Drawable foreground = view != null ? view.getForeground() : null;
        showCancelButton.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.kt.apps.core.utils.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ActivityUtilsKt.showErrorDialog$lambda$4(C.this, foreground, aVar2, dialogInterface);
            }
        });
        showCancelButton.setOnShowListener(new c(c10, showCancelButton, aVar3));
        showCancelButton.show();
        c10.f10288c0.a(new InterfaceC1477v() { // from class: com.kt.apps.core.utils.ActivityUtilsKt$showErrorDialog$4

            /* loaded from: classes2.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[r.values().length];
                    try {
                        iArr[r.ON_PAUSE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[r.ON_STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // l2.InterfaceC1477v
            public void onStateChanged(InterfaceC1479x source, r event) {
                kotlin.jvm.internal.l.e(source, "source");
                kotlin.jvm.internal.l.e(event, "event");
                int i7 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i7 == 1 || i7 == 2) {
                    C t5 = C.this;
                    kotlin.jvm.internal.l.e(t5, "t");
                    showCancelButton.dismissWithAnimation();
                    C.this.f10288c0.f(this);
                }
            }
        });
        new Handler(Looper.getMainLooper()).postDelayed(new a(aVar, 1), num != null ? num.intValue() : 1900);
        return showCancelButton;
    }

    public static final SweetAlertDialog showErrorDialog(final Activity activity, Rb.a aVar, String str, String str2, String str3, Integer num, boolean z8, boolean z10, boolean z11, final Rb.a aVar2, Rb.a aVar3) {
        kotlin.jvm.internal.l.e(activity, "<this>");
        if (activity.isDestroyed() || activity.isFinishing()) {
            return null;
        }
        final SweetAlertDialog showCancelButton = new SweetAlertDialog(activity, 0).showCancelButton(false);
        showCancelButton.showContentText(str != null);
        showCancelButton.setCancelable(z10);
        showCancelButton.setContentText(str);
        showCancelButton.setTitleText(str2);
        showCancelButton.setConfirmText(str3);
        if (z11) {
            showCancelButton.showCancelButton(true).setCancelText(activity.getString(R.string.dialog_update_new_version_title)).setCancelClickListener(new e(activity, 2));
        }
        showCancelButton.setBackground(new ColorDrawable(0));
        showCancelButton.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.kt.apps.core.utils.d
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ActivityUtilsKt.showErrorDialog$lambda$17(Rb.a.this, activity, dialogInterface);
            }
        });
        showCancelButton.setOnShowListener(new c(aVar3, showCancelButton, activity));
        showCancelButton.show();
        if ((activity instanceof G ? (G) activity : null) != null) {
            ((G) activity).f18773a.a(new InterfaceC1477v() { // from class: com.kt.apps.core.utils.ActivityUtilsKt$showErrorDialog$9$1

                /* loaded from: classes2.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[r.values().length];
                        try {
                            iArr[r.ON_PAUSE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[r.ON_STOP.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // l2.InterfaceC1477v
                public void onStateChanged(InterfaceC1479x source, r event) {
                    kotlin.jvm.internal.l.e(source, "source");
                    kotlin.jvm.internal.l.e(event, "event");
                    int i7 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                    if (i7 == 1 || i7 == 2) {
                        Activity t5 = activity;
                        kotlin.jvm.internal.l.e(t5, "t");
                        showCancelButton.dismissWithAnimation();
                        ((G) activity).f18773a.f(this);
                    }
                }
            });
        }
        new Handler(Looper.getMainLooper()).postDelayed(new a(aVar, 2), num != null ? num.intValue() : 1900);
        return showCancelButton;
    }

    public static /* synthetic */ SweetAlertDialog showErrorDialog$default(C c10, Rb.a aVar, String str, String str2, String str3, Integer num, boolean z8, boolean z10, Rb.a aVar2, Rb.a aVar3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        if ((i7 & 8) != 0) {
            str3 = "OK";
        }
        if ((i7 & 16) != 0) {
            num = 1900;
        }
        if ((i7 & 32) != 0) {
            z8 = true;
        }
        if ((i7 & 64) != 0) {
            z10 = true;
        }
        if ((i7 & 128) != 0) {
            aVar2 = null;
        }
        if ((i7 & 256) != 0) {
            aVar3 = null;
        }
        return showErrorDialog(c10, aVar, str, str2, str3, num, z8, z10, aVar2, aVar3);
    }

    public static /* synthetic */ SweetAlertDialog showErrorDialog$default(Activity activity, Rb.a aVar, String str, String str2, String str3, Integer num, boolean z8, boolean z10, boolean z11, Rb.a aVar2, Rb.a aVar3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 16) != 0) {
            num = 1900;
        }
        if ((i7 & 32) != 0) {
            z8 = false;
        }
        if ((i7 & 64) != 0) {
            z10 = true;
        }
        if ((i7 & 128) != 0) {
            z11 = true;
        }
        if ((i7 & 256) != 0) {
            aVar2 = null;
        }
        if ((i7 & 512) != 0) {
            aVar3 = null;
        }
        return showErrorDialog(activity, aVar, str, str2, str3, num, z8, z10, z11, aVar2, aVar3);
    }

    public static final void showErrorDialog$lambda$1(C c10, SweetAlertDialog sweetAlertDialog) {
        G A10 = c10.A();
        if (A10 != null) {
            startCheckForUpdate(A10);
        }
    }

    public static final void showErrorDialog$lambda$10(Rb.a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void showErrorDialog$lambda$15(Activity activity, SweetAlertDialog sweetAlertDialog) {
        String str;
        try {
            if (isRindoTV(activity)) {
                str = "tss.t.rindo";
            } else {
                String packageName = activity.getPackageName();
                str = (packageName == null || true != ac.g.b0(packageName, "mobile")) ? "com.kt.apps.media.xemtv" : "com.kt.apps.media.mobile.xemtv";
            }
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(str))));
        } catch (Throwable th) {
            com.bumptech.glide.c.n(th);
        }
    }

    public static final void showErrorDialog$lambda$17(Rb.a aVar, Activity activity, DialogInterface dialogInterface) {
        if (aVar != null) {
            aVar.invoke();
        }
        AbstractActivityC2461d abstractActivityC2461d = activity instanceof AbstractActivityC2461d ? (AbstractActivityC2461d) activity : null;
        if (abstractActivityC2461d != null) {
            abstractActivityC2461d.r();
        }
    }

    public static final void showErrorDialog$lambda$19(Rb.a aVar, SweetAlertDialog sweetAlertDialog, Activity activity, DialogInterface dialogInterface) {
        if (aVar != null) {
            aVar.invoke();
        }
        sweetAlertDialog.getButton(R.id.confirm_button).requestFocus();
        AbstractActivityC2461d abstractActivityC2461d = activity instanceof AbstractActivityC2461d ? (AbstractActivityC2461d) activity : null;
        if (abstractActivityC2461d != null) {
            abstractActivityC2461d.t();
        }
    }

    public static final void showErrorDialog$lambda$22(Rb.a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void showErrorDialog$lambda$4(C c10, Drawable drawable, Rb.a aVar, DialogInterface dialogInterface) {
        View view = c10.f10277U;
        if (view != null) {
            view.setForeground(drawable);
        }
        if (aVar != null) {
            aVar.invoke();
        }
        G A10 = c10.A();
        if (A10 != null) {
            if (!(A10 instanceof AbstractActivityC2461d)) {
                A10 = null;
            }
            if (A10 != null) {
                ((AbstractActivityC2461d) A10).r();
            }
        }
    }

    public static final void showErrorDialog$lambda$8(C c10, SweetAlertDialog sweetAlertDialog, Rb.a aVar, DialogInterface dialogInterface) {
        View view = c10.f10277U;
        if (view != null) {
            Context C2 = c10.C();
            view.setForeground(C2 != null ? AbstractC1449a.getDrawable(C2, R.drawable.base_background_player_container_error) : null);
        }
        sweetAlertDialog.getButton(R.id.confirm_button).requestFocus();
        if (aVar != null) {
            aVar.invoke();
        }
        G A10 = c10.A();
        if (A10 != null) {
            G g = A10 instanceof AbstractActivityC2461d ? A10 : null;
            if (g != null) {
                ((AbstractActivityC2461d) g).t();
            }
        }
    }

    public static final void showSuccessDialog(C c10, Rb.a aVar, String str, Integer num, boolean z8) {
        kotlin.jvm.internal.l.e(c10, "<this>");
        showSweetDialog$default(c10.g0(), 2, aVar, str, num, z8, null, null, 96, null);
    }

    public static final void showSuccessDialog(Activity activity, Rb.a aVar, String str, Integer num, boolean z8) {
        kotlin.jvm.internal.l.e(activity, "<this>");
        try {
            if (!activity.isDestroyed() && !activity.isFinishing()) {
                showSweetDialog$default(activity, 2, aVar, str, num, z8, null, null, 96, null);
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void showSuccessDialog$default(C c10, Rb.a aVar, String str, Integer num, boolean z8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            num = 1900;
        }
        if ((i7 & 8) != 0) {
            z8 = true;
        }
        showSuccessDialog(c10, aVar, str, num, z8);
    }

    public static /* synthetic */ void showSuccessDialog$default(Activity activity, Rb.a aVar, String str, Integer num, boolean z8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            num = 1900;
        }
        if ((i7 & 8) != 0) {
            z8 = true;
        }
        showSuccessDialog(activity, aVar, str, num, z8);
    }

    public static final void showSweetDialog(Activity activity, int i7) {
        kotlin.jvm.internal.l.e(activity, "<this>");
        showSweetDialog$default(activity, i7, null, null, null, false, null, null, 126, null);
    }

    public static final void showSweetDialog(Activity activity, int i7, Rb.a aVar) {
        kotlin.jvm.internal.l.e(activity, "<this>");
        showSweetDialog$default(activity, i7, aVar, null, null, false, null, null, 124, null);
    }

    public static final void showSweetDialog(Activity activity, int i7, Rb.a aVar, String str) {
        kotlin.jvm.internal.l.e(activity, "<this>");
        showSweetDialog$default(activity, i7, aVar, str, null, false, null, null, 120, null);
    }

    public static final void showSweetDialog(Activity activity, int i7, Rb.a aVar, String str, Integer num) {
        kotlin.jvm.internal.l.e(activity, "<this>");
        showSweetDialog$default(activity, i7, aVar, str, num, false, null, null, 112, null);
    }

    public static final void showSweetDialog(Activity activity, int i7, Rb.a aVar, String str, Integer num, boolean z8) {
        kotlin.jvm.internal.l.e(activity, "<this>");
        showSweetDialog$default(activity, i7, aVar, str, num, z8, null, null, 96, null);
    }

    public static final void showSweetDialog(Activity activity, int i7, Rb.a aVar, String str, Integer num, boolean z8, String str2) {
        kotlin.jvm.internal.l.e(activity, "<this>");
        showSweetDialog$default(activity, i7, aVar, str, num, z8, str2, null, 64, null);
    }

    public static final void showSweetDialog(final Activity activity, int i7, Rb.a aVar, String str, Integer num, boolean z8, String str2, String str3) {
        kotlin.jvm.internal.l.e(activity, "<this>");
        final SweetAlertDialog hideConfirmButton = new SweetAlertDialog(activity, i7).showCancelButton(false).hideConfirmButton();
        hideConfirmButton.showContentText(str != null);
        hideConfirmButton.setCancelable(!z8);
        hideConfirmButton.setContentText(str);
        hideConfirmButton.setTitleText(str2);
        hideConfirmButton.setConfirmText(str3);
        hideConfirmButton.setBackground(new ColorDrawable(0));
        hideConfirmButton.setOnDismissListener(new f(activity, 1));
        hideConfirmButton.setOnShowListener(new g(hideConfirmButton, activity, 1));
        hideConfirmButton.show();
        if (z8) {
            new Handler(Looper.getMainLooper()).postDelayed(new a(hideConfirmButton, 3), 1500L);
        } else if (activity instanceof G) {
            ((G) activity).f18773a.a(new InterfaceC1477v() { // from class: com.kt.apps.core.utils.ActivityUtilsKt$showSweetDialog$4

                /* loaded from: classes2.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[r.values().length];
                        try {
                            iArr[r.ON_PAUSE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[r.ON_STOP.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // l2.InterfaceC1477v
                public void onStateChanged(InterfaceC1479x source, r event) {
                    kotlin.jvm.internal.l.e(source, "source");
                    kotlin.jvm.internal.l.e(event, "event");
                    int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                    if (i10 == 1 || i10 == 2) {
                        try {
                            Activity t5 = activity;
                            kotlin.jvm.internal.l.e(t5, "t");
                            hideConfirmButton.dismissWithAnimation();
                            ((G) activity).f18773a.f(this);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
        new Handler(Looper.getMainLooper()).postDelayed(new a(aVar, 0), num != null ? num.intValue() : 1900);
    }

    public static /* synthetic */ void showSweetDialog$default(Activity activity, int i7, Rb.a aVar, String str, Integer num, boolean z8, String str2, String str3, int i10, Object obj) {
        showSweetDialog(activity, i7, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? 1900 : num, (i10 & 16) != 0 ? false : z8, (i10 & 32) != 0 ? null : str2, (i10 & 64) == 0 ? str3 : null);
    }

    public static final void showSweetDialog$lambda$24(Activity activity, DialogInterface dialogInterface) {
        AbstractActivityC2461d abstractActivityC2461d = activity instanceof AbstractActivityC2461d ? (AbstractActivityC2461d) activity : null;
        if (abstractActivityC2461d != null) {
            abstractActivityC2461d.r();
        }
    }

    public static final void showSweetDialog$lambda$26(SweetAlertDialog sweetAlertDialog, Activity activity, DialogInterface dialogInterface) {
        sweetAlertDialog.getButton(R.id.confirm_button).requestFocus();
        AbstractActivityC2461d abstractActivityC2461d = activity instanceof AbstractActivityC2461d ? (AbstractActivityC2461d) activity : null;
        if (abstractActivityC2461d != null) {
            abstractActivityC2461d.t();
        }
    }

    public static final void showSweetDialog$lambda$29(Rb.a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void startCheckForUpdate(Activity activity) {
        kotlin.jvm.internal.l.e(activity, "<this>");
        try {
            if (activity instanceof G) {
                checkForUpdate((G) activity);
            }
        } catch (Throwable th) {
            com.bumptech.glide.c.n(th);
        }
    }

    public static final void startDownloadUpdate(G g) {
        F.B(Q.f(g), null, 0, new ActivityUtilsKt$startDownloadUpdate$1(g, null), 3);
    }

    public static final Context updateLocale(Context context, String language) {
        kotlin.jvm.internal.l.e(context, "<this>");
        kotlin.jvm.internal.l.e(language, "language");
        Configuration configuration = new Configuration();
        Locale locale = new Locale(language);
        configuration.setLocale(locale);
        Locale.setDefault(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        kotlin.jvm.internal.l.d(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }

    public static /* synthetic */ Context updateLocale$default(Context context, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = "vi";
        }
        return updateLocale(context, str);
    }
}
