package C9;

import A9.AbstractC0074d;
import A9.C0098j;
import A9.Y1;
import A9.Z1;
import W1.G;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import y9.s;

/* loaded from: classes2.dex */
public final class g extends c {

    /* renamed from: F, reason: collision with root package name */
    public static final f f3090F = new Handler();

    /* renamed from: C, reason: collision with root package name */
    public boolean f3091C;

    /* renamed from: D, reason: collision with root package name */
    public final WeakReference f3092D;

    /* renamed from: E, reason: collision with root package name */
    public final e f3093E;

    public g(G g, b bVar) {
        super(g, bVar);
        this.f3092D = new WeakReference(this);
        this.f3093E = new e(this);
    }

    @Override // C9.c
    public final void a() {
        Z1 z12;
        if (this.f3093E.f3088d || (z12 = this.f3073e) == null) {
            return;
        }
        b bVar = this.f3072d;
        z12.c(bVar.L() ? bVar.K() : -1L);
    }

    public final void d(AbstractC0074d abstractC0074d, KeyEvent keyEvent) {
        if (abstractC0074d instanceof Y1) {
            boolean z8 = keyEvent == null || keyEvent.getKeyCode() == 85 || keyEvent.getKeyCode() == 126;
            if ((keyEvent == null || keyEvent.getKeyCode() == 85 || keyEvent.getKeyCode() == 127) && this.f3076v) {
                this.f3076v = false;
                this.f3072d.P();
            } else if (z8 && !this.f3076v) {
                this.f3076v = true;
                b();
            }
            e(this.f3076v);
            WeakReference weakReference = this.f3092D;
            f fVar = f3090F;
            fVar.removeMessages(100, weakReference);
            fVar.sendMessageDelayed(fVar.obtainMessage(100, weakReference), 2000L);
        }
    }

    public final void e(boolean z8) {
        if (this.f3073e == null) {
            return;
        }
        b bVar = this.f3072d;
        if (z8) {
            bVar.R(true);
        } else {
            a();
            bVar.R(this.f3093E.f3088d);
        }
        s sVar = this.f3070b;
        if (sVar != null) {
            sVar.f27531b.getClass();
        }
        Y1 y12 = this.f3075u;
        if (y12 == null || y12.f1037f == z8) {
            return;
        }
        y12.a(z8 ? 1 : 0);
        C0098j c0098j = this.f3073e.f1043c;
        int indexOf = c0098j.f1233c.indexOf(this.f3075u);
        if (indexOf >= 0) {
            c0098j.f851a.e(indexOf, 1);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (i7 != 4 && i7 != 111) {
            switch (i7) {
                default:
                    Z1 z12 = this.f3073e;
                    AbstractC0074d a9 = z12.a(z12.f1043c, i7);
                    if (a9 == null) {
                        Z1 z13 = this.f3073e;
                        a9 = z13.a(z13.f1044d, i7);
                    }
                    if (a9 != null) {
                        if (keyEvent.getAction() != 0) {
                            return true;
                        }
                        d(a9, keyEvent);
                        return true;
                    }
                case 19:
                case 20:
                case 21:
                case 22:
                    return false;
            }
        }
        return false;
    }
}
