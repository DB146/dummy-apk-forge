package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: o.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1771z extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C1767x f21650a;

    public C1771z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        K0.a(getContext(), this);
        C1767x c1767x = new C1767x(this);
        this.f21650a = c1767x;
        c1767x.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Bitmap bitmap = (Bitmap) this.f21650a.f21617c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i7, 0), getMeasuredHeight());
        }
    }
}
