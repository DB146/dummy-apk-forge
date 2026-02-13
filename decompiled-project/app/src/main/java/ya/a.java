package ya;

import A9.G;
import A9.H;
import android.content.Context;
import android.view.View;
import cc.F;
import cn.pedant.SweetAlert.SweetAlertDialog;
import com.kt.apps.core.base.leanback.NavDrawerView;
import com.kt.apps.core.utils.ActivityUtilsKt;
import f.InterfaceC1118b;
import java.util.Map;
import kotlin.jvm.internal.l;
import l2.Q;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC1118b, G, H, SweetAlertDialog.OnSweetClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f27550a;

    public /* synthetic */ a(j jVar) {
        this.f27550a = jVar;
    }

    @Override // A9.H
    public View c(View view, int i7) {
        boolean z8 = view instanceof NavDrawerView;
        j jVar = this.f27550a;
        if (z8 && i7 == 66) {
            return ((pa.i) jVar.o0()).f23239C;
        }
        if (i7 == 17) {
            return null;
        }
        return i7 != 33 ? i7 != 130 ? view : l.a(view, ((pa.i) jVar.o0()).f23239C) ? ((pa.i) jVar.o0()).f23240D : l.a(view, ((pa.i) jVar.o0()).f23240D) ? ((pa.i) jVar.o0()).f23243G : l.a(view, ((pa.i) jVar.o0()).f23243G) ? ((pa.i) jVar.o0()).f23242F : l.a(view, ((pa.i) jVar.o0()).f23242F) ? ((pa.i) jVar.o0()).f23245I : view : l.a(view, ((pa.i) jVar.o0()).f23240D) ? ((pa.i) jVar.o0()).f23239C : l.a(view, ((pa.i) jVar.o0()).f23243G) ? ((pa.i) jVar.o0()).f23240D : l.a(view, ((pa.i) jVar.o0()).f23242F) ? ((pa.i) jVar.o0()).f23243G : l.a(view, ((pa.i) jVar.o0()).f23245I) ? ((pa.i) jVar.o0()).f23242F : view;
    }

    @Override // f.InterfaceC1118b
    public void h(Object obj) {
        c cVar;
        Map it = (Map) obj;
        l.e(it, "it");
        j jVar = this.f27550a;
        Context C2 = jVar.C();
        if (C2 == null || true != ActivityUtilsKt.isPermissionWriteExternalStorageGranted(C2) || (cVar = jVar.f27570s0) == null) {
            return;
        }
        cVar.invoke();
    }

    @Override // cn.pedant.SweetAlert.SweetAlertDialog.OnSweetClickListener
    public void onClick(SweetAlertDialog sweetAlertDialog) {
        j jVar = this.f27550a;
        jVar.getClass();
        F.B(Q.f(jVar), null, 0, new i(jVar, null), 3);
    }
}
