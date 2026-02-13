package com.kt.apps.core.utils;

import cn.pedant.SweetAlert.SweetAlertDialog;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16154b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f16153a = i7;
        this.f16154b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16153a) {
            case 0:
                ActivityUtilsKt.showSweetDialog$lambda$29((Rb.a) this.f16154b);
                return;
            case 1:
                ActivityUtilsKt.showErrorDialog$lambda$10((Rb.a) this.f16154b);
                return;
            case 2:
                ActivityUtilsKt.showErrorDialog$lambda$22((Rb.a) this.f16154b);
                return;
            default:
                ((SweetAlertDialog) this.f16154b).dismissWithAnimation();
                return;
        }
    }
}
