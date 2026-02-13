package p9;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23160b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f23159a = i7;
        this.f23160b = obj;
    }

    private final void b() {
    }

    private final void d(Exception exc) {
    }

    private final void f() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void k() {
    }

    private final void l() {
    }

    public final void a() {
        Object obj = this.f23160b;
        switch (this.f23159a) {
            case 0:
                Iterator it = ((BarcodeView) obj).f23183x.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a();
                }
                return;
            case 1:
                i iVar = (i) obj;
                if (iVar.k) {
                    Log.d("i", "Camera closed; finishing activity");
                    iVar.f23191a.finish();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(Exception exc) {
        switch (this.f23159a) {
            case 0:
                Iterator it = ((BarcodeView) this.f23160b).f23183x.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c(exc);
                }
                return;
            case 1:
                i iVar = (i) this.f23160b;
                iVar.b(iVar.f23191a.getString(R.string.zxing_msg_camera_framework_bug));
                return;
            default:
                return;
        }
    }

    public final void e() {
        switch (this.f23159a) {
            case 0:
                Iterator it = ((BarcodeView) this.f23160b).f23183x.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).e();
                }
                return;
            case 1:
                return;
            default:
                ViewfinderView viewfinderView = (ViewfinderView) this.f23160b;
                e eVar = viewfinderView.f15905w;
                if (eVar != null) {
                    Rect framingRect = eVar.getFramingRect();
                    r previewSize = viewfinderView.f15905w.getPreviewSize();
                    if (framingRect != null && previewSize != null) {
                        viewfinderView.f15906x = framingRect;
                        viewfinderView.f15907y = previewSize;
                    }
                }
                viewfinderView.invalidate();
                return;
        }
    }

    public final void g() {
        switch (this.f23159a) {
            case 0:
                Iterator it = ((BarcodeView) this.f23160b).f23183x.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).g();
                }
                return;
            case 1:
            default:
                return;
        }
    }

    public final void j() {
        switch (this.f23159a) {
            case 0:
                Iterator it = ((BarcodeView) this.f23160b).f23183x.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).j();
                }
                return;
            case 1:
            default:
                return;
        }
    }
}
