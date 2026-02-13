package S4;

import P4.r;
import android.net.Uri;
import java.io.IOException;
import m5.InterfaceC1601E;
import m5.InterfaceC1603G;
import m5.J;
import m5.M;
import m5.S;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class f implements InterfaceC1601E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f9092a;

    public /* synthetic */ f(h hVar) {
        this.f9092a = hVar;
    }

    @Override // m5.InterfaceC1601E
    public D4.e e(InterfaceC1603G interfaceC1603G, long j, long j10, IOException iOException, int i7) {
        M m10 = (M) interfaceC1603G;
        h hVar = this.f9092a;
        hVar.getClass();
        long j11 = m10.f20555a;
        S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        hVar.f9099F.w(new r(s3.f20582d), m10.f20557c, iOException, true);
        hVar.f9095B.getClass();
        AbstractC1705a.u("DashMediaSource", "Failed to resolve time offset.", iOException);
        hVar.y(true);
        return J.f20550e;
    }

    @Override // m5.InterfaceC1601E
    public void m(InterfaceC1603G interfaceC1603G, long j, long j10, boolean z8) {
        this.f9092a.x((M) interfaceC1603G);
    }

    @Override // m5.InterfaceC1601E
    public void t(InterfaceC1603G interfaceC1603G, long j, long j10) {
        M m10 = (M) interfaceC1603G;
        h hVar = this.f9092a;
        hVar.getClass();
        long j11 = m10.f20555a;
        S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        hVar.f9095B.getClass();
        hVar.f9099F.s(rVar, m10.f20557c);
        hVar.f9119a0 = ((Long) m10.f20560f).longValue() - j;
        hVar.y(true);
    }
}
