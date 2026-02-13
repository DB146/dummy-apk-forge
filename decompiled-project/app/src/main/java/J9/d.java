package J9;

import J1.k;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.VerticalGridView;

/* loaded from: classes2.dex */
public abstract class d extends k {

    /* renamed from: C, reason: collision with root package name */
    public final FrameLayout f5746C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f5747D;

    /* renamed from: E, reason: collision with root package name */
    public final h f5748E;

    /* renamed from: F, reason: collision with root package name */
    public final VerticalGridView f5749F;

    /* renamed from: G, reason: collision with root package name */
    public J1.f f5750G;

    public d(J1.d dVar, View view, FrameLayout frameLayout, TextView textView, h hVar, VerticalGridView verticalGridView) {
        super(dVar, view, 2);
        this.f5746C = frameLayout;
        this.f5747D = textView;
        this.f5748E = hVar;
        this.f5749F = verticalGridView;
    }
}
