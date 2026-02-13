package Bc;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class d extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2306a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2307b;

    public d(Node node) {
        this.f2307b = (Element) node;
    }

    public d(XmlPullParser xmlPullParser) {
        xmlPullParser.getNamespace();
        xmlPullParser.getLineNumber();
        xmlPullParser.getPrefix();
        this.f2307b = xmlPullParser.getName();
    }

    @Override // Bc.h
    public final String getName() {
        switch (this.f2306a) {
            case 0:
                return ((Element) this.f2307b).getLocalName();
            default:
                return (String) this.f2307b;
        }
    }
}
