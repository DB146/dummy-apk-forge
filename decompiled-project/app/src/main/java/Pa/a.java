package Pa;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8259a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8260b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f8261c;

    /* renamed from: d, reason: collision with root package name */
    public final Intent f8262d;

    public a(String str, String appName, Drawable drawable, Intent intent) {
        l.e(appName, "appName");
        this.f8259a = str;
        this.f8260b = appName;
        this.f8261c = drawable;
        this.f8262d = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f8259a, aVar.f8259a) && l.a(this.f8260b, aVar.f8260b) && l.a(this.f8261c, aVar.f8261c) && l.a(this.f8262d, aVar.f8262d);
    }

    public final int hashCode() {
        int d10 = A3.c.d(this.f8259a.hashCode() * 31, 31, this.f8260b);
        Drawable drawable = this.f8261c;
        int hashCode = (d10 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Intent intent = this.f8262d;
        return hashCode + (intent != null ? intent.hashCode() : 0);
    }

    public final String toString() {
        return "AppInfo(packageName=" + this.f8259a + ", appName=" + this.f8260b + ", icon=" + this.f8261c + ", launchIntent=" + this.f8262d + ")";
    }
}
