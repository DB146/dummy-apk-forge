package W4;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import m5.AbstractC1610g;
import m5.C1619p;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class G extends AbstractC1610g implements InterfaceC0587e {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f10654e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10655f;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f10656u;

    /* renamed from: v, reason: collision with root package name */
    public int f10657v;

    public G() {
        super(true);
        this.f10655f = 8000L;
        this.f10654e = new LinkedBlockingQueue();
        this.f10656u = new byte[0];
        this.f10657v = -1;
    }

    @Override // W4.InterfaceC0587e
    public final G B() {
        return this;
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int min = Math.min(i10, this.f10656u.length);
        System.arraycopy(this.f10656u, 0, bArr, i7, min);
        byte[] bArr2 = this.f10656u;
        this.f10656u = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i10) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.f10654e.poll(this.f10655f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i10 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i7 + min, min2);
            if (min2 < bArr3.length) {
                this.f10656u = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
    }

    @Override // m5.InterfaceC1616m
    public final long d(C1619p c1619p) {
        this.f10657v = c1619p.f20628a.getPort();
        return -1L;
    }

    @Override // W4.InterfaceC0587e
    public final String e() {
        AbstractC1705a.m(this.f10657v != -1);
        int i7 = this.f10657v;
        int i10 = this.f10657v + 1;
        int i11 = n5.D.f21141a;
        Locale locale = Locale.US;
        return X.c.e(i7, i10, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // W4.InterfaceC0587e
    public final int j() {
        return this.f10657v;
    }

    @Override // W4.InterfaceC0587e
    public final boolean t() {
        return false;
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        return null;
    }
}
