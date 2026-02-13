package W4;

import N6.y0;
import android.net.Uri;
import android.util.SparseArray;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import javax.net.SocketFactory;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class n implements Closeable {

    /* renamed from: A */
    public n5.u f10728A;

    /* renamed from: B */
    public int f10729B;

    /* renamed from: C */
    public boolean f10730C;

    /* renamed from: D */
    public boolean f10731D;

    /* renamed from: E */
    public boolean f10732E;

    /* renamed from: F */
    public long f10733F;

    /* renamed from: a */
    public final R7.b f10734a;

    /* renamed from: b */
    public final R7.b f10735b;

    /* renamed from: c */
    public final String f10736c;

    /* renamed from: d */
    public final SocketFactory f10737d;

    /* renamed from: e */
    public final ArrayDeque f10738e = new ArrayDeque();

    /* renamed from: f */
    public final SparseArray f10739f = new SparseArray();

    /* renamed from: u */
    public final A4.s f10740u;

    /* renamed from: v */
    public Uri f10741v;

    /* renamed from: w */
    public y f10742w;

    /* renamed from: x */
    public T4.u f10743x;

    /* renamed from: y */
    public String f10744y;

    /* renamed from: z */
    public m f10745z;

    /* JADX WARN: Type inference failed for: r1v3, types: [A4.s, java.lang.Object] */
    public n(R7.b bVar, R7.b bVar2, String str, Uri uri, SocketFactory socketFactory) {
        this.f10734a = bVar;
        this.f10735b = bVar2;
        this.f10736c = str;
        this.f10737d = socketFactory;
        ?? obj = new Object();
        obj.f472c = this;
        this.f10740u = obj;
        this.f10741v = z.f(uri);
        this.f10742w = new y(new q3.s(this));
        this.f10743x = z.d(uri);
        this.f10733F = -9223372036854775807L;
        this.f10729B = -1;
    }

    public static void F(n nVar, A3.e eVar) {
        nVar.getClass();
        if (nVar.f10730C) {
            nVar.f10735b.v(eVar);
            return;
        }
        String message = eVar.getMessage();
        int i7 = M6.l.f6805a;
        if (message == null) {
            message = "";
        }
        nVar.f10734a.w(message, eVar);
    }

    public static /* synthetic */ SparseArray K(n nVar) {
        return nVar.f10739f;
    }

    public static /* synthetic */ A4.s l(n nVar) {
        return nVar.f10740u;
    }

    public static /* synthetic */ Uri n(n nVar) {
        return nVar.f10741v;
    }

    public final void P() {
        long Z7;
        q qVar = (q) this.f10738e.pollFirst();
        if (qVar == null) {
            s sVar = (s) this.f10735b.f8929b;
            long j = sVar.f10760B;
            if (j != -9223372036854775807L) {
                Z7 = n5.D.Z(j);
            } else {
                long j10 = sVar.f10761C;
                Z7 = j10 != -9223372036854775807L ? n5.D.Z(j10) : 0L;
            }
            sVar.f10772d.V(Z7);
            return;
        }
        Uri a9 = qVar.a();
        AbstractC1705a.n(qVar.f10751c);
        String str = qVar.f10751c;
        String str2 = this.f10744y;
        A4.s sVar2 = this.f10740u;
        ((n) sVar2.f472c).f10729B = 0;
        N6.r.d("Transport", str);
        sVar2.F(sVar2.n(10, str2, y0.c(1, new Object[]{"Transport", str}, null), a9));
    }

    public final Socket T(Uri uri) {
        AbstractC1705a.h(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.f10737d.createSocket(host, port);
    }

    public final void U(long j) {
        if (this.f10729B == 2 && !this.f10732E) {
            Uri uri = this.f10741v;
            String str = this.f10744y;
            str.getClass();
            A4.s sVar = this.f10740u;
            n nVar = (n) sVar.f472c;
            AbstractC1705a.m(nVar.f10729B == 2);
            sVar.F(sVar.n(5, str, y0.f7368u, uri));
            nVar.f10732E = true;
        }
        this.f10733F = j;
    }

    public final void V(long j) {
        Uri uri = this.f10741v;
        String str = this.f10744y;
        str.getClass();
        A4.s sVar = this.f10740u;
        int i7 = ((n) sVar.f472c).f10729B;
        AbstractC1705a.m(i7 == 1 || i7 == 2);
        B b2 = B.f10626c;
        Object[] objArr = {Double.valueOf(j / 1000.0d)};
        int i10 = n5.D.f21141a;
        sVar.F(sVar.n(6, str, y0.c(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m mVar = this.f10745z;
        if (mVar != null) {
            mVar.close();
            this.f10745z = null;
            Uri uri = this.f10741v;
            String str = this.f10744y;
            str.getClass();
            A4.s sVar = this.f10740u;
            n nVar = (n) sVar.f472c;
            int i7 = nVar.f10729B;
            if (i7 != -1 && i7 != 0) {
                nVar.f10729B = 0;
                sVar.F(sVar.n(12, str, y0.f7368u, uri));
            }
        }
        this.f10742w.close();
    }
}
