package i;

import W1.DialogInterfaceOnCancelListenerC0577u;
import android.app.Dialog;

/* loaded from: classes.dex */
public class y extends DialogInterfaceOnCancelListenerC0577u {
    @Override // W1.DialogInterfaceOnCancelListenerC0577u
    public Dialog q0() {
        return new x(C(), p0());
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u
    public final void s0(Dialog dialog, int i7) {
        if (!(dialog instanceof x)) {
            super.s0(dialog, i7);
            return;
        }
        x xVar = (x) dialog;
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        xVar.f().h(1);
    }
}
