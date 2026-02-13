package A9;

import android.view.KeyEvent;
import android.view.View;
import com.kt.apps.core.base.leanback.HorizontalGridView;

/* renamed from: A9.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0162z0 implements InterfaceC0137t, L1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f1488a;

    public /* synthetic */ C0162z0(E0 e02) {
        this.f1488a = e02;
    }

    @Override // A9.InterfaceC0137t
    public boolean a(KeyEvent keyEvent) {
        E0 e02 = this.f1488a;
        View.OnKeyListener onKeyListener = e02.f1465l;
        if (onKeyListener != null) {
            return onKeyListener.onKey(e02.f1271a, keyEvent.getKeyCode(), keyEvent);
        }
        return false;
    }

    @Override // A9.L1
    public void j(View view, int i7) {
        E0 e02 = this.f1488a;
        if (e02.g) {
            HorizontalGridView horizontalGridView = e02.f807r;
            C0131r1 c0131r1 = (C0131r1) (view != null ? horizontalGridView.L(view) : horizontalGridView.I(horizontalGridView.getSelectedPosition(), false));
            if (c0131r1 == null) {
                InterfaceC0153x interfaceC0153x = e02.f1466m;
                if (interfaceC0153x != null) {
                    interfaceC0153x.a(null, null, e02, e02.f1460d);
                    return;
                }
                return;
            }
            InterfaceC0153x interfaceC0153x2 = e02.f1466m;
            if (interfaceC0153x2 != null) {
                interfaceC0153x2.a(c0131r1.f1355v, c0131r1.f1356w, e02, e02.f1460d);
            }
        }
    }
}
