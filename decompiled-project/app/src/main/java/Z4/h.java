package Z4;

import P4.o0;
import java.util.ArrayList;
import java.util.LinkedList;
import m4.C1586o0;
import m4.L;
import n5.D;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: e, reason: collision with root package name */
    public final String f12185e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f12186f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public String f12187h;

    /* renamed from: i, reason: collision with root package name */
    public long f12188i;
    public String j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public int f12189l;

    /* renamed from: m, reason: collision with root package name */
    public int f12190m;

    /* renamed from: n, reason: collision with root package name */
    public int f12191n;

    /* renamed from: o, reason: collision with root package name */
    public int f12192o;

    /* renamed from: p, reason: collision with root package name */
    public String f12193p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f12194q;

    /* renamed from: r, reason: collision with root package name */
    public long f12195r;

    public h(d dVar, String str) {
        super(dVar, str, "StreamIndex");
        this.f12185e = str;
        this.f12186f = new LinkedList();
    }

    @Override // Z4.d
    public final void a(Object obj) {
        if (obj instanceof L) {
            this.f12186f.add((L) obj);
        }
    }

    @Override // Z4.d
    public final Object b() {
        int i7;
        int i10;
        String str;
        LinkedList linkedList = this.f12186f;
        L[] lArr = new L[linkedList.size()];
        linkedList.toArray(lArr);
        String str2 = this.k;
        int i11 = this.g;
        String str3 = this.f12187h;
        long j = this.f12188i;
        String str4 = this.j;
        int i12 = this.f12189l;
        int i13 = this.f12190m;
        int i14 = this.f12191n;
        int i15 = this.f12192o;
        String str5 = this.f12193p;
        ArrayList arrayList = this.f12194q;
        long j10 = this.f12195r;
        int i16 = D.f21141a;
        int size = arrayList.size();
        long[] jArr = new long[size];
        if (j < 1000000 || j % 1000000 != 0) {
            i7 = i14;
            if (j >= 1000000 || 1000000 % j != 0) {
                i10 = i11;
                str = str3;
                double d10 = 1000000 / j;
                int i17 = 0;
                while (i17 < size) {
                    jArr[i17] = (long) (((Long) arrayList.get(i17)).longValue() * d10);
                    i17++;
                    arrayList = arrayList;
                }
                return new b(this.f12185e, str2, i10, str, j, str4, i12, i13, i7, i15, str5, lArr, arrayList, jArr, D.T(j10, 1000000L, j));
            }
            long j11 = 1000000 / j;
            for (int i18 = 0; i18 < size; i18++) {
                jArr[i18] = ((Long) arrayList.get(i18)).longValue() * j11;
            }
        } else {
            long j12 = j / 1000000;
            i7 = i14;
            for (int i19 = 0; i19 < size; i19++) {
                jArr[i19] = ((Long) arrayList.get(i19)).longValue() / j12;
            }
        }
        i10 = i11;
        str = str3;
        return new b(this.f12185e, str2, i10, str, j, str4, i12, i13, i7, i15, str5, lArr, arrayList, jArr, D.T(j10, 1000000L, j));
    }

    @Override // Z4.d
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // Z4.d
    public final void j(XmlPullParser xmlPullParser) {
        int i7 = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new o0("Type", 1);
            }
            if (!"audio".equalsIgnoreCase(attributeValue)) {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    i7 = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw C1586o0.b("Invalid key value[" + attributeValue + "]", null);
                    }
                    i7 = 3;
                }
            }
            this.g = i7;
            l(Integer.valueOf(i7), "Type");
            if (this.g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new o0("Subtype", 1);
                }
                this.f12187h = attributeValue2;
            } else {
                this.f12187h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            l(this.f12187h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.j = attributeValue3;
            l(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new o0("Url", 1);
            }
            this.k = attributeValue4;
            this.f12189l = d.g(xmlPullParser, "MaxWidth");
            this.f12190m = d.g(xmlPullParser, "MaxHeight");
            this.f12191n = d.g(xmlPullParser, "DisplayWidth");
            this.f12192o = d.g(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.f12193p = attributeValue5;
            l(attributeValue5, "Language");
            long g = d.g(xmlPullParser, "TimeScale");
            this.f12188i = g;
            if (g == -1) {
                this.f12188i = ((Long) c("TimeScale")).longValue();
            }
            this.f12194q = new ArrayList();
            return;
        }
        int size = this.f12194q.size();
        long h10 = d.h(xmlPullParser, "t", -9223372036854775807L);
        if (h10 == -9223372036854775807L) {
            if (size == 0) {
                h10 = 0;
            } else {
                if (this.f12195r == -1) {
                    throw C1586o0.b("Unable to infer start time", null);
                }
                h10 = this.f12195r + ((Long) this.f12194q.get(size - 1)).longValue();
            }
        }
        this.f12194q.add(Long.valueOf(h10));
        this.f12195r = d.h(xmlPullParser, "d", -9223372036854775807L);
        long h11 = d.h(xmlPullParser, "r", 1L);
        if (h11 > 1 && this.f12195r == -9223372036854775807L) {
            throw C1586o0.b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j = i7;
            if (j >= h11) {
                return;
            }
            this.f12194q.add(Long.valueOf((this.f12195r * j) + h10));
            i7++;
        }
    }
}
