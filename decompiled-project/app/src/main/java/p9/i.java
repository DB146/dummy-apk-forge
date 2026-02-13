package p9;

import A9.O;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f23190n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CaptureActivity f23191a;

    /* renamed from: b, reason: collision with root package name */
    public final DecoratedBarcodeView f23192b;

    /* renamed from: h, reason: collision with root package name */
    public final T8.g f23197h;

    /* renamed from: i, reason: collision with root package name */
    public final O f23198i;
    public final Handler j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23200m;

    /* renamed from: c, reason: collision with root package name */
    public int f23193c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23194d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23195e = true;

    /* renamed from: f, reason: collision with root package name */
    public String f23196f = "";
    public boolean g = false;
    public boolean k = false;

    /* renamed from: l, reason: collision with root package name */
    public final o7.o f23199l = new o7.o(this, 2);

    /* JADX WARN: Type inference failed for: r5v5, types: [A9.O, java.lang.Object] */
    public i(CaptureActivity captureActivity, DecoratedBarcodeView decoratedBarcodeView) {
        d dVar = new d(this, 1);
        this.f23200m = false;
        this.f23191a = captureActivity;
        this.f23192b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().f23183x.add(dVar);
        this.j = new Handler();
        this.f23197h = new T8.g(captureActivity, new f(this, 0));
        ?? obj = new Object();
        obj.f920a = true;
        captureActivity.setVolumeControlStream(3);
        obj.f921b = captureActivity.getApplicationContext();
        this.f23198i = obj;
    }

    public final void a() {
        DecoratedBarcodeView decoratedBarcodeView = this.f23192b;
        q9.f fVar = decoratedBarcodeView.getBarcodeView().f23174a;
        if (fVar == null || fVar.g) {
            this.f23191a.finish();
        } else {
            this.k = true;
        }
        decoratedBarcodeView.f15893a.g();
        this.f23197h.c();
    }

    public final void b(String str) {
        CaptureActivity captureActivity = this.f23191a;
        if (captureActivity.isFinishing() || this.g || this.k) {
            return;
        }
        if (str.isEmpty()) {
            str = captureActivity.getString(R.string.zxing_msg_camera_framework_bug);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(captureActivity);
        builder.setTitle(captureActivity.getString(R.string.zxing_app_name));
        builder.setMessage(str);
        builder.setPositiveButton(R.string.zxing_button_ok, new DialogInterface.OnClickListener() { // from class: p9.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                i.this.f23191a.finish();
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: p9.h
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                i.this.f23191a.finish();
            }
        });
        builder.show();
    }
}
