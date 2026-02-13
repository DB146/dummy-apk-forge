package v2;

import G3.C0283e;
import W1.K;
import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25025a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.f f25026b;

    /* renamed from: c, reason: collision with root package name */
    public final C0283e f25027c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f25028d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25029e;

    /* renamed from: f, reason: collision with root package name */
    public final K f25030f;
    public final boolean g;

    public u(Context context) {
        Object obj;
        kotlin.jvm.internal.l.e(context, "context");
        this.f25025a = context;
        this.f25026b = new y2.f(this, new C2135g(this, 0));
        this.f25027c = new C0283e(context, 6);
        Iterator it = Zb.i.N(context, new Ba.i(14)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f25028d = (Activity) obj;
        this.f25030f = new K(this, 2);
        this.g = true;
        C2128B c2128b = this.f25026b.f26780s;
        c2128b.a(new t(c2128b));
        this.f25026b.f26780s.a(new C2130b(this.f25025a));
        android.support.v4.media.session.b.z(new C2135g(this, 1));
    }
}
