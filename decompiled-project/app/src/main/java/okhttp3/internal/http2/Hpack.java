package okhttp3.internal.http2;

import Eb.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Huffman;
import rc.AbstractC1958b;
import rc.C;
import rc.C1964h;
import rc.C1967k;

/* loaded from: classes2.dex */
public final class Hpack {

    /* renamed from: a, reason: collision with root package name */
    public static final Hpack f22739a = new Hpack();

    /* renamed from: b, reason: collision with root package name */
    public static final Header[] f22740b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f22741c;

    /* loaded from: classes2.dex */
    public static final class Reader {

        /* renamed from: c, reason: collision with root package name */
        public final C f22744c;

        /* renamed from: f, reason: collision with root package name */
        public int f22747f;
        public int g;

        /* renamed from: a, reason: collision with root package name */
        public int f22742a = 4096;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f22743b = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public Header[] f22745d = new Header[8];

        /* renamed from: e, reason: collision with root package name */
        public int f22746e = 7;

        public Reader(Http2Reader.ContinuationSource continuationSource) {
            this.f22744c = AbstractC1958b.c(continuationSource);
        }

        public final int a(int i7) {
            int i10;
            int i11 = 0;
            if (i7 > 0) {
                int length = this.f22745d.length;
                while (true) {
                    length--;
                    i10 = this.f22746e;
                    if (length < i10 || i7 <= 0) {
                        break;
                    }
                    Header header = this.f22745d[length];
                    l.b(header);
                    int i12 = header.f22738c;
                    i7 -= i12;
                    this.g -= i12;
                    this.f22747f--;
                    i11++;
                }
                Header[] headerArr = this.f22745d;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.f22747f);
                this.f22746e += i11;
            }
            return i11;
        }

        public final C1967k b(int i7) {
            if (i7 >= 0) {
                Hpack hpack = Hpack.f22739a;
                hpack.getClass();
                Header[] headerArr = Hpack.f22740b;
                if (i7 <= headerArr.length - 1) {
                    hpack.getClass();
                    return headerArr[i7].f22736a;
                }
            }
            Hpack.f22739a.getClass();
            int length = this.f22746e + 1 + (i7 - Hpack.f22740b.length);
            if (length >= 0) {
                Header[] headerArr2 = this.f22745d;
                if (length < headerArr2.length) {
                    Header header = headerArr2[length];
                    l.b(header);
                    return header.f22736a;
                }
            }
            throw new IOException("Header index too large " + (i7 + 1));
        }

        public final void c(Header header) {
            this.f22743b.add(header);
            int i7 = this.f22742a;
            int i10 = header.f22738c;
            if (i10 > i7) {
                n.U(r7, null, 0, this.f22745d.length);
                this.f22746e = this.f22745d.length - 1;
                this.f22747f = 0;
                this.g = 0;
                return;
            }
            a((this.g + i10) - i7);
            int i11 = this.f22747f + 1;
            Header[] headerArr = this.f22745d;
            if (i11 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f22746e = this.f22745d.length - 1;
                this.f22745d = headerArr2;
            }
            int i12 = this.f22746e;
            this.f22746e = i12 - 1;
            this.f22745d[i12] = header;
            this.f22747f++;
            this.g += i10;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, rc.h] */
        public final C1967k d() {
            int i7;
            C source = this.f22744c;
            byte F10 = source.F();
            byte[] bArr = _UtilCommonKt.f22495a;
            int i10 = F10 & 255;
            int i11 = 0;
            boolean z8 = (F10 & 128) == 128;
            long e2 = e(i10, 127);
            if (!z8) {
                return source.K(e2);
            }
            ?? obj = new Object();
            Huffman.f22848a.getClass();
            l.e(source, "source");
            Huffman.Node node = Huffman.f22851d;
            Huffman.Node node2 = node;
            int i12 = 0;
            for (long j = 0; j < e2; j++) {
                byte F11 = source.F();
                byte[] bArr2 = _UtilCommonKt.f22495a;
                i11 = (i11 << 8) | (F11 & 255);
                i12 += 8;
                while (i12 >= 8) {
                    Huffman.Node[] nodeArr = node2.f22852a;
                    l.b(nodeArr);
                    node2 = nodeArr[(i11 >>> (i12 - 8)) & 255];
                    l.b(node2);
                    if (node2.f22852a == null) {
                        obj.l0(node2.f22853b);
                        i12 -= node2.f22854c;
                        node2 = node;
                    } else {
                        i12 -= 8;
                    }
                }
            }
            while (i12 > 0) {
                Huffman.Node[] nodeArr2 = node2.f22852a;
                l.b(nodeArr2);
                Huffman.Node node3 = nodeArr2[(i11 << (8 - i12)) & 255];
                l.b(node3);
                if (node3.f22852a != null || (i7 = node3.f22854c) > i12) {
                    break;
                }
                obj.l0(node3.f22853b);
                i12 -= i7;
                node2 = node;
            }
            return obj.X(obj.f23966b);
        }

        public final int e(int i7, int i10) {
            int i11 = i7 & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                byte F10 = this.f22744c.F();
                byte[] bArr = _UtilCommonKt.f22495a;
                int i13 = F10 & 255;
                if ((F10 & 128) == 0) {
                    return i10 + (i13 << i12);
                }
                i10 += (F10 & Byte.MAX_VALUE) << i12;
                i12 += 7;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Writer {

        /* renamed from: a, reason: collision with root package name */
        public final C1964h f22748a;

        /* renamed from: c, reason: collision with root package name */
        public boolean f22750c;
        public int g;

        /* renamed from: h, reason: collision with root package name */
        public int f22754h;

        /* renamed from: b, reason: collision with root package name */
        public int f22749b = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

        /* renamed from: d, reason: collision with root package name */
        public int f22751d = 4096;

        /* renamed from: e, reason: collision with root package name */
        public Header[] f22752e = new Header[8];

        /* renamed from: f, reason: collision with root package name */
        public int f22753f = 7;

        public Writer(C1964h c1964h) {
            this.f22748a = c1964h;
        }

        public final void a(int i7) {
            int i10;
            if (i7 > 0) {
                int length = this.f22752e.length - 1;
                int i11 = 0;
                while (true) {
                    i10 = this.f22753f;
                    if (length < i10 || i7 <= 0) {
                        break;
                    }
                    Header header = this.f22752e[length];
                    l.b(header);
                    i7 -= header.f22738c;
                    int i12 = this.f22754h;
                    Header header2 = this.f22752e[length];
                    l.b(header2);
                    this.f22754h = i12 - header2.f22738c;
                    this.g--;
                    i11++;
                    length--;
                }
                Header[] headerArr = this.f22752e;
                int i13 = i10 + 1;
                System.arraycopy(headerArr, i13, headerArr, i13 + i11, this.g);
                Header[] headerArr2 = this.f22752e;
                int i14 = this.f22753f + 1;
                Arrays.fill(headerArr2, i14, i14 + i11, (Object) null);
                this.f22753f += i11;
            }
        }

        public final void b(Header header) {
            int i7 = this.f22751d;
            int i10 = header.f22738c;
            if (i10 > i7) {
                Header[] headerArr = this.f22752e;
                n.U(headerArr, null, 0, headerArr.length);
                this.f22753f = this.f22752e.length - 1;
                this.g = 0;
                this.f22754h = 0;
                return;
            }
            a((this.f22754h + i10) - i7);
            int i11 = this.g + 1;
            Header[] headerArr2 = this.f22752e;
            if (i11 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f22753f = this.f22752e.length - 1;
                this.f22752e = headerArr3;
            }
            int i12 = this.f22753f;
            this.f22753f = i12 - 1;
            this.f22752e[i12] = header;
            this.g++;
            this.f22754h += i10;
        }

        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, rc.h] */
        public final void c(C1967k data) {
            l.e(data, "data");
            C1964h c1964h = this.f22748a;
            Huffman.f22848a.getClass();
            int f4 = data.f();
            long j = 0;
            for (int i7 = 0; i7 < f4; i7++) {
                byte r10 = data.r(i7);
                byte[] bArr = _UtilCommonKt.f22495a;
                j += Huffman.f22850c[r10 & 255];
            }
            if (((int) ((j + 7) >> 3)) >= data.f()) {
                e(data.f(), 127, 0);
                c1964h.i0(data);
                return;
            }
            ?? obj = new Object();
            Huffman.f22848a.getClass();
            int f10 = data.f();
            long j10 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < f10; i11++) {
                byte r11 = data.r(i11);
                byte[] bArr2 = _UtilCommonKt.f22495a;
                int i12 = r11 & 255;
                int i13 = Huffman.f22849b[i12];
                byte b2 = Huffman.f22850c[i12];
                j10 = (j10 << b2) | i13;
                i10 += b2;
                while (i10 >= 8) {
                    i10 -= 8;
                    obj.l0((int) (j10 >> i10));
                }
            }
            if (i10 > 0) {
                obj.l0((int) ((255 >>> i10) | (j10 << (8 - i10))));
            }
            C1967k X10 = obj.X(obj.f23966b);
            e(X10.f(), 127, 128);
            c1964h.i0(X10);
        }

        public final void d(ArrayList arrayList) {
            int i7;
            int i10;
            if (this.f22750c) {
                int i11 = this.f22749b;
                if (i11 < this.f22751d) {
                    e(i11, 31, 32);
                }
                this.f22750c = false;
                this.f22749b = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                e(this.f22751d, 31, 32);
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                Header header = (Header) arrayList.get(i12);
                C1967k D10 = header.f22736a.D();
                Hpack.f22739a.getClass();
                Integer num = (Integer) Hpack.f22741c.get(D10);
                C1967k c1967k = header.f22737b;
                if (num != null) {
                    int intValue = num.intValue();
                    i10 = intValue + 1;
                    if (2 <= i10 && i10 < 8) {
                        Header[] headerArr = Hpack.f22740b;
                        if (l.a(headerArr[intValue].f22737b, c1967k)) {
                            i7 = i10;
                        } else if (l.a(headerArr[i10].f22737b, c1967k)) {
                            i10 = intValue + 2;
                            i7 = i10;
                        }
                    }
                    i7 = i10;
                    i10 = -1;
                } else {
                    i7 = -1;
                    i10 = -1;
                }
                if (i10 == -1) {
                    int i13 = this.f22753f + 1;
                    int length = this.f22752e.length;
                    while (true) {
                        if (i13 >= length) {
                            break;
                        }
                        Header header2 = this.f22752e[i13];
                        l.b(header2);
                        if (l.a(header2.f22736a, D10)) {
                            Header header3 = this.f22752e[i13];
                            l.b(header3);
                            if (l.a(header3.f22737b, c1967k)) {
                                int i14 = i13 - this.f22753f;
                                Hpack.f22739a.getClass();
                                i10 = Hpack.f22740b.length + i14;
                                break;
                            } else if (i7 == -1) {
                                int i15 = i13 - this.f22753f;
                                Hpack.f22739a.getClass();
                                i7 = i15 + Hpack.f22740b.length;
                            }
                        }
                        i13++;
                    }
                }
                if (i10 != -1) {
                    e(i10, 127, 128);
                } else if (i7 == -1) {
                    this.f22748a.l0(64);
                    c(D10);
                    c(c1967k);
                    b(header);
                } else {
                    C1967k prefix = Header.f22731d;
                    D10.getClass();
                    l.e(prefix, "prefix");
                    if (!D10.v(0, prefix, prefix.f()) || l.a(Header.f22735i, D10)) {
                        e(i7, 63, 64);
                        c(c1967k);
                        b(header);
                    } else {
                        e(i7, 15, 0);
                        c(c1967k);
                    }
                }
            }
        }

        public final void e(int i7, int i10, int i11) {
            C1964h c1964h = this.f22748a;
            if (i7 < i10) {
                c1964h.l0(i7 | i11);
                return;
            }
            c1964h.l0(i11 | i10);
            int i12 = i7 - i10;
            while (i12 >= 128) {
                c1964h.l0(128 | (i12 & 127));
                i12 >>>= 7;
            }
            c1964h.l0(i12);
        }
    }

    static {
        Header header = new Header(Header.f22735i, "");
        C1967k c1967k = Header.f22733f;
        Header header2 = new Header(c1967k, "GET");
        Header header3 = new Header(c1967k, "POST");
        C1967k c1967k2 = Header.g;
        Header header4 = new Header(c1967k2, "/");
        Header header5 = new Header(c1967k2, "/index.html");
        C1967k c1967k3 = Header.f22734h;
        Header header6 = new Header(c1967k3, "http");
        Header header7 = new Header(c1967k3, "https");
        C1967k c1967k4 = Header.f22732e;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(c1967k4, "200"), new Header(c1967k4, "204"), new Header(c1967k4, "206"), new Header(c1967k4, "304"), new Header(c1967k4, "400"), new Header(c1967k4, "404"), new Header(c1967k4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f22740b = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length, 1.0f);
        int length = headerArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (!linkedHashMap.containsKey(headerArr[i7].f22736a)) {
                linkedHashMap.put(headerArr[i7].f22736a, Integer.valueOf(i7));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l.d(unmodifiableMap, "unmodifiableMap(...)");
        f22741c = unmodifiableMap;
    }

    private Hpack() {
    }

    public static void a(C1967k name) {
        l.e(name, "name");
        int f4 = name.f();
        for (int i7 = 0; i7 < f4; i7++) {
            byte r10 = name.r(i7);
            if (65 <= r10 && r10 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.E()));
            }
        }
    }
}
