package W1;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class r implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0577u f10547a;

    public r(DialogInterfaceOnCancelListenerC0577u dialogInterfaceOnCancelListenerC0577u) {
        this.f10547a = dialogInterfaceOnCancelListenerC0577u;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0577u dialogInterfaceOnCancelListenerC0577u = this.f10547a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0577u.f10565x0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0577u.onDismiss(dialog);
        }
    }
}
