package W4;

import N6.C0446t;
import N6.C0448v;
import g3.C1191j;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import y7.u0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final N6.I f10746a;

    static {
        new R7.a(10).k();
    }

    public o(R7.a aVar) {
        N6.I i7;
        Collection entrySet = ((C0448v) ((C1191j) aVar.f8927b).f17441b).entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            i7 = N6.A.f7208e;
        } else {
            C0446t c0446t = (C0446t) entrySet;
            A4.s sVar = new A4.s(c0446t.f7340b.size());
            Iterator it = c0446t.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                N6.H F10 = N6.H.F((Collection) entry.getValue());
                if (!F10.isEmpty()) {
                    sVar.B(key, F10);
                    i10 = F10.size() + i10;
                }
            }
            i7 = new N6.I(sVar.g(), i10);
        }
        this.f10746a = i7;
    }

    public static String b(String str) {
        return u0.o(str, "Accept") ? "Accept" : u0.o(str, "Allow") ? "Allow" : u0.o(str, "Authorization") ? "Authorization" : u0.o(str, "Bandwidth") ? "Bandwidth" : u0.o(str, "Blocksize") ? "Blocksize" : u0.o(str, "Cache-Control") ? "Cache-Control" : u0.o(str, "Connection") ? "Connection" : u0.o(str, "Content-Base") ? "Content-Base" : u0.o(str, "Content-Encoding") ? "Content-Encoding" : u0.o(str, "Content-Language") ? "Content-Language" : u0.o(str, "Content-Length") ? "Content-Length" : u0.o(str, "Content-Location") ? "Content-Location" : u0.o(str, "Content-Type") ? "Content-Type" : u0.o(str, "CSeq") ? "CSeq" : u0.o(str, "Date") ? "Date" : u0.o(str, "Expires") ? "Expires" : u0.o(str, "Location") ? "Location" : u0.o(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : u0.o(str, "Proxy-Require") ? "Proxy-Require" : u0.o(str, "Public") ? "Public" : u0.o(str, "Range") ? "Range" : u0.o(str, "RTP-Info") ? "RTP-Info" : u0.o(str, "RTCP-Interval") ? "RTCP-Interval" : u0.o(str, "Scale") ? "Scale" : u0.o(str, "Session") ? "Session" : u0.o(str, "Speed") ? "Speed" : u0.o(str, "Supported") ? "Supported" : u0.o(str, "Timestamp") ? "Timestamp" : u0.o(str, "Transport") ? "Transport" : u0.o(str, "User-Agent") ? "User-Agent" : u0.o(str, "Via") ? "Via" : u0.o(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public final N6.I a() {
        return this.f10746a;
    }

    public final String c(String str) {
        N6.H d10 = this.f10746a.d(b(str));
        if (d10.isEmpty()) {
            return null;
        }
        return (String) N6.r.l(d10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return this.f10746a.equals(((o) obj).f10746a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10746a.hashCode();
    }
}
