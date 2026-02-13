package B0;

import I2.C0330t;
import Q.C0518u0;
import android.view.View;
import cc.C0944m;
import cc.InterfaceC0942l;
import hc.C1277e;
import java.util.ArrayList;
import l2.InterfaceC1477v;
import l2.InterfaceC1479x;

/* loaded from: classes.dex */
public final class r1 implements InterfaceC1477v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1277e f1966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0186k0 f1967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0518u0 f1968c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f1969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f1970e;

    public r1(C1277e c1277e, C0186k0 c0186k0, C0518u0 c0518u0, kotlin.jvm.internal.v vVar, View view) {
        this.f1966a = c1277e;
        this.f1967b = c0186k0;
        this.f1968c = c0518u0;
        this.f1969d = vVar;
        this.f1970e = view;
    }

    @Override // l2.InterfaceC1477v
    public final void onStateChanged(InterfaceC1479x interfaceC1479x, l2.r rVar) {
        boolean z8;
        int i7 = o1.f1942a[rVar.ordinal()];
        InterfaceC0942l interfaceC0942l = null;
        if (i7 == 1) {
            cc.F.B(this.f1966a, null, 4, new q1(this.f1969d, this.f1968c, interfaceC1479x, this, this.f1970e, null), 1);
            return;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    return;
                }
                this.f1968c.t();
                return;
            } else {
                C0518u0 c0518u0 = this.f1968c;
                synchronized (c0518u0.f8543b) {
                    c0518u0.f8557s = true;
                }
                return;
            }
        }
        C0186k0 c0186k0 = this.f1967b;
        if (c0186k0 != null) {
            C0330t c0330t = (C0330t) c0186k0.f1927c;
            synchronized (c0330t.f5200b) {
                try {
                    synchronized (c0330t.f5200b) {
                        z8 = c0330t.f5199a;
                    }
                    if (!z8) {
                        ArrayList arrayList = (ArrayList) c0330t.f5201c;
                        c0330t.f5201c = (ArrayList) c0330t.f5202d;
                        c0330t.f5202d = arrayList;
                        c0330t.f5199a = true;
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((Hb.d) arrayList.get(i10)).resumeWith(Db.q.f3365a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0518u0 c0518u02 = this.f1968c;
        synchronized (c0518u02.f8543b) {
            if (c0518u02.f8557s) {
                c0518u02.f8557s = false;
                interfaceC0942l = c0518u02.u();
            }
        }
        if (interfaceC0942l != null) {
            ((C0944m) interfaceC0942l).resumeWith(Db.q.f3365a);
        }
    }
}
