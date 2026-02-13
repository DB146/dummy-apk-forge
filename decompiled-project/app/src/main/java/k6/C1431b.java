package k6;

import H2.Q;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q1.AbstractC1875a;

/* renamed from: k6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1431b extends Q {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f19024a;

    /* renamed from: b, reason: collision with root package name */
    public final List f19025b;

    public C1431b() {
        Paint paint = new Paint();
        this.f19024a = paint;
        this.f19025b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // H2.Q
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f19024a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f19025b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC1875a.f23339a;
            float f4 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f4)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f4)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f4)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f4))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).W0()) {
                canvas.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f15262q.y(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f15262q.r(), paint);
            } else {
                canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f15262q.t(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f15262q.u(), 0.0f, paint);
            }
        }
    }
}
