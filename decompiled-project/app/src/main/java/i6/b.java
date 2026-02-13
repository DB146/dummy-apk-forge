package i6;

import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18432a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18433b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18434c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18435d;

    public b(BottomSheetBehavior bottomSheetBehavior, View view, int i7) {
        this.f18432a = 0;
        this.f18435d = bottomSheetBehavior;
        this.f18434c = view;
        this.f18433b = i7;
    }

    public /* synthetic */ b(Object obj, Object obj2, int i7, int i10) {
        this.f18432a = i10;
        this.f18434c = obj;
        this.f18435d = obj2;
        this.f18433b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18432a) {
            case 0:
                ((BottomSheetBehavior) this.f18435d).L((View) this.f18434c, this.f18433b, false);
                return;
            case 1:
                Intent intent = (Intent) this.f18435d;
                ((k3.h) this.f18434c).a(this.f18433b, intent);
                return;
            default:
                ((TextView) this.f18434c).setTypeface((Typeface) this.f18435d, this.f18433b);
                return;
        }
    }
}
