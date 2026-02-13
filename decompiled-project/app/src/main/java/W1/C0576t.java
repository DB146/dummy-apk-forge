package W1;

import android.app.Dialog;
import android.view.View;

/* renamed from: W1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0576t extends tc.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0580x f10550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0577u f10551b;

    public C0576t(DialogInterfaceOnCancelListenerC0577u dialogInterfaceOnCancelListenerC0577u, C0580x c0580x) {
        this.f10551b = dialogInterfaceOnCancelListenerC0577u;
        this.f10550a = c0580x;
    }

    @Override // tc.b
    public final View B(int i7) {
        C0580x c0580x = this.f10550a;
        if (c0580x.C()) {
            return c0580x.B(i7);
        }
        Dialog dialog = this.f10551b.f10565x0;
        if (dialog != null) {
            return dialog.findViewById(i7);
        }
        return null;
    }

    @Override // tc.b
    public final boolean C() {
        return this.f10550a.C() || this.f10551b.f10553B0;
    }
}
