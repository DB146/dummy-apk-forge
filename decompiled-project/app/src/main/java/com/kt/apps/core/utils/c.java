package com.kt.apps.core.utils;

import W1.C;
import android.app.Activity;
import android.content.DialogInterface;
import cn.pedant.SweetAlert.SweetAlertDialog;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16158a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.a f16159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SweetAlertDialog f16160c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16161d;

    public /* synthetic */ c(Rb.a aVar, SweetAlertDialog sweetAlertDialog, Activity activity) {
        this.f16159b = aVar;
        this.f16160c = sweetAlertDialog;
        this.f16161d = activity;
    }

    public /* synthetic */ c(C c10, SweetAlertDialog sweetAlertDialog, Rb.a aVar) {
        this.f16161d = c10;
        this.f16160c = sweetAlertDialog;
        this.f16159b = aVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f16158a) {
            case 0:
                ActivityUtilsKt.showErrorDialog$lambda$8((C) this.f16161d, this.f16160c, this.f16159b, dialogInterface);
                return;
            default:
                ActivityUtilsKt.showErrorDialog$lambda$19(this.f16159b, this.f16160c, (Activity) this.f16161d, dialogInterface);
                return;
        }
    }
}
