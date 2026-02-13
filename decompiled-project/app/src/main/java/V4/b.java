package V4;

import A4.s;
import N6.H;
import P4.r;
import Y5.B;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m4.C1586o0;
import m5.C1599C;
import m5.InterfaceC1601E;
import m5.InterfaceC1603G;
import m5.InterfaceC1615l;
import m5.InterfaceC1616m;
import m5.J;
import m5.M;
import m5.S;
import n5.D;

/* loaded from: classes.dex */
public final class b implements InterfaceC1601E {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f10033a;

    /* renamed from: b, reason: collision with root package name */
    public final J f10034b = new J("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1616m f10035c;

    /* renamed from: d, reason: collision with root package name */
    public i f10036d;

    /* renamed from: e, reason: collision with root package name */
    public long f10037e;

    /* renamed from: f, reason: collision with root package name */
    public long f10038f;

    /* renamed from: u, reason: collision with root package name */
    public long f10039u;

    /* renamed from: v, reason: collision with root package name */
    public long f10040v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10041w;

    /* renamed from: x, reason: collision with root package name */
    public IOException f10042x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f10043y;

    public b(c cVar, Uri uri) {
        this.f10043y = cVar;
        this.f10033a = uri;
        this.f10035c = ((InterfaceC1615l) cVar.f10047a.f8927b).e();
    }

    public static boolean a(b bVar, long j) {
        bVar.f10040v = SystemClock.elapsedRealtime() + j;
        c cVar = bVar.f10043y;
        if (!bVar.f10033a.equals(cVar.f10057y)) {
            return false;
        }
        List list = cVar.f10056x.f10109e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar2 = (b) cVar.f10050d.get(((k) list.get(i7)).f10101a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f10040v) {
                Uri uri = bVar2.f10033a;
                cVar.f10057y = uri;
                bVar2.c(cVar.b(uri));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        c cVar = this.f10043y;
        M m10 = new M(this.f10035c, uri, 4, cVar.f10048b.s(cVar.f10056x, this.f10036d));
        B b2 = cVar.f10049c;
        int i7 = m10.f20557c;
        this.f10034b.f(m10, this, b2.d(i7));
        cVar.f10052f.z(new r(m10.f20556b), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.f10040v = 0L;
        if (this.f10041w) {
            return;
        }
        J j = this.f10034b;
        if (j.d() || j.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f10039u;
        if (elapsedRealtime >= j10) {
            b(uri);
        } else {
            this.f10041w = true;
            this.f10043y.f10054v.postDelayed(new Aa.j(7, this, uri), j10 - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(i iVar) {
        long j;
        long j10;
        long j11;
        boolean z8;
        int i7;
        boolean z10;
        int i10;
        i iVar2;
        IOException iOException;
        i iVar3;
        long j12;
        i iVar4;
        int size;
        int size2;
        int size3;
        i iVar5 = this.f10036d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f10037e = elapsedRealtime;
        c cVar = this.f10043y;
        cVar.getClass();
        if (iVar5 != null) {
            long j13 = iVar.k;
            long j14 = iVar5.k;
            if (j13 <= j14) {
                boolean z11 = iVar5.f10090o;
                H h10 = iVar5.f10094s;
                H h11 = iVar5.f10093r;
                boolean z12 = iVar.f10090o;
                if (j13 < j14 || ((size = iVar.f10093r.size() - h11.size()) == 0 ? !((size2 = iVar.f10094s.size()) > (size3 = h10.size()) || (size2 == size3 && z12 && !z11)) : size <= 0)) {
                    iVar2 = (!z12 || z11) ? iVar5 : new i(iVar5.f10082d, iVar5.f10115a, iVar5.f10116b, iVar5.f10083e, iVar5.g, iVar5.f10085h, iVar5.f10086i, iVar5.j, iVar5.k, iVar5.f10087l, iVar5.f10088m, iVar5.f10089n, iVar5.f10117c, true, iVar5.f10091p, iVar5.f10092q, h11, h10, iVar5.f10097v, iVar5.f10095t);
                    z10 = false;
                    this.f10036d = iVar2;
                    CopyOnWriteArrayList copyOnWriteArrayList = cVar.f10051e;
                    Uri uri = this.f10033a;
                    boolean z13 = iVar2.f10090o;
                    if (iVar2 == iVar5) {
                        this.f10042x = null;
                        this.f10038f = elapsedRealtime;
                        if (uri.equals(cVar.f10057y)) {
                            if (cVar.f10058z == null) {
                                cVar.f10045A = !z13;
                                cVar.f10046B = iVar2.f10085h;
                            }
                            cVar.f10058z = iVar2;
                            cVar.f10055w.w(iVar2);
                        }
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            ((q) it.next()).a();
                        }
                    } else if (!z13) {
                        long size4 = iVar.k + iVar.f10093r.size();
                        i iVar6 = this.f10036d;
                        if (size4 < iVar6.k) {
                            iOException = new IOException();
                            z10 = true;
                        } else {
                            iOException = ((double) (elapsedRealtime - this.f10038f)) > ((double) D.Z(iVar6.f10088m)) * 3.5d ? new IOException() : null;
                        }
                        if (iOException != null) {
                            this.f10042x = iOException;
                            A7.a aVar = new A7.a(iOException, 1);
                            Iterator it2 = copyOnWriteArrayList.iterator();
                            while (it2.hasNext()) {
                                ((q) it2.next()).b(uri, aVar, z10);
                            }
                        }
                    }
                    iVar3 = this.f10036d;
                    if (iVar3.f10097v.f10081e) {
                        j12 = iVar3.f10088m;
                        if (iVar3 == iVar5) {
                            j12 /= 2;
                        }
                    } else {
                        j12 = 0;
                    }
                    this.f10039u = D.Z(j12) + elapsedRealtime;
                    if (this.f10036d.f10089n == -9223372036854775807L || uri.equals(cVar.f10057y)) {
                        iVar4 = this.f10036d;
                        if (iVar4.f10090o) {
                            h hVar = iVar4.f10097v;
                            if (hVar.f10077a != -9223372036854775807L || hVar.f10081e) {
                                Uri.Builder buildUpon = uri.buildUpon();
                                i iVar7 = this.f10036d;
                                if (iVar7.f10097v.f10081e) {
                                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar7.k + iVar7.f10093r.size()));
                                    i iVar8 = this.f10036d;
                                    if (iVar8.f10089n != -9223372036854775807L) {
                                        H h12 = iVar8.f10094s;
                                        int size5 = h12.size();
                                        if (!h12.isEmpty() && ((d) N6.r.l(h12)).f10059A) {
                                            size5--;
                                        }
                                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size5));
                                    }
                                }
                                h hVar2 = this.f10036d.f10097v;
                                if (hVar2.f10077a != -9223372036854775807L) {
                                    buildUpon.appendQueryParameter("_HLS_skip", hVar2.f10078b ? "v2" : "YES");
                                }
                                uri = buildUpon.build();
                            }
                            c(uri);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        } else {
            iVar.getClass();
        }
        boolean z14 = iVar.f10091p;
        long j15 = iVar.k;
        if (z14) {
            j = iVar.f10085h;
        } else {
            i iVar9 = cVar.f10058z;
            j = iVar9 != null ? iVar9.f10085h : 0L;
            if (iVar5 != null) {
                H h13 = iVar5.f10093r;
                int size6 = h13.size();
                long j16 = iVar5.k;
                int i11 = (int) (j15 - j16);
                f fVar = i11 < h13.size() ? (f) h13.get(i11) : null;
                long j17 = iVar5.f10085h;
                if (fVar != null) {
                    j11 = fVar.f10070e;
                } else {
                    long j18 = j;
                    if (size6 == j15 - j16) {
                        j11 = iVar5.f10096u;
                    } else {
                        j10 = j18;
                        z8 = iVar.f10086i;
                        H h14 = iVar.f10093r;
                        if (z8) {
                            i iVar10 = cVar.f10058z;
                            i7 = iVar10 != null ? iVar10.j : 0;
                            if (iVar5 != null) {
                                int i12 = (int) (j15 - iVar5.k);
                                H h15 = iVar5.f10093r;
                                f fVar2 = i12 < h15.size() ? (f) h15.get(i12) : null;
                                if (fVar2 != null) {
                                    int i13 = iVar5.j + fVar2.f10069d;
                                    z10 = false;
                                    i7 = i13 - ((f) h14.get(0)).f10069d;
                                } else {
                                    z10 = false;
                                }
                                i10 = i7;
                                iVar2 = new i(iVar.f10082d, iVar.f10115a, iVar.f10116b, iVar.f10083e, iVar.g, j10, true, i10, iVar.k, iVar.f10087l, iVar.f10088m, iVar.f10089n, iVar.f10117c, iVar.f10090o, iVar.f10091p, iVar.f10092q, h14, iVar.f10094s, iVar.f10097v, iVar.f10095t);
                                this.f10036d = iVar2;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = cVar.f10051e;
                                Uri uri2 = this.f10033a;
                                boolean z132 = iVar2.f10090o;
                                if (iVar2 == iVar5) {
                                }
                                iVar3 = this.f10036d;
                                if (iVar3.f10097v.f10081e) {
                                }
                                this.f10039u = D.Z(j12) + elapsedRealtime;
                                if (this.f10036d.f10089n == -9223372036854775807L) {
                                }
                                iVar4 = this.f10036d;
                                if (iVar4.f10090o) {
                                }
                            }
                        } else {
                            i7 = iVar.j;
                        }
                        i10 = i7;
                        z10 = false;
                        iVar2 = new i(iVar.f10082d, iVar.f10115a, iVar.f10116b, iVar.f10083e, iVar.g, j10, true, i10, iVar.k, iVar.f10087l, iVar.f10088m, iVar.f10089n, iVar.f10117c, iVar.f10090o, iVar.f10091p, iVar.f10092q, h14, iVar.f10094s, iVar.f10097v, iVar.f10095t);
                        this.f10036d = iVar2;
                        CopyOnWriteArrayList copyOnWriteArrayList22 = cVar.f10051e;
                        Uri uri22 = this.f10033a;
                        boolean z1322 = iVar2.f10090o;
                        if (iVar2 == iVar5) {
                        }
                        iVar3 = this.f10036d;
                        if (iVar3.f10097v.f10081e) {
                        }
                        this.f10039u = D.Z(j12) + elapsedRealtime;
                        if (this.f10036d.f10089n == -9223372036854775807L) {
                        }
                        iVar4 = this.f10036d;
                        if (iVar4.f10090o) {
                        }
                    }
                }
                j = j11 + j17;
            }
        }
        j10 = j;
        z8 = iVar.f10086i;
        H h142 = iVar.f10093r;
        if (z8) {
        }
        i10 = i7;
        z10 = false;
        iVar2 = new i(iVar.f10082d, iVar.f10115a, iVar.f10116b, iVar.f10083e, iVar.g, j10, true, i10, iVar.k, iVar.f10087l, iVar.f10088m, iVar.f10089n, iVar.f10117c, iVar.f10090o, iVar.f10091p, iVar.f10092q, h142, iVar.f10094s, iVar.f10097v, iVar.f10095t);
        this.f10036d = iVar2;
        CopyOnWriteArrayList copyOnWriteArrayList222 = cVar.f10051e;
        Uri uri222 = this.f10033a;
        boolean z13222 = iVar2.f10090o;
        if (iVar2 == iVar5) {
        }
        iVar3 = this.f10036d;
        if (iVar3.f10097v.f10081e) {
        }
        this.f10039u = D.Z(j12) + elapsedRealtime;
        if (this.f10036d.f10089n == -9223372036854775807L) {
        }
        iVar4 = this.f10036d;
        if (iVar4.f10090o) {
        }
    }

    @Override // m5.InterfaceC1601E
    public final D4.e e(InterfaceC1603G interfaceC1603G, long j, long j10, IOException iOException, int i7) {
        M m10 = (M) interfaceC1603G;
        long j11 = m10.f20555a;
        S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        boolean z8 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z10 = iOException instanceof n;
        D4.e eVar = J.f20550e;
        Uri uri2 = this.f10033a;
        c cVar = this.f10043y;
        int i10 = m10.f20557c;
        if (z8 || z10) {
            int i11 = iOException instanceof C1599C ? ((C1599C) iOException).f20535d : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (z10 || i11 == 400 || i11 == 503) {
                this.f10039u = SystemClock.elapsedRealtime();
                c(uri2);
                s sVar = cVar.f10052f;
                int i12 = D.f21141a;
                sVar.w(rVar, i10, iOException, true);
                return eVar;
            }
        }
        A7.a aVar = new A7.a(iOException, i7);
        Iterator it = cVar.f10051e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((q) it.next()).b(uri2, aVar, false);
        }
        B b2 = cVar.f10049c;
        if (z11) {
            b2.getClass();
            long e2 = B.e(aVar);
            eVar = e2 != -9223372036854775807L ? new D4.e(0, e2, false) : J.f20551f;
        }
        boolean a9 = eVar.a();
        cVar.f10052f.w(rVar, i10, iOException, true ^ a9);
        if (!a9) {
            b2.getClass();
        }
        return eVar;
    }

    @Override // m5.InterfaceC1601E
    public final void m(InterfaceC1603G interfaceC1603G, long j, long j10, boolean z8) {
        M m10 = (M) interfaceC1603G;
        long j11 = m10.f20555a;
        S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        c cVar = this.f10043y;
        cVar.f10049c.getClass();
        cVar.f10052f.q(rVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // m5.InterfaceC1601E
    public final void t(InterfaceC1603G interfaceC1603G, long j, long j10) {
        M m10 = (M) interfaceC1603G;
        m mVar = (m) m10.f20560f;
        S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        if (mVar instanceof i) {
            d((i) mVar);
            this.f10043y.f10052f.s(rVar, 4);
        } else {
            C1586o0 b2 = C1586o0.b("Loaded playlist has unexpected type.", null);
            this.f10042x = b2;
            this.f10043y.f10052f.w(rVar, 4, b2, true);
        }
        this.f10043y.f10049c.getClass();
    }
}
