package i2;

import A9.C0;
import Y5.C0660y;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kt.apps.media.xemtv.beta.R;
import d2.C1042b;
import e3.RunnableC1077b;
import h6.ViewOnLayoutChangeListenerC1254a;

/* renamed from: i2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1324l extends C9.h {

    /* renamed from: b, reason: collision with root package name */
    public AbstractC1304L f18273b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18274c;

    /* renamed from: d, reason: collision with root package name */
    public int f18275d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18276e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18277f;

    /* renamed from: u, reason: collision with root package name */
    public float f18278u;

    /* renamed from: v, reason: collision with root package name */
    public final C1042b f18279v;

    /* renamed from: w, reason: collision with root package name */
    public final FrameLayout f18280w;

    /* renamed from: x, reason: collision with root package name */
    public final ViewGroup f18281x;

    /* renamed from: y, reason: collision with root package name */
    public final int f18282y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C1325m f18283z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1324l(C1325m c1325m, View view) {
        super(view);
        this.f18283z = c1325m;
        this.f18275d = 0;
        this.f18278u = 0.0f;
        this.f18279v = C1042b.a(view.getContext());
        this.f18282y = 0;
        new RunnableC1077b(this, 1);
        new ViewOnLayoutChangeListenerC1254a(this, 2);
        new C0660y(this, 10);
        new C0(this, 4);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.details_frame);
        this.f18280w = frameLayout;
        this.f18281x = (ViewGroup) view.findViewById(R.id.details_overview_description);
        frameLayout.findViewById(R.id.details_overview_actions).getClass();
        throw new ClassCastException();
    }
}
