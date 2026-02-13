package W4;

import android.net.Uri;
import java.net.DatagramSocket;
import java.util.Locale;
import m5.C1619p;
import m5.T;
import m5.U;
import m5.V;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class I implements InterfaceC0587e {

    /* renamed from: a, reason: collision with root package name */
    public final V f10658a = new V(2000, h3.H.f(8000));

    /* renamed from: b, reason: collision with root package name */
    public I f10659b;

    @Override // W4.InterfaceC0587e
    public final G B() {
        return null;
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        try {
            return this.f10658a.D(bArr, i7, i10);
        } catch (U e2) {
            if (e2.f20621a == 2002) {
                return -1;
            }
            throw e2;
        }
    }

    @Override // m5.InterfaceC1616m
    public final void a(T t5) {
        this.f10658a.a(t5);
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        this.f10658a.close();
        I i7 = this.f10659b;
        if (i7 != null) {
            i7.close();
        }
    }

    @Override // m5.InterfaceC1616m
    public final long d(C1619p c1619p) {
        this.f10658a.d(c1619p);
        return -1L;
    }

    @Override // W4.InterfaceC0587e
    public final String e() {
        int j = j();
        AbstractC1705a.m(j != -1);
        int i7 = n5.D.f21141a;
        Locale locale = Locale.US;
        return X.c.e(j, 1 + j, "RTP/AVP;unicast;client_port=", "-");
    }

    @Override // W4.InterfaceC0587e
    public final int j() {
        DatagramSocket datagramSocket = this.f10658a.f20588w;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // W4.InterfaceC0587e
    public final boolean t() {
        return true;
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        return this.f10658a.f20587v;
    }
}
