package I9;

import M9.t;
import h3.H;
import java.util.regex.Pattern;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import kotlin.jvm.internal.l;
import va.C2161e;
import y9.D;

/* loaded from: classes2.dex */
public final class f implements InterfaceC1393d, InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2161e f5321a;

    public /* synthetic */ f(C2161e c2161e) {
        this.f5321a = c2161e;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        Throwable it = (Throwable) obj;
        l.e(it, "it");
        C2161e c2161e = this.f5321a;
        c2161e.get_listProgramForChannel().l(new D(H.A(2, it)));
        A3.c.r(it, c2161e.get_programmeForChannelLiveData());
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        M9.d it = (M9.d) obj;
        l.e(it, "it");
        t tVar = this.f5321a.f25314a;
        Pattern pattern = t.f6903i;
        return tVar.i(it);
    }
}
