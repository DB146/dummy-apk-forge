package W1;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: W1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0574q implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0577u f10546a;

    public DialogInterfaceOnCancelListenerC0574q(DialogInterfaceOnCancelListenerC0577u dialogInterfaceOnCancelListenerC0577u) {
        this.f10546a = dialogInterfaceOnCancelListenerC0577u;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0577u dialogInterfaceOnCancelListenerC0577u = this.f10546a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0577u.f10565x0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0577u.onCancel(dialog);
        }
    }
}
