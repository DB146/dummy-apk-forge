package o5;

import android.os.Handler;
import android.os.Message;
import m4.C1581m;
import n5.D;

/* loaded from: classes.dex */
public final class h implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f21964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f21965b;

    public h(i iVar, E4.j jVar) {
        this.f21965b = iVar;
        Handler m10 = D.m(this);
        this.f21964a = m10;
        jVar.i(this, m10);
    }

    public final void a(long j) {
        i iVar = this.f21965b;
        if (this != iVar.f21998y1 || iVar.f3632W == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            iVar.f3616L0 = true;
            return;
        }
        try {
            iVar.s0(j);
            iVar.A0(iVar.f21994u1);
            iVar.f3620N0.f23452e++;
            iVar.z0();
            iVar.a0(j);
        } catch (C1581m e2) {
            iVar.f3618M0 = e2;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i7 = message.arg1;
        int i10 = message.arg2;
        int i11 = D.f21141a;
        a(((i7 & 4294967295L) << 32) | (4294967295L & i10));
        return true;
    }
}
