package v2;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

@z("activity")
/* renamed from: v2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2130b extends AbstractC2127A {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f24963c;

    public C2130b(Context context) {
        Object obj;
        kotlin.jvm.internal.l.e(context, "context");
        Iterator it = Zb.i.N(context, new Ba.i(13)).iterator();
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
        this.f24963c = (Activity) obj;
    }

    @Override // v2.AbstractC2127A
    public final q a() {
        return new q(this);
    }

    @Override // v2.AbstractC2127A
    public final q c(q qVar) {
        throw new IllegalStateException(A3.c.k(new StringBuilder("Destination "), ((C2129a) qVar).f25017b.f4638a, " does not have an Intent set.").toString());
    }

    @Override // v2.AbstractC2127A
    public final boolean f() {
        Activity activity = this.f24963c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
