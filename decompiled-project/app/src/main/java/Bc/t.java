package Bc;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class t extends j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2320a;

    public t(XmlPullParser xmlPullParser) {
        this.f2320a = xmlPullParser.getText();
    }

    @Override // Bc.j, Bc.h
    public final String getValue() {
        return this.f2320a;
    }

    @Override // Bc.j, Bc.h
    public final boolean u() {
        return true;
    }
}
