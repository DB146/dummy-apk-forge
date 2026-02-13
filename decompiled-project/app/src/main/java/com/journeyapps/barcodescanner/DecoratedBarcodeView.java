package com.journeyapps.barcodescanner;

import T8.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import p9.k;
import p9.n;
import q9.i;

/* loaded from: classes2.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeView f15893a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewfinderView f15894b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f15895c;

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f9382c);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.f15893a = barcodeView;
        if (barcodeView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        }
        barcodeView.b(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
        this.f15894b = viewfinderView;
        if (viewfinderView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        viewfinderView.setCameraPreview(this.f15893a);
        this.f15895c = (TextView) findViewById(R.id.zxing_status_view);
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public i getCameraSettings() {
        return this.f15893a.getCameraSettings();
    }

    public k getDecoderFactory() {
        return this.f15893a.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f15895c;
    }

    public ViewfinderView getViewFinder() {
        return this.f15894b;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 == 24) {
            this.f15893a.setTorch(true);
            return true;
        }
        if (i7 == 25) {
            this.f15893a.setTorch(false);
            return true;
        }
        if (i7 == 27 || i7 == 80) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    public void setCameraSettings(i iVar) {
        this.f15893a.setCameraSettings(iVar);
    }

    public void setDecoderFactory(k kVar) {
        this.f15893a.setDecoderFactory(kVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f15895c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(n nVar) {
    }
}
