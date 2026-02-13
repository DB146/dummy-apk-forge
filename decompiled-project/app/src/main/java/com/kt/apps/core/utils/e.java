package com.kt.apps.core.utils;

import W1.C;
import W1.G;
import android.app.Activity;
import cn.pedant.SweetAlert.SweetAlertDialog;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements SweetAlertDialog.OnSweetClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16165b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f16164a = i7;
        this.f16165b = obj;
    }

    @Override // cn.pedant.SweetAlert.SweetAlertDialog.OnSweetClickListener
    public final void onClick(SweetAlertDialog sweetAlertDialog) {
        switch (this.f16164a) {
            case 0:
                ActivityUtilsKt.access$startDownloadUpdate((G) this.f16165b);
                return;
            case 1:
                ActivityUtilsKt.showErrorDialog$lambda$1((C) this.f16165b, sweetAlertDialog);
                return;
            default:
                ActivityUtilsKt.showErrorDialog$lambda$15((Activity) this.f16165b, sweetAlertDialog);
                return;
        }
    }
}
