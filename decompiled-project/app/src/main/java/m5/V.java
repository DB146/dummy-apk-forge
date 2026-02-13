package m5;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class V extends AbstractC1610g {

    /* renamed from: A, reason: collision with root package name */
    public int f20583A;

    /* renamed from: e, reason: collision with root package name */
    public final int f20584e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f20585f;

    /* renamed from: u, reason: collision with root package name */
    public final DatagramPacket f20586u;

    /* renamed from: v, reason: collision with root package name */
    public Uri f20587v;

    /* renamed from: w, reason: collision with root package name */
    public DatagramSocket f20588w;

    /* renamed from: x, reason: collision with root package name */
    public MulticastSocket f20589x;

    /* renamed from: y, reason: collision with root package name */
    public InetAddress f20590y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20591z;

    public V(int i7, int i10) {
        super(true);
        this.f20584e = i10;
        byte[] bArr = new byte[i7];
        this.f20585f = bArr;
        this.f20586u = new DatagramPacket(bArr, 0, i7);
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f20583A;
        DatagramPacket datagramPacket = this.f20586u;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.f20588w;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f20583A = length;
                b(length);
            } catch (SocketTimeoutException e2) {
                throw new C1617n(2002, e2);
            } catch (IOException e10) {
                throw new C1617n(2001, e10);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f20583A;
        int min = Math.min(i12, i10);
        System.arraycopy(this.f20585f, length2 - i12, bArr, i7, min);
        this.f20583A -= min;
        return min;
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        this.f20587v = null;
        MulticastSocket multicastSocket = this.f20589x;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f20590y;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f20589x = null;
        }
        DatagramSocket datagramSocket = this.f20588w;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f20588w = null;
        }
        this.f20590y = null;
        this.f20583A = 0;
        if (this.f20591z) {
            this.f20591z = false;
            c();
        }
    }

    @Override // m5.InterfaceC1616m
    public final long d(C1619p c1619p) {
        Uri uri = c1619p.f20628a;
        this.f20587v = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f20587v.getPort();
        f();
        try {
            this.f20590y = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f20590y, port);
            if (this.f20590y.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f20589x = multicastSocket;
                multicastSocket.joinGroup(this.f20590y);
                this.f20588w = this.f20589x;
            } else {
                this.f20588w = new DatagramSocket(inetSocketAddress);
            }
            this.f20588w.setSoTimeout(this.f20584e);
            this.f20591z = true;
            g(c1619p);
            return -1L;
        } catch (IOException e2) {
            throw new C1617n(2001, e2);
        } catch (SecurityException e10) {
            throw new C1617n(2006, e10);
        }
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        return this.f20587v;
    }
}
