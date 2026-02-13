package n1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f21042a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f21043b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21044c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f21042a = colorStateList;
        this.f21043b = configuration;
        this.f21044c = theme == null ? 0 : theme.hashCode();
    }
}
