package F5;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog f4091a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f4092b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f4093c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4092b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f4091a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f4093c == null) {
            Activity activity = getActivity();
            G.g(activity);
            this.f4093c = new AlertDialog.Builder(activity).create();
        }
        return this.f4093c;
    }
}
