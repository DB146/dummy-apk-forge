package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC0972m;

/* renamed from: com.google.android.gms.common.internal.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1006w implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f15119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15120c;

    public /* synthetic */ DialogInterfaceOnClickListenerC1006w(Intent intent, Object obj, int i7) {
        this.f15118a = i7;
        this.f15119b = intent;
        this.f15120c = obj;
    }

    public final void a() {
        switch (this.f15118a) {
            case 0:
                Intent intent = this.f15119b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f15120c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f15119b;
                if (intent2 != null) {
                    ((InterfaceC0972m) this.f15120c).startActivityForResult(intent2, 2);
                    return;
                }
                return;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e2) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e2);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
