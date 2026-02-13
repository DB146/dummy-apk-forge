package s6;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import m6.C1626b;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public float f24176c;

    /* renamed from: d, reason: collision with root package name */
    public float f24177d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f24179f;
    public v6.d g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f24174a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final C1626b f24175b = new C1626b(this, 1);

    /* renamed from: e, reason: collision with root package name */
    public boolean f24178e = true;

    public m(l lVar) {
        this.f24179f = new WeakReference(null);
        this.f24179f = new WeakReference(lVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f24174a;
        this.f24176c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f24177d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f24178e = false;
    }

    public final void b(v6.d dVar, Context context) {
        if (this.g != dVar) {
            this.g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f24174a;
                C1626b c1626b = this.f24175b;
                dVar.f(context, textPaint, c1626b);
                l lVar = (l) this.f24179f.get();
                if (lVar != null) {
                    textPaint.drawableState = lVar.getState();
                }
                dVar.e(context, textPaint, c1626b);
                this.f24178e = true;
            }
            l lVar2 = (l) this.f24179f.get();
            if (lVar2 != null) {
                lVar2.a();
                lVar2.onStateChange(lVar2.getState());
            }
        }
    }
}
