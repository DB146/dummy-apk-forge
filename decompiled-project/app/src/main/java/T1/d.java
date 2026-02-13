package T1;

import U9.i;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class d implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f9206a;

    /* renamed from: b, reason: collision with root package name */
    public final i f9207b;

    public d(KeyListener keyListener) {
        i iVar = new i(15);
        this.f9206a = keyListener;
        this.f9207b = iVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f9206a.clearMetaKeyState(view, editable, i7);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f9206a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        boolean z8;
        this.f9207b.getClass();
        if (i7 != 67 ? i7 != 112 ? false : S1.a.a(editable, keyEvent, true) : S1.a.a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z8 = true;
        } else {
            z8 = false;
        }
        return z8 || this.f9206a.onKeyDown(view, editable, i7, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f9206a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f9206a.onKeyUp(view, editable, i7, keyEvent);
    }
}
