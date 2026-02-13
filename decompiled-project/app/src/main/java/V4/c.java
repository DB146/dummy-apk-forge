package V4;

import A4.s;
import P4.Y;
import P4.r;
import Y5.B;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m4.C1586o0;
import m4.K;
import m4.L;
import m5.C1617n;
import m5.I;
import m5.InterfaceC1601E;
import m5.InterfaceC1603G;
import m5.J;
import m5.M;
import m5.S;
import m5.z;
import n5.D;

/* loaded from: classes.dex */
public final class c implements InterfaceC1601E {

    /* renamed from: C, reason: collision with root package name */
    public static final Y f10044C = new Y(8);

    /* renamed from: A, reason: collision with root package name */
    public boolean f10045A;

    /* renamed from: a, reason: collision with root package name */
    public final R7.a f10047a;

    /* renamed from: b, reason: collision with root package name */
    public final p f10048b;

    /* renamed from: c, reason: collision with root package name */
    public final B f10049c;

    /* renamed from: f, reason: collision with root package name */
    public s f10052f;

    /* renamed from: u, reason: collision with root package name */
    public J f10053u;

    /* renamed from: v, reason: collision with root package name */
    public Handler f10054v;

    /* renamed from: w, reason: collision with root package name */
    public U4.m f10055w;

    /* renamed from: x, reason: collision with root package name */
    public l f10056x;

    /* renamed from: y, reason: collision with root package name */
    public Uri f10057y;

    /* renamed from: z, reason: collision with root package name */
    public i f10058z;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f10051e = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f10050d = new HashMap();

    /* renamed from: B, reason: collision with root package name */
    public long f10046B = -9223372036854775807L;

    public c(R7.a aVar, B b2, p pVar) {
        this.f10047a = aVar;
        this.f10048b = pVar;
        this.f10049c = b2;
    }

    public final i a(boolean z8, Uri uri) {
        HashMap hashMap = this.f10050d;
        i iVar = ((b) hashMap.get(uri)).f10036d;
        if (iVar != null && z8 && !uri.equals(this.f10057y)) {
            List list = this.f10056x.f10109e;
            int i7 = 0;
            while (true) {
                if (i7 >= list.size()) {
                    break;
                }
                if (uri.equals(((k) list.get(i7)).f10101a)) {
                    i iVar2 = this.f10058z;
                    if (iVar2 == null || !iVar2.f10090o) {
                        this.f10057y = uri;
                        b bVar = (b) hashMap.get(uri);
                        i iVar3 = bVar.f10036d;
                        if (iVar3 == null || !iVar3.f10090o) {
                            bVar.c(b(uri));
                        } else {
                            this.f10058z = iVar3;
                            this.f10055w.w(iVar3);
                        }
                    }
                } else {
                    i7++;
                }
            }
        }
        return iVar;
    }

    public final Uri b(Uri uri) {
        e eVar;
        i iVar = this.f10058z;
        if (iVar == null || !iVar.f10097v.f10081e || (eVar = (e) iVar.f10095t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f10062b));
        int i7 = eVar.f10063c;
        if (i7 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
        }
        return buildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i7;
        b bVar = (b) this.f10050d.get(uri);
        if (bVar.f10036d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, D.Z(bVar.f10036d.f10096u));
        i iVar = bVar.f10036d;
        return iVar.f10090o || (i7 = iVar.f10082d) == 2 || i7 == 1 || bVar.f10037e + max > elapsedRealtime;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    @Override // m5.InterfaceC1601E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D4.e e(InterfaceC1603G interfaceC1603G, long j, long j10, IOException iOException, int i7) {
        long j11;
        M m10 = (M) interfaceC1603G;
        long j12 = m10.f20555a;
        S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        this.f10049c.getClass();
        if (!(iOException instanceof C1586o0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof z) && !(iOException instanceof I)) {
            int i10 = C1617n.f20620b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof C1617n) || ((C1617n) th).f20621a != 2008) {
                }
            }
            j11 = Math.min((i7 - 1) * 1000, 5000);
            boolean z8 = j11 == -9223372036854775807L;
            this.f10052f.w(rVar, m10.f20557c, iOException, z8);
            return !z8 ? J.f20551f : new D4.e(0, j11, false);
        }
        j11 = -9223372036854775807L;
        if (j11 == -9223372036854775807L) {
        }
        this.f10052f.w(rVar, m10.f20557c, iOException, z8);
        if (!z8) {
        }
    }

    @Override // m5.InterfaceC1601E
    public final void m(InterfaceC1603G interfaceC1603G, long j, long j10, boolean z8) {
        M m10 = (M) interfaceC1603G;
        long j11 = m10.f20555a;
        S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        this.f10049c.getClass();
        this.f10052f.q(rVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // m5.InterfaceC1601E
    public final void t(InterfaceC1603G interfaceC1603G, long j, long j10) {
        l lVar;
        M m10 = (M) interfaceC1603G;
        m mVar = (m) m10.f20560f;
        boolean z8 = mVar instanceof i;
        if (z8) {
            String str = mVar.f10115a;
            l lVar2 = l.f10107n;
            Uri parse = Uri.parse(str);
            K k = new K();
            k.f19976a = "0";
            k.j = "application/x-mpegURL";
            lVar = new l("", Collections.emptyList(), Collections.singletonList(new k(parse, new L(k), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            lVar = (l) mVar;
        }
        this.f10056x = lVar;
        this.f10057y = ((k) lVar.f10109e.get(0)).f10101a;
        this.f10051e.add(new a(this));
        List list = lVar.f10108d;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Uri uri = (Uri) list.get(i7);
            this.f10050d.put(uri, new b(this, uri));
        }
        S s3 = m10.f20558d;
        Uri uri2 = s3.f20581c;
        r rVar = new r(s3.f20582d);
        b bVar = (b) this.f10050d.get(this.f10057y);
        if (z8) {
            bVar.d((i) mVar);
        } else {
            bVar.c(bVar.f10033a);
        }
        this.f10049c.getClass();
        this.f10052f.s(rVar, 4);
    }
}
