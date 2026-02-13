package com.journeyapps.barcodescanner;

import P8.p;
import T8.h;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.Iterator;
import p9.d;
import p9.e;
import p9.r;

/* loaded from: classes2.dex */
public class ViewfinderView extends View {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f15896z = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f15897a;

    /* renamed from: b, reason: collision with root package name */
    public int f15898b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15899c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15900d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15901e;

    /* renamed from: f, reason: collision with root package name */
    public int f15902f;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f15903u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f15904v;

    /* renamed from: w, reason: collision with root package name */
    public e f15905w;

    /* renamed from: x, reason: collision with root package name */
    public Rect f15906x;

    /* renamed from: y, reason: collision with root package name */
    public r f15907y;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15897a = new Paint(1);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f9381b);
        this.f15898b = obtainStyledAttributes.getColor(4, resources.getColor(R.color.zxing_viewfinder_mask));
        obtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        this.f15899c = obtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        this.f15900d = obtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        this.f15901e = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        this.f15902f = 0;
        this.f15903u = new ArrayList(20);
        this.f15904v = new ArrayList(20);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        r rVar;
        e eVar = this.f15905w;
        if (eVar != null) {
            Rect framingRect = eVar.getFramingRect();
            r previewSize = this.f15905w.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f15906x = framingRect;
                this.f15907y = previewSize;
            }
        }
        Rect rect = this.f15906x;
        if (rect == null || (rVar = this.f15907y) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        Paint paint = this.f15897a;
        paint.setColor(this.f15898b);
        float f4 = width;
        canvas.drawRect(0.0f, 0.0f, f4, rect.top, paint);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, paint);
        canvas.drawRect(rect.right + 1, rect.top, f4, rect.bottom + 1, paint);
        canvas.drawRect(0.0f, rect.bottom + 1, f4, height, paint);
        if (this.f15901e) {
            paint.setColor(this.f15899c);
            paint.setAlpha(f15896z[this.f15902f]);
            this.f15902f = (this.f15902f + 1) % 8;
            int height2 = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, height2 - 1, rect.right - 1, height2 + 2, paint);
        }
        float width2 = getWidth() / rVar.f23214a;
        float height3 = getHeight() / rVar.f23215b;
        boolean isEmpty = this.f15904v.isEmpty();
        int i7 = this.f15900d;
        if (!isEmpty) {
            paint.setAlpha(80);
            paint.setColor(i7);
            Iterator it = this.f15904v.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                canvas.drawCircle((int) (pVar.f8249a * width2), (int) (pVar.f8250b * height3), 3.0f, paint);
            }
            this.f15904v.clear();
        }
        if (!this.f15903u.isEmpty()) {
            paint.setAlpha(160);
            paint.setColor(i7);
            Iterator it2 = this.f15903u.iterator();
            while (it2.hasNext()) {
                p pVar2 = (p) it2.next();
                canvas.drawCircle((int) (pVar2.f8249a * width2), (int) (pVar2.f8250b * height3), 6.0f, paint);
            }
            ArrayList arrayList = this.f15903u;
            ArrayList arrayList2 = this.f15904v;
            this.f15903u = arrayList2;
            this.f15904v = arrayList;
            arrayList2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    public void setCameraPreview(e eVar) {
        this.f15905w = eVar;
        eVar.f23183x.add(new d(this, 2));
    }

    public void setLaserVisibility(boolean z8) {
        this.f15901e = z8;
    }

    public void setMaskColor(int i7) {
        this.f15898b = i7;
    }
}
