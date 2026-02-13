package com.kt.apps.core.utils;

import android.app.Activity;
import android.content.DialogInterface;
import cc.E;
import cn.pedant.SweetAlert.SweetAlertDialog;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SweetAlertDialog f16169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16170c;

    public /* synthetic */ g(SweetAlertDialog sweetAlertDialog, Object obj, int i7) {
        this.f16168a = i7;
        this.f16169b = sweetAlertDialog;
        this.f16170c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f16168a) {
            case 0:
                ActivityUtilsKt$checkForUpdate$1.invokeSuspend$lambda$4(this.f16169b, (E) this.f16170c, dialogInterface);
                return;
            default:
                ActivityUtilsKt.showSweetDialog$lambda$26(this.f16169b, (Activity) this.f16170c, dialogInterface);
                return;
        }
    }
}
