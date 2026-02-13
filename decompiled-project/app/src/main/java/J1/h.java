package J1;

import android.view.View;
import com.kt.apps.media.xemtv.beta.R;
import java.util.WeakHashMap;
import y1.AbstractC2377z;
import y1.K;

/* loaded from: classes.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5424a;

    public /* synthetic */ h(int i7) {
        this.f5424a = i7;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f5424a) {
            case 0:
                (view != null ? (k) view.getTag(R.id.dataBinding) : null).f5431b.run();
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = K.f26642a;
                AbstractC2377z.c(view);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i7 = this.f5424a;
    }
}
