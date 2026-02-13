package Bc;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class u implements i {

    /* renamed from: a, reason: collision with root package name */
    public XmlPullParser f2321a;

    /* renamed from: b, reason: collision with root package name */
    public h f2322b;

    public final h a() {
        XmlPullParser xmlPullParser = this.f2321a;
        int next = xmlPullParser.next();
        if (next == 1) {
            return null;
        }
        if (next != 2) {
            return next == 4 ? new t(xmlPullParser) : next == 3 ? new r(0) : a();
        }
        d dVar = new d(xmlPullParser);
        if (dVar.isEmpty()) {
            int attributeCount = xmlPullParser.getAttributeCount();
            for (int i7 = 0; i7 < attributeCount; i7++) {
                dVar.add(new s(xmlPullParser, i7));
            }
        }
        return dVar;
    }

    @Override // Bc.i
    public final h next() {
        h hVar = this.f2322b;
        if (hVar == null) {
            return a();
        }
        this.f2322b = null;
        return hVar;
    }

    @Override // Bc.i
    public final h peek() {
        if (this.f2322b == null) {
            this.f2322b = next();
        }
        return this.f2322b;
    }
}
