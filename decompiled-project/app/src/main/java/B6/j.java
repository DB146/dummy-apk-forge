package B6;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f2128a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f2129b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2130c;

    /* renamed from: d, reason: collision with root package name */
    public int f2131d;

    /* renamed from: e, reason: collision with root package name */
    public View f2132e;

    /* renamed from: f, reason: collision with root package name */
    public o f2133f;
    public m g;

    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.f2130c) && !TextUtils.isEmpty(charSequence)) {
            this.g.setContentDescription(charSequence);
        }
        this.f2129b = charSequence;
        m mVar = this.g;
        if (mVar != null) {
            mVar.e();
        }
    }
}
