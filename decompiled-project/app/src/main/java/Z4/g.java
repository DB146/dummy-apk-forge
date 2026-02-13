package Z4;

import P4.o0;
import java.util.LinkedList;
import m4.C1586o0;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import org.xmlpull.v1.XmlPullParser;
import r4.C1935g;
import r4.C1936h;

/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f12179e;

    /* renamed from: f, reason: collision with root package name */
    public int f12180f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public long f12181h;

    /* renamed from: i, reason: collision with root package name */
    public long f12182i;
    public long j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12183l;

    /* renamed from: m, reason: collision with root package name */
    public a f12184m;

    public g(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.k = -1;
        this.f12184m = null;
        this.f12179e = new LinkedList();
    }

    @Override // Z4.d
    public final void a(Object obj) {
        if (obj instanceof b) {
            this.f12179e.add((b) obj);
        } else if (obj instanceof a) {
            AbstractC1705a.m(this.f12184m == null);
            this.f12184m = (a) obj;
        }
    }

    @Override // Z4.d
    public final Object b() {
        boolean z8;
        a aVar;
        long T10;
        LinkedList linkedList = this.f12179e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        a aVar2 = this.f12184m;
        if (aVar2 != null) {
            C1936h c1936h = new C1936h(new C1935g(aVar2.f12149a, null, "video/mp4", aVar2.f12150b));
            for (int i7 = 0; i7 < size; i7++) {
                b bVar = bVarArr[i7];
                int i10 = bVar.f12152a;
                if (i10 == 2 || i10 == 1) {
                    int i11 = 0;
                    while (true) {
                        L[] lArr = bVar.j;
                        if (i11 < lArr.length) {
                            K a9 = lArr[i11].a();
                            a9.f19986n = c1936h;
                            lArr[i11] = new L(a9);
                            i11++;
                        }
                    }
                }
            }
        }
        int i12 = this.f12180f;
        int i13 = this.g;
        long j = this.f12181h;
        long j10 = this.f12182i;
        long j11 = this.j;
        int i14 = this.k;
        boolean z10 = this.f12183l;
        a aVar3 = this.f12184m;
        if (j10 == 0) {
            z8 = z10;
            aVar = aVar3;
            T10 = -9223372036854775807L;
        } else {
            z8 = z10;
            aVar = aVar3;
            T10 = D.T(j10, 1000000L, j);
        }
        return new c(i12, i13, T10, j11 == 0 ? -9223372036854775807L : D.T(j11, 1000000L, j), i14, z8, aVar, bVarArr);
    }

    @Override // Z4.d
    public final void j(XmlPullParser xmlPullParser) {
        this.f12180f = d.i(xmlPullParser, "MajorVersion");
        this.g = d.i(xmlPullParser, "MinorVersion");
        this.f12181h = d.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new o0("Duration", 1);
        }
        try {
            this.f12182i = Long.parseLong(attributeValue);
            this.j = d.h(xmlPullParser, "DVRWindowLength", 0L);
            this.k = d.g(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.f12183l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            l(Long.valueOf(this.f12181h), "TimeScale");
        } catch (NumberFormatException e2) {
            throw C1586o0.b(null, e2);
        }
    }
}
