package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import g1.e;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13234a;

    public Guideline(Context context) {
        super(context);
        this.f13234a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13234a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z8) {
        this.f13234a = z8;
    }

    public void setGuidelineBegin(int i7) {
        e eVar = (e) getLayoutParams();
        if (this.f13234a && eVar.f17263a == i7) {
            return;
        }
        eVar.f17263a = i7;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i7) {
        e eVar = (e) getLayoutParams();
        if (this.f13234a && eVar.f17265b == i7) {
            return;
        }
        eVar.f17265b = i7;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f4) {
        e eVar = (e) getLayoutParams();
        if (this.f13234a && eVar.f17267c == f4) {
            return;
        }
        eVar.f17267c = f4;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
    }
}
