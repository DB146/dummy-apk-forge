package c2;

import android.util.Log;
import android.view.SurfaceHolder;
import com.journeyapps.barcodescanner.BarcodeView;
import y9.AbstractC2456A;

/* loaded from: classes.dex */
public final class x implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14259b;

    public /* synthetic */ x(Object obj, int i7) {
        this.f14258a = i7;
        this.f14259b = obj;
    }

    private final void a(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i7, int i10, int i11) {
        Object obj = this.f14259b;
        switch (this.f14258a) {
            case 0:
                ((y) obj).getClass();
                return;
            case 1:
                if (holder == null) {
                    int i12 = p9.e.f23161N;
                    Log.e("e", "*** WARNING *** surfaceChanged() gave us a null surface!");
                    return;
                } else {
                    BarcodeView barcodeView = (BarcodeView) obj;
                    barcodeView.f23165D = new p9.r(i10, i11);
                    barcodeView.e();
                    return;
                }
            default:
                kotlin.jvm.internal.l.e(holder, "holder");
                C9.a aVar = ((AbstractC2456A) obj).f27468l1;
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        switch (this.f14258a) {
            case 0:
                y yVar = (y) this.f14259b;
                yVar.getClass();
                yVar.getClass();
                return;
            case 1:
                return;
            default:
                kotlin.jvm.internal.l.e(holder, "holder");
                AbstractC2456A abstractC2456A = (AbstractC2456A) this.f14259b;
                C9.a aVar = abstractC2456A.f27468l1;
                if (aVar != null) {
                    aVar.f3059a.S(holder.getSurface());
                }
                abstractC2456A.f27469m1 = 1;
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        switch (this.f14258a) {
            case 0:
                y yVar = (y) this.f14259b;
                yVar.getClass();
                yVar.getClass();
                return;
            case 1:
                ((BarcodeView) this.f14259b).f23165D = null;
                return;
            default:
                kotlin.jvm.internal.l.e(holder, "holder");
                AbstractC2456A abstractC2456A = (AbstractC2456A) this.f14259b;
                C9.a aVar = abstractC2456A.f27468l1;
                if (aVar != null) {
                    aVar.surfaceDestroyed(holder);
                }
                abstractC2456A.f27469m1 = 0;
                return;
        }
    }
}
