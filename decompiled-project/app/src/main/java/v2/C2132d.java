package v2;

import Q.W;
import W1.S;
import W1.U;
import Y5.C0656w;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.kt.apps.core.utils.AnimationUtilsKt;
import com.kt.apps.media.xemtv.ui.main.MainActivity;
import java.util.ArrayList;
import java.util.List;
import l2.EnumC1474s;
import l2.a0;
import va.C;
import va.C2165i;
import y9.AbstractC2463f;
import y9.C2462e;

/* renamed from: v2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2132d implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24965b;

    public /* synthetic */ C2132d(Object obj, int i7) {
        this.f24964a = i7;
        this.f24965b = obj;
    }

    @Override // Rb.a
    public final Object invoke() {
        Db.q qVar = Db.q.f3365a;
        Object obj = this.f24965b;
        switch (this.f24964a) {
            case 0:
                y2.c cVar = ((C2133e) obj).f24973v;
                if (!cVar.f26755i) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (cVar.j.f19242d == EnumC1474s.f19227a) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                return ((y2.b) C0656w.e(cVar.f26748a, (a0) cVar.f26757m.getValue(), 4).a(kotlin.jvm.internal.w.a(y2.b.class))).f26747a;
            case 1:
                C2165i c2165i = (C2165i) obj;
                if (!c2165i.f10272P) {
                    U j = c2165i.g0().j();
                    j.getClass();
                    j.y(new S(j, -1, 0), false);
                }
                return qVar;
            case 2:
                Parcelable parcelable = ((va.u) obj).h0().getParcelable("extra:extensions_id");
                kotlin.jvm.internal.l.b(parcelable);
                return (M9.d) parcelable;
            case 3:
                int i7 = C.f25269v2;
                Parcelable parcelable2 = ((C) obj).h0().getParcelable("extra:extension_id");
                kotlin.jvm.internal.l.b(parcelable2);
                return (M9.d) parcelable2;
            case 4:
                List list = (List) ((W) obj).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (kotlin.jvm.internal.l.a(((C2133e) obj2).f24967b.f25016a, "composable")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 5:
                return new o((String) obj);
            case 6:
                return new C2462e((AbstractC2463f) obj);
            default:
                MainActivity mainActivity = (MainActivity) obj;
                TextView textView = mainActivity.f16204d0;
                if (textView != null) {
                    textView.setText((CharSequence) null);
                }
                View view = mainActivity.f16203c0;
                if (view != null) {
                    AnimationUtilsKt.inVisible(view);
                }
                return qVar;
        }
    }
}
