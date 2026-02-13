package y9;

import A9.A2;
import A9.C0121o2;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: y9.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2457B extends A2 {

    /* renamed from: K0, reason: collision with root package name */
    public final Db.o f27481K0 = android.support.v4.media.session.b.z(new wa.f(19));

    public final C0121o2 B0() {
        return (C0121o2) this.f27481K0.getValue();
    }

    public abstract void C0(View view);

    public abstract void D0(View view);

    @Override // W1.C
    public void R(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        super.R(context);
    }

    @Override // A9.A2, W1.C
    public View T(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.l.e(inflater, "inflater");
        View T10 = super.T(inflater, viewGroup, bundle);
        D0(T10);
        B0().f1327a = 500L;
        B0().f1329c = (ViewGroup) g0().findViewById(R.id.content);
        return T10;
    }

    @Override // A9.A2, W1.C
    public void V() {
        try {
            B0().a();
        } catch (Exception unused) {
        }
        super.V();
    }

    @Override // A9.A2, W1.C
    public void d0(View view, Bundle bundle) {
        kotlin.jvm.internal.l.e(view, "view");
        super.d0(view, bundle);
        C0(view);
    }
}
