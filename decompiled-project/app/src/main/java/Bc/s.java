package Bc;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class s extends f {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f2315a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2316b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2317c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2318d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2319e;

    public s(XmlPullParser xmlPullParser, int i7) {
        this.f2316b = xmlPullParser.getAttributeNamespace(i7);
        this.f2317c = xmlPullParser.getAttributePrefix(i7);
        this.f2319e = xmlPullParser.getAttributeValue(i7);
        this.f2318d = xmlPullParser.getAttributeName(i7);
        this.f2315a = xmlPullParser;
    }

    @Override // Bc.f
    public final String a() {
        return this.f2318d;
    }

    @Override // Bc.f
    public final String b() {
        return this.f2317c;
    }

    @Override // Bc.f
    public final String c() {
        return this.f2316b;
    }

    @Override // Bc.f
    public final Object d() {
        return this.f2315a;
    }

    @Override // Bc.f
    public final String e() {
        return this.f2319e;
    }

    @Override // Bc.f
    public final boolean f() {
        return false;
    }
}
