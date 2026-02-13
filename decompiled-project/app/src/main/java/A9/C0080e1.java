package A9;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0080e1 extends H2.i0 implements InterfaceC0150w0 {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f1113A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f1114B;

    /* renamed from: C, reason: collision with root package name */
    public int f1115C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f1116D;

    /* renamed from: E, reason: collision with root package name */
    public Animator f1117E;

    /* renamed from: u, reason: collision with root package name */
    public P0 f1118u;

    /* renamed from: v, reason: collision with root package name */
    public final View f1119v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f1120w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f1121x;

    /* renamed from: y, reason: collision with root package name */
    public final View f1122y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f1123z;

    public C0080e1(View view, boolean z8) {
        super(view);
        this.f1115C = 0;
        C0072c1 c0072c1 = new C0072c1(this, 0);
        this.f1119v = view.findViewById(R.id.guidedactions_item_content);
        this.f1120w = (TextView) view.findViewById(R.id.guidedactions_item_title);
        this.f1122y = view.findViewById(R.id.guidedactions_activator_item);
        this.f1121x = (TextView) view.findViewById(R.id.guidedactions_item_description);
        this.f1123z = (ImageView) view.findViewById(R.id.guidedactions_item_icon);
        this.f1113A = (ImageView) view.findViewById(R.id.guidedactions_item_checkmark);
        this.f1114B = (ImageView) view.findViewById(R.id.guidedactions_item_chevron);
        this.f1116D = z8;
        view.setAccessibilityDelegate(c0072c1);
    }

    @Override // A9.InterfaceC0150w0
    public final Object b() {
        return C0084f1.f1138u;
    }

    public final void t(boolean z8) {
        Animator animator = this.f1117E;
        if (animator != null) {
            animator.cancel();
            this.f1117E = null;
        }
        int i7 = z8 ? R.attr.guidedActionPressedAnimation : R.attr.guidedActionUnpressedAnimation;
        View view = this.f4707a;
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i7, typedValue, true)) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, typedValue.resourceId);
            this.f1117E = loadAnimator;
            loadAnimator.setTarget(view);
            this.f1117E.addListener(new C0076d1(this, 0));
            this.f1117E.start();
        }
    }
}
