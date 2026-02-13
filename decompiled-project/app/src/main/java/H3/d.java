package H3;

import A3.l;
import G3.r;
import G3.s;
import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes.dex */
public final class d implements s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4881a;

    /* renamed from: b, reason: collision with root package name */
    public final s f4882b;

    /* renamed from: c, reason: collision with root package name */
    public final s f4883c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f4884d;

    public d(Context context, s sVar, s sVar2, Class cls) {
        this.f4881a = context.getApplicationContext();
        this.f4882b = sVar;
        this.f4883c = sVar2;
        this.f4884d = cls;
    }

    @Override // G3.s
    public final r a(Object obj, int i7, int i10, l lVar) {
        Uri uri = (Uri) obj;
        return new r(new V3.d(uri), new c(this.f4881a, this.f4882b, this.f4883c, uri, i7, i10, lVar, this.f4884d));
    }

    @Override // G3.s
    public final boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && com.bumptech.glide.c.G((Uri) obj);
    }
}
