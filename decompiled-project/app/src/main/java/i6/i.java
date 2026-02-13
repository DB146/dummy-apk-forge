package i6;

import android.app.Dialog;
import android.content.Context;
import android.util.TypedValue;
import com.kt.apps.media.xemtv.beta.R;
import i.x;
import i.y;

/* loaded from: classes.dex */
public class i extends y {
    /* JADX WARN: Type inference failed for: r0v0, types: [i.x, i6.h, android.app.Dialog] */
    @Override // i.y, W1.DialogInterfaceOnCancelListenerC0577u
    public final Dialog q0() {
        Context C2 = C();
        int p02 = p0();
        if (p02 == 0) {
            TypedValue typedValue = new TypedValue();
            p02 = C2.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        ?? xVar = new x(C2, p02);
        xVar.f18456x = true;
        xVar.f18457y = true;
        xVar.f18451D = new f(xVar);
        xVar.f().h(1);
        xVar.f18449B = xVar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        return xVar;
    }

    public final void u0() {
        Dialog dialog = this.f10565x0;
        if (dialog instanceof h) {
            h hVar = (h) dialog;
            if (hVar.f18452f == null) {
                hVar.h();
            }
            boolean z8 = hVar.f18452f.f15189I;
        }
        o0(false, false);
    }
}
