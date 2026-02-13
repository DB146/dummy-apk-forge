package com.kt.apps.core.utils;

import android.app.Activity;
import android.content.DialogInterface;
import cc.E;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16167b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f16166a = i7;
        this.f16167b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f16166a) {
            case 0:
                ActivityUtilsKt$checkForUpdate$1.h((E) this.f16167b, dialogInterface);
                return;
            default:
                ActivityUtilsKt.a((Activity) this.f16167b, dialogInterface);
                return;
        }
    }
}
