package r6;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;
import y6.C2401g;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1944a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f23797a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShapeableImageView f23798b;

    public C1944a(ShapeableImageView shapeableImageView) {
        this.f23798b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f23798b;
        if (shapeableImageView.f15400z == null) {
            return;
        }
        if (shapeableImageView.f15399y == null) {
            shapeableImageView.f15399y = new C2401g(shapeableImageView.f15400z);
        }
        RectF rectF = shapeableImageView.f15393e;
        Rect rect = this.f23797a;
        rectF.round(rect);
        shapeableImageView.f15399y.setBounds(rect);
        shapeableImageView.f15399y.getOutline(outline);
    }
}
