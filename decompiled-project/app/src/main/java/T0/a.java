package T0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import j0.AbstractC1362A;
import kotlin.jvm.internal.l;
import l0.AbstractC1444c;
import l0.AbstractC1448g;
import l0.C1447f;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1444c f9196a;

    public a(AbstractC1444c abstractC1444c) {
        this.f9196a = abstractC1444c;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C1447f c1447f = C1447f.f19147b;
            AbstractC1444c abstractC1444c = this.f9196a;
            if (l.a(abstractC1444c, c1447f)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC1444c instanceof AbstractC1448g) {
                textPaint.setStyle(Paint.Style.STROKE);
                ((AbstractC1448g) abstractC1444c).getClass();
                textPaint.setStrokeWidth(0.0f);
                textPaint.setStrokeMiter(0.0f);
                textPaint.setStrokeJoin(AbstractC1362A.n(0, 0) ? Paint.Join.MITER : AbstractC1362A.n(0, 1) ? Paint.Join.ROUND : AbstractC1362A.n(0, 2) ? Paint.Join.BEVEL : Paint.Join.MITER);
                textPaint.setStrokeCap(AbstractC1362A.m(0, 0) ? Paint.Cap.BUTT : AbstractC1362A.m(0, 1) ? Paint.Cap.ROUND : AbstractC1362A.m(0, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                textPaint.setPathEffect(null);
            }
        }
    }
}
