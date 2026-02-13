package n;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import i.DialogInterfaceC1286f;

/* renamed from: n.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC1679m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1689w {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC1666D f20966a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC1286f f20967b;

    /* renamed from: c, reason: collision with root package name */
    public C1674h f20968c;

    @Override // n.InterfaceC1689w
    public final void a(MenuC1678l menuC1678l, boolean z8) {
        DialogInterfaceC1286f dialogInterfaceC1286f;
        if ((z8 || menuC1678l == this.f20966a) && (dialogInterfaceC1286f = this.f20967b) != null) {
            dialogInterfaceC1286f.dismiss();
        }
    }

    @Override // n.InterfaceC1689w
    public final boolean j(MenuC1678l menuC1678l) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        C1674h c1674h = this.f20968c;
        if (c1674h.f20935f == null) {
            c1674h.f20935f = new C1673g(c1674h);
        }
        this.f20966a.q(c1674h.f20935f.getItem(i7), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f20968c.a(this.f20966a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1666D subMenuC1666D = this.f20966a;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f20967b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f20967b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1666D.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1666D.performShortcut(i7, keyEvent, 0);
    }
}
