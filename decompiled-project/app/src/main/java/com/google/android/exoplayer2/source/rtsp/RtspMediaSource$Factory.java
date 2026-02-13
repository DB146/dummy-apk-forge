package com.google.android.exoplayer2.source.rtsp;

import P4.A;
import W4.u;
import h8.e;
import javax.net.SocketFactory;
import m4.C1558a0;

/* loaded from: classes.dex */
public final class RtspMediaSource$Factory implements A {

    /* renamed from: a, reason: collision with root package name */
    public final SocketFactory f14726a = SocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    public boolean f14727b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // P4.A
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u a(C1558a0 c1558a0) {
        c1558a0.f20224b.getClass();
        return new u(c1558a0, this.f14727b ? new Object() : new e(16), this.f14726a);
    }
}
