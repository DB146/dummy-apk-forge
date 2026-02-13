package p9;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;
import i1.C1290a;

/* loaded from: classes2.dex */
public final class q extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E5.o f23213a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(E5.o oVar, Context context) {
        super(context, 3);
        this.f23213a = oVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i7) {
        int rotation;
        E5.o oVar = this.f23213a;
        WindowManager windowManager = (WindowManager) oVar.f3713b;
        C1290a c1290a = (C1290a) oVar.f3715d;
        if (windowManager == null || c1290a == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == oVar.f3712a) {
            return;
        }
        oVar.f3712a = rotation;
        ((BarcodeView) c1290a.f18187b).f23176c.postDelayed(new k1.a(c1290a, 6), 250L);
    }
}
