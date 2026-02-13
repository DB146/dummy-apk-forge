package y9;

import J1.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import v2.C2132d;

/* renamed from: y9.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2463f<DB extends J1.k> extends i6.i {
    public J1.k C0;

    /* renamed from: D0, reason: collision with root package name */
    public BottomSheetBehavior f27498D0;

    /* renamed from: E0, reason: collision with root package name */
    public final Db.o f27499E0 = android.support.v4.media.session.b.z(new C2132d(this, 6));

    @Override // W1.C
    public final View T(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.l.e(inflater, "inflater");
        int x02 = x0();
        DataBinderMapperImpl dataBinderMapperImpl = J1.e.f5416a;
        J1.k b2 = J1.e.f5416a.b(inflater.inflate(x02, viewGroup, false), x02);
        kotlin.jvm.internal.l.e(b2, "<set-?>");
        this.C0 = b2;
        y0();
        return v0().f5434e;
    }

    @Override // W1.C
    public final void U() {
        BottomSheetBehavior w02 = w0();
        w02.f15202W.remove((C2462e) this.f27499E0.getValue());
        this.f10275S = true;
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u, W1.C
    public void b0() {
        super.b0();
        Object parent = v0().f5434e.getParent();
        kotlin.jvm.internal.l.c(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior A10 = BottomSheetBehavior.A((View) parent);
        kotlin.jvm.internal.l.e(A10, "<set-?>");
        this.f27498D0 = A10;
        BottomSheetBehavior w02 = w0();
        C2462e c2462e = (C2462e) this.f27499E0.getValue();
        ArrayList arrayList = w02.f15202W;
        if (arrayList.contains(c2462e)) {
            return;
        }
        arrayList.add(c2462e);
    }

    public final J1.k v0() {
        J1.k kVar = this.C0;
        if (kVar != null) {
            return kVar;
        }
        kotlin.jvm.internal.l.j("binding");
        throw null;
    }

    public final BottomSheetBehavior w0() {
        BottomSheetBehavior bottomSheetBehavior = this.f27498D0;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        kotlin.jvm.internal.l.j("bottomSheetBehavior");
        throw null;
    }

    public abstract int x0();

    public abstract void y0();
}
