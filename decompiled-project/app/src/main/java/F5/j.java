package F5;

import W1.DialogInterfaceOnCancelListenerC0577u;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC0577u {
    public AlertDialog C0;

    /* renamed from: D0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f4109D0;

    /* renamed from: E0, reason: collision with root package name */
    public AlertDialog f4110E0;

    @Override // W1.DialogInterfaceOnCancelListenerC0577u, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4109D0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u
    public final Dialog q0() {
        AlertDialog alertDialog = this.C0;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f10561t0 = false;
        if (this.f4110E0 == null) {
            Context C2 = C();
            G.g(C2);
            this.f4110E0 = new AlertDialog.Builder(C2).create();
        }
        return this.f4110E0;
    }
}
