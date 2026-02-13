package W1;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c.DialogC0868l;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: W1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0577u extends C implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: A0, reason: collision with root package name */
    public boolean f10552A0;

    /* renamed from: m0, reason: collision with root package name */
    public Handler f10554m0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f10563v0;

    /* renamed from: x0, reason: collision with root package name */
    public Dialog f10565x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f10566y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f10567z0;

    /* renamed from: n0, reason: collision with root package name */
    public final B0.C f10555n0 = new B0.C(this, 13);

    /* renamed from: o0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0574q f10556o0 = new DialogInterfaceOnCancelListenerC0574q(this);

    /* renamed from: p0, reason: collision with root package name */
    public final r f10557p0 = new r(this);

    /* renamed from: q0, reason: collision with root package name */
    public int f10558q0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    public int f10559r0 = 0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f10560s0 = true;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f10561t0 = true;

    /* renamed from: u0, reason: collision with root package name */
    public int f10562u0 = -1;

    /* renamed from: w0, reason: collision with root package name */
    public final C0575s f10564w0 = new C0575s(0, this);

    /* renamed from: B0, reason: collision with root package name */
    public boolean f10553B0 = false;

    @Override // W1.C
    public final void O() {
        this.f10275S = true;
    }

    @Override // W1.C
    public void R(Context context) {
        super.R(context);
        this.f10292e0.f(this.f10564w0);
        if (this.f10552A0) {
            return;
        }
        this.f10567z0 = false;
    }

    @Override // W1.C
    public void S(Bundle bundle) {
        super.S(bundle);
        this.f10554m0 = new Handler();
        this.f10561t0 = this.f10269M == 0;
        if (bundle != null) {
            this.f10558q0 = bundle.getInt("android:style", 0);
            this.f10559r0 = bundle.getInt("android:theme", 0);
            this.f10560s0 = bundle.getBoolean("android:cancelable", true);
            this.f10561t0 = bundle.getBoolean("android:showsDialog", this.f10561t0);
            this.f10562u0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // W1.C
    public final void V() {
        this.f10275S = true;
        Dialog dialog = this.f10565x0;
        if (dialog != null) {
            this.f10566y0 = true;
            dialog.setOnDismissListener(null);
            this.f10565x0.dismiss();
            if (!this.f10567z0) {
                onDismiss(this.f10565x0);
            }
            this.f10565x0 = null;
            this.f10553B0 = false;
        }
    }

    @Override // W1.C
    public final void W() {
        this.f10275S = true;
        if (!this.f10552A0 && !this.f10567z0) {
            this.f10567z0 = true;
        }
        this.f10292e0.i(this.f10564w0);
    }

    @Override // W1.C
    public LayoutInflater X(Bundle bundle) {
        LayoutInflater X10 = super.X(bundle);
        boolean z8 = this.f10561t0;
        if (!z8 || this.f10563v0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f10561t0) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return X10;
        }
        if (z8 && !this.f10553B0) {
            try {
                this.f10563v0 = true;
                Dialog q02 = q0();
                this.f10565x0 = q02;
                if (this.f10561t0) {
                    s0(q02, this.f10558q0);
                    Context C2 = C();
                    if (C2 instanceof Activity) {
                        this.f10565x0.setOwnerActivity((Activity) C2);
                    }
                    this.f10565x0.setCancelable(this.f10560s0);
                    this.f10565x0.setOnCancelListener(this.f10556o0);
                    this.f10565x0.setOnDismissListener(this.f10557p0);
                    this.f10553B0 = true;
                } else {
                    this.f10565x0 = null;
                }
                this.f10563v0 = false;
            } catch (Throwable th) {
                this.f10563v0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f10565x0;
        return dialog != null ? X10.cloneInContext(dialog.getContext()) : X10;
    }

    @Override // W1.C
    public void a0(Bundle bundle) {
        Dialog dialog = this.f10565x0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i7 = this.f10558q0;
        if (i7 != 0) {
            bundle.putInt("android:style", i7);
        }
        int i10 = this.f10559r0;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z8 = this.f10560s0;
        if (!z8) {
            bundle.putBoolean("android:cancelable", z8);
        }
        boolean z10 = this.f10561t0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i11 = this.f10562u0;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    @Override // W1.C
    public void b0() {
        this.f10275S = true;
        Dialog dialog = this.f10565x0;
        if (dialog != null) {
            this.f10566y0 = false;
            dialog.show();
            View decorView = this.f10565x0.getWindow().getDecorView();
            l2.Q.i(decorView, this);
            l2.Q.j(decorView, this);
            android.support.v4.media.session.b.C(decorView, this);
        }
    }

    @Override // W1.C
    public void c0() {
        this.f10275S = true;
        Dialog dialog = this.f10565x0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // W1.C
    public final void e0(Bundle bundle) {
        Bundle bundle2;
        this.f10275S = true;
        if (this.f10565x0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f10565x0.onRestoreInstanceState(bundle2);
    }

    @Override // W1.C
    public final void f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.f0(layoutInflater, viewGroup, bundle);
        if (this.f10277U != null || this.f10565x0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f10565x0.onRestoreInstanceState(bundle2);
    }

    public final void o0(boolean z8, boolean z10) {
        if (this.f10567z0) {
            return;
        }
        this.f10567z0 = true;
        this.f10552A0 = false;
        Dialog dialog = this.f10565x0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f10565x0.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.f10554m0.getLooper()) {
                    onDismiss(this.f10565x0);
                } else {
                    this.f10554m0.post(this.f10555n0);
                }
            }
        }
        this.f10566y0 = true;
        if (this.f10562u0 >= 0) {
            U E10 = E();
            int i7 = this.f10562u0;
            if (i7 < 0) {
                throw new IllegalArgumentException(h3.o.l(i7, "Bad id: "));
            }
            E10.y(new S(E10, i7, 1), z8);
            this.f10562u0 = -1;
            return;
        }
        C0558a c0558a = new C0558a(E());
        c0558a.f10421r = true;
        c0558a.i(this);
        if (z8) {
            c0558a.e(true);
        } else {
            c0558a.e(false);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f10566y0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        o0(true, true);
    }

    public int p0() {
        return this.f10559r0;
    }

    public Dialog q0() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0868l(i0(), p0());
    }

    public final void r0() {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to 2132083048, 2132082984");
        }
        this.f10558q0 = R.style.ModalBottomSheetDialog;
        this.f10559r0 = R.style.BottomSheetDialog;
    }

    public void s0(Dialog dialog, int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void t0(U u3, String str) {
        this.f10567z0 = false;
        this.f10552A0 = true;
        u3.getClass();
        C0558a c0558a = new C0558a(u3);
        c0558a.f10421r = true;
        c0558a.g(0, this, str, 1);
        c0558a.e(false);
    }

    @Override // W1.C
    public final tc.b x() {
        return new C0576t(this, new C0580x(this));
    }
}
