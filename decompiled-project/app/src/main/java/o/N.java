package o;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class N extends n1.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21412h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21413i;
    public final /* synthetic */ WeakReference j;
    public final /* synthetic */ S k;

    public N(S s3, int i7, int i10, WeakReference weakReference) {
        this.k = s3;
        this.f21412h = i7;
        this.f21413i = i10;
        this.j = weakReference;
    }

    @Override // n1.b
    public final void i(int i7) {
    }

    @Override // n1.b
    public final void j(Typeface typeface) {
        int i7;
        if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f21412h) != -1) {
            typeface = Q.a(typeface, i7, (this.f21413i & 2) != 0);
        }
        S s3 = this.k;
        if (s3.f21430m) {
            s3.f21429l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new i6.b(textView, typeface, s3.j, 2));
                } else {
                    textView.setTypeface(typeface, s3.j);
                }
            }
        }
    }
}
