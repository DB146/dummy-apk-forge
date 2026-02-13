package t6;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import c.C0857a;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: t6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2029a {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f24492a;

    /* renamed from: b, reason: collision with root package name */
    public final View f24493b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24494c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24495d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24496e;

    /* renamed from: f, reason: collision with root package name */
    public C0857a f24497f;

    public AbstractC2029a(View view) {
        this.f24493b = view;
        Context context = view.getContext();
        this.f24492a = Tb.a.E(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        this.f24494c = Tb.a.D(context, R.attr.motionDurationMedium2, 300);
        this.f24495d = Tb.a.D(context, R.attr.motionDurationShort3, 150);
        this.f24496e = Tb.a.D(context, R.attr.motionDurationShort2, 100);
    }
}
