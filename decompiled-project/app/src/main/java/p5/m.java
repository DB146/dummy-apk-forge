package p5;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC1852c {

    /* renamed from: c, reason: collision with root package name */
    public final k f23114c;

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f23116e;

    /* renamed from: a, reason: collision with root package name */
    public final PointF f23112a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public final PointF f23113b = new PointF();

    /* renamed from: d, reason: collision with root package name */
    public final float f23115d = 25.0f;

    /* renamed from: f, reason: collision with root package name */
    public volatile float f23117f = 3.1415927f;

    public m(Context context, k kVar) {
        this.f23114c = kVar;
        this.f23116e = new GestureDetector(context, this);
    }

    @Override // p5.InterfaceC1852c
    public final void a(float[] fArr, float f4) {
        this.f23117f = -f4;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f23112a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f10) {
        float x2 = (motionEvent2.getX() - this.f23112a.x) / this.f23115d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f23112a;
        float f11 = (y10 - pointF.y) / this.f23115d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f23117f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f23113b;
        pointF2.x -= (cos * x2) - (sin * f11);
        float f12 = (cos * f11) + (sin * x2) + pointF2.y;
        pointF2.y = f12;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f12));
        k kVar = this.f23114c;
        PointF pointF3 = this.f23113b;
        synchronized (kVar) {
            float f13 = pointF3.y;
            kVar.f23095u = f13;
            Matrix.setRotateM(kVar.f23093e, 0, -f13, (float) Math.cos(kVar.f23096v), (float) Math.sin(kVar.f23096v), 0.0f);
            Matrix.setRotateM(kVar.f23094f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f23114c.f23099y.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f23116e.onTouchEvent(motionEvent);
    }
}
