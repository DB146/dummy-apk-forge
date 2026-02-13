package A9;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kt.apps.core.base.leanback.HorizontalGridView;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class E0 extends C0152w2 {

    /* renamed from: o, reason: collision with root package name */
    public final D0 f804o;

    /* renamed from: p, reason: collision with root package name */
    public final FrameLayout f805p;

    /* renamed from: q, reason: collision with root package name */
    public final ViewGroup f806q;

    /* renamed from: r, reason: collision with root package name */
    public final HorizontalGridView f807r;

    /* renamed from: s, reason: collision with root package name */
    public final C0109l2 f808s;

    /* renamed from: t, reason: collision with root package name */
    public final C0103k0 f809t;

    /* renamed from: u, reason: collision with root package name */
    public int f810u;

    /* renamed from: v, reason: collision with root package name */
    public B0 f811v;

    /* renamed from: w, reason: collision with root package name */
    public int f812w;

    /* renamed from: x, reason: collision with root package name */
    public final RunnableC0102k f813x;

    /* renamed from: y, reason: collision with root package name */
    public final ViewOnLayoutChangeListenerC0062a f814y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ F0 f815z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, A9.D0] */
    public E0(F0 f02, View view, C0107l0 c0107l0, C0107l0 c0107l02) {
        super(view);
        this.f815z = f02;
        this.f804o = new Object();
        this.f812w = 0;
        this.f813x = new RunnableC0102k(this, 4);
        this.f814y = new ViewOnLayoutChangeListenerC0062a(this, 1);
        C0162z0 c0162z0 = new C0162z0(this);
        C0 c02 = new C0(this, 0);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.details_root);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.details_frame);
        this.f805p = frameLayout;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.details_overview_description);
        this.f806q = viewGroup2;
        HorizontalGridView horizontalGridView = (HorizontalGridView) frameLayout.findViewById(R.id.details_overview_actions);
        this.f807r = horizontalGridView;
        horizontalGridView.setHasOverlappingRendering(false);
        horizontalGridView.setOnScrollListener(c02);
        horizontalGridView.setAdapter(this.f811v);
        horizontalGridView.setOnChildSelectedListener(c0162z0);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.lb_details_overview_actions_fade_size);
        horizontalGridView.setFadingRightEdgeLength(dimensionPixelSize);
        horizontalGridView.setFadingLeftEdgeLength(dimensionPixelSize);
        C0109l2 d10 = c0107l0.d(viewGroup2);
        this.f808s = d10;
        viewGroup2.addView(d10.f1271a);
        C0103k0 c0103k0 = (C0103k0) c0107l02.d(viewGroup);
        this.f809t = c0103k0;
        viewGroup.addView(c0103k0.f1271a);
    }

    public final void c() {
        int i7 = this.f810u - 1;
        HorizontalGridView horizontalGridView = this.f807r;
        H2.i0 I6 = horizontalGridView.I(i7, false);
        if (I6 != null) {
            I6.f4707a.getRight();
            horizontalGridView.getWidth();
        }
        H2.i0 I10 = horizontalGridView.I(0, false);
        if (I10 != null) {
            I10.f4707a.getLeft();
        }
    }
}
