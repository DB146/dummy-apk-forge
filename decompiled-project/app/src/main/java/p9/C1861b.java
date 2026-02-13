package p9;

import A9.O;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import com.kt.apps.media.xemtv.beta.R;
import ea.C1108c;
import java.util.List;

/* renamed from: p9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1861b implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeView f23157b;

    public /* synthetic */ C1861b(BarcodeView barcodeView, int i7) {
        this.f23156a = i7;
        this.f23157b = barcodeView;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C1108c c1108c;
        A4.s sVar;
        switch (this.f23156a) {
            case 0:
                int i7 = message.what;
                BarcodeView barcodeView = this.f23157b;
                if (i7 != R.id.zxing_decode_succeeded) {
                    if (i7 == R.id.zxing_decode_failed) {
                        return true;
                    }
                    if (i7 != R.id.zxing_possible_result_points) {
                        return false;
                    }
                    List<P8.p> list = (List) message.obj;
                    C1108c c1108c2 = barcodeView.f15887P;
                    if (c1108c2 == null || barcodeView.f15886O == 1) {
                        return true;
                    }
                    c1108c2.getClass();
                    for (P8.p pVar : list) {
                        ViewfinderView viewfinderView = ((DecoratedBarcodeView) c1108c2.f16830b).f15894b;
                        if (viewfinderView.f15903u.size() < 20) {
                            viewfinderView.f15903u.add(pVar);
                        }
                    }
                    return true;
                }
                C1860a c1860a = (C1860a) message.obj;
                if (c1860a == null || (c1108c = barcodeView.f15887P) == null || barcodeView.f15886O == 1) {
                    return true;
                }
                o7.o oVar = (o7.o) c1108c.f16831c;
                ((i) oVar.f22101b).f23192b.f15893a.g();
                O o10 = ((i) oVar.f22101b).f23198i;
                synchronized (o10) {
                    if (o10.f920a) {
                        o10.i();
                    }
                }
                ((i) oVar.f22101b).j.post(new p5.j(3, oVar, c1860a));
                if (barcodeView.f15886O != 2) {
                    return true;
                }
                barcodeView.f15886O = 1;
                barcodeView.f15887P = null;
                barcodeView.i();
                return true;
            default:
                int i10 = message.what;
                BarcodeView barcodeView2 = this.f23157b;
                d dVar = barcodeView2.f23173M;
                if (i10 != R.id.zxing_prewiew_size_ready) {
                    if (i10 == R.id.zxing_camera_error) {
                        Exception exc = (Exception) message.obj;
                        if (barcodeView2.f23174a != null) {
                            barcodeView2.g();
                            dVar.c(exc);
                        }
                    } else if (i10 == R.id.zxing_camera_closed) {
                        dVar.a();
                    }
                    return false;
                }
                r rVar = (r) message.obj;
                barcodeView2.f23163B = rVar;
                r rVar2 = barcodeView2.f23162A;
                if (rVar2 == null) {
                    return true;
                }
                if (rVar == null || (sVar = barcodeView2.f23184y) == null) {
                    barcodeView2.f23167F = null;
                    barcodeView2.f23166E = null;
                    barcodeView2.f23164C = null;
                    throw new IllegalStateException("containerSize or previewSize is not set yet");
                }
                Rect b2 = ((q9.l) sVar.f472c).b(rVar, (r) sVar.f471b);
                if (b2.width() > 0 && b2.height() > 0) {
                    barcodeView2.f23164C = b2;
                    Rect rect = new Rect(0, 0, rVar2.f23214a, rVar2.f23215b);
                    Rect rect2 = barcodeView2.f23164C;
                    Rect rect3 = new Rect(rect);
                    rect3.intersect(rect2);
                    if (barcodeView2.f23168G != null) {
                        rect3.inset(Math.max(0, (rect3.width() - barcodeView2.f23168G.f23214a) / 2), Math.max(0, (rect3.height() - barcodeView2.f23168G.f23215b) / 2));
                    } else {
                        int min = (int) Math.min(rect3.width() * barcodeView2.f23169H, rect3.height() * barcodeView2.f23169H);
                        rect3.inset(min, min);
                        if (rect3.height() > rect3.width()) {
                            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                        }
                    }
                    barcodeView2.f23166E = rect3;
                    Rect rect4 = new Rect(barcodeView2.f23166E);
                    Rect rect5 = barcodeView2.f23164C;
                    rect4.offset(-rect5.left, -rect5.top);
                    int i11 = rect4.left;
                    int i12 = rVar.f23214a;
                    int width = (i11 * i12) / barcodeView2.f23164C.width();
                    int i13 = rect4.top;
                    int i14 = rVar.f23215b;
                    Rect rect6 = new Rect(width, (i13 * i14) / barcodeView2.f23164C.height(), (rect4.right * i12) / barcodeView2.f23164C.width(), (rect4.bottom * i14) / barcodeView2.f23164C.height());
                    barcodeView2.f23167F = rect6;
                    if (rect6.width() <= 0 || barcodeView2.f23167F.height() <= 0) {
                        barcodeView2.f23167F = null;
                        barcodeView2.f23166E = null;
                        Log.w("e", "Preview frame is too small");
                    } else {
                        dVar.e();
                    }
                }
                barcodeView2.requestLayout();
                barcodeView2.e();
                return true;
        }
    }
}
