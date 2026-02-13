package p2;

import Q.C0506o;
import Q.C0523z;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.kt.apps.core.utils.l;
import l2.Q;
import l2.e0;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1846a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0523z f23034a = new C0523z(new l(17));

    public static e0 a(C0506o c0506o) {
        e0 e0Var = (e0) c0506o.k(f23034a);
        if (e0Var == null) {
            c0506o.S(1260197609);
            e0Var = Q.e((View) c0506o.k(AndroidCompositionLocals_androidKt.f13211f));
        } else {
            c0506o.S(1260196493);
        }
        c0506o.p(false);
        return e0Var;
    }
}
