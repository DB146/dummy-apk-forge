package i;

import I2.K;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c.DialogC0868l;
import com.kt.apps.media.xemtv.beta.R;
import m.C1528j;
import y1.InterfaceC2362j;

/* loaded from: classes.dex */
public class x extends DialogC0868l implements h {

    /* renamed from: d, reason: collision with root package name */
    public v f18162d;

    /* renamed from: e, reason: collision with root package name */
    public final w f18163e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [i.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(Context context, int i7) {
        super(context, r2);
        int i10;
        if (i7 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = i7;
        }
        this.f18163e = new InterfaceC2362j() { // from class: i.w
            @Override // y1.InterfaceC2362j
            public final boolean c(KeyEvent keyEvent) {
                return x.this.g(keyEvent);
            }
        };
        k f4 = f();
        if (i7 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i7 = typedValue2.resourceId;
        }
        ((v) f4).f18144i0 = i7;
        f4.c();
    }

    @Override // c.DialogC0868l, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        v vVar = (v) f();
        vVar.v();
        ((ViewGroup) vVar.f18125P.findViewById(android.R.id.content)).addView(view, layoutParams);
        vVar.f18111A.a(vVar.f18160z.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return com.bumptech.glide.d.h(this.f18163e, getWindow().getDecorView(), this, keyEvent);
    }

    public final k f() {
        if (this.f18162d == null) {
            K k = k.f18072a;
            this.f18162d = new v(getContext(), getWindow(), this, this);
        }
        return this.f18162d;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i7) {
        v vVar = (v) f();
        vVar.v();
        return vVar.f18160z.findViewById(i7);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        v vVar = (v) f();
        if (vVar.f18113C != null) {
            vVar.z();
            vVar.f18113C.getClass();
            vVar.A(0);
        }
    }

    @Override // c.DialogC0868l, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().c();
    }

    @Override // c.DialogC0868l, android.app.Dialog
    public final void onStop() {
        super.onStop();
        v vVar = (v) f();
        vVar.z();
        G g = vVar.f18113C;
        if (g != null) {
            g.f18020w = false;
            C1528j c1528j = g.f18019v;
            if (c1528j != null) {
                c1528j.a();
            }
        }
    }

    @Override // c.DialogC0868l, android.app.Dialog
    public void setContentView(int i7) {
        e();
        f().i(i7);
    }

    @Override // c.DialogC0868l, android.app.Dialog
    public void setContentView(View view) {
        e();
        f().j(view);
    }

    @Override // c.DialogC0868l, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        f().k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i7) {
        super.setTitle(i7);
        f().l(getContext().getString(i7));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().l(charSequence);
    }
}
