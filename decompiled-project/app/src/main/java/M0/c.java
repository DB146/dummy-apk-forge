package M0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z8, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i14)) != layout.getLineCount() - 1) {
            return;
        }
        L0.i iVar = L0.k.f6261a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float v10 = tc.b.v(layout, lineForOffset, paint) + tc.b.u(layout, lineForOffset, paint);
            if (v10 == 0.0f) {
                return;
            }
            l.b(canvas);
            canvas.translate(v10, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z8) {
        return 0;
    }
}
