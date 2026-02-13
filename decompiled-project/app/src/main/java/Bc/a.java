package Bc;

import A0.G0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2303a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2304b;

    public a(int i7) {
        this.f2303a = i7;
        switch (i7) {
            case 1:
                XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
                this.f2304b = newInstance;
                newInstance.setNamespaceAware(true);
                return;
            default:
                DocumentBuilderFactory newInstance2 = DocumentBuilderFactory.newInstance();
                this.f2304b = newInstance2;
                newInstance2.setNamespaceAware(true);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.LinkedList, Bc.p] */
    /* JADX WARN: Type inference failed for: r4v5, types: [Bc.i, Bc.u, java.lang.Object] */
    @Override // Bc.q
    public final i a(InputStream inputStream) {
        switch (this.f2303a) {
            case 0:
                Document parse = ((DocumentBuilderFactory) this.f2304b).newDocumentBuilder().parse(new InputSource(inputStream));
                G0 g02 = new G0(4, (char) 0);
                ?? linkedList = new LinkedList();
                Element documentElement = parse.getDocumentElement();
                if (documentElement != null) {
                    linkedList.offer(documentElement);
                    linkedList.b(documentElement);
                }
                g02.f27b = linkedList;
                ArrayList arrayList = new ArrayList(6);
                g02.f28c = arrayList;
                arrayList.add(parse);
                return g02;
            default:
                XmlPullParser newPullParser = ((XmlPullParserFactory) this.f2304b).newPullParser();
                if (inputStream != null) {
                    newPullParser.setInput(inputStream, null);
                }
                ?? obj = new Object();
                obj.f2321a = newPullParser;
                return obj;
        }
    }
}
