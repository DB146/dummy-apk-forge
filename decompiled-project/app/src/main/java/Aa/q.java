package Aa;

import H2.K;
import W1.C0558a;
import W1.S;
import W1.U;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.media.xemtv.beta.R;
import hb.C1268a;
import k5.C1429h;
import l5.B;
import l5.C1502p;
import l5.G;
import m4.C1549C;
import m4.x0;
import n5.D;
import va.C2165i;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1533b;

    public /* synthetic */ q(Object obj, int i7) {
        this.f1532a = i7;
        this.f1533b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RecyclerView recyclerView;
        K adapter;
        int J10;
        int i7 = -1;
        Object obj = this.f1533b;
        switch (this.f1532a) {
            case 0:
                ((View) obj).requestFocus();
                return;
            case 1:
                Ba.s sVar = (Ba.s) obj;
                C1268a c1268a = sVar.f2292g1;
                La.g gVar = sVar.f2276Q0;
                if (gVar == null) {
                    kotlin.jvm.internal.l.j("voiceSelectorManager");
                    throw null;
                }
                qb.r d10 = gVar.d(com.bumptech.glide.c.e());
                qb.b bVar = new qb.b(Ba.p.f2270d, lb.b.f19616e);
                d10.b(bVar);
                c1268a.d(bVar);
                return;
            case 2:
                C6.c cVar = (C6.c) obj;
                EditText editText = cVar.f2925i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                cVar.q();
                return;
            case 3:
                ((C6.i) obj).u();
                return;
            case 4:
                C6.t tVar = (C6.t) obj;
                EditText editText2 = tVar.f3020f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = tVar.f3020f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    tVar.f3020f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    tVar.f3020f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    tVar.f3020f.setSelection(selectionEnd);
                }
                tVar.q();
                return;
            case 5:
                U j = ((Da.k) obj).g0().j();
                j.getClass();
                j.y(new S(j, -1, 0), false);
                return;
            case 6:
                ((com.google.android.material.datepicker.n) obj).u0();
                throw null;
            case 7:
                B.a((B) obj);
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                B b2 = ((C1502p) obj).g;
                x0 x0Var = b2.f19322v0;
                if (x0Var == null || !((C9.h) x0Var).o(29)) {
                    return;
                }
                k5.i f02 = ((C1549C) b2.f19322v0).f0();
                x0 x0Var2 = b2.f19322v0;
                int i10 = D.f21141a;
                f02.getClass();
                C1429h c1429h = new C1429h(f02);
                c1429h.a(1);
                c1429h.e(1);
                ((C1549C) x0Var2).u0(new k5.i(c1429h));
                b2.f19303f.f19548e[1] = b2.getResources().getString(R.string.exo_track_selection_auto);
                b2.f19327y.dismiss();
                return;
            case 9:
                l5.v vVar = (l5.v) obj;
                if (vVar.f4722s != null && (recyclerView = vVar.f4721r) != null && (adapter = recyclerView.getAdapter()) != null && (J10 = vVar.f4721r.J(vVar)) != -1 && vVar.f4722s == adapter) {
                    i7 = J10;
                }
                B b10 = vVar.f19546x;
                View view2 = b10.f19283N;
                if (i7 == 0) {
                    view2.getClass();
                    b10.e(b10.f19319u, view2);
                    return;
                } else if (i7 != 1) {
                    b10.f19327y.dismiss();
                    return;
                } else {
                    view2.getClass();
                    b10.e(b10.f19323w, view2);
                    return;
                }
            case 10:
                B b11 = ((C1502p) obj).g;
                x0 x0Var3 = b11.f19322v0;
                if (x0Var3 == null || !((C9.h) x0Var3).o(29)) {
                    return;
                }
                k5.i f03 = ((C1549C) b11.f19322v0).f0();
                x0 x0Var4 = b11.f19322v0;
                f03.getClass();
                C1429h c1429h2 = new C1429h(f03);
                c1429h2.a(3);
                c1429h2.f18986u = -3;
                ((C1549C) x0Var4).u0(new k5.i(c1429h2));
                b11.f19327y.dismiss();
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                G g = (G) obj;
                g.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    g.f19356q.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        g.f19357r.start();
                        return;
                    }
                    return;
                }
            case 12:
                ((C2165i) obj).F0();
                return;
            default:
                U j10 = ((va.r) obj).g0().j();
                j10.getClass();
                C0558a c0558a = new C0558a(j10);
                c0558a.f10410d = R.anim.fade_in;
                c0558a.f10411e = R.anim.fade_out;
                c0558a.f10412f = R.anim.fade_in;
                c0558a.g = R.anim.fade_out;
                c0558a.g(android.R.id.content, new C2165i(), va.r.class.getName(), 1);
                c0558a.c(va.r.class.getName());
                c0558a.e(false);
                return;
        }
    }
}
